package com.heeexy.example.model;

import java.util.ArrayList;
import java.util.List;

public class ProductWarehouseStorageBackInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductWarehouseStorageBackInfoExample() {
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

        public Criteria andPurchasestrIsNull() {
            addCriterion("purchaseStr is null");
            return (Criteria) this;
        }

        public Criteria andPurchasestrIsNotNull() {
            addCriterion("purchaseStr is not null");
            return (Criteria) this;
        }

        public Criteria andPurchasestrEqualTo(String value) {
            addCriterion("purchaseStr =", value, "purchasestr");
            return (Criteria) this;
        }

        public Criteria andPurchasestrNotEqualTo(String value) {
            addCriterion("purchaseStr <>", value, "purchasestr");
            return (Criteria) this;
        }

        public Criteria andPurchasestrGreaterThan(String value) {
            addCriterion("purchaseStr >", value, "purchasestr");
            return (Criteria) this;
        }

        public Criteria andPurchasestrGreaterThanOrEqualTo(String value) {
            addCriterion("purchaseStr >=", value, "purchasestr");
            return (Criteria) this;
        }

        public Criteria andPurchasestrLessThan(String value) {
            addCriterion("purchaseStr <", value, "purchasestr");
            return (Criteria) this;
        }

        public Criteria andPurchasestrLessThanOrEqualTo(String value) {
            addCriterion("purchaseStr <=", value, "purchasestr");
            return (Criteria) this;
        }

        public Criteria andPurchasestrLike(String value) {
            addCriterion("purchaseStr like", value, "purchasestr");
            return (Criteria) this;
        }

        public Criteria andPurchasestrNotLike(String value) {
            addCriterion("purchaseStr not like", value, "purchasestr");
            return (Criteria) this;
        }

        public Criteria andPurchasestrIn(List<String> values) {
            addCriterion("purchaseStr in", values, "purchasestr");
            return (Criteria) this;
        }

        public Criteria andPurchasestrNotIn(List<String> values) {
            addCriterion("purchaseStr not in", values, "purchasestr");
            return (Criteria) this;
        }

        public Criteria andPurchasestrBetween(String value1, String value2) {
            addCriterion("purchaseStr between", value1, value2, "purchasestr");
            return (Criteria) this;
        }

        public Criteria andPurchasestrNotBetween(String value1, String value2) {
            addCriterion("purchaseStr not between", value1, value2, "purchasestr");
            return (Criteria) this;
        }

        public Criteria andCnwarehousestrIsNull() {
            addCriterion("cnWarehouseStr is null");
            return (Criteria) this;
        }

        public Criteria andCnwarehousestrIsNotNull() {
            addCriterion("cnWarehouseStr is not null");
            return (Criteria) this;
        }

        public Criteria andCnwarehousestrEqualTo(String value) {
            addCriterion("cnWarehouseStr =", value, "cnwarehousestr");
            return (Criteria) this;
        }

        public Criteria andCnwarehousestrNotEqualTo(String value) {
            addCriterion("cnWarehouseStr <>", value, "cnwarehousestr");
            return (Criteria) this;
        }

        public Criteria andCnwarehousestrGreaterThan(String value) {
            addCriterion("cnWarehouseStr >", value, "cnwarehousestr");
            return (Criteria) this;
        }

        public Criteria andCnwarehousestrGreaterThanOrEqualTo(String value) {
            addCriterion("cnWarehouseStr >=", value, "cnwarehousestr");
            return (Criteria) this;
        }

        public Criteria andCnwarehousestrLessThan(String value) {
            addCriterion("cnWarehouseStr <", value, "cnwarehousestr");
            return (Criteria) this;
        }

        public Criteria andCnwarehousestrLessThanOrEqualTo(String value) {
            addCriterion("cnWarehouseStr <=", value, "cnwarehousestr");
            return (Criteria) this;
        }

        public Criteria andCnwarehousestrLike(String value) {
            addCriterion("cnWarehouseStr like", value, "cnwarehousestr");
            return (Criteria) this;
        }

        public Criteria andCnwarehousestrNotLike(String value) {
            addCriterion("cnWarehouseStr not like", value, "cnwarehousestr");
            return (Criteria) this;
        }

        public Criteria andCnwarehousestrIn(List<String> values) {
            addCriterion("cnWarehouseStr in", values, "cnwarehousestr");
            return (Criteria) this;
        }

        public Criteria andCnwarehousestrNotIn(List<String> values) {
            addCriterion("cnWarehouseStr not in", values, "cnwarehousestr");
            return (Criteria) this;
        }

        public Criteria andCnwarehousestrBetween(String value1, String value2) {
            addCriterion("cnWarehouseStr between", value1, value2, "cnwarehousestr");
            return (Criteria) this;
        }

