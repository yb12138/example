package com.heeexy.example.model;

import java.util.ArrayList;
import java.util.List;

public class CollectAmountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CollectAmountExample() {
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

        public Criteria andAmountidIsNull() {
            addCriterion("amountID is null");
            return (Criteria) this;
        }

        public Criteria andAmountidIsNotNull() {
            addCriterion("amountID is not null");
            return (Criteria) this;
        }

        public Criteria andAmountidEqualTo(Integer value) {
            addCriterion("amountID =", value, "amountid");
            return (Criteria) this;
        }

        public Criteria andAmountidNotEqualTo(Integer value) {
            addCriterion("amountID <>", value, "amountid");
            return (Criteria) this;
        }

        public Criteria andAmountidGreaterThan(Integer value) {
            addCriterion("amountID >", value, "amountid");
            return (Criteria) this;
        }

        public Criteria andAmountidGreaterThanOrEqualTo(Integer value) {
            addCriterion("amountID >=", value, "amountid");
            return (Criteria) this;
        }

        public Criteria andAmountidLessThan(Integer value) {
            addCriterion("amountID <", value, "amountid");
            return (Criteria) this;
        }

        public Criteria andAmountidLessThanOrEqualTo(Integer value) {
            addCriterion("amountID <=", value, "amountid");
            return (Criteria) this;
        }

        public Criteria andAmountidIn(List<Integer> values) {
            addCriterion("amountID in", values, "amountid");
            return (Criteria) this;
        }

        public Criteria andAmountidNotIn(List<Integer> values) {
            addCriterion("amountID not in", values, "amountid");
            return (Criteria) this;
        }

        public Criteria andAmountidBetween(Integer value1, Integer value2) {
            addCriterion("amountID between", value1, value2, "amountid");
            return (Criteria) this;
        }

        public Criteria andAmountidNotBetween(Integer value1, Integer value2) {
            addCriterion("amountID not between", value1, value2, "amountid");
            return (Criteria) this;
        }

        public Criteria andYearIsNull() {
            addCriterion("year is null");
            return (Criteria) this;
        }

        public Criteria andYearIsNotNull() {
            addCriterion("year is not null");
            return (Criteria) this;
        }

