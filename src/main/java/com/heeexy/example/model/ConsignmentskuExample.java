package com.heeexy.example.model;

import java.util.ArrayList;
import java.util.List;

public class ConsignmentskuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ConsignmentskuExample() {
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

        public Criteria andConskuidIsNull() {
            addCriterion("conskuid is null");
            return (Criteria) this;
        }

        public Criteria andConskuidIsNotNull() {
            addCriterion("conskuid is not null");
            return (Criteria) this;
        }

        public Criteria andConskuidEqualTo(Integer value) {
            addCriterion("conskuid =", value, "conskuid");
            return (Criteria) this;
        }

        public Criteria andConskuidNotEqualTo(Integer value) {
            addCriterion("conskuid <>", value, "conskuid");
            return (Criteria) this;
        }

        public Criteria andConskuidGreaterThan(Integer value) {
            addCriterion("conskuid >", value, "conskuid");
            return (Criteria) this;
        }

        public Criteria andConskuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("conskuid >=", value, "conskuid");
            return (Criteria) this;
        }

        public Criteria andConskuidLessThan(Integer value) {
            addCriterion("conskuid <", value, "conskuid");
            return (Criteria) this;
        }

        public Criteria andConskuidLessThanOrEqualTo(Integer value) {
            addCriterion("conskuid <=", value, "conskuid");
            return (Criteria) this;
        }

        public Criteria andConskuidIn(List<Integer> values) {
            addCriterion("conskuid in", values, "conskuid");
            return (Criteria) this;
        }

        public Criteria andConskuidNotIn(List<Integer> values) {
            addCriterion("conskuid not in", values, "conskuid");
            return (Criteria) this;
        }

        public Criteria andConskuidBetween(Integer value1, Integer value2) {
            addCriterion("conskuid between", value1, value2, "conskuid");
            return (Criteria) this;
        }

        public Criteria andConskuidNotBetween(Integer value1, Integer value2) {
            addCriterion("conskuid not between", value1, value2, "conskuid");
            return (Criteria) this;
        }

        public Criteria andConidIsNull() {
            addCriterion("conid is null");
            return (Criteria) this;
        }

        public Criteria andConidIsNotNull() {
            addCriterion("conid is not null");
            return (Criteria) this;
        }

        public Criteria andConidEqualTo(Long value) {
            addCriterion("conid =", value, "conid");
            return (Criteria) this;
        }

        public Criteria andConidNotEqualTo(Long value) {
            addCriterion("conid <>", value, "conid");
            return (Criteria) this;
        }

        public Criteria andConidGreaterThan(Long value) {
            addCriterion("conid >", value, "conid");
            return (Criteria) this;
        }

        public Criteria andConidGreaterThanOrEqualTo(Long value) {
            addCriterion("conid >=", value, "conid");
            return (Criteria) this;
        }

        public Criteria andConidLessThan(Long value) {
            addCriterion("conid <", value, "conid");
            return (Criteria) this;
        }

        public Criteria andConidLessThanOrEqualTo(Long value) {
            addCriterion("conid <=", value, "conid");
            return (Criteria) this;
        }

        public Criteria andConidIn(List<Long> values) {
            addCriterion("conid in", values, "conid");
            return (Criteria) this;
        }

        public Criteria andConidNotIn(List<Long> values) {
            addCriterion("conid not in", values, "conid");
            return (Criteria) this;
        }

        public Criteria andConidBetween(Long value1, Long value2) {
            addCriterion("conid between", value1, value2, "conid");
            return (Criteria) this;
        }

        public Criteria andConidNotBetween(Long value1, Long value2) {
            addCriterion("conid not between", value1, value2, "conid");
            return (Criteria) this;
        }

        public Criteria andProductClientRefIsNull() {
            addCriterion("product_client_ref is null");
            return (Criteria) this;
        }

        public Criteria andProductClientRefIsNotNull() {
            addCriterion("product_client_ref is not null");
            return (Criteria) this;
        }

        public Criteria andProductClientRefEqualTo(String value) {
            addCriterion("product_client_ref =", value, "productClientRef");
            return (Criteria) this;
        }

        public Criteria andProductClientRefNotEqualTo(String value) {
            addCriterion("product_client_ref <>", value, "productClientRef");
            return (Criteria) this;
        }

        public Criteria andProductClientRefGreaterThan(String value) {
            addCriterion("product_client_ref >", value, "productClientRef");
            return (Criteria) this;
        }

        public Criteria andProductClientRefGreaterThanOrEqualTo(String value) {
            addCriterion("product_client_ref >=", value, "productClientRef");
            return (Criteria) this;
        }

        public Criteria andProductClientRefLessThan(String value) {
            addCriterion("product_client_ref <", value, "productClientRef");
            return (Criteria) this;
        }

        public Criteria andProductClientRefLessThanOrEqualTo(String value) {
            addCriterion("product_client_ref <=", value, "productClientRef");
            return (Criteria) this;
        }

        public Criteria andProductClientRefLike(String value) {
            addCriterion("product_client_ref like", value, "productClientRef");
            return (Criteria) this;
        }

        public Criteria andProductClientRefNotLike(String value) {
            addCriterion("product_client_ref not like", value, "productClientRef");
            return (Criteria) this;
        }

        public Criteria andProductClientRefIn(List<String> values) {
            addCriterion("product_client_ref in", values, "productClientRef");
            return (Criteria) this;
        }

        public Criteria andProductClientRefNotIn(List<String> values) {
            addCriterion("product_client_ref not in", values, "productClientRef");
            return (Criteria) this;
        }

        public Criteria andProductClientRefBetween(String value1, String value2) {
            addCriterion("product_client_ref between", value1, value2, "productClientRef");
            return (Criteria) this;
        }

        public Criteria andProductClientRefNotBetween(String value1, String value2) {
            addCriterion("product_client_ref not between", value1, value2, "productClientRef");
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