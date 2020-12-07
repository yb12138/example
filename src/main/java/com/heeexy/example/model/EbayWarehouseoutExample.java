package com.heeexy.example.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EbayWarehouseoutExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EbayWarehouseoutExample() {
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

        public Criteria andEbaywarehouseidIsNull() {
            addCriterion("ebaywarehouseID is null");
            return (Criteria) this;
        }

        public Criteria andEbaywarehouseidIsNotNull() {
            addCriterion("ebaywarehouseID is not null");
            return (Criteria) this;
        }

        public Criteria andEbaywarehouseidEqualTo(Integer value) {
            addCriterion("ebaywarehouseID =", value, "ebaywarehouseid");
            return (Criteria) this;
        }

        public Criteria andEbaywarehouseidNotEqualTo(Integer value) {
            addCriterion("ebaywarehouseID <>", value, "ebaywarehouseid");
            return (Criteria) this;
        }

        public Criteria andEbaywarehouseidGreaterThan(Integer value) {
            addCriterion("ebaywarehouseID >", value, "ebaywarehouseid");
            return (Criteria) this;
        }

        public Criteria andEbaywarehouseidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ebaywarehouseID >=", value, "ebaywarehouseid");
            return (Criteria) this;
        }

        public Criteria andEbaywarehouseidLessThan(Integer value) {
            addCriterion("ebaywarehouseID <", value, "ebaywarehouseid");
            return (Criteria) this;
        }

        public Criteria andEbaywarehouseidLessThanOrEqualTo(Integer value) {
            addCriterion("ebaywarehouseID <=", value, "ebaywarehouseid");
            return (Criteria) this;
        }

        public Criteria andEbaywarehouseidIn(List<Integer> values) {
            addCriterion("ebaywarehouseID in", values, "ebaywarehouseid");
            return (Criteria) this;
        }

        public Criteria andEbaywarehouseidNotIn(List<Integer> values) {
            addCriterion("ebaywarehouseID not in", values, "ebaywarehouseid");
            return (Criteria) this;
        }

        public Criteria andEbaywarehouseidBetween(Integer value1, Integer value2) {
            addCriterion("ebaywarehouseID between", value1, value2, "ebaywarehouseid");
            return (Criteria) this;
        }

        public Criteria andEbaywarehouseidNotBetween(Integer value1, Integer value2) {
            addCriterion("ebaywarehouseID not between", value1, value2, "ebaywarehouseid");
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

        public Criteria andOutidIsNull() {
            addCriterion("outID is null");
            return (Criteria) this;
        }

        public Criteria andOutidIsNotNull() {
            addCriterion("outID is not null");
            return (Criteria) this;
        }

        public Criteria andOutidEqualTo(Integer value) {
            addCriterion("outID =", value, "outid");
            return (Criteria) this;
        }

        public Criteria andOutidNotEqualTo(Integer value) {
            addCriterion("outID <>", value, "outid");
            return (Criteria) this;
        }

        public Criteria andOutidGreaterThan(Integer value) {
            addCriterion("outID >", value, "outid");
            return (Criteria) this;
        }

        public Criteria andOutidGreaterThanOrEqualTo(Integer value) {
            addCriterion("outID >=", value, "outid");
            return (Criteria) this;
        }

        public Criteria andOutidLessThan(Integer value) {
            addCriterion("outID <", value, "outid");
            return (Criteria) this;
        }

        public Criteria andOutidLessThanOrEqualTo(Integer value) {
            addCriterion("outID <=", value, "outid");
            return (Criteria) this;
        }

        public Criteria andOutidIn(List<Integer> values) {
            addCriterion("outID in", values, "outid");
            return (Criteria) this;
        }

        public Criteria andOutidNotIn(List<Integer> values) {
            addCriterion("outID not in", values, "outid");
            return (Criteria) this;
        }

        public Criteria andOutidBetween(Integer value1, Integer value2) {
            addCriterion("outID between", value1, value2, "outid");
            return (Criteria) this;
        }

        public Criteria andOutidNotBetween(Integer value1, Integer value2) {
            addCriterion("outID not between", value1, value2, "outid");
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

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andWowsidIsNull() {
            addCriterion("wowsID is null");
            return (Criteria) this;
        }

        public Criteria andWowsidIsNotNull() {
            addCriterion("wowsID is not null");
            return (Criteria) this;
        }

        public Criteria andWowsidEqualTo(Integer value) {
            addCriterion("wowsID =", value, "wowsid");
            return (Criteria) this;
        }

        public Criteria andWowsidNotEqualTo(Integer value) {
            addCriterion("wowsID <>", value, "wowsid");
            return (Criteria) this;
        }

        public Criteria andWowsidGreaterThan(Integer value) {
            addCriterion("wowsID >", value, "wowsid");
            return (Criteria) this;
        }

        public Criteria andWowsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("wowsID >=", value, "wowsid");
            return (Criteria) this;
        }

        public Criteria andWowsidLessThan(Integer value) {
            addCriterion("wowsID <", value, "wowsid");
            return (Criteria) this;
        }

        public Criteria andWowsidLessThanOrEqualTo(Integer value) {
            addCriterion("wowsID <=", value, "wowsid");
            return (Criteria) this;
        }

        public Criteria andWowsidIn(List<Integer> values) {
            addCriterion("wowsID in", values, "wowsid");
            return (Criteria) this;
        }

        public Criteria andWowsidNotIn(List<Integer> values) {
            addCriterion("wowsID not in", values, "wowsid");
            return (Criteria) this;
        }

        public Criteria andWowsidBetween(Integer value1, Integer value2) {
            addCriterion("wowsID between", value1, value2, "wowsid");
            return (Criteria) this;
        }

        public Criteria andWowsidNotBetween(Integer value1, Integer value2) {
            addCriterion("wowsID not between", value1, value2, "wowsid");
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