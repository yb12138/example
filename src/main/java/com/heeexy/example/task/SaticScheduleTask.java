package com.heeexy.example.task;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.heeexy.example.dao.*;
import com.heeexy.example.model.*;
import com.heeexy.example.service.*;
import org.joda.time.DateTime;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.*;

/**
 * 定时任务
 */
@Component
@Configuration      //1.主要用于标记配置类，兼备Component的效果。
@EnableScheduling
public class SaticScheduleTask {
    @Resource
    DataService dataService;
    @Resource
    WarnInfoService warnInfoService;
    @Resource
    TrackService trackService;
    @Resource
    ProductWarehouseStorageBackMapper productWarehouseStorageBackMapper;
    @Resource
    ProductWarehouseStorageMapper productWarehouseStorageMapper;
    @Resource
    ProductMapper productMapper;
    @Resource
    FinanceService financeService;
    @Resource
    OrderService orderService;
    @Resource
    StringRedisTemplate stringRedisTemplate;
    @Resource
    PurchaseService purchaseService;
    @Resource
    WarehouseOutService warehouseOutService;
    @Resource
    SysUserMapper sysUserMapper;
    @Resource
    TodolistMapper todolistMapper;
    @Resource
    BirdService birdService;
    @Resource
    PurchaseMapper purchaseMapper;
    @Resource
    PurchaseSkuMapper purchaseSkuMapper;
    @Resource
    WarehouseInWarrantSkuMapper warehouseInWarrantSkuMapper;
    @Resource
    WarehouseOutWarrantSkuMapper warehouseOutWarrantSkuMapper;
    @Resource
    ProductWarehouseStorageBackInfoMapper infoMapper;
    @Resource
    WarehouseOutWarrantMapper warehouseOutWarrantMapper;
    @Resource
    AlloOutSkuMapper alloOutSkuMapper;
    @Resource
    AlloOutMapper alloOutMapper;


    //每天一点定时更新库存数据
    @Scheduled(cron = "0 0 1 1/1 * ? ")
    @Transactional(rollbackFor = {RuntimeException.class, Exception.class})
    public void synStorageData() {
        System.err.println("执行更新库存数据任务时间: " + LocalDateTime.now());
        dataService.updateBasicData();
    }

    //每天两点定时更新预警补货数据
    @Scheduled(cron = "0 30 2 1/1 * ? ")
    @Transactional(rollbackFor = {RuntimeException.class, Exception.class})
    public void synWarnInfo() {
        System.err.println("执行预警补货数据任务时间: " + LocalDateTime.now());
        warnInfoService.updateWarnInfo();
    }

    //每天两点半定时更新采购运输信息数据
    @Scheduled(cron = "0 0 2 1/1 * ? ")
    @Transactional(rollbackFor = {RuntimeException.class, Exception.class})
    public void synTrack() {
        System.err.println("执行更新采购运输信息数据任务时间: " + LocalDateTime.now());
        trackService.updateTrack();
    }

    //每天定时拉取订单数目
    @Scheduled(cron = "0 30 1 1/1 * ? ")
    @Transactional(rollbackFor = {RuntimeException.class, Exception.class})
    public void synOrder() {
        orderService.synOrderData();

    }

    //每天定时拉取出库单，计算订单费用
    @Scheduled(cron = "0 30 3 1/1 * ? ")
    @Transactional(rollbackFor = {RuntimeException.class, Exception.class})
    public void synOrderData() {
        dataService.generateWinitOrder();
        dataService.generateGoodOrder();
        birdService.generateBirdInOrderSku();
       /* DateTime dateTime=new DateTime();
        DateTime dateTime1=dateTime.minusDays(3);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String start = formatter.format(dateTime1.toDate());
        String end = formatter.format(dateTime.toDate());
        orderService.createRelationInAndOut(start,end);
        orderService.circleAmount(start,end);*/

    }

