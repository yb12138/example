package com.heeexy.example.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AlloOutSkuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AlloOutSkuExample() {
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

        public Criteria andAlloskuidIsNull() {
            addCriterion("alloSkuID is null");
            return (Criteria) this;
        }

        public Criteria andAlloskuidIsNotNull() {
            addCriterion("alloSkuID is not null");
            return (Criteria) this;
        }

        public Criteria andAlloskuidEqualTo(Integer value) {
            addCriterion("alloSkuID =", value, "alloskuid");
            return (Criteria) this;
        }

        public Criteria andAlloskuidNotEqualTo(Integer value) {
            addCriterion("alloSkuID <>", value, "alloskuid");
            return (Criteria) this;
        }

        public Criteria andAlloskuidGreaterThan(Integer value) {
            addCriterion("alloSkuID >", value, "alloskuid");
            return (Criteria) this;
        }

        public Criteria andAlloskuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("alloSkuID >=", value, "alloskuid");
            return (Criteria) this;
        }

        public Criteria andAlloskuidLessThan(Integer value) {
            addCriterion("alloSkuID <", value, "alloskuid");
            return (Criteria) this;
        }

        public Criteria andAlloskuidLessThanOrEqualTo(Integer value) {
            addCriterion("alloSkuID <=", value, "alloskuid");
            return (Criteria) this;
        }

        public Criteria andAlloskuidIn(List<Integer> values) {
            addCriterion("alloSkuID in", values, "alloskuid");
            return (Criteria) this;
        }

        public Criteria andAlloskuidNotIn(List<Integer> values) {
            addCriterion("alloSkuID not in", values, "alloskuid");
            return (Criteria) this;
        }

        public Criteria andAlloskuidBetween(Integer value1, Integer value2) {
            addCriterion("alloSkuID between", value1, value2, "alloskuid");
            return (Criteria) this;
        }

        public Criteria andAlloskuidNotBetween(Integer value1, Integer value2) {
            addCriterion("alloSkuID not between", value1, value2, "alloskuid");
            return (Criteria) this;
        }

        public Criteria andAlloidIsNull() {
            addCriterion("alloID is null");
            return (Criteria) this;
        }

        public Criteria andAlloidIsNotNull() {
            addCriterion("alloID is not null");
            return (Criteria) this;
        }

        public Criteria andAlloidEqualTo(Integer value) {
            addCriterion("alloID =", value, "alloid");
            return (Criteria) this;
        }

        public Criteria andAlloidNotEqualTo(Integer value) {
            addCriterion("alloID <>", value, "alloid");
            return (Criteria) this;
        }

        public Criteria andAlloidGreaterThan(Integer value) {
            addCriterion("alloID >", value, "alloid");
            return (Criteria) this;
        }

        public Criteria andAlloidGreaterThanOrEqualTo(Integer value) {
            addCriterion("alloID >=", value, "alloid");
            return (Criteria) this;
        }

        public Criteria andAlloidLessThan(Integer value) {
            addCriterion("alloID <", value, "alloid");
            return (Criteria) this;
        }

        public Criteria andAlloidLessThanOrEqualTo(Integer value) {
            addCriterion("alloID <=", value, "alloid");
            return (Criteria) this;
        }

        public Criteria andAlloidIn(List<Integer> values) {
            addCriterion("alloID in", values, "alloid");
            return (Criteria) this;
        }

        public Criteria andAlloidNotIn(List<Integer> values) {
            addCriterion("alloID not in", values, "alloid");
            return (Criteria) this;
        }

        public Criteria andAlloidBetween(Integer value1, Integer value2) {
            addCriterion("alloID between", value1, value2, "alloid");
            return (Criteria) this;
        }

        public Criteria andAlloidNotBetween(Integer value1, Integer value2) {
            addCriterion("alloID not between", value1, value2, "alloid");
            return (Criteria) this;
        }

        public Criteria andAllonumIsNull() {
            addCriterion("alloNum is null");
            return (Criteria) this;
        }

        public Criteria andAllonumIsNotNull() {
            addCriterion("alloNum is not null");
            return (Criteria) this;
        }

        public Criteria andAllonumEqualTo(String value) {
            addCriterion("alloNum =", value, "allonum");
            return (Criteria) this;
        }

        public Criteria andAllonumNotEqualTo(String value) {
            addCriterion("alloNum <>", value, "allonum");
            return (Criteria) this;
        }

        public Criteria andAllonumGreaterThan(String value) {
            addCriterion("alloNum >", value, "allonum");
            return (Criteria) this;
        }

        public Criteria andAllonumGreaterThanOrEqualTo(String value) {
            addCriterion("alloNum >=", value, "allonum");
            return (Criteria) this;
        }

        public Criteria andAllonumLessThan(String value) {
            addCriterion("alloNum <", value, "allonum");
            return (Criteria) this;
        }

        public Criteria andAllonumLessThanOrEqualTo(String value) {
            addCriterion("alloNum <=", value, "allonum");
            return (Criteria) this;
        }

        public Criteria andAllonumLike(String value) {
            addCriterion("alloNum like", value, "allonum");
            return (Criteria) this;
        }

        public Criteria andAllonumNotLike(String value) {
            addCriterion("alloNum not like", value, "allonum");
            return (Criteria) this;
        }

        public Criteria andAllonumIn(List<String> values) {
            addCriterion("alloNum in", values, "allonum");
            return (Criteria) this;
        }

        public Criteria andAllonumNotIn(List<String> values) {
            addCriterion("alloNum not in", values, "allonum");
            return (Criteria) this;
        }

        public Criteria andAllonumBetween(String value1, String value2) {
            addCriterion("alloNum between", value1, value2, "allonum");
            return (Criteria) this;
        }

        public Criteria andAllonumNotBetween(String value1, String value2) {
            addCriterion("alloNum not between", value1, value2, "allonum");
            return (Criteria) this;
        }

        public Criteria andTypecountIsNull() {
            addCriterion("typeCount is null");
            return (Criteria) this;
        }

        public Criteria andTypecountIsNotNull() {
            addCriterion("typeCount is not null");
            return (Criteria) this;
        }

        public Criteria andTypecountEqualTo(Integer value) {
            addCriterion("typeCount =", value, "typecount");
            return (Criteria) this;
        }

        public Criteria andTypecountNotEqualTo(Integer value) {
            addCriterion("typeCount <>", value, "typecount");
            return (Criteria) this;
        }

        public Criteria andTypecountGreaterThan(Integer value) {
            addCriterion("typeCount >", value, "typecount");
            return (Criteria) this;
        }

        public Criteria andTypecountGreaterThanOrEqualTo(Integer value) {
            addCriterion("typeCount >=", value, "typecount");
            return (Criteria) this;
        }

        public Criteria andTypecountLessThan(Integer value) {
            addCriterion("typeCount <", value, "typecount");
            return (Criteria) this;
        }

        public Criteria andTypecountLessThanOrEqualTo(Integer value) {
            addCriterion("typeCount <=", value, "typecount");
            return (Criteria) this;
        }

        public Criteria andTypecountIn(List<Integer> values) {
            addCriterion("typeCount in", values, "typecount");
            return (Criteria) this;
        }

        public Criteria andTypecountNotIn(List<Integer> values) {
            addCriterion("typeCount not in", values, "typecount");
            return (Criteria) this;
        }

        public Criteria andTypecountBetween(Integer value1, Integer value2) {
            addCriterion("typeCount between", value1, value2, "typecount");
            return (Criteria) this;
        }

        public Criteria andTypecountNotBetween(Integer value1, Integer value2) {
            addCriterion("typeCount not between", value1, value2, "typecount");
            return (Criteria) this;
        }

        public Criteria andIncountIsNull() {
            addCriterion("inCount is null");
            return (Criteria) this;
        }

        public Criteria andIncountIsNotNull() {
            addCriterion("inCount is not null");
            return (Criteria) this;
        }

        public Criteria andIncountEqualTo(Integer value) {
            addCriterion("inCount =", value, "incount");
            return (Criteria) this;
        }

        public Criteria andIncountNotEqualTo(Integer value) {
            addCriterion("inCount <>", value, "incount");
            return (Criteria) this;
        }

        public Criteria andIncountGreaterThan(Integer value) {
            addCriterion("inCount >", value, "incount");
            return (Criteria) this;
        }

        public Criteria andIncountGreaterThanOrEqualTo(Integer value) {
            addCriterion("inCount >=", value, "incount");
            return (Criteria) this;
        }

        public Criteria andIncountLessThan(Integer value) {
            addCriterion("inCount <", value, "incount");
            return (Criteria) this;
        }

        public Criteria andIncountLessThanOrEqualTo(Integer value) {
            addCriterion("inCount <=", value, "incount");
            return (Criteria) this;
        }

        public Criteria andIncountIn(List<Integer> values) {
            addCriterion("inCount in", values, "incount");
            return (Criteria) this;
        }

        public Criteria andIncountNotIn(List<Integer> values) {
            addCriterion("inCount not in", values, "incount");
            return (Criteria) this;
        }

        public Criteria andIncountBetween(Integer value1, Integer value2) {
            addCriterion("inCount between", value1, value2, "incount");
            return (Criteria) this;
        }

        public Criteria andIncountNotBetween(Integer value1, Integer value2) {
            addCriterion("inCount not between", value1, value2, "incount");
            return (Criteria) this;
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

        public Criteria andUsecountIsNull() {
            addCriterion("useCount is null");
            return (Criteria) this;
        }

        public Criteria andUsecountIsNotNull() {
            addCriterion("useCount is not null");
            return (Criteria) this;
        }

        public Criteria andUsecountEqualTo(Integer value) {
            addCriterion("useCount =", value, "usecount");
            return (Criteria) this;
        }

        public Criteria andUsecountNotEqualTo(Integer value) {
            addCriterion("useCount <>", value, "usecount");
            return (Criteria) this;
        }

        public Criteria andUsecountGreaterThan(Integer value) {
            addCriterion("useCount >", value, "usecount");
            return (Criteria) this;
        }

        public Criteria andUsecountGreaterThanOrEqualTo(Integer value) {
            addCriterion("useCount >=", value, "usecount");
            return (Criteria) this;
        }

        public Criteria andUsecountLessThan(Integer value) {
            addCriterion("useCount <", value, "usecount");
            return (Criteria) this;
        }

        public Criteria andUsecountLessThanOrEqualTo(Integer value) {
            addCriterion("useCount <=", value, "usecount");
            return (Criteria) this;
        }

        public Criteria andUsecountIn(List<Integer> values) {
            addCriterion("useCount in", values, "usecount");
            return (Criteria) this;
        }

        public Criteria andUsecountNotIn(List<Integer> values) {
            addCriterion("useCount not in", values, "usecount");
            return (Criteria) this;
        }

        public Criteria andUsecountBetween(Integer value1, Integer value2) {
            addCriterion("useCount between", value1, value2, "usecount");
            return (Criteria) this;
        }

        public Criteria andUsecountNotBetween(Integer value1, Integer value2) {
            addCriterion("useCount not between", value1, value2, "usecount");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
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