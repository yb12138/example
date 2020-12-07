package com.heeexy.example.controller;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.dao.PurchaseSupplierMapper;
import com.heeexy.example.dao.WarehouseMapper;
import com.heeexy.example.dao.WarehouseOutWarrantMapper;
import com.heeexy.example.model.*;
import com.heeexy.example.service.ProductNewService;
import com.heeexy.example.service.ProductService;
import com.heeexy.example.util.CommonUtil;
import com.heeexy.example.util.constants.Constants;
import com.heeexy.example.util.constants.ErrorEnum;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.session.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/productNew")
public class ProductNewController {
    @Autowired
    ProductNewService productNewService;
    @Autowired
    PurchaseSupplierMapper purchaseSupplierMapper;
    @Autowired
    WarehouseMapper warehouseMapper;
    @Autowired
    ProductService productService;

    /**
     * 查询新品列表，分页
     */
    @RequiresPermissions("productNew:list")
    @PostMapping("/list")
    public JSONObject list(@RequestBody Map<String, String> map) {
        System.out.println("map:" + map.toString());
        Integer pageNo = Integer.valueOf(map.get("pageNum"));
        Integer pageSize = Integer.valueOf(map.get("pageRow"));
        String name = map.get("cnName");
        if (StringUtils.isEmpty(map.get("status"))) {
            return CommonUtil.errorJson(ErrorEnum.E_90003);
        }
        Integer status = Integer.valueOf(map.get("status"));
        return productNewService.listProduct(pageSize, pageNo, name, status);
    }

    @RequiresPermissions("productNew:update")
    @PostMapping("/update")
    public JSONObject update(@RequestBody ProductNew productNew) {

        return productNewService.save(productNew);
    }

    @RequiresPermissions("productNew:submit")
    @GetMapping("/submit")
    public JSONObject submitPurchase(@RequestParam Integer productID) {
        Session session = SecurityUtils.getSubject().getSession();
        JSONObject userInfo = (JSONObject) session.getAttribute(Constants.SESSION_USER_INFO);
        String username = userInfo.getString("username");
        Integer userid = userInfo.getIntValue("userId");
        return productNewService.submit(productID, username, userid);
    }

    @RequiresPermissions("productNew:verify")
    @GetMapping("/verify")
    public JSONObject verifyPurchase(@RequestParam Integer productID) {
        Session session = SecurityUtils.getSubject().getSession();
        JSONObject userInfo = (JSONObject) session.getAttribute(Constants.SESSION_USER_INFO);
        String username = userInfo.getString("username");
        Integer userid = userInfo.getIntValue("userId");
        return productNewService.verify(productID, username, userid);
    }

    @RequiresPermissions("productNew:reject")
    @GetMapping("/reject")
    public JSONObject rejectPurchase(@RequestParam Integer productID) {
        Session session = SecurityUtils.getSubject().getSession();
        JSONObject userInfo = (JSONObject) session.getAttribute(Constants.SESSION_USER_INFO);
        String username = userInfo.getString("username");
        Integer userid = userInfo.getIntValue("userId");
        return productNewService.reject(productID, username, userid);
    }


    @PostMapping("/add")
    public JSONObject addProductNew(@RequestBody ProductNew productNew) {
        Session session = SecurityUtils.getSubject().getSession();
        JSONObject userInfo = (JSONObject) session.getAttribute(Constants.SESSION_USER_INFO);
        String username = userInfo.getString("username");
        Integer userid = userInfo.getIntValue("userId");
        return productNewService.add(productNew, userid, username);
    }

    @RequiresPermissions("productNew:delete")
    @GetMapping("/delete")
    public JSONObject deleteproduct(@RequestParam Integer productID) {
        return productNewService.delete(productID);
    }

