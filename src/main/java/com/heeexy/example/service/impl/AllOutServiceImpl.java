package com.heeexy.example.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.dao.*;
import com.heeexy.example.model.*;
import com.heeexy.example.service.AlloOutService;
import com.heeexy.example.service.ProductStorageService;
import com.heeexy.example.util.CommonUtil;
import com.heeexy.example.util.GetOrredingIdUUID;
import com.heeexy.example.util.constants.ErrorEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class  AllOutServiceImpl implements AlloOutService {
    @Autowired
    AlloOutMapper alloOutMapper;
    @Autowired
    AlloOutSkuMapper alloOutSkuMapper;
    @Autowired
    ProductMapper productMapper;
    @Autowired
    WarehouseOutWarrantSkuMapper warehouseOutWarrantSkuMapper;
    @Autowired
    WarehouseOutWarrantMapper warehouseOutWarrantMapper;
    @Autowired
    ProductStorageService productStorageService;

    @Override
    public JSONObject listAllOut(Integer pageSize, Integer pageNum, String warehouseOrder, Long warehouseID, String create_Start, String create_End, String arrive_Start, String arrive_End, Integer status, String sku) {
        int start = 0;
        if (pageNum != 0) {
            start = (pageNum - 1) * pageSize;
        }
        List<AlloOut> outs = alloOutMapper.queryAlloOutList(start, pageSize, warehouseOrder, warehouseID, create_Start, create_End, arrive_Start, arrive_End, status, sku);
        Integer count = alloOutMapper.getCount(warehouseOrder, warehouseID, create_Start, create_End, arrive_Start, arrive_End, status, sku);
        for (AlloOut alloOut : outs) {
            String warehousecode = alloOut.getWarehouseorder();
            System.out.println("订单：" + warehousecode);
            Integer alloid = alloOut.getAlloid();
            AlloOutSkuExample example = new AlloOutSkuExample();
            example.createCriteria().andAlloidEqualTo(alloid);
            List<AlloOutSku> skus = alloOutSkuMapper.selectByExample(example);
            for (AlloOutSku alloOutSku : skus) {
                Integer productID = alloOutSku.getProductid();
                Product product = productMapper.selectByPrimaryKey(productID);
                String cnName = product.getCnname();
                String imgurl = product.getImgurl();
                alloOutSku.setCnName(cnName);
                alloOutSku.setImgurl(imgurl);
            }
            alloOut.setSkus(skus);
        }
        JSONObject requestjson = new JSONObject();
        requestjson.put("pageRow", pageSize);
        return CommonUtil.successPage(requestjson, outs, count);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public JSONObject save(AlloOut alloOut, List<AlloOutSku> skus) {
        Date date = new Date();
        alloOut.setAllonum(null);
        alloOut.setUpdatetime(date);
        alloOut.setType(null);
        alloOutMapper.updateByPrimaryKeySelective(alloOut);
        for (AlloOutSku sku : skus) {
            alloOutSkuMapper.updateByPrimaryKeySelective(sku);
        }
        return CommonUtil.successJson();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public JSONObject review(AlloOut alloOut, List<AlloOutSku> skus) {
        Integer status = alloOut.getStatus();
        if (status != 3) {
            return CommonUtil.successJson();
        }
        Boolean flag = false;
        for (AlloOutSku alloOutSku : skus) {
            Integer incount = alloOutSku.getIncount();
            Integer newcount = alloOutSku.getNewcount();
            if (newcount == null || newcount == 0) {
                continue;
            }
            if (incount + newcount > alloOutSku.getTypecount()) {
                flag = true;
                break;
            }
        }
        if (flag) {
            return CommonUtil.errorJson(ErrorEnum.E_10010);
        }
        for (AlloOutSku alloOutSku : skus) {
            Integer incount = alloOutSku.getIncount();
            Integer newcount = alloOutSku.getNewcount();
            if (newcount == null || newcount == 0) {
                continue;
            }
            Integer count = incount + newcount;
            Integer productID = alloOutSku.getProductid();
            Boolean success = productStorageService.min(productID, newcount, 3, true);
            if (!success) {
                throw new RuntimeException("库存数目异常，海外仓入库失败");
            }
            alloOutSku.setIncount(count);
            alloOutSkuMapper.updateByPrimaryKeySelective(alloOutSku);
        }
        return CommonUtil.successJson();
    }

    @Override
    public JSONObject add(AlloOut alloOut, Integer userid, String username) {
        Date date = new Date();
        alloOut.setCreatetime(date);
        alloOut.setType("中仓到货");
        String num = GetOrredingIdUUID.getAlloIdByUUId();
        alloOut.setAllonum(num);
        alloOut.setUpdatetime(date);
        alloOut.setStatus(1);
        alloOut.setUserid(userid);
        alloOut.setUsername(username);
        Integer outID = alloOut.getOutid();
        alloOutMapper.insertSelective(alloOut);
        Integer alloid = alloOut.getAlloid();
        WarehouseOutWarrantSkuExample skuExample = new WarehouseOutWarrantSkuExample();
        skuExample.createCriteria().andOutidEqualTo(outID);
        List<WarehouseOutWarrantSku> skuList = warehouseOutWarrantSkuMapper.selectByExample(skuExample);
        for (WarehouseOutWarrantSku warehouseOutWarrantSku : skuList) {
            Integer productID = warehouseOutWarrantSku.getProductid();
            Integer count = warehouseOutWarrantSku.getOutcount();
            String skuCode = warehouseOutWarrantSku.getSkucode();
            AlloOutSku alloOutSku = new AlloOutSku();
            alloOutSku.setAlloid(alloid);
            alloOutSku.setAllonum(num);
            alloOutSku.setIncount(count);
            alloOutSku.setTypecount(count);
            alloOutSku.setProductid(productID);
            alloOutSku.setSkucode(skuCode);
            alloOutSku.setUsecount(0);
            alloOutSkuMapper.insertSelective(alloOutSku);
        }
        return CommonUtil.successJson();
    }

    @Override
    public JSONObject submit(Integer outID) {
        AlloOut alloOut = alloOutMapper.selectByPrimaryKey(outID);
        alloOut.setStatus(2);
        alloOutMapper.updateByPrimaryKeySelective(alloOut);
        return CommonUtil.successJson();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public JSONObject verify(Integer outID) {
        Date date = new Date();
        AlloOut alloOut = alloOutMapper.selectByPrimaryKey(outID);
        alloOut.setStatus(3);
        alloOut.setArrivetime(date);
        AlloOutSkuExample example = new AlloOutSkuExample();
        example.createCriteria().andAlloidEqualTo(alloOut.getAlloid());
        List<AlloOutSku> skus = alloOutSkuMapper.selectByExample(example);
        Double allweight = 0.0;
        Double allVolume = 0.0;
        Integer skuamount = 0;
        for (AlloOutSku alloOutSku : skus) {
            Integer productID = alloOutSku.getProductid();
            Integer size = alloOutSku.getIncount();
            Boolean success = productStorageService.add(productID, size, 4, true);
            if (!success) {
                throw new RuntimeException("库存数目异常，海外仓入库失败");
            }
            Product product = productMapper.selectByPrimaryKey(productID);
            Double weight = product.getRegisteredweight() / 1000;
            Double length = product.getRegisteredlength();
            Double width = product.getRegisteredwidth();
            Double height = product.getRegisteredheight();
            Double volume = length * width * height;
            Integer count = alloOutSku.getTypecount();
            allweight += weight * count;
            skuamount += count;
            allVolume += volume * count;
        }
        alloOut.setSkuquantity(skuamount);
        alloOut.setAllweight(allweight);
        alloOut.setAllvolume(allVolume);
        alloOutMapper.updateByPrimaryKeySelective(alloOut);
        Integer warehouseoutID = alloOut.getOutid();
        WarehouseOutWarrant warehouseOutWarrant = warehouseOutWarrantMapper.selectByPrimaryKey(warehouseoutID);
        warehouseOutWarrant.setArrivestatus(3);
        warehouseOutWarrantMapper.updateByPrimaryKeySelective(warehouseOutWarrant);
        return CommonUtil.successJson();
    }

    @Override
    public JSONObject reject(Integer outID) {
        AlloOut alloOut = alloOutMapper.selectByPrimaryKey(outID);
        alloOut.setStatus(1);
        alloOutMapper.updateByPrimaryKeySelective(alloOut);
        return CommonUtil.successJson();
    }

    @Override
    public JSONObject delete(Integer outID) {
        alloOutMapper.deleteByPrimaryKey(outID);
        return CommonUtil.successJson();
    }

    @Override
    public List<AlloOutSku> getSkuById(Integer productID) {
        AlloOutSkuExample example = new AlloOutSkuExample();
        example.createCriteria().andProductidEqualTo(productID);
        return alloOutSkuMapper.selectByExample(example);
    }

    @Override
    public List<AlloOut> excelAllOut(String warehouseOrder, Long warehouseID, String create_Start, String create_End, String arrive_Start, String arrive_End, Integer status, String sku) {
        List<AlloOut> outs = alloOutMapper.queryAlloOutList(null, null, warehouseOrder, warehouseID, create_Start, create_End, arrive_Start, arrive_End, status, sku);
        for (AlloOut alloOut : outs) {
            Integer alloid = alloOut.getAlloid();
            AlloOutSkuExample example = new AlloOutSkuExample();
            example.createCriteria().andAlloidEqualTo(alloid);
            List<AlloOutSku> skus = alloOutSkuMapper.selectByExample(example);
            alloOut.setSkus(skus);
        }
        return outs;
    }
}