        public Criteria andCnwarehousestrNotBetween(String value1, String value2) {
            addCriterion("cnWarehouseStr not between", value1, value2, "cnwarehousestr");
            return (Criteria) this;
        }

        public Criteria andOnwaystrIsNull() {
            addCriterion("onWayStr is null");
            return (Criteria) this;
        }

        public Criteria andOnwaystrIsNotNull() {
            addCriterion("onWayStr is not null");
            return (Criteria) this;
        }

        public Criteria andOnwaystrEqualTo(String value) {
            addCriterion("onWayStr =", value, "onwaystr");
            return (Criteria) this;
        }

        public Criteria andOnwaystrNotEqualTo(String value) {
            addCriterion("onWayStr <>", value, "onwaystr");
            return (Criteria) this;
        }

        public Criteria andOnwaystrGreaterThan(String value) {
            addCriterion("onWayStr >", value, "onwaystr");
            return (Criteria) this;
        }

        public Criteria andOnwaystrGreaterThanOrEqualTo(String value) {
            addCriterion("onWayStr >=", value, "onwaystr");
            return (Criteria) this;
        }

        public Criteria andOnwaystrLessThan(String value) {
            addCriterion("onWayStr <", value, "onwaystr");
            return (Criteria) this;
        }

        public Criteria andOnwaystrLessThanOrEqualTo(String value) {
            addCriterion("onWayStr <=", value, "onwaystr");
            return (Criteria) this;
        }

        public Criteria andOnwaystrLike(String value) {
            addCriterion("onWayStr like", value, "onwaystr");
            return (Criteria) this;
        }

        public Criteria andOnwaystrNotLike(String value) {
            addCriterion("onWayStr not like", value, "onwaystr");
            return (Criteria) this;
        }

        public Criteria andOnwaystrIn(List<String> values) {
            addCriterion("onWayStr in", values, "onwaystr");
            return (Criteria) this;
        }

        public Criteria andOnwaystrNotIn(List<String> values) {
            addCriterion("onWayStr not in", values, "onwaystr");
            return (Criteria) this;
        }

        public Criteria andOnwaystrBetween(String value1, String value2) {
            addCriterion("onWayStr between", value1, value2, "onwaystr");
            return (Criteria) this;
        }

        public Criteria andOnwaystrNotBetween(String value1, String value2) {
            addCriterion("onWayStr not between", value1, value2, "onwaystr");
            return (Criteria) this;
        }

        public Criteria andOnwarehousestrIsNull() {
            addCriterion("onWarehouseStr is null");
            return (Criteria) this;
        }

        public Criteria andOnwarehousestrIsNotNull() {
            addCriterion("onWarehouseStr is not null");
            return (Criteria) this;
        }

        public Criteria andOnwarehousestrEqualTo(String value) {
            addCriterion("onWarehouseStr =", value, "onwarehousestr");
            return (Criteria) this;
        }

        public Criteria andOnwarehousestrNotEqualTo(String value) {
            addCriterion("onWarehouseStr <>", value, "onwarehousestr");
            return (Criteria) this;
        }

        public Criteria andOnwarehousestrGreaterThan(String value) {
            addCriterion("onWarehouseStr >", value, "onwarehousestr");
            return (Criteria) this;
        }

        public Criteria andOnwarehousestrGreaterThanOrEqualTo(String value) {
            addCriterion("onWarehouseStr >=", value, "onwarehousestr");
            return (Criteria) this;
        }

        public Criteria andOnwarehousestrLessThan(String value) {
            addCriterion("onWarehouseStr <", value, "onwarehousestr");
            return (Criteria) this;
        }

        public Criteria andOnwarehousestrLessThanOrEqualTo(String value) {
            addCriterion("onWarehouseStr <=", value, "onwarehousestr");
            return (Criteria) this;
        }

        public Criteria andOnwarehousestrLike(String value) {
            addCriterion("onWarehouseStr like", value, "onwarehousestr");
            return (Criteria) this;
        }

        public Criteria andOnwarehousestrNotLike(String value) {
            addCriterion("onWarehouseStr not like", value, "onwarehousestr");
            return (Criteria) this;
        }

        public Criteria andOnwarehousestrIn(List<String> values) {
            addCriterion("onWarehouseStr in", values, "onwarehousestr");
            return (Criteria) this;
        }

        public Criteria andOnwarehousestrNotIn(List<String> values) {
            addCriterion("onWarehouseStr not in", values, "onwarehousestr");
            return (Criteria) this;
        }

        public Criteria andOnwarehousestrBetween(String value1, String value2) {
            addCriterion("onWarehouseStr between", value1, value2, "onwarehousestr");
            return (Criteria) this;
        }

        public Criteria andOnwarehousestrNotBetween(String value1, String value2) {
            addCriterion("onWarehouseStr not between", value1, value2, "onwarehousestr");
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