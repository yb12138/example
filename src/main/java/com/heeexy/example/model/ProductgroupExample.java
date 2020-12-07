package com.heeexy.example.model;

import java.util.ArrayList;
import java.util.List;

public class ProductgroupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductgroupExample() {
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

        public Criteria andProductgroupidIsNull() {
            addCriterion("productGroupID is null");
            return (Criteria) this;
        }

        public Criteria andProductgroupidIsNotNull() {
            addCriterion("productGroupID is not null");
            return (Criteria) this;
        }

        public Criteria andProductgroupidEqualTo(Integer value) {
            addCriterion("productGroupID =", value, "productgroupid");
            return (Criteria) this;
        }

        public Criteria andProductgroupidNotEqualTo(Integer value) {
            addCriterion("productGroupID <>", value, "productgroupid");
            return (Criteria) this;
        }

        public Criteria andProductgroupidGreaterThan(Integer value) {
            addCriterion("productGroupID >", value, "productgroupid");
            return (Criteria) this;
        }

        public Criteria andProductgroupidGreaterThanOrEqualTo(Integer value) {
            addCriterion("productGroupID >=", value, "productgroupid");
            return (Criteria) this;
        }

        public Criteria andProductgroupidLessThan(Integer value) {
            addCriterion("productGroupID <", value, "productgroupid");
            return (Criteria) this;
        }

        public Criteria andProductgroupidLessThanOrEqualTo(Integer value) {
            addCriterion("productGroupID <=", value, "productgroupid");
            return (Criteria) this;
        }

        public Criteria andProductgroupidIn(List<Integer> values) {
            addCriterion("productGroupID in", values, "productgroupid");
            return (Criteria) this;
        }

        public Criteria andProductgroupidNotIn(List<Integer> values) {
            addCriterion("productGroupID not in", values, "productgroupid");
            return (Criteria) this;
        }

        public Criteria andProductgroupidBetween(Integer value1, Integer value2) {
            addCriterion("productGroupID between", value1, value2, "productgroupid");
            return (Criteria) this;
        }

        public Criteria andProductgroupidNotBetween(Integer value1, Integer value2) {
            addCriterion("productGroupID not between", value1, value2, "productgroupid");
            return (Criteria) this;
        }

        public Criteria andProductgroupnameIsNull() {
            addCriterion("productGroupName is null");
            return (Criteria) this;
        }

        public Criteria andProductgroupnameIsNotNull() {
            addCriterion("productGroupName is not null");
            return (Criteria) this;
        }

        public Criteria andProductgroupnameEqualTo(String value) {
            addCriterion("productGroupName =", value, "productgroupname");
            return (Criteria) this;
        }

        public Criteria andProductgroupnameNotEqualTo(String value) {
            addCriterion("productGroupName <>", value, "productgroupname");
            return (Criteria) this;
        }

        public Criteria andProductgroupnameGreaterThan(String value) {
            addCriterion("productGroupName >", value, "productgroupname");
            return (Criteria) this;
        }

        public Criteria andProductgroupnameGreaterThanOrEqualTo(String value) {
            addCriterion("productGroupName >=", value, "productgroupname");
            return (Criteria) this;
        }

        public Criteria andProductgroupnameLessThan(String value) {
            addCriterion("productGroupName <", value, "productgroupname");
            return (Criteria) this;
        }

        public Criteria andProductgroupnameLessThanOrEqualTo(String value) {
            addCriterion("productGroupName <=", value, "productgroupname");
            return (Criteria) this;
        }

        public Criteria andProductgroupnameLike(String value) {
            addCriterion("productGroupName like", value, "productgroupname");
            return (Criteria) this;
        }

        public Criteria andProductgroupnameNotLike(String value) {
            addCriterion("productGroupName not like", value, "productgroupname");
            return (Criteria) this;
        }

        public Criteria andProductgroupnameIn(List<String> values) {
            addCriterion("productGroupName in", values, "productgroupname");
            return (Criteria) this;
        }

        public Criteria andProductgroupnameNotIn(List<String> values) {
            addCriterion("productGroupName not in", values, "productgroupname");
            return (Criteria) this;
        }

        public Criteria andProductgroupnameBetween(String value1, String value2) {
            addCriterion("productGroupName between", value1, value2, "productgroupname");
            return (Criteria) this;
        }

        public Criteria andProductgroupnameNotBetween(String value1, String value2) {
            addCriterion("productGroupName not between", value1, value2, "productgroupname");
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