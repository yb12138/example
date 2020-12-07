package com.heeexy.example.model;

import java.util.ArrayList;
import java.util.List;

public class WinitOrderDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WinitOrderDetailExample() {
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

        public Criteria andOrdernoIsNull() {
            addCriterion("orderNo is null");
            return (Criteria) this;
        }

        public Criteria andOrdernoIsNotNull() {
            addCriterion("orderNo is not null");
            return (Criteria) this;
        }

        public Criteria andOrdernoEqualTo(String value) {
            addCriterion("orderNo =", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotEqualTo(String value) {
            addCriterion("orderNo <>", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoGreaterThan(String value) {
            addCriterion("orderNo >", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoGreaterThanOrEqualTo(String value) {
            addCriterion("orderNo >=", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoLessThan(String value) {
            addCriterion("orderNo <", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoLessThanOrEqualTo(String value) {
            addCriterion("orderNo <=", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoLike(String value) {
            addCriterion("orderNo like", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotLike(String value) {
            addCriterion("orderNo not like", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoIn(List<String> values) {
            addCriterion("orderNo in", values, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotIn(List<String> values) {
            addCriterion("orderNo not in", values, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoBetween(String value1, String value2) {
            addCriterion("orderNo between", value1, value2, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotBetween(String value1, String value2) {
            addCriterion("orderNo not between", value1, value2, "orderno");
            return (Criteria) this;
        }

        public Criteria andPlanshelfcompleteddateIsNull() {
            addCriterion("planShelfCompletedDate is null");
            return (Criteria) this;
        }

        public Criteria andPlanshelfcompleteddateIsNotNull() {
            addCriterion("planShelfCompletedDate is not null");
            return (Criteria) this;
        }

        public Criteria andPlanshelfcompleteddateEqualTo(String value) {
            addCriterion("planShelfCompletedDate =", value, "planshelfcompleteddate");
            return (Criteria) this;
        }

        public Criteria andPlanshelfcompleteddateNotEqualTo(String value) {
            addCriterion("planShelfCompletedDate <>", value, "planshelfcompleteddate");
            return (Criteria) this;
        }

        public Criteria andPlanshelfcompleteddateGreaterThan(String value) {
            addCriterion("planShelfCompletedDate >", value, "planshelfcompleteddate");
            return (Criteria) this;
        }

        public Criteria andPlanshelfcompleteddateGreaterThanOrEqualTo(String value) {
            addCriterion("planShelfCompletedDate >=", value, "planshelfcompleteddate");
            return (Criteria) this;
        }

        public Criteria andPlanshelfcompleteddateLessThan(String value) {
            addCriterion("planShelfCompletedDate <", value, "planshelfcompleteddate");
            return (Criteria) this;
        }

        public Criteria andPlanshelfcompleteddateLessThanOrEqualTo(String value) {
            addCriterion("planShelfCompletedDate <=", value, "planshelfcompleteddate");
            return (Criteria) this;
        }

        public Criteria andPlanshelfcompleteddateLike(String value) {
            addCriterion("planShelfCompletedDate like", value, "planshelfcompleteddate");
            return (Criteria) this;
        }

        public Criteria andPlanshelfcompleteddateNotLike(String value) {
            addCriterion("planShelfCompletedDate not like", value, "planshelfcompleteddate");
            return (Criteria) this;
        }

        public Criteria andPlanshelfcompleteddateIn(List<String> values) {
            addCriterion("planShelfCompletedDate in", values, "planshelfcompleteddate");
            return (Criteria) this;
        }

        public Criteria andPlanshelfcompleteddateNotIn(List<String> values) {
            addCriterion("planShelfCompletedDate not in", values, "planshelfcompleteddate");
            return (Criteria) this;
        }

        public Criteria andPlanshelfcompleteddateBetween(String value1, String value2) {
            addCriterion("planShelfCompletedDate between", value1, value2, "planshelfcompleteddate");
            return (Criteria) this;
        }

        public Criteria andPlanshelfcompleteddateNotBetween(String value1, String value2) {
            addCriterion("planShelfCompletedDate not between", value1, value2, "planshelfcompleteddate");
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

        public Criteria andCreateddateIsNull() {
            addCriterion("createdDate is null");
            return (Criteria) this;
        }

        public Criteria andCreateddateIsNotNull() {
            addCriterion("createdDate is not null");
            return (Criteria) this;
        }

        public Criteria andCreateddateEqualTo(String value) {
            addCriterion("createdDate =", value, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateNotEqualTo(String value) {
            addCriterion("createdDate <>", value, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateGreaterThan(String value) {
            addCriterion("createdDate >", value, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateGreaterThanOrEqualTo(String value) {
            addCriterion("createdDate >=", value, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateLessThan(String value) {
            addCriterion("createdDate <", value, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateLessThanOrEqualTo(String value) {
            addCriterion("createdDate <=", value, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateLike(String value) {
            addCriterion("createdDate like", value, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateNotLike(String value) {
            addCriterion("createdDate not like", value, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateIn(List<String> values) {
            addCriterion("createdDate in", values, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateNotIn(List<String> values) {
            addCriterion("createdDate not in", values, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateBetween(String value1, String value2) {
            addCriterion("createdDate between", value1, value2, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateNotBetween(String value1, String value2) {
            addCriterion("createdDate not between", value1, value2, "createddate");
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