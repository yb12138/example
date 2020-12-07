package com.heeexy.example.controller;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.model.PurchaseSupplier;
import com.heeexy.example.service.SupplierService;
import com.heeexy.example.util.constants.Constants;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/supplier")
public class SupplierController {
    @Autowired
    SupplierService supplierService;


    @GetMapping("/list")
    public JSONObject listSupplier() {
        return supplierService.listAllSupplier();
    }

    @PostMapping("/listSupplier")
    public JSONObject listAllSupplier(@RequestBody Map<String, String> params) {
        Integer pageNo = Integer.valueOf(params.get("pageNum"));
        Integer pageSize = Integer.valueOf(params.get("pageRow"));
        String name = params.get("name");
        return supplierService.listSupplier(pageNo, pageSize, name);
    }

    @PostMapping("/add")
    public JSONObject addSupplier(@RequestBody PurchaseSupplier purchaseSupplier) {
        Session session = SecurityUtils.getSubject().getSession();
        JSONObject userInfo = (JSONObject) session.getAttribute(Constants.SESSION_USER_INFO);
        String username = userInfo.getString("username");
        Integer userid = userInfo.getIntValue("userId");
        return supplierService.addSupplier(purchaseSupplier, username, userid);
    }

    @PostMapping("/update")
    public JSONObject updateSupplier(@RequestBody PurchaseSupplier purchaseSupplier) {
        purchaseSupplier.setCreateid(null);
        purchaseSupplier.setCreatetime(null);
        return supplierService.updateSupplier(purchaseSupplier);
    }

    @GetMapping("/delete")
    public JSONObject deleteSupplier(@RequestParam Integer supplierID) {
        return supplierService.deleteSupplier(supplierID);
    }

    @GetMapping("/listproduct")
    public JSONObject listproduct(@RequestParam Integer supplierid) {
        System.out.println("supplierid:" + supplierid);
        return supplierService.listAllSuppliersProduct(supplierid);
    }

}