    @PostMapping("/uploadProduct")
    public JSONObject uploadProduct(@RequestBody Map<String, Object> map) {
        Integer productID = (Integer) map.get("productID");
        String countryCode = (String) map.get("country");
        String sku = (String) map.get("sku");
        Long warehouseID = Long.valueOf((Integer) map.get("warehouseID"));
        String productLevel = (String) map.get("productlevel");
        Warehouse warehouse = warehouseMapper.selectByPrimaryKey(warehouseID);
        Integer supplierID = (Integer) map.get("supplierID");
        PurchaseSupplier purchaseSupplier = purchaseSupplierMapper.selectByPrimaryKey(supplierID);
        ProductNew productNew = productNewService.getById(productID);
        Product product = new Product();
        product.setCnname(productNew.getCnname());
        product.setEnname(productNew.getEnname());
        product.setIsnew("Y");
        product.setRegisteredweight(productNew.getWeight());
        product.setRegisteredwidth(productNew.getWidth());
        product.setRegisteredlength(productNew.getLength());
        product.setRegisteredheight(productNew.getHeight());
        product.setHeadwaytype(productNew.getHeadwaytype());
        product.setDeliverytime(productNew.getDelivertime());
        product.setWarehouseid(warehouseID);
        product.setWarehousename(warehouse.getWarehousename());
        product.setSupplierid(supplierID);
        product.setSupplierlink1(productNew.getLinkurl1());
        product.setSupplierlink2(productNew.getLinkurl2());
        product.setSuppliername(purchaseSupplier.getSuppliername());
        product.setRemark(productNew.getRemark());
        product.setSkucode(sku);
        product.setProductlevel(productLevel);
        product.setCost(productNew.getCost());
        product.setImgurl(productNew.getImgurl1());
        product.setIsactive("Y");
        product.setIsdelete("N");
        ProductSell sell = new ProductSell();
        switch (countryCode) {
            case "UK":
                product.setDisplaypageurl(productNew.getOpplinkUk());
                sell.setMonth1(productNew.getExceptsellUk());
                sell.setMonth2(productNew.getExceptsellUk());
                sell.setMonth3(productNew.getExceptsellUk());
                sell.setMonth4(productNew.getExceptsellUk());
                sell.setMonth5(productNew.getExceptsellUk());
                sell.setMonth6(productNew.getExceptsellUk());
                sell.setMonth7(productNew.getExceptsellUk());
                sell.setMonth8(productNew.getExceptsellUk());
                sell.setMonth9(productNew.getExceptsellUk());
                sell.setMonth10(productNew.getExceptsellUk());
                sell.setMonth11(productNew.getExceptsellUk());
                sell.setMonth12(productNew.getExceptsellUk());
                product.setProductSell(sell);
                break;
            case "DE":
                product.setDisplaypageurl(productNew.getOpplinkDe());
                sell.setMonth1(productNew.getExceptsellDe());
                sell.setMonth2(productNew.getExceptsellDe());
                sell.setMonth3(productNew.getExceptsellDe());
                sell.setMonth4(productNew.getExceptsellDe());
                sell.setMonth5(productNew.getExceptsellDe());
                sell.setMonth6(productNew.getExceptsellDe());
                sell.setMonth7(productNew.getExceptsellDe());
                sell.setMonth8(productNew.getExceptsellDe());
                sell.setMonth9(productNew.getExceptsellDe());
                sell.setMonth10(productNew.getExceptsellDe());
                sell.setMonth11(productNew.getExceptsellDe());
                sell.setMonth12(productNew.getExceptsellDe());
                product.setProductSell(sell);
                break;
            case "US":
                product.setDisplaypageurl(productNew.getOpplinkUs());
                sell.setMonth1(productNew.getExceptsellUs());
                sell.setMonth2(productNew.getExceptsellUs());
                sell.setMonth3(productNew.getExceptsellUs());
                sell.setMonth4(productNew.getExceptsellUs());
                sell.setMonth5(productNew.getExceptsellUs());
                sell.setMonth6(productNew.getExceptsellUs());
                sell.setMonth7(productNew.getExceptsellUs());
                sell.setMonth8(productNew.getExceptsellUs());
                sell.setMonth9(productNew.getExceptsellUs());
                sell.setMonth10(productNew.getExceptsellUs());
                sell.setMonth11(productNew.getExceptsellUs());
                sell.setMonth12(productNew.getExceptsellUs());
                product.setProductSell(sell);
                break;
        }
        ProductCountry country = new ProductCountry();
        country.setCountrycode(countryCode);
        country.setImportprice(0.0);
        country.setImportrate(0.0);
        List<ProductCountry> countries = new ArrayList<>();
        countries.add(country);
        return productService.insert(product, countries, sell);
    }

}
