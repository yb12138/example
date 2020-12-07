package com.heeexy.example.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductHolidayExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductHolidayExample() {
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

        public Criteria andStartdayIsNull() {
            addCriterion("startDay is null");
            return (Criteria) this;
        }

        public Criteria andStartdayIsNotNull() {
            addCriterion("startDay is not null");
            return (Criteria) this;
        }

        public Criteria andStartdayEqualTo(Date value) {
            addCriterion("startDay =", value, "startday");
            return (Criteria) this;
        }

        public Criteria andStartdayNotEqualTo(Date value) {
            addCriterion("startDay <>", value, "startday");
            return (Criteria) this;
        }

        public Criteria andStartdayGreaterThan(Date value) {
            addCriterion("startDay >", value, "startday");
            return (Criteria) this;
        }

        public Criteria andStartdayGreaterThanOrEqualTo(Date value) {
            addCriterion("startDay >=", value, "startday");
            return (Criteria) this;
        }

        public Criteria andStartdayLessThan(Date value) {
            addCriterion("startDay <", value, "startday");
            return (Criteria) this;
        }

        public Criteria andStartdayLessThanOrEqualTo(Date value) {
            addCriterion("startDay <=", value, "startday");
            return (Criteria) this;
        }

        public Criteria andStartdayIn(List<Date> values) {
            addCriterion("startDay in", values, "startday");
            return (Criteria) this;
        }

        public Criteria andStartdayNotIn(List<Date> values) {
            addCriterion("startDay not in", values, "startday");
            return (Criteria) this;
        }

        public Criteria andStartdayBetween(Date value1, Date value2) {
            addCriterion("startDay between", value1, value2, "startday");
            return (Criteria) this;
        }

        public Criteria andStartdayNotBetween(Date value1, Date value2) {
            addCriterion("startDay not between", value1, value2, "startday");
            return (Criteria) this;
        }

        public Criteria andEnddayIsNull() {
            addCriterion("endDay is null");
            return (Criteria) this;
        }

        public Criteria andEnddayIsNotNull() {
            addCriterion("endDay is not null");
            return (Criteria) this;
        }

        public Criteria andEnddayEqualTo(Date value) {
            addCriterion("endDay =", value, "endday");
            return (Criteria) this;
        }

        public Criteria andEnddayNotEqualTo(Date value) {
            addCriterion("endDay <>", value, "endday");
            return (Criteria) this;
        }

        public Criteria andEnddayGreaterThan(Date value) {
            addCriterion("endDay >", value, "endday");
            return (Criteria) this;
        }

        public Criteria andEnddayGreaterThanOrEqualTo(Date value) {
            addCriterion("endDay >=", value, "endday");
            return (Criteria) this;
        }

        public Criteria andEnddayLessThan(Date value) {
            addCriterion("endDay <", value, "endday");
            return (Criteria) this;
        }

        public Criteria andEnddayLessThanOrEqualTo(Date value) {
            addCriterion("endDay <=", value, "endday");
            return (Criteria) this;
        }

        public Criteria andEnddayIn(List<Date> values) {
            addCriterion("endDay in", values, "endday");
            return (Criteria) this;
        }

        public Criteria andEnddayNotIn(List<Date> values) {
            addCriterion("endDay not in", values, "endday");
            return (Criteria) this;
        }

        public Criteria andEnddayBetween(Date value1, Date value2) {
            addCriterion("endDay between", value1, value2, "endday");
            return (Criteria) this;
        }

        public Criteria andEnddayNotBetween(Date value1, Date value2) {
            addCriterion("endDay not between", value1, value2, "endday");
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