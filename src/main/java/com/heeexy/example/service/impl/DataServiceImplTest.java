package com.heeexy.example.service.impl;

import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import cn.afterturn.easypoi.excel.entity.enmus.ExcelType;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.heeexy.example.MyApplication;
import com.heeexy.example.dao.*;
import com.heeexy.example.model.*;
import com.heeexy.example.service.*;
import com.heeexy.example.util.ExcelUtils;
import com.heeexy.example.util.GetOrredingIdUUID;
import com.heeexy.example.util.http.EcApiClient;
import org.apache.ibatis.annotations.Select;
import org.apache.poi.ss.formula.functions.Finance;
import org.apache.poi.ss.usermodel.Workbook;
import org.joda.time.DateTime;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest

public class DataServiceImplTest {
    @Autowired
    DataService dataService;
    @Autowired
    FinancePaymentMapper financePaymentMapper;
    @Autowired
    PurchaseImportMapper purchaseImportMapper;
    @Autowired
    PurchaseskuImportMapper purchaseskuImportMapper;
    @Autowired
    SupplierService supplierService;
    @Autowired
    EbayWarehouseoutSkuMapper ebayWarehouseoutSkuMapper;
    @Autowired
    EbayWarehouseoutMapper ebayWarehouseoutMapper;
    @Autowired
    PurchaseMapper purchaseMapper;
    @Autowired
    ProductService productService;
    @Autowired
    PurchaseSkuMapper purchaseSkuMapper;
    @Autowired
    ProductMapper productMapper;
    @Autowired
    FinanceService financeService;
    @Autowired
    WarehouseInService warehouseInService;
    @Autowired
    Sheet1Mapper sheet1Mapper;
    @Autowired
    WarehouseInWarrantMapper warehouseInWarrantMapper;
    @Autowired
    WarehouseInWarrantSkuMapper warehouseInWarrantSkuMapper;
    @Autowired
    WarehouseOutWarrantMapper warehouseOutWarrantMapper;
    @Autowired
    WarehouseOutWarrantSkuMapper warehouseOutWarrantSkuMapper;
    @Autowired
    ExchangerateMapper exchangerateMapper;
    @Autowired
    AlloOutMapper alloOutMapper;
    @Autowired
    AlloOutSkuMapper alloOutSkuMapper;
    @Autowired
    OrderService orderService;
    @Autowired
    EbayOrderSkuMapper ebayOrderSkuMapper;
    @Autowired
    DatacaciquesOrderMapper datacaciquesOrderMapper;
    @Autowired
    DatacaciquesOrderPackageRelationMapper datacaciquesOrderPackageRelationMapper;
    @Autowired
    WarnInfoService warnInfoService;
    @Autowired
    ProductSupplierMapper productSupplierMapper;
    @Autowired
    ProductWarehouseStorageMapper productWarehouseStorageMapper;
    @Autowired
    ProductSellMapper productSellMapper;
    @Autowired
    TrackService trackService;
    @Autowired
    StringRedisTemplate stringRedisTemplate;
    @Autowired
    ProductWarehouseStorageBackMapper productWarehouseStorageBackMapper;
    @Autowired
    PurchaseService purchaseService;
    @Autowired
    SysUserMapper sysUserMapper;
    @Autowired
    TodolistMapper todolistMapper;
    @Autowired
    WarehouseOutService warehouseOutService;
    @Autowired
    BirdService birdService;
    @Autowired
    AlloOutService alloOutService;
    @Autowired
    ProductWarehouseStorageBackInfoMapper infoMapper;

    @Test
    public void spilit(){
        purchaseService.splitPurchase(1938);

    }

