package com.heeexy.example.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WarehouseOutWarrantSkuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WarehouseOutWarrantSkuExample() {
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

        public Criteria andOutcountIsNull() {
            addCriterion("outCount is null");
            return (Criteria) this;
        }

        public Criteria andOutcountIsNotNull() {
            addCriterion("outCount is not null");
            return (Criteria) this;
        }

        public Criteria andOutcountEqualTo(Integer value) {
            addCriterion("outCount =", value, "outcount");
            return (Criteria) this;
        }

        public Criteria andOutcountNotEqualTo(Integer value) {
            addCriterion("outCount <>", value, "outcount");
            return (Criteria) this;
        }

        public Criteria andOutcountGreaterThan(Integer value) {
            addCriterion("outCount >", value, "outcount");
            return (Criteria) this;
        }

        public Criteria andOutcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("outCount >=", value, "outcount");
            return (Criteria) this;
        }

        public Criteria andOutcountLessThan(Integer value) {
            addCriterion("outCount <", value, "outcount");
            return (Criteria) this;
        }

        public Criteria andOutcountLessThanOrEqualTo(Integer value) {
            addCriterion("outCount <=", value, "outcount");
            return (Criteria) this;
        }

        public Criteria andOutcountIn(List<Integer> values) {
            addCriterion("outCount in", values, "outcount");
            return (Criteria) this;
        }

        public Criteria andOutcountNotIn(List<Integer> values) {
            addCriterion("outCount not in", values, "outcount");
            return (Criteria) this;
        }

        public Criteria andOutcountBetween(Integer value1, Integer value2) {
            addCriterion("outCount between", value1, value2, "outcount");
            return (Criteria) this;
        }

        public Criteria andOutcountNotBetween(Integer value1, Integer value2) {
            addCriterion("outCount not between", value1, value2, "outcount");
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

        public Criteria andInskuidIsNull() {
            addCriterion("inSkuID is null");
            return (Criteria) this;
        }

        public Criteria andInskuidIsNotNull() {
            addCriterion("inSkuID is not null");
            return (Criteria) this;
        }

        public Criteria andInskuidEqualTo(Integer value) {
            addCriterion("inSkuID =", value, "inskuid");
            return (Criteria) this;
        }

        public Criteria andInskuidNotEqualTo(Integer value) {
            addCriterion("inSkuID <>", value, "inskuid");
            return (Criteria) this;
        }

        public Criteria andInskuidGreaterThan(Integer value) {
            addCriterion("inSkuID >", value, "inskuid");
            return (Criteria) this;
        }

        public Criteria andInskuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("inSkuID >=", value, "inskuid");
            return (Criteria) this;
        }

        public Criteria andInskuidLessThan(Integer value) {
            addCriterion("inSkuID <", value, "inskuid");
            return (Criteria) this;
        }

        public Criteria andInskuidLessThanOrEqualTo(Integer value) {
            addCriterion("inSkuID <=", value, "inskuid");
            return (Criteria) this;
        }

        public Criteria andInskuidIn(List<Integer> values) {
            addCriterion("inSkuID in", values, "inskuid");
            return (Criteria) this;
        }

        public Criteria andInskuidNotIn(List<Integer> values) {
            addCriterion("inSkuID not in", values, "inskuid");
            return (Criteria) this;
        }

        public Criteria andInskuidBetween(Integer value1, Integer value2) {
            addCriterion("inSkuID between", value1, value2, "inskuid");
            return (Criteria) this;
        }

        public Criteria andInskuidNotBetween(Integer value1, Integer value2) {
            addCriterion("inSkuID not between", value1, value2, "inskuid");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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