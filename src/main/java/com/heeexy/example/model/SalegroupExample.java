package com.heeexy.example.model;

import java.util.ArrayList;
import java.util.List;

public class SalegroupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SalegroupExample() {
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

        public Criteria andSalegroupidIsNull() {
            addCriterion("saleGroupID is null");
            return (Criteria) this;
        }

        public Criteria andSalegroupidIsNotNull() {
            addCriterion("saleGroupID is not null");
            return (Criteria) this;
        }

        public Criteria andSalegroupidEqualTo(Integer value) {
            addCriterion("saleGroupID =", value, "salegroupid");
            return (Criteria) this;
        }

        public Criteria andSalegroupidNotEqualTo(Integer value) {
            addCriterion("saleGroupID <>", value, "salegroupid");
            return (Criteria) this;
        }

        public Criteria andSalegroupidGreaterThan(Integer value) {
            addCriterion("saleGroupID >", value, "salegroupid");
            return (Criteria) this;
        }

        public Criteria andSalegroupidGreaterThanOrEqualTo(Integer value) {
            addCriterion("saleGroupID >=", value, "salegroupid");
            return (Criteria) this;
        }

        public Criteria andSalegroupidLessThan(Integer value) {
            addCriterion("saleGroupID <", value, "salegroupid");
            return (Criteria) this;
        }

        public Criteria andSalegroupidLessThanOrEqualTo(Integer value) {
            addCriterion("saleGroupID <=", value, "salegroupid");
            return (Criteria) this;
        }

        public Criteria andSalegroupidIn(List<Integer> values) {
            addCriterion("saleGroupID in", values, "salegroupid");
            return (Criteria) this;
        }

        public Criteria andSalegroupidNotIn(List<Integer> values) {
            addCriterion("saleGroupID not in", values, "salegroupid");
            return (Criteria) this;
        }

        public Criteria andSalegroupidBetween(Integer value1, Integer value2) {
            addCriterion("saleGroupID between", value1, value2, "salegroupid");
            return (Criteria) this;
        }

        public Criteria andSalegroupidNotBetween(Integer value1, Integer value2) {
            addCriterion("saleGroupID not between", value1, value2, "salegroupid");
            return (Criteria) this;
        }

        public Criteria andSalegroupnameIsNull() {
            addCriterion("saleGroupName is null");
            return (Criteria) this;
        }

        public Criteria andSalegroupnameIsNotNull() {
            addCriterion("saleGroupName is not null");
            return (Criteria) this;
        }

        public Criteria andSalegroupnameEqualTo(String value) {
            addCriterion("saleGroupName =", value, "salegroupname");
            return (Criteria) this;
        }

        public Criteria andSalegroupnameNotEqualTo(String value) {
            addCriterion("saleGroupName <>", value, "salegroupname");
            return (Criteria) this;
        }

        public Criteria andSalegroupnameGreaterThan(String value) {
            addCriterion("saleGroupName >", value, "salegroupname");
            return (Criteria) this;
        }

        public Criteria andSalegroupnameGreaterThanOrEqualTo(String value) {
            addCriterion("saleGroupName >=", value, "salegroupname");
            return (Criteria) this;
        }

        public Criteria andSalegroupnameLessThan(String value) {
            addCriterion("saleGroupName <", value, "salegroupname");
            return (Criteria) this;
        }

        public Criteria andSalegroupnameLessThanOrEqualTo(String value) {
            addCriterion("saleGroupName <=", value, "salegroupname");
            return (Criteria) this;
        }

        public Criteria andSalegroupnameLike(String value) {
            addCriterion("saleGroupName like", value, "salegroupname");
            return (Criteria) this;
        }

        public Criteria andSalegroupnameNotLike(String value) {
            addCriterion("saleGroupName not like", value, "salegroupname");
            return (Criteria) this;
        }

        public Criteria andSalegroupnameIn(List<String> values) {
            addCriterion("saleGroupName in", values, "salegroupname");
            return (Criteria) this;
        }

        public Criteria andSalegroupnameNotIn(List<String> values) {
            addCriterion("saleGroupName not in", values, "salegroupname");
            return (Criteria) this;
        }

        public Criteria andSalegroupnameBetween(String value1, String value2) {
            addCriterion("saleGroupName between", value1, value2, "salegroupname");
            return (Criteria) this;
        }

        public Criteria andSalegroupnameNotBetween(String value1, String value2) {
            addCriterion("saleGroupName not between", value1, value2, "salegroupname");
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