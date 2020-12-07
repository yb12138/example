package com.heeexy.example.model;

import java.util.ArrayList;
import java.util.List;

public class AfterreasonExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AfterreasonExample() {
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

        public Criteria andReasonidIsNull() {
            addCriterion("reasonid is null");
            return (Criteria) this;
        }

        public Criteria andReasonidIsNotNull() {
            addCriterion("reasonid is not null");
            return (Criteria) this;
        }

        public Criteria andReasonidEqualTo(Integer value) {
            addCriterion("reasonid =", value, "reasonid");
            return (Criteria) this;
        }

        public Criteria andReasonidNotEqualTo(Integer value) {
            addCriterion("reasonid <>", value, "reasonid");
            return (Criteria) this;
        }

        public Criteria andReasonidGreaterThan(Integer value) {
            addCriterion("reasonid >", value, "reasonid");
            return (Criteria) this;
        }

        public Criteria andReasonidGreaterThanOrEqualTo(Integer value) {
            addCriterion("reasonid >=", value, "reasonid");
            return (Criteria) this;
        }

        public Criteria andReasonidLessThan(Integer value) {
            addCriterion("reasonid <", value, "reasonid");
            return (Criteria) this;
        }

        public Criteria andReasonidLessThanOrEqualTo(Integer value) {
            addCriterion("reasonid <=", value, "reasonid");
            return (Criteria) this;
        }

        public Criteria andReasonidIn(List<Integer> values) {
            addCriterion("reasonid in", values, "reasonid");
            return (Criteria) this;
        }

        public Criteria andReasonidNotIn(List<Integer> values) {
            addCriterion("reasonid not in", values, "reasonid");
            return (Criteria) this;
        }

        public Criteria andReasonidBetween(Integer value1, Integer value2) {
            addCriterion("reasonid between", value1, value2, "reasonid");
            return (Criteria) this;
        }

        public Criteria andReasonidNotBetween(Integer value1, Integer value2) {
            addCriterion("reasonid not between", value1, value2, "reasonid");
            return (Criteria) this;
        }

        public Criteria andReasonnameIsNull() {
            addCriterion("reasonname is null");
            return (Criteria) this;
        }

        public Criteria andReasonnameIsNotNull() {
            addCriterion("reasonname is not null");
            return (Criteria) this;
        }

        public Criteria andReasonnameEqualTo(String value) {
            addCriterion("reasonname =", value, "reasonname");
            return (Criteria) this;
        }

        public Criteria andReasonnameNotEqualTo(String value) {
            addCriterion("reasonname <>", value, "reasonname");
            return (Criteria) this;
        }

        public Criteria andReasonnameGreaterThan(String value) {
            addCriterion("reasonname >", value, "reasonname");
            return (Criteria) this;
        }

        public Criteria andReasonnameGreaterThanOrEqualTo(String value) {
            addCriterion("reasonname >=", value, "reasonname");
            return (Criteria) this;
        }

        public Criteria andReasonnameLessThan(String value) {
            addCriterion("reasonname <", value, "reasonname");
            return (Criteria) this;
        }

        public Criteria andReasonnameLessThanOrEqualTo(String value) {
            addCriterion("reasonname <=", value, "reasonname");
            return (Criteria) this;
        }

        public Criteria andReasonnameLike(String value) {
            addCriterion("reasonname like", value, "reasonname");
            return (Criteria) this;
        }

        public Criteria andReasonnameNotLike(String value) {
            addCriterion("reasonname not like", value, "reasonname");
            return (Criteria) this;
        }

        public Criteria andReasonnameIn(List<String> values) {
            addCriterion("reasonname in", values, "reasonname");
            return (Criteria) this;
        }

        public Criteria andReasonnameNotIn(List<String> values) {
            addCriterion("reasonname not in", values, "reasonname");
            return (Criteria) this;
        }

        public Criteria andReasonnameBetween(String value1, String value2) {
            addCriterion("reasonname between", value1, value2, "reasonname");
            return (Criteria) this;
        }

        public Criteria andReasonnameNotBetween(String value1, String value2) {
            addCriterion("reasonname not between", value1, value2, "reasonname");
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