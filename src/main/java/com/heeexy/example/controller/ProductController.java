package com.heeexy.example.controller;


import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.model.Aftermarket;
import com.heeexy.example.model.Product;
import com.heeexy.example.model.ProductCountry;
import com.heeexy.example.model.ProductSell;
import com.heeexy.example.service.ProductService;
import com.heeexy.example.util.CommonUtil;
import com.heeexy.example.util.ExcelUtils;
import com.heeexy.example.util.constants.ErrorEnum;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService productService;

    /**
     * 查询产品列表，分页
     */
    @RequiresPermissions("product:list")
    @PostMapping("/list")
    public JSONObject list(@RequestBody Map<String, String> map) {
        System.out.println("map:" + map.toString());
        Integer pageNo = Integer.valueOf(map.get("pageNum"));
        Integer pageSize = Integer.valueOf(map.get("pageRow"));
        String sku = map.get("sku");
        String name = map.get("name");
        Long warehouseid = null;
        if (!StringUtils.isEmpty(map.get("warehouseid"))) {
            warehouseid = Long.valueOf(map.get("warehouseid"));
        }
        String country = null;
        return productService.queryProductInfo(pageNo, pageSize, sku, name, warehouseid, country);
    }

    @RequiresPermissions("product:list")
    @GetMapping("/listAll")
    public JSONObject listAll() {
        return productService.queryAllProduct();
    }

    @RequiresPermissions("product:add")
    @PostMapping("/insert")
    public JSONObject insert(@RequestBody Product product) {
        List<ProductCountry> productCountries = product.getCountries();
        if (productCountries == null || productCountries.size() == 0) {
            return CommonUtil.errorJson(ErrorEnum.E_90003);
        }
        ProductSell productSell = product.getProductSell();
        return productService.insert(product, productCountries, productSell);
    }

    @RequiresPermissions("product:update")
    @PostMapping("/update")
    public JSONObject update(@RequestBody Product product) {
        List<ProductCountry> productCountries = product.getCountries();
        ProductSell productSell = product.getProductSell();
        return productService.update(product, productCountries, productSell);
    }

    @RequiresPermissions("product:delete")
    @GetMapping("/delete")
    public JSONObject delete(@RequestParam Integer productID) {
        return productService.delete(productID);
    }

    @RequiresPermissions("product:list")
    @GetMapping("/excel")
    public void excel(HttpServletResponse response) throws IOException {
        List<Product> products = productService.exportAll();
        ExcelUtils.exportExcel(products, "产品表格", "产品表", Product.class, "产品表格", true, response);
    }
}