    //每天定时计算前台展示数据
    @Scheduled(cron = "0 50 2 1/1 * ? ")
    @Transactional(rollbackFor = {RuntimeException.class, Exception.class})
    public void synDash() {
        System.err.println("执行前台展示数据任务时间: " + LocalDateTime.now());
        Integer purchaseamount = financeService.getTodayAmount();
        Map<String, String> map = orderService.getTodayAmount();
        String orders = map.get("orders");
        String orderamount = map.get("orderamount");
        stringRedisTemplate.opsForValue().set("purchaseamount", String.valueOf(purchaseamount));
        stringRedisTemplate.opsForValue().set("orders", orders);
        stringRedisTemplate.opsForValue().set("orderamount", orderamount);
    }

    //每月最后一天备份库存数据
    @Scheduled(cron = "0 0 0 1 * ?")
    public void synBack() {
        System.err.println("执行备份库存数据任务时间: " + LocalDateTime.now());
        DateTime dateTime = new DateTime();
        int month = dateTime.getMonthOfYear();
        int day = dateTime.getDayOfMonth();
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
        }
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
                            map.put("amount", sku.getPrice().doubleValue() * temp);
                            onSellLists.add(map);
                        }
                    }
                }
            }
            ProductWarehouseStorageBackInfo info = infoMapper.selectByPrimaryKey(backID);
            if(info==null){
                info=new ProductWarehouseStorageBackInfo();
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
        }


    }

    //检查是否有超时操作
    @Scheduled(cron = "0 40 2 1/1 * ? ")
    public void synMsg() {
        System.err.println("执行检查超时任务时间: " + LocalDateTime.now());
        Date date = new Date();
        TodolistExample todolistExample = new TodolistExample();
        todolistExample.createCriteria().andTitleLike("采购单%");
        todolistMapper.deleteByExample(todolistExample);
        TodolistExample todolistExample1 = new TodolistExample();
        todolistExample1.createCriteria().andTitleLike("国内仓出库单%");
        todolistMapper.deleteByExample(todolistExample1);
        //检查采购超时的采购单
        List<String> purchases = purchaseService.checkPurchase();
        SysUserExample example = new SysUserExample();
        example.createCriteria().andRoleIdEqualTo(3);
        List<SysUser> purchaseRoles = sysUserMapper.selectByExample(example);
        SysUserExample example2 = new SysUserExample();
        example2.createCriteria().andRoleIdEqualTo(1);
        List<SysUser> adminRoles = sysUserMapper.selectByExample(example2);
        for (String title : purchases) {
            String oldtitle = title.substring(0, title.charAt(',') - 3);
            TodolistExample example1 = new TodolistExample();
            example1.createCriteria().andTitleLike(oldtitle + '%');
            List<Todolist> todolists = todolistMapper.selectByExample(example1);
            if (todolists != null && todolists.size() > 0) {
                todolistMapper.deleteByExample(example1);
            }
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
        //检查海外仓已入库的单子
        List<WarehouseOutWarrant> warehouseOutWarrants = warehouseOutService.checkWarehouseOut();
        for (WarehouseOutWarrant warehouseOutWarrant : warehouseOutWarrants) {
            String purchaseNum = warehouseOutWarrant.getOutnum();
            String title = "国内仓出库单：" + purchaseNum + " 已到海外，请及时入库";
            TodolistExample example1 = new TodolistExample();
            example1.createCriteria().andTitleEqualTo(title);
            List<Todolist> todolists = todolistMapper.selectByExample(example1);
            if (todolists != null && todolists.size() > 0) {
                continue;
            }
            for (SysUser sysUser : adminRoles) {
                Todolist todolist = new Todolist();
                todolist.setTitle(title);
                todolist.setStatus(0);
                todolist.setCreatetime(date);
                todolist.setUserid(sysUser.getId());
                todolistMapper.insertSelective(todolist);
            }
            for (SysUser sysUser : purchaseRoles) {
                Todolist todolist = new Todolist();
                todolist.setTitle(title);
                todolist.setStatus(0);
                todolist.setCreatetime(date);
                todolist.setUserid(sysUser.getId());
                todolistMapper.insertSelective(todolist);
            }
        }

    }
}
