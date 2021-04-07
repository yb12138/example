package com.heeexy.example.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.dao.*;
import com.heeexy.example.model.*;
import com.heeexy.example.service.DataService;
import com.heeexy.example.service.ProductService;
import com.heeexy.example.service.ProductStorageService;
import com.heeexy.example.util.GoodConnectUrl;
import com.heeexy.example.util.http.QueClient;
import com.heeexy.example.winit.http.HttpClient;
import com.heeexy.example.winit.model.RequestMsg;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class DataServiceImpl implements DataService {
    private WinitClient client = new WinitClient();
    private QueClient queclient = new QueClient();
    @Autowired
    WinitOutOrderMapper winitOutOrderMapper;
    @Autowired
    WinitOutOrderDetailMapper winitOutOrderDetailMapper;
    @Autowired
    ProductService productService;
    @Autowired
    WinitRebateMoneyMapper winitRebateMoneyMapper;
    @Autowired
    WinitWarehouseStorageMapper winitWarehouseStorageMapper;
    @Autowired
    GoodcangWarehouseStorageMapper goodcangWarehouseStorageMapper;
    @Autowired
    ProductCountryMapper countryMapper;
    @Autowired
    SysUserMapper sysUserMapper;
    @Autowired
    GcOutOrderMapper gcOutOrderMapper;
    @Autowired
    GcOutOrderDetailMapper gcOutOrderDetailMapper;
    @Autowired
    ProductWarehouseStorageMapper productWarehouseStorageMapper;
    @Autowired
    ProductMapper productMapper;
    @Autowired
    TodolistMapper todolistMapper;
    @Autowired
    FbaWarehouseStorageMapper fbaWarehouseStorageMapper;
    @Autowired
    ProductStorageService productStorageService;
    @Autowired
    DatacaciquesPackageMapper datacaciquesPackageMapper;
    @Autowired
    WinitOrderDetailSkuMapper winitOrderDetailSkuMapper;
    @Autowired
    GcOutOrderDetailSkuMapper gcOutOrderDetailSkuMapper;
    @Autowired
    EcOrderMapper ecOrderMapper;

    @Override
    public void updateBasicData() {
        //synStorageData();
        getFbaStorage();
        //synGoodData();
        //updateWarehouseStorage();
    }

    @Override
    public void synStorageData() {
        int count = productService.getCount();
        List<Map<String, String>> maps = getDoiItemList(count);
        System.out.println("产品数量：" + maps.size());
        for (Map<String, String> map : maps) {
            String productCode = map.get("productCode");
            //根据SKU查找到产品的id
            Product product = productService.queryBySku(productCode);
            if (product == null) {
                System.err.println(productCode);
                continue;
            }
            int productid = product.getProductid();
            //查找到产品对应的英国仓确认长宽高
            ProductCountryExample countryExample = new ProductCountryExample();
            countryExample.createCriteria().andProductidEqualTo(productid).andCountrycodeEqualTo("UK");
            List<ProductCountry> countries = countryMapper.selectByExample(countryExample);
            ProductCountry country;
            if (countries != null && countries.size() != 0) {
                if (countries.size() == 1) {
                    country = countries.get(0);
                } else {
                    generateTodo(productCode);
                    System.err.println(productCode + "ProductCountry数据库异常");
                    return;
                }
            } else {
                generateTodo(productCode);
                System.err.println(productCode + "ProductCountry数据库异常");
                return;
            }
            //查找当前表内是否已有产品库存字段
            WinitWarehouseStorage storage = winitWarehouseStorageMapper.selectByPrimaryKey(productid);
            boolean flag = false;
            if (storage == null) {
                storage = new WinitWarehouseStorage();
            } else {
                flag = true;
            }
            String qty7 = map.get("averageSalesQty7");
            Double qty;
            if (!StringUtils.isEmpty(qty7)) {
                qty = Double.valueOf(qty7);
            } else {
                qty = 0.0;
            }
            storage.setSkucode(product.getSkucode());
            storage.setAveragesalesqty7(qty7);
            storage.setAveragesalesqty(map.get("averageSalesQty"));
            storage.setAveragesalesqty15(map.get("averageSalesQty15"));
            storage.setDoi(map.get("DOI"));
            storage.setProductid(productid);
            storage.setQtyordered(map.get("qtyOrdered"));
            storage.setQtyreserved(map.get("qtyReserved"));
            storage.setWorehouseid(product.getWarehouseid());
            storage.setWorehousename(product.getWarehousename());
            storage.setProductlength(country.getProductlength());
            storage.setHeight(country.getProductheight());
            storage.setWeight(country.getProductwidth());
            String qtyAvailable = map.get("qtyAvailable");
            storage.setQtyavailable(qtyAvailable);
            Integer store = Integer.parseInt(qtyAvailable);
            if (qty == 0.0) {
                storage.setAvaday(0.00);
            } else {
                double day = store / qty;
                DecimalFormat df = new DecimalFormat("0.00");
                String result = df.format(day);
                storage.setAvaday(Double.valueOf(result));
            }
            if (flag) {
                winitWarehouseStorageMapper.updateByPrimaryKeySelective(storage);
            } else {
                winitWarehouseStorageMapper.insertSelective(storage);
            }
        }
    }

    private void generateTodo(String productCode) {
        SysUserExample example = new SysUserExample();
        example.createCriteria().andRoleIdEqualTo(3);
        List<SysUser> purchaseRoles = sysUserMapper.selectByExample(example);
        SysUserExample example2 = new SysUserExample();
        example2.createCriteria().andRoleIdEqualTo(1);
        List<SysUser> adminRoles = sysUserMapper.selectByExample(example2);
        String title = productCode + "缺乏国家";
        Date date = new Date();
        for (SysUser sysUser : purchaseRoles) {
            Todolist todolist = new Todolist();
            todolist.setTitle(title);
            todolist.setStatus(0);
            todolist.setCreatetime(date);
            todolist.setUserid(sysUser.getId());
            todolistMapper.insertSelective(todolist);
        }
        for (SysUser sysUser : adminRoles) {
            Todolist todolist = new Todolist();
            todolist.setTitle(title);
            todolist.setStatus(0);
            todolist.setCreatetime(date);
            todolist.setUserid(sysUser.getId());
            todolistMapper.insertSelective(todolist);
        }
    }


    @Override
    public void synGoodData() {
        boolean flag = true;
        int i = 1;
        while (flag) {
            GoodConnectUrl url = new GoodConnectUrl();
            url.setMethod("getProductInventory");
            url.setParamjson("{\"pageSize\":\"10\",\"page\":" + i + "}");
            String result = url.parseConnect();
            JSONObject json1 = JSONObject.parseObject(result);
            String data = json1.getString("data");
            String nextPage = json1.getString("nextPage");
            if (nextPage.equals("true")) {
                flag = true;
                i++;
            } else {
                flag = false;
            }
            List<GoodcangWarehouseStorage> goodOutOrders = JSONArray.parseArray(data, GoodcangWarehouseStorage.class);
            for (GoodcangWarehouseStorage goodcangWarehouseStorage : goodOutOrders) {
                String sku = goodcangWarehouseStorage.getProductSku();
                ProductExample example = new ProductExample();
                example.createCriteria().andSkucodeEqualTo(sku);
                Product product = productService.queryBySku(sku);
                if (product == null) {
                    continue;
                }
                int productid = product.getProductid();
                GoodcangWarehouseStorage warehouseStorage = goodcangWarehouseStorageMapper.selectByPrimaryKey(productid);
                goodcangWarehouseStorage.setProductid(productid);
                if (warehouseStorage == null) {
                    goodcangWarehouseStorageMapper.insertSelective(goodcangWarehouseStorage);
                } else {
                    goodcangWarehouseStorageMapper.updateByPrimaryKeySelective(goodcangWarehouseStorage);
                }
            }
        }
    }

    public void updateWinitOut() {
        LocalDate date = LocalDate.now();
        for (int i = 35; i <= 40; i++) {
            DateTimeFormatter fmt = DateTimeFormat.forPattern("yyyy-MM-dd");
            LocalDate enddate = date.minusDays(i);
            LocalDate startdate = date.minusDays(i + 1);
            String start = fmt.print(startdate);
            String end = fmt.print(enddate);
            getOutOrder(200, start, end, 1, null);
        }
        DateTime time = new DateTime();
        for (int i = 0; i <= 40; i++) {
            DateTimeFormatter fmt = DateTimeFormat.forPattern("yyyy-MM-dd");
            DateTime temptime = time.minusDays(i);
            String end = fmt.print(temptime);
            String start = fmt.print(time.minusDays(i + 1));
            setWinitRebate(start, end);
        }
    }

    public void updateWinitOut2() {
        WinitOutOrderDetailExample winitOutOrderExample = new WinitOutOrderDetailExample();
        winitOutOrderExample.createCriteria().andDeliverycostsEqualTo(0.0);
        List<WinitOutOrderDetail> winitOrderDetails = winitOutOrderDetailMapper.selectByExample(winitOutOrderExample);
        for (WinitOutOrderDetail winitOutOrder : winitOrderDetails) {
            setOutDetail(winitOutOrder.getOutboundordernum());
        }
    }

    @Override
    public void generateGoodOrder() {
        //generateOrder();
        generateOrderDetail();
        //generateEcOnRef();
    }

    @Override
    public void generateWinitOrder() {
        updateWinitOut();
        updateWinitOut2();
    }

    @Override
    public void checkOutData() {
        DatacaciquesPackageExample example = new DatacaciquesPackageExample();
        example.createCriteria().andCreatetimeBetween("2020-10-01", "2021-01-01").andFlagEqualTo(0);
        List<DatacaciquesPackage> packages = datacaciquesPackageMapper.selectByExample(example);
        for (DatacaciquesPackage datacaciquesPackage : packages) {
            String code = datacaciquesPackage.getPackagecode() + "-XhB";
            getOutOrder(200, "2020-10-01", "2021-01-01", 1, code);
            GoodConnectUrl url = new GoodConnectUrl();
            url.setMethod("getOrderByRefCode");
            JSONObject methond = new JSONObject();
            methond.put("reference_no", code);
            url.setParamjson(methond.toJSONString());
            String result = url.parseConnect();
            JSONObject json1 = JSONObject.parseObject(result);
            JSONObject data = json1.getJSONObject("data");
            if (data == null) {
                continue;
            }
            GcOutOrderDetail gcOutOrderDetail = new GcOutOrderDetail();
            String order_code = data.getString("order_code");
            gcOutOrderDetail.setOrderCode(order_code);
            if (data.getString("reference_no") != null) {
                gcOutOrderDetail.setReferenceNo(data.getString("reference_no"));
            }
            gcOutOrderDetail.setPlatform(data.getString("platform"));
            String status = data.getString("order_status");
            gcOutOrderDetail.setOrderStatus(status);
            gcOutOrderDetail.setTrackingNo(data.getString("tracking_no"));
            gcOutOrderDetail.setWarehouseCode(data.getString("warehouse_code"));
            gcOutOrderDetail.setOrderWeight(data.getFloat("order_weight"));
            gcOutOrderDetail.setDateCreate(data.getDate("date_create"));
            gcOutOrderDetail.setDateModify(data.getDate("date_modify"));
            if (data.get("items") == null) {
                continue;
            }
            JSONArray items = data.getJSONArray("items");
            JSONObject item = items.getJSONObject(0);
            if (data.get("fee_details") != null) {
                JSONObject fee = data.getJSONObject("fee_details");
                gcOutOrderDetail.setTotalfee(fee.getFloat("totalFee"));
                gcOutOrderDetail.setShipping(fee.getFloat("SHIPPING"));
                gcOutOrderDetail.setOpf(fee.getFloat("OPF"));
                gcOutOrderDetail.setFsc(fee.getFloat("FSC"));
                gcOutOrderDetail.setDt(fee.getFloat("DT"));
                gcOutOrderDetail.setOtf(fee.getFloat("OTF"));
                gcOutOrderDetail.setCurrencyCode(fee.getString("currency_code"));
            }
            String productCode = item.getString("product_sku");
            gcOutOrderDetail.setProductSku(productCode);
            gcOutOrderDetail.setFbaProductCode(item.getString("fba_product_code"));
            Integer quantity = item.getInteger("quantity");
            gcOutOrderDetail.setQuantity(quantity);
            gcOutOrderDetail.setTransactionId(item.getString("transaction_id"));
            gcOutOrderDetail.setItemId(item.getString("item_id"));
            GcOutOrderDetail outOrderDetail = gcOutOrderDetailMapper.selectByPrimaryKey(order_code);
            if (outOrderDetail == null) {
                gcOutOrderDetailMapper.insertSelective(gcOutOrderDetail);
            }
        }
    }

    @Transactional(rollbackFor = Exception.class)
    public void getFbaStorage() {
        List<String> warehouses = new ArrayList<>();
        warehouses.add("1904670032781115393");
        warehouses.add("1868993962723770369");
        warehouses.add("1939312746461921281");
        for (String temp : warehouses) {
            JSONObject data = new JSONObject();
            data.put("sql", "select p.sku, w.code, i.* from warehouse_inventory i join product p on i.productID=p.productID join warehouse w on i.warehouseID=w.warehouseID where i.warehouseID=" + temp + " and i.productID>0 order by i.productID limit 300");
            ResponseParam responseParam = queclient.post(data);
            int code = responseParam.getCode();
            if (code == 0) {
                List<JSONObject> orders = responseParam.getData();

                for (JSONObject object : orders) {
                    Long warehouseid = object.getLongValue("warehouseID");
                    Integer actualquantity = object.getIntValue("actualQuantity");
                    String sku = object.getString("sku");
                    Integer availablequantity = object.getIntValue("availableQuantity");
                    Integer transitquantity = object.getIntValue("transitQuantity");
                    Product product = productService.queryBySku(sku);
                    if (product == null) {
                        continue;
                    }
                    Integer productID = product.getProductid();
                    FbaWarehouseStorage fbaWarehouseStorage = new FbaWarehouseStorage();
                    fbaWarehouseStorage.setProductid(productID);
                    fbaWarehouseStorage.setActualquantity(actualquantity);
                    fbaWarehouseStorage.setAvailablequantity(availablequantity);
                    fbaWarehouseStorage.setWarehouseid(warehouseid);
                    fbaWarehouseStorage.setSku(sku);
                    fbaWarehouseStorage.setTransitquantity(transitquantity);
                    FbaWarehouseStorage fbaWarehouseStorage1 = fbaWarehouseStorageMapper.selectByPrimaryKey(productID);
                    if (fbaWarehouseStorage1 == null) {
                        fbaWarehouseStorageMapper.insertSelective(fbaWarehouseStorage);
                    } else {
                        fbaWarehouseStorageMapper.updateByPrimaryKeySelective(fbaWarehouseStorage);
                    }

                }
            }
        }


    }

    private void updateWarehouseStorage() {
        //先清空历史数据
        productWarehouseStorageMapper.clearStorage();
        WinitWarehouseStorageExample example = new WinitWarehouseStorageExample();
        example.createCriteria().andProductidIsNotNull();
        List<WinitWarehouseStorage> winitWarehouseStorages = winitWarehouseStorageMapper.selectByExample(example);
        for (WinitWarehouseStorage warehouseStorage : winitWarehouseStorages) {
            Integer productID = warehouseStorage.getProductid();
            Product product = productMapper.selectByPrimaryKey(productID);
            Integer onSell = Integer.valueOf(warehouseStorage.getQtyavailable());
            ProductWarehouseStorage productWarehouseStorage = productWarehouseStorageMapper.selectByPrimaryKey(productID);
            if (productWarehouseStorage == null) {
                productWarehouseStorage = new ProductWarehouseStorage();
                productWarehouseStorage.setProductid(productID);
                productWarehouseStorage.setOnsell(onSell);
                productWarehouseStorage.setWarehousename(product.getWarehousename());
                productWarehouseStorage.setSkucode(product.getSkucode());
                productWarehouseStorage.setWarehouseid(product.getWarehouseid());
                productWarehouseStorage.setCnname(product.getCnname());
                productWarehouseStorage.setOnpurchase(0);
                productWarehouseStorage.setOncnwarehouse(0);
                productWarehouseStorageMapper.insertSelective(productWarehouseStorage);
            } else {

                productWarehouseStorage.setOnsell(onSell);
                productWarehouseStorageMapper.updateByPrimaryKeySelective(productWarehouseStorage);
            }
        }
        GoodcangWarehouseStorageExample goodcangWarehouseStorageExample = new GoodcangWarehouseStorageExample();
        goodcangWarehouseStorageExample.createCriteria().andProductidIsNotNull();
        List<GoodcangWarehouseStorage> goodcangWarehouseStorages = goodcangWarehouseStorageMapper.selectByExample(goodcangWarehouseStorageExample);
        for (GoodcangWarehouseStorage goodcangWarehouseStorage : goodcangWarehouseStorages) {
            Integer productID = goodcangWarehouseStorage.getProductid();
            Product product = productMapper.selectByPrimaryKey(productID);
            Integer onSell = goodcangWarehouseStorage.getSellable();
            ProductWarehouseStorage productWarehouseStorage = productWarehouseStorageMapper.selectByPrimaryKey(productID);
            if (productWarehouseStorage == null) {
                productWarehouseStorage = new ProductWarehouseStorage();
                productWarehouseStorage.setProductid(productID);
                productWarehouseStorage.setOnsell(onSell);
                productWarehouseStorage.setWarehousename(product.getWarehousename());
                productWarehouseStorage.setSkucode(product.getSkucode());
                productWarehouseStorage.setWarehouseid(product.getWarehouseid());
                productWarehouseStorage.setCnname(product.getCnname());
                productWarehouseStorage.setOnpurchase(0);
                productWarehouseStorage.setOncnwarehouse(0);
                productWarehouseStorageMapper.insertSelective(productWarehouseStorage);
            } else {
                Integer oldSell = productWarehouseStorage.getOnsell();
                productWarehouseStorage.setOnsell(onSell + oldSell);
                productWarehouseStorageMapper.updateByPrimaryKeySelective(productWarehouseStorage);
            }
        }
        FbaWarehouseStorageExample fbaWarehouseStorageExample = new FbaWarehouseStorageExample();
        fbaWarehouseStorageExample.createCriteria().andProductidIsNotNull();
        List<FbaWarehouseStorage> fbaWarehouseStorages = fbaWarehouseStorageMapper.selectByExample(fbaWarehouseStorageExample);
        for (FbaWarehouseStorage fbaWarehouseStorage : fbaWarehouseStorages) {
            Integer productID = fbaWarehouseStorage.getProductid();
            Product product = productMapper.selectByPrimaryKey(productID);
            Integer onSell = fbaWarehouseStorage.getAvailablequantity();
            ProductWarehouseStorage productWarehouseStorage = productWarehouseStorageMapper.selectByPrimaryKey(productID);
            if (productWarehouseStorage == null) {
                productWarehouseStorage = new ProductWarehouseStorage();
                productWarehouseStorage.setProductid(productID);
                productWarehouseStorage.setOnsell(onSell);
                productWarehouseStorage.setWarehousename(product.getWarehousename());
                productWarehouseStorage.setSkucode(product.getSkucode());
                productWarehouseStorage.setWarehouseid(product.getWarehouseid());
                productWarehouseStorage.setCnname(product.getCnname());
                productWarehouseStorage.setOnpurchase(0);
                productWarehouseStorage.setOncnwarehouse(0);
                productWarehouseStorage.setOnway(0);
                productWarehouseStorageMapper.insertSelective(productWarehouseStorage);
            } else {
                Integer oldSell = productWarehouseStorage.getOnsell();
                productWarehouseStorage.setOnsell(onSell + oldSell);
                productWarehouseStorageMapper.updateByPrimaryKeySelective(productWarehouseStorage);
            }
        }
    }

    //拉取万邑通出库单
    private void getOutOrder(int total, String start, String end, int num, String code) {
        JSONObject data = new JSONObject();
        data.put("dateOrderedStartDate", start);
        data.put("dateOrderedEndDate", end);
        data.put("pageSize", total);
        if (code != null) {
            data.put("sellerOrderNo", code);
        }
        data.put("pageNum", num);
        HttpClient client = new HttpClient("queryOutboundOrderList", data);
        String result = client.start();
        if (!"error".equals(result)) {
            JSONObject json = JSONObject.parseObject(result);
            String resultdata = json.getString("data");
            JSONObject json1 = JSONObject.parseObject(resultdata);
            Integer newtotal = json1.getInteger("total");
            if ((newtotal / total) >= num) {
                getOutOrder(total, start, end, num + 1, code);
            }
            String result1 = json1.getString("list");
            JSONArray jsonArray = JSONArray.parseArray(result1);
            for (int i = 0; i < jsonArray.size(); i++) {
                JSONObject object = jsonArray.getJSONObject(i);
                String sku = (String) object.get("sku");
                String[] skustrs = sku.split("@@");
                sku = skustrs[0];
                Integer itemqty = object.getInteger("itemqty");
                String exwarehouseId = object.getString("exwarehouseId");
                Double weight = object.getDouble("weight");
                String countryName = object.getString("countryName");
                String documentNum = object.getString("documentNo");
                String eBaySellerID = object.getString("eBaySellerID");
                String status = object.getString("status");
                String sellerOrderNo = object.getString("sellerOrderNo");
                String statusName = object.getString("statusName");
                String warehouseId = object.getString("warehouseId");
                String warehouseName = object.getString("warehouseName");
                WinitOutOrderExample example = new WinitOutOrderExample();
                example.createCriteria().andExwarehouseidEqualTo(exwarehouseId);
                List<WinitOutOrder> orders = winitOutOrderMapper.selectByExample(example);
                if (orders == null || orders.size() == 0) {
                    WinitOutOrder winitOutOrder = new WinitOutOrder();
                    winitOutOrder.setExwarehouseid(exwarehouseId);
                    winitOutOrder.setCountryname(countryName);
                    winitOutOrder.setDocumentnum(documentNum);
                    winitOutOrder.setEbaysellerid(eBaySellerID);
                    winitOutOrder.setItemqty(itemqty);
                    winitOutOrder.setSellerorderno(sellerOrderNo);
                    winitOutOrder.setSku(sku);
                    winitOutOrder.setStatus(status);
                    winitOutOrder.setStatusname(statusName);
                    winitOutOrder.setWarehouseid(Integer.valueOf(warehouseId));
                    winitOutOrder.setWarehousename(warehouseName);
                    winitOutOrder.setWeight(weight);
                    winitOutOrderMapper.insertSelective(winitOutOrder);
                    setOutDetail(documentNum);
                } else {
                        /*
                        WinitOutOrder winitOutOrder=orders.get(0);
                        winitOutOrder.setExwarehouseid(exwarehouseId);
                        winitOutOrder.setCountryname(countryName);
                        winitOutOrder.setDocumentnum(documentNum);
                        winitOutOrder.setEbaysellerid(eBaySellerID);
                        winitOutOrder.setItemqty(itemqty);
                        winitOutOrder.setSellerorderno(sellerOrderNo);
                        winitOutOrder.setSku(sku);
                        winitOutOrder.setStatus(status);
                        winitOutOrder.setStatusname(statusName);
                        winitOutOrder.setWarehouseid(Integer.valueOf(warehouseId));
                        winitOutOrder.setWarehousename(warehouseName);
                        winitOutOrder.setWeight(weight);
                        winitOutOrderMapper.updateByPrimaryKeySelective(winitOutOrder);
                        setOutDetail(documentNum);
                        */
                    setOutDetail(documentNum);
                }
            }

        }
    }

    private void setOutDetail(String order) {
        JSONObject data = new JSONObject();
        data.put("outboundOrderNum", order);
        HttpClient client = new HttpClient("queryOutboundOrder", data);
        String result = client.start();
        if (!"error".equals(result)) {
            JSONObject json = JSONObject.parseObject(result);
             String resultdata = json.getString("data");
            JSONObject json1 = JSONObject.parseObject(resultdata);
            String result1 = json1.getString("list");
            JSONArray jsonArray = JSONArray.parseArray(result1);
            for (int i = 0; i < jsonArray.size(); i++) {
                JSONObject object = jsonArray.getJSONObject(i);
                WinitOutOrderDetail detail = new WinitOutOrderDetail();
                String sellerOrderNo = object.getString("sellerOrderNo");
                if (object.get("eBayOrderID") != null) {
                    String eBayOrderID = object.getString("eBayOrderID");
                    detail.setEbayorderid(eBayOrderID);
                }
                String outboundOrderID = object.getString("outboundOrderID");
                String outboundOrderNum = object.getString("outboundOrderNum");
                String warehouseName = object.getString("warehouseName");
                String orderedTime = object.getString("orderedTime");
                String outboundDate = object.getString("outboundDate");
                String status = object.getString("status");
                String statusName = object.getString("statusName");
                Double chargeableWeight = object.getDouble("chargeableWeight");
                String transactionDate = object.getString("transactionDate");
                Double deliveryCosts = object.getDouble("deliveryCosts");
                String deliveryCostsCode = object.getString("deliveryCostsCode");
                String eBayValidateResult = object.getString("eBayValidateResult");
                Double rebateFeeCosts = object.getDouble("rebateFeeCosts");
                String rebateFeeCostsCode = object.getString("rebateFeeCostsCode");
                Double handlingFee = object.getDouble("handlingFee");
                String handlingfeeCode = object.getString("handlingfeeCode");
                Double totalCost = object.getDouble("totalCost");
                JSONArray packageList = object.getJSONArray("packageList");
                JSONArray merchandiseList = packageList.getJSONObject(0).getJSONArray("merchandiseList");
                detail.setSellerorderno(sellerOrderNo);
                detail.setOutboundorderid(outboundOrderID);
                detail.setOutboundordernum(outboundOrderNum);
                detail.setWarehousename(warehouseName);
                detail.setWarehouseid("1022191");
                detail.setOrderedtime(orderedTime);
                detail.setOutbounddate(outboundDate);
                detail.setStatus(status);
                detail.setStatusname(statusName);
                detail.setChargeableweight(chargeableWeight);
                detail.setTransactiondate(transactionDate);
                detail.setDeliverycosts(deliveryCosts);
                detail.setEbayvalidateresult(eBayValidateResult);
                detail.setDeliverycostscode(deliveryCostsCode);
                detail.setRebatefeecosts(rebateFeeCosts);
                detail.setRebatefeecostscode(rebateFeeCostsCode);
                detail.setHandlingfee(handlingFee);
                detail.setHandlingfeecode(handlingfeeCode);
                detail.setTotalcost(totalCost);
                WinitOutOrderDetail newoutdetail = winitOutOrderDetailMapper.selectByPrimaryKey(outboundOrderNum);
                if (newoutdetail == null) {

                    winitOutOrderDetailMapper.insertSelective(detail);
                    for (int j = 0; j < merchandiseList.size(); j++) {
                        JSONObject merchandise = merchandiseList.getJSONObject(j);
                        String productCode = merchandise.getString("productCode");
                        Integer productNum = merchandise.getIntValue("productNum");
                        if (deliveryCosts != 0) {
                            Product product = productService.queryBySku(productCode);
                            if (product != null) {
                                productStorageService.min(product.getProductid(), productNum, 4, true);
                            }
                        }
                        WinitOrderDetailSku winitOrderDetailSku = new WinitOrderDetailSku();
                        winitOrderDetailSku.setOrderno(outboundOrderNum);
                        winitOrderDetailSku.setSku(productCode);
                        winitOrderDetailSku.setQuantity(productNum);
                        winitOrderDetailSkuMapper.insertSelective(winitOrderDetailSku);
                    }
                } else {

                    WinitOrderDetailSkuExample winitOrderDetailSkuExample = new WinitOrderDetailSkuExample();
                    winitOrderDetailSkuExample.createCriteria().andOrdernoEqualTo(outboundOrderNum);
                    winitOrderDetailSkuMapper.deleteByExample(winitOrderDetailSkuExample);
                    for (int j = 0; j < merchandiseList.size(); j++) {
                        JSONObject merchandise = merchandiseList.getJSONObject(j);
                        String productCode = merchandise.getString("productCode");
                        Integer productNum = merchandise.getIntValue("productNum");
                        if (deliveryCosts != 0 && newoutdetail.getDeliverycosts() == 0) {
                            Product product = productService.queryBySku(productCode);
                            if (product != null) {
                                productStorageService.min(product.getProductid(), productNum, 4, true);
                            }
                        }
                        WinitOrderDetailSku winitOrderDetailSku = new WinitOrderDetailSku();
                        winitOrderDetailSku.setOrderno(outboundOrderNum);
                        winitOrderDetailSku.setSku(productCode);
                        winitOrderDetailSku.setQuantity(productNum);
                        winitOrderDetailSkuMapper.insertSelective(winitOrderDetailSku);
                    }
                    winitOutOrderDetailMapper.updateByPrimaryKeySelective(detail);
                }

            }
        }
    }

    private void setWinitRebate(String start, String end) {
        JSONObject data = new JSONObject();
        data.put("pageSize", "200");
        data.put("pageNo", 1);
        JSONObject param = new JSONObject();
        param.put("orderDateFrom", start);
        param.put("orderDateTo", end);
        param.put("pageParams", data);
        HttpClient client = new HttpClient("sms.incomeSettlement.queryOutboundOrderFee", param);
        String result = client.start();
        if (!"error".equals(result)) {
            JSONObject json = JSONObject.parseObject(result);
            String resultdata = json.getString("data");
            JSONObject json1 = JSONObject.parseObject(resultdata);
            if (json1 == null) {
                return;
            }
            if (json1.getString("list") == null) {
                return;
            }
            String list = json1.getString("list");
            JSONArray json2 = JSON.parseArray(list);
            for (int j = 0; j < json2.size(); j++) {
                JSONObject jsonObject = json2.getJSONObject(j);
                String incomeSettlementLineVos = jsonObject.getString("incomeSettlementLineVos");
                String businessDocumentNo = jsonObject.getString("businessDocumentNo");
                List<WinitRebateMoney> winitRebateMonies = JSONArray.parseArray(incomeSettlementLineVos, WinitRebateMoney.class);
                for (WinitRebateMoney winitRebateMoney : winitRebateMonies) {
                    if (winitRebateMoney.getSourceamt() < 0) {
                        Double sourceamount = winitRebateMoney.getSourceamt();
                        WinitRebateMoneyExample money = new WinitRebateMoneyExample();
                        money.createCriteria().andBusinessdocumentnoEqualTo(businessDocumentNo).andSourceamtEqualTo(sourceamount);
                        List<WinitRebateMoney> winitRebateMonies1 = winitRebateMoneyMapper.selectByExample(money);
                        if (winitRebateMonies1 == null || winitRebateMonies1.size() == 0) {
                            winitRebateMoney.setBusinessdocumentno(businessDocumentNo);
                            winitRebateMoneyMapper.insertSelective(winitRebateMoney);
                        } else {
                            WinitRebateMoney winitRebateMoney1 = winitRebateMonies1.get(0);
                            winitRebateMoney1.setSourceamt(sourceamount);
                            winitRebateMoneyMapper.updateByPrimaryKeySelective(winitRebateMoney1);
                        }
                    }
                }
            }
        }

    }

    public List<Map<String, String>> getDoiItemList(int count) {
        JSONObject data = new JSONObject();
        data.put("inventoryType", "Country");
        data.put("pageNum", "0");
        data.put("pageSize", count);
        data.put("warehouseId", 1022191);
        data.put("isActive", "Y");
        RequestMsg requestMsg = new RequestMsg();
        requestMsg.setAction("queryProductInventoryList4Page");
        requestMsg.setData(data);
        StorageReponse responseParam = client.post(requestMsg);
        int code = responseParam.getCode();
        if (code == 0) {
            return responseParam.getData().getList();
        } else {
            //拋出winitapi接口异常
        }
        return null;
    }

    public void generateOrder() {
        DateTimeFormatter fmt = DateTimeFormat.forPattern("yyyy-MM-dd");
        DateTime time=new DateTime(fmt.print(DateTime.now()));
        for (int i=20;i<=42;i++) {
            DateTime temptime=time.minusDays(i);
            String start = fmt.print(temptime);
            DateTime endTime=temptime.plusDays(1);
            String end = fmt.print(endTime);
            generateOrders(start, end, 1);
        }
    }
    public Integer getOrdersSize(String start,String end){
        GoodConnectUrl url = new GoodConnectUrl();
        url.setMethod("getOrderList");
        JSONObject object=new JSONObject();
        object.put("create_date_from",start);
        object.put("create_date_to",end);
        url.setParamjson(object.toJSONString());
        String result = url.parseConnect();
        JSONObject json1 = JSONObject.parseObject(result);
        return  json1.getInteger("count");
    }
    public void generateOrders(String start,String end,int page){
        GoodConnectUrl url = new GoodConnectUrl();
        url.setMethod("getOrderList");
        JSONObject object=new JSONObject();
        object.put("pageSize",100);
        object.put("page",page);
        object.put("create_date_from",start);
        object.put("create_date_to",end);
        url.setParamjson(object.toJSONString());
        String result = url.parseConnect();
        JSONObject json1 = JSONObject.parseObject(result);
        String data = json1.getString("data");
        List<GcOutOrder> outOrders = JSONArray.parseArray(data, GcOutOrder.class);
        if (outOrders==null){
            return;
        }
        if (outOrders.size()==100){
            generateOrders(start,end,page+1);
        }
        for (GcOutOrder gcOutOrder : outOrders) {
            String order = gcOutOrder.getOrderCode();
            GcOutOrder gcOutOrder1 = gcOutOrderMapper.selectByPrimaryKey(order);
            if (gcOutOrder1 != null) {
                //gcOutOrderMapper.updateByPrimaryKeySelective(gcOutOrder);
                continue;
            } else {
                gcOutOrderMapper.insertSelective(gcOutOrder);
            }
        }
    }

    public void generateEcOnRef(){
        EcOrderExample ecOrderExample=new EcOrderExample();
        ecOrderExample.createCriteria().andPlatformshipstatusNotEqualTo(4).andCreateddateBetween(new DateTime("2021-01-01").toDate(),new DateTime("2021-03-01").toDate());
        List<EcOrder> ecOrders=ecOrderMapper.selectByExample(ecOrderExample);
        for (EcOrder ecOrder:ecOrders){
            generateOrderByRef(ecOrder.getSaleordercode());
        }
    }

    public void generateOrderByRef(String ref){
        GoodConnectUrl url = new GoodConnectUrl();
        url.setMethod("getOrderByRefCode");
        JSONObject methond = new JSONObject();
        methond.put("reference_no", ref);
        url.setParamjson(methond.toJSONString());
        String result = url.parseConnect();
        JSONObject json1 = JSONObject.parseObject(result);
        JSONObject data = json1.getJSONObject("data");
        if(data==null){
            return;
        }
        GcOutOrderDetail gcOutOrderDetail = new GcOutOrderDetail();
        String orderCode=data.getString("order_code");
        gcOutOrderDetail.setOrderCode(orderCode);
        if (data.getString("reference_no") != null) {
            gcOutOrderDetail.setReferenceNo(data.getString("reference_no"));
        }
        gcOutOrderDetail.setPlatform(data.getString("platform"));
        String status = data.getString("order_status");
        gcOutOrderDetail.setOrderStatus(status);
        gcOutOrderDetail.setTrackingNo(data.getString("tracking_no"));
        gcOutOrderDetail.setWarehouseCode(data.getString("warehouse_code"));
        gcOutOrderDetail.setOrderWeight(data.getFloat("order_weight"));
        gcOutOrderDetail.setDateCreate(data.getDate("date_create"));
        gcOutOrderDetail.setDateModify(data.getDate("date_modify"));
        if (data.get("items") == null) {
            return;
        }
        JSONArray items = data.getJSONArray("items");
        if (data.get("fee_details") != null) {
            JSONObject fee = data.getJSONObject("fee_details");
            gcOutOrderDetail.setTotalfee(fee.getFloat("totalFee"));
            gcOutOrderDetail.setShipping(fee.getFloat("SHIPPING"));
            gcOutOrderDetail.setOpf(fee.getFloat("OPF"));
            gcOutOrderDetail.setFsc(fee.getFloat("FSC"));
            gcOutOrderDetail.setDt(fee.getFloat("DT"));
            gcOutOrderDetail.setOtf(fee.getFloat("OTF"));
            gcOutOrderDetail.setCurrencyCode(fee.getString("currency_code"));
        }
        GcOutOrderDetail outOrderDetail = gcOutOrderDetailMapper.selectByPrimaryKey(orderCode);
        if (outOrderDetail == null) {

            GcOutOrderDetailSkuExample gcOutOrderDetailSkuExample = new GcOutOrderDetailSkuExample();
            gcOutOrderDetailSkuExample.createCriteria().andOrderCodeEqualTo(orderCode);
            gcOutOrderDetailSkuMapper.deleteByExample(gcOutOrderDetailSkuExample);
            for (int i = 0; i < items.size(); i++) {
                JSONObject item = items.getJSONObject(i);
                String productCode = item.getString("product_sku");
                Integer quantity = item.getInteger("quantity");
                GcOutOrderDetailSku gcOutOrderDetailSku = new GcOutOrderDetailSku();
                gcOutOrderDetailSku.setOrderCode(orderCode);
                gcOutOrderDetailSku.setProductSku(productCode);
                gcOutOrderDetailSku.setQuantity(quantity);
                gcOutOrderDetailSkuMapper.insertSelective(gcOutOrderDetailSku);
                if (status.equals("W") || status.equals("D")) {
                    Product product = productService.queryBySku(productCode);
                    if (product != null) {
                        productStorageService.min(product.getProductid(), quantity, 4, true);
                    }
                }
            }
            gcOutOrderDetailMapper.insertSelective(gcOutOrderDetail);
        } else {

            GcOutOrderDetailSkuExample gcOutOrderDetailSkuExample = new GcOutOrderDetailSkuExample();
            gcOutOrderDetailSkuExample.createCriteria().andOrderCodeEqualTo(orderCode);
            gcOutOrderDetailSkuMapper.deleteByExample(gcOutOrderDetailSkuExample);
            for (int i = 0; i < items.size(); i++) {
                JSONObject item = items.getJSONObject(i);
                String productCode = item.getString("product_sku");
                Integer quantity = item.getInteger("quantity");
                GcOutOrderDetailSku gcOutOrderDetailSku = new GcOutOrderDetailSku();
                gcOutOrderDetailSku.setOrderCode(orderCode);
                gcOutOrderDetailSku.setProductSku(productCode);
                gcOutOrderDetailSku.setQuantity(quantity);
                gcOutOrderDetailSkuMapper.insertSelective(gcOutOrderDetailSku);
            }
            gcOutOrderDetailMapper.updateByPrimaryKeySelective(gcOutOrderDetail);
        }
    }

    public void generateOrderDetail() {
        GcOutOrderExample example = new GcOutOrderExample();
        DateTime time = new DateTime();
        DateTime startTime = time.minusDays(15);
        DateTime endTime = time.minusDays(0);
        example.createCriteria().andOrderCodeIsNotNull().andDateCreateGreaterThan(startTime.toDate()).andDateCreateLessThan(endTime.toDate());
        List<GcOutOrder> outOrders = gcOutOrderMapper.selectByExample(example);
        for (GcOutOrder outOrder : outOrders) {
            String order = outOrder.getOrderCode();
            GoodConnectUrl url = new GoodConnectUrl();
            url.setMethod("getOrderByCode");
            JSONObject methond = new JSONObject();
            methond.put("order_code", order);
            url.setParamjson(methond.toJSONString());
            String result = url.parseConnect();
            JSONObject json1 = JSONObject.parseObject(result);
            JSONObject data = json1.getJSONObject("data");
            GcOutOrderDetail gcOutOrderDetail = new GcOutOrderDetail();
            gcOutOrderDetail.setOrderCode(order);
            if (data.getString("reference_no") != null) {
                gcOutOrderDetail.setReferenceNo(data.getString("reference_no"));
            }
            gcOutOrderDetail.setPlatform(data.getString("platform"));
            String status = data.getString("order_status");
            gcOutOrderDetail.setOrderStatus(status);
            gcOutOrderDetail.setTrackingNo(data.getString("tracking_no"));
            gcOutOrderDetail.setWarehouseCode(data.getString("warehouse_code"));
            gcOutOrderDetail.setOrderWeight(data.getFloat("order_weight"));
            gcOutOrderDetail.setDateCreate(data.getDate("date_create"));
            gcOutOrderDetail.setDateModify(data.getDate("date_modify"));
            if (data.get("items") == null) {
                continue;
            }
            JSONArray items = data.getJSONArray("items");


            if (data.get("fee_details") != null) {
                JSONObject fee = data.getJSONObject("fee_details");
                gcOutOrderDetail.setTotalfee(fee.getFloat("totalFee"));
                gcOutOrderDetail.setShipping(fee.getFloat("SHIPPING"));
                gcOutOrderDetail.setOpf(fee.getFloat("OPF"));
                gcOutOrderDetail.setFsc(fee.getFloat("FSC"));
                gcOutOrderDetail.setDt(fee.getFloat("DT"));
                gcOutOrderDetail.setOtf(fee.getFloat("OTF"));
                gcOutOrderDetail.setCurrencyCode(fee.getString("currency_code"));
            }
            GcOutOrderDetail outOrderDetail = gcOutOrderDetailMapper.selectByPrimaryKey(order);
            if (outOrderDetail == null) {

                GcOutOrderDetailSkuExample gcOutOrderDetailSkuExample = new GcOutOrderDetailSkuExample();
                gcOutOrderDetailSkuExample.createCriteria().andOrderCodeEqualTo(order);
                gcOutOrderDetailSkuMapper.deleteByExample(gcOutOrderDetailSkuExample);
                for (int i = 0; i < items.size(); i++) {
                    JSONObject item = items.getJSONObject(i);
                    String productCode = item.getString("product_sku");
                    Integer quantity = item.getInteger("quantity");
                    GcOutOrderDetailSku gcOutOrderDetailSku = new GcOutOrderDetailSku();
                    gcOutOrderDetailSku.setOrderCode(order);
                    gcOutOrderDetailSku.setProductSku(productCode);
                    gcOutOrderDetailSku.setQuantity(quantity);
                    gcOutOrderDetailSkuMapper.insertSelective(gcOutOrderDetailSku);
                    if (status.equals("W") || status.equals("D")) {
                        Product product = productService.queryBySku(productCode);
                        if (product != null) {
                            productStorageService.min(product.getProductid(), quantity, 4, true);
                        }
                    }
                }
                gcOutOrderDetailMapper.insertSelective(gcOutOrderDetail);
            } else {

                GcOutOrderDetailSkuExample gcOutOrderDetailSkuExample = new GcOutOrderDetailSkuExample();
                gcOutOrderDetailSkuExample.createCriteria().andOrderCodeEqualTo(order);
                gcOutOrderDetailSkuMapper.deleteByExample(gcOutOrderDetailSkuExample);
                for (int i = 0; i < items.size(); i++) {
                    JSONObject item = items.getJSONObject(i);
                    String productCode = item.getString("product_sku");
                    Integer quantity = item.getInteger("quantity");
                    GcOutOrderDetailSku gcOutOrderDetailSku = new GcOutOrderDetailSku();
                    gcOutOrderDetailSku.setOrderCode(order);
                    gcOutOrderDetailSku.setProductSku(productCode);
                    gcOutOrderDetailSku.setQuantity(quantity);
                    gcOutOrderDetailSkuMapper.insertSelective(gcOutOrderDetailSku);
                    if (!outOrder.getOrderStatus().equals("W") && !outOrder.getOrderStatus().equals("D")) {
                        if (status.equals("W") || status.equals("D")) {
                            Product product = productService.queryBySku(productCode);
                            if (product != null) {
                                productStorageService.min(product.getProductid(), quantity, 4, true);
                            }
                        }
                    }
                }
                gcOutOrderDetailMapper.updateByPrimaryKeySelective(gcOutOrderDetail);
            }
        }

    }
}
