package com.heeexy.example.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WarninfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WarninfoExample() {
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

        public Criteria andSkucodeIsNull() {
            addCriterion("skuCode is null");
            return (Criteria) this;
        }

        public Criteria andSkucodeIsNotNull() {
            addCriterion("skuCode is not null");
            return (Criteria) this;
        }

        public Criteria andSkucodeEqualTo(String value) {
            addCriterion("skuCode =", value, "skucode");
            return (Criteria) this;
        }

        public Criteria andSkucodeNotEqualTo(String value) {
            addCriterion("skuCode <>", value, "skucode");
            return (Criteria) this;
        }

        public Criteria andSkucodeGreaterThan(String value) {
            addCriterion("skuCode >", value, "skucode");
            return (Criteria) this;
        }

        public Criteria andSkucodeGreaterThanOrEqualTo(String value) {
            addCriterion("skuCode >=", value, "skucode");
            return (Criteria) this;
        }

        public Criteria andSkucodeLessThan(String value) {
            addCriterion("skuCode <", value, "skucode");
            return (Criteria) this;
        }

        public Criteria andSkucodeLessThanOrEqualTo(String value) {
            addCriterion("skuCode <=", value, "skucode");
            return (Criteria) this;
        }

        public Criteria andSkucodeLike(String value) {
            addCriterion("skuCode like", value, "skucode");
            return (Criteria) this;
        }

        public Criteria andSkucodeNotLike(String value) {
            addCriterion("skuCode not like", value, "skucode");
            return (Criteria) this;
        }

        public Criteria andSkucodeIn(List<String> values) {
            addCriterion("skuCode in", values, "skucode");
            return (Criteria) this;
        }

        public Criteria andSkucodeNotIn(List<String> values) {
            addCriterion("skuCode not in", values, "skucode");
            return (Criteria) this;
        }

        public Criteria andSkucodeBetween(String value1, String value2) {
            addCriterion("skuCode between", value1, value2, "skucode");
            return (Criteria) this;
        }

        public Criteria andSkucodeNotBetween(String value1, String value2) {
            addCriterion("skuCode not between", value1, value2, "skucode");
            return (Criteria) this;
        }

        public Criteria andStoragequantityIsNull() {
            addCriterion("storageQuantity is null");
            return (Criteria) this;
        }

        public Criteria andStoragequantityIsNotNull() {
            addCriterion("storageQuantity is not null");
            return (Criteria) this;
        }

        public Criteria andStoragequantityEqualTo(Integer value) {
            addCriterion("storageQuantity =", value, "storagequantity");
            return (Criteria) this;
        }

        public Criteria andStoragequantityNotEqualTo(Integer value) {
            addCriterion("storageQuantity <>", value, "storagequantity");
            return (Criteria) this;
        }

        public Criteria andStoragequantityGreaterThan(Integer value) {
            addCriterion("storageQuantity >", value, "storagequantity");
            return (Criteria) this;
        }

        public Criteria andStoragequantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("storageQuantity >=", value, "storagequantity");
            return (Criteria) this;
        }

        public Criteria andStoragequantityLessThan(Integer value) {
            addCriterion("storageQuantity <", value, "storagequantity");
            return (Criteria) this;
        }

        public Criteria andStoragequantityLessThanOrEqualTo(Integer value) {
            addCriterion("storageQuantity <=", value, "storagequantity");
            return (Criteria) this;
        }

        public Criteria andStoragequantityIn(List<Integer> values) {
            addCriterion("storageQuantity in", values, "storagequantity");
            return (Criteria) this;
        }

        public Criteria andStoragequantityNotIn(List<Integer> values) {
            addCriterion("storageQuantity not in", values, "storagequantity");
            return (Criteria) this;
        }

        public Criteria andStoragequantityBetween(Integer value1, Integer value2) {
            addCriterion("storageQuantity between", value1, value2, "storagequantity");
            return (Criteria) this;
        }

        public Criteria andStoragequantityNotBetween(Integer value1, Integer value2) {
            addCriterion("storageQuantity not between", value1, value2, "storagequantity");
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

        public Criteria andCnquantityIsNull() {
            addCriterion("cnQuantity is null");
            return (Criteria) this;
        }

        public Criteria andCnquantityIsNotNull() {
            addCriterion("cnQuantity is not null");
            return (Criteria) this;
        }

        public Criteria andCnquantityEqualTo(Integer value) {
            addCriterion("cnQuantity =", value, "cnquantity");
            return (Criteria) this;
        }

        public Criteria andCnquantityNotEqualTo(Integer value) {
            addCriterion("cnQuantity <>", value, "cnquantity");
            return (Criteria) this;
        }

        public Criteria andCnquantityGreaterThan(Integer value) {
            addCriterion("cnQuantity >", value, "cnquantity");
            return (Criteria) this;
        }

        public Criteria andCnquantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("cnQuantity >=", value, "cnquantity");
            return (Criteria) this;
        }

        public Criteria andCnquantityLessThan(Integer value) {
            addCriterion("cnQuantity <", value, "cnquantity");
            return (Criteria) this;
        }

        public Criteria andCnquantityLessThanOrEqualTo(Integer value) {
            addCriterion("cnQuantity <=", value, "cnquantity");
            return (Criteria) this;
        }

        public Criteria andCnquantityIn(List<Integer> values) {
            addCriterion("cnQuantity in", values, "cnquantity");
            return (Criteria) this;
        }

        public Criteria andCnquantityNotIn(List<Integer> values) {
            addCriterion("cnQuantity not in", values, "cnquantity");
            return (Criteria) this;
        }

        public Criteria andCnquantityBetween(Integer value1, Integer value2) {
            addCriterion("cnQuantity between", value1, value2, "cnquantity");
            return (Criteria) this;
        }

        public Criteria andCnquantityNotBetween(Integer value1, Integer value2) {
            addCriterion("cnQuantity not between", value1, value2, "cnquantity");
            return (Criteria) this;
        }

        public Criteria andWayquantityIsNull() {
            addCriterion("wayQuantity is null");
            return (Criteria) this;
        }

        public Criteria andWayquantityIsNotNull() {
            addCriterion("wayQuantity is not null");
            return (Criteria) this;
        }

        public Criteria andWayquantityEqualTo(Integer value) {
            addCriterion("wayQuantity =", value, "wayquantity");
            return (Criteria) this;
        }

        public Criteria andWayquantityNotEqualTo(Integer value) {
            addCriterion("wayQuantity <>", value, "wayquantity");
            return (Criteria) this;
        }

        public Criteria andWayquantityGreaterThan(Integer value) {
            addCriterion("wayQuantity >", value, "wayquantity");
            return (Criteria) this;
        }

        public Criteria andWayquantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("wayQuantity >=", value, "wayquantity");
            return (Criteria) this;
        }

        public Criteria andWayquantityLessThan(Integer value) {
            addCriterion("wayQuantity <", value, "wayquantity");
            return (Criteria) this;
        }

        public Criteria andWayquantityLessThanOrEqualTo(Integer value) {
            addCriterion("wayQuantity <=", value, "wayquantity");
            return (Criteria) this;
        }

        public Criteria andWayquantityIn(List<Integer> values) {
            addCriterion("wayQuantity in", values, "wayquantity");
            return (Criteria) this;
        }

        public Criteria andWayquantityNotIn(List<Integer> values) {
            addCriterion("wayQuantity not in", values, "wayquantity");
            return (Criteria) this;
        }

        public Criteria andWayquantityBetween(Integer value1, Integer value2) {
            addCriterion("wayQuantity between", value1, value2, "wayquantity");
            return (Criteria) this;
        }

        public Criteria andWayquantityNotBetween(Integer value1, Integer value2) {
            addCriterion("wayQuantity not between", value1, value2, "wayquantity");
            return (Criteria) this;
        }

        public Criteria andWarnquantityIsNull() {
            addCriterion("warnQuantity is null");
            return (Criteria) this;
        }

        public Criteria andWarnquantityIsNotNull() {
            addCriterion("warnQuantity is not null");
            return (Criteria) this;
        }

        public Criteria andWarnquantityEqualTo(Integer value) {
            addCriterion("warnQuantity =", value, "warnquantity");
            return (Criteria) this;
        }

        public Criteria andWarnquantityNotEqualTo(Integer value) {
            addCriterion("warnQuantity <>", value, "warnquantity");
            return (Criteria) this;
        }

        public Criteria andWarnquantityGreaterThan(Integer value) {
            addCriterion("warnQuantity >", value, "warnquantity");
            return (Criteria) this;
        }

        public Criteria andWarnquantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("warnQuantity >=", value, "warnquantity");
            return (Criteria) this;
        }

        public Criteria andWarnquantityLessThan(Integer value) {
            addCriterion("warnQuantity <", value, "warnquantity");
            return (Criteria) this;
        }

        public Criteria andWarnquantityLessThanOrEqualTo(Integer value) {
            addCriterion("warnQuantity <=", value, "warnquantity");
            return (Criteria) this;
        }

        public Criteria andWarnquantityIn(List<Integer> values) {
            addCriterion("warnQuantity in", values, "warnquantity");
            return (Criteria) this;
        }

        public Criteria andWarnquantityNotIn(List<Integer> values) {
            addCriterion("warnQuantity not in", values, "warnquantity");
            return (Criteria) this;
        }

        public Criteria andWarnquantityBetween(Integer value1, Integer value2) {
            addCriterion("warnQuantity between", value1, value2, "warnquantity");
            return (Criteria) this;
        }

        public Criteria andWarnquantityNotBetween(Integer value1, Integer value2) {
            addCriterion("warnQuantity not between", value1, value2, "warnquantity");
            return (Criteria) this;
        }

        public Criteria andActualquantityIsNull() {
            addCriterion("actualQuantity is null");
            return (Criteria) this;
        }

        public Criteria andActualquantityIsNotNull() {
            addCriterion("actualQuantity is not null");
            return (Criteria) this;
        }

        public Criteria andActualquantityEqualTo(Integer value) {
            addCriterion("actualQuantity =", value, "actualquantity");
            return (Criteria) this;
        }

        public Criteria andActualquantityNotEqualTo(Integer value) {
            addCriterion("actualQuantity <>", value, "actualquantity");
            return (Criteria) this;
        }

        public Criteria andActualquantityGreaterThan(Integer value) {
            addCriterion("actualQuantity >", value, "actualquantity");
            return (Criteria) this;
        }

        public Criteria andActualquantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("actualQuantity >=", value, "actualquantity");
            return (Criteria) this;
        }

        public Criteria andActualquantityLessThan(Integer value) {
            addCriterion("actualQuantity <", value, "actualquantity");
            return (Criteria) this;
        }

        public Criteria andActualquantityLessThanOrEqualTo(Integer value) {
            addCriterion("actualQuantity <=", value, "actualquantity");
            return (Criteria) this;
        }

        public Criteria andActualquantityIn(List<Integer> values) {
            addCriterion("actualQuantity in", values, "actualquantity");
            return (Criteria) this;
        }

        public Criteria andActualquantityNotIn(List<Integer> values) {
            addCriterion("actualQuantity not in", values, "actualquantity");
            return (Criteria) this;
        }

        public Criteria andActualquantityBetween(Integer value1, Integer value2) {
            addCriterion("actualQuantity between", value1, value2, "actualquantity");
            return (Criteria) this;
        }

        public Criteria andActualquantityNotBetween(Integer value1, Integer value2) {
            addCriterion("actualQuantity not between", value1, value2, "actualquantity");
            return (Criteria) this;
        }

        public Criteria andAveragesalesqty7IsNull() {
            addCriterion("averageSalesQty7 is null");
            return (Criteria) this;
        }

        public Criteria andAveragesalesqty7IsNotNull() {
            addCriterion("averageSalesQty7 is not null");
            return (Criteria) this;
        }

        public Criteria andAveragesalesqty7EqualTo(String value) {
            addCriterion("averageSalesQty7 =", value, "averagesalesqty7");
            return (Criteria) this;
        }

        public Criteria andAveragesalesqty7NotEqualTo(String value) {
            addCriterion("averageSalesQty7 <>", value, "averagesalesqty7");
            return (Criteria) this;
        }

        public Criteria andAveragesalesqty7GreaterThan(String value) {
            addCriterion("averageSalesQty7 >", value, "averagesalesqty7");
            return (Criteria) this;
        }

        public Criteria andAveragesalesqty7GreaterThanOrEqualTo(String value) {
            addCriterion("averageSalesQty7 >=", value, "averagesalesqty7");
            return (Criteria) this;
        }

        public Criteria andAveragesalesqty7LessThan(String value) {
            addCriterion("averageSalesQty7 <", value, "averagesalesqty7");
            return (Criteria) this;
        }

        public Criteria andAveragesalesqty7LessThanOrEqualTo(String value) {
            addCriterion("averageSalesQty7 <=", value, "averagesalesqty7");
            return (Criteria) this;
        }

        public Criteria andAveragesalesqty7Like(String value) {
            addCriterion("averageSalesQty7 like", value, "averagesalesqty7");
            return (Criteria) this;
        }

        public Criteria andAveragesalesqty7NotLike(String value) {
            addCriterion("averageSalesQty7 not like", value, "averagesalesqty7");
            return (Criteria) this;
        }

        public Criteria andAveragesalesqty7In(List<String> values) {
            addCriterion("averageSalesQty7 in", values, "averagesalesqty7");
            return (Criteria) this;
        }

        public Criteria andAveragesalesqty7NotIn(List<String> values) {
            addCriterion("averageSalesQty7 not in", values, "averagesalesqty7");
            return (Criteria) this;
        }

        public Criteria andAveragesalesqty7Between(String value1, String value2) {
            addCriterion("averageSalesQty7 between", value1, value2, "averagesalesqty7");
            return (Criteria) this;
        }

        public Criteria andAveragesalesqty7NotBetween(String value1, String value2) {
            addCriterion("averageSalesQty7 not between", value1, value2, "averagesalesqty7");
            return (Criteria) this;
        }

        public Criteria andAveragesalesqty15IsNull() {
            addCriterion("averageSalesQty15 is null");
            return (Criteria) this;
        }

        public Criteria andAveragesalesqty15IsNotNull() {
            addCriterion("averageSalesQty15 is not null");
            return (Criteria) this;
        }

        public Criteria andAveragesalesqty15EqualTo(String value) {
            addCriterion("averageSalesQty15 =", value, "averagesalesqty15");
            return (Criteria) this;
        }

        public Criteria andAveragesalesqty15NotEqualTo(String value) {
            addCriterion("averageSalesQty15 <>", value, "averagesalesqty15");
            return (Criteria) this;
        }

        public Criteria andAveragesalesqty15GreaterThan(String value) {
            addCriterion("averageSalesQty15 >", value, "averagesalesqty15");
            return (Criteria) this;
        }

        public Criteria andAveragesalesqty15GreaterThanOrEqualTo(String value) {
            addCriterion("averageSalesQty15 >=", value, "averagesalesqty15");
            return (Criteria) this;
        }

        public Criteria andAveragesalesqty15LessThan(String value) {
            addCriterion("averageSalesQty15 <", value, "averagesalesqty15");
            return (Criteria) this;
        }

        public Criteria andAveragesalesqty15LessThanOrEqualTo(String value) {
            addCriterion("averageSalesQty15 <=", value, "averagesalesqty15");
            return (Criteria) this;
        }

        public Criteria andAveragesalesqty15Like(String value) {
            addCriterion("averageSalesQty15 like", value, "averagesalesqty15");
            return (Criteria) this;
        }

        public Criteria andAveragesalesqty15NotLike(String value) {
            addCriterion("averageSalesQty15 not like", value, "averagesalesqty15");
            return (Criteria) this;
        }

        public Criteria andAveragesalesqty15In(List<String> values) {
            addCriterion("averageSalesQty15 in", values, "averagesalesqty15");
            return (Criteria) this;
        }

        public Criteria andAveragesalesqty15NotIn(List<String> values) {
            addCriterion("averageSalesQty15 not in", values, "averagesalesqty15");
            return (Criteria) this;
        }

        public Criteria andAveragesalesqty15Between(String value1, String value2) {
            addCriterion("averageSalesQty15 between", value1, value2, "averagesalesqty15");
            return (Criteria) this;
        }

        public Criteria andAveragesalesqty15NotBetween(String value1, String value2) {
            addCriterion("averageSalesQty15 not between", value1, value2, "averagesalesqty15");
            return (Criteria) this;
        }

        public Criteria andAveragesalesqtyIsNull() {
            addCriterion("averageSalesQty is null");
            return (Criteria) this;
        }

        public Criteria andAveragesalesqtyIsNotNull() {
            addCriterion("averageSalesQty is not null");
            return (Criteria) this;
        }

        public Criteria andAveragesalesqtyEqualTo(String value) {
            addCriterion("averageSalesQty =", value, "averagesalesqty");
            return (Criteria) this;
        }

        public Criteria andAveragesalesqtyNotEqualTo(String value) {
            addCriterion("averageSalesQty <>", value, "averagesalesqty");
            return (Criteria) this;
        }

        public Criteria andAveragesalesqtyGreaterThan(String value) {
            addCriterion("averageSalesQty >", value, "averagesalesqty");
            return (Criteria) this;
        }

        public Criteria andAveragesalesqtyGreaterThanOrEqualTo(String value) {
            addCriterion("averageSalesQty >=", value, "averagesalesqty");
            return (Criteria) this;
        }

        public Criteria andAveragesalesqtyLessThan(String value) {
            addCriterion("averageSalesQty <", value, "averagesalesqty");
            return (Criteria) this;
        }

        public Criteria andAveragesalesqtyLessThanOrEqualTo(String value) {
            addCriterion("averageSalesQty <=", value, "averagesalesqty");
            return (Criteria) this;
        }

        public Criteria andAveragesalesqtyLike(String value) {
            addCriterion("averageSalesQty like", value, "averagesalesqty");
            return (Criteria) this;
        }

        public Criteria andAveragesalesqtyNotLike(String value) {
            addCriterion("averageSalesQty not like", value, "averagesalesqty");
            return (Criteria) this;
        }

        public Criteria andAveragesalesqtyIn(List<String> values) {
            addCriterion("averageSalesQty in", values, "averagesalesqty");
            return (Criteria) this;
        }

        public Criteria andAveragesalesqtyNotIn(List<String> values) {
            addCriterion("averageSalesQty not in", values, "averagesalesqty");
            return (Criteria) this;
        }

        public Criteria andAveragesalesqtyBetween(String value1, String value2) {
            addCriterion("averageSalesQty between", value1, value2, "averagesalesqty");
            return (Criteria) this;
        }

        public Criteria andAveragesalesqtyNotBetween(String value1, String value2) {
            addCriterion("averageSalesQty not between", value1, value2, "averagesalesqty");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updatetime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updatetime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updatetime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updatetime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updatetime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updatetime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updatetime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updatetime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updatetime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updatetime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updatetime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
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