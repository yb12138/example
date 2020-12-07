package com.heeexy.example.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PurchaseSkuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PurchaseSkuExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andProductidIsNull() {
            addCriterion("productID is null");
            return (Criteria) this;
        }

        public Criteria andProductidIsNotNull() {
            addCriterion("productID is not null");
            return (Criteria) this;
        }

        public Criteria andProductidEqualTo(Integer value) {
            addCriterion("productID =", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotEqualTo(Integer value) {
            addCriterion("productID <>", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThan(Integer value) {
            addCriterion("productID >", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThanOrEqualTo(Integer value) {
            addCriterion("productID >=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThan(Integer value) {
            addCriterion("productID <", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThanOrEqualTo(Integer value) {
            addCriterion("productID <=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidIn(List<Integer> values) {
            addCriterion("productID in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotIn(List<Integer> values) {
            addCriterion("productID not in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidBetween(Integer value1, Integer value2) {
            addCriterion("productID between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotBetween(Integer value1, Integer value2) {
            addCriterion("productID not between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andSkuIsNull() {
            addCriterion("sku is null");
            return (Criteria) this;
        }

        public Criteria andSkuIsNotNull() {
            addCriterion("sku is not null");
            return (Criteria) this;
        }

        public Criteria andSkuEqualTo(String value) {
            addCriterion("sku =", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuNotEqualTo(String value) {
            addCriterion("sku <>", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuGreaterThan(String value) {
            addCriterion("sku >", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuGreaterThanOrEqualTo(String value) {
            addCriterion("sku >=", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuLessThan(String value) {
            addCriterion("sku <", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuLessThanOrEqualTo(String value) {
            addCriterion("sku <=", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuLike(String value) {
            addCriterion("sku like", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuNotLike(String value) {
            addCriterion("sku not like", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuIn(List<String> values) {
            addCriterion("sku in", values, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuNotIn(List<String> values) {
            addCriterion("sku not in", values, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuBetween(String value1, String value2) {
            addCriterion("sku between", value1, value2, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuNotBetween(String value1, String value2) {
            addCriterion("sku not between", value1, value2, "sku");
            return (Criteria) this;
        }

        public Criteria andWarehouseidIsNull() {
            addCriterion("warehouseID is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseidIsNotNull() {
            addCriterion("warehouseID is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseidEqualTo(Long value) {
            addCriterion("warehouseID =", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidNotEqualTo(Long value) {
            addCriterion("warehouseID <>", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidGreaterThan(Long value) {
            addCriterion("warehouseID >", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidGreaterThanOrEqualTo(Long value) {
            addCriterion("warehouseID >=", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidLessThan(Long value) {
            addCriterion("warehouseID <", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidLessThanOrEqualTo(Long value) {
            addCriterion("warehouseID <=", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidIn(List<Long> values) {
            addCriterion("warehouseID in", values, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidNotIn(List<Long> values) {
            addCriterion("warehouseID not in", values, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidBetween(Long value1, Long value2) {
            addCriterion("warehouseID between", value1, value2, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidNotBetween(Long value1, Long value2) {
            addCriterion("warehouseID not between", value1, value2, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andPurchaseidIsNull() {
            addCriterion("purchaseID is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseidIsNotNull() {
            addCriterion("purchaseID is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseidEqualTo(Integer value) {
            addCriterion("purchaseID =", value, "purchaseid");
            return (Criteria) this;
        }

        public Criteria andPurchaseidNotEqualTo(Integer value) {
            addCriterion("purchaseID <>", value, "purchaseid");
            return (Criteria) this;
        }

        public Criteria andPurchaseidGreaterThan(Integer value) {
            addCriterion("purchaseID >", value, "purchaseid");
            return (Criteria) this;
        }

        public Criteria andPurchaseidGreaterThanOrEqualTo(Integer value) {
            addCriterion("purchaseID >=", value, "purchaseid");
            return (Criteria) this;
        }

        public Criteria andPurchaseidLessThan(Integer value) {
            addCriterion("purchaseID <", value, "purchaseid");
            return (Criteria) this;
        }

        public Criteria andPurchaseidLessThanOrEqualTo(Integer value) {
            addCriterion("purchaseID <=", value, "purchaseid");
            return (Criteria) this;
        }

        public Criteria andPurchaseidIn(List<Integer> values) {
            addCriterion("purchaseID in", values, "purchaseid");
            return (Criteria) this;
        }

        public Criteria andPurchaseidNotIn(List<Integer> values) {
            addCriterion("purchaseID not in", values, "purchaseid");
            return (Criteria) this;
        }

        public Criteria andPurchaseidBetween(Integer value1, Integer value2) {
            addCriterion("purchaseID between", value1, value2, "purchaseid");
            return (Criteria) this;
        }

        public Criteria andPurchaseidNotBetween(Integer value1, Integer value2) {
            addCriterion("purchaseID not between", value1, value2, "purchaseid");
            return (Criteria) this;
        }

        public Criteria andSupplieridIsNull() {
            addCriterion("supplierID is null");
            return (Criteria) this;
        }

        public Criteria andSupplieridIsNotNull() {
            addCriterion("supplierID is not null");
            return (Criteria) this;
        }

        public Criteria andSupplieridEqualTo(Integer value) {
            addCriterion("supplierID =", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridNotEqualTo(Integer value) {
            addCriterion("supplierID <>", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridGreaterThan(Integer value) {
            addCriterion("supplierID >", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridGreaterThanOrEqualTo(Integer value) {
            addCriterion("supplierID >=", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridLessThan(Integer value) {
            addCriterion("supplierID <", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridLessThanOrEqualTo(Integer value) {
            addCriterion("supplierID <=", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridIn(List<Integer> values) {
            addCriterion("supplierID in", values, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridNotIn(List<Integer> values) {
            addCriterion("supplierID not in", values, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridBetween(Integer value1, Integer value2) {
            addCriterion("supplierID between", value1, value2, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridNotBetween(Integer value1, Integer value2) {
            addCriterion("supplierID not between", value1, value2, "supplierid");
            return (Criteria) this;
        }

        public Criteria andPurchasequantityIsNull() {
            addCriterion("purchaseQuantity is null");
            return (Criteria) this;
        }

        public Criteria andPurchasequantityIsNotNull() {
            addCriterion("purchaseQuantity is not null");
            return (Criteria) this;
        }

        public Criteria andPurchasequantityEqualTo(Integer value) {
            addCriterion("purchaseQuantity =", value, "purchasequantity");
            return (Criteria) this;
        }

        public Criteria andPurchasequantityNotEqualTo(Integer value) {
            addCriterion("purchaseQuantity <>", value, "purchasequantity");
            return (Criteria) this;
        }

        public Criteria andPurchasequantityGreaterThan(Integer value) {
            addCriterion("purchaseQuantity >", value, "purchasequantity");
            return (Criteria) this;
        }

        public Criteria andPurchasequantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("purchaseQuantity >=", value, "purchasequantity");
            return (Criteria) this;
        }

        public Criteria andPurchasequantityLessThan(Integer value) {
            addCriterion("purchaseQuantity <", value, "purchasequantity");
            return (Criteria) this;
        }

        public Criteria andPurchasequantityLessThanOrEqualTo(Integer value) {
            addCriterion("purchaseQuantity <=", value, "purchasequantity");
            return (Criteria) this;
        }

        public Criteria andPurchasequantityIn(List<Integer> values) {
            addCriterion("purchaseQuantity in", values, "purchasequantity");
            return (Criteria) this;
        }

        public Criteria andPurchasequantityNotIn(List<Integer> values) {
            addCriterion("purchaseQuantity not in", values, "purchasequantity");
            return (Criteria) this;
        }

        public Criteria andPurchasequantityBetween(Integer value1, Integer value2) {
            addCriterion("purchaseQuantity between", value1, value2, "purchasequantity");
            return (Criteria) this;
        }

        public Criteria andPurchasequantityNotBetween(Integer value1, Integer value2) {
            addCriterion("purchaseQuantity not between", value1, value2, "purchasequantity");
            return (Criteria) this;
        }

        public Criteria andStockinquantityIsNull() {
            addCriterion("stockInQuantity is null");
            return (Criteria) this;
        }

        public Criteria andStockinquantityIsNotNull() {
            addCriterion("stockInQuantity is not null");
            return (Criteria) this;
        }

        public Criteria andStockinquantityEqualTo(Integer value) {
            addCriterion("stockInQuantity =", value, "stockinquantity");
            return (Criteria) this;
        }

        public Criteria andStockinquantityNotEqualTo(Integer value) {
            addCriterion("stockInQuantity <>", value, "stockinquantity");
            return (Criteria) this;
        }

        public Criteria andStockinquantityGreaterThan(Integer value) {
            addCriterion("stockInQuantity >", value, "stockinquantity");
            return (Criteria) this;
        }

        public Criteria andStockinquantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("stockInQuantity >=", value, "stockinquantity");
            return (Criteria) this;
        }

        public Criteria andStockinquantityLessThan(Integer value) {
            addCriterion("stockInQuantity <", value, "stockinquantity");
            return (Criteria) this;
        }

        public Criteria andStockinquantityLessThanOrEqualTo(Integer value) {
            addCriterion("stockInQuantity <=", value, "stockinquantity");
            return (Criteria) this;
        }

        public Criteria andStockinquantityIn(List<Integer> values) {
            addCriterion("stockInQuantity in", values, "stockinquantity");
            return (Criteria) this;
        }

        public Criteria andStockinquantityNotIn(List<Integer> values) {
            addCriterion("stockInQuantity not in", values, "stockinquantity");
            return (Criteria) this;
        }

        public Criteria andStockinquantityBetween(Integer value1, Integer value2) {
            addCriterion("stockInQuantity between", value1, value2, "stockinquantity");
            return (Criteria) this;
        }

        public Criteria andStockinquantityNotBetween(Integer value1, Integer value2) {
            addCriterion("stockInQuantity not between", value1, value2, "stockinquantity");
            return (Criteria) this;
        }

        public Criteria andDefectivequantityIsNull() {
            addCriterion("defectiveQuantity is null");
            return (Criteria) this;
        }

        public Criteria andDefectivequantityIsNotNull() {
            addCriterion("defectiveQuantity is not null");
            return (Criteria) this;
        }

        public Criteria andDefectivequantityEqualTo(Integer value) {
            addCriterion("defectiveQuantity =", value, "defectivequantity");
            return (Criteria) this;
        }

        public Criteria andDefectivequantityNotEqualTo(Integer value) {
            addCriterion("defectiveQuantity <>", value, "defectivequantity");
            return (Criteria) this;
        }

        public Criteria andDefectivequantityGreaterThan(Integer value) {
            addCriterion("defectiveQuantity >", value, "defectivequantity");
            return (Criteria) this;
        }

        public Criteria andDefectivequantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("defectiveQuantity >=", value, "defectivequantity");
            return (Criteria) this;
        }

        public Criteria andDefectivequantityLessThan(Integer value) {
            addCriterion("defectiveQuantity <", value, "defectivequantity");
            return (Criteria) this;
        }

        public Criteria andDefectivequantityLessThanOrEqualTo(Integer value) {
            addCriterion("defectiveQuantity <=", value, "defectivequantity");
            return (Criteria) this;
        }

        public Criteria andDefectivequantityIn(List<Integer> values) {
            addCriterion("defectiveQuantity in", values, "defectivequantity");
            return (Criteria) this;
        }

        public Criteria andDefectivequantityNotIn(List<Integer> values) {
            addCriterion("defectiveQuantity not in", values, "defectivequantity");
            return (Criteria) this;
        }

        public Criteria andDefectivequantityBetween(Integer value1, Integer value2) {
            addCriterion("defectiveQuantity between", value1, value2, "defectivequantity");
            return (Criteria) this;
        }

        public Criteria andDefectivequantityNotBetween(Integer value1, Integer value2) {
            addCriterion("defectiveQuantity not between", value1, value2, "defectivequantity");
            return (Criteria) this;
        }

        public Criteria andUnitpriceIsNull() {
            addCriterion("unitPrice is null");
            return (Criteria) this;
        }

        public Criteria andUnitpriceIsNotNull() {
            addCriterion("unitPrice is not null");
            return (Criteria) this;
        }

        public Criteria andUnitpriceEqualTo(BigDecimal value) {
            addCriterion("unitPrice =", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceNotEqualTo(BigDecimal value) {
            addCriterion("unitPrice <>", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceGreaterThan(BigDecimal value) {
            addCriterion("unitPrice >", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("unitPrice >=", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceLessThan(BigDecimal value) {
            addCriterion("unitPrice <", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("unitPrice <=", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceIn(List<BigDecimal> values) {
            addCriterion("unitPrice in", values, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceNotIn(List<BigDecimal> values) {
            addCriterion("unitPrice not in", values, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unitPrice between", value1, value2, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unitPrice not between", value1, value2, "unitprice");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountIsNull() {
            addCriterion("purchaseAmount is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountIsNotNull() {
            addCriterion("purchaseAmount is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountEqualTo(BigDecimal value) {
            addCriterion("purchaseAmount =", value, "purchaseamount");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountNotEqualTo(BigDecimal value) {
            addCriterion("purchaseAmount <>", value, "purchaseamount");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountGreaterThan(BigDecimal value) {
            addCriterion("purchaseAmount >", value, "purchaseamount");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("purchaseAmount >=", value, "purchaseamount");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountLessThan(BigDecimal value) {
            addCriterion("purchaseAmount <", value, "purchaseamount");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("purchaseAmount <=", value, "purchaseamount");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountIn(List<BigDecimal> values) {
            addCriterion("purchaseAmount in", values, "purchaseamount");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountNotIn(List<BigDecimal> values) {
            addCriterion("purchaseAmount not in", values, "purchaseamount");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("purchaseAmount between", value1, value2, "purchaseamount");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("purchaseAmount not between", value1, value2, "purchaseamount");
            return (Criteria) this;
        }

        public Criteria andStockinamountIsNull() {
            addCriterion("stockInAmount is null");
            return (Criteria) this;
        }

        public Criteria andStockinamountIsNotNull() {
            addCriterion("stockInAmount is not null");
            return (Criteria) this;
        }

        public Criteria andStockinamountEqualTo(BigDecimal value) {
            addCriterion("stockInAmount =", value, "stockinamount");
            return (Criteria) this;
        }

        public Criteria andStockinamountNotEqualTo(BigDecimal value) {
            addCriterion("stockInAmount <>", value, "stockinamount");
            return (Criteria) this;
        }

        public Criteria andStockinamountGreaterThan(BigDecimal value) {
            addCriterion("stockInAmount >", value, "stockinamount");
            return (Criteria) this;
        }

        public Criteria andStockinamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("stockInAmount >=", value, "stockinamount");
            return (Criteria) this;
        }

        public Criteria andStockinamountLessThan(BigDecimal value) {
            addCriterion("stockInAmount <", value, "stockinamount");
            return (Criteria) this;
        }

        public Criteria andStockinamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("stockInAmount <=", value, "stockinamount");
            return (Criteria) this;
        }

        public Criteria andStockinamountIn(List<BigDecimal> values) {
            addCriterion("stockInAmount in", values, "stockinamount");
            return (Criteria) this;
        }

        public Criteria andStockinamountNotIn(List<BigDecimal> values) {
            addCriterion("stockInAmount not in", values, "stockinamount");
            return (Criteria) this;
        }

        public Criteria andStockinamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("stockInAmount between", value1, value2, "stockinamount");
            return (Criteria) this;
        }

        public Criteria andStockinamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("stockInAmount not between", value1, value2, "stockinamount");
            return (Criteria) this;
        }

        public Criteria andDefectiveamountIsNull() {
            addCriterion("defectiveAmount is null");
            return (Criteria) this;
        }

        public Criteria andDefectiveamountIsNotNull() {
            addCriterion("defectiveAmount is not null");
            return (Criteria) this;
        }

        public Criteria andDefectiveamountEqualTo(BigDecimal value) {
            addCriterion("defectiveAmount =", value, "defectiveamount");
            return (Criteria) this;
        }

        public Criteria andDefectiveamountNotEqualTo(BigDecimal value) {
            addCriterion("defectiveAmount <>", value, "defectiveamount");
            return (Criteria) this;
        }

        public Criteria andDefectiveamountGreaterThan(BigDecimal value) {
            addCriterion("defectiveAmount >", value, "defectiveamount");
            return (Criteria) this;
        }

        public Criteria andDefectiveamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("defectiveAmount >=", value, "defectiveamount");
            return (Criteria) this;
        }

        public Criteria andDefectiveamountLessThan(BigDecimal value) {
            addCriterion("defectiveAmount <", value, "defectiveamount");
            return (Criteria) this;
        }

        public Criteria andDefectiveamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("defectiveAmount <=", value, "defectiveamount");
            return (Criteria) this;
        }

        public Criteria andDefectiveamountIn(List<BigDecimal> values) {
            addCriterion("defectiveAmount in", values, "defectiveamount");
            return (Criteria) this;
        }

        public Criteria andDefectiveamountNotIn(List<BigDecimal> values) {
            addCriterion("defectiveAmount not in", values, "defectiveamount");
            return (Criteria) this;
        }

        public Criteria andDefectiveamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("defectiveAmount between", value1, value2, "defectiveamount");
            return (Criteria) this;
        }

        public Criteria andDefectiveamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("defectiveAmount not between", value1, value2, "defectiveamount");
            return (Criteria) this;
        }

        public Criteria andAppendquantityIsNull() {
            addCriterion("appendQuantity is null");
            return (Criteria) this;
        }

        public Criteria andAppendquantityIsNotNull() {
            addCriterion("appendQuantity is not null");
            return (Criteria) this;
        }

        public Criteria andAppendquantityEqualTo(Integer value) {
            addCriterion("appendQuantity =", value, "appendquantity");
            return (Criteria) this;
        }

        public Criteria andAppendquantityNotEqualTo(Integer value) {
            addCriterion("appendQuantity <>", value, "appendquantity");
            return (Criteria) this;
        }

        public Criteria andAppendquantityGreaterThan(Integer value) {
            addCriterion("appendQuantity >", value, "appendquantity");
            return (Criteria) this;
        }

        public Criteria andAppendquantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("appendQuantity >=", value, "appendquantity");
            return (Criteria) this;
        }

        public Criteria andAppendquantityLessThan(Integer value) {
            addCriterion("appendQuantity <", value, "appendquantity");
            return (Criteria) this;
        }

        public Criteria andAppendquantityLessThanOrEqualTo(Integer value) {
            addCriterion("appendQuantity <=", value, "appendquantity");
            return (Criteria) this;
        }

        public Criteria andAppendquantityIn(List<Integer> values) {
            addCriterion("appendQuantity in", values, "appendquantity");
            return (Criteria) this;
        }

        public Criteria andAppendquantityNotIn(List<Integer> values) {
            addCriterion("appendQuantity not in", values, "appendquantity");
            return (Criteria) this;
        }

        public Criteria andAppendquantityBetween(Integer value1, Integer value2) {
            addCriterion("appendQuantity between", value1, value2, "appendquantity");
            return (Criteria) this;
        }

        public Criteria andAppendquantityNotBetween(Integer value1, Integer value2) {
            addCriterion("appendQuantity not between", value1, value2, "appendquantity");
            return (Criteria) this;
        }

        public Criteria andCreateidIsNull() {
            addCriterion("createId is null");
            return (Criteria) this;
        }

        public Criteria andCreateidIsNotNull() {
            addCriterion("createId is not null");
            return (Criteria) this;
        }

        public Criteria andCreateidEqualTo(Integer value) {
            addCriterion("createId =", value, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidNotEqualTo(Integer value) {
            addCriterion("createId <>", value, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidGreaterThan(Integer value) {
            addCriterion("createId >", value, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidGreaterThanOrEqualTo(Integer value) {
            addCriterion("createId >=", value, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidLessThan(Integer value) {
            addCriterion("createId <", value, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidLessThanOrEqualTo(Integer value) {
            addCriterion("createId <=", value, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidIn(List<Integer> values) {
            addCriterion("createId in", values, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidNotIn(List<Integer> values) {
            addCriterion("createId not in", values, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidBetween(Integer value1, Integer value2) {
            addCriterion("createId between", value1, value2, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidNotBetween(Integer value1, Integer value2) {
            addCriterion("createId not between", value1, value2, "createid");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updateTime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updateTime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updateTime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updateTime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updateTime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updateTime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updateTime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updateTime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updateTime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updateTime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateidIsNull() {
            addCriterion("updateId is null");
            return (Criteria) this;
        }

        public Criteria andUpdateidIsNotNull() {
            addCriterion("updateId is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateidEqualTo(Integer value) {
            addCriterion("updateId =", value, "updateid");
            return (Criteria) this;
        }

        public Criteria andUpdateidNotEqualTo(Integer value) {
            addCriterion("updateId <>", value, "updateid");
            return (Criteria) this;
        }

        public Criteria andUpdateidGreaterThan(Integer value) {
            addCriterion("updateId >", value, "updateid");
            return (Criteria) this;
        }

        public Criteria andUpdateidGreaterThanOrEqualTo(Integer value) {
            addCriterion("updateId >=", value, "updateid");
            return (Criteria) this;
        }

        public Criteria andUpdateidLessThan(Integer value) {
            addCriterion("updateId <", value, "updateid");
            return (Criteria) this;
        }

        public Criteria andUpdateidLessThanOrEqualTo(Integer value) {
            addCriterion("updateId <=", value, "updateid");
            return (Criteria) this;
        }

        public Criteria andUpdateidIn(List<Integer> values) {
            addCriterion("updateId in", values, "updateid");
            return (Criteria) this;
        }

        public Criteria andUpdateidNotIn(List<Integer> values) {
            addCriterion("updateId not in", values, "updateid");
            return (Criteria) this;
        }

        public Criteria andUpdateidBetween(Integer value1, Integer value2) {
            addCriterion("updateId between", value1, value2, "updateid");
            return (Criteria) this;
        }

        public Criteria andUpdateidNotBetween(Integer value1, Integer value2) {
            addCriterion("updateId not between", value1, value2, "updateid");
            return (Criteria) this;
        }

        public Criteria andUpdatenameIsNull() {
            addCriterion("updateName is null");
            return (Criteria) this;
        }

        public Criteria andUpdatenameIsNotNull() {
            addCriterion("updateName is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatenameEqualTo(String value) {
            addCriterion("updateName =", value, "updatename");
            return (Criteria) this;
        }

        public Criteria andUpdatenameNotEqualTo(String value) {
            addCriterion("updateName <>", value, "updatename");
            return (Criteria) this;
        }

        public Criteria andUpdatenameGreaterThan(String value) {
            addCriterion("updateName >", value, "updatename");
            return (Criteria) this;
        }

        public Criteria andUpdatenameGreaterThanOrEqualTo(String value) {
            addCriterion("updateName >=", value, "updatename");
            return (Criteria) this;
        }

        public Criteria andUpdatenameLessThan(String value) {
            addCriterion("updateName <", value, "updatename");
            return (Criteria) this;
        }

        public Criteria andUpdatenameLessThanOrEqualTo(String value) {
            addCriterion("updateName <=", value, "updatename");
            return (Criteria) this;
        }

        public Criteria andUpdatenameLike(String value) {
            addCriterion("updateName like", value, "updatename");
            return (Criteria) this;
        }

        public Criteria andUpdatenameNotLike(String value) {
            addCriterion("updateName not like", value, "updatename");
            return (Criteria) this;
        }

        public Criteria andUpdatenameIn(List<String> values) {
            addCriterion("updateName in", values, "updatename");
            return (Criteria) this;
        }

        public Criteria andUpdatenameNotIn(List<String> values) {
            addCriterion("updateName not in", values, "updatename");
            return (Criteria) this;
        }

        public Criteria andUpdatenameBetween(String value1, String value2) {
            addCriterion("updateName between", value1, value2, "updatename");
            return (Criteria) this;
        }

        public Criteria andUpdatenameNotBetween(String value1, String value2) {
            addCriterion("updateName not between", value1, value2, "updatename");
            return (Criteria) this;
        }

        public Criteria andRemakeIsNull() {
            addCriterion("remake is null");
            return (Criteria) this;
        }

        public Criteria andRemakeIsNotNull() {
            addCriterion("remake is not null");
            return (Criteria) this;
        }

        public Criteria andRemakeEqualTo(String value) {
            addCriterion("remake =", value, "remake");
            return (Criteria) this;
        }

        public Criteria andRemakeNotEqualTo(String value) {
            addCriterion("remake <>", value, "remake");
            return (Criteria) this;
        }

        public Criteria andRemakeGreaterThan(String value) {
            addCriterion("remake >", value, "remake");
            return (Criteria) this;
        }

        public Criteria andRemakeGreaterThanOrEqualTo(String value) {
            addCriterion("remake >=", value, "remake");
            return (Criteria) this;
        }

        public Criteria andRemakeLessThan(String value) {
            addCriterion("remake <", value, "remake");
            return (Criteria) this;
        }

        public Criteria andRemakeLessThanOrEqualTo(String value) {
            addCriterion("remake <=", value, "remake");
            return (Criteria) this;
        }

        public Criteria andRemakeLike(String value) {
            addCriterion("remake like", value, "remake");
            return (Criteria) this;
        }

        public Criteria andRemakeNotLike(String value) {
            addCriterion("remake not like", value, "remake");
            return (Criteria) this;
        }

        public Criteria andRemakeIn(List<String> values) {
            addCriterion("remake in", values, "remake");
            return (Criteria) this;
        }

        public Criteria andRemakeNotIn(List<String> values) {
            addCriterion("remake not in", values, "remake");
            return (Criteria) this;
        }

        public Criteria andRemakeBetween(String value1, String value2) {
            addCriterion("remake between", value1, value2, "remake");
            return (Criteria) this;
        }

        public Criteria andRemakeNotBetween(String value1, String value2) {
            addCriterion("remake not between", value1, value2, "remake");
            return (Criteria) this;
        }

        public Criteria andCreatenameIsNull() {
            addCriterion("createName is null");
            return (Criteria) this;
        }

        public Criteria andCreatenameIsNotNull() {
            addCriterion("createName is not null");
            return (Criteria) this;
        }

        public Criteria andCreatenameEqualTo(String value) {
            addCriterion("createName =", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameNotEqualTo(String value) {
            addCriterion("createName <>", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameGreaterThan(String value) {
            addCriterion("createName >", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameGreaterThanOrEqualTo(String value) {
            addCriterion("createName >=", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameLessThan(String value) {
            addCriterion("createName <", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameLessThanOrEqualTo(String value) {
            addCriterion("createName <=", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameLike(String value) {
            addCriterion("createName like", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameNotLike(String value) {
            addCriterion("createName not like", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameIn(List<String> values) {
            addCriterion("createName in", values, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameNotIn(List<String> values) {
            addCriterion("createName not in", values, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameBetween(String value1, String value2) {
            addCriterion("createName between", value1, value2, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameNotBetween(String value1, String value2) {
            addCriterion("createName not between", value1, value2, "createname");
            return (Criteria) this;
        }

        public Criteria andCnnameIsNull() {
            addCriterion("cnName is null");
            return (Criteria) this;
        }

        public Criteria andCnnameIsNotNull() {
            addCriterion("cnName is not null");
            return (Criteria) this;
        }

        public Criteria andCnnameEqualTo(String value) {
            addCriterion("cnName =", value, "cnname");
            return (Criteria) this;
        }

        public Criteria andCnnameNotEqualTo(String value) {
            addCriterion("cnName <>", value, "cnname");
            return (Criteria) this;
        }

        public Criteria andCnnameGreaterThan(String value) {
            addCriterion("cnName >", value, "cnname");
            return (Criteria) this;
        }

        public Criteria andCnnameGreaterThanOrEqualTo(String value) {
            addCriterion("cnName >=", value, "cnname");
            return (Criteria) this;
        }

        public Criteria andCnnameLessThan(String value) {
            addCriterion("cnName <", value, "cnname");
            return (Criteria) this;
        }

        public Criteria andCnnameLessThanOrEqualTo(String value) {
            addCriterion("cnName <=", value, "cnname");
            return (Criteria) this;
        }

        public Criteria andCnnameLike(String value) {
            addCriterion("cnName like", value, "cnname");
            return (Criteria) this;
        }

        public Criteria andCnnameNotLike(String value) {
            addCriterion("cnName not like", value, "cnname");
            return (Criteria) this;
        }

        public Criteria andCnnameIn(List<String> values) {
            addCriterion("cnName in", values, "cnname");
            return (Criteria) this;
        }

        public Criteria andCnnameNotIn(List<String> values) {
            addCriterion("cnName not in", values, "cnname");
            return (Criteria) this;
        }

        public Criteria andCnnameBetween(String value1, String value2) {
            addCriterion("cnName between", value1, value2, "cnname");
            return (Criteria) this;
        }

        public Criteria andCnnameNotBetween(String value1, String value2) {
            addCriterion("cnName not between", value1, value2, "cnname");
            return (Criteria) this;
        }

        public Criteria andUsequantityIsNull() {
            addCriterion("useQuantity is null");
            return (Criteria) this;
        }

        public Criteria andUsequantityIsNotNull() {
            addCriterion("useQuantity is not null");
            return (Criteria) this;
        }

        public Criteria andUsequantityEqualTo(Integer value) {
            addCriterion("useQuantity =", value, "usequantity");
            return (Criteria) this;
        }

        public Criteria andUsequantityNotEqualTo(Integer value) {
            addCriterion("useQuantity <>", value, "usequantity");
            return (Criteria) this;
        }

        public Criteria andUsequantityGreaterThan(Integer value) {
            addCriterion("useQuantity >", value, "usequantity");
            return (Criteria) this;
        }

        public Criteria andUsequantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("useQuantity >=", value, "usequantity");
            return (Criteria) this;
        }

        public Criteria andUsequantityLessThan(Integer value) {
            addCriterion("useQuantity <", value, "usequantity");
            return (Criteria) this;
        }

        public Criteria andUsequantityLessThanOrEqualTo(Integer value) {
            addCriterion("useQuantity <=", value, "usequantity");
            return (Criteria) this;
        }

        public Criteria andUsequantityIn(List<Integer> values) {
            addCriterion("useQuantity in", values, "usequantity");
            return (Criteria) this;
        }

        public Criteria andUsequantityNotIn(List<Integer> values) {
            addCriterion("useQuantity not in", values, "usequantity");
            return (Criteria) this;
        }

        public Criteria andUsequantityBetween(Integer value1, Integer value2) {
            addCriterion("useQuantity between", value1, value2, "usequantity");
            return (Criteria) this;
        }

        public Criteria andUsequantityNotBetween(Integer value1, Integer value2) {
            addCriterion("useQuantity not between", value1, value2, "usequantity");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}