        public Criteria andYearEqualTo(Integer value) {
            addCriterion("year =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(Integer value) {
            addCriterion("year <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(Integer value) {
            addCriterion("year >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("year >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(Integer value) {
            addCriterion("year <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(Integer value) {
            addCriterion("year <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<Integer> values) {
            addCriterion("year in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<Integer> values) {
            addCriterion("year not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(Integer value1, Integer value2) {
            addCriterion("year between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(Integer value1, Integer value2) {
            addCriterion("year not between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andMonthIsNull() {
            addCriterion("month is null");
            return (Criteria) this;
        }

        public Criteria andMonthIsNotNull() {
            addCriterion("month is not null");
            return (Criteria) this;
        }

        public Criteria andMonthEqualTo(Integer value) {
            addCriterion("month =", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotEqualTo(Integer value) {
            addCriterion("month <>", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthGreaterThan(Integer value) {
            addCriterion("month >", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthGreaterThanOrEqualTo(Integer value) {
            addCriterion("month >=", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLessThan(Integer value) {
            addCriterion("month <", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLessThanOrEqualTo(Integer value) {
            addCriterion("month <=", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthIn(List<Integer> values) {
            addCriterion("month in", values, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotIn(List<Integer> values) {
            addCriterion("month not in", values, "month");
            return (Criteria) this;
        }

        public Criteria andMonthBetween(Integer value1, Integer value2) {
            addCriterion("month between", value1, value2, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotBetween(Integer value1, Integer value2) {
            addCriterion("month not between", value1, value2, "month");
            return (Criteria) this;
        }

        public Criteria andOnsellallamountIsNull() {
            addCriterion("onSellAllAmount is null");
            return (Criteria) this;
        }

        public Criteria andOnsellallamountIsNotNull() {
            addCriterion("onSellAllAmount is not null");
            return (Criteria) this;
        }

        public Criteria andOnsellallamountEqualTo(Double value) {
            addCriterion("onSellAllAmount =", value, "onsellallamount");
            return (Criteria) this;
        }

        public Criteria andOnsellallamountNotEqualTo(Double value) {
            addCriterion("onSellAllAmount <>", value, "onsellallamount");
            return (Criteria) this;
        }

        public Criteria andOnsellallamountGreaterThan(Double value) {
            addCriterion("onSellAllAmount >", value, "onsellallamount");
            return (Criteria) this;
        }

        public Criteria andOnsellallamountGreaterThanOrEqualTo(Double value) {
            addCriterion("onSellAllAmount >=", value, "onsellallamount");
            return (Criteria) this;
        }

        public Criteria andOnsellallamountLessThan(Double value) {
            addCriterion("onSellAllAmount <", value, "onsellallamount");
            return (Criteria) this;
        }

        public Criteria andOnsellallamountLessThanOrEqualTo(Double value) {
            addCriterion("onSellAllAmount <=", value, "onsellallamount");
            return (Criteria) this;
        }

        public Criteria andOnsellallamountIn(List<Double> values) {
            addCriterion("onSellAllAmount in", values, "onsellallamount");
            return (Criteria) this;
        }

        public Criteria andOnsellallamountNotIn(List<Double> values) {
            addCriterion("onSellAllAmount not in", values, "onsellallamount");
            return (Criteria) this;
        }

        public Criteria andOnsellallamountBetween(Double value1, Double value2) {
            addCriterion("onSellAllAmount between", value1, value2, "onsellallamount");
            return (Criteria) this;
        }

        public Criteria andOnsellallamountNotBetween(Double value1, Double value2) {
            addCriterion("onSellAllAmount not between", value1, value2, "onsellallamount");
            return (Criteria) this;
        }

        public Criteria andPurchaseallamountIsNull() {
            addCriterion("purchaseAllAmount is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseallamountIsNotNull() {
            addCriterion("purchaseAllAmount is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseallamountEqualTo(Double value) {
            addCriterion("purchaseAllAmount =", value, "purchaseallamount");
            return (Criteria) this;
        }

        public Criteria andPurchaseallamountNotEqualTo(Double value) {
            addCriterion("purchaseAllAmount <>", value, "purchaseallamount");
            return (Criteria) this;
        }

        public Criteria andPurchaseallamountGreaterThan(Double value) {
            addCriterion("purchaseAllAmount >", value, "purchaseallamount");
            return (Criteria) this;
        }

        public Criteria andPurchaseallamountGreaterThanOrEqualTo(Double value) {
            addCriterion("purchaseAllAmount >=", value, "purchaseallamount");
            return (Criteria) this;
        }

        public Criteria andPurchaseallamountLessThan(Double value) {
            addCriterion("purchaseAllAmount <", value, "purchaseallamount");
            return (Criteria) this;
        }

        public Criteria andPurchaseallamountLessThanOrEqualTo(Double value) {
            addCriterion("purchaseAllAmount <=", value, "purchaseallamount");
            return (Criteria) this;
        }

        public Criteria andPurchaseallamountIn(List<Double> values) {
            addCriterion("purchaseAllAmount in", values, "purchaseallamount");
            return (Criteria) this;
        }

        public Criteria andPurchaseallamountNotIn(List<Double> values) {
            addCriterion("purchaseAllAmount not in", values, "purchaseallamount");
            return (Criteria) this;
        }

        public Criteria andPurchaseallamountBetween(Double value1, Double value2) {
            addCriterion("purchaseAllAmount between", value1, value2, "purchaseallamount");
            return (Criteria) this;
        }

        public Criteria andPurchaseallamountNotBetween(Double value1, Double value2) {
            addCriterion("purchaseAllAmount not between", value1, value2, "purchaseallamount");
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