    @Test
    public void test() {
        DateTime dateTime = new DateTime();
        int month = dateTime.getMonthOfYear();
        int day = 1;
        ProductWarehouseStorageBackExample backExample = new ProductWarehouseStorageBackExample();
        backExample.createCriteria().andBackidIsNotNull().andDayEqualTo(day).andMonthEqualTo(month);
        List<ProductWarehouseStorageBack> backs = productWarehouseStorageBackMapper.selectByExample(backExample);
        for (ProductWarehouseStorageBack back : backs) {
            Integer backID = back.getBackid();
            Integer onpurchase = back.getOnpurchase();
            Integer onCnWarehouse = back.getOncnwarehouse();
            Integer onWay = back.getOnway();
            Integer onsell = back.getOnsell();
            Integer productID = back.getProductid();
            DecimalFormat df = new DecimalFormat("#.00");
            List<Map<String, Object>> purchaseLists = new ArrayList<>();

            if (onpurchase > 0) {
                PurchaseSkuExample skuExample = new PurchaseSkuExample();
                skuExample.createCriteria().andProductidEqualTo(productID);
                List<PurchaseSku> skus = purchaseSkuMapper.selectByExample(skuExample);
                for (PurchaseSku sku : skus) {
                    if ((sku.getStockinquantity() + sku.getDefectivequantity()) < sku.getPurchasequantity()) {
                        Integer purchaseID = sku.getPurchaseid();
                        int quantity = sku.getPurchasequantity() - sku.getStockinquantity() - sku.getDefectivequantity();
                        double price = sku.getUnitprice().doubleValue();
                        Purchase purchase = purchaseMapper.selectByPrimaryKey(purchaseID);
                        Double freighttotalamount = purchase.getFreighttotalamount().doubleValue();
                        Double purchasetotalamount = purchase.getPurchasetotalamount().doubleValue();
                        Double skuPurchase = sku.getPurchaseamount().doubleValue();
                        Integer amount = sku.getPurchasequantity();
                        Double fare = Double.valueOf(df.format((skuPurchase / purchasetotalamount) * freighttotalamount / amount));
                        Map<String, Object> map = new HashMap<>();
                        map.put("Num", purchase.getPurchasenum());
                        map.put("sku", sku.getSku());
                        map.put("quantity", quantity);
                        map.put("price", price + fare);
                        map.put("amount", df.format((price + fare) * quantity));
                        purchaseLists.add(map);
                    }
                }

            }
            List<Map<String, Object>> cnLists = new ArrayList<>();
            if (onCnWarehouse > 0) {
                WarehouseInWarrantSkuExample inWarrantSkuExample = new WarehouseInWarrantSkuExample();
                inWarrantSkuExample.createCriteria().andProductidEqualTo(productID);
                List<WarehouseInWarrantSku> inWarrantSkus = warehouseInWarrantSkuMapper.selectByExample(inWarrantSkuExample);
                for (WarehouseInWarrantSku warehouseInWarrantSku : inWarrantSkus) {
                    Integer outCount = warehouseInWarrantSku.getOutcount();
                    Integer inCount = warehouseInWarrantSku.getIncount();
                    if (outCount < inCount) {
                        int count = inCount - outCount;
                        double price = warehouseInWarrantSku.getUnitprice().doubleValue() + warehouseInWarrantSku.getFare().doubleValue();
                        Integer purchaseSkuID = warehouseInWarrantSku.getPurchaseskuid();
                        Purchase purchase = null;
                        if (purchaseSkuID != null) {
                            PurchaseSku purchaseSku = purchaseSkuMapper.selectByPrimaryKey(purchaseSkuID);
                            Integer purchaseID = purchaseSku.getPurchaseid();
                            purchase = purchaseMapper.selectByPrimaryKey(purchaseID);
                        }
                        Map<String, Object> map = new HashMap<>();
                        if (purchase != null) {
                            map.put("Num", purchase.getPurchasenum());
                        } else {
                            map.put("Num", " ");
                        }
                        map.put("sku", warehouseInWarrantSku.getSkucode());
                        map.put("quantity", count);
                        map.put("price", price);
                        map.put("amount", df.format(price * count));
                        cnLists.add(map);
                    }
                }

            }
            List<Map<String, Object>> onWayLists = new ArrayList<>();
            if (onWay > 0) {
                WarehouseOutWarrantSkuExample skuExample = new WarehouseOutWarrantSkuExample();
                skuExample.createCriteria().andProductidEqualTo(productID);
                List<WarehouseOutWarrantSku> skus = warehouseOutWarrantSkuMapper.selectByExample(skuExample);
                for (WarehouseOutWarrantSku sku : skus) {
                    Integer outID = sku.getOutid();
                    WarehouseOutWarrant warehouseOutWarrant = warehouseOutWarrantMapper.selectByPrimaryKey(outID);
                    String type = warehouseOutWarrant.getType();
                    if (type.equals("其他出库")) {
                        continue;
                    }
                    Integer arriveStatus = warehouseOutWarrant.getArrivestatus();
                    WarehouseInWarrantSku warehouseInWarrantSku = warehouseInWarrantSkuMapper.selectByPrimaryKey(sku.getInskuid());
                    Integer purchaseSkuID = warehouseInWarrantSku.getPurchaseskuid();
                    Purchase purchase = null;
                    if (purchaseSkuID != null) {
                        PurchaseSku purchaseSku = purchaseSkuMapper.selectByPrimaryKey(purchaseSkuID);
                        Integer purchaseID = purchaseSku.getPurchaseid();
                        purchase = purchaseMapper.selectByPrimaryKey(purchaseID);
                    }
                    if (arriveStatus < 3) {
                        double price = warehouseInWarrantSku.getUnitprice().doubleValue() + warehouseInWarrantSku.getFare().doubleValue();
                        int count = sku.getOutcount();
                        Map<String, Object> map = new HashMap<>();
                        if (purchase != null) {
                            map.put("Num", purchase.getPurchasenum());
                        } else {
                            map.put("Num", " ");
                        }
                        map.put("sku", sku.getSkucode());
                        map.put("quantity", count);
                        map.put("price", price);
                        map.put("amount", df.format(price * count));
                        onWayLists.add(map);
                    }
                }
            }
            List<Map<String, Object>> onSellLists = new ArrayList<>();
            if (onsell > 0) {
                AlloOutSkuExample alloOutSkuExample = new AlloOutSkuExample();
                alloOutSkuExample.createCriteria().andProductidEqualTo(productID);
                List<AlloOutSku> skus = alloOutSkuMapper.selectByExample(alloOutSkuExample);
                for (AlloOutSku sku : skus) {
                    Integer alloid = sku.getAlloid();
                    AlloOut alloOut = alloOutMapper.selectByPrimaryKey(alloid);
                    Integer status = alloOut.getStatus();
                    if (status == 3) {
                        Integer outID = alloOut.getOutid();
                        WarehouseOutWarrantSkuExample warehouseOutWarrantSkuExample = new WarehouseOutWarrantSkuExample();
                        warehouseOutWarrantSkuExample.createCriteria().andProductidEqualTo(productID).andOutidEqualTo(outID);
                        List<WarehouseOutWarrantSku> warehouseOutWarrantSkus = warehouseOutWarrantSkuMapper.selectByExample(warehouseOutWarrantSkuExample);
                        StringBuilder st = new StringBuilder();
                        for (WarehouseOutWarrantSku warehouseOutWarrantSku : warehouseOutWarrantSkus) {
                            Integer insku = warehouseOutWarrantSku.getInskuid();
                            WarehouseInWarrantSku warehouseInWarrantSku = warehouseInWarrantSkuMapper.selectByPrimaryKey(insku);
                            Integer purchaseSkuID = warehouseInWarrantSku.getPurchaseskuid();
                            if (purchaseSkuID != null) {
                                PurchaseSku purchaseSku = purchaseSkuMapper.selectByPrimaryKey(purchaseSkuID);
                                Integer purchaseID = purchaseSku.getPurchaseid();
                                Purchase purchase = purchaseMapper.selectByPrimaryKey(purchaseID);
                                st.append(purchase.getPurchasenum()).append("\n");
                            } else {
                                st.append("其他入库单\n");
                            }
                        }
                        Integer useCount = sku.getUsecount();
                        Integer inCount = sku.getIncount();
                        if (useCount < inCount) {
                            int temp = inCount - useCount;
                            Map<String, Object> map = new HashMap<>();
                            map.put("Num", st.toString());
                            map.put("sku", sku.getSkucode());
                            map.put("quantity", inCount - useCount);
                            map.put("price", sku.getPrice());
                            map.put("amount", sku.getPrice().doubleValue() * temp);
                            onSellLists.add(map);
                        }
                    }
                }
            }
            ProductWarehouseStorageBackInfo info = infoMapper.selectByPrimaryKey(backID);
            info.setCnwarehousestr(JSON.toJSONString(cnLists));
            info.setPurchasestr(JSON.toJSONString(purchaseLists));
            info.setOnwaystr(JSON.toJSONString(onWayLists));
            info.setOnwarehousestr(JSON.toJSONString(onSellLists));
            infoMapper.updateByPrimaryKeySelective(info);
        }
    }


    @Test

