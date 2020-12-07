package com.heeexy.example.model;

import java.util.ArrayList;
import java.util.List;

public class WarehouseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WarehouseExample() {
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

        public Criteria andWarehouseidIsNull() {
            addCriterion("WarehouseID is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseidIsNotNull() {
            addCriterion("WarehouseID is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseidEqualTo(Long value) {
            addCriterion("WarehouseID =", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidNotEqualTo(Long value) {
            addCriterion("WarehouseID <>", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidGreaterThan(Long value) {
            addCriterion("WarehouseID >", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidGreaterThanOrEqualTo(Long value) {
            addCriterion("WarehouseID >=", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidLessThan(Long value) {
            addCriterion("WarehouseID <", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidLessThanOrEqualTo(Long value) {
            addCriterion("WarehouseID <=", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidIn(List<Long> values) {
            addCriterion("WarehouseID in", values, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidNotIn(List<Long> values) {
            addCriterion("WarehouseID not in", values, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidBetween(Long value1, Long value2) {
            addCriterion("WarehouseID between", value1, value2, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidNotBetween(Long value1, Long value2) {
            addCriterion("WarehouseID not between", value1, value2, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehousecodeIsNull() {
            addCriterion("WarehouseCode is null");
            return (Criteria) this;
        }

        public Criteria andWarehousecodeIsNotNull() {
            addCriterion("WarehouseCode is not null");
            return (Criteria) this;
        }

        public Criteria andWarehousecodeEqualTo(String value) {
            addCriterion("WarehouseCode =", value, "warehousecode");
            return (Criteria) this;
        }

        public Criteria andWarehousecodeNotEqualTo(String value) {
            addCriterion("WarehouseCode <>", value, "warehousecode");
            return (Criteria) this;
        }

        public Criteria andWarehousecodeGreaterThan(String value) {
            addCriterion("WarehouseCode >", value, "warehousecode");
            return (Criteria) this;
        }

        public Criteria andWarehousecodeGreaterThanOrEqualTo(String value) {
            addCriterion("WarehouseCode >=", value, "warehousecode");
            return (Criteria) this;
        }

        public Criteria andWarehousecodeLessThan(String value) {
            addCriterion("WarehouseCode <", value, "warehousecode");
            return (Criteria) this;
        }

        public Criteria andWarehousecodeLessThanOrEqualTo(String value) {
            addCriterion("WarehouseCode <=", value, "warehousecode");
            return (Criteria) this;
        }

        public Criteria andWarehousecodeLike(String value) {
            addCriterion("WarehouseCode like", value, "warehousecode");
            return (Criteria) this;
        }

        public Criteria andWarehousecodeNotLike(String value) {
            addCriterion("WarehouseCode not like", value, "warehousecode");
            return (Criteria) this;
        }

        public Criteria andWarehousecodeIn(List<String> values) {
            addCriterion("WarehouseCode in", values, "warehousecode");
            return (Criteria) this;
        }

        public Criteria andWarehousecodeNotIn(List<String> values) {
            addCriterion("WarehouseCode not in", values, "warehousecode");
            return (Criteria) this;
        }

        public Criteria andWarehousecodeBetween(String value1, String value2) {
            addCriterion("WarehouseCode between", value1, value2, "warehousecode");
            return (Criteria) this;
        }

        public Criteria andWarehousecodeNotBetween(String value1, String value2) {
            addCriterion("WarehouseCode not between", value1, value2, "warehousecode");
            return (Criteria) this;
        }

        public Criteria andWarehousenameIsNull() {
            addCriterion("WarehouseName is null");
            return (Criteria) this;
        }

        public Criteria andWarehousenameIsNotNull() {
            addCriterion("WarehouseName is not null");
            return (Criteria) this;
        }

        public Criteria andWarehousenameEqualTo(String value) {
            addCriterion("WarehouseName =", value, "warehousename");
            return (Criteria) this;
        }

        public Criteria andWarehousenameNotEqualTo(String value) {
            addCriterion("WarehouseName <>", value, "warehousename");
            return (Criteria) this;
        }

        public Criteria andWarehousenameGreaterThan(String value) {
            addCriterion("WarehouseName >", value, "warehousename");
            return (Criteria) this;
        }

        public Criteria andWarehousenameGreaterThanOrEqualTo(String value) {
            addCriterion("WarehouseName >=", value, "warehousename");
            return (Criteria) this;
        }

        public Criteria andWarehousenameLessThan(String value) {
            addCriterion("WarehouseName <", value, "warehousename");
            return (Criteria) this;
        }

        public Criteria andWarehousenameLessThanOrEqualTo(String value) {
            addCriterion("WarehouseName <=", value, "warehousename");
            return (Criteria) this;
        }

        public Criteria andWarehousenameLike(String value) {
            addCriterion("WarehouseName like", value, "warehousename");
            return (Criteria) this;
        }

        public Criteria andWarehousenameNotLike(String value) {
            addCriterion("WarehouseName not like", value, "warehousename");
            return (Criteria) this;
        }

        public Criteria andWarehousenameIn(List<String> values) {
            addCriterion("WarehouseName in", values, "warehousename");
            return (Criteria) this;
        }

        public Criteria andWarehousenameNotIn(List<String> values) {
            addCriterion("WarehouseName not in", values, "warehousename");
            return (Criteria) this;
        }

        public Criteria andWarehousenameBetween(String value1, String value2) {
            addCriterion("WarehouseName between", value1, value2, "warehousename");
            return (Criteria) this;
        }

        public Criteria andWarehousenameNotBetween(String value1, String value2) {
            addCriterion("WarehouseName not between", value1, value2, "warehousename");
            return (Criteria) this;
        }

        public Criteria andWarehousetypeIsNull() {
            addCriterion("WarehouseType is null");
            return (Criteria) this;
        }

        public Criteria andWarehousetypeIsNotNull() {
            addCriterion("WarehouseType is not null");
            return (Criteria) this;
        }

        public Criteria andWarehousetypeEqualTo(Integer value) {
            addCriterion("WarehouseType =", value, "warehousetype");
            return (Criteria) this;
        }

        public Criteria andWarehousetypeNotEqualTo(Integer value) {
            addCriterion("WarehouseType <>", value, "warehousetype");
            return (Criteria) this;
        }

        public Criteria andWarehousetypeGreaterThan(Integer value) {
            addCriterion("WarehouseType >", value, "warehousetype");
            return (Criteria) this;
        }

        public Criteria andWarehousetypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("WarehouseType >=", value, "warehousetype");
            return (Criteria) this;
        }

        public Criteria andWarehousetypeLessThan(Integer value) {
            addCriterion("WarehouseType <", value, "warehousetype");
            return (Criteria) this;
        }

        public Criteria andWarehousetypeLessThanOrEqualTo(Integer value) {
            addCriterion("WarehouseType <=", value, "warehousetype");
            return (Criteria) this;
        }

        public Criteria andWarehousetypeIn(List<Integer> values) {
            addCriterion("WarehouseType in", values, "warehousetype");
            return (Criteria) this;
        }

        public Criteria andWarehousetypeNotIn(List<Integer> values) {
            addCriterion("WarehouseType not in", values, "warehousetype");
            return (Criteria) this;
        }

        public Criteria andWarehousetypeBetween(Integer value1, Integer value2) {
            addCriterion("WarehouseType between", value1, value2, "warehousetype");
            return (Criteria) this;
        }

        public Criteria andWarehousetypeNotBetween(Integer value1, Integer value2) {
            addCriterion("WarehouseType not between", value1, value2, "warehousetype");
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