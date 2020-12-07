package com.heeexy.example.model;


import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelEntity;

import java.io.Serializable;
import java.util.List;


public class Product implements Serializable {
    @Excel(name = "产品编号")
    private Integer productid;
    @Excel(name = "产品sku")
    private String skucode;
    @Excel(name = "中文名称")
    private String cnname;
    @Excel(name = "英文名称")
    private String enname;
    @Excel(name = "注册长")
    private Double registeredlength;
    @Excel(name = "注册宽")
    private Double registeredwidth;
    @Excel(name = "注册高")
    private Double registeredheight;
    @Excel(name = "品牌", replace = {"是_Y", "否_N"})
    private String branded;
    private String brandedname;

    private String model;
    @Excel(name = "参考链接")
    private String displaypageurl;
    @Excel(name = "备注")
    private String remark;

    private String inportdeclaredvalue;

    private String exportdeclaredvalue;
    @Excel(name = "电池", replace = {"带电_Y", "不带电_N"})
    private String battery;

    private String exportcountry;

    private String inporcountry;
    @Excel(name = "注册重量")
    private Double registeredweight;
    @Excel(name = "新品", replace = {"新品_Y", "旧品_N"})
    private String isnew;

    private Long warehouseid;
    @Excel(name = "仓库")
    private String warehousename;
    @Excel(name = "头程")
    private String headwaytype;
    @Excel(name = "产品等级")
    private String productlevel;

    private Integer salegroupid;
    @Excel(name = "销售组")
    private String salegroupname;

    private Integer productgroupid;
    @Excel(name = "产品组")
    private String productgroupname;

    private String isactive;

    private String isdelete;

    @Excel(name = "带插座", replace = {"带_Y", "不带_N"})
    private String isplus;

    private Double registeredvolume;
    @Excel(name = "图片链接")
    private String imgurl;
    @Excel(name = "价格")
    private Double cost;

    private Integer mid;
    @Excel(name = "母代码")
    private String mcode;

    private Integer supplierid;
    @Excel(name = "供应商")
    private String suppliername;
    @Excel(name = "供应商链接1")
    private String supplierlink1;
    @Excel(name = "供应商链接2")
    private String supplierlink2;
    @Excel(name = "供应商链接3")
    private String supplierlink3;
    @Excel(name = "交货期")
    private Integer deliverytime;
    @Excel(name = "申报链接")
    private String registerlink;

    private ProductSell productSell;

    private List<ProductCountry> countries;

    public Product() {
    }


    public ProductSell getProductSell() {
        return productSell;
    }

    public void setProductSell(ProductSell productSell) {
        this.productSell = productSell;
    }

    public List<ProductCountry> getCountries() {
        return countries;
    }

