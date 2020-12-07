package com.heeexy.example.model;

import java.util.ArrayList;
import java.util.List;

public class ProductWarehouseStorageBackExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductWarehouseStorageBackExample() {
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

        public Criteria andBackidIsNull() {
            addCriterion("backID is null");
            return (Criteria) this;
        }

        public Criteria andBackidIsNotNull() {
            addCriterion("backID is not null");
            return (Criteria) this;
        }

        public Criteria andBackidEqualTo(Integer value) {
            addCriterion("backID =", value, "backid");
            return (Criteria) this;
        }

        public Criteria andBackidNotEqualTo(Integer value) {
            addCriterion("backID <>", value, "backid");
            return (Criteria) this;
        }

        public Criteria andBackidGreaterThan(Integer value) {
            addCriterion("backID >", value, "backid");
            return (Criteria) this;
        }

        public Criteria andBackidGreaterThanOrEqualTo(Integer value) {
            addCriterion("backID >=", value, "backid");
            return (Criteria) this;
        }

        public Criteria andBackidLessThan(Integer value) {
            addCriterion("backID <", value, "backid");
            return (Criteria) this;
        }

        public Criteria andBackidLessThanOrEqualTo(Integer value) {
            addCriterion("backID <=", value, "backid");
            return (Criteria) this;
        }

        public Criteria andBackidIn(List<Integer> values) {
            addCriterion("backID in", values, "backid");
            return (Criteria) this;
        }

        public Criteria andBackidNotIn(List<Integer> values) {
            addCriterion("backID not in", values, "backid");
            return (Criteria) this;
        }

        public Criteria andBackidBetween(Integer value1, Integer value2) {
            addCriterion("backID between", value1, value2, "backid");
            return (Criteria) this;
        }

