package com.heeexy.example.model;

import java.util.ArrayList;
import java.util.List;

public class EbayWarehouseoutSkuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EbayWarehouseoutSkuExample() {
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

        public Criteria andPackageskuidIsNull() {
            addCriterion("packageSkuID is null");
            return (Criteria) this;
        }

        public Criteria andPackageskuidIsNotNull() {
            addCriterion("packageSkuID is not null");
            return (Criteria) this;
        }

        public Criteria andPackageskuidEqualTo(Integer value) {
            addCriterion("packageSkuID =", value, "packageskuid");
            return (Criteria) this;
        }

        public Criteria andPackageskuidNotEqualTo(Integer value) {
            addCriterion("packageSkuID <>", value, "packageskuid");
            return (Criteria) this;
        }

        public Criteria andPackageskuidGreaterThan(Integer value) {
            addCriterion("packageSkuID >", value, "packageskuid");
            return (Criteria) this;
        }

        public Criteria andPackageskuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("packageSkuID >=", value, "packageskuid");
            return (Criteria) this;
        }

        public Criteria andPackageskuidLessThan(Integer value) {
            addCriterion("packageSkuID <", value, "packageskuid");
            return (Criteria) this;
        }

        public Criteria andPackageskuidLessThanOrEqualTo(Integer value) {
            addCriterion("packageSkuID <=", value, "packageskuid");
            return (Criteria) this;
        }

        public Criteria andPackageskuidIn(List<Integer> values) {
            addCriterion("packageSkuID in", values, "packageskuid");
            return (Criteria) this;
        }

        public Criteria andPackageskuidNotIn(List<Integer> values) {
            addCriterion("packageSkuID not in", values, "packageskuid");
            return (Criteria) this;
        }

        public Criteria andPackageskuidBetween(Integer value1, Integer value2) {
            addCriterion("packageSkuID between", value1, value2, "packageskuid");
            return (Criteria) this;
        }

        public Criteria andPackageskuidNotBetween(Integer value1, Integer value2) {
            addCriterion("packageSkuID not between", value1, value2, "packageskuid");
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

        public Criteria andQuantityIsNull() {
            addCriterion("quantity is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNotNull() {
            addCriterion("quantity is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityEqualTo(Integer value) {
            addCriterion("quantity =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(Integer value) {
            addCriterion("quantity <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(Integer value) {
            addCriterion("quantity >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("quantity >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(Integer value) {
            addCriterion("quantity <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("quantity <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<Integer> values) {
            addCriterion("quantity in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<Integer> values) {
            addCriterion("quantity not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(Integer value1, Integer value2) {
            addCriterion("quantity between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("quantity not between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andWowsidIsNull() {
            addCriterion("wowsID is null");
            return (Criteria) this;
        }

        public Criteria andWowsidIsNotNull() {
            addCriterion("wowsID is not null");
            return (Criteria) this;
        }

        public Criteria andWowsidEqualTo(Integer value) {
            addCriterion("wowsID =", value, "wowsid");
            return (Criteria) this;
        }

        public Criteria andWowsidNotEqualTo(Integer value) {
            addCriterion("wowsID <>", value, "wowsid");
            return (Criteria) this;
        }

        public Criteria andWowsidGreaterThan(Integer value) {
            addCriterion("wowsID >", value, "wowsid");
            return (Criteria) this;
        }

        public Criteria andWowsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("wowsID >=", value, "wowsid");
            return (Criteria) this;
        }

        public Criteria andWowsidLessThan(Integer value) {
            addCriterion("wowsID <", value, "wowsid");
            return (Criteria) this;
        }

        public Criteria andWowsidLessThanOrEqualTo(Integer value) {
            addCriterion("wowsID <=", value, "wowsid");
            return (Criteria) this;
        }

        public Criteria andWowsidIn(List<Integer> values) {
            addCriterion("wowsID in", values, "wowsid");
            return (Criteria) this;
        }

        public Criteria andWowsidNotIn(List<Integer> values) {
            addCriterion("wowsID not in", values, "wowsid");
            return (Criteria) this;
        }

        public Criteria andWowsidBetween(Integer value1, Integer value2) {
            addCriterion("wowsID between", value1, value2, "wowsid");
            return (Criteria) this;
        }

        public Criteria andWowsidNotBetween(Integer value1, Integer value2) {
            addCriterion("wowsID not between", value1, value2, "wowsid");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Double value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Double value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Double value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Double value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Double value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Double> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Double> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Double value1, Double value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Double value1, Double value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andFareIsNull() {
            addCriterion("fare is null");
            return (Criteria) this;
        }

        public Criteria andFareIsNotNull() {
            addCriterion("fare is not null");
            return (Criteria) this;
        }

        public Criteria andFareEqualTo(Double value) {
            addCriterion("fare =", value, "fare");
            return (Criteria) this;
        }

        public Criteria andFareNotEqualTo(Double value) {
            addCriterion("fare <>", value, "fare");
            return (Criteria) this;
        }

        public Criteria andFareGreaterThan(Double value) {
            addCriterion("fare >", value, "fare");
            return (Criteria) this;
        }

        public Criteria andFareGreaterThanOrEqualTo(Double value) {
            addCriterion("fare >=", value, "fare");
            return (Criteria) this;
        }

        public Criteria andFareLessThan(Double value) {
            addCriterion("fare <", value, "fare");
            return (Criteria) this;
        }

        public Criteria andFareLessThanOrEqualTo(Double value) {
            addCriterion("fare <=", value, "fare");
            return (Criteria) this;
        }

        public Criteria andFareIn(List<Double> values) {
            addCriterion("fare in", values, "fare");
            return (Criteria) this;
        }

        public Criteria andFareNotIn(List<Double> values) {
            addCriterion("fare not in", values, "fare");
            return (Criteria) this;
        }

        public Criteria andFareBetween(Double value1, Double value2) {
            addCriterion("fare between", value1, value2, "fare");
            return (Criteria) this;
        }

        public Criteria andFareNotBetween(Double value1, Double value2) {
            addCriterion("fare not between", value1, value2, "fare");
            return (Criteria) this;
        }

        public Criteria andPackageidIsNull() {
            addCriterion("packageID is null");
            return (Criteria) this;
        }

        public Criteria andPackageidIsNotNull() {
            addCriterion("packageID is not null");
            return (Criteria) this;
        }

        public Criteria andPackageidEqualTo(Long value) {
            addCriterion("packageID =", value, "packageid");
            return (Criteria) this;
        }

        public Criteria andPackageidNotEqualTo(Long value) {
            addCriterion("packageID <>", value, "packageid");
            return (Criteria) this;
        }

        public Criteria andPackageidGreaterThan(Long value) {
            addCriterion("packageID >", value, "packageid");
            return (Criteria) this;
        }

        public Criteria andPackageidGreaterThanOrEqualTo(Long value) {
            addCriterion("packageID >=", value, "packageid");
            return (Criteria) this;
        }

        public Criteria andPackageidLessThan(Long value) {
            addCriterion("packageID <", value, "packageid");
            return (Criteria) this;
        }

        public Criteria andPackageidLessThanOrEqualTo(Long value) {
            addCriterion("packageID <=", value, "packageid");
            return (Criteria) this;
        }

        public Criteria andPackageidIn(List<Long> values) {
            addCriterion("packageID in", values, "packageid");
            return (Criteria) this;
        }

        public Criteria andPackageidNotIn(List<Long> values) {
            addCriterion("packageID not in", values, "packageid");
            return (Criteria) this;
        }

        public Criteria andPackageidBetween(Long value1, Long value2) {
            addCriterion("packageID between", value1, value2, "packageid");
            return (Criteria) this;
        }

        public Criteria andPackageidNotBetween(Long value1, Long value2) {
            addCriterion("packageID not between", value1, value2, "packageid");
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