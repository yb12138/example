package com.heeexy.example.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.dao.ProductMapper;
import com.heeexy.example.dao.ProductWarehouseStorageBackInfoMapper;
import com.heeexy.example.dao.ProductWarehouseStorageBackMapper;
import com.heeexy.example.dao.ProductWarehouseStorageMapper;
import com.heeexy.example.model.*;
import com.heeexy.example.service.ProductStorageService;
import com.heeexy.example.util.CommonUtil;
import com.heeexy.example.util.ExcelUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductStorageServiceImpl implements ProductStorageService {
    @Autowired
    ProductMapper productMapper;
    @Autowired
    ProductWarehouseStorageMapper productWarehouseStorageMapper;
    @Autowired
    ProductWarehouseStorageBackMapper productWarehouseStorageBackMapper;
    @Autowired
    ProductWarehouseStorageBackInfoMapper productWarehouseStorageBackInfoMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Boolean add(Integer productID, Integer count, Integer process, Boolean flag) {
        ProductWarehouseStorage warehouseStorage = productWarehouseStorageMapper.selectByPrimaryKey(productID);
        if (warehouseStorage == null) {
            switch (process) {
                case 1:
                    warehouseStorage = new ProductWarehouseStorage();
                    Product product = productMapper.selectByPrimaryKey(productID);
                    warehouseStorage.setProductid(productID);
                    warehouseStorage.setWarehouseid(product.getWarehouseid());
                    warehouseStorage.setWarehousename(product.getWarehousename());
                    warehouseStorage.setSkucode(product.getSkucode());
                    warehouseStorage.setOnpurchase(count);
                    warehouseStorage.setOnway(0);
                    warehouseStorage.setOnsell(0);
                    warehouseStorage.setOncnwarehouse(0);
                    createStorage(warehouseStorage);
                    return true;
                default:
                    return false;
            }
        }
        Integer onPurchase = warehouseStorage.getOnpurchase();
        Integer oncnwarehouse = warehouseStorage.getOncnwarehouse();
        Integer onway = warehouseStorage.getOnway();
        Integer onsell = warehouseStorage.getOnselllocal();
        switch (process) {
            //采购阶段,直接加
            case 1:
                warehouseStorage.setOnpurchase(onPurchase + count);
                break;
            //中仓阶段，采购库存减，中仓库存加
            case 2:
                if (flag) {
                    warehouseStorage.setOnpurchase(onPurchase - count);
                }
                warehouseStorage.setOncnwarehouse(oncnwarehouse + count);
                break;
            //海外仓阶段，中仓库存减，海外仓加
            case 3:
                if (oncnwarehouse < count) {
                    return false;
                }
                warehouseStorage.setOncnwarehouse(oncnwarehouse - count);
                warehouseStorage.setOnway(onway + count);
                break;
            //海外仓入库阶段，在途减，在售加。
            case 4:
                if (onway < count) {
                    return false;
                }
                warehouseStorage.setOnway(onway - count);
                warehouseStorage.setOnselllocal(onsell + count);
                break;
        }
        productWarehouseStorageMapper.updateByPrimaryKeySelective(warehouseStorage);
        return true;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Boolean min(Integer productID, Integer count, Integer process, Boolean flag) {
        ProductWarehouseStorage warehouseStorage = productWarehouseStorageMapper.selectByPrimaryKey(productID);
        if (warehouseStorage == null) {
            return false;
        }
        Integer onPurchase = warehouseStorage.getOnpurchase();
        Integer oncnwarehouse = warehouseStorage.getOncnwarehouse();
        Integer onway = warehouseStorage.getOnway();
        Integer onsell = warehouseStorage.getOnselllocal();
        switch (process) {
            //采购阶段,直接减
            case 1:
                if (onPurchase < count) {
                    return false;
                }
                warehouseStorage.setOnpurchase(onPurchase - count);
                break;
            //中仓阶段，直接减
            case 2:
                if (oncnwarehouse < count) {
                    return false;
                }
                warehouseStorage.setOncnwarehouse(oncnwarehouse - count);
                break;
            //海外仓阶段减
            case 3:
                if (onway < count) {
                    return false;
                }
                warehouseStorage.setOnway(onway - count);
                break;
            //海外仓出库
            case 4:
                warehouseStorage.setOnselllocal(onsell - count);
                break;
            default:
                return false;
        }
        productWarehouseStorageMapper.updateByPrimaryKeySelective(warehouseStorage);
        return true;
    }

    @Override
    public Boolean createStorage(ProductWarehouseStorage warehouseStorage) {
        productWarehouseStorageMapper.insertSelective(warehouseStorage);
        return true;
    }


    @Override
    public JSONObject listProductStorage(Integer pageNo, Integer pageSize, String sku, String name, Long warehouseid) {
        int start = 0;
        if (pageNo != 0) {
            start = (pageNo - 1) * pageSize;
        }
        List<ProductWarehouseStorage> maps = productWarehouseStorageMapper.queryProduct(start, pageSize, name, sku, warehouseid);
        Integer count = productWarehouseStorageMapper.getCount(name, sku, warehouseid);
        JSONObject requestjson = new JSONObject();
        requestjson.put("pageRow", pageNo);
        return CommonUtil.successPage(requestjson, maps, count);
    }

    @Override
    public List<ProductWarehouseStorage> listAllStorage(String sku, String name, Long warehouseid) {
        List<ProductWarehouseStorage> maps = productWarehouseStorageMapper.queryProduct(null, null, name, sku, warehouseid);

        return maps;
    }

    @Override
    public JSONObject listAllStorage() {
        ProductWarehouseStorageExample example = new ProductWarehouseStorageExample();
        example.createCriteria().andProductidIsNotNull();
        List<ProductWarehouseStorage> storages = productWarehouseStorageMapper.selectByExample(example);
        List<ProductWarehouseStorage> jsonObjects = new ArrayList<>();
        for (ProductWarehouseStorage storage : storages) {
            if (storage.getOncnwarehouse() == 0 && storage.getOnpurchase() == 0 && storage.getOnsell() == 0 && storage.getOnway() == 0) {
                continue;
            }
            Integer productID = storage.getProductid();
            Product product = productMapper.selectByPrimaryKey(productID);
            Double cost = product.getCost();
            storage.setCost(cost);
            jsonObjects.add(storage);
        }
        return CommonUtil.successJson(jsonObjects);
    }

    @Override
    public JSONObject listProductStorageBack(Integer pageNo, Integer pageSize, String sku, Integer month) {
        int start = 0;
        if (pageNo != 0) {
            start = (pageNo - 1) * pageSize;
        }
        if (month == null) {
            //返回当天的
            List<ProductWarehouseStorage> maps = productWarehouseStorageMapper.queryProduct(start, pageSize, null, sku, null);
            Integer count = productWarehouseStorageMapper.getCount(null, sku, null);
            for (ProductWarehouseStorage storage : maps) {
                Integer productID = storage.getProductid();
                Integer allamount = storage.getOnsell() + storage.getOnway() + storage.getOnpurchase() + storage.getOncnwarehouse();
                Product product = productMapper.selectByPrimaryKey(productID);
                Double price = product.getCost();
                if (price == null) {
                    price = 0.0;
                }
                storage.setCost(price);
                storage.setOnall(allamount);
                DecimalFormat df = new DecimalFormat("#.00");
                storage.setOnallprice(Double.valueOf(df.format(allamount * price)));
            }
            JSONObject requestjson = new JSONObject();
            requestjson.put("pageRow", pageNo);
            return CommonUtil.successPage(requestjson, maps, count);
        } else {
            List<ProductWarehouseStorageBack> maps = productWarehouseStorageBackMapper.queryProduct(start, pageSize, sku, month);
            Integer count = productWarehouseStorageBackMapper.getCount(sku, month);
            for (ProductWarehouseStorageBack storageBack : maps) {
                Integer productID = storageBack.getProductid();
                Integer allamount = storageBack.getOnsell() + storageBack.getOnway() + storageBack.getOnpurchase() + storageBack.getOncnwarehouse();
                Product product = productMapper.selectByPrimaryKey(productID);
                Double price = product.getCost();
                Integer backID = storageBack.getBackid();
                storageBack.setCnname(product.getCnname());
                storageBack.setImgurl(product.getImgurl());
                storageBack.setCost(price);
                storageBack.setOnall(allamount);
                ProductWarehouseStorageBackInfo productWarehouseStorageBackInfo = productWarehouseStorageBackInfoMapper.selectByPrimaryKey(backID);
                if (productWarehouseStorageBackInfo != null) {
                    String purchase = productWarehouseStorageBackInfo.getPurchasestr();
                    if (purchase != null) {
                        List<Info> infos = JSON.parseArray(purchase, Info.class);
                        storageBack.setPurchasestr(infos);
                    }
                    String cnwarehousestr = productWarehouseStorageBackInfo.getCnwarehousestr();
                    if (cnwarehousestr != null) {
                        List<Info> infos = JSON.parseArray(cnwarehousestr, Info.class);
                        storageBack.setCnwarehousestr(infos);
                    }
                    String onwaystr = productWarehouseStorageBackInfo.getOnwaystr();
                    if (onwaystr != null) {
                        List<Info> infos = JSON.parseArray(onwaystr, Info.class);
                        storageBack.setOnwaystr(infos);
                    }
                    String onwarehousestr1 = productWarehouseStorageBackInfo.getOnwarehousestr();
                    if (onwarehousestr1 != null) {
                        List<Info> infos = JSON.parseArray(onwarehousestr1, Info.class);
                        storageBack.setOnwarehousestr(infos);
                    }
                }
            }
            JSONObject requestjson = new JSONObject();
            requestjson.put("pageRow", pageNo);
            return CommonUtil.successPage(requestjson, maps, count);
        }
    }

    @Override
    public JSONObject exportProductStorageBack(String sku, Integer month, HttpServletResponse response) throws IOException {
        if (month == null) {
            //返回当天的
            List<ProductWarehouseStorage> maps = productWarehouseStorageMapper.queryProduct(null, null, null, sku, null);
            for (ProductWarehouseStorage storage : maps) {
                Integer productID = storage.getProductid();
                Integer allamount = storage.getOnsell() + storage.getOnway() + storage.getOnpurchase() + storage.getOncnwarehouse();
                Product product = productMapper.selectByPrimaryKey(productID);
                Double price = product.getCost();
                if (price == null) {
                    price = 0.0;
                }
                storage.setCost(price);
                storage.setOnall(allamount);
                DecimalFormat df = new DecimalFormat("#.00");
                storage.setOnallprice(Double.valueOf(df.format(allamount * price)));
                storage.setOnpurchaseprice(Double.valueOf(df.format(storage.getOnpurchase() * price)));
                storage.setOncnwarehouseprice(Double.valueOf(df.format(storage.getOncnwarehouse() * price)));
                storage.setOnwayprice(Double.valueOf(df.format(storage.getOnway() * price)));
                storage.setOnsellprice(Double.valueOf(df.format(storage.getOnsell() * price)));
            }
            ExcelUtils.exportExcel(maps, null, "库存金额报表", ProductWarehouseStorage.class, "库存金额", response);
        } else {
            List<ProductWarehouseStorageBack> maps = productWarehouseStorageBackMapper.queryProduct(null, null, sku, month);
            for (ProductWarehouseStorageBack storageBack : maps) {
                Integer productID = storageBack.getProductid();
                Integer allamount = storageBack.getOnsell() + storageBack.getOnway() + storageBack.getOnpurchase() + storageBack.getOncnwarehouse();
                Product product = productMapper.selectByPrimaryKey(productID);
                Double price = product.getCost();
                Integer backID = storageBack.getBackid();
                storageBack.setCost(price);
                storageBack.setCnname(product.getCnname());
                storageBack.setImgurl(product.getImgurl());
                storageBack.setOnall(allamount);
                ProductWarehouseStorageBackInfo productWarehouseStorageBackInfo = productWarehouseStorageBackInfoMapper.selectByPrimaryKey(backID);
                if (productWarehouseStorageBackInfo != null) {
                    String purchase = productWarehouseStorageBackInfo.getPurchasestr();
                    if (purchase != null) {
                        List<Info> infos = JSON.parseArray(purchase, Info.class);
                        storageBack.setPurchasestr(infos);
                    }
                    String cnwarehousestr = productWarehouseStorageBackInfo.getCnwarehousestr();
                    if (cnwarehousestr != null) {
                        List<Info> infos = JSON.parseArray(cnwarehousestr, Info.class);
                        storageBack.setCnwarehousestr(infos);
                    }
                    String onwaystr = productWarehouseStorageBackInfo.getOnwaystr();
                    if (onwaystr != null) {
                        List<Info> infos = JSON.parseArray(onwaystr, Info.class);
                        storageBack.setOnwaystr(infos);
                    }
                    String onwarehousestr1 = productWarehouseStorageBackInfo.getOnwarehousestr();
                    if (onwarehousestr1 != null) {
                        List<Info> infos = JSON.parseArray(onwarehousestr1, Info.class);
                        storageBack.setOnwarehousestr(infos);
                    }
                }
            }
            ExcelUtils.exportExcel(maps, null, "库存金额报表", ProductWarehouseStorageBack.class, "库存金额", response);
        }
        return null;
    }

}