        public Criteria andBackidNotBetween(Integer value1, Integer value2) {
            addCriterion("backID not between", value1, value2, "backid");
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

        public Criteria andWarehousenameIsNull() {
            addCriterion("warehouseName is null");
            return (Criteria) this;
        }

        public Criteria andWarehousenameIsNotNull() {
            addCriterion("warehouseName is not null");
            return (Criteria) this;
        }

        public Criteria andWarehousenameEqualTo(String value) {
            addCriterion("warehouseName =", value, "warehousename");
            return (Criteria) this;
        }

        public Criteria andWarehousenameNotEqualTo(String value) {
            addCriterion("warehouseName <>", value, "warehousename");
            return (Criteria) this;
        }

        public Criteria andWarehousenameGreaterThan(String value) {
            addCriterion("warehouseName >", value, "warehousename");
            return (Criteria) this;
        }

        public Criteria andWarehousenameGreaterThanOrEqualTo(String value) {
            addCriterion("warehouseName >=", value, "warehousename");
            return (Criteria) this;
        }

        public Criteria andWarehousenameLessThan(String value) {
            addCriterion("warehouseName <", value, "warehousename");
            return (Criteria) this;
        }

        public Criteria andWarehousenameLessThanOrEqualTo(String value) {
            addCriterion("warehouseName <=", value, "warehousename");
            return (Criteria) this;
        }

        public Criteria andWarehousenameLike(String value) {
            addCriterion("warehouseName like", value, "warehousename");
            return (Criteria) this;
        }

        public Criteria andWarehousenameNotLike(String value) {
            addCriterion("warehouseName not like", value, "warehousename");
            return (Criteria) this;
        }

        public Criteria andWarehousenameIn(List<String> values) {
            addCriterion("warehouseName in", values, "warehousename");
            return (Criteria) this;
        }

        public Criteria andWarehousenameNotIn(List<String> values) {
            addCriterion("warehouseName not in", values, "warehousename");
            return (Criteria) this;
        }

        public Criteria andWarehousenameBetween(String value1, String value2) {
            addCriterion("warehouseName between", value1, value2, "warehousename");
            return (Criteria) this;
        }

        public Criteria andWarehousenameNotBetween(String value1, String value2) {
            addCriterion("warehouseName not between", value1, value2, "warehousename");
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

        public Criteria andOnsellIsNull() {
            addCriterion("onSell is null");
            return (Criteria) this;
        }

        public Criteria andOnsellIsNotNull() {
            addCriterion("onSell is not null");
            return (Criteria) this;
        }

        public Criteria andOnsellEqualTo(Integer value) {
            addCriterion("onSell =", value, "onsell");
            return (Criteria) this;
        }

        public Criteria andOnsellNotEqualTo(Integer value) {
            addCriterion("onSell <>", value, "onsell");
            return (Criteria) this;
        }

        public Criteria andOnsellGreaterThan(Integer value) {
            addCriterion("onSell >", value, "onsell");
            return (Criteria) this;
        }

        public Criteria andOnsellGreaterThanOrEqualTo(Integer value) {
            addCriterion("onSell >=", value, "onsell");
            return (Criteria) this;
        }

        public Criteria andOnsellLessThan(Integer value) {
            addCriterion("onSell <", value, "onsell");
            return (Criteria) this;
        }

        public Criteria andOnsellLessThanOrEqualTo(Integer value) {
            addCriterion("onSell <=", value, "onsell");
            return (Criteria) this;
        }

        public Criteria andOnsellIn(List<Integer> values) {
            addCriterion("onSell in", values, "onsell");
            return (Criteria) this;
        }

        public Criteria andOnsellNotIn(List<Integer> values) {
            addCriterion("onSell not in", values, "onsell");
            return (Criteria) this;
        }

        public Criteria andOnsellBetween(Integer value1, Integer value2) {
            addCriterion("onSell between", value1, value2, "onsell");
            return (Criteria) this;
        }

        public Criteria andOnsellNotBetween(Integer value1, Integer value2) {
            addCriterion("onSell not between", value1, value2, "onsell");
            return (Criteria) this;
        }

        public Criteria andOnpurchaseIsNull() {
            addCriterion("onPurchase is null");
            return (Criteria) this;
        }

        public Criteria andOnpurchaseIsNotNull() {
            addCriterion("onPurchase is not null");
            return (Criteria) this;
        }

        public Criteria andOnpurchaseEqualTo(Integer value) {
            addCriterion("onPurchase =", value, "onpurchase");
            return (Criteria) this;
        }

        public Criteria andOnpurchaseNotEqualTo(Integer value) {
            addCriterion("onPurchase <>", value, "onpurchase");
            return (Criteria) this;
        }

        public Criteria andOnpurchaseGreaterThan(Integer value) {
            addCriterion("onPurchase >", value, "onpurchase");
            return (Criteria) this;
        }

        public Criteria andOnpurchaseGreaterThanOrEqualTo(Integer value) {
            addCriterion("onPurchase >=", value, "onpurchase");
            return (Criteria) this;
        }

        public Criteria andOnpurchaseLessThan(Integer value) {
            addCriterion("onPurchase <", value, "onpurchase");
            return (Criteria) this;
        }

        public Criteria andOnpurchaseLessThanOrEqualTo(Integer value) {
            addCriterion("onPurchase <=", value, "onpurchase");
            return (Criteria) this;
        }

        public Criteria andOnpurchaseIn(List<Integer> values) {
            addCriterion("onPurchase in", values, "onpurchase");
            return (Criteria) this;
        }

        public Criteria andOnpurchaseNotIn(List<Integer> values) {
            addCriterion("onPurchase not in", values, "onpurchase");
            return (Criteria) this;
        }

        public Criteria andOnpurchaseBetween(Integer value1, Integer value2) {
            addCriterion("onPurchase between", value1, value2, "onpurchase");
            return (Criteria) this;
        }

        public Criteria andOnpurchaseNotBetween(Integer value1, Integer value2) {
            addCriterion("onPurchase not between", value1, value2, "onpurchase");
            return (Criteria) this;
        }

        public Criteria andOncnwarehouseIsNull() {
            addCriterion("onCnWarehouse is null");
            return (Criteria) this;
        }

        public Criteria andOncnwarehouseIsNotNull() {
            addCriterion("onCnWarehouse is not null");
            return (Criteria) this;
        }

        public Criteria andOncnwarehouseEqualTo(Integer value) {
            addCriterion("onCnWarehouse =", value, "oncnwarehouse");
            return (Criteria) this;
        }

        public Criteria andOncnwarehouseNotEqualTo(Integer value) {
            addCriterion("onCnWarehouse <>", value, "oncnwarehouse");
            return (Criteria) this;
        }

        public Criteria andOncnwarehouseGreaterThan(Integer value) {
            addCriterion("onCnWarehouse >", value, "oncnwarehouse");
            return (Criteria) this;
        }

        public Criteria andOncnwarehouseGreaterThanOrEqualTo(Integer value) {
            addCriterion("onCnWarehouse >=", value, "oncnwarehouse");
            return (Criteria) this;
        }

        public Criteria andOncnwarehouseLessThan(Integer value) {
            addCriterion("onCnWarehouse <", value, "oncnwarehouse");
            return (Criteria) this;
        }

        public Criteria andOncnwarehouseLessThanOrEqualTo(Integer value) {
            addCriterion("onCnWarehouse <=", value, "oncnwarehouse");
            return (Criteria) this;
        }

        public Criteria andOncnwarehouseIn(List<Integer> values) {
            addCriterion("onCnWarehouse in", values, "oncnwarehouse");
            return (Criteria) this;
        }

        public Criteria andOncnwarehouseNotIn(List<Integer> values) {
            addCriterion("onCnWarehouse not in", values, "oncnwarehouse");
            return (Criteria) this;
        }

        public Criteria andOncnwarehouseBetween(Integer value1, Integer value2) {
            addCriterion("onCnWarehouse between", value1, value2, "oncnwarehouse");
            return (Criteria) this;
        }

        public Criteria andOncnwarehouseNotBetween(Integer value1, Integer value2) {
            addCriterion("onCnWarehouse not between", value1, value2, "oncnwarehouse");
            return (Criteria) this;
        }

        public Criteria andOnwayIsNull() {
            addCriterion("onWay is null");
            return (Criteria) this;
        }

        public Criteria andOnwayIsNotNull() {
            addCriterion("onWay is not null");
            return (Criteria) this;
        }

        public Criteria andOnwayEqualTo(Integer value) {
            addCriterion("onWay =", value, "onway");
            return (Criteria) this;
        }

        public Criteria andOnwayNotEqualTo(Integer value) {
            addCriterion("onWay <>", value, "onway");
            return (Criteria) this;
        }

        public Criteria andOnwayGreaterThan(Integer value) {
            addCriterion("onWay >", value, "onway");
            return (Criteria) this;
        }

        public Criteria andOnwayGreaterThanOrEqualTo(Integer value) {
            addCriterion("onWay >=", value, "onway");
            return (Criteria) this;
        }

        public Criteria andOnwayLessThan(Integer value) {
            addCriterion("onWay <", value, "onway");
            return (Criteria) this;
        }

        public Criteria andOnwayLessThanOrEqualTo(Integer value) {
            addCriterion("onWay <=", value, "onway");
            return (Criteria) this;
        }

        public Criteria andOnwayIn(List<Integer> values) {
            addCriterion("onWay in", values, "onway");
            return (Criteria) this;
        }

        public Criteria andOnwayNotIn(List<Integer> values) {
            addCriterion("onWay not in", values, "onway");
            return (Criteria) this;
        }

        public Criteria andOnwayBetween(Integer value1, Integer value2) {
            addCriterion("onWay between", value1, value2, "onway");
            return (Criteria) this;
        }

        public Criteria andOnwayNotBetween(Integer value1, Integer value2) {
            addCriterion("onWay not between", value1, value2, "onway");
            return (Criteria) this;
        }

        public Criteria andMonthIsNull() {
            addCriterion("month is null");
            return (Criteria) this;
        }

        public Criteria andMonthIsNotNull() {
            addCriterion("month is not null");
            return (Criteria) this;
        }

        public Criteria andMonthEqualTo(Integer value) {
            addCriterion("month =", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotEqualTo(Integer value) {
            addCriterion("month <>", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthGreaterThan(Integer value) {
            addCriterion("month >", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthGreaterThanOrEqualTo(Integer value) {
            addCriterion("month >=", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLessThan(Integer value) {
            addCriterion("month <", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLessThanOrEqualTo(Integer value) {
            addCriterion("month <=", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthIn(List<Integer> values) {
            addCriterion("month in", values, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotIn(List<Integer> values) {
            addCriterion("month not in", values, "month");
            return (Criteria) this;
        }

        public Criteria andMonthBetween(Integer value1, Integer value2) {
            addCriterion("month between", value1, value2, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotBetween(Integer value1, Integer value2) {
            addCriterion("month not between", value1, value2, "month");
            return (Criteria) this;
        }

        public Criteria andDayIsNull() {
            addCriterion("day is null");
            return (Criteria) this;
        }

        public Criteria andDayIsNotNull() {
            addCriterion("day is not null");
            return (Criteria) this;
        }

        public Criteria andDayEqualTo(Integer value) {
            addCriterion("day =", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayNotEqualTo(Integer value) {
            addCriterion("day <>", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayGreaterThan(Integer value) {
            addCriterion("day >", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("day >=", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayLessThan(Integer value) {
            addCriterion("day <", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayLessThanOrEqualTo(Integer value) {
            addCriterion("day <=", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayIn(List<Integer> values) {
            addCriterion("day in", values, "day");
            return (Criteria) this;
        }

        public Criteria andDayNotIn(List<Integer> values) {
            addCriterion("day not in", values, "day");
            return (Criteria) this;
        }

        public Criteria andDayBetween(Integer value1, Integer value2) {
            addCriterion("day between", value1, value2, "day");
            return (Criteria) this;
        }

        public Criteria andDayNotBetween(Integer value1, Integer value2) {
            addCriterion("day not between", value1, value2, "day");
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