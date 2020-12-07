package com.heeexy.example.model;

import java.util.ArrayList;
import java.util.List;

public class ProductSupplierExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductSupplierExample() {
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

        public Criteria andSupplierlink1IsNull() {
            addCriterion("supplierlink1 is null");
            return (Criteria) this;
        }

        public Criteria andSupplierlink1IsNotNull() {
            addCriterion("supplierlink1 is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierlink1EqualTo(String value) {
            addCriterion("supplierlink1 =", value, "supplierlink1");
            return (Criteria) this;
        }

        public Criteria andSupplierlink1NotEqualTo(String value) {
            addCriterion("supplierlink1 <>", value, "supplierlink1");
            return (Criteria) this;
        }

        public Criteria andSupplierlink1GreaterThan(String value) {
            addCriterion("supplierlink1 >", value, "supplierlink1");
            return (Criteria) this;
        }

        public Criteria andSupplierlink1GreaterThanOrEqualTo(String value) {
            addCriterion("supplierlink1 >=", value, "supplierlink1");
            return (Criteria) this;
        }

        public Criteria andSupplierlink1LessThan(String value) {
            addCriterion("supplierlink1 <", value, "supplierlink1");
            return (Criteria) this;
        }

        public Criteria andSupplierlink1LessThanOrEqualTo(String value) {
            addCriterion("supplierlink1 <=", value, "supplierlink1");
            return (Criteria) this;
        }

        public Criteria andSupplierlink1Like(String value) {
            addCriterion("supplierlink1 like", value, "supplierlink1");
            return (Criteria) this;
        }

        public Criteria andSupplierlink1NotLike(String value) {
            addCriterion("supplierlink1 not like", value, "supplierlink1");
            return (Criteria) this;
        }

        public Criteria andSupplierlink1In(List<String> values) {
            addCriterion("supplierlink1 in", values, "supplierlink1");
            return (Criteria) this;
        }

        public Criteria andSupplierlink1NotIn(List<String> values) {
            addCriterion("supplierlink1 not in", values, "supplierlink1");
            return (Criteria) this;
        }

        public Criteria andSupplierlink1Between(String value1, String value2) {
            addCriterion("supplierlink1 between", value1, value2, "supplierlink1");
            return (Criteria) this;
        }

        public Criteria andSupplierlink1NotBetween(String value1, String value2) {
            addCriterion("supplierlink1 not between", value1, value2, "supplierlink1");
            return (Criteria) this;
        }

        public Criteria andSupplierlink2IsNull() {
            addCriterion("supplierlink2 is null");
            return (Criteria) this;
        }

        public Criteria andSupplierlink2IsNotNull() {
            addCriterion("supplierlink2 is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierlink2EqualTo(String value) {
            addCriterion("supplierlink2 =", value, "supplierlink2");
            return (Criteria) this;
        }

        public Criteria andSupplierlink2NotEqualTo(String value) {
            addCriterion("supplierlink2 <>", value, "supplierlink2");
            return (Criteria) this;
        }

        public Criteria andSupplierlink2GreaterThan(String value) {
            addCriterion("supplierlink2 >", value, "supplierlink2");
            return (Criteria) this;
        }

        public Criteria andSupplierlink2GreaterThanOrEqualTo(String value) {
            addCriterion("supplierlink2 >=", value, "supplierlink2");
            return (Criteria) this;
        }

        public Criteria andSupplierlink2LessThan(String value) {
            addCriterion("supplierlink2 <", value, "supplierlink2");
            return (Criteria) this;
        }

        public Criteria andSupplierlink2LessThanOrEqualTo(String value) {
            addCriterion("supplierlink2 <=", value, "supplierlink2");
            return (Criteria) this;
        }

        public Criteria andSupplierlink2Like(String value) {
            addCriterion("supplierlink2 like", value, "supplierlink2");
            return (Criteria) this;
        }

        public Criteria andSupplierlink2NotLike(String value) {
            addCriterion("supplierlink2 not like", value, "supplierlink2");
            return (Criteria) this;
        }

        public Criteria andSupplierlink2In(List<String> values) {
            addCriterion("supplierlink2 in", values, "supplierlink2");
            return (Criteria) this;
        }

        public Criteria andSupplierlink2NotIn(List<String> values) {
            addCriterion("supplierlink2 not in", values, "supplierlink2");
            return (Criteria) this;
        }

        public Criteria andSupplierlink2Between(String value1, String value2) {
            addCriterion("supplierlink2 between", value1, value2, "supplierlink2");
            return (Criteria) this;
        }

        public Criteria andSupplierlink2NotBetween(String value1, String value2) {
            addCriterion("supplierlink2 not between", value1, value2, "supplierlink2");
            return (Criteria) this;
        }

        public Criteria andSupplierlink3IsNull() {
            addCriterion("supplierlink3 is null");
            return (Criteria) this;
        }

        public Criteria andSupplierlink3IsNotNull() {
            addCriterion("supplierlink3 is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierlink3EqualTo(String value) {
            addCriterion("supplierlink3 =", value, "supplierlink3");
            return (Criteria) this;
        }

        public Criteria andSupplierlink3NotEqualTo(String value) {
            addCriterion("supplierlink3 <>", value, "supplierlink3");
            return (Criteria) this;
        }

        public Criteria andSupplierlink3GreaterThan(String value) {
            addCriterion("supplierlink3 >", value, "supplierlink3");
            return (Criteria) this;
        }

        public Criteria andSupplierlink3GreaterThanOrEqualTo(String value) {
            addCriterion("supplierlink3 >=", value, "supplierlink3");
            return (Criteria) this;
        }

        public Criteria andSupplierlink3LessThan(String value) {
            addCriterion("supplierlink3 <", value, "supplierlink3");
            return (Criteria) this;
        }

        public Criteria andSupplierlink3LessThanOrEqualTo(String value) {
            addCriterion("supplierlink3 <=", value, "supplierlink3");
            return (Criteria) this;
        }

        public Criteria andSupplierlink3Like(String value) {
            addCriterion("supplierlink3 like", value, "supplierlink3");
            return (Criteria) this;
        }

        public Criteria andSupplierlink3NotLike(String value) {
            addCriterion("supplierlink3 not like", value, "supplierlink3");
            return (Criteria) this;
        }

        public Criteria andSupplierlink3In(List<String> values) {
            addCriterion("supplierlink3 in", values, "supplierlink3");
            return (Criteria) this;
        }

        public Criteria andSupplierlink3NotIn(List<String> values) {
            addCriterion("supplierlink3 not in", values, "supplierlink3");
            return (Criteria) this;
        }

        public Criteria andSupplierlink3Between(String value1, String value2) {
            addCriterion("supplierlink3 between", value1, value2, "supplierlink3");
            return (Criteria) this;
        }

        public Criteria andSupplierlink3NotBetween(String value1, String value2) {
            addCriterion("supplierlink3 not between", value1, value2, "supplierlink3");
            return (Criteria) this;
        }

        public Criteria andDeliverytimeIsNull() {
            addCriterion("deliverytime is null");
            return (Criteria) this;
        }

        public Criteria andDeliverytimeIsNotNull() {
            addCriterion("deliverytime is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverytimeEqualTo(Integer value) {
            addCriterion("deliverytime =", value, "deliverytime");
            return (Criteria) this;
        }

        public Criteria andDeliverytimeNotEqualTo(Integer value) {
            addCriterion("deliverytime <>", value, "deliverytime");
            return (Criteria) this;
        }

        public Criteria andDeliverytimeGreaterThan(Integer value) {
            addCriterion("deliverytime >", value, "deliverytime");
            return (Criteria) this;
        }

        public Criteria andDeliverytimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("deliverytime >=", value, "deliverytime");
            return (Criteria) this;
        }

        public Criteria andDeliverytimeLessThan(Integer value) {
            addCriterion("deliverytime <", value, "deliverytime");
            return (Criteria) this;
        }

        public Criteria andDeliverytimeLessThanOrEqualTo(Integer value) {
            addCriterion("deliverytime <=", value, "deliverytime");
            return (Criteria) this;
        }

        public Criteria andDeliverytimeIn(List<Integer> values) {
            addCriterion("deliverytime in", values, "deliverytime");
            return (Criteria) this;
        }

        public Criteria andDeliverytimeNotIn(List<Integer> values) {
            addCriterion("deliverytime not in", values, "deliverytime");
            return (Criteria) this;
        }

        public Criteria andDeliverytimeBetween(Integer value1, Integer value2) {
            addCriterion("deliverytime between", value1, value2, "deliverytime");
            return (Criteria) this;
        }

        public Criteria andDeliverytimeNotBetween(Integer value1, Integer value2) {
            addCriterion("deliverytime not between", value1, value2, "deliverytime");
            return (Criteria) this;
        }

        public Criteria andRegisterlinkIsNull() {
            addCriterion("registerlink is null");
            return (Criteria) this;
        }

        public Criteria andRegisterlinkIsNotNull() {
            addCriterion("registerlink is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterlinkEqualTo(String value) {
            addCriterion("registerlink =", value, "registerlink");
            return (Criteria) this;
        }

        public Criteria andRegisterlinkNotEqualTo(String value) {
            addCriterion("registerlink <>", value, "registerlink");
            return (Criteria) this;
        }

        public Criteria andRegisterlinkGreaterThan(String value) {
            addCriterion("registerlink >", value, "registerlink");
            return (Criteria) this;
        }

        public Criteria andRegisterlinkGreaterThanOrEqualTo(String value) {
            addCriterion("registerlink >=", value, "registerlink");
            return (Criteria) this;
        }

        public Criteria andRegisterlinkLessThan(String value) {
            addCriterion("registerlink <", value, "registerlink");
            return (Criteria) this;
        }

        public Criteria andRegisterlinkLessThanOrEqualTo(String value) {
            addCriterion("registerlink <=", value, "registerlink");
            return (Criteria) this;
        }

        public Criteria andRegisterlinkLike(String value) {
            addCriterion("registerlink like", value, "registerlink");
            return (Criteria) this;
        }

        public Criteria andRegisterlinkNotLike(String value) {
            addCriterion("registerlink not like", value, "registerlink");
            return (Criteria) this;
        }

        public Criteria andRegisterlinkIn(List<String> values) {
            addCriterion("registerlink in", values, "registerlink");
            return (Criteria) this;
        }

        public Criteria andRegisterlinkNotIn(List<String> values) {
            addCriterion("registerlink not in", values, "registerlink");
            return (Criteria) this;
        }

        public Criteria andRegisterlinkBetween(String value1, String value2) {
            addCriterion("registerlink between", value1, value2, "registerlink");
            return (Criteria) this;
        }

        public Criteria andRegisterlinkNotBetween(String value1, String value2) {
            addCriterion("registerlink not between", value1, value2, "registerlink");
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