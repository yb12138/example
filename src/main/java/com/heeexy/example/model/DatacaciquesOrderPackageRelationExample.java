package com.heeexy.example.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DatacaciquesOrderPackageRelationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DatacaciquesOrderPackageRelationExample() {
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

        public Criteria andSyssuborderidIsNull() {
            addCriterion("sysSubOrderID is null");
            return (Criteria) this;
        }

        public Criteria andSyssuborderidIsNotNull() {
            addCriterion("sysSubOrderID is not null");
            return (Criteria) this;
        }

        public Criteria andSyssuborderidEqualTo(Long value) {
            addCriterion("sysSubOrderID =", value, "syssuborderid");
            return (Criteria) this;
        }

        public Criteria andSyssuborderidNotEqualTo(Long value) {
            addCriterion("sysSubOrderID <>", value, "syssuborderid");
            return (Criteria) this;
        }

        public Criteria andSyssuborderidGreaterThan(Long value) {
            addCriterion("sysSubOrderID >", value, "syssuborderid");
            return (Criteria) this;
        }

        public Criteria andSyssuborderidGreaterThanOrEqualTo(Long value) {
            addCriterion("sysSubOrderID >=", value, "syssuborderid");
            return (Criteria) this;
        }

        public Criteria andSyssuborderidLessThan(Long value) {
            addCriterion("sysSubOrderID <", value, "syssuborderid");
            return (Criteria) this;
        }

        public Criteria andSyssuborderidLessThanOrEqualTo(Long value) {
            addCriterion("sysSubOrderID <=", value, "syssuborderid");
            return (Criteria) this;
        }

        public Criteria andSyssuborderidIn(List<Long> values) {
            addCriterion("sysSubOrderID in", values, "syssuborderid");
            return (Criteria) this;
        }

        public Criteria andSyssuborderidNotIn(List<Long> values) {
            addCriterion("sysSubOrderID not in", values, "syssuborderid");
            return (Criteria) this;
        }

        public Criteria andSyssuborderidBetween(Long value1, Long value2) {
            addCriterion("sysSubOrderID between", value1, value2, "syssuborderid");
            return (Criteria) this;
        }

        public Criteria andSyssuborderidNotBetween(Long value1, Long value2) {
            addCriterion("sysSubOrderID not between", value1, value2, "syssuborderid");
            return (Criteria) this;
        }

        public Criteria andSysorderidIsNull() {
            addCriterion("sysOrderID is null");
            return (Criteria) this;
        }

        public Criteria andSysorderidIsNotNull() {
            addCriterion("sysOrderID is not null");
            return (Criteria) this;
        }

        public Criteria andSysorderidEqualTo(Long value) {
            addCriterion("sysOrderID =", value, "sysorderid");
            return (Criteria) this;
        }

        public Criteria andSysorderidNotEqualTo(Long value) {
            addCriterion("sysOrderID <>", value, "sysorderid");
            return (Criteria) this;
        }

        public Criteria andSysorderidGreaterThan(Long value) {
            addCriterion("sysOrderID >", value, "sysorderid");
            return (Criteria) this;
        }

        public Criteria andSysorderidGreaterThanOrEqualTo(Long value) {
            addCriterion("sysOrderID >=", value, "sysorderid");
            return (Criteria) this;
        }

        public Criteria andSysorderidLessThan(Long value) {
            addCriterion("sysOrderID <", value, "sysorderid");
            return (Criteria) this;
        }

        public Criteria andSysorderidLessThanOrEqualTo(Long value) {
            addCriterion("sysOrderID <=", value, "sysorderid");
            return (Criteria) this;
        }

        public Criteria andSysorderidIn(List<Long> values) {
            addCriterion("sysOrderID in", values, "sysorderid");
            return (Criteria) this;
        }

        public Criteria andSysorderidNotIn(List<Long> values) {
            addCriterion("sysOrderID not in", values, "sysorderid");
            return (Criteria) this;
        }

        public Criteria andSysorderidBetween(Long value1, Long value2) {
            addCriterion("sysOrderID between", value1, value2, "sysorderid");
            return (Criteria) this;
        }

        public Criteria andSysorderidNotBetween(Long value1, Long value2) {
            addCriterion("sysOrderID not between", value1, value2, "sysorderid");
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

        public Criteria andPfquantityIsNull() {
            addCriterion("pfQuantity is null");
            return (Criteria) this;
        }

        public Criteria andPfquantityIsNotNull() {
            addCriterion("pfQuantity is not null");
            return (Criteria) this;
        }

        public Criteria andPfquantityEqualTo(Integer value) {
            addCriterion("pfQuantity =", value, "pfquantity");
            return (Criteria) this;
        }

        public Criteria andPfquantityNotEqualTo(Integer value) {
            addCriterion("pfQuantity <>", value, "pfquantity");
            return (Criteria) this;
        }

        public Criteria andPfquantityGreaterThan(Integer value) {
            addCriterion("pfQuantity >", value, "pfquantity");
            return (Criteria) this;
        }

        public Criteria andPfquantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("pfQuantity >=", value, "pfquantity");
            return (Criteria) this;
        }

        public Criteria andPfquantityLessThan(Integer value) {
            addCriterion("pfQuantity <", value, "pfquantity");
            return (Criteria) this;
        }

        public Criteria andPfquantityLessThanOrEqualTo(Integer value) {
            addCriterion("pfQuantity <=", value, "pfquantity");
            return (Criteria) this;
        }

        public Criteria andPfquantityIn(List<Integer> values) {
            addCriterion("pfQuantity in", values, "pfquantity");
            return (Criteria) this;
        }

        public Criteria andPfquantityNotIn(List<Integer> values) {
            addCriterion("pfQuantity not in", values, "pfquantity");
            return (Criteria) this;
        }

        public Criteria andPfquantityBetween(Integer value1, Integer value2) {
            addCriterion("pfQuantity between", value1, value2, "pfquantity");
            return (Criteria) this;
        }

        public Criteria andPfquantityNotBetween(Integer value1, Integer value2) {
            addCriterion("pfQuantity not between", value1, value2, "pfquantity");
            return (Criteria) this;
        }

        public Criteria andSysquantityIsNull() {
            addCriterion("sysQuantity is null");
            return (Criteria) this;
        }

        public Criteria andSysquantityIsNotNull() {
            addCriterion("sysQuantity is not null");
            return (Criteria) this;
        }

        public Criteria andSysquantityEqualTo(Integer value) {
            addCriterion("sysQuantity =", value, "sysquantity");
            return (Criteria) this;
        }

        public Criteria andSysquantityNotEqualTo(Integer value) {
            addCriterion("sysQuantity <>", value, "sysquantity");
            return (Criteria) this;
        }

        public Criteria andSysquantityGreaterThan(Integer value) {
            addCriterion("sysQuantity >", value, "sysquantity");
            return (Criteria) this;
        }

        public Criteria andSysquantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("sysQuantity >=", value, "sysquantity");
            return (Criteria) this;
        }

        public Criteria andSysquantityLessThan(Integer value) {
            addCriterion("sysQuantity <", value, "sysquantity");
            return (Criteria) this;
        }

        public Criteria andSysquantityLessThanOrEqualTo(Integer value) {
            addCriterion("sysQuantity <=", value, "sysquantity");
            return (Criteria) this;
        }

        public Criteria andSysquantityIn(List<Integer> values) {
            addCriterion("sysQuantity in", values, "sysquantity");
            return (Criteria) this;
        }

        public Criteria andSysquantityNotIn(List<Integer> values) {
            addCriterion("sysQuantity not in", values, "sysquantity");
            return (Criteria) this;
        }

        public Criteria andSysquantityBetween(Integer value1, Integer value2) {
            addCriterion("sysQuantity between", value1, value2, "sysquantity");
            return (Criteria) this;
        }

        public Criteria andSysquantityNotBetween(Integer value1, Integer value2) {
            addCriterion("sysQuantity not between", value1, value2, "sysquantity");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
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