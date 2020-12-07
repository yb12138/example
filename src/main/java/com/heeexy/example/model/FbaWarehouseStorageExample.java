package com.heeexy.example.model;

import java.util.ArrayList;
import java.util.List;

public class FbaWarehouseStorageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FbaWarehouseStorageExample() {
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

        public Criteria andAvailablequantityIsNull() {
            addCriterion("availableQuantity is null");
            return (Criteria) this;
        }

        public Criteria andAvailablequantityIsNotNull() {
            addCriterion("availableQuantity is not null");
            return (Criteria) this;
        }

        public Criteria andAvailablequantityEqualTo(Integer value) {
            addCriterion("availableQuantity =", value, "availablequantity");
            return (Criteria) this;
        }

        public Criteria andAvailablequantityNotEqualTo(Integer value) {
            addCriterion("availableQuantity <>", value, "availablequantity");
            return (Criteria) this;
        }

        public Criteria andAvailablequantityGreaterThan(Integer value) {
            addCriterion("availableQuantity >", value, "availablequantity");
            return (Criteria) this;
        }

        public Criteria andAvailablequantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("availableQuantity >=", value, "availablequantity");
            return (Criteria) this;
        }

        public Criteria andAvailablequantityLessThan(Integer value) {
            addCriterion("availableQuantity <", value, "availablequantity");
            return (Criteria) this;
        }

        public Criteria andAvailablequantityLessThanOrEqualTo(Integer value) {
            addCriterion("availableQuantity <=", value, "availablequantity");
            return (Criteria) this;
        }

        public Criteria andAvailablequantityIn(List<Integer> values) {
            addCriterion("availableQuantity in", values, "availablequantity");
            return (Criteria) this;
        }

        public Criteria andAvailablequantityNotIn(List<Integer> values) {
            addCriterion("availableQuantity not in", values, "availablequantity");
            return (Criteria) this;
        }

        public Criteria andAvailablequantityBetween(Integer value1, Integer value2) {
            addCriterion("availableQuantity between", value1, value2, "availablequantity");
            return (Criteria) this;
        }

        public Criteria andAvailablequantityNotBetween(Integer value1, Integer value2) {
            addCriterion("availableQuantity not between", value1, value2, "availablequantity");
            return (Criteria) this;
        }

        public Criteria andTransitquantityIsNull() {
            addCriterion("transitQuantity is null");
            return (Criteria) this;
        }

        public Criteria andTransitquantityIsNotNull() {
            addCriterion("transitQuantity is not null");
            return (Criteria) this;
        }

        public Criteria andTransitquantityEqualTo(Integer value) {
            addCriterion("transitQuantity =", value, "transitquantity");
            return (Criteria) this;
        }

        public Criteria andTransitquantityNotEqualTo(Integer value) {
            addCriterion("transitQuantity <>", value, "transitquantity");
            return (Criteria) this;
        }

        public Criteria andTransitquantityGreaterThan(Integer value) {
            addCriterion("transitQuantity >", value, "transitquantity");
            return (Criteria) this;
        }

        public Criteria andTransitquantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("transitQuantity >=", value, "transitquantity");
            return (Criteria) this;
        }

        public Criteria andTransitquantityLessThan(Integer value) {
            addCriterion("transitQuantity <", value, "transitquantity");
            return (Criteria) this;
        }

        public Criteria andTransitquantityLessThanOrEqualTo(Integer value) {
            addCriterion("transitQuantity <=", value, "transitquantity");
            return (Criteria) this;
        }

        public Criteria andTransitquantityIn(List<Integer> values) {
            addCriterion("transitQuantity in", values, "transitquantity");
            return (Criteria) this;
        }

        public Criteria andTransitquantityNotIn(List<Integer> values) {
            addCriterion("transitQuantity not in", values, "transitquantity");
            return (Criteria) this;
        }

        public Criteria andTransitquantityBetween(Integer value1, Integer value2) {
            addCriterion("transitQuantity between", value1, value2, "transitquantity");
            return (Criteria) this;
        }

        public Criteria andTransitquantityNotBetween(Integer value1, Integer value2) {
            addCriterion("transitQuantity not between", value1, value2, "transitquantity");
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