    public void exchage() {
        /*WarehouseInWarrantSkuExample inWarrantSkuExample=new WarehouseInWarrantSkuExample();
        inWarrantSkuExample.createCriteria().andPurchaseskuidIsNotNull();
        List<WarehouseInWarrantSku> warehouseInWarrantSkus=warehouseInWarrantSkuMapper.selectByExample(inWarrantSkuExample);
        for (WarehouseInWarrantSku warehouseInWarrantSku:warehouseInWarrantSkus){
            Integer purchaseSkuID=warehouseInWarrantSku.getPurchaseskuid();
            PurchaseSku purchaseSku=purchaseSkuMapper.selectByPrimaryKey(purchaseSkuID);
            Purchase purchase=purchaseMapper.selectByPrimaryKey(purchaseSku.getPurchaseid());
            Double freighttotalamount=purchase.getFreighttotalamount().doubleValue();
            if (freighttotalamount<0){
                freighttotalamount=0.0;
            }
            Double purchasetotalamount=purchase.getPurchasetotalamount().doubleValue();
            Double skuPurchase=purchaseSku.getPurchaseamount().doubleValue();
            Integer amount=purchaseSku.getPurchasequantity();
            DecimalFormat df = new DecimalFormat("#.00");
            Double fare= Double.valueOf(df.format((skuPurchase/purchasetotalamount)*freighttotalamount/amount));
            warehouseInWarrantSku.setFare(new BigDecimal(fare));
            warehouseInWarrantSku.setUnitprice(purchaseSku.getUnitprice());
            warehouseInWarrantSkuMapper.updateByPrimaryKeySelective(warehouseInWarrantSku);
        }*/

        //orderService.circleAmount("2020-05-01","2020-05-28");
       /* List<PurchaseSku> skus=purchaseSkuMapper.getPurchaseSkus();
        for (PurchaseSku sku:skus){
            int id=sku.getId();
            WarehouseInWarrantSkuExample warehouseInWarrantSkuExample=new WarehouseInWarrantSkuExample();
            warehouseInWarrantSkuExample.createCriteria().andPurchaseskuidEqualTo(id);
            List<WarehouseInWarrantSku> warehouseInWarrantSkus=warehouseInWarrantSkuMapper.selectByExample(warehouseInWarrantSkuExample);
            Integer outCount=0;
            for(WarehouseInWarrantSku warehouseInWarrantSku:warehouseInWarrantSkus){
                 outCount+=warehouseInWarrantSku.getOutcount();
            }
            sku.setUsequantity(outCount);
            purchaseSkuMapper.updateByPrimaryKeySelective(sku);
        }*/
        //  orderService.circleAmount("2019-12-01","2020-01-01");
/*        List<EbayOrderProfit> ebayOrderProfits=orderService.exportOrder("2020-10-01","2020-11-01");

        Workbook workbook = ExcelExportUtil.exportExcel(new ExportParams(null, "利润报表", ExcelType.XSSF),EbayOrderProfit.class, ebayOrderProfits);
        OutputStream out = null;
        try {
            String fileName = "十月利润";
            out = new FileOutputStream("D:/junfan/" + fileName + ".xls");
            workbook.write(out);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }*/
        //dataService.generateWinitOrder();
       /* AlloOutExample example=new AlloOutExample();
        example.createCriteria().andOutidIsNotNull();
        List<AlloOut> alloOuts=alloOutMapper.selectByExample(example);
        for (AlloOut alloOut:alloOuts){
            Integer outID=alloOut.getOutid();
            WarehouseOutWarrant warehouseOutWarrant=warehouseOutWarrantMapper.selectByPrimaryKey(outID);
            if (warehouseOutWarrant==null){
                alloOutMapper.deleteByPrimaryKey(alloOut.getAlloid());
                AlloOutSkuExample skuExample=new AlloOutSkuExample();
                skuExample.createCriteria().andAlloidEqualTo(alloOut.getAlloid());
                alloOutSkuMapper.deleteByExample(skuExample);
            }
        }*/
       /* AlloOutSkuExample skuExample=new AlloOutSkuExample();
        skuExample.createCriteria().andAlloidIsNotNull();
        List<AlloOutSku> alloOutSkus=alloOutSkuMapper.selectByExample(skuExample);
        for (AlloOutSku alloOutSku:alloOutSkus){
            Integer alloid=alloOutSku.getAlloid();
            AlloOut alloOut=alloOutMapper.selectByPrimaryKey(alloid);
            if (alloOut==null){
                alloOutSkuMapper.deleteByPrimaryKey(alloOutSku.getAlloskuid());
            }
        }*/
        // dataService.checkOutData();
        //dataService.generateWinitOrder();
      /*  DateTime dateTime = new DateTime();
        int month = dateTime.getMonthOfYear();
        int day = 1;*/
      /*  ProductWarehouseStorageExample example=new ProductWarehouseStorageExample();
        example.createCriteria().andProductidIsNotNull();
        List<ProductWarehouseStorage> warehouseStorages=productWarehouseStorageMapper.selectByExample(example);
        for (ProductWarehouseStorage warehouseStorage:warehouseStorages){
            Integer productID=warehouseStorage.getProductid();
            Product product=productMapper.selectByPrimaryKey(productID);
            ProductWarehouseStorageBackExample storageBackExample=new ProductWarehouseStorageBackExample();
            storageBackExample.createCriteria().andProductidEqualTo(productID).andMonthEqualTo(month).andDayEqualTo(day);
            List<ProductWarehouseStorageBack> backs=productWarehouseStorageBackMapper.selectByExample(storageBackExample);
            if(backs==null||backs.size()==0){
                ProductWarehouseStorageBack productWarehouseStorageBack=new ProductWarehouseStorageBack();
                productWarehouseStorageBack.setProductid(productID);
                productWarehouseStorageBack.setWarehouseid(product.getWarehouseid());
                productWarehouseStorageBack.setWarehousename(product.getWarehousename());
                productWarehouseStorageBack.setCost(product.getCost());
                productWarehouseStorageBack.setDay(day);
                productWarehouseStorageBack.setMonth(month);
                productWarehouseStorageBack.setSkucode(product.getSkucode());
                productWarehouseStorageBack.setOncnwarehouse(warehouseStorage.getOncnwarehouse());
                productWarehouseStorageBack.setOnpurchase(warehouseStorage.getOnpurchase());
                productWarehouseStorageBack.setOnsell(warehouseStorage.getOnsell());
                productWarehouseStorageBack.setOnway(warehouseStorage.getOnway());
                productWarehouseStorageBackMapper.insertSelective(productWarehouseStorageBack);
            }else {
                ProductWarehouseStorageBack productWarehouseStorageBack=backs.get(0);
                productWarehouseStorageBack.setOncnwarehouse(warehouseStorage.getOncnwarehouse());
                productWarehouseStorageBack.setOnpurchase(warehouseStorage.getOnpurchase());
                productWarehouseStorageBack.setOnsell(warehouseStorage.getOnsell());
                productWarehouseStorageBack.setOnway(warehouseStorage.getOnway());
                productWarehouseStorageBackMapper.updateByExampleSelective(productWarehouseStorageBack,storageBackExample);
            }
        }*/
        /*ProductWarehouseStorageBackExample backExample = new ProductWarehouseStorageBackExample();
        backExample.createCriteria().andBackidIsNotNull().andDayEqualTo(day).andMonthEqualTo(month);
        List<ProductWarehouseStorageBack> backs = productWarehouseStorageBackMapper.selectByExample(backExample);
        for (ProductWarehouseStorageBack back : backs) {
            Integer backID = back.getBackid();
            Integer onpurchase = back.getOnpurchase();
            Integer onCnWarehouse = back.getOncnwarehouse();
            Integer onWay = back.getOnway();
            Integer onsell = back.getOnsell();
            Integer productID = back.getProductid();
            List<Map<String, Object>> purchaseLists = new ArrayList<>();
            if (onpurchase > 0) {
                PurchaseSkuExample skuExample = new PurchaseSkuExample();
                skuExample.createCriteria().andProductidEqualTo(productID);
                List<PurchaseSku> skus = purchaseSkuMapper.selectByExample(skuExample);
                for (PurchaseSku sku : skus) {
                    if ((sku.getStockinquantity() + sku.getDefectivequantity()) < sku.getPurchasequantity()) {
                        Integer purchaseID = sku.getPurchaseid();
                        int quantity = sku.getPurchasequantity() - sku.getStockinquantity() - sku.getDefectivequantity();
                        double price = sku.getUnitprice().doubleValue();
                        Purchase purchase = purchaseMapper.selectByPrimaryKey(purchaseID);
                        Map<String, Object> map = new HashMap<>();
                        map.put("purchaseNum", purchase.getPurchasenum());
                        map.put("sku", sku.getSku());
                        map.put("quantity", quantity);
                        map.put("price", price);
                        map.put("amount", price * quantity);
                        purchaseLists.add(map);
                    }
                }

            }
            List<Map<String, Object>> cnLists = new ArrayList<>();
            if (onCnWarehouse > 0) {
                WarehouseInWarrantSkuExample inWarrantSkuExample = new WarehouseInWarrantSkuExample();
                inWarrantSkuExample.createCriteria().andProductidEqualTo(productID);
                List<WarehouseInWarrantSku> inWarrantSkus = warehouseInWarrantSkuMapper.selectByExample(inWarrantSkuExample);
                for (WarehouseInWarrantSku warehouseInWarrantSku : inWarrantSkus) {
                    Integer outCount = warehouseInWarrantSku.getOutcount();
                    Integer inCount = warehouseInWarrantSku.getIncount();
                    if (outCount < inCount) {
                        int count = inCount - outCount;
                        double price = warehouseInWarrantSku.getUnitprice().doubleValue();
                        Map<String, Object> map = new HashMap<>();
                        map.put("inNum", warehouseInWarrantSku.getInnum());
                        map.put("sku", warehouseInWarrantSku.getSkucode());
                        map.put("quantity", count);
                        map.put("price", price);
                        map.put("amount", price * count);
                        cnLists.add(map);
                    }
                }

            }
            List<Map<String, Object>> onWayLists = new ArrayList<>();
            if (onWay > 0) {
                WarehouseOutWarrantSkuExample skuExample = new WarehouseOutWarrantSkuExample();
                skuExample.createCriteria().andProductidEqualTo(productID);
                List<WarehouseOutWarrantSku> skus = warehouseOutWarrantSkuMapper.selectByExample(skuExample);
                for (WarehouseOutWarrantSku sku : skus) {
                    Integer outID = sku.getOutid();
                    WarehouseOutWarrant warehouseOutWarrant = warehouseOutWarrantMapper.selectByPrimaryKey(outID);
                    Integer arriveStatus = warehouseOutWarrant.getArrivestatus();
                    WarehouseInWarrantSku warehouseInWarrantSku = warehouseInWarrantSkuMapper.selectByPrimaryKey(sku.getInskuid());
                    if (arriveStatus < 3) {
                        double price = warehouseInWarrantSku.getUnitprice().doubleValue();
                        int count = sku.getOutcount();
                        Map<String, Object> map = new HashMap<>();
                        map.put("outNum", warehouseOutWarrant.getOutnum());
                        map.put("sku", sku.getSkucode());
                        map.put("quantity", count);
                        map.put("price", price);
                        map.put("amount", price * count);
                        onWayLists.add(map);
                    }
                }
            }
            List<Map<String, Object>> onSellLists = new ArrayList<>();
            if (onsell > 0) {
                AlloOutSkuExample alloOutSkuExample = new AlloOutSkuExample();
                alloOutSkuExample.createCriteria().andProductidEqualTo(productID);
                List<AlloOutSku> skus = alloOutSkuMapper.selectByExample(alloOutSkuExample);
                for (AlloOutSku sku : skus) {
                    Integer alloid = sku.getAlloid();
                    AlloOut alloOut = alloOutMapper.selectByPrimaryKey(alloid);
                    Integer status = alloOut.getStatus();
                    if (status == 3) {
                        Integer useCount = sku.getUsecount();
                        Integer inCount = sku.getIncount();
                        if (useCount < inCount) {
                            int temp = inCount - useCount;
                            Map<String, Object> map = new HashMap<>();
                            map.put("alloNum", alloOut.getAllonum());
                            map.put("sku", sku.getSkucode());
                            map.put("quantity", inCount - useCount);
                            map.put("price", sku.getPrice());
                            if(sku.getPrice()==null){
                                map.put("amount", 0);
                            }else {
                                map.put("amount", sku.getPrice().doubleValue() * temp);
                            }
                            onSellLists.add(map);
                        }
                    }
                }
            }

            ProductWarehouseStorageBackInfo info = infoMapper.selectByPrimaryKey(backID);
            if(info==null){
                info=new ProductWarehouseStorageBackInfo();
                info.setBackid(backID);
                info.setCnwarehousestr(JSON.toJSONString(cnLists));
                info.setPurchasestr(JSON.toJSONString(purchaseLists));
                info.setOnwaystr(JSON.toJSONString(onWayLists));
                info.setOnwarehousestr(JSON.toJSONString(onSellLists));
                infoMapper.insertSelective(info);
            }else {
                info.setCnwarehousestr(JSON.toJSONString(cnLists));
                info.setPurchasestr(JSON.toJSONString(purchaseLists));
                info.setOnwaystr(JSON.toJSONString(onWayLists));
                info.setOnwarehousestr(JSON.toJSONString(onSellLists));
                infoMapper.updateByPrimaryKeySelective(info);
            }
        }*/
    /*   PurchaseExample example=new PurchaseExample();
       example.createCriteria().andCnwarehouseoutstatusEqualTo((byte)2);
       List<Purchase> purchases=purchaseMapper.selectByExample(example);
       for (Purchase purchase:purchases){
           Integer purchaseID=purchase.getPurchaseid();
           PurchaseSkuExample purchaseSkuExample=new PurchaseSkuExample();
           purchaseSkuExample.createCriteria().andPurchaseidEqualTo(purchaseID);
           List<PurchaseSku> purchaseSkus=purchaseSkuMapper.selectByExample(purchaseSkuExample);
           boolean outflag=true;
           for (PurchaseSku purchaseSku:purchaseSkus){
               if (purchaseSku.getUsequantity()!=0){
                   outflag=false;
               }
           }
           if(outflag){
               purchase.setCnwarehouseoutstatus((byte)1);
           }
           purchaseMapper.updateByPrimaryKeySelective(purchase);
       }*/
 /*       dataService.generateWinitOrder();
        dataService.generateGoodOrder();
        birdService.generateBirdInOrderSku();*/
        //dataService.updateBasicData();
        //orderService.synOrderData();
        //trackService.updateTrack();
        //warnInfoService.updateWarnInfo();
       /* dataService.generateWinitOrder();
        dataService.generateGoodOrder();
        birdService.generateBirdInOrderSku();*/
       //orderService.createEcRelationInAndOut("2020-10-01 00:00:00","2020-11-01 00:00:00");
//orderService.createRelationInAndOut("2020-06-27","2020-07-01");
// orderService.circleAmount("2020-06-27","2020-07-01");
        /*  dataService.updateBasicData();*/
       /* dataService.generateWinitOrder();
        dataService.generateGoodOrder();
        birdService.generateBirdInOrderSku();*/
       /* DateTime dateTime=new DateTime();
        DateTime dateTime1=dateTime.minusDays(3);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String start = formatter.format(dateTime1.toDate());
        String end = formatter.format(dateTime.toDate());
        orderService.createRelationInAndOut(start,end);
        orderService.circleAmount(start,end);*/
       /* ProductWarehouseStorageExample example=new ProductWarehouseStorageExample();
        example.createCriteria().andProductidIsNotNull();
        List<ProductWarehouseStorage> storages=productWarehouseStorageMapper.selectByExample(example);
        for (ProductWarehouseStorage storage:storages){
            storage.setOnselllocal(storage.getOnsell());
            productWarehouseStorageMapper.updateByPrimaryKeySelective(storage);
        }*/
      /*  dataService.generateWinitOrder();
        dataService.generateGoodOrder();
        birdService.generateBirdInOrderSku();*/
/*    PurchaseExample example=new PurchaseExample();
    example.createCriteria().andCnwarehouseinstatusLessThan((byte) 3);
    List<Purchase> purchases=purchaseMapper.selectByExample(example);
    for (Purchase purchase:purchases){
        Integer defectivetotalquantity=purchase.getDefectivetotalquantity();
        Integer stockintotalquantity=purchase.getStockintotalquantity();
        if (stockintotalquantity+defectivetotalquantity==purchase.getPurchasetotalquantity()){
            purchase.setCnwarehouseinstatus((byte)3);
            purchaseMapper.updateByPrimaryKeySelective(purchase);
        }

    }*/
        List<ProductNewYear> newYears=warnInfoService.calcNewYearProductStorage();
        Workbook workbook = ExcelExportUtil.exportExcel(new ExportParams(null, "春节补货", ExcelType.XSSF),ProductNewYear.class, newYears);
        OutputStream out = null;
        try {
            String fileName = "春节补货";
            out = new FileOutputStream("D:/junfan/" + fileName + ".xls");
            workbook.write(out);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    /*  WarehouseOutWarrantExample outWarrantExample=new WarehouseOutWarrantExample();
      outWarrantExample.createCriteria().andOutnumEqualTo("out6000001267445074");
      List<WarehouseOutWarrant> warehouseOutWarrants=warehouseOutWarrantMapper.selectByExample(outWarrantExample);
      for (WarehouseOutWarrant warehouseOutWarrant:warehouseOutWarrants){
          Integer outID=warehouseOutWarrant.getOutid();
          WarehouseOutWarrantSkuExample skuExample=new WarehouseOutWarrantSkuExample();
          skuExample.createCriteria().andOutidEqualTo(outID);
          List<WarehouseOutWarrantSku> skus=warehouseOutWarrantSkuMapper.selectByExample(skuExample);
          for (WarehouseOutWarrantSku outWarrantSku:skus){
              Integer insku=outWarrantSku.getInskuid();
              Integer productID=outWarrantSku.getProductid();
              Integer outcount=outWarrantSku.getOutcount();
              WarehouseInWarrantSku warehouseInWarrantSku=warehouseInWarrantSkuMapper.selectByPrimaryKey(insku);
              Integer oldCount=warehouseInWarrantSku.getOutcount();
              Integer temp=oldCount-outcount;
              ProductWarehouseStorage productWarehouseStorage=productWarehouseStorageMapper.selectByPrimaryKey(productID);
              Integer onWay=productWarehouseStorage.getOnway();
              Integer oncnwarehouse=productWarehouseStorage.getOncnwarehouse();
              productWarehouseStorage.setOnway(onWay-outcount);
              productWarehouseStorage.setOncnwarehouse(oncnwarehouse+outcount);
              productWarehouseStorageMapper.updateByPrimaryKeySelective(productWarehouseStorage);
              Integer inid=warehouseInWarrantSku.getInid();
              warehouseInWarrantSku.setOutcount(temp);
              WarehouseInWarrant warehouseInWarrant=warehouseInWarrantMapper.selectByPrimaryKey(inid);
              warehouseInWarrant.setStatus(3);
              warehouseInWarrantMapper.updateByPrimaryKeySelective(warehouseInWarrant);
              if (temp>0){
                  warehouseInWarrantSku.setStatus((byte)2);
              }else {
                  warehouseInWarrantSku.setStatus((byte)1);
              }
              warehouseInWarrantSkuMapper.updateByPrimaryKeySelective(warehouseInWarrantSku);
              Integer purchaseskuid=warehouseInWarrantSku.getPurchaseskuid();
              PurchaseSku purchaseSku=purchaseSkuMapper.selectByPrimaryKey(purchaseskuid);
              Integer usequantity=purchaseSku.getUsequantity();
              int temp2=usequantity-outcount;
              purchaseSku.setUsequantity(temp2);
              purchaseSkuMapper.updateByPrimaryKeySelective(purchaseSku);
              Integer purchaseid=purchaseSku.getPurchaseid();
              Purchase purchase=purchaseMapper.selectByPrimaryKey(purchaseid);
              if (temp2>0) {
                  purchase.setCnwarehouseoutstatus((byte)2);
              }else {
                  purchase.setCnwarehouseoutstatus((byte)1);
              }
              purchaseMapper.updateByPrimaryKeySelective(purchase);

          }
          warehouseOutWarrantSkuMapper.deleteByExample(skuExample);
          warehouseOutWarrantMapper.deleteByPrimaryKey(warehouseOutWarrant.getOutid());

      }*/
    //orderService.circleEcAmount("2020-10-10 00:00:00","2020-11-01 00:00:00");
    // dataService.generateGoodOrder();
      /*  Date date=new Date();
        TodolistExample todolistExample1=new TodolistExample();
        todolistExample1.createCriteria().andTitleLike("国内仓出库单%");
        todolistMapper.deleteByExample(todolistExample1);
        //检查采购超时的采购单
        SysUserExample example=new SysUserExample();
        example.createCriteria().andRoleIdEqualTo(3);
        List<SysUser> purchaseRoles=sysUserMapper.selectByExample(example);
        SysUserExample example2=new SysUserExample();
        example2.createCriteria().andRoleIdEqualTo(1);
        List<SysUser> adminRoles=sysUserMapper.selectByExample(example2);
        //检查海外仓已入库的单子
        List<WarehouseOutWarrant> warehouseOutWarrants=warehouseOutService.checkWarehouseOut();
        for (WarehouseOutWarrant warehouseOutWarrant:warehouseOutWarrants){
            String purchaseNum=warehouseOutWarrant.getOutnum();
            String title="国内仓出库单："+purchaseNum+" 已到海外，请及时入库";
            TodolistExample example1=new TodolistExample();
            example1.createCriteria().andTitleEqualTo(title);
            List<Todolist> todolists=todolistMapper.selectByExample(example1);
            if (todolists!=null&&todolists.size()>0){
                continue;
            }
            for (SysUser sysUser:adminRoles){

                Todolist todolist=new Todolist();
                todolist.setTitle(title);
                todolist.setStatus(0);
                todolist.setCreatetime(date);
                todolist.setUserid(sysUser.getId());
                todolistMapper.insertSelective(todolist);
            }
            for (SysUser sysUser:purchaseRoles){
                Todolist todolist=new Todolist();
                todolist.setTitle(title);
                todolist.setStatus(0);
                todolist.setCreatetime(date);
                todolist.setUserid(sysUser.getId());
                todolistMapper.insertSelective(todolist);
            }
        }*/
        // dataService.generateWinitOrder();

        //   orderService.createRelationInAndOut();
        //dataService.generateGoodOrder();
        //dataService.updateBasicData();
        //  orderService.circleAmount("2020-03-01","2020-04-01");
        // dataService.generateWinitOrder();
        // dataService.synStorageData();
/*        DateTime dateTime=new DateTime();
        int month=dateTime.getMonthOfYear();
        int day=1;
        ProductWarehouseStorageExample example=new ProductWarehouseStorageExample();
        example.createCriteria().andProductidIsNotNull();
        List<ProductWarehouseStorage> warehouseStorages=productWarehouseStorageMapper.selectByExample(example);
        for (ProductWarehouseStorage warehouseStorage:warehouseStorages){
            Integer productID=warehouseStorage.getProductid();
            Product product=productMapper.selectByPrimaryKey(productID);
            ProductWarehouseStorageBackExample storageBackExample=new ProductWarehouseStorageBackExample();
            storageBackExample.createCriteria().andProductidEqualTo(productID).andMonthEqualTo(month).andDayEqualTo(day);
            List<ProductWarehouseStorageBack> backs=productWarehouseStorageBackMapper.selectByExample(storageBackExample);
            if(backs==null||backs.size()==0){
                ProductWarehouseStorageBack productWarehouseStorageBack=new ProductWarehouseStorageBack();
                productWarehouseStorageBack.setProductid(productID);
                productWarehouseStorageBack.setWarehouseid(product.getWarehouseid());
                productWarehouseStorageBack.setWarehousename(product.getWarehousename());
                productWarehouseStorageBack.setCost(product.getCost());
                productWarehouseStorageBack.setDay(day);
                productWarehouseStorageBack.setMonth(month);
                productWarehouseStorageBack.setSkucode(product.getSkucode());
                productWarehouseStorageBack.setOncnwarehouse(warehouseStorage.getOncnwarehouse());
                productWarehouseStorageBack.setOnpurchase(warehouseStorage.getOnpurchase());
                productWarehouseStorageBack.setOnsell(warehouseStorage.getOnsell());
                productWarehouseStorageBack.setOnway(warehouseStorage.getOnway());
                productWarehouseStorageBackMapper.insertSelective(productWarehouseStorageBack);
            }else {
                ProductWarehouseStorageBack productWarehouseStorageBack=backs.get(0);
                productWarehouseStorageBack.setOncnwarehouse(warehouseStorage.getOncnwarehouse());
                productWarehouseStorageBack.setOnpurchase(warehouseStorage.getOnpurchase());
                productWarehouseStorageBack.setOnsell(warehouseStorage.getOnsell());
                productWarehouseStorageBack.setOnway(warehouseStorage.getOnway());
                productWarehouseStorageBackMapper.updateByExampleSelective(productWarehouseStorageBack,storageBackExample);
            }
        }*/
        // dataService.generateGoodOrder();
/*
    WarehouseOutWarrantExample warehouseOutWarrantExample=new WarehouseOutWarrantExample();
    warehouseOutWarrantExample.createCriteria().andOutidIsNotNull();
    List<WarehouseOutWarrant> warehouseOutWarrants=warehouseOutWarrantMapper.selectByExample(warehouseOutWarrantExample);
    for (WarehouseOutWarrant warehouseOutWarrant:warehouseOutWarrants){
        Integer outId=warehouseOutWarrant.getOutid();
        WarehouseOutWarrantSkuExample skuExample=new WarehouseOutWarrantSkuExample();
        skuExample.createCriteria().andOutidEqualTo(outId);
        List<WarehouseOutWarrantSku> warehouseOutWarrantSkus=warehouseOutWarrantSkuMapper.selectByExample(skuExample);
        warehouseOutWarrant.setSkus(warehouseOutWarrantSkus);
    }
        Workbook workbook = ExcelExportUtil.exportExcel(new ExportParams(null, "利润报表", ExcelType.XSSF),WarehouseOutWarrant.class, warehouseOutWarrants);
        OutputStream out = null;
        try {
            String fileName = "四月利润";
            out = new FileOutputStream("D:/junfan/" + fileName + ".xls");
            workbook.write(out);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
*/

  /*      WarehouseInWarrantSkuExample warehouseInWarrantSkuExample=new WarehouseInWarrantSkuExample();
        warehouseInWarrantSkuExample.createCriteria().andUnitpriceEqualTo(BigDecimal.valueOf(0.0));
        List<WarehouseInWarrantSku> warehouseInWarrantSkus=warehouseInWarrantSkuMapper.selectByExample(warehouseInWarrantSkuExample);
        for (WarehouseInWarrantSku warehouseInWarrantSku:warehouseInWarrantSkus){
            Integer purchaseID=warehouseInWarrantSku.getPurchaseskuid();
            if (purchaseID!=null){
                PurchaseSku purchaseSku=purchaseSkuMapper.selectByPrimaryKey(purchaseID);
                Integer id=purchaseSku.getPurchaseid();
                Purchase purchase=purchaseMapper.selectByPrimaryKey(id);
                Double freighttotalamount=purchase.getFreighttotalamount().doubleValue();
                Integer quantity=purchase.getPurchasetotalquantity();
                warehouseInWarrantSku.setUnitprice(purchaseSku.getUnitprice());
                warehouseInWarrantSku.setFare(BigDecimal.valueOf(freighttotalamount/quantity));
                warehouseInWarrantSkuMapper.updateByPrimaryKeySelective(warehouseInWarrantSku);
            }else {
                Integer productID=warehouseInWarrantSku.getProductid();
                Product product=productMapper.selectByPrimaryKey(productID);
                double price=product.getCost();
                warehouseInWarrantSku.setUnitprice(new BigDecimal(price));
                warehouseInWarrantSkuMapper.updateByPrimaryKeySelective(warehouseInWarrantSku);
            }
        }*/


/*    AlloOutExample example=new AlloOutExample();
    example.createCriteria().andAlloidIsNotNull();
    List<AlloOut> alloOuts=alloOutMapper.selectByExample(example);
    for (AlloOut alloOut:alloOuts){
        Integer outID=alloOut.getOutid();
        Integer alloid=alloOut.getAlloid();
        AlloOutSkuExample skuExample=new AlloOutSkuExample();
        skuExample.createCriteria().andAlloidEqualTo(alloid);
        List<AlloOutSku> alloOutSkus=alloOutSkuMapper.selectByExample(skuExample);
        for (AlloOutSku alloOutSku:alloOutSkus){
            Integer productID=alloOutSku.getProductid();
            WarehouseOutWarrantSkuExample outWarrantSkuExample=new WarehouseOutWarrantSkuExample();
            outWarrantSkuExample.createCriteria().andOutidEqualTo(outID).andProductidEqualTo(productID);
            List<WarehouseOutWarrantSku> warehouseOutWarrantSkus=warehouseOutWarrantSkuMapper.selectByExample(outWarrantSkuExample);
            double price=0.0;
            int amount=0;
            for (WarehouseOutWarrantSku warehouseOutWarrantSku:warehouseOutWarrantSkus){
                Integer inSkuID=warehouseOutWarrantSku.getInskuid();
                WarehouseInWarrantSku warehouseInWarrantSku=warehouseInWarrantSkuMapper.selectByPrimaryKey(inSkuID);
                double unitprice=warehouseInWarrantSku.getUnitprice().doubleValue();
                int outcount=warehouseOutWarrantSku.getOutcount();
                price+=unitprice*outcount;
                amount+=outcount;
            }
            if (price==0||amount==0){
                throw  new RuntimeException();
            }
            double unitprice=price/amount;
            BigDecimal bigDecimal=new BigDecimal(unitprice);
            bigDecimal = bigDecimal.setScale(2, RoundingMode.HALF_UP);
            alloOutSku.setPrice(bigDecimal);
            alloOutSkuMapper.updateByPrimaryKeySelective(alloOutSku);
        }

    }*/
/*   AlloOutExample alloOutExample=new AlloOutExample();
   alloOutExample.createCriteria().andWarehouseorderIsNull();
   List<AlloOut> alloOuts=alloOutMapper.selectByExample(alloOutExample);
   for (AlloOut alloOut:alloOuts){
       Integer outId=alloOut.getOutid();
       WarehouseOutWarrant warehouseOutWarrant=warehouseOutWarrantMapper.selectByPrimaryKey(outId);
       if (warehouseOutWarrant!=null) {
           String warehouseorder = warehouseOutWarrant.getWarehouseorder();
           alloOut.setWarehouseorder(warehouseorder);
           alloOutMapper.updateByPrimaryKeySelective(alloOut);
       }
   }*/

        //orderService.synOrderData();

        //birdService.generateBirdInOrderSku();
    /*  WarehouseInWarrantExample example=new WarehouseInWarrantExample();
      example.createCriteria().andCreatetimeGreaterThan(new DateTime("2020-02-25").toDate());
      List<WarehouseInWarrant> warehouseInWarrants=warehouseInWarrantMapper.selectByExample(example);
      for (WarehouseInWarrant warehouseInWarrant:warehouseInWarrants){
          Integer inID=warehouseInWarrant.getInid();
          WarehouseInWarrantSkuExample example1=new WarehouseInWarrantSkuExample();
          example1.createCriteria().andInidEqualTo(inID);
          List<WarehouseInWarrantSku> warehouseInWarrantSkus=warehouseInWarrantSkuMapper.selectByExample(example1);
          String type=null;
          for (WarehouseInWarrantSku warehouseInWarrantSku:warehouseInWarrantSkus){
              Integer productID=warehouseInWarrantSku.getProductid();
              Product product=productMapper.selectByPrimaryKey(productID);
              type=product.getHeadwaytype();
          }
          warehouseInWarrant.setHeadwaytype(type);
          warehouseInWarrantMapper.updateByPrimaryKeySelective(warehouseInWarrant);
      }*/
        //warnInfoService.updateWarnInfo();
        //orderService.synOrderData();
        //dataService.generateGoodOrder();
        //dataService.generateWinitOrder();
        //dataService.checkOutData();
        //orderService.createRelationInAndOut("2020-05-01","2020-06-02");
        //orderService.synOrderData();
      /*  orderService.circleAmount("2020-05-28","2020-06-01");
        List<EbayOrderProfit>ebayOrderProfits=orderService.exportOrder("2020-05-01","2020-06-01");*/
      /*  for (EbayOrderProfit ebayOrderProfit:ebayOrderProfits){
            String orderID=ebayOrderProfit.getOrderid();
            EbayOrderSkuExample ebayOrderSkuExample=new EbayOrderSkuExample();
            ebayOrderSkuExample.createCriteria().andOrderidEqualTo(orderID);
            List<EbayOrderSku> orderSkus=ebayOrderSkuMapper.selectByExample(ebayOrderSkuExample);
            for (EbayOrderSku ebayOrderSku:orderSkus){
                Long packageid=ebayOrderSku.getPackageid();
                EbayWarehouseoutSkuExample ebayWarehouseoutSkuExample=new EbayWarehouseoutSkuExample();
                ebayWarehouseoutSkuExample.createCriteria().andPackageidEqualTo(packageid);
                List<EbayWarehouseoutSku> ebayWarehouseoutSkus=ebayWarehouseoutSkuMapper.selectByExample(ebayWarehouseoutSkuExample);
                EbayWarehouseoutSku ebayWarehouseoutSku=ebayWarehouseoutSkus.get(0);
                WarehouseOutWarrantSku warehouseOutWarrantSku=warehouseOutWarrantSkuMapper.selectByPrimaryKey(ebayWarehouseoutSku.getWowsid());
                Integer outID=warehouseOutWarrantSku.getOutid();
                WarehouseOutWarrant warehouseOutWarrant=warehouseOutWarrantMapper.selectByPrimaryKey(outID);
                ebayOrderSku.setWarehouseCode(warehouseOutWarrant.getWarehouseorder());
            }
            ebayOrderProfit.setSkus(orderSkus);
        }
*/
       /* List<DatacaciquesOrderPackageRelation> relations=datacaciquesOrderPackageRelationMapper.getAllRelation();
        for (DatacaciquesOrderPackageRelation relation:relations){
            Long packageID=relation.getPackageid();
            DatacaciquesOrderPackageRelationExample relationExample=new DatacaciquesOrderPackageRelationExample();
            relationExample.createCriteria().andPackageidEqualTo(packageID);
            List<DatacaciquesOrderPackageRelation> relationList=datacaciquesOrderPackageRelationMapper.selectByExample(relationExample);
            Set<Long> packages=new HashSet<>();
            for (DatacaciquesOrderPackageRelation relation1:relationList){
                packages.add(relation1.getSysorderid());
            }
            if (packages.size()!=relationList.size()){
                continue;
            }
            for (DatacaciquesOrderPackageRelation relation1:relationList){
               Long orderID=relation1.getSysorderid();
               DatacaciquesOrder datacaciquesOrder=datacaciquesOrderMapper.selectByPrimaryKey(orderID);
               datacaciquesOrder.setIscircled(1);
               datacaciquesOrderMapper.updateByPrimaryKeySelective(datacaciquesOrder);
            }
        }*/
        //dataService.generateWinitOrder();
        // dataService.generateGoodOrder();
        //birdService.generateBirdInOrderSku();
        //   warnInfoService.updateWarnInfo();
        //orderService.createRelationInAndOut("2019-04-01","2020-06-01");
        //  orderService.circleAmount("2019-04-01","2020-04-01");
        // dataService.generateGoodOrder();
        //dataService.checkOutData();
        //orderService.synOrderData();
        // dataService.generateGoodOrder();
        //birdService.generateBirdInOrderSku();
        // orderService.createRelationInAndOut("2020-04-01","2020-05-01");
     /*   Workbook workbook = ExcelExportUtil.exportExcel(new ExportParams(null, "利润报表", ExcelType.XSSF),EbayOrderProfit.class, ebayOrderProfits);
        OutputStream out = null;
        try {
            String fileName = "五月利润";
            out = new FileOutputStream("D:/junfan/" + fileName + ".xls");
            workbook.write(out);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }*/
    /*    EbayWarehouseoutSkuExample ebayWarehouseoutSkuExample=new EbayWarehouseoutSkuExample();
        ebayWarehouseoutSkuExample.createCriteria().andPriceEqualTo(0.0);
        List<EbayWarehouseoutSku> ebayWarehouseoutSkus=ebayWarehouseoutSkuMapper.selectByExample(ebayWarehouseoutSkuExample);
        for (EbayWarehouseoutSku ebayWarehouseoutSku:ebayWarehouseoutSkus){
            Integer wowsID=ebayWarehouseoutSku.getWowsid();
            WarehouseOutWarrantSku warehouseOutWarrantSku=warehouseOutWarrantSkuMapper.selectByPrimaryKey(wowsID);
            Integer inskuID=warehouseOutWarrantSku.getInskuid();
            WarehouseInWarrantSku warehouseInWarrantSku=warehouseInWarrantSkuMapper.selectByPrimaryKey(inskuID);
            ebayWarehouseoutSku.setPrice(warehouseInWarrantSku.getUnitprice().doubleValue());
            ebayWarehouseoutSku.setFare(warehouseInWarrantSku.getFare().doubleValue());
            ebayWarehouseoutSkuMapper.updateByPrimaryKeySelective(ebayWarehouseoutSku);
        }*/
/*        WarehouseInWarrantSkuExample warehouseInWarrantSkuExample=new WarehouseInWarrantSkuExample();
        warehouseInWarrantSkuExample.createCriteria().andUnitpriceEqualTo(BigDecimal.valueOf(0.0));
        List<WarehouseInWarrantSku> warehouseInWarrantSkus=warehouseInWarrantSkuMapper.selectByExample(warehouseInWarrantSkuExample);
        for (WarehouseInWarrantSku warehouseInWarrantSku:warehouseInWarrantSkus){
            Integer purchaseID=warehouseInWarrantSku.getPurchaseskuid();
            if (purchaseID!=null){
                PurchaseSku purchaseSku=purchaseSkuMapper.selectByPrimaryKey(purchaseID);
                Integer id=purchaseSku.getPurchaseid();
                Purchase purchase=purchaseMapper.selectByPrimaryKey(id);
                Double freighttotalamount=purchase.getFreighttotalamount().doubleValue();
                if (freighttotalamount<0){
                    freighttotalamount=0.0;
                }
                Integer quantity=purchase.getPurchasetotalquantity();
                warehouseInWarrantSku.setUnitprice(purchaseSku.getUnitprice());
                warehouseInWarrantSku.setFare(BigDecimal.valueOf(freighttotalamount/quantity));
                warehouseInWarrantSkuMapper.updateByPrimaryKeySelective(warehouseInWarrantSku);
            }
        }*/
        //warnInfoService.updateWarnInfo();
      //  dataService.generateWinitOrder();

        //orderService.createRelationInAndOut();
       //  orderService.circleAmount("2020-09-01","2020-10-01");
//     warnInfoService.updateWarnInfo();
/*        AlloOutExample example=new AlloOutExample();
        example.createCriteria().andStatusEqualTo(3).andAllweightEqualTo(0.0).andTypeEqualTo("中仓到货").andWarehousenameNotEqualTo("亚马逊美国");
        List<AlloOut> alloOuts=alloOutMapper.selectByExample(example);
        for (AlloOut alloOut:alloOuts){
            Integer alloid=alloOut.getAlloid();
            AlloOutSkuExample alloOutSkuExample=new AlloOutSkuExample();
            alloOutSkuExample.createCriteria().andAlloidEqualTo(alloid);
            List<AlloOutSku> alloOutSkus=alloOutSkuMapper.selectByExample(alloOutSkuExample);
            Double allweight=0.0;
            Double allVolume=0.0;
            Integer skuamount=0;
            for (AlloOutSku alloOutSku:alloOutSkus){
                Integer productID=alloOutSku.getProductid();
                Product product=productMapper.selectByPrimaryKey(productID);
                Double weight=product.getRegisteredweight()/1000;
                Double length=product.getRegisteredlength();
                Double width=product.getRegisteredwidth();
                Double height=product.getRegisteredheight();
                Double volume=length*width*height;
                Integer count=alloOutSku.getIncount();
                allweight+=weight*count;
                skuamount+=count;
                allVolume+=volume*count;
            }
            alloOut.setSkuquantity(skuamount);
            alloOut.setAllweight(allweight);
            alloOut.setAllvolume(allVolume);
            alloOutMapper.updateByPrimaryKeySelective(alloOut);
        }*/

           /* List<FinancePayment> financePayments=financeService.listPayment(null,null,null,null,3);
        Workbook workbook = ExcelExportUtil.exportExcel(new ExportParams("已付款", "付款单"), FinancePayment.class, financePayments);
        OutputStream out = null;
        try {
            String fileName = "付款单";
            out = new FileOutputStream("D:/junfan/" + fileName + ".xls");
            workbook.write(out);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }*/
        /*FinancePaymentExample example=new FinancePaymentExample();
        example.createCriteria().andPurchaseidIsNotNull();
        List<FinancePayment> financePayments=financePaymentMapper.selectByExample(example);
        for (FinancePayment financePayment:financePayments){
            Integer purchaseID=financePayment.getPurchaseid();
            Purchase purchase=purchaseMapper.selectByPrimaryKey(purchaseID);
            if (purchase==null){
                financePaymentMapper.deleteByPrimaryKey(financePayment.getPaymentid());
            }
        }*/
        //orderService.createRelationInAndOut();
       /* DateTime dateTime=new DateTime();
        DateTime dateTime1=dateTime.minusDays(3);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String start = formatter.format(dateTime1.toDate());
        String end = formatter.format(dateTime.toDate());
        orderService.createRelationInAndOut(start,end);
        orderService.circleAmount(start,end);*/
        //orderService.circleAmount("2020-05-26","2020-05-27");
        //orderService.synOrderData();
        // orderService.circleAmount("2020-09-01","2020-10-01");
     /*dataService.generateWinitOrder();
     dataService.generateGoodOrder();*/
        //dataService.generateWinitOrder();
        // dataService.generateGoodOrder();
      /*  Integer purchaseamount=financeService.getTodayAmount();
        Map<String,String> map=orderService.getTodayAmount();
        String orders=map.get("orders");
        String orderamount=map.get("orderamount");
        stringRedisTemplate.opsForValue().set("purchaseamount", String.valueOf(purchaseamount));
        stringRedisTemplate.opsForValue().set("orders",orders);
        stringRedisTemplate.opsForValue().set("orderamount",orderamount);*/
        // orderService.synOrderData();
     /*  ProductExample productExample=new ProductExample();
       productExample.createCriteria().andProductidIsNotNull();
       List<Product> products=productMapper.selectByExample(productExample);
       for (Product product:products){
           Integer productId=product.getProductid();
           PurchaseSkuExample purchaseSkuExample=new PurchaseSkuExample();
           purchaseSkuExample.createCriteria().andProductidEqualTo(productId);
           List<PurchaseSku> purchaseSkus=purchaseSkuMapper.selectByExample(purchaseSkuExample);
           if (purchaseSkus!=null&&purchaseSkus.size()>=2){
               product.setIsnew("N");
           }else {
               product.setIsnew("Y");
           }
           productMapper.updateByPrimaryKeySelective(product);
       }*/
     /*WarehouseInWarrantSkuExample warehouseInWarrantSkuExample=new WarehouseInWarrantSkuExample();
     warehouseInWarrantSkuExample.createCriteria().andPurchaseskuidIsNotNull();
     List<WarehouseInWarrantSku> warehouseInWarrantSkus=warehouseInWarrantSkuMapper.selectByExample(warehouseInWarrantSkuExample);
     for (WarehouseInWarrantSku warehouseInWarrantSku:warehouseInWarrantSkus){
         Integer purchaseskuID=warehouseInWarrantSku.getPurchaseskuid();
         PurchaseSku purchaseSku=purchaseSkuMapper.selectByPrimaryKey(purchaseskuID);
         purchaseSku.setUsequantity(warehouseInWarrantSku.getIncount());
         purchaseSkuMapper.updateByPrimaryKeySelective(purchaseSku);*/

       /* WarehouseInWarrantSkuExample warehouseInWarrantSkuExample=new WarehouseInWarrantSkuExample();
        warehouseInWarrantSkuExample.createCriteria().andStatusLessThan((byte)3);
        List<WarehouseInWarrantSku> warehouseInWarrantSkus=warehouseInWarrantSkuMapper.selectByExample(warehouseInWarrantSkuExample);
        for (WarehouseInWarrantSku warehouseInWarrantSku:warehouseInWarrantSkus){
            Integer productID=warehouseInWarrantSku.getProductid();
            Integer cnWare=warehouseInWarrantSku.getIncount()-warehouseInWarrantSku.getOutcount();
            ProductWarehouseStorage productWarehouseStorage=productWarehouseStorageMapper.selectByPrimaryKey(productID);
            if (productWarehouseStorage==null){
                productWarehouseStorage=new ProductWarehouseStorage();
                Product product=productMapper.selectByPrimaryKey(productID);
                productWarehouseStorage.setProductid(productID);
                productWarehouseStorage.setWarehouseid(product.getWarehouseid());
                productWarehouseStorage.setWarehousename(product.getWarehousename());
                productWarehouseStorage.setSkucode(product.getSkucode());
                productWarehouseStorage.setOnpurchase(0);
                productWarehouseStorage.setOnway(0);
                productWarehouseStorage.setOnsell(0);
                productWarehouseStorage.setOncnwarehouse(cnWare);
                productWarehouseStorageMapper.insertSelective(productWarehouseStorage);
            }else {
                productWarehouseStorage.setOncnwarehouse(cnWare);
                productWarehouseStorageMapper.updateByPrimaryKeySelective(productWarehouseStorage);
            }
        }*/
      // dataService.updateBasicData();
       // orderService.createRelationInAndOut("2020-09-01","2020-10-01");
    }
}