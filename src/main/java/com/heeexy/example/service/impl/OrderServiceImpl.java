package com.heeexy.example.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.heeexy.example.dao.*;
import com.heeexy.example.model.*;
import com.heeexy.example.service.AlloOutService;
import com.heeexy.example.service.OrderService;
import com.heeexy.example.service.ProductService;
import com.heeexy.example.service.WarehouseOutService;
import com.heeexy.example.util.CommonUtil;
import com.heeexy.example.util.http.EcApiClient;
import com.heeexy.example.util.http.QueClient;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigInteger;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    DatacaciquesOrderMapper datacaciquesOrderMapper;
    @Autowired
    DatacaciquesPackageMapper datacaciquesPackageMapper;
    @Autowired
    DatacaciquesSubOrderMapper datacaciquesSubOrderMapper;
    @Autowired
    DatacaciquesOrderPackageRelationMapper datacaciquesOrderPackageRelationMapper;
    @Autowired
    WinitOutOrderDetailMapper winitOutOrderDetailMapper;
    @Autowired
    GcOutOrderDetailMapper gcOutOrderDetailMapper;
    @Autowired
    ProductService productService;
    @Autowired
    ProductMapper productMapper;
    @Autowired
    AlloOutService alloOutService;
    @Autowired
    AlloOutMapper alloOutMapper;
    @Autowired
    AlloOutSkuMapper alloOutSkuMapper;
    @Autowired
    WarehouseOutWarrantSkuMapper warehouseOutWarrantSkuMapper;
    @Autowired
    EbayWarehouseoutMapper ebayWarehouseoutMapper;
    @Autowired
    EbayOrderProfitMapper ebayOrderProfitMapper;
    @Autowired
    WinitRebateMoneyMapper winitRebateMoneyMapper;
    @Autowired
    EbayWarehouseoutSkuMapper ebayWarehouseoutSkuMapper;
    @Autowired
    WarehouseInWarrantSkuMapper warehouseInWarrantSkuMapper;
    @Autowired
    ExchangerateMapper exchangerateMapper;
    @Autowired
    EbayOrderSkuMapper ebayOrderSkuMapper;
    @Autowired
    ConsignmentMapper consignmentMapper;
    @Autowired
    FbaWarehouseStorageMapper fbaWarehouseStorageMapper;
    @Autowired
    WarehouseOutWarrantMapper warehouseOutWarrantMapper;
    @Autowired
    WinitOrderDetailSkuMapper winitOrderDetailSkuMapper;
    @Autowired
    GcOutOrderDetailSkuMapper gcOutOrderDetailSkuMapper;
    @Autowired
    EcOrderMapper ecOrderMapper;


    private QueClient client = new QueClient();
    private EcApiClient ecApiClient=new EcApiClient();

    @Override
    public JSONObject queryOrders(int pageNum, int size, String order, String sku, String startTime, String endTime) {
        int start = 0;
        if (pageNum != 0) {
            start = (pageNum - 1) * size;
        }
        if (startTime == null) {
            DateTime time = new DateTime();
            Date tempTime = time.minusDays(7).toDate();
            startTime = DateToStr(tempTime);
            endTime = DateToStr(time.toDate());
        }
        if (sku != null) {
            List<EbayOrderProfit> profits = ebayOrderProfitMapper.getAllList(start, size, order, sku, startTime, endTime);
            List<Map<String, Object>> list = ebayOrderProfitMapper.getCount(order, sku, startTime, endTime);
            BigInteger count = BigInteger.valueOf(0);
            for (Map<String, Object> map : list) {
                if (map.get("table").equals("eop")) {
                    count = (BigInteger) map.getOrDefault("rows", 0);
                }
            }
            for (EbayOrderProfit ebayOrderProfit : profits) {
                String orderID = ebayOrderProfit.getOrderid();
                EbayOrderSkuExample example = new EbayOrderSkuExample();
                example.createCriteria().andOrderidEqualTo(orderID);
                List<EbayOrderSku> skus = ebayOrderSkuMapper.selectByExample(example);
                ebayOrderProfit.setSkus(skus);
            }
            JSONObject requestjson = new JSONObject();
            requestjson.put("pageRow", size);
            return CommonUtil.successPage(requestjson, profits, count.intValue());
        }
        List<EbayOrderProfit> profits = ebayOrderProfitMapper.getAllList2(start, size, order, startTime, endTime);
        Integer count = ebayOrderProfitMapper.getCount2(order, startTime, endTime);
        for (EbayOrderProfit ebayOrderProfit : profits) {
            String orderID = ebayOrderProfit.getOrderid();
            EbayOrderSkuExample example = new EbayOrderSkuExample();
            example.createCriteria().andOrderidEqualTo(orderID);
            List<EbayOrderSku> skus = ebayOrderSkuMapper.selectByExample(example);
            ebayOrderProfit.setSkus(skus);
        }
        JSONObject requestjson = new JSONObject();
        requestjson.put("pageRow", size);
        return CommonUtil.successPage(requestjson, profits, count);

    }

    @Override
    public JSONObject queryDetailByOrder(List<EbayOrderSku> ebayOrderSkus) {

        return CommonUtil.successJson(ebayOrderSkus);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void synOrderData() {
        DateTime dateTime = new DateTime().withHourOfDay(0).withMinuteOfHour(0);
        for (int i = 8; i <= 41; i++) {
            int tempStart = i;
            int tempEnd = i + 1;
            DateTime startTime = dateTime.minusDays(tempStart);
            DateTime startTime2 = dateTime.minusDays(tempEnd);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            String start = sdf.format(startTime2.toDate());
            String end = sdf.format(startTime.toDate());
      /*      //获取当日订单
            getTodayOrder(start, end, 0);
            //获取当日关系表
            getRelationInfo(start, end, 0);
            //获取当日子订单
            getSubOrderInfo(start, end, 0);
            //获取今天包裹数
            getPackageInfo(start, end, 0);*/
            updateEcOrder(start,end,1);
        }
    }

    @Override
    public void circleAmount(String start, String end) {
     /*   EbayOrderProfitExample ebayOrderProfitExample=new EbayOrderProfitExample();
        ebayOrderProfitExample.createCriteria().andCostEqualTo(0.0);
        List<EbayOrderProfit> ebayOrderProfits=ebayOrderProfitMapper.selectByExample(ebayOrderProfitExample);
        List<String> ids=new ArrayList<>();
        for (EbayOrderProfit ebayOrderProfit:ebayOrderProfits){
            ids.add(ebayOrderProfit.getOrderid());
        }
        DatacaciquesOrderExample example=new DatacaciquesOrderExample();
        example.createCriteria().andDisplayorderidIsNotNull().andDisplayorderidIn(ids);
        List<DatacaciquesOrder> dataaciques=datacaciquesOrderMapper.selectByExample(example);*/
    /*    DatacaciquesOrderExample example=new DatacaciquesOrderExample();
        example.createCriteria().andDisplayorderidEqualTo("21-05655-94034");
        List<DatacaciquesOrder> dataaciques=datacaciquesOrderMapper.selectByExample(example);*/
        // List<DatacaciquesPackage> packages=datacaciquesPackageMapper.exportAllOrder(start,end);
        List<DatacaciquesOrder> dataaciques = datacaciquesOrderMapper.exportAllOrder(start, end);
        for (DatacaciquesOrder order : dataaciques) {
            //winit订单处理费
            Double totalHandlingFee = 0.00;
            //派送费用
            Double deliveryCosts = 0.00;
            //商品成本价
            Double cost = 0.00;
            //商品

            //平台费用
            Double packagePlatFee = 0.00;
            //订单金额
            Double amount = Double.valueOf(String.valueOf(order.getOrderamount()));
            //转账费
            Double pfTransferAmount = 0.00;
            //入库处理费
            Double paidAmount = 0.00;
            //出库单
            Double Fare = 0.00;
            //中仓处理费
            Double price = 0.00;
            //sku数量
            Integer skuamount = 0;
            //winit返利
            Double rebate = 0.0;
            //成本
            Double freight = 0.0;
            Long id = order.getId();
            DatacaciquesOrderPackageRelationExample datacaciquesOrderPackageRelationExample = new DatacaciquesOrderPackageRelationExample();
            datacaciquesOrderPackageRelationExample.createCriteria().andSysorderidEqualTo(id);
            List<DatacaciquesOrderPackageRelation> relations = datacaciquesOrderPackageRelationMapper.selectByExample(datacaciquesOrderPackageRelationExample);
            HashSet<Long> packages = new HashSet<>();
            List<EbayOrderSku> orderSkus = new ArrayList<>();
            //获取订单相关联的所有包裹
            for (DatacaciquesOrderPackageRelation relation : relations) {
                Long packageID = relation.getPackageid();
                packages.add(packageID);
            }
            Integer isCircled = order.getIscircled();
            if (isCircled == 1) {
                if (packages.size() == 1) {
                    for (DatacaciquesOrderPackageRelation relation : relations) {
                        Long packageID = relation.getPackageid();
                        DatacaciquesOrderPackageRelationExample relationExample = new DatacaciquesOrderPackageRelationExample();
                        relationExample.createCriteria().andSysorderidNotEqualTo(id).andPackageidEqualTo(packageID);
                        List<DatacaciquesOrderPackageRelation> circles = datacaciquesOrderPackageRelationMapper.selectByExample(relationExample);
                        for (DatacaciquesOrderPackageRelation datacaciquesOrderPackageRelation : circles) {
                            Long sysorderid = datacaciquesOrderPackageRelation.getSysorderid();
                            DatacaciquesOrder datacaciquesOrder = datacaciquesOrderMapper.selectByPrimaryKey(sysorderid);
                            datacaciquesOrder.setIscircled(2);
                            datacaciquesOrderMapper.updateByPrimaryKeySelective(datacaciquesOrder);
                        }
                    }
                } else {
                    throw new RuntimeException("合单计算异常");
                }
            } else if (isCircled == 2) {
                continue;
            }
            String currencycode = order.getCurrencycode();
            String createTime = order.getCreatetime();
            Date date = strToDateLong(createTime);
            DateTime dateTime = new DateTime(date);
            int month = dateTime.getMonthOfYear();
            Map<String, Double> map = exchangerateMapper.queryRateByMonth(currencycode);
            if (map == null) {
                continue;
            }
            Double gbp = map.get("month" + month);
            System.out.println("gbp:" + gbp);
            for (Long packageID : packages) {
                DatacaciquesPackage datacaciquesPackage = datacaciquesPackageMapper.selectByPrimaryKey(packageID);
                if (datacaciquesPackage == null) {
                    continue;
                }
                pfTransferAmount += datacaciquesPackage.getPftransferamount();
                //获取到包裹的平台费用
                if (datacaciquesPackage.getPackageplatfee() != null) {
                    packagePlatFee += datacaciquesPackage.getPackageplatfee();
                }
                String packageCode = datacaciquesPackage.getPackagecode();
                EbayWarehouseoutExample ebayWarehouseoutExample = new EbayWarehouseoutExample();
                ebayWarehouseoutExample.createCriteria().andPackageidEqualTo(packageID);
                List<EbayWarehouseout> ebayWarehouseouts = ebayWarehouseoutMapper.selectByExample(ebayWarehouseoutExample);
                if (ebayWarehouseouts == null || ebayWarehouseouts.size() == 0) {
                    continue;
                }
                EcOrderExample ecOrderExample=new EcOrderExample();
                ecOrderExample.createCriteria().andRefnoEqualTo(order.getDisplayorderid());
                EcOrder ecOrder=ecOrderMapper.selectByExample(ecOrderExample).get(0);
                String saleordercode=ecOrder.getSaleordercode();
                String type = ebayWarehouseouts.get(0).getType();
                String outboundOrderNum = null;
                if (type.equals("万邑通")) {
                    WinitOutOrderDetailExample detailExample = new WinitOutOrderDetailExample();
                    detailExample.createCriteria().andSellerordernoEqualTo(packageCode + "-XhB");
                    List<WinitOutOrderDetail> outOrderDetails = winitOutOrderDetailMapper.selectByExample(detailExample);
                    if (outOrderDetails==null||outOrderDetails.size()==0){
                        WinitOutOrderDetailExample detailExample2 = new WinitOutOrderDetailExample();
                        detailExample2.createCriteria().andSellerordernoEqualTo(saleordercode);
                        outOrderDetails = winitOutOrderDetailMapper.selectByExample(detailExample2);
                    }
                    WinitOutOrderDetail winitOutOrderDetail = outOrderDetails.get(0);
                    outboundOrderNum = winitOutOrderDetail.getOutboundordernum();
                    totalHandlingFee += winitOutOrderDetail.getHandlingfee();
                    if (winitOutOrderDetail.getDeliverycosts() != null) {
                        deliveryCosts += winitOutOrderDetail.getDeliverycosts();
                    }
                    String outboundordernum = winitOutOrderDetail.getOutboundordernum();
                    WinitRebateMoneyExample winitRebateMoneyExample = new WinitRebateMoneyExample();
                    winitRebateMoneyExample.createCriteria().andBusinessdocumentnoEqualTo(outboundordernum);
                    List<WinitRebateMoney> winitRebateMonies = winitRebateMoneyMapper.selectByExample(winitRebateMoneyExample);
                    for (WinitRebateMoney winitRebateMoney : winitRebateMonies) {
                        rebate += winitRebateMoney.getSourceamt();
                    }
                } else if (type.equals("谷仓")) {
                    GcOutOrderDetailExample gcOutOrderDetailExample = new GcOutOrderDetailExample();
                    gcOutOrderDetailExample.createCriteria().andReferenceNoEqualTo(packageCode + "-XhB");
                    List<GcOutOrderDetail> gcOutOrderDetailList = gcOutOrderDetailMapper.selectByExample(gcOutOrderDetailExample);
                    if (gcOutOrderDetailList==null||gcOutOrderDetailList.size()==0){
                        GcOutOrderDetailExample gcOutOrderDetailExample2 = new GcOutOrderDetailExample();
                        gcOutOrderDetailExample2.createCriteria().andReferenceNoEqualTo(saleordercode);
                        gcOutOrderDetailList = gcOutOrderDetailMapper.selectByExample(gcOutOrderDetailExample2);
                    }
                    GcOutOrderDetail gcOutOrderDetail = gcOutOrderDetailList.get(0);
                    if (gcOutOrderDetail.getTotalfee() != null) {
                        deliveryCosts += gcOutOrderDetail.getShipping();
                        totalHandlingFee += (gcOutOrderDetail.getTotalfee() - gcOutOrderDetail.getShipping());
                        rebate += 0 - gcOutOrderDetail.getTotalfee() * 0.11;
                    }
                    outboundOrderNum = gcOutOrderDetail.getOrderCode();
                }
                for (EbayWarehouseout ebayWarehouseout : ebayWarehouseouts) {
                    Integer productID = ebayWarehouseout.getProductid();
                    Product product = productMapper.selectByPrimaryKey(productID);
                    EbayOrderSku orderSku = new EbayOrderSku();
                    orderSku.setSku(product.getSkucode());
                    orderSku.setImgurl(product.getImgurl());
                    orderSku.setCnname(product.getCnname());
                    orderSku.setPackageid(packageID);
                    orderSku.setProductid(productID);
                    orderSku.setOrderid(order.getDisplayorderid());
                    orderSkus.add(orderSku);
                    if (type.equals("万邑通")) {
                        WinitOrderDetailSkuExample winitOrderDetailSkuExample = new WinitOrderDetailSkuExample();
                        winitOrderDetailSkuExample.createCriteria().andOrdernoEqualTo(outboundOrderNum).andSkuEqualTo(product.getSkucode());
                        List<WinitOrderDetailSku> winitOrderDetailSkus = winitOrderDetailSkuMapper.selectByExample(winitOrderDetailSkuExample);
                        int tempnum = winitOrderDetailSkus.stream().mapToInt(WinitOrderDetailSku::getQuantity).sum();
                        int outid = ebayWarehouseout.getOutid();
                        AlloOutExample alloOutExample = new AlloOutExample();
                        alloOutExample.createCriteria().andOutidEqualTo(outid);
                        List<AlloOut> alloOuts = alloOutMapper.selectByExample(alloOutExample);
                        if (alloOuts == null || alloOuts.size() == 0) {
                            throw new RuntimeException(order.getDisplayorderid() + "订单对应异常");
                        }
                        AlloOut alloOut = alloOuts.get(0);
                        Double allweight = alloOut.getAllweight();
                        Double allVolume = alloOut.getAllvolume();
                        Integer skuquantity = alloOut.getSkuquantity();
                        Double allfare = 0.00;
                        if (alloOut.getFare() != null) {
                            allfare += alloOut.getFare();
                        }
                        if (alloOut.getValuetax() != null) {
                            allfare += alloOut.getValuetax();
                        }


                        EbayWarehouseoutSkuExample ebayWarehouseoutSkuExample = new EbayWarehouseoutSkuExample();
                        ebayWarehouseoutSkuExample.createCriteria().andPackageidEqualTo(packageID).andProductidEqualTo(productID);
                        List<EbayWarehouseoutSku> warehouseoutSkus = ebayWarehouseoutSkuMapper.selectByExample(ebayWarehouseoutSkuExample);
                        int tempnum2 = 0;
                        for (EbayWarehouseoutSku ebayWarehouseoutSku : warehouseoutSkus) {
                            int quantity = ebayWarehouseoutSku.getQuantity();
                            tempnum2 += quantity;
                            cost += ebayWarehouseoutSku.getPrice() * quantity;
                            freight += ebayWarehouseoutSku.getFare() * quantity;
                        }
                        if (tempnum2 != tempnum) {

                            throw new RuntimeException("数量对应异常");

                        }
                        if (alloOut.getStoragefare() != null) {
                            Double storagefare = alloOut.getStoragefare();
                            paidAmount += tempnum * storagefare / skuquantity;
                        }
                        Double tempweight = (product.getRegisteredweight() / 1000) * tempnum;
                        Double tempVolume = product.getRegisteredlength() * product.getRegisteredwidth() * product.getRegisteredheight() * tempnum;
                        String headway = product.getHeadwaytype();
                        if ("空运".equals(headway) || "直邮".equals(headway)) {
                            if (allweight != 0.00) {
                                Fare += allfare * tempweight / allweight;
                            }
                            price += tempnum;
                        } else {
                            if (allVolume != 0.00) {
                                Fare += allfare * tempVolume / allVolume;
                            }
                            price += tempnum;
                        }
                    } else if (type.equals("谷仓")) {
                        GcOutOrderDetailSkuExample gcOutOrderDetailSkuExample = new GcOutOrderDetailSkuExample();
                        gcOutOrderDetailSkuExample.createCriteria().andOrderCodeEqualTo(outboundOrderNum).andProductSkuEqualTo(product.getSkucode());
                        List<GcOutOrderDetailSku> gcOutOrderDetailSkus = gcOutOrderDetailSkuMapper.selectByExample(gcOutOrderDetailSkuExample);
                        int tempnum = gcOutOrderDetailSkus.stream().mapToInt(GcOutOrderDetailSku::getQuantity).sum();
                        int outid = ebayWarehouseout.getOutid();
                        AlloOutExample alloOutExample = new AlloOutExample();
                        alloOutExample.createCriteria().andOutidEqualTo(outid);
                        List<AlloOut> alloOuts = alloOutMapper.selectByExample(alloOutExample);
                        if (alloOuts == null || alloOuts.size() == 0) {
                            throw new RuntimeException(order.getDisplayorderid() + "订单对应异常");
                        }
                        AlloOut alloOut = alloOuts.get(0);
                        Double allweight = alloOut.getAllweight();
                        Double allVolume = alloOut.getAllvolume();
                        Integer skuquantity = alloOut.getSkuquantity();
                        Double allfare = 0.00;
                        if (alloOut.getFare() != null) {
                            allfare += alloOut.getFare();
                        }
                        if (alloOut.getValuetax() != null) {
                            allfare += alloOut.getValuetax();
                        }
                        if (alloOut.getStoragefare() != null) {
                            Double storagefare = alloOut.getStoragefare();
                            paidAmount += tempnum * storagefare / skuquantity;
                        }
                        Double tempweight = (product.getRegisteredweight() / 1000) * tempnum;
                        Double tempVolume = product.getRegisteredlength() * product.getRegisteredwidth() * product.getRegisteredheight() * tempnum;
                        EbayWarehouseoutSkuExample ebayWarehouseoutSkuExample = new EbayWarehouseoutSkuExample();
                        ebayWarehouseoutSkuExample.createCriteria().andPackageidEqualTo(packageID).andProductidEqualTo(productID);
                        List<EbayWarehouseoutSku> warehouseoutSkus = ebayWarehouseoutSkuMapper.selectByExample(ebayWarehouseoutSkuExample);
                        int tempnum2 = 0;
                        for (EbayWarehouseoutSku ebayWarehouseoutSku : warehouseoutSkus) {
                            int quantity = ebayWarehouseoutSku.getQuantity();
                            tempnum2 += quantity;
                            cost += ebayWarehouseoutSku.getPrice() * quantity;
                            freight += ebayWarehouseoutSku.getFare() * quantity;
                        }
                        if (tempnum2 != tempnum) {
                            throw new RuntimeException("数量对应异常");
                        }
                        String headway = product.getHeadwaytype();
                        if ("空运".equals(headway) || "直邮".equals(headway)) {
                            if (allweight != 0.00) {
                                Fare += allfare * tempweight / allweight;
                            }
                            price +=  tempnum;
                        } else {
                            if (allVolume != 0.00) {
                                Fare += allfare * tempVolume / allVolume;
                            }
                            price += tempnum;
                        }
                    } else if (type.equals("鸟仓")) {
                        ConsignmentExample consignmentExample = new ConsignmentExample();
                        consignmentExample.createCriteria().andCustomIdentityReferenceEqualTo(packageCode + "-XhB");
                        List<Consignment> consignments = consignmentMapper.selectByExample(consignmentExample);
                        if (consignments==null||consignments.size()==0){
                            ConsignmentExample consignmentExample2 = new ConsignmentExample();
                            consignmentExample2.createCriteria().andCustomIdentityReferenceEqualTo(saleordercode);
                            consignments = consignmentMapper.selectByExample(consignmentExample2);
                        }
                        for (Consignment consignment : consignments) {
                            if (consignment.getTotalDeliveryFee() != null) {
                                deliveryCosts += consignment.getTotalDeliveryFee() / gbp;
                                totalHandlingFee += consignment.getTotalHandlingFee() / gbp;
                            }
                            int tempnum = consignment.getQuantity();
                            int outid = ebayWarehouseout.getOutid();
                            AlloOutExample alloOutExample = new AlloOutExample();
                            alloOutExample.createCriteria().andOutidEqualTo(outid);
                            List<AlloOut> alloOuts = alloOutMapper.selectByExample(alloOutExample);
                            if (alloOuts == null || alloOuts.size() == 0) {
                                throw new RuntimeException(order.getDisplayorderid() + "订单对应异常");
                            }
                            AlloOut alloOut = alloOuts.get(0);
                            Double allweight = alloOut.getAllweight();
                            Double allVolume = alloOut.getAllvolume();
                            Integer skuquantity = alloOut.getSkuquantity();
                            Double allfare = 0.00;
                            if (alloOut.getFare() != null) {
                                allfare += alloOut.getFare();
                            }
                            if (alloOut.getValuetax() != null) {
                                allfare += alloOut.getValuetax();
                            }
                            if (alloOut.getStoragefare() != null) {
                                Double storagefare = alloOut.getStoragefare();
                                paidAmount += tempnum * storagefare / skuquantity;
                            }
                            Double tempweight = (product.getRegisteredweight() / 1000) * tempnum;
                            Double tempVolume = product.getRegisteredlength() * product.getRegisteredwidth() * product.getRegisteredheight() * tempnum;
                            EbayWarehouseoutSkuExample ebayWarehouseoutSkuExample = new EbayWarehouseoutSkuExample();
                            ebayWarehouseoutSkuExample.createCriteria().andPackageidEqualTo(packageID);
                            List<EbayWarehouseoutSku> warehouseoutSkus = ebayWarehouseoutSkuMapper.selectByExample(ebayWarehouseoutSkuExample);
                            int tempnum2 = 0;
                            for (EbayWarehouseoutSku ebayWarehouseoutSku : warehouseoutSkus) {
                                int quantity = ebayWarehouseoutSku.getQuantity();
                                tempnum2 += quantity;
                                cost += ebayWarehouseoutSku.getPrice() * quantity;
                                freight += ebayWarehouseoutSku.getFare() * quantity;
                            }
                            if (tempnum2 != tempnum) {
                                throw new RuntimeException("数量对应异常");
                            }
                            String headway = product.getHeadwaytype();
                            if ("空运".equals(headway) || "直邮".equals(headway)) {
                                if (allweight != 0.00) {
                                    Fare += allfare * tempweight / allweight;
                                }
                                price +=  tempnum;
                            } else {
                                if (allVolume != 0.00) {
                                    Fare += allfare * tempVolume / allVolume;
                                }
                                price += tempnum;
                            }
                        }
                    }
                }


            }
            if (amount == 0.0 || Fare <= 0.0) {
                //金额为零，不计算
                continue;
            }
            Double profit = amount * gbp - packagePlatFee * gbp - pfTransferAmount * gbp - deliveryCosts * gbp - totalHandlingFee * gbp - paidAmount - Fare - price - cost - freight - rebate * gbp;
            EbayOrderProfit profit1 = new EbayOrderProfit();
            profit1.setOrderid(order.getDisplayorderid());
            profit1.setAmount(amount);
            profit1.setCost(cost);
            profit1.setProfit(profit);
            profit1.setFare(Fare);
            profit1.setPaidamount(paidAmount);
            profit1.setDeliverycosts(deliveryCosts);
            profit1.setHandlingfee(totalHandlingFee);
            profit1.setPackageplatfee(packagePlatFee);
            profit1.setPftransferamount(pfTransferAmount);
            profit1.setPrice(price);
            profit1.setRebate(rebate);
            profit1.setCreatetime(createTime);
            profit1.setRate(gbp);
            profit1.setGbp(currencycode);
            Double profita = amount * gbp - packagePlatFee * gbp - pfTransferAmount * gbp;
            Double profitb = profita - Fare - totalHandlingFee * gbp - paidAmount - deliveryCosts * gbp - rebate * gbp;
            Double profitc = profitb - cost - freight - price;
            profit1.setProfita(profita);
            profit1.setProfitb(profitb);
            profit1.setProfitc(profitc);
            profit1.setProfitcrate(profitc / (amount * gbp));
            profit1.setCostrate((cost + freight) / (amount * gbp));
            profit1.setFreight(freight);
            EbayOrderProfit profit2 = ebayOrderProfitMapper.selectByPrimaryKey(order.getDisplayorderid());
            if (profit2 == null) {
                ebayOrderProfitMapper.insertSelective(profit1);
            } else {
                ebayOrderProfitMapper.updateByPrimaryKeySelective(profit1);
            }

            for (EbayOrderSku sku : orderSkus) {
                EbayOrderSkuExample ebayOrderSkuExample = new EbayOrderSkuExample();
                ebayOrderSkuExample.createCriteria().andSkuEqualTo(sku.getSku()).andOrderidEqualTo(sku.getOrderid());
                List<EbayOrderSku> skus = ebayOrderSkuMapper.selectByExample(ebayOrderSkuExample);
                if (skus == null || skus.size() == 0) {
                    ebayOrderSkuMapper.insertSelective(sku);
                } else if (skus.size() > 1) {
                    ebayOrderSkuMapper.deleteByExample(ebayOrderSkuExample);
                    ebayOrderSkuMapper.insertSelective(sku);
                }
            }
        }
    }

    @Override
    public void circleEcAmount(String start, String end) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        EcOrderExample ecOrderExample=new EcOrderExample();

       /* EbayOrderProfitExample ebayOrderProfitExample=new EbayOrderProfitExample();
        ebayOrderProfitExample.createCriteria().andCostEqualTo(0.0).andCreatetimeBetween(start,end);
        List<EbayOrderProfit> ebayOrderProfits=ebayOrderProfitMapper.selectByExample(ebayOrderProfitExample);
        List<String> ids=new ArrayList<>();
        for (EbayOrderProfit ebayOrderProfit:ebayOrderProfits){
            ids.add(ebayOrderProfit.getOrderid());
        }*/
        try {
            Date str = sdf.parse(start);
            Date endstr = sdf.parse(end);
            ecOrderExample.createCriteria().andCreateddateBetween(str,endstr);
            //ecOrderExample.createCriteria().andRefnoIn(ids);
            List<EcOrder> ecOrders=ecOrderMapper.selectByExample(ecOrderExample);
            for (EcOrder ecOrder:ecOrders){
                //winit订单处理费
                Double totalHandlingFee = 0.00;
                //派送费用
                Double deliveryCosts = 0.00;
                //商品成本价
                Double cost = 0.00;
                //商品

                //平台费用
                Double packagePlatFee = 0.00;
                //订单金额
                Double amount = Double.valueOf(ecOrder.getAmountpaid());
                //转账费
                Double pfTransferAmount = 0.00;
                //入库处理费
                Double paidAmount = 0.00;
                //出库单
                Double Fare = 0.00;
                //中仓处理费
                Double price = 0.00;
                //sku数量
                Integer skuamount = 0;
                //winit返利
                Double rebate = 0.0;
                //成本
                Double freight = 0.0;
                List<EbayOrderSku> orderSkus = new ArrayList<>();
                Long packageID= Long.valueOf(ecOrder.getOrderId());
                String currencycode = ecOrder.getCurrency();
                Date date = ecOrder.getCreateddate();
                String createTime=sdf.format(date);
                DateTime dateTime = new DateTime(date);
                int month = dateTime.getMonthOfYear();
                Map<String, Double> map = exchangerateMapper.queryRateByMonth(currencycode);
                if (map == null) {
                    continue;
                }
                Double gbp = map.get("month" + month);
                System.out.println("gbp:" + gbp);
                pfTransferAmount +=  ecOrder.getPlatformfeetotal();
                packagePlatFee +=ecOrder.getFinalvaluefeetotal();
                EbayWarehouseoutExample ebayWarehouseoutExample = new EbayWarehouseoutExample();
                ebayWarehouseoutExample.createCriteria().andPackageidEqualTo(packageID);
                List<EbayWarehouseout> ebayWarehouseouts = ebayWarehouseoutMapper.selectByExample(ebayWarehouseoutExample);
                if (ebayWarehouseouts == null || ebayWarehouseouts.size() == 0) {
                    continue;
                }
                String type = ebayWarehouseouts.get(0).getType();
                String outboundOrderNum = null;
                String saleordercode=ecOrder.getSaleordercode();
                if (type.equals("万邑通")) {
                    WinitOutOrderDetailExample detailExample2 = new WinitOutOrderDetailExample();
                    detailExample2.createCriteria().andSellerordernoEqualTo(saleordercode).andDeliverycostsGreaterThan(0.0);
                    List<WinitOutOrderDetail> outOrderDetails = winitOutOrderDetailMapper.selectByExample(detailExample2);
                    WinitOutOrderDetail winitOutOrderDetail = outOrderDetails.get(0);
                    outboundOrderNum = winitOutOrderDetail.getOutboundordernum();
                    totalHandlingFee += winitOutOrderDetail.getHandlingfee();
                    if (winitOutOrderDetail.getDeliverycosts() != null) {
                        deliveryCosts += winitOutOrderDetail.getDeliverycosts();
                    }
                    String outboundordernum = winitOutOrderDetail.getOutboundordernum();
                    WinitRebateMoneyExample winitRebateMoneyExample = new WinitRebateMoneyExample();
                    winitRebateMoneyExample.createCriteria().andBusinessdocumentnoEqualTo(outboundordernum);
                    List<WinitRebateMoney> winitRebateMonies = winitRebateMoneyMapper.selectByExample(winitRebateMoneyExample);
                    for (WinitRebateMoney winitRebateMoney : winitRebateMonies) {
                        rebate += winitRebateMoney.getSourceamt();
                    }
                }else if (type.equals("谷仓")) {
                    GcOutOrderDetailExample gcOutOrderDetailExample2 = new GcOutOrderDetailExample();
                    gcOutOrderDetailExample2.createCriteria().andReferenceNoEqualTo(saleordercode).andShippingGreaterThan(0.0f);
                    List<GcOutOrderDetail> gcOutOrderDetailList = gcOutOrderDetailMapper.selectByExample(gcOutOrderDetailExample2);
                    GcOutOrderDetail gcOutOrderDetail = gcOutOrderDetailList.get(0);
                    if (gcOutOrderDetail.getTotalfee() != null) {
                        deliveryCosts += gcOutOrderDetail.getShipping();
                        totalHandlingFee += (gcOutOrderDetail.getTotalfee() - gcOutOrderDetail.getShipping());
                        rebate += 0 - gcOutOrderDetail.getTotalfee() * 0.11;
                    }
                    outboundOrderNum = gcOutOrderDetail.getOrderCode();
                }
                for (EbayWarehouseout ebayWarehouseout : ebayWarehouseouts) {
                    Integer productID = ebayWarehouseout.getProductid();
                    Product product = productMapper.selectByPrimaryKey(productID);
                    EbayOrderSku orderSku = new EbayOrderSku();
                    orderSku.setSku(product.getSkucode());
                    orderSku.setImgurl(product.getImgurl());
                    orderSku.setCnname(product.getCnname());
                    orderSku.setPackageid(packageID);
                    orderSku.setProductid(productID);
                    orderSku.setOrderid(ecOrder.getRefno());
                    orderSkus.add(orderSku);
                    if (type.equals("万邑通")) {
                        WinitOrderDetailSkuExample winitOrderDetailSkuExample = new WinitOrderDetailSkuExample();
                        winitOrderDetailSkuExample.createCriteria().andOrdernoEqualTo(outboundOrderNum).andSkuEqualTo(product.getSkucode());
                        List<WinitOrderDetailSku> winitOrderDetailSkus = winitOrderDetailSkuMapper.selectByExample(winitOrderDetailSkuExample);
                        int tempnum = winitOrderDetailSkus.stream().mapToInt(WinitOrderDetailSku::getQuantity).sum();
                        int outid = ebayWarehouseout.getOutid();
                        AlloOutExample alloOutExample = new AlloOutExample();
                        alloOutExample.createCriteria().andOutidEqualTo(outid);
                        List<AlloOut> alloOuts = alloOutMapper.selectByExample(alloOutExample);
                        if (alloOuts == null || alloOuts.size() == 0) {
                            throw new RuntimeException(ecOrder.getRefno() + "订单对应异常");
                        }
                        AlloOut alloOut = alloOuts.get(0);
                        Double allweight = alloOut.getAllweight();
                        Double allVolume = alloOut.getAllvolume();
                        Integer skuquantity = alloOut.getSkuquantity();
                        Double allfare = 0.00;
                        if (alloOut.getFare() != null) {
                            allfare += alloOut.getFare();
                        }
                        if (alloOut.getValuetax() != null) {
                            allfare += alloOut.getValuetax();
                        }


                        EbayWarehouseoutSkuExample ebayWarehouseoutSkuExample = new EbayWarehouseoutSkuExample();
                        ebayWarehouseoutSkuExample.createCriteria().andPackageidEqualTo(packageID).andProductidEqualTo(productID);
                        List<EbayWarehouseoutSku> warehouseoutSkus = ebayWarehouseoutSkuMapper.selectByExample(ebayWarehouseoutSkuExample);
                        int tempnum2 = 0;
                        for (EbayWarehouseoutSku ebayWarehouseoutSku : warehouseoutSkus) {
                            int quantity = ebayWarehouseoutSku.getQuantity();
                            tempnum2 += quantity;
                            cost += ebayWarehouseoutSku.getPrice() * quantity;
                            freight += ebayWarehouseoutSku.getFare() * quantity;
                        }
                        if (tempnum2 != tempnum) {

                            throw new RuntimeException("数量对应异常");

                        }
                        if (alloOut.getStoragefare() != null) {
                            Double storagefare = alloOut.getStoragefare();
                            paidAmount += tempnum * storagefare / skuquantity;
                        }
                        Double tempweight = (product.getRegisteredweight() / 1000) * tempnum;
                        Double tempVolume = product.getRegisteredlength() * product.getRegisteredwidth() * product.getRegisteredheight() * tempnum;
                        String headway = product.getHeadwaytype();
                        if ("空运".equals(headway) || "直邮".equals(headway)) {
                            if (allweight != 0.00) {
                                Fare += allfare * tempweight / allweight;
                            }
                            price += tempnum;
                        } else {
                            if (allVolume != 0.00) {
                                Fare += allfare * tempVolume / allVolume;
                            }
                            price += tempnum;
                        }
                    } else if (type.equals("谷仓")) {
                        GcOutOrderDetailSkuExample gcOutOrderDetailSkuExample = new GcOutOrderDetailSkuExample();
                        gcOutOrderDetailSkuExample.createCriteria().andOrderCodeEqualTo(outboundOrderNum).andProductSkuEqualTo(product.getSkucode());
                        List<GcOutOrderDetailSku> gcOutOrderDetailSkus = gcOutOrderDetailSkuMapper.selectByExample(gcOutOrderDetailSkuExample);
                        int tempnum = gcOutOrderDetailSkus.stream().mapToInt(GcOutOrderDetailSku::getQuantity).sum();
                        int outid = ebayWarehouseout.getOutid();
                        AlloOutExample alloOutExample = new AlloOutExample();
                        alloOutExample.createCriteria().andOutidEqualTo(outid);
                        List<AlloOut> alloOuts = alloOutMapper.selectByExample(alloOutExample);
                        if (alloOuts == null || alloOuts.size() == 0) {
                            throw new RuntimeException(ecOrder.getRefno() + "订单对应异常");
                        }
                        AlloOut alloOut = alloOuts.get(0);
                        Double allweight = alloOut.getAllweight();
                        Double allVolume = alloOut.getAllvolume();
                        Integer skuquantity = alloOut.getSkuquantity();
                        Double allfare = 0.00;
                        if (alloOut.getFare() != null) {
                            allfare += alloOut.getFare();
                        }
                        if (alloOut.getValuetax() != null) {
                            allfare += alloOut.getValuetax();
                        }
                        if (alloOut.getStoragefare() != null) {
                            Double storagefare = alloOut.getStoragefare();
                            paidAmount += tempnum * storagefare / skuquantity;
                        }
                        Double tempweight = (product.getRegisteredweight() / 1000) * tempnum;
                        Double tempVolume = product.getRegisteredlength() * product.getRegisteredwidth() * product.getRegisteredheight() * tempnum;
                        EbayWarehouseoutSkuExample ebayWarehouseoutSkuExample = new EbayWarehouseoutSkuExample();
                        ebayWarehouseoutSkuExample.createCriteria().andPackageidEqualTo(packageID).andProductidEqualTo(productID);
                        List<EbayWarehouseoutSku> warehouseoutSkus = ebayWarehouseoutSkuMapper.selectByExample(ebayWarehouseoutSkuExample);
                        int tempnum2 = 0;
                        for (EbayWarehouseoutSku ebayWarehouseoutSku : warehouseoutSkus) {
                            int quantity = ebayWarehouseoutSku.getQuantity();
                            tempnum2 += quantity;
                            cost += ebayWarehouseoutSku.getPrice() * quantity;
                            freight += ebayWarehouseoutSku.getFare() * quantity;
                        }
                        if (tempnum2 != tempnum) {
                            throw new RuntimeException("数量对应异常");
                        }
                        String headway = product.getHeadwaytype();
                        if ("空运".equals(headway) || "直邮".equals(headway)) {
                            if (allweight != 0.00) {
                                Fare += allfare * tempweight / allweight;
                            }
                            price +=  tempnum;
                        } else {
                            if (allVolume != 0.00) {
                                Fare += allfare * tempVolume / allVolume;
                            }
                            price += tempnum;
                        }
                    } else if (type.equals("鸟仓")) {
                        ConsignmentExample consignmentExample2 = new ConsignmentExample();
                        consignmentExample2.createCriteria().andCustomIdentityReferenceEqualTo(saleordercode);
                        List<Consignment> consignments = consignmentMapper.selectByExample(consignmentExample2);
                        for (Consignment consignment : consignments) {
                            if (consignment.getTotalDeliveryFee() != null) {
                                deliveryCosts += consignment.getTotalDeliveryFee() / gbp;
                                totalHandlingFee += consignment.getTotalHandlingFee() / gbp;
                            }
                            int tempnum = consignment.getQuantity();
                            int outid = ebayWarehouseout.getOutid();
                            AlloOutExample alloOutExample = new AlloOutExample();
                            alloOutExample.createCriteria().andOutidEqualTo(outid);
                            List<AlloOut> alloOuts = alloOutMapper.selectByExample(alloOutExample);
                            if (alloOuts == null || alloOuts.size() == 0) {
                                throw new RuntimeException(ecOrder.getRefno() + "订单对应异常");
                            }
                            AlloOut alloOut = alloOuts.get(0);
                            Double allweight = alloOut.getAllweight();
                            Double allVolume = alloOut.getAllvolume();
                            Integer skuquantity = alloOut.getSkuquantity();
                            Double allfare = 0.00;
                            if (alloOut.getFare() != null) {
                                allfare += alloOut.getFare();
                            }
                            if (alloOut.getValuetax() != null) {
                                allfare += alloOut.getValuetax();
                            }
                            if (alloOut.getStoragefare() != null) {
                                Double storagefare = alloOut.getStoragefare();
                                paidAmount += tempnum * storagefare / skuquantity;
                            }
                            Double tempweight = (product.getRegisteredweight() / 1000) * tempnum;
                            Double tempVolume = product.getRegisteredlength() * product.getRegisteredwidth() * product.getRegisteredheight() * tempnum;
                            EbayWarehouseoutSkuExample ebayWarehouseoutSkuExample = new EbayWarehouseoutSkuExample();
                            ebayWarehouseoutSkuExample.createCriteria().andPackageidEqualTo(packageID);
                            List<EbayWarehouseoutSku> warehouseoutSkus = ebayWarehouseoutSkuMapper.selectByExample(ebayWarehouseoutSkuExample);
                            int tempnum2 = 0;
                            for (EbayWarehouseoutSku ebayWarehouseoutSku : warehouseoutSkus) {
                                int quantity = ebayWarehouseoutSku.getQuantity();
                                tempnum2 += quantity;
                                cost += ebayWarehouseoutSku.getPrice() * quantity;
                                freight += ebayWarehouseoutSku.getFare() * quantity;
                            }
                            if (tempnum2 != tempnum) {
                                throw new RuntimeException("数量对应异常");
                            }
                            String headway = product.getHeadwaytype();
                            if ("空运".equals(headway) || "直邮".equals(headway)) {
                                if (allweight != 0.00) {
                                    Fare += allfare * tempweight / allweight;
                                }
                                price +=  tempnum;
                            } else {
                                if (allVolume != 0.00) {
                                    Fare += allfare * tempVolume / allVolume;
                                }
                                price += tempnum;
                            }
                        }
                    }
                    if (amount == 0.0 || Fare <= 0.0) {
                        //金额为零，不计算
                        continue;
                    }
                    Double profit = amount * gbp - packagePlatFee * gbp - pfTransferAmount * gbp - deliveryCosts * gbp - totalHandlingFee * gbp - paidAmount - Fare - price - cost - freight - rebate * gbp;
                    EbayOrderProfit profit1 = new EbayOrderProfit();
                    profit1.setOrderid(ecOrder.getRefno());
                    profit1.setAmount(amount);
                    profit1.setCost(cost);
                    profit1.setProfit(profit);
                    profit1.setFare(Fare);
                    profit1.setPaidamount(paidAmount);
                    profit1.setDeliverycosts(deliveryCosts);
                    profit1.setHandlingfee(totalHandlingFee);
                    profit1.setPackageplatfee(packagePlatFee);
                    profit1.setPftransferamount(pfTransferAmount);
                    profit1.setPrice(price);
                    profit1.setRebate(rebate);
                    profit1.setCreatetime(createTime);
                    profit1.setRate(gbp);
                    profit1.setGbp(currencycode);
                    Double profita = amount * gbp - packagePlatFee * gbp - pfTransferAmount * gbp;
                    Double profitb = profita - Fare - totalHandlingFee * gbp - paidAmount - deliveryCosts * gbp - rebate * gbp;
                    Double profitc = profitb - cost - freight - price;
                    profit1.setProfita(profita);
                    profit1.setProfitb(profitb);
                    profit1.setProfitc(profitc);
                    profit1.setProfitcrate(profitc / (amount * gbp));
                    profit1.setCostrate((cost + freight) / (amount * gbp));
                    profit1.setFreight(freight);
                    EbayOrderProfit profit2 = ebayOrderProfitMapper.selectByPrimaryKey(ecOrder.getRefno());
                    if (profit2 == null) {
                        ebayOrderProfitMapper.insertSelective(profit1);
                    } else {
                        ebayOrderProfitMapper.updateByPrimaryKeySelective(profit1);
                    }

                    for (EbayOrderSku sku : orderSkus) {
                        EbayOrderSkuExample ebayOrderSkuExample = new EbayOrderSkuExample();
                        ebayOrderSkuExample.createCriteria().andSkuEqualTo(sku.getSku()).andOrderidEqualTo(sku.getOrderid());
                        List<EbayOrderSku> skus = ebayOrderSkuMapper.selectByExample(ebayOrderSkuExample);
                        if (skus == null || skus.size() == 0) {
                            ebayOrderSkuMapper.insertSelective(sku);
                        } else if (skus.size() > 1) {
                            ebayOrderSkuMapper.deleteByExample(ebayOrderSkuExample);
                            ebayOrderSkuMapper.insertSelective(sku);
                        }
                    }

                }
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    @Override

    public void createRelationInAndOut(String start, String end) {
        //首先拿到所有的出库单
        DatacaciquesPackageExample packageExample = new DatacaciquesPackageExample();
        packageExample.createCriteria().andPackageidIsNotNull().andFlagEqualTo(0).andCreatetimeLessThan(end).andCreatetimeGreaterThan(start);
        packageExample.setOrderByClause("createTime ASC");
        List<DatacaciquesPackage> packages = datacaciquesPackageMapper.selectByExample(packageExample);
        for (DatacaciquesPackage datacaciquesPackage : packages) {
            String code = datacaciquesPackage.getPackagecode();
            String datacaciquesPackageCreatetime = datacaciquesPackage.getCreatetime();
            Date createTime = strToDateLong(datacaciquesPackageCreatetime);
            String packageorder = code + "-XhB";
            //根据出库单号，首先判断是万邑通还是谷仓
            WinitOutOrderDetailExample detailExample = new WinitOutOrderDetailExample();
            detailExample.createCriteria().andSellerordernoEqualTo(packageorder).andDeliverycostsNotEqualTo(0.0);
            List<WinitOutOrderDetail> outOrderDetails = winitOutOrderDetailMapper.selectByExample(detailExample);
            if (outOrderDetails == null || outOrderDetails.size() == 0) {
                //判断是否为谷仓订单
                GcOutOrderDetailExample gcOutOrderDetailExample = new GcOutOrderDetailExample();
                gcOutOrderDetailExample.createCriteria().andReferenceNoEqualTo(packageorder);
                List<GcOutOrderDetail> gcOutOrderDetails = gcOutOrderDetailMapper.selectByExample(gcOutOrderDetailExample);
                if (gcOutOrderDetails != null && gcOutOrderDetails.size() > 0) {
                    updateGoodPackage(datacaciquesPackage, createTime, gcOutOrderDetails);
                    continue;
                }
                //判断是否为鸟仓出库单
                ConsignmentExample consignmentExample = new ConsignmentExample();
                consignmentExample.createCriteria().andCustomIdentityReferenceEqualTo(packageorder);
                List<Consignment> consignments = consignmentMapper.selectByExample(consignmentExample);
                if (consignments != null && consignments.size() == 1) {
                    updateConsignPackage(datacaciquesPackage, createTime, consignments);
                    continue;
                }
               // createEcRelation(datacaciquesPackage, createTime);
            } else {
                WinitOutOrderDetail winitOutOrderDetail = outOrderDetails.get(0);
                updateWinitPackage(datacaciquesPackage, createTime, winitOutOrderDetail);


            }
        }
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void createEcRelationInAndOut(String start, String end) {
        EcOrderExample ecOrderExample=new EcOrderExample();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try { 
            Date str = sdf.parse(start);
            Date endstr = sdf.parse(end);
            ecOrderExample.createCriteria().andCreateddateBetween(str,endstr).andPlatformshipstatusEqualTo(1);
            //ecOrderExample.createCriteria().andRefnoEqualTo("01-06162-01372");
            List<EcOrder> ecOrders=ecOrderMapper.selectByExample(ecOrderExample);
            Map<String,List<EcOrder>> map=ecOrders.stream().collect(Collectors.groupingBy(EcOrder::getSaleordercode));
            for(Map.Entry<String,List<EcOrder>> entry:map.entrySet()){
                String packageID=entry.getKey();
                List<EcOrder> ecOrderList=entry.getValue();
                EcOrder ecOrder=ecOrderList.get(0);
                DatacaciquesPackage datacaciquesPackage=new DatacaciquesPackage();
                datacaciquesPackage.setPackageid(Long.valueOf(ecOrder.getOrderId()));
                Date createTime=ecOrder.getCreateddate();
                WinitOutOrderDetailExample detailExample2 = new WinitOutOrderDetailExample();
                detailExample2.createCriteria().andSellerordernoEqualTo(packageID).andDeliverycostsNotEqualTo(0.0);
                List<WinitOutOrderDetail> outOrderDetails2 = winitOutOrderDetailMapper.selectByExample(detailExample2);
                if (outOrderDetails2 == null || outOrderDetails2.size() == 0) {
                    GcOutOrderDetailExample gcOutOrderDetailExample2 = new GcOutOrderDetailExample();
                     gcOutOrderDetailExample2.createCriteria().andReferenceNoEqualTo(packageID).andShippingNotEqualTo(0.0f);
                    List<GcOutOrderDetail> gcOutOrderDetails2 = gcOutOrderDetailMapper.selectByExample(gcOutOrderDetailExample2);
                    if (gcOutOrderDetails2 != null && gcOutOrderDetails2.size() > 0) {
                        updateGoodPackage(datacaciquesPackage, createTime, gcOutOrderDetails2);
                        ecOrder.setPlatformshipstatus(4);
                        ecOrderMapper.updateByPrimaryKeySelective(ecOrder);
                        continue;
                    }
                    //判断是否为鸟仓出库单
                    ConsignmentExample consignmentExample2 = new ConsignmentExample();
                    consignmentExample2.createCriteria().andCustomIdentityReferenceEqualTo(packageID);
                    List<Consignment> consignments2 = consignmentMapper.selectByExample(consignmentExample2);
                    if (consignments2 != null && consignments2.size() == 1) {
                        updateConsignPackage(datacaciquesPackage, createTime, consignments2);
                        ecOrder.setPlatformshipstatus(4);
                        ecOrderMapper.updateByPrimaryKeySelective(ecOrder);
                        continue;
                    }
                }else {
                    WinitOutOrderDetail winitOutOrderDetail = outOrderDetails2.get(0);
                    updateWinitPackage(datacaciquesPackage, createTime, winitOutOrderDetail);
                    ecOrder.setPlatformshipstatus(4);
                    ecOrderMapper.updateByPrimaryKeySelective(ecOrder);
                }

            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private void createEcRelation(DatacaciquesPackage datacaciquesPackage, Date createTime) {
        Long packageID=datacaciquesPackage.getPackageid();
        DatacaciquesOrderPackageRelationExample relationExample=new DatacaciquesOrderPackageRelationExample();
        relationExample.createCriteria().andPackageidEqualTo(packageID);
        DatacaciquesOrderPackageRelation relation=datacaciquesOrderPackageRelationMapper.selectByExample(relationExample).get(0);
        Long sysID=relation.getSysorderid();
        DatacaciquesOrder datacaciquesOrder=datacaciquesOrderMapper.selectByPrimaryKey(sysID);
        String platOrder=datacaciquesOrder.getDisplayorderid();
        EcOrderExample ecOrderExample=new EcOrderExample();
        ecOrderExample.createCriteria().andRefnoEqualTo(platOrder);
        List<EcOrder> ecOrders=ecOrderMapper.selectByExample(ecOrderExample);
        if (ecOrders==null||ecOrders.size() != 1){
            return;
        }
        EcOrder ecOrder=ecOrders.get(0);
        String saleOrder=ecOrder.getSaleordercode();
        WinitOutOrderDetailExample detailExample2 = new WinitOutOrderDetailExample();
        detailExample2.createCriteria().andSellerordernoEqualTo(saleOrder);
        List<WinitOutOrderDetail> outOrderDetails2 = winitOutOrderDetailMapper.selectByExample(detailExample2);
        if (outOrderDetails2 == null || outOrderDetails2.size() == 0) {
            GcOutOrderDetailExample gcOutOrderDetailExample2 = new GcOutOrderDetailExample();
            gcOutOrderDetailExample2.createCriteria().andReferenceNoEqualTo(saleOrder);
            List<GcOutOrderDetail> gcOutOrderDetails2 = gcOutOrderDetailMapper.selectByExample(gcOutOrderDetailExample2);
            if (gcOutOrderDetails2 != null && gcOutOrderDetails2.size() > 0) {
                updateGoodPackage(datacaciquesPackage, createTime, gcOutOrderDetails2);
                return;
            }
            //判断是否为鸟仓出库单
            ConsignmentExample consignmentExample2 = new ConsignmentExample();
            consignmentExample2.createCriteria().andCustomIdentityReferenceEqualTo(saleOrder);
            List<Consignment> consignments2 = consignmentMapper.selectByExample(consignmentExample2);
            if (consignments2 != null && consignments2.size() == 1) {
                updateConsignPackage(datacaciquesPackage, createTime, consignments2);
                return;
            }
        }else {
            WinitOutOrderDetail winitOutOrderDetail = outOrderDetails2.get(0);
            updateWinitPackage(datacaciquesPackage, createTime, winitOutOrderDetail);
        }
    }

    private void updateConsignPackage(DatacaciquesPackage datacaciquesPackage, Date createTime, List<Consignment> consignments) {
        for (Consignment consignment : consignments) {
            Integer quantity = consignment.getQuantity();
            String sku = consignment.getProductClientRef();
            String status = consignment.getStatus();
            if (!status.equals("FINISHED")) {
                return;
            }
            Product product = productService.queryBySku(sku);
            if (product == null) {
                return;
            }
            int productid = product.getProductid();
            List<AlloOutSku> alloOutSkus = alloOutService.getSkuById(productid);
            if (alloOutSkus == null || alloOutSkus.size() == 0) {
                return;
                //throw new RuntimeException(product.getSkucode() + "找不到出库单");
            }
            List<Integer> outids = new ArrayList<>();
            for (AlloOutSku alloOutSku : alloOutSkus) {
                int id = alloOutSku.getAlloid();
                outids.add(id);
            }
            AlloOutExample alloOutExample = new AlloOutExample();
            alloOutExample.createCriteria().andAlloidIn(outids).andWarehouseidEqualTo((long) 102200).andArrivetimeIsNotNull();
            alloOutExample.setOrderByClause("arriveTime ASC");
            List<AlloOut> alloOuts = alloOutMapper.selectByExample(alloOutExample);
            if (alloOuts == null || alloOuts.size() == 0) {
                return;
            }
            boolean isActive = false;
            boolean isExist = false;
            for (AlloOut alloOut : alloOuts) {
                Integer alloutID = alloOut.getAlloid();
                if (alloOut.getFare() != null && alloOut.getFare() != 0.0) {
                    AlloOutSkuExample alloOutSkuExample = new AlloOutSkuExample();
                    alloOutSkuExample.createCriteria().andProductidEqualTo(productid).andAlloidEqualTo(alloutID);
                    List<AlloOutSku> alloOutSkus1 = alloOutSkuMapper.selectByExample(alloOutSkuExample);
                    for (AlloOutSku alloOutSku : alloOutSkus1) {
                        if (!updateAlloSku(quantity, true, alloOutSku)) continue;
                        isActive = true;
                        datacaciquesPackage.setFlag(1);
                        Long packageid = datacaciquesPackage.getPackageid();
                        EbayWarehouseoutExample ebayWarehouseoutExample = new EbayWarehouseoutExample();
                        ebayWarehouseoutExample.createCriteria().andPackageidEqualTo(packageid).andSkuEqualTo(sku);
                        List<EbayWarehouseout> warehouseouts = ebayWarehouseoutMapper.selectByExample(ebayWarehouseoutExample);
                        if (warehouseouts == null || warehouseouts.size() == 0) {
                            updateEbayWarehouseOut(createTime, sku, productid, alloOut, packageid, null, "鸟仓", quantity);
                        } else if (warehouseouts.size() == 1) {
                            updateEbayWarehouseOut(createTime, sku, productid, alloOut, packageid, warehouseouts.get(0), "鸟仓", quantity);
                        }
                        datacaciquesPackageMapper.updateByPrimaryKeySelective(datacaciquesPackage);
                        isExist = true;
                        break;
                    }
                    if (isExist) {
                        break;
                    }
                }
            }
            if (!isActive) {
                int size = alloOuts.size();
                isExist = false;
                for (int i = size - 1; i >= 0; i--) {
                    AlloOut alloOut = alloOuts.get(i);
                    Integer alloutID = alloOut.getAlloid();
                    if (alloOut.getFare() != null && alloOut.getFare() != 0.0) {
                        AlloOutSkuExample alloOutSkuExample = new AlloOutSkuExample();
                        alloOutSkuExample.createCriteria().andProductidEqualTo(productid).andAlloidEqualTo(alloutID);
                        List<AlloOutSku> alloOutSkus1 = alloOutSkuMapper.selectByExample(alloOutSkuExample);
                        for (AlloOutSku alloOutSku : alloOutSkus1) {
                            updateAlloSku(quantity, false, alloOutSku);
                            datacaciquesPackage.setFlag(1);
                            Long packageid = datacaciquesPackage.getPackageid();
                            EbayWarehouseoutExample ebayWarehouseoutExample = new EbayWarehouseoutExample();
                            ebayWarehouseoutExample.createCriteria().andPackageidEqualTo(packageid).andSkuEqualTo(sku);
                            List<EbayWarehouseout> warehouseouts = ebayWarehouseoutMapper.selectByExample(ebayWarehouseoutExample);
                            if (warehouseouts == null || warehouseouts.size() == 0) {
                                updateEbayWarehouseOut(createTime, sku, productid, alloOut, packageid, null, "鸟仓", quantity);
                            } else if (warehouseouts.size() == 1) {
                                updateEbayWarehouseOut(createTime, sku, productid, alloOut, packageid, warehouseouts.get(0), "鸟仓", quantity);
                            }
                            datacaciquesPackageMapper.updateByPrimaryKeySelective(datacaciquesPackage);
                            isExist = true;
                            break;
                        }
                        if (isExist) {
                            break;
                        }
                    }
                }
            }
        }

    }

    @Override
    public Map<String, String> getTodayAmount() {
        DatacaciquesOrderExample example = new DatacaciquesOrderExample();
        DateTime currentDateTime = new DateTime();
        DateTime time = currentDateTime.withMillisOfDay(0);
        DateTime start = currentDateTime.withMillisOfDay(0).plusDays(-1);
        example.createCriteria().andPfordercreatetimeBetween(DateToStr(start.toDate()), DateToStr(time.toDate())).andOrderamountGreaterThan("0").andCurrencycodeNotEqualTo("XXX");
        List<DatacaciquesOrder> orders = datacaciquesOrderMapper.selectByExample(example);
        Map<String, String> map = new HashMap<>();
        int month = start.getMonthOfYear();
        Double allamount = 0.0;
        for (DatacaciquesOrder datacaciquesOrder : orders) {
            String currenyCode = datacaciquesOrder.getCurrencycode();
            Double amount = Double.valueOf(datacaciquesOrder.getOrderamount());
            Map<String, Double> map1 = exchangerateMapper.queryRateByMonth(currenyCode);
            Double temp = map1.get("month" + month);
            allamount += temp * amount;
        }
        map.put("orderamount", String.valueOf(allamount.intValue()));
        map.put("orders", String.valueOf(orders.size()));
        return map;
    }

    @Override
    public List<EbayOrderProfit> exportOrder(String start, String end) {
        EbayOrderProfitExample ebayOrderProfitExample = new EbayOrderProfitExample();
        ebayOrderProfitExample.createCriteria().andCreatetimeBetween(start, end);
        List<EbayOrderProfit> ebayOrderProfits = ebayOrderProfitMapper.selectByExample(ebayOrderProfitExample);
        for (EbayOrderProfit ebayOrderProfit : ebayOrderProfits) {
            String orderID = ebayOrderProfit.getOrderid();
            EbayOrderSkuExample ebayOrderSkuExample = new EbayOrderSkuExample();
            ebayOrderSkuExample.createCriteria().andOrderidEqualTo(orderID);

            List<EbayOrderSku> orderSkus = ebayOrderSkuMapper.selectByExample(ebayOrderSkuExample);
            for (EbayOrderSku ebayOrderSku : orderSkus) {
                Long packageid = ebayOrderSku.getPackageid();
                EbayWarehouseoutSkuExample ebayWarehouseoutSkuExample = new EbayWarehouseoutSkuExample();
                ebayWarehouseoutSkuExample.createCriteria().andPackageidEqualTo(packageid);
                List<EbayWarehouseoutSku> ebayWarehouseoutSkus = ebayWarehouseoutSkuMapper.selectByExample(ebayWarehouseoutSkuExample);
                EbayWarehouseoutSku ebayWarehouseoutSku = ebayWarehouseoutSkus.get(0);
                WarehouseOutWarrantSku warehouseOutWarrantSku = warehouseOutWarrantSkuMapper.selectByPrimaryKey(ebayWarehouseoutSku.getWowsid());
                Integer outID = warehouseOutWarrantSku.getOutid();
                WarehouseOutWarrant warehouseOutWarrant = warehouseOutWarrantMapper.selectByPrimaryKey(outID);
                ebayOrderSku.setWarehouseCode(warehouseOutWarrant.getWarehouseorder());
                ebayOrderSku.setCount(ebayWarehouseoutSku.getQuantity());
            }
            ebayOrderProfit.setSkus(orderSkus);
        }
        return ebayOrderProfits;
    }

    private void updateEcOrder(String start,String end,int offset){
        List<EcOrder> ecOrders=ecApiClient.getOrderList(start,end,offset);
        for (EcOrder ecOrder:ecOrders){
            String id=ecOrder.getOrderId();
            EcOrder ecOrder1=ecOrderMapper.selectByPrimaryKey(id);
            if (ecOrder1==null){
                 ecOrderMapper.insertSelective(ecOrder);
            }else {
                ecOrder.setPlatformshipstatus(null);
                ecOrderMapper.updateByPrimaryKeySelective(ecOrder);
            }
        }
    }

    private void updateWinitPackage(DatacaciquesPackage datacaciquesPackage, Date createTime, WinitOutOrderDetail detail) {
        String order = detail.getOutboundordernum();
        WinitOrderDetailSkuExample winitOrderDetailSkuExample = new WinitOrderDetailSkuExample();
        winitOrderDetailSkuExample.createCriteria().andOrdernoEqualTo(order);
        List<WinitOrderDetailSku> winitOrderDetailSkus = winitOrderDetailSkuMapper.selectByExample(winitOrderDetailSkuExample);
        for (WinitOrderDetailSku winitOrderDetailSku : winitOrderDetailSkus) {
            String sku = winitOrderDetailSku.getSku();
            if (sku.contains("(return)")) {
                sku = sku.replace("(return)", "");
            }

            if (sku.equals("UK-WRENCHGUN-460NM-001")) {
                sku = "UK-WRENCHGUN-460NM";
            }
            Product product = productService.queryBySku(sku);
            if (product == null) {
                return;
            }
            winitOrderDetailSku.setSku(sku);
        }
        Map<String, List<WinitOrderDetailSku>> map = winitOrderDetailSkus.stream().collect(Collectors.groupingBy(WinitOrderDetailSku::getSku));
        for (Map.Entry<String, List<WinitOrderDetailSku>> entry : map.entrySet()) {
            String sku = entry.getKey();
            if (sku.contains("(return)")) {
                sku = sku.replace("(return)", "");
            }
            if (sku.equals("UK-WRENCHGUN-460NM-001")) {
                sku = "UK-WRENCHGUN-460NM";
            }
            Product product = productService.queryBySku(sku);
            if (product == null) {
                return;
            }
            List<WinitOrderDetailSku> skuList = entry.getValue();
            int quantity = skuList.stream().mapToInt(WinitOrderDetailSku::getQuantity).sum();
            int productid = product.getProductid();
            List<AlloOutSku> alloOutSkus = alloOutService.getSkuById(productid);
            if (alloOutSkus == null || alloOutSkus.size() == 0) {
                System.err.println(product.getSkucode() + "找不到出库单");
                return;
            }
            List<Integer> outids = new ArrayList<>();
            for (AlloOutSku alloOutSku : alloOutSkus) {
                int id = alloOutSku.getAlloid();
                outids.add(id);
            }
            AlloOutExample alloOutExample = new AlloOutExample();
            alloOutExample.createCriteria().andAlloidIn(outids).andWarehouseidEqualTo(1022191L).andArrivetimeIsNotNull();
            alloOutExample.setOrderByClause("arriveTime ASC");
            List<AlloOut> alloOuts = alloOutMapper.selectByExample(alloOutExample);
            if (alloOuts == null || alloOuts.size() == 0) {
                System.err.println(product.getSkucode() + "找不到出库单");
                return;
            }
            boolean isActive = false;
            boolean isExit = false;
            for (AlloOut alloOut : alloOuts) {
                Integer alloutID = alloOut.getAlloid();
                if (alloOut.getFare() != null && alloOut.getFare() != 0.0) {
                    AlloOutSkuExample alloOutSkuExample = new AlloOutSkuExample();
                    alloOutSkuExample.createCriteria().andProductidEqualTo(productid).andAlloidEqualTo(alloutID);
                    List<AlloOutSku> alloOutSkus1 = alloOutSkuMapper.selectByExample(alloOutSkuExample);
                    for (AlloOutSku alloOutSku : alloOutSkus1) {
                        if (!updateAlloSku(quantity, true, alloOutSku)) continue;
                        isActive = true;
                        datacaciquesPackage.setFlag(1);
                        Long packageid = datacaciquesPackage.getPackageid();
                        EbayWarehouseoutExample ebayWarehouseoutExample = new EbayWarehouseoutExample();
                        ebayWarehouseoutExample.createCriteria().andPackageidEqualTo(packageid).andSkuEqualTo(sku);
                        List<EbayWarehouseout> warehouseouts = ebayWarehouseoutMapper.selectByExample(ebayWarehouseoutExample);
                        if (warehouseouts == null || warehouseouts.size() == 0) {
                            updateEbayWarehouseOut(createTime, sku, productid, alloOut, packageid, null, "万邑通", quantity);
                        } else if (warehouseouts.size() == 1) {
                            updateEbayWarehouseOut(createTime, sku, productid, alloOut, packageid, warehouseouts.get(0), "万邑通", quantity);
                        }

                        datacaciquesPackageMapper.updateByPrimaryKeySelective(datacaciquesPackage);
                        isExit = true;
                        break;
                    }
                }
                if (isExit) {
                    break;
                }
            }
            if (!isActive) {
                int size = alloOuts.size();
                isExit = false;
                for (int i = size - 1; i >= 0; i--) {
                    AlloOut alloOut = alloOuts.get(i);
                    Integer alloutID = alloOut.getAlloid();
                    if (alloOut.getFare() != null && alloOut.getFare() != 0.0) {
                        AlloOutSkuExample alloOutSkuExample = new AlloOutSkuExample();
                        alloOutSkuExample.createCriteria().andProductidEqualTo(productid).andAlloidEqualTo(alloutID);
                        List<AlloOutSku> alloOutSkus1 = alloOutSkuMapper.selectByExample(alloOutSkuExample);
                        for (AlloOutSku alloOutSku : alloOutSkus1) {
                            updateAlloSku(quantity, false, alloOutSku);
                            datacaciquesPackage.setFlag(1);
                            Long packageid = datacaciquesPackage.getPackageid();
                            EbayWarehouseoutExample ebayWarehouseoutExample = new EbayWarehouseoutExample();
                            ebayWarehouseoutExample.createCriteria().andPackageidEqualTo(packageid).andSkuEqualTo(sku);
                            List<EbayWarehouseout> warehouseouts = ebayWarehouseoutMapper.selectByExample(ebayWarehouseoutExample);
                            if (warehouseouts == null || warehouseouts.size() == 0) {
                                updateEbayWarehouseOut(createTime, sku, productid, alloOut, packageid, null, "万邑通", quantity);
                            } else if (warehouseouts.size() == 1) {
                                updateEbayWarehouseOut(createTime, sku, productid, alloOut, packageid, warehouseouts.get(0), "万邑通", quantity);
                            }
                            datacaciquesPackageMapper.updateByPrimaryKeySelective(datacaciquesPackage);
                            isExit = true;
                            break;
                        }
                        if (isExit) {
                            break;
                        }
                    }
                }
            }
        }


    }

    private void updateGoodPackage(DatacaciquesPackage datacaciquesPackage, Date createTime, List<GcOutOrderDetail> gcOutOrderDetails) {
        GcOutOrderDetail gcOutOrderDetail = null;
        if (gcOutOrderDetails.size() == 1) {
            gcOutOrderDetail = gcOutOrderDetails.get(0);
        } else {
            for (GcOutOrderDetail gcOutOrderDetail1 : gcOutOrderDetails) {
                if (!gcOutOrderDetail1.getOrderStatus().equals("X")) {
                    gcOutOrderDetail = gcOutOrderDetail1;
                }
            }
            if(gcOutOrderDetail==null){
                return;
            }
        }
        String status = gcOutOrderDetail.getOrderStatus();
        if (status.equals("X")) {
            return;
        }
        String code = gcOutOrderDetail.getOrderCode();
        GcOutOrderDetailSkuExample gcOutOrderDetailSkuExample = new GcOutOrderDetailSkuExample();
        gcOutOrderDetailSkuExample.createCriteria().andOrderCodeEqualTo(code);
        List<GcOutOrderDetailSku> gcOutOrderDetailSkus = gcOutOrderDetailSkuMapper.selectByExample(gcOutOrderDetailSkuExample);
        for (GcOutOrderDetailSku gcOutOrderDetailSku : gcOutOrderDetailSkus) {
            String sku = gcOutOrderDetailSku.getProductSku();
            if (sku.contains("DE-LED")) {
                return;
            }
            Product product = productService.queryBySku(sku);
            if (product == null) {
                return;
            }
            List<AlloOutSku> alloOutSkus = alloOutService.getSkuById(product.getProductid());
            if (alloOutSkus == null || alloOutSkus.size() == 0) {
                throw new RuntimeException(product.getSkucode() + "找不到出库单");
            }
            List<Integer> outids = new ArrayList<>();
            for (AlloOutSku alloOutSku : alloOutSkus) {
                int id = alloOutSku.getAlloid();
                outids.add(id);
            }
            AlloOutExample alloOutExample = new AlloOutExample();
            alloOutExample.createCriteria().andAlloidIn(outids).andWarehouseidNotEqualTo((long) 1022191).andArrivetimeIsNotNull();
            alloOutExample.setOrderByClause("arriveTime ASC");
            List<AlloOut> alloOuts = alloOutMapper.selectByExample(alloOutExample);
            if (alloOuts == null || alloOuts.size() == 0) {
                return;
            }
        }
        for (GcOutOrderDetailSku gcOutOrderDetailSku : gcOutOrderDetailSkus) {
            String sku = gcOutOrderDetailSku.getProductSku();
            Integer quantity = gcOutOrderDetailSku.getQuantity();
            Product product = productService.queryBySku(sku);
            int productid = product.getProductid();
            List<AlloOutSku> alloOutSkus = alloOutService.getSkuById(productid);
            List<Integer> outids = new ArrayList<>();
            for (AlloOutSku alloOutSku : alloOutSkus) {
                int id = alloOutSku.getAlloid();
                outids.add(id);
            }
            AlloOutExample alloOutExample = new AlloOutExample();
            alloOutExample.createCriteria().andAlloidIn(outids).andWarehouseidNotEqualTo((long) 1022191).andArrivetimeIsNotNull();
            alloOutExample.setOrderByClause("arriveTime ASC");
            List<AlloOut> alloOuts = alloOutMapper.selectByExample(alloOutExample);
            if (alloOuts == null || alloOuts.size() == 0) {
                return;
            }
            boolean isActive = false;
            boolean isExist = false;
            for (AlloOut alloOut : alloOuts) {
                Integer alloutID = alloOut.getAlloid();
                if (alloOut.getFare() != null && alloOut.getFare() != 0.0) {
                    AlloOutSkuExample alloOutSkuExample = new AlloOutSkuExample();
                    alloOutSkuExample.createCriteria().andProductidEqualTo(productid).andAlloidEqualTo(alloutID);
                    List<AlloOutSku> alloOutSkus1 = alloOutSkuMapper.selectByExample(alloOutSkuExample);
                    for (AlloOutSku alloOutSku : alloOutSkus1) {
                        if (!updateAlloSku(quantity, true, alloOutSku)) continue;
                        isActive = true;
                        datacaciquesPackage.setFlag(1);
                        Long packageid = datacaciquesPackage.getPackageid();
                        EbayWarehouseoutExample ebayWarehouseoutExample = new EbayWarehouseoutExample();
                        ebayWarehouseoutExample.createCriteria().andPackageidEqualTo(packageid).andSkuEqualTo(sku);
                        List<EbayWarehouseout> warehouseouts = ebayWarehouseoutMapper.selectByExample(ebayWarehouseoutExample);
                        if (warehouseouts == null || warehouseouts.size() == 0) {
                            updateEbayWarehouseOut(createTime, sku, productid, alloOut, packageid, null, "谷仓", quantity);
                        } else if (warehouseouts.size() == 1) {
                            updateEbayWarehouseOut(createTime, sku, productid, alloOut, packageid, warehouseouts.get(0), "谷仓", quantity);
                        }
                        datacaciquesPackageMapper.updateByPrimaryKeySelective(datacaciquesPackage);
                        isExist = true;
                        break;
                    }
                    if (isExist) {
                        break;
                    }
                }
            }
            if (!isActive) {
                int size = alloOuts.size();
                isExist = false;
                for (int i = size - 1; i >= 0; i--) {
                    AlloOut alloOut = alloOuts.get(i);
                    Integer alloutID = alloOut.getAlloid();
                    if (alloOut.getFare() != null && alloOut.getFare() != 0.0) {
                        AlloOutSkuExample alloOutSkuExample = new AlloOutSkuExample();
                        alloOutSkuExample.createCriteria().andProductidEqualTo(productid).andAlloidEqualTo(alloutID);
                        List<AlloOutSku> alloOutSkus1 = alloOutSkuMapper.selectByExample(alloOutSkuExample);
                        for (AlloOutSku alloOutSku : alloOutSkus1) {
                            updateAlloSku(quantity, false, alloOutSku);
                            datacaciquesPackage.setFlag(1);
                            Long packageid = datacaciquesPackage.getPackageid();
                            EbayWarehouseoutExample ebayWarehouseoutExample = new EbayWarehouseoutExample();
                            ebayWarehouseoutExample.createCriteria().andPackageidEqualTo(packageid).andSkuEqualTo(sku);
                            List<EbayWarehouseout> warehouseouts = ebayWarehouseoutMapper.selectByExample(ebayWarehouseoutExample);
                            if (warehouseouts == null || warehouseouts.size() == 0) {
                                updateEbayWarehouseOut(createTime, sku, productid, alloOut, packageid, null, "谷仓", quantity);
                            } else if (warehouseouts.size() == 1) {
                                updateEbayWarehouseOut(createTime, sku, productid, alloOut, packageid, warehouseouts.get(0), "谷仓", quantity);
                            }
                            datacaciquesPackageMapper.updateByPrimaryKeySelective(datacaciquesPackage);
                            isExist = true;
                            break;
                        }
                        if (isExist) {
                            break;
                        }
                    }
                }
            }
        }
    }

    private boolean updateAlloSku(Integer quantity, boolean flag, AlloOutSku alloOutSku) {
        int usecount = alloOutSku.getUsecount();
        int typecount = alloOutSku.getTypecount();
        if (usecount >= typecount && flag) {
            return false;
        }
        usecount += quantity;
        alloOutSku.setUsecount(usecount);
        alloOutSkuMapper.updateByPrimaryKeySelective(alloOutSku);
        return true;
    }

    private void updateEbayWarehouseOut(Date toDate, String sku, int productID, AlloOut alloOut, Long packageid, EbayWarehouseout ebayWarehouseout, String type, int usecount) {
        if (ebayWarehouseout == null) {
            ebayWarehouseout = new EbayWarehouseout();
            ebayWarehouseout.setCreatetime(toDate);
            ebayWarehouseout.setOutid(alloOut.getOutid());
            ebayWarehouseout.setPackageid(packageid);
            ebayWarehouseout.setProductid(productID);
            ebayWarehouseout.setSku(sku);
            ebayWarehouseout.setType(type);
            ebayWarehouseoutMapper.insertSelective(ebayWarehouseout);
        } else {
            ebayWarehouseout.setOutid(alloOut.getOutid());
            ebayWarehouseout.setType(type);
            ebayWarehouseoutMapper.updateByPrimaryKeySelective(ebayWarehouseout);
        }
        EbayWarehouseoutSkuExample ebayWarehouseoutSkuExample = new EbayWarehouseoutSkuExample();
        ebayWarehouseoutSkuExample.createCriteria().andPackageidEqualTo(packageid).andProductidEqualTo(productID);
        List<EbayWarehouseoutSku> ebayWarehouseoutSkus = ebayWarehouseoutSkuMapper.selectByExample(ebayWarehouseoutSkuExample);
        if (ebayWarehouseoutSkus != null) {
            ebayWarehouseoutSkuMapper.deleteByExample(ebayWarehouseoutSkuExample);
        }
        Integer outID = alloOut.getOutid();
        WarehouseOutWarrantSkuExample example = new WarehouseOutWarrantSkuExample();
        example.createCriteria().andOutidEqualTo(outID).andProductidEqualTo(productID);
        List<WarehouseOutWarrantSku> warehouseOutWarrantSkus = warehouseOutWarrantSkuMapper.selectByExample(example);
        for (WarehouseOutWarrantSku warehouseOutWarrantSku : warehouseOutWarrantSkus) {
            Integer useCount = warehouseOutWarrantSku.getUsecount();
            Integer outCount = warehouseOutWarrantSku.getOutcount();
            Integer availCount = outCount - useCount;
            if (usecount == 0) {
                break;
            }
            if (availCount <= 0) {
                continue;
            }
            if (availCount >= usecount) {
                warehouseOutWarrantSku.setUsecount(usecount + useCount);
                warehouseOutWarrantSkuMapper.updateByPrimaryKeySelective(warehouseOutWarrantSku);
                WarehouseInWarrantSku warehouseInWarrantSku = warehouseInWarrantSkuMapper.selectByPrimaryKey(warehouseOutWarrantSku.getInskuid());
                EbayWarehouseoutSku ebayWarehouseoutSku = new EbayWarehouseoutSku();
                ebayWarehouseoutSku.setWowsid(warehouseOutWarrantSku.getWowsid());
                ebayWarehouseoutSku.setPackageid(packageid);
                ebayWarehouseoutSku.setFare(warehouseInWarrantSku.getFare().doubleValue());
                ebayWarehouseoutSku.setPrice(warehouseInWarrantSku.getUnitprice().doubleValue());
                ebayWarehouseoutSku.setQuantity(usecount);
                ebayWarehouseoutSku.setProductid(productID);
                ebayWarehouseoutSkuMapper.insertSelective(ebayWarehouseoutSku);
                usecount = 0;
                break;
            } else {
                warehouseOutWarrantSku.setUsecount(outCount);
                usecount -= availCount;
                warehouseOutWarrantSkuMapper.updateByPrimaryKeySelective(warehouseOutWarrantSku);
                WarehouseInWarrantSku warehouseInWarrantSku = warehouseInWarrantSkuMapper.selectByPrimaryKey(warehouseOutWarrantSku.getInskuid());
                EbayWarehouseoutSku ebayWarehouseoutSku = new EbayWarehouseoutSku();
                ebayWarehouseoutSku.setWowsid(warehouseOutWarrantSku.getWowsid());
                ebayWarehouseoutSku.setPackageid(packageid);
                ebayWarehouseoutSku.setFare(warehouseInWarrantSku.getFare().doubleValue());
                ebayWarehouseoutSku.setPrice(warehouseInWarrantSku.getUnitprice().doubleValue());
                ebayWarehouseoutSku.setQuantity(availCount);
                ebayWarehouseoutSku.setProductid(productID);
                ebayWarehouseoutSkuMapper.insertSelective(ebayWarehouseoutSku);
            }
        }
        if (usecount > 0) {
            Integer size = warehouseOutWarrantSkus.size();
            WarehouseOutWarrantSku warehouseOutWarrantSku = warehouseOutWarrantSkus.get(size - 1);
            WarehouseInWarrantSku warehouseInWarrantSku = warehouseInWarrantSkuMapper.selectByPrimaryKey(warehouseOutWarrantSku.getInskuid());
            Integer oldcount = warehouseOutWarrantSku.getUsecount();
            warehouseOutWarrantSku.setUsecount(oldcount + usecount);
            warehouseOutWarrantSkuMapper.updateByPrimaryKeySelective(warehouseOutWarrantSku);
            EbayWarehouseoutSku ebayWarehouseoutSku = new EbayWarehouseoutSku();
            ebayWarehouseoutSku.setWowsid(warehouseOutWarrantSku.getWowsid());
            ebayWarehouseoutSku.setPackageid(packageid);
            ebayWarehouseoutSku.setFare(warehouseInWarrantSku.getFare().doubleValue());
            ebayWarehouseoutSku.setPrice(warehouseInWarrantSku.getUnitprice().doubleValue());
            ebayWarehouseoutSku.setQuantity(usecount);
            ebayWarehouseoutSku.setProductid(productID);
            ebayWarehouseoutSkuMapper.insertSelective(ebayWarehouseoutSku);
        }
    }

    @Transactional(rollbackFor = Exception.class)
    public void getTodayOrder(String start, String end, int offset) {
        JSONObject data = new JSONObject();
        data.put("sql", "select * from sys_order where pfOrderCreateTime between '" + start + "' and '" + end + "'  limit 300 offset offset " + offset * 300);
        ResponseParam responseParam = client.post(data);
        int code = responseParam.getCode();
        if (code == 0) {
            List<JSONObject> orders = responseParam.getData();
            for (JSONObject order : orders) {
                DatacaciquesOrder datacaciquesOrder = JSON.parseObject(order.toJSONString(), new TypeReference<DatacaciquesOrder>() {
                });
                DatacaciquesOrder tempOrder = datacaciquesOrderMapper.selectByPrimaryKey(datacaciquesOrder.getId());
                if (tempOrder == null) {
                    datacaciquesOrderMapper.insertSelective(datacaciquesOrder);
                } else {
                    datacaciquesOrderMapper.updateByPrimaryKeySelective(datacaciquesOrder);
                }
            }
            if (orders.size() == 300) {
                getTodayOrder(start, end, offset + 1);
            }

        }
    }

    @Transactional(rollbackFor = Exception.class)
    public void getRelationInfo(String start, String end, int offset) {
        JSONObject data = new JSONObject();
        data.put("sql", "select * from order_package_relation where createTime between '" + start + "' and '" + end + "' order by createTime   limit 300 offset " + offset * 300);
        ResponseParam responseParam = client.post(data);
        int code = responseParam.getCode();
        if (code == 0) {
            List<JSONObject> orders = responseParam.getData();
            for (JSONObject order : orders) {
                DatacaciquesOrderPackageRelation datacaciquesOrderPackageRelation = JSON.parseObject(order.toJSONString(), new TypeReference<DatacaciquesOrderPackageRelation>() {
                });
                DatacaciquesOrderPackageRelationExample relationExample = new DatacaciquesOrderPackageRelationExample();
                relationExample.createCriteria().andSysorderidEqualTo(datacaciquesOrderPackageRelation.getSysorderid()).andSyssuborderidEqualTo(datacaciquesOrderPackageRelation.getSyssuborderid()).andPackageidEqualTo(datacaciquesOrderPackageRelation.getPackageid());
                List<DatacaciquesOrderPackageRelation> relations = datacaciquesOrderPackageRelationMapper.selectByExample(relationExample);
                if (relations == null || relations.size() == 0) {
                    datacaciquesOrderPackageRelationMapper.insertSelective(datacaciquesOrderPackageRelation);
                } else {
                    datacaciquesOrderPackageRelationMapper.updateByExampleSelective(datacaciquesOrderPackageRelation, relationExample);
                }
            }
            if (orders.size() == 300) {
                getRelationInfo(start, end, offset + 1);
            }

        }
    }

    @Transactional(rollbackFor = Exception.class)
    public void getSubOrderInfo(String start, String end, int offset) {
        JSONObject data = new JSONObject();
        data.put("sql", "select * from sub_order where createTime between '" + start + "' and '" + end + "' order by createTime   limit 300 offset " + offset * 300);
        ResponseParam responseParam = client.post(data);
        int code = responseParam.getCode();
        if (code == 0) {
            List<JSONObject> orders = responseParam.getData();
            for (JSONObject order : orders) {
                DatacaciquesSubOrder datacaciquesSubOrder = JSON.parseObject(order.toJSONString(), new TypeReference<DatacaciquesSubOrder>() {
                });
                DatacaciquesSubOrderExample datacaciquesSubOrderExample = new DatacaciquesSubOrderExample();
                datacaciquesSubOrderExample.createCriteria().andSysorderidEqualTo(datacaciquesSubOrder.getSysorderid());
                List<DatacaciquesSubOrder> subOrders = datacaciquesSubOrderMapper.selectByExample(datacaciquesSubOrderExample);
                if (subOrders == null) {
                    datacaciquesSubOrderMapper.insertSelective(datacaciquesSubOrder);
                } else {
                    datacaciquesSubOrderMapper.updateByExampleSelective(datacaciquesSubOrder, datacaciquesSubOrderExample);
                }
            }
            if (orders.size() == 300) {
                getSubOrderInfo(start, end, offset + 1);
            }

        }
    }

    @Transactional(rollbackFor = Exception.class)
    public void getPackageInfo(String start, String end, int offset) {
        JSONObject data = new JSONObject();
        data.put("sql", "select * from package where createTime between '" + start + "' and '" + end + "'  order by createTime   limit 300 offset " + offset * 300);
        ResponseParam responseParam = client.post(data);
        int code = responseParam.getCode();
        if (code == 0) {
            List<JSONObject> orders = responseParam.getData();
            for (JSONObject order : orders) {
                DatacaciquesPackage datacaciquesPackage = JSON.parseObject(order.toJSONString(), new TypeReference<DatacaciquesPackage>() {
                });
                DatacaciquesPackage tempdata = datacaciquesPackageMapper.selectByPrimaryKey(datacaciquesPackage.getPackageid());
                if (tempdata == null) {
                    datacaciquesPackageMapper.insertSelective(datacaciquesPackage);
                } else {
                    datacaciquesPackageMapper.updateByPrimaryKeySelective(datacaciquesPackage);
                }
            }
            if (orders.size() == 300) {
                getPackageInfo(start, end, offset + 1);
            }

        }
    }

    public static Date strToDateLong(String strDate) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        ParsePosition pos = new ParsePosition(0);
        Date strtodate = formatter.parse(strDate, pos);
        return strtodate;
    }

    public static String DateToStr(Date date) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = formatter.format(date);
        return dateString;
    }
}