    public void setCountries(List<ProductCountry> countries) {
        this.countries = countries;
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public String getSkucode() {
        return skucode;
    }

    public void setSkucode(String skucode) {
        this.skucode = skucode == null ? null : skucode.trim();
    }

    public String getCnname() {
        return cnname;
    }

    public void setCnname(String cnname) {
        this.cnname = cnname == null ? null : cnname.trim();
    }

    public String getEnname() {
        return enname;
    }

    public void setEnname(String enname) {
        this.enname = enname == null ? null : enname.trim();
    }

    public Double getRegisteredlength() {
        return registeredlength;
    }

    public void setRegisteredlength(Double registeredlength) {
        this.registeredlength = registeredlength;
    }

    public Double getRegisteredwidth() {
        return registeredwidth;
    }

    public void setRegisteredwidth(Double registeredwidth) {
        this.registeredwidth = registeredwidth;
    }

    public Double getRegisteredheight() {
        return registeredheight;
    }

    public void setRegisteredheight(Double registeredheight) {
        this.registeredheight = registeredheight;
    }

    public String getBranded() {
        return branded;
    }

    public void setBranded(String branded) {
        this.branded = branded == null ? null : branded.trim();
    }

    public String getBrandedname() {
        return brandedname;
    }

    public void setBrandedname(String brandedname) {
        this.brandedname = brandedname == null ? null : brandedname.trim();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
    }

    public String getDisplaypageurl() {
        return displaypageurl;
    }

    public void setDisplaypageurl(String displaypageurl) {
        this.displaypageurl = displaypageurl == null ? null : displaypageurl.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getInportdeclaredvalue() {
        return inportdeclaredvalue;
    }

    public void setInportdeclaredvalue(String inportdeclaredvalue) {
        this.inportdeclaredvalue = inportdeclaredvalue == null ? null : inportdeclaredvalue.trim();
    }

    public String getExportdeclaredvalue() {
        return exportdeclaredvalue;
    }

    public void setExportdeclaredvalue(String exportdeclaredvalue) {
        this.exportdeclaredvalue = exportdeclaredvalue == null ? null : exportdeclaredvalue.trim();
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery == null ? null : battery.trim();
    }

    public String getExportcountry() {
        return exportcountry;
    }

    public void setExportcountry(String exportcountry) {
        this.exportcountry = exportcountry == null ? null : exportcountry.trim();
    }

    public String getInporcountry() {
        return inporcountry;
    }

    public void setInporcountry(String inporcountry) {
        this.inporcountry = inporcountry == null ? null : inporcountry.trim();
    }

    public Double getRegisteredweight() {
        return registeredweight;
    }

    public void setRegisteredweight(Double registeredweight) {
        this.registeredweight = registeredweight;
    }

    public String getIsnew() {
        return isnew;
    }

    public void setIsnew(String isnew) {
        this.isnew = isnew == null ? null : isnew.trim();
    }

    public Long getWarehouseid() {
        return warehouseid;
    }

    public void setWarehouseid(Long warehouseid) {
        this.warehouseid = warehouseid;
    }

    public String getWarehousename() {
        return warehousename;
    }

    public void setWarehousename(String warehousename) {
        this.warehousename = warehousename == null ? null : warehousename.trim();
    }

    public String getHeadwaytype() {
        return headwaytype;
    }

    public void setHeadwaytype(String headwaytype) {
        this.headwaytype = headwaytype == null ? null : headwaytype.trim();
    }

    public String getProductlevel() {
        return productlevel;
    }

    public void setProductlevel(String productlevel) {
        this.productlevel = productlevel == null ? null : productlevel.trim();
    }

    public Integer getSalegroupid() {
        return salegroupid;
    }

    public void setSalegroupid(Integer salegroupid) {
        this.salegroupid = salegroupid;
    }

    public String getSalegroupname() {
        return salegroupname;
    }

    public void setSalegroupname(String salegroupname) {
        this.salegroupname = salegroupname == null ? null : salegroupname.trim();
    }

    public Integer getProductgroupid() {
        return productgroupid;
    }

    public void setProductgroupid(Integer productgroupid) {
        this.productgroupid = productgroupid;
    }

    public String getProductgroupname() {
        return productgroupname;
    }

    public void setProductgroupname(String productgroupname) {
        this.productgroupname = productgroupname == null ? null : productgroupname.trim();
    }

    public String getIsactive() {
        return isactive;
    }

    public void setIsactive(String isactive) {
        this.isactive = isactive == null ? null : isactive.trim();
    }

    public String getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(String isdelete) {
        this.isdelete = isdelete == null ? null : isdelete.trim();
    }

    public String getIsplus() {
        return isplus;
    }

    public void setIsplus(String isplus) {
        this.isplus = isplus == null ? null : isplus.trim();
    }

    public Double getRegisteredvolume() {
        return registeredvolume;
    }

    public void setRegisteredvolume(Double registeredvolume) {
        this.registeredvolume = registeredvolume;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl == null ? null : imgurl.trim();
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getMcode() {
        return mcode;
    }

    public void setMcode(String mcode) {
        this.mcode = mcode == null ? null : mcode.trim();
    }

    public Integer getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(Integer supplierid) {
        this.supplierid = supplierid;
    }

    public String getSuppliername() {
        return suppliername;
    }

    public void setSuppliername(String suppliername) {
        this.suppliername = suppliername == null ? null : suppliername.trim();
    }

    public String getSupplierlink1() {
        return supplierlink1;
    }

    public void setSupplierlink1(String supplierlink1) {
        this.supplierlink1 = supplierlink1 == null ? null : supplierlink1.trim();
    }

    public String getSupplierlink2() {
        return supplierlink2;
    }

    public void setSupplierlink2(String supplierlink2) {
        this.supplierlink2 = supplierlink2 == null ? null : supplierlink2.trim();
    }

    public String getSupplierlink3() {
        return supplierlink3;
    }

    public void setSupplierlink3(String supplierlink3) {
        this.supplierlink3 = supplierlink3 == null ? null : supplierlink3.trim();
    }

    public Integer getDeliverytime() {
        return deliverytime;
    }

    public void setDeliverytime(Integer deliverytime) {
        this.deliverytime = deliverytime;
    }

    public String getRegisterlink() {
        return registerlink;
    }

    public void setRegisterlink(String registerlink) {
        this.registerlink = registerlink == null ? null : registerlink.trim();
    }

    @Override
    public String toString() {
        return "Product{" +
                "productid=" + productid +
                ", skucode='" + skucode + '\'' +
                ", cnname='" + cnname + '\'' +
                ", enname='" + enname + '\'' +
                ", registeredlength=" + registeredlength +
                ", registeredwidth=" + registeredwidth +
                ", registeredheight=" + registeredheight +
                ", branded='" + branded + '\'' +
                ", brandedname='" + brandedname + '\'' +
                ", model='" + model + '\'' +
                ", displaypageurl='" + displaypageurl + '\'' +
                ", remark='" + remark + '\'' +
                ", inportdeclaredvalue='" + inportdeclaredvalue + '\'' +
                ", exportdeclaredvalue='" + exportdeclaredvalue + '\'' +
                ", battery='" + battery + '\'' +
                ", exportcountry='" + exportcountry + '\'' +
                ", inporcountry='" + inporcountry + '\'' +
                ", registeredweight=" + registeredweight +
                ", isnew='" + isnew + '\'' +
                ", warehouseid=" + warehouseid +
                ", warehousename='" + warehousename + '\'' +
                ", headwaytype='" + headwaytype + '\'' +
                ", productlevel='" + productlevel + '\'' +
                ", salegroupid=" + salegroupid +
                ", salegroupname='" + salegroupname + '\'' +
                ", productgroupid=" + productgroupid +
                ", productgroupname='" + productgroupname + '\'' +
                ", isactive='" + isactive + '\'' +
                ", isdelete='" + isdelete + '\'' +
                ", isplus='" + isplus + '\'' +
                ", registeredvolume=" + registeredvolume +
                ", imgurl='" + imgurl + '\'' +
                ", cost=" + cost +
                ", mid=" + mid +
                ", mcode='" + mcode + '\'' +
                ", supplierid=" + supplierid +
                ", suppliername='" + suppliername + '\'' +
                ", supplierlink1='" + supplierlink1 + '\'' +
                ", supplierlink2='" + supplierlink2 + '\'' +
                ", supplierlink3='" + supplierlink3 + '\'' +
                ", deliverytime=" + deliverytime +
                ", registerlink='" + registerlink + '\'' +
                '}';
    }
}