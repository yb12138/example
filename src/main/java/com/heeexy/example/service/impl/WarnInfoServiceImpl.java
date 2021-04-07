package com.heeexy.example.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.dao.*;
import com.heeexy.example.model.*;
import com.heeexy.example.service.ProductSellService;
import com.heeexy.example.service.PurchaseService;
import com.heeexy.example.service.WarehouseOutService;
import com.heeexy.example.service.WarnInfoService;
import com.heeexy.example.util.CommonUtil;
import com.heeexy.example.util.DateUtil;
import com.heeexy.example.util.constants.Constants;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class WarnInfoServiceImpl implements WarnInfoService {
    @Autowired
    WarninfoMapper warninfoMapper;
    @Autowired
    AlgorithmicruleMapper algorithmicruleMapper;
    @Autowired
    ProductMapper productMapper;
    @Autowired
    ProductSellService productSellService;
    @Autowired
    ProductWarehouseStorageMapper productWarehouseStorageMapper;
    @Autowired
    WinitWarehouseStorageMapper winitWarehouseStorageMapper;
    @Autowired
    PurchaseService purchaseService;
    @Autowired
    WarehouseOutService warehouseOutService;
    @Autowired
    WarehouseInWarrantSkuMapper warehouseInWarrantSkuMapper;
    @Autowired
    WarehouseInWarrantMapper warehouseInWarrantMapper;
    @Autowired
    WarehouseOutWarrantMapper warehouseOutWarrantMapper;
    @Autowired
    ProductHolidayMapper productHolidayMapper;

    @Override
    public JSONObject listWarnInfo(Integer pageSize, Integer pageNum, String sku, String cnName, Long warehouseid, Integer status) {
        int start = 0;
        if (pageNum != 0) {
            start = (pageNum - 1) * pageSize;
        }
        List<Warninfo> warninfos = warninfoMapper.queryAllWarnInfo(start, pageSize, sku, cnName, warehouseid, status);
        Integer count = warninfoMapper.getCount(sku, cnName, warehouseid, status);
        JSONObject requestjson = new JSONObject();
        requestjson.put("pageRow", pageNum);
        return CommonUtil.successPage(requestjson, warninfos, count);
    }

    @Override
    public Boolean updateWarn(Warninfo warninfo) {
        warninfoMapper.updateByPrimaryKeySelective(warninfo);
        return true;
    }

    @Override
    public Boolean addOrUpdateWarn(Warninfo warninfo) {
        Integer productID = warninfo.getProductid();
        Warninfo warninfo1 = warninfoMapper.selectByPrimaryKey(productID);
        if (warninfo1 == null) {
            warninfoMapper.insertSelective(warninfo);
        } else {
            updateWarn(warninfo);
        }
        return true;
    }

    @Override
    public JSONObject submit(Integer productID) {
        Warninfo warninfo1 = warninfoMapper.selectByPrimaryKey(productID);
        return null;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public JSONObject verify(Integer productID, String username, Integer userid) {
        Warninfo warninfo1 = warninfoMapper.selectByPrimaryKey(productID);
        warninfo1.setStatus((byte) 3);
        Product product = productMapper.selectByPrimaryKey(productID);
        List<Map<String, Object>> maps = new ArrayList<>();
        Map<String, Object> map = new HashMap<>();
        map.put("productid", productID);
        map.put("cnname", product.getCnname());
        map.put("sku", product.getSkucode());
        map.put("purchasequantity", warninfo1.getActualquantity());
        map.put("unitprice", product.getCost());
        maps.add(map);
        double totalmount = product.getCost() * warninfo1.getActualquantity();
        purchaseService.addPurchase(product.getSupplierid(), product.getWarehouseid(), null, null, warninfo1.getActualquantity(), totalmount, 0.0, null, maps, userid, username);
        warninfoMapper.updateByPrimaryKeySelective(warninfo1);
        return CommonUtil.successJson();
    }

    @Override
    public JSONObject reject(Integer productID) {
        Warninfo warninfo1 = warninfoMapper.selectByPrimaryKey(productID);
        warninfo1.setStatus((byte) 2);
        warninfoMapper.updateByPrimaryKeySelective(warninfo1);
        return CommonUtil.successJson();
    }

    @Override
    public JSONObject delete(Integer productID) {
        warninfoMapper.deleteByPrimaryKey(productID);
        return CommonUtil.successJson();
    }

    @Override
    public JSONObject generateNewWaran(Product product) {
        Long warehouseid = product.getWarehouseid();
        String headway = product.getHeadwaytype();
        AlgorithmicruleExample example = new AlgorithmicruleExample();
        example.createCriteria().andWarehouseidEqualTo(warehouseid);
        List<Algorithmicrule> algorithmicrules = algorithmicruleMapper.selectByExample(example);
        if (algorithmicrules == null || algorithmicrules.size() == 0) {
            return null;
        }
        Algorithmicrule algorithmicrule = algorithmicrules.get(0);
        switch (headway) {
            case "空运":
                valideNewAirWarn(product, algorithmicrule, 1);
                break;
            case "海运":
                valideNewShipWarn(product, algorithmicrule, 1);
                break;
            case "铁路":
                valideNewTrainWarn(product, algorithmicrule, 1);
                break;
        }
        return null;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public JSONObject updateWarnInfo() {
        AlgorithmicruleExample algorithmicruleExample = new AlgorithmicruleExample();
        algorithmicruleExample.createCriteria().andAlidIsNotNull();
        List<Algorithmicrule> algorithmicrules = algorithmicruleMapper.selectByExample(algorithmicruleExample);
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        for (Algorithmicrule algorithmicrule : algorithmicrules) {
            List<Integer> productids = new ArrayList<>();
            Set<Integer> mothers = new HashSet<>();
            Long warehouseId = algorithmicrule.getWarehouseid();
            //找到所有在售的SKU
            List<Product> products = productMapper.queryByWarn(warehouseId);
            for (Product product : products) {
                Integer productId = product.getProductid();
                Warninfo warninfo = warninfoMapper.selectByPrimaryKey(productId);
                if (verifyWarnInfoIsRecent(date, warninfo)) continue;
                String headwayType = product.getHeadwaytype();
                String isNew = product.getIsnew();
                Integer result = null;
                switch (headwayType) {
                    case "海运":
                        if (!isNew.equals("Y")) {
                            result = valideOldShipWarn(product, algorithmicrule, 1);
                        } else {
                            result = valideNewShipWarn(product, algorithmicrule, 1);
                        }
                        break;
                    case "空运":
                        if (!isNew.equals("Y")) {
                            result = valideOldAirWarn(product, algorithmicrule, 1);
                        } else {
                            result = valideNewAirWarn(product, algorithmicrule, 1);
                        }
                        break;
                    case "铁路":
                        if (!isNew.equals("Y")) {
                            result = valideOldTrainWarn(product, algorithmicrule, 1);
                        } else {
                            result = valideNewTrainWarn(product, algorithmicrule, 1);
                        }
                        break;
                }

                if (result!=null&&result == 1) {
                    productids.add(product.getProductid());
                    Integer mid = product.getMid();
                    if (mid != null && mid != 0) {
                        mothers.add(mid);
                    }
                }
            }
            if (mothers.size() == 0) {
                continue;
            }
            //按照母代码提示产品补货
            List<Product> productList = getMotherProducts(productids, mothers, warehouseId);
            for (Product product : productList) {
                Integer productId = product.getProductid();
                Warninfo warninfo = warninfoMapper.selectByPrimaryKey(productId);
                if (verifyWarnInfoIsRecent(date, warninfo)) continue;
                String headwayType = product.getHeadwaytype();
                String isNew = product.getIsnew();
                if (headwayType.equals("海运")) {
                    if (!isNew.equals("Y")) {
                        valideOldShipWarn(product, algorithmicrule, 2);
                    } else {
                        valideNewShipWarn(product, algorithmicrule, 2);
                    }
                } else if (headwayType.equals("空运")) {
                    if (!isNew.equals("Y")) {
                        valideOldAirWarn(product, algorithmicrule, 2);
                    } else {
                        valideNewAirWarn(product, algorithmicrule, 2);
                    }
                } else if (headwayType.equals("铁路")) {
                    if (!isNew.equals("Y")) {
                        valideOldTrainWarn(product, algorithmicrule, 2);
                    } else {
                        valideNewTrainWarn(product, algorithmicrule, 2);
                    }
                }
            }
        }
        WarninfoExample warninfoExample = new WarninfoExample();
        warninfoExample.createCriteria().andProductidIsNotNull();
        List<Warninfo> warninfos = warninfoMapper.selectByExample(warninfoExample);
        for (Warninfo warninfo : warninfos) {
            Product product = productMapper.selectByPrimaryKey(warninfo.getProductid());
            if (!product.getProductlevel().equals("在售")) {
                warninfoMapper.deleteByPrimaryKey(warninfo.getProductid());
            }
        }
        return CommonUtil.successJson();

    }

    private boolean verifyWarnInfoIsRecent(Date date, Warninfo warninfo) {
        if (warninfo != null) {
            Byte status = warninfo.getStatus();
            if (status != 1) {
                Date date1 = warninfo.getUpdatetime();
                int days = (int) ((date.getTime() - date1.getTime()) / (1000 * 3600 * 24));
                if (days < 5) {
                    return true;
                }
            }
        }
        return false;
    }

    private List<Product> getMotherProducts(List<Integer> productids, Set<Integer> mothers, Long warehouseId) {
        ProductExample productExample = new ProductExample();
        productExample.createCriteria().andMidIn(new ArrayList<>(mothers)).andProductidNotIn(productids).andProductlevelEqualTo("在售").andWarehouseidEqualTo(warehouseId);
        return productMapper.selectByExample(productExample);
    }

    private Integer valideNewTrainWarn(Product product, Algorithmicrule algorithmicrule, int type) {
        Integer productID = product.getProductid();
        String sku = product.getSkucode();
        Integer deliverytime = product.getDeliverytime();
        Map<String, Double> sales = productSellService.getStringDoubleMap(productID);
        double allsale = 0.0;
        for(Double sale:sales.values()){
            allsale+=sale;
        }
        if (allsale==0)
        {
            return 0;
        }
        int processtime = algorithmicrule.getProcessTimeTrain();
        if (deliverytime == null || deliverytime == 0) {
            deliverytime = algorithmicrule.getDeliveryTimeTrain();
        }
        int headwaytime = algorithmicrule.getHeadwaytimeTrain();
        int safetime = algorithmicrule.getSafestockTrain();
        Info info = new Info(productID, deliverytime, sales, processtime, headwaytime, safetime).invoke();
        int circletime = info.getCircletime();
        Date today = info.getToday();
        int lastSell = info.getLastSell();
        Integer onSell = info.getOnSell();
        Integer onpurchase = info.getOnpurchase();
        if (onpurchase > 5) {
            Warninfo warninfo = warninfoMapper.selectByPrimaryKey(productID);
            if (warninfo != null && warninfo.getStatus() == 1) {
                warninfoMapper.deleteByPrimaryKey(productID);
            }
            return 0;
        }
        Integer onway = info.getOnway();
        Integer oncnwarehouse = info.getOncnwarehouse();
        String averageSalesQty7 = info.getAverageSalesQty7();
        String averageSalesQty15 = info.getAverageSalesQty15();
        String averageSalesQty = info.getAverageSalesQty();
        //首次补货完成后的二次补货时间
        int secondtime = circletime - safetime;
        int firstReplenishTrain = algorithmicrule.getFirstReplenishTrain();
        int replenishAmountTrain = algorithmicrule.getReplenishAmountTrain();
        //判断当前是否为母代码补货
        if (type == 1) {
            //直接补货
            Integer result = checkNewReplenish(secondtime, productID, type);
            switch (result) {
                case 0://新品首次补货
                    int sell = firstReplenishTrain * lastSell / circletime;
                    generateTrainWarnInfo(sku, today, sell, onSell, onpurchase, onway, oncnwarehouse, averageSalesQty7, averageSalesQty15, averageSalesQty, Constants.warninfo_new_type, productID);
                    return 1;

                case 1: //新品二次补货
                    int count = replenishAmountTrain * lastSell / circletime;
                    generateTrainWarnInfo(sku, today, count, onSell, onpurchase, onway, oncnwarehouse, averageSalesQty7, averageSalesQty15, averageSalesQty, Constants.warninfo_twice_type, productID);
                    return 1;
                case 2:
                    //判断是否需要常规补货
                    return valideOldTrainWarn(product, algorithmicrule, type);
            }

        } else {
            Integer result = checkNewReplenish(secondtime, productID, type);
            if (result == 3) {
                int count = replenishAmountTrain * lastSell / circletime;
                generateTrainWarnInfo(sku, today, count, onSell, onpurchase, onway, oncnwarehouse, averageSalesQty7, averageSalesQty15, averageSalesQty, Constants.warninfo_mother_type, productID);
                return 1;
            }
        }
        return 0;

    }

    private Integer valideOldTrainWarn(Product product, Algorithmicrule algorithmicrule, int type) {
        Integer productID = product.getProductid();
        String sku = product.getSkucode();
        Integer deliverytime = product.getDeliverytime();
        Map<String, Double> sales = productSellService.getStringDoubleMap(productID);
        double allsale = 0.0;
        for(Double sale:sales.values()){
            allsale+=sale;
        }
        if (allsale==0)
        {
            return 0;
        }
        int processtime = algorithmicrule.getProcessTimeTrain();
        if (deliverytime == null || deliverytime == 0) {
            deliverytime = algorithmicrule.getDeliveryTimeTrain();
        }
        int headwaytime = algorithmicrule.getHeadwaytimeTrain();
        int safetime = algorithmicrule.getSafestockTrain();
        //基本参数生成
        Info info = new Info(productID, deliverytime, sales, processtime, headwaytime, safetime).invoke();
        int circletime = info.getCircletime();
        Date today = info.getToday();
        int lastSell = info.getLastSell();
        Integer onSell = info.getOnSell();
        Integer onpurchase = info.getOnpurchase();
        if (onpurchase > 5) {
            Warninfo warninfo = warninfoMapper.selectByPrimaryKey(productID);
            if (warninfo != null && warninfo.getStatus() == 1) {
                warninfoMapper.deleteByPrimaryKey(productID);
            }
            return 0;
        }
        Integer onway = info.getOnway();
        Integer oncnwarehouse = info.getOncnwarehouse();
        String averageSalesQty7 = info.getAverageSalesQty7();
        String averageSalesQty15 = info.getAverageSalesQty15();
        String averageSalesQty = info.getAverageSalesQty();
        int replenishAmountTrain=algorithmicrule.getReplenishAmountTrain();
        if (type == 1) {
            //非母代码补货
            if (checkOldReplenish(sales, onSell, circletime, sku, safetime, headwaytime, processtime, deliverytime, productID, today)) {
                Integer amount = replenishAmountTrain * lastSell / circletime;
                generateTrainWarnInfo(sku, today, amount, onSell, onpurchase, onway, oncnwarehouse, averageSalesQty7, averageSalesQty15, averageSalesQty, Constants.warninfo_custom, productID);
                return 1;
            } else {
                Warninfo warninfo = warninfoMapper.selectByPrimaryKey(productID);
                if (warninfo != null && warninfo.getStatus() == 1) {
                    warninfoMapper.deleteByPrimaryKey(productID);
                }
                return 0;
            }
        } else {
            DateTime dateTime = new DateTime();
            dateTime = dateTime.plusDays(7);
            if (checkOldReplenish(sales, onSell, circletime, sku, safetime, headwaytime, processtime, deliverytime, productID, dateTime.toDate())) {
                Integer amount = replenishAmountTrain * lastSell / circletime;
                generateTrainWarnInfo(sku, today, amount, onSell, onpurchase, onway, oncnwarehouse, averageSalesQty7, averageSalesQty15, averageSalesQty, Constants.warninfo_mother_type, productID);
                return 1;
            }
        }

        return 0;
    }

    private void generateTrainWarnInfo(String sku, Date today, Integer count, Integer onSell, Integer onpurchase, Integer onway, Integer oncnwarehouse, String averageSalesQty7, String averageSalesQty15, String averageSalesQty, String type, Integer productID) {
        Warninfo warninfo = new Warninfo();
        warninfo.setStatus((byte) 1);
        warninfo.setActualquantity(count);
        warninfo.setWarnquantity(count);
        warninfo.setAveragesalesqty(averageSalesQty);
        warninfo.setAveragesalesqty7(averageSalesQty7);
        warninfo.setAveragesalesqty15(averageSalesQty15);
        warninfo.setCnquantity(oncnwarehouse);
        warninfo.setPurchasequantity(onpurchase);
        warninfo.setStoragequantity(onSell);
        warninfo.setSkucode(sku);
        warninfo.setType(type);
        warninfo.setUpdatetime(today);
        warninfo.setWayquantity(onway);
        warninfo.setProductid(productID);
        addOrUpdateWarn(warninfo);

    }

    @Override
    public JSONObject queryProcessInfo(Integer productID) {

        Product product = productMapper.selectByPrimaryKey(productID);
        String headway = product.getHeadwaytype();
        Long warehouseID = product.getWarehouseid();
        AlgorithmicruleExample example = new AlgorithmicruleExample();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        example.createCriteria().andWarehouseidEqualTo(warehouseID);
        List<Algorithmicrule> algorithmicrules = algorithmicruleMapper.selectByExample(example);
        Algorithmicrule algorithmicrule = algorithmicrules.get(0);
        Integer deliverytime = product.getDeliverytime();
        int processtime = 0;
        int safetime = 0;
        int headwaytime;
        if (deliverytime == null || deliverytime == 0) {
            if (headway.equals("海运")) {
                deliverytime = algorithmicrule.getDeliveryTimeShip();
            } else {
                deliverytime = algorithmicrule.getDeliveryTimeAir();
            }
        }
        if (headway.equals("海运")) {
            processtime = algorithmicrule.getProcessTimeShip();
            headwaytime = algorithmicrule.getHeadwaytimeShip();
        } else {
            processtime = algorithmicrule.getProcessTimeAir();
            headwaytime = algorithmicrule.getHeadwaytimeAir();
        }
        int circletime = processtime + headwaytime + deliverytime + safetime;
        Date tempdate = new Date();
        DateTime dt = new DateTime();
        JSONObject object = new JSONObject();
        List<JSONObject> results = new ArrayList<>();
        List<WarehouseOutWarrantSku> outWarrantSkus = warehouseOutService.getSkusByID(productID);
        if (outWarrantSkus != null && outWarrantSkus.size() > 0) {
            for (WarehouseOutWarrantSku warehouseOutWarrantSku : outWarrantSkus) {
                Date createDate = warehouseOutWarrantSku.getCreatetime();
                int days = (int) ((tempdate.getTime() - createDate.getTime()) / (1000 * 3600 * 24));
                int temp = headwaytime - days;
                //若该头程时间已到，则不计算该订单
                if (temp <= 0) {
                    temp = 0;
                }
                JSONObject result = new JSONObject();
                result.put("timestamp", sdf.format(dt.plusDays(temp).toDate()));
                result.put("quantity", warehouseOutWarrantSku.getOutcount());
                WarehouseOutWarrant warehouseOutWarrant = warehouseOutWarrantMapper.selectByPrimaryKey(warehouseOutWarrantSku.getOutid());
                result.put("num", warehouseOutWarrant.getOutnum());
                result.put("createTime", sdf.format(createDate));
                results.add(result);
            }
        }
        object.put("allo", results);
        results = new ArrayList<>();
        WarehouseInWarrantSkuExample warehouseInWarrantSkuExample = new WarehouseInWarrantSkuExample();
        warehouseInWarrantSkuExample.createCriteria().andProductidEqualTo(productID).andStatusLessThan((byte) 3);
        List<WarehouseInWarrantSku> warehouseInWarrantSkus = warehouseInWarrantSkuMapper.selectByExample(warehouseInWarrantSkuExample);
        for (WarehouseInWarrantSku warehouseInWarrantSku : warehouseInWarrantSkus) {
            Integer incount = warehouseInWarrantSku.getIncount();
            Integer outCount = warehouseInWarrantSku.getOutcount();

            int tempcount = incount - outCount;
            Date intime = warehouseInWarrantSku.getCreatetime();
            Date nowtime = new Date();
            int tempdays = (int) ((nowtime.getTime() - intime.getTime()) / (1000 * 3600 * 24));
            if (tempdays > processtime) {
                //直接减去头程时间
                JSONObject result = new JSONObject();
                result.put("timestamp", sdf.format(dt.plusDays(headwaytime).toDate()));
                result.put("quantity", tempcount);
                result.put("createTime", sdf.format(intime));
                WarehouseInWarrant warehouseInWarrant = warehouseInWarrantMapper.selectByPrimaryKey(warehouseInWarrantSku.getInid());
                result.put("num", warehouseInWarrant.getInnum());
                results.add(result);
            } else {
                int days = (int) ((tempdate.getTime() - intime.getTime()) / (1000 * 3600 * 24));
                int temp = circletime - deliverytime - days;
                if (temp <= 0) {
                    //若该采购单已到货，则直接添加数量
                    temp = 0;
                }
                JSONObject result = new JSONObject();
                result.put("timestamp", sdf.format(dt.plusDays(temp).toDate()));
                result.put("quantity", tempcount);
                result.put("createTime", sdf.format(intime));
                WarehouseInWarrant warehouseInWarrant = warehouseInWarrantMapper.selectByPrimaryKey(warehouseInWarrantSku.getInid());
                result.put("num", warehouseInWarrant.getInnum());
                results.add(result);
            }
        }
        object.put("cn", results);
        results = new ArrayList<>();
        List<PurchaseSku> purchaseSkus = purchaseService.queryByID(productID);
        for (PurchaseSku purchaseSku : purchaseSkus) {
            Integer purchaseCount = purchaseSku.getPurchasequantity();
            Integer stockCount = purchaseSku.getStockinquantity();
            Integer pCount = purchaseCount - stockCount;
            if (pCount > 0) {
                //说明该采购单有尚未入库的库存
                Date createTime = purchaseSku.getCreatetime();
                Date nowtime = new Date();
                int tempdays = (int) ((nowtime.getTime() - createTime.getTime()) / (1000 * 3600 * 24));
                if (tempdays > deliverytime) {
                    //按照计划应该已经进入下一阶段的
                    int temp = headwaytime + processtime;
                    JSONObject result = new JSONObject();
                    result.put("timestamp", sdf.format(dt.plusDays(temp).toDate()));
                    result.put("quantity", pCount);
                    result.put("createTime", sdf.format(createTime));
                    Purchase purchase = purchaseService.queryDetailByID(purchaseSku.getPurchaseid());
                    result.put("num", purchase.getPurchasenum());
                    results.add(result);
                } else {
                    int days = (int) ((tempdate.getTime() - createTime.getTime()) / (1000 * 3600 * 24));
                    int temp = circletime - days;
                    if (temp <= 0) {
                        temp = 0;
                    }
                    tempdate = dt.toDate();
                    JSONObject result = new JSONObject();
                    result.put("timestamp", sdf.format(dt.plusDays(temp).toDate()));
                    result.put("quantity", pCount);
                    result.put("createTime", sdf.format(createTime));
                    Purchase purchase = purchaseService.queryDetailByID(purchaseSku.getPurchaseid());
                    result.put("num", purchase.getPurchasenum());
                    results.add(result);
                }
            }
            object.put("pr", results);
        }
        return CommonUtil.successJson(object);
    }

    @Override
    public List<ProductNewYear> calcNewYearProductStorage() {
        AlgorithmicruleExample algorithmicruleExample=new AlgorithmicruleExample();
        algorithmicruleExample.createCriteria().andAlidNotEqualTo(4);
        List<Algorithmicrule> algorithmicrules=algorithmicruleMapper.selectByExample(algorithmicruleExample);
        ProductExample example=new ProductExample();
        example.createCriteria().andProductidIsNotNull().andProductlevelEqualTo("在售").andWarehouseidNotEqualTo(104400l);
        List<Product> products=productMapper.selectByExample(example);
        List<ProductNewYear> newYears=new ArrayList<>();
        for (Product product:products){
            int productid=product.getProductid();
            ProductHoliday holiday=productHolidayMapper.selectByPrimaryKey(productid);
            if (holiday==null){
                holiday=new ProductHoliday();
                DateTime dateTime=new DateTime();
                holiday.setStartday(dateTime.toDate());
                holiday.setEndday(dateTime.plusDays(55).toDate());
                holiday.setSkucode(product.getSkucode());
                holiday.setProductid(productid);
            }
            Long warehouseid=product.getWarehouseid();
            for (Algorithmicrule algorithmicrule:algorithmicrules){
                if (algorithmicrule.getWarehouseid().equals(warehouseid)){
                    int deliveryTimeAir = algorithmicrule.getDeliveryTimeAir();
                    int deliveryTimeShip = algorithmicrule.getDeliveryTimeShip();
                    int processtimeAir = algorithmicrule.getProcessTimeAir();
                    int processtimeShip=algorithmicrule.getProcessTimeShip();
                    int safestockAir = algorithmicrule.getSafestockAir();
                    int safestockShip = algorithmicrule.getSafestockShip();
                    int headwaytimeAir = algorithmicrule.getHeadwaytimeAir();
                    int headwaytimeShip = algorithmicrule.getHeadwaytimeShip();
                    ProductNewYear newYear= null;
                    try {
                        newYear = valideNewYear(deliveryTimeAir,deliveryTimeShip,processtimeAir,processtimeShip,safestockAir,safestockShip,headwaytimeAir,headwaytimeShip,holiday.getStartday(),holiday.getEndday(),productid);
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    if (newYear!=null) {
                        newYears.add(newYear);
                        break;
                    }
                }
            }
        }
        return newYears;
    }

    private ProductNewYear valideNewYear(int deliveryTimeAir, int deliveryTimeShip, int processtimeAir, int processtimeShip, int safestockAir, int safestockShip, int headwaytimeAir, int headwaytimeShip, Date startday, Date endday,int productid) throws ParseException {
        Product product=productMapper.selectByPrimaryKey(productid);

        String sku=product.getSkucode();
        Integer processtime=0;
        Integer safetime=0;
        DateTime endTime=new DateTime(endday);
        DateTime startTime=new DateTime(startday);
        String headway=product.getHeadwaytype();
        Integer headwaytime=0;
        Map<String,Double> sales=productSellService.getStringDoubleMap(productid);
        double allsale = 0.0;
        for(Double sale:sales.values()){
            allsale+=sale;
        }
        if (allsale==0.0){
            return null;
        }

        if ("空运".equals(headway)){
            processtime=processtimeAir;
            safetime=safestockAir;
            headwaytime=headwaytimeAir;
        }else if ("海运".equals(headway)){
            processtime=processtimeShip;
            safetime=safestockShip;
            headwaytime=headwaytimeShip;
        }
        Integer qtyAvailable=0;
        ProductWarehouseStorage warehouseStorage=productWarehouseStorageMapper.selectByPrimaryKey(productid);
        if (warehouseStorage==null){
            warehouseStorage=new ProductWarehouseStorage();
            warehouseStorage.setOnsell(0);
            warehouseStorage.setOnway(0);
            warehouseStorage.setOnpurchase(0);
            warehouseStorage.setOncnwarehouse(0);
        }
        qtyAvailable=warehouseStorage.getOnsell();
        int deliverytime=product.getDeliverytime();
        if (deliverytime==0) {
            if ("空运".equals(headway)) {
                deliverytime = deliveryTimeAir;
            } else {
                deliverytime = deliveryTimeShip;
            }
        }
        Info info = new Info(productid, deliverytime, sales, processtime, headwaytime, safetime).invoke();
        int circletime = info.circletime;
        //计算当前结束日期
        DateTime temptime=endTime;
        temptime=temptime.plusDays(circletime);
        //计算当前结束日期所剩余库存
        DateTime finishtime=getReplenish(sales,qtyAvailable,circletime,headwaytime,processtime,deliverytime,productid,startday);
        DateTime now=new DateTime();
        now=now.plusDays(circletime);
        if (now.isAfter(finishtime)){
             finishtime=now;
        }
        int calctime= Days.daysBetween(finishtime,temptime).getDays();
        Map<Integer,Integer> dateOfMonth2= DateUtil.calcDay(finishtime.getYear(),finishtime.getMonthOfYear(),finishtime.getDayOfMonth(),calctime);
        int lastSell=0;
        //计算需要补多少货
        if (sales.size() != 0) {
            lastSell = getCircleSale(sales, dateOfMonth2, lastSell);
        }
        ProductNewYear newYear=new ProductNewYear();
        newYear.setProductID(productid);
        newYear.setFinishtime(finishtime.toString("yyyy-MM-dd"));
        newYear.setNeedtime(temptime.toString("yyyy-MM-dd"));
        newYear.setStock(lastSell);
        newYear.setSku(sku);
        newYear.setPrice(product.getCost());
        return newYear;
    }



    /**
     * 空运新品补货计算
     */
    private Integer valideNewAirWarn(Product product, Algorithmicrule algorithmicrule, int type) {
        Integer productID = product.getProductid();
        String sku = product.getSkucode();
        Integer deliverytime = product.getDeliverytime();
        Map<String, Double> sales = productSellService.getStringDoubleMap(productID);
        double allsale = 0.0;
        for(Double sale:sales.values()){
            allsale+=sale;
        }
        if (allsale==0)
        {
            return 0;
        }
        int processtime = algorithmicrule.getProcessTimeAir();
        if (deliverytime == null || deliverytime == 0) {
            deliverytime = algorithmicrule.getDeliveryTimeAir();
        }
        int headwaytime = algorithmicrule.getHeadwaytimeAir();
        int safetime = algorithmicrule.getSafestockAir();
        Info info = new Info(productID, deliverytime, sales, processtime, headwaytime, safetime).invoke();
        int circletime = info.getCircletime();
        Date today = info.getToday();
        int lastSell = info.getLastSell();
        Integer onSell = info.getOnSell();
        Integer onpurchase = info.getOnpurchase();
        if (onpurchase > 0) {
            Warninfo warninfo = warninfoMapper.selectByPrimaryKey(productID);
            if (warninfo != null && warninfo.getStatus() == 1) {
                warninfoMapper.deleteByPrimaryKey(productID);
            }
            return 0;
        }
        Integer onway = info.getOnway();
        Integer oncnwarehouse = info.getOncnwarehouse();
        String averageSalesQty7 = info.getAverageSalesQty7();
        String averageSalesQty15 = info.getAverageSalesQty15();
        String averageSalesQty = info.getAverageSalesQty();
        //首次补货完成后的二次补货时间
        int secondtime = circletime - safetime;
        int firstReplenishAir = algorithmicrule.getFirstReplenishAir();
        int replenishAmountAir=algorithmicrule.getReplenishAmountAir();
        //判断当前是否为母代码补货
        if (type == 1) {
            //直接补货
            Integer result = checkNewReplenish(secondtime, productID, type);
            switch (result) {
                case 0://新品首次补货
                    int sell = firstReplenishAir * lastSell / circletime;
                    generateAirWarnInfo(sku, today, sell, onSell, onpurchase, onway, oncnwarehouse, averageSalesQty7, averageSalesQty15, averageSalesQty, Constants.warninfo_new_type, productID);
                    return 1;

                case 1: //新品二次补货
                    int count = replenishAmountAir * lastSell / circletime;
                    generateAirWarnInfo(sku, today, count, onSell, onpurchase, onway, oncnwarehouse, averageSalesQty7, averageSalesQty15, averageSalesQty, Constants.warninfo_twice_type, productID);
                    return 1;
                case 2:
                    //判断是否需要常规补货
                    return valideOldAirWarn(product, algorithmicrule, type);
            }

        } else {
            Integer result = checkNewReplenish(secondtime, productID, type);
            if (result == 3) {
                int count = replenishAmountAir * lastSell / circletime;
                generateAirWarnInfo(sku, today, count, onSell, onpurchase, onway, oncnwarehouse, averageSalesQty7, averageSalesQty15, averageSalesQty, Constants.warninfo_mother_type, productID);
                return 1;
            }
        }
        return 0;
    }

    private void generateAirWarnInfo(String sku, Date today, int count, Integer onSell, Integer onpurchase, Integer onway, Integer oncnwarehouse, String averageSalesQty7, String averageSalesQty15, String averageSalesQty, String type, Integer productID) {

        Warninfo warninfo = new Warninfo();
        warninfo.setStatus((byte) 1);
        warninfo.setActualquantity(count);
        warninfo.setWarnquantity(count);
        warninfo.setAveragesalesqty(averageSalesQty);
        warninfo.setAveragesalesqty7(averageSalesQty7);
        warninfo.setAveragesalesqty15(averageSalesQty15);
        warninfo.setCnquantity(oncnwarehouse);
        warninfo.setPurchasequantity(onpurchase);
        warninfo.setStoragequantity(onSell);
        warninfo.setSkucode(sku);
        warninfo.setType(type);
        warninfo.setUpdatetime(today);
        warninfo.setWayquantity(onway);
        warninfo.setProductid(productID);
        addOrUpdateWarn(warninfo);
    }


    private Integer valideOldAirWarn(Product product, Algorithmicrule algorithmicrule, int type) {
        Integer productID = product.getProductid();
        String sku = product.getSkucode();
        Integer deliverytime = product.getDeliverytime();
        Map<String, Double> sales = productSellService.getStringDoubleMap(productID);
        double allsale = 0.0;
        for(Double sale:sales.values()){
            allsale+=sale;
        }
        if (allsale==0)
        {
            return 0;
        }
        int processtime = algorithmicrule.getProcessTimeAir();
        if (deliverytime == null || deliverytime == 0) {
            deliverytime = algorithmicrule.getDeliveryTimeAir();
        }
        int headwaytime = algorithmicrule.getHeadwaytimeAir();
        int safetime = algorithmicrule.getSafestockAir();
        //基本参数生成
        Info info = new Info(productID, deliverytime, sales, processtime, headwaytime, safetime).invoke();
        int circletime = info.getCircletime();
        Date today = info.getToday();
        int lastSell = info.getLastSell();
        Integer onSell = info.getOnSell();
        Integer onpurchase = info.getOnpurchase();
        if (onpurchase > 5) {
            Warninfo warninfo = warninfoMapper.selectByPrimaryKey(productID);
            if (warninfo != null && warninfo.getStatus() == 1) {
                warninfoMapper.deleteByPrimaryKey(productID);
            }
            return 0;
        }
        Integer onway = info.getOnway();
        Integer oncnwarehouse = info.getOncnwarehouse();
        String averageSalesQty7 = info.getAverageSalesQty7();
        String averageSalesQty15 = info.getAverageSalesQty15();
        String averageSalesQty = info.getAverageSalesQty();
        Integer replenishAmountAir = algorithmicrule.getReplenishAmountAir();
        if (type == 1) {
            //非母代码补货
            if (checkOldReplenish(sales, onSell, circletime, sku, safetime, headwaytime, processtime, deliverytime, productID, today)) {
                Integer amount = replenishAmountAir * lastSell / circletime ;
                generateAirWarnInfo(sku, today, amount, onSell, onpurchase, onway, oncnwarehouse, averageSalesQty7, averageSalesQty15, averageSalesQty, Constants.warninfo_custom, productID);
                return 1;
            } else {
                Warninfo warninfo = warninfoMapper.selectByPrimaryKey(productID);
                if (warninfo != null && warninfo.getStatus() == 1) {
                    warninfoMapper.deleteByPrimaryKey(productID);
                }
                return 0;
            }
        } else {
            DateTime dateTime = new DateTime();
            dateTime = dateTime.plusDays(7);
            if (checkOldReplenish(sales, onSell, circletime, sku, safetime, headwaytime, processtime, deliverytime, productID, dateTime.toDate())) {
                Integer amount = replenishAmountAir * lastSell / circletime;
                generateAirWarnInfo(sku, today, amount, onSell, onpurchase, onway, oncnwarehouse, averageSalesQty7, averageSalesQty15, averageSalesQty, Constants.warninfo_mother_type, productID);
                return 1;
            }
        }

        return 0;
    }

    private Integer valideNewShipWarn(Product product, Algorithmicrule algorithmicrule, int type) {
        Integer productID = product.getProductid();
        String sku = product.getSkucode();
        Integer deliverytime = product.getDeliverytime();
        Map<String, Double> sales = productSellService.getStringDoubleMap(productID);
        double allsale = 0.0;
        for(Double sale:sales.values()){
            allsale+=sale;
        }
        if (allsale==0)
        {
            return 0;
        }
        int processtime = algorithmicrule.getProcessTimeShip();
        if (deliverytime == null || deliverytime == 0) {
            deliverytime = algorithmicrule.getDeliveryTimeShip();
        }
        int headwaytime = algorithmicrule.getHeadwaytimeShip();
        int safetime = algorithmicrule.getSafestockShip();
        //基本参数生成
        Info info = new Info(productID, deliverytime, sales, processtime, headwaytime, safetime).invoke();
        int circletime = info.getCircletime();
        Date today = info.getToday();
        int lastSell = info.getLastSell();
        Integer onSell = info.getOnSell();
        Integer onpurchase = info.getOnpurchase();
        if (onpurchase > 5) {
            Warninfo warninfo = warninfoMapper.selectByPrimaryKey(productID);
            if (warninfo != null && warninfo.getStatus() == 1) {
                warninfoMapper.deleteByPrimaryKey(productID);
            }
            return 0;
        }
        Integer onway = info.getOnway();
        Integer oncnwarehouse = info.getOncnwarehouse();
        String averageSalesQty7 = info.getAverageSalesQty7();
        String averageSalesQty15 = info.getAverageSalesQty15();
        String averageSalesQty = info.getAverageSalesQty();
        //首次补货完成后的二次补货时间
        int secondtime = circletime / 2;
        int firstReplenishShip = algorithmicrule.getFirstReplenishShip();
        int replenishAmountShip = algorithmicrule.getReplenishAmountShip();
        //判断当前是否为母代码补货
        if (type == 1) {
            //直接补货
            Integer result = checkNewReplenish(secondtime, productID, type);
            switch (result) {
                case 0://新品首次补货
                    int sell = firstReplenishShip * lastSell / circletime;
                    generateAirWarnInfo(sku, today, sell, onSell, onpurchase, onway, oncnwarehouse, averageSalesQty7, averageSalesQty15, averageSalesQty, Constants.warninfo_new_type, productID);
                    return 1;

                case 1: //新品二次补货
                    int count = replenishAmountShip * lastSell / circletime;
                    generateAirWarnInfo(sku, today, count, onSell, onpurchase, onway, oncnwarehouse, averageSalesQty7, averageSalesQty15, averageSalesQty, Constants.warninfo_twice_type, productID);
                    return 1;
                case 2:
                    //判断是否需要常规补货
                    return valideOldAirWarn(product, algorithmicrule, type);

            }

        } else {
            Integer result = checkNewReplenish(secondtime, productID, type);
            if (result == 3) {
                int count = replenishAmountShip * lastSell / circletime;
                generateAirWarnInfo(sku, today, count, onSell, onpurchase, onway, oncnwarehouse, averageSalesQty7, averageSalesQty15, averageSalesQty, Constants.warninfo_mother_type, productID);
                return 1;
            }
        }
        return 0;
    }


    private Integer valideOldShipWarn(Product product, Algorithmicrule algorithmicrule, int type) {
        Integer productID = product.getProductid();
        String sku = product.getSkucode();
        Integer deliverytime = product.getDeliverytime();
        Map<String, Double> sales = productSellService.getStringDoubleMap(productID);
        double allsale = 0.0;
        for(Double sale:sales.values()){
            allsale+=sale;
        }
        if (allsale==0)
        {
            return 0;
        }
        int processtime = algorithmicrule.getProcessTimeShip();
        if (deliverytime == null || deliverytime == 0) {
            deliverytime = algorithmicrule.getDeliveryTimeShip();
        }
        int headwaytime = algorithmicrule.getHeadwaytimeShip();
        int safetime = algorithmicrule.getSafestockShip();
        //基本参数生成
        Info info = new Info(productID, deliverytime, sales, processtime, headwaytime, safetime).invoke();
        int circletime = info.getCircletime();
        Date today = info.getToday();
        int lastSell = info.getLastSell();
        Integer onSell = info.getOnSell();
        Integer onpurchase = info.getOnpurchase();
        if (onpurchase > 5) {
            Warninfo warninfo = warninfoMapper.selectByPrimaryKey(productID);
            if (warninfo != null && warninfo.getStatus() == 1) {
                warninfoMapper.deleteByPrimaryKey(productID);
            }
            return 0;
        }
        Integer onway = info.getOnway();
        Integer oncnwarehouse = info.getOncnwarehouse();
        String averageSalesQty7 = info.getAverageSalesQty7();
        String averageSalesQty15 = info.getAverageSalesQty15();
        String averageSalesQty = info.getAverageSalesQty();
        Integer replenishAmountShip = algorithmicrule.getReplenishAmountShip();
        if (type == 1) {
            //非母代码补货
            if (checkOldReplenish(sales, onSell, circletime, sku, safetime, headwaytime, processtime, deliverytime, productID, today)) {
                Integer amount = replenishAmountShip * lastSell / circletime;
                generateAirWarnInfo(sku, today, amount, onSell, onpurchase, onway, oncnwarehouse, averageSalesQty7, averageSalesQty15, averageSalesQty, Constants.warninfo_custom, productID);
                return 1;
            } else {
                Warninfo warninfo = warninfoMapper.selectByPrimaryKey(productID);
                if (warninfo != null && warninfo.getStatus() == 1) {
                    warninfoMapper.deleteByPrimaryKey(productID);
                }
                return 0;
            }
        } else {
            DateTime dateTime = new DateTime();
            dateTime = dateTime.plusDays(7);
            if (checkOldReplenish(sales, onSell, circletime, sku, safetime, headwaytime, processtime, deliverytime, productID, dateTime.toDate())) {
                Integer amount = replenishAmountShip * lastSell / circletime;
                generateAirWarnInfo(sku, today, amount, onSell, onpurchase, onway, oncnwarehouse, averageSalesQty7, averageSalesQty15, averageSalesQty, Constants.warninfo_mother_type, productID);
                return 1;
            }
        }

        return 0;
    }

    private boolean checkOldReplenish(Map<String, Double> sales, int qtyAvailable, int circletime, String sku, int safestore, int headwaytime, int processtime, int deliverytime, int productid, Date date) {
        //一个周期的时间
        int timetemp = circletime;
        //获取当前年月日
        Calendar cal = Calendar.getInstance();
        cal.clear();
        Date tempdate = date;
        cal.setTime(date);
        int year = cal.get(Calendar.YEAR);
        //比当前月份少1
        int month = cal.get(Calendar.MONTH) + 1;
        int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
        //获取该产品所有未入库海外仓入库单
        List<WarehouseOutWarrantSku> outWarrantSkus = warehouseOutService.getSkusByID(productid);

        if (outWarrantSkus == null||outWarrantSkus.size()==0) {
        } else {
            outWarrantSkus=outWarrantSkus.stream().sorted(Comparator.comparing(WarehouseOutWarrantSku::getCreatetime)).collect(Collectors.toList());
            for (WarehouseOutWarrantSku warehouseOutWarrantSku : outWarrantSkus) {
                //获取该订单创建日期
                Date createDate = warehouseOutWarrantSku.getCreatetime();
                //判断当前日期与创建日期之间的时间差
                int days = (int) ((tempdate.getTime() - createDate.getTime()) / (1000 * 3600 * 24));
                //根据头程时间
                int temp = headwaytime - days;
                //若该头程时间已到，则不计算该订单
                if (temp <= 0) {
                    temp = 0;
                }
                //将上架剩余时间按日期拆分，获取预计的消耗量
                Map<Integer, Integer> map = DateUtil.calcDay(year, month, dayOfMonth, temp);
                for (int i = 1; i <= 12; i++) {
                    if (map.get(i) != null && map.get(i) != 0) {
                        double exceptSell = 0.0;
                        exceptSell = sales.get("month" + i);
                        qtyAvailable -= (exceptSell * map.get(i));
                    }
                }
                //若目的仓库存已消耗为空，则将库存数置为0
                if (qtyAvailable < 0) {
                    qtyAvailable = 0;
                }
                //库存数更新上该订单的运货数
                qtyAvailable += warehouseOutWarrantSku.getOutcount();
                //下一周期所需时间减去该订单距离上架的时间
                timetemp -= temp;
                //订单起始时间更新为arriveDate
                DateTime dt = new DateTime(tempdate);
                dt = dt.plusDays(temp);
                tempdate = dt.toDate();
            }
            WarehouseOutWarrantSku warehouseOutWarrantSku=outWarrantSkus.get(outWarrantSkus.size()-1);
            DateTime dateTime=new DateTime(tempdate);
            DateTime createTime=new DateTime(warehouseOutWarrantSku.getCreatetime());
            int days=Days.daysBetween(createTime,DateTime.now()).getDays();
            int exceptSellDays=0;
            while (qtyAvailable>0){
                DateTime theEndDataOfMonth = dateTime.dayOfMonth().withMaximumValue();
                int temps=Days.daysBetween(dateTime,theEndDataOfMonth).getDays();

                Double exceptSell=sales.get("month" + theEndDataOfMonth.getMonthOfYear());
                if ((qtyAvailable-temps*exceptSell)>0){
                    qtyAvailable= (int) (qtyAvailable-temps*exceptSell);
                    dateTime=theEndDataOfMonth.plusDays(1);
                    exceptSellDays+=temps;
                }else {
                    int temp= (int) (qtyAvailable/exceptSell);
                    dateTime=dateTime.plusDays(temp);
                    exceptSellDays+=temp;
                    break;
                }
            }

            if (exceptSellDays-safestore>=days+processtime+deliverytime+1){
                return  false;
            }
        }


        WarehouseInWarrantSkuExample warehouseInWarrantSkuExample = new WarehouseInWarrantSkuExample();
        warehouseInWarrantSkuExample.createCriteria().andProductidEqualTo(productid).andStatusLessThan((byte) 3).andIncountGreaterThan(5);
        List<WarehouseInWarrantSku> warehouseInWarrantSkus = warehouseInWarrantSkuMapper.selectByExample(warehouseInWarrantSkuExample);
        for (WarehouseInWarrantSku warehouseInWarrantSku : warehouseInWarrantSkus) {
            Integer incount = warehouseInWarrantSku.getIncount();
            Integer outCount = warehouseInWarrantSku.getOutcount();
            int tempcount = incount - outCount;
            if (tempcount < 5) {
                continue;
            }
            Date intime = warehouseInWarrantSku.getCreatetime();
            Date nowtime = new Date();
            int tempdays = (int) ((nowtime.getTime() - intime.getTime()) / (1000 * 3600 * 24));
            if (tempdays > processtime) {
                cal.setTime(tempdate);
                //计算该采购单的消耗量
                Map<Integer, Integer> map = DateUtil.calcDay(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH) + 1, cal.get(Calendar.DAY_OF_MONTH), headwaytime);
                for (int i = 1; i <= 12; i++) {
                    if (map.get(i) != null && map.get(i) != 0) {
                        double exceptSell = 0.0;
                        exceptSell = sales.get("month" + i);
                        qtyAvailable -= (exceptSell * map.get(i));
                    }
                }
                if (qtyAvailable < 0) {
                    qtyAvailable = 0;
                }
                qtyAvailable += tempcount;
                //直接减去头程时间
                timetemp -= headwaytime;
                DateTime dt = new DateTime(tempdate);
                dt = dt.plusDays(headwaytime);
                tempdate = dt.toDate();
            } else {
                int days = (int) ((tempdate.getTime() - intime.getTime()) / (1000 * 3600 * 24));
                int temp = circletime - deliverytime - days;
                if (temp <= 0) {
                    //若该采购单已到货，则直接添加数量
                    temp = 0;
                }
                cal.setTime(tempdate);
                //计算该采购单的消耗量
                Map<Integer, Integer> map = DateUtil.calcDay(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH) + 1, cal.get(Calendar.DAY_OF_MONTH), temp);
                for (int i = 1; i <= 12; i++) {
                    if (map.get(i) != null && map.get(i) != 0) {
                        double exceptSell = 0.0;
                        exceptSell = sales.get("month" + i);
                        qtyAvailable -= (exceptSell * map.get(i));
                    }
                }
                if (qtyAvailable < 0) {
                    qtyAvailable = 0;
                }
                qtyAvailable += tempcount;
                timetemp -= temp;
                DateTime dt = new DateTime(tempdate);
                dt = dt.plusDays(temp);
                tempdate = dt.toDate();
            }
        }


        List<PurchaseSku> purchaseSkus = purchaseService.queryByID(productid);
        for (PurchaseSku purchaseSku : purchaseSkus) {
            Integer purchaseCount = purchaseSku.getPurchasequantity();
            Integer stockCount = purchaseSku.getStockinquantity();
            Integer defectCount = purchaseSku.getDefectivequantity();
            Integer pCount = purchaseCount - stockCount - defectCount;
            if (pCount > 5) {
                //说明该采购单有尚未入库的库存
                Date createTime = purchaseSku.getCreatetime();
                Date nowtime = new Date();
                int tempdays = (int) ((nowtime.getTime() - createTime.getTime()) / (1000 * 3600 * 24));
                if (tempdays > deliverytime) {
                    //按照计划应该已经进入下一阶段的
                    cal.setTime(tempdate);
                    int temp = headwaytime + processtime;
                    Map<Integer, Integer> map = DateUtil.calcDay(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH) + 1, cal.get(Calendar.DAY_OF_MONTH), temp);
                    for (int i = 1; i <= 12; i++) {
                        if (map.get(i) != null && map.get(i) != 0) {
                            double exceptSell = 0.0;
                            exceptSell = sales.get("month" + i);
                            qtyAvailable -= (exceptSell * map.get(i));
                        }
                    }
                    if (qtyAvailable < 0) {
                        qtyAvailable = 0;
                    }
                    qtyAvailable += pCount;
                    timetemp -= temp;
                    DateTime dt = new DateTime(tempdate);
                    dt = dt.plusDays(temp);
                    tempdate = dt.toDate();
                } else {
                    int days = (int) ((tempdate.getTime() - createTime.getTime()) / (1000 * 3600 * 24));
                    int temp = circletime - days;
                    if (temp <= 0) {
                        temp = 0;
                    }
                    cal.setTime(tempdate);
                    Map<Integer, Integer> map = DateUtil.calcDay(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH) + 1, cal.get(Calendar.DAY_OF_MONTH), temp);
                    for (int i = 1; i <= 12; i++) {
                        if (map.get(i) != null && map.get(i) != 0) {
                            double exceptSell = 0.0;
                            exceptSell = sales.get("month" + i);
                            qtyAvailable -= (exceptSell * map.get(i));
                        }
                    }
                    if (qtyAvailable < 0) {
                        qtyAvailable = 0;
                    }
                    qtyAvailable += pCount;
                    timetemp -= temp;
                    DateTime dt = new DateTime(tempdate);
                    dt = dt.plusDays(temp);
                    tempdate = dt.toDate();
                }
            }
        }
        if (timetemp < 0) {
            return false;
        }
        cal.add(Calendar.DATE, timetemp);
        int newmonth = cal.get(Calendar.MONTH) + 1;
        Map<Integer, Integer> dateOfMonth = DateUtil.calcDay(cal.get(Calendar.YEAR), newmonth, cal.get(Calendar.DAY_OF_MONTH), timetemp);
        int circleSale = 0;
        circleSale = getCircleSale(sales, dateOfMonth, circleSale);
        //计算预计销量
        Map<Integer, Integer> dateOfMonth2 = DateUtil.calcDay(cal.get(Calendar.YEAR), newmonth, cal.get(Calendar.DAY_OF_MONTH), safestore);
        int exceptSell=0;
        exceptSell=getCircleSale(sales, dateOfMonth2, exceptSell);
        //判断当前库存量是否到安全线
        if ((qtyAvailable - circleSale) > (exceptSell)) {

            return false;


        }
        return true;
    }

    private DateTime getReplenish(Map<String, Double> sales, int qtyAvailable, int circletime, int headwaytime, int processtime, int deliverytime, int productid, Date date) {
        int timetemp=circletime;
        //获取当前年月日
        Calendar cal = Calendar.getInstance();
        cal.clear();
        Date tempdate = date;
        cal.setTime(date);
        int year = cal.get(Calendar.YEAR);
        //比当前月份少1
        int month = cal.get(Calendar.MONTH) + 1;
        int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
        //获取该产品所有未入库海外仓入库单
        List<WarehouseOutWarrantSku> outWarrantSkus = warehouseOutService.getSkusByID(productid);

        if (outWarrantSkus == null) {
        } else {
            if (outWarrantSkus.size()>1){
                outWarrantSkus=outWarrantSkus.stream().sorted(Comparator.comparing(WarehouseOutWarrantSku::getCreatetime)).collect(Collectors.toList());
            }
            for (WarehouseOutWarrantSku warehouseOutWarrantSku : outWarrantSkus) {
                //获取该订单创建日期
                Date createDate = warehouseOutWarrantSku.getCreatetime();
                //判断当前日期与创建日期之间的时间差
                int days = (int) ((tempdate.getTime() - createDate.getTime()) / (1000 * 3600 * 24));
                //根据头程时间
                int temp = headwaytime - days;
                //若该头程时间已到，则不计算该订单
                if (temp <= 0) {
                    temp = 0;
                }
                //将上架剩余时间按日期拆分，获取预计的消耗量
                Map<Integer, Integer> map = DateUtil.calcDay(year, month, dayOfMonth, temp);
                for (int i = 1; i <= 12; i++) {
                    if (map.get(i) != null && map.get(i) != 0) {
                        double exceptSell = 0.0;
                        exceptSell = sales.get("month" + i);
                        qtyAvailable -= (exceptSell * map.get(i));
                    }
                }
                //若目的仓库存已消耗为空，则将库存数置为0
                if (qtyAvailable < 0) {
                    qtyAvailable = 0;
                }
                //库存数更新上该订单的运货数
                qtyAvailable += warehouseOutWarrantSku.getOutcount();
                //下一周期所需时间减去该订单距离上架的时间
                timetemp -= temp;
                //订单起始时间更新为arriveDate
                DateTime dt = new DateTime(tempdate);
                dt = dt.plusDays(temp);
                tempdate = dt.toDate();
            }
        }
        WarehouseInWarrantSkuExample warehouseInWarrantSkuExample = new WarehouseInWarrantSkuExample();
        warehouseInWarrantSkuExample.createCriteria().andProductidEqualTo(productid).andStatusLessThan((byte) 3).andIncountGreaterThan(5);
        List<WarehouseInWarrantSku> warehouseInWarrantSkus = warehouseInWarrantSkuMapper.selectByExample(warehouseInWarrantSkuExample);
        for (WarehouseInWarrantSku warehouseInWarrantSku : warehouseInWarrantSkus) {
            Integer incount = warehouseInWarrantSku.getIncount();
            Integer outCount = warehouseInWarrantSku.getOutcount();
            int tempcount = incount - outCount;
            if (tempcount < 5) {
                continue;
            }
            Date intime = warehouseInWarrantSku.getCreatetime();
            Date nowtime = new Date();
            int tempdays = (int) ((nowtime.getTime() - intime.getTime()) / (1000 * 3600 * 24));
            if (tempdays > processtime) {
                cal.setTime(tempdate);
                //计算该采购单的消耗量
                Map<Integer, Integer> map = DateUtil.calcDay(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH) + 1, cal.get(Calendar.DAY_OF_MONTH), headwaytime);
                for (int i = 1; i <= 12; i++) {
                    if (map.get(i) != null && map.get(i) != 0) {
                        double exceptSell = 0.0;
                        exceptSell = sales.get("month" + i);
                        qtyAvailable -= (exceptSell * map.get(i));
                    }
                }
                if (qtyAvailable < 0) {
                    qtyAvailable = 0;
                }
                qtyAvailable += tempcount;
                //直接减去头程时间
                timetemp -= headwaytime;
                DateTime dt = new DateTime(tempdate);
                dt = dt.plusDays(headwaytime);
                tempdate = dt.toDate();
            } else {
                int days = (int) ((tempdate.getTime() - intime.getTime()) / (1000 * 3600 * 24));
                int temp = circletime - deliverytime - days;
                if (temp <= 0) {
                    //若该采购单已到货，则直接添加数量
                    temp = 0;
                }
                cal.setTime(tempdate);
                //计算该采购单的消耗量
                Map<Integer, Integer> map = DateUtil.calcDay(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH) + 1, cal.get(Calendar.DAY_OF_MONTH), temp);
                for (int i = 1; i <= 12; i++) {
                    if (map.get(i) != null && map.get(i) != 0) {
                        double exceptSell = 0.0;
                        exceptSell = sales.get("month" + i);
                        qtyAvailable -= (exceptSell * map.get(i));
                    }
                }
                if (qtyAvailable < 0) {
                    qtyAvailable = 0;
                }
                qtyAvailable += tempcount;
                timetemp -= temp;
                DateTime dt = new DateTime(tempdate);
                dt = dt.plusDays(temp);
                tempdate = dt.toDate();
            }
        }

        List<PurchaseSku> purchaseSkus = purchaseService.queryByID(productid);
        for (PurchaseSku purchaseSku : purchaseSkus) {
            Integer purchaseCount = purchaseSku.getPurchasequantity();
            Integer stockCount = purchaseSku.getStockinquantity();
            Integer defectCount = purchaseSku.getDefectivequantity();
            Integer pCount = purchaseCount - stockCount - defectCount;
            if (pCount > 5) {
                //说明该采购单有尚未入库的库存
                Date createTime = purchaseSku.getCreatetime();
                Date nowtime = new Date();
                int tempdays = (int) ((nowtime.getTime() - createTime.getTime()) / (1000 * 3600 * 24));
                if (tempdays > deliverytime) {
                    //按照计划应该已经进入下一阶段的
                    cal.setTime(tempdate);
                    int temp = headwaytime + processtime;
                    Map<Integer, Integer> map = DateUtil.calcDay(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH) + 1, cal.get(Calendar.DAY_OF_MONTH), temp);
                    for (int i = 1; i <= 12; i++) {
                        if (map.get(i) != null && map.get(i) != 0) {
                            double exceptSell = 0.0;
                            exceptSell = sales.get("month" + i);
                            qtyAvailable -= (exceptSell * map.get(i));
                        }
                    }
                    if (qtyAvailable < 0) {
                        qtyAvailable = 0;
                    }
                    qtyAvailable += pCount;
                    timetemp -= temp;
                    DateTime dt = new DateTime(tempdate);
                    dt = dt.plusDays(temp);
                    tempdate = dt.toDate();
                } else {
                    int days = (int) ((tempdate.getTime() - createTime.getTime()) / (1000 * 3600 * 24));
                    int temp = circletime - days;
                    if (temp <= 0) {
                        temp = 0;
                    }
                    cal.setTime(tempdate);
                    Map<Integer, Integer> map = DateUtil.calcDay(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH) + 1, cal.get(Calendar.DAY_OF_MONTH), temp);
                    for (int i = 1; i <= 12; i++) {
                        if (map.get(i) != null && map.get(i) != 0) {
                            double exceptSell = 0.0;
                            exceptSell = sales.get("month" + i);
                            qtyAvailable -= (exceptSell * map.get(i));
                        }
                    }
                    if (qtyAvailable < 0) {
                        qtyAvailable = 0;
                    }
                    qtyAvailable += pCount;
                    timetemp -= temp;
                    DateTime dt = new DateTime(tempdate);
                    dt = dt.plusDays(temp);
                    tempdate = dt.toDate();
                }
            }
        }
        DateTime dateTime=new DateTime(tempdate);
        while (qtyAvailable>0){
            DateTime theEndDataOfMonth = dateTime.dayOfMonth().withMaximumValue();
            int temps=Days.daysBetween(dateTime,theEndDataOfMonth).getDays();
            Double exceptSell=sales.get("month" + theEndDataOfMonth.getMonthOfYear());
            if ((qtyAvailable-temps*exceptSell)>0){
                qtyAvailable= (int) (qtyAvailable-temps*exceptSell);
                dateTime=theEndDataOfMonth.plusDays(1);
            }else {
                int temp= (int) (qtyAvailable/exceptSell);
                dateTime=dateTime.plusDays(temp);
                break;
            }
        }
        return dateTime;
    }

    private Integer checkNewReplenish(int time, int productID, int type) {
        Date now = new Date();
        List<PurchaseSku> skus = purchaseService.queryByID(productID);
        if (skus == null || skus.size() == 0) {
            //说明当前首次补货尚未发货
            return 0;
        }
        //若已首次补货
        if (skus.size() == 1) {
            PurchaseSku purchaseSku = skus.get(0);
            Date date = purchaseSku.getCreatetime();
            int days = (int) ((now.getTime() - date.getTime()) / (1000 * 3600 * 24));
            //需要二次补货，则按正常补货
            if (type == 1) {
                if (days >= time) {
                    return 1;
                }
            } else {
                //如果按照母代码提示要求补货，判断该新品是否还有一周的时间要补货，若是，则补
                if (days >= time - 7) {
                    return 3;
                }
            }
        }
        //说明已经二次补货了,将产品信息更新为旧品
        Product product = productMapper.selectByPrimaryKey(productID);
        product.setIsnew("N");
        productMapper.updateByPrimaryKeySelective(product);
        return 2;
    }

    /**
     * 计算周期消耗量
     */
    private int getCircleSale(Map<String, Double> sales, Map<Integer, Integer> dateOfMonth, int circleSale) {
        for (int i = 1; i <= 12; i++) {
            if (dateOfMonth.get(i) != null && dateOfMonth.get(i) != 0) {
                double monthSell = 0.0;
                monthSell = sales.get("month" + i);
                circleSale += (monthSell * dateOfMonth.get(i));
            }
        }
        return circleSale;
    }

    private class Info {
        private Integer productID;
        private Integer deliverytime;
        private Map<String, Double> sales;
        private int processtime;
        private int headwaytime;
        private int safetime;
        private int circletime;
        private Date today;
        private int lastSell;
        private Integer onSell;
        private Integer onpurchase;
        private Integer onway;
        private Integer oncnwarehouse;
        private String averageSalesQty7;
        private String averageSalesQty15;
        private String averageSalesQty;

        public Info(Integer productID, Integer deliverytime, Map<String, Double> sales, int processtime, int headwaytime, int safetime) {
            this.productID = productID;
            this.deliverytime = deliverytime;
            this.sales = sales;
            this.processtime = processtime;
            this.headwaytime = headwaytime;
            this.safetime = safetime;
        }

        public int getCircletime() {
            return circletime;
        }

        public Date getToday() {
            return today;
        }

        public int getLastSell() {
            return lastSell;
        }

        public Integer getOnSell() {
            return onSell;
        }

        public Integer getOnpurchase() {
            return onpurchase;
        }

        public Integer getOnway() {
            return onway;
        }

        public Integer getOncnwarehouse() {
            return oncnwarehouse;
        }

        public String getAverageSalesQty7() {
            return averageSalesQty7;
        }

        public String getAverageSalesQty15() {
            return averageSalesQty15;
        }

        public String getAverageSalesQty() {
            return averageSalesQty;
        }

        public Info invoke() {
            circletime = headwaytime + safetime + processtime + deliverytime;
            today = new Date();
            DateTime dateTime = new DateTime();
            dateTime = dateTime.plusDays(circletime);
            //将当前周期天数按月份切割
            Map<Integer, Integer> dateOfMonth2 = DateUtil.calcDay(dateTime.getYear(), dateTime.getMonthOfYear(), dateTime.getDayOfMonth(), circletime);
            lastSell = 0;
            //计算一周期的补货量
            if (sales.size() != 0) {
                lastSell = getCircleSale(sales, dateOfMonth2, lastSell);
            }
            ProductWarehouseStorage storage = productWarehouseStorageMapper.selectByPrimaryKey(productID);
            if (storage != null) {
                onSell = storage.getOnsell();
                onpurchase = storage.getOnpurchase();
                onway = storage.getOnway();
                oncnwarehouse = storage.getOncnwarehouse();
            } else {
                onSell = 0;
                onpurchase = 0;
                onway = 0;
                oncnwarehouse = 0;
            }
            WinitWarehouseStorage warehouseStorage = winitWarehouseStorageMapper.selectByPrimaryKey(productID);
            averageSalesQty7 = null;
            averageSalesQty15 = null;
            averageSalesQty = null;
            if (warehouseStorage != null) {
                averageSalesQty = warehouseStorage.getAveragesalesqty();
                averageSalesQty15 = warehouseStorage.getAveragesalesqty15();
                averageSalesQty7 = warehouseStorage.getAveragesalesqty7();
            }
            return this;
        }
    }
}
