package com.heeexy.example.model;

import java.util.ArrayList;
import java.util.List;

public class FinanceReceiptSkuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FinanceReceiptSkuExample() {
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

        public Criteria andReceiptskuidIsNull() {
            addCriterion("receiptSkuID is null");
            return (Criteria) this;
        }

        public Criteria andReceiptskuidIsNotNull() {
            addCriterion("receiptSkuID is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptskuidEqualTo(Integer value) {
            addCriterion("receiptSkuID =", value, "receiptskuid");
            return (Criteria) this;
        }

        public Criteria andReceiptskuidNotEqualTo(Integer value) {
            addCriterion("receiptSkuID <>", value, "receiptskuid");
            return (Criteria) this;
        }

        public Criteria andReceiptskuidGreaterThan(Integer value) {
            addCriterion("receiptSkuID >", value, "receiptskuid");
            return (Criteria) this;
        }

        public Criteria andReceiptskuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("receiptSkuID >=", value, "receiptskuid");
            return (Criteria) this;
        }

        public Criteria andReceiptskuidLessThan(Integer value) {
            addCriterion("receiptSkuID <", value, "receiptskuid");
            return (Criteria) this;
        }

        public Criteria andReceiptskuidLessThanOrEqualTo(Integer value) {
            addCriterion("receiptSkuID <=", value, "receiptskuid");
            return (Criteria) this;
        }

        public Criteria andReceiptskuidIn(List<Integer> values) {
            addCriterion("receiptSkuID in", values, "receiptskuid");
            return (Criteria) this;
        }

        public Criteria andReceiptskuidNotIn(List<Integer> values) {
            addCriterion("receiptSkuID not in", values, "receiptskuid");
            return (Criteria) this;
        }

        public Criteria andReceiptskuidBetween(Integer value1, Integer value2) {
            addCriterion("receiptSkuID between", value1, value2, "receiptskuid");
            return (Criteria) this;
        }

        public Criteria andReceiptskuidNotBetween(Integer value1, Integer value2) {
            addCriterion("receiptSkuID not between", value1, value2, "receiptskuid");
            return (Criteria) this;
        }

        public Criteria andReceiptidIsNull() {
            addCriterion("receiptID is null");
            return (Criteria) this;
        }

        public Criteria andReceiptidIsNotNull() {
            addCriterion("receiptID is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptidEqualTo(Integer value) {
            addCriterion("receiptID =", value, "receiptid");
            return (Criteria) this;
        }

        public Criteria andReceiptidNotEqualTo(Integer value) {
            addCriterion("receiptID <>", value, "receiptid");
            return (Criteria) this;
        }

        public Criteria andReceiptidGreaterThan(Integer value) {
            addCriterion("receiptID >", value, "receiptid");
            return (Criteria) this;
        }

        public Criteria andReceiptidGreaterThanOrEqualTo(Integer value) {
            addCriterion("receiptID >=", value, "receiptid");
            return (Criteria) this;
        }

        public Criteria andReceiptidLessThan(Integer value) {
            addCriterion("receiptID <", value, "receiptid");
            return (Criteria) this;
        }

        public Criteria andReceiptidLessThanOrEqualTo(Integer value) {
            addCriterion("receiptID <=", value, "receiptid");
            return (Criteria) this;
        }

        public Criteria andReceiptidIn(List<Integer> values) {
            addCriterion("receiptID in", values, "receiptid");
            return (Criteria) this;
        }

        public Criteria andReceiptidNotIn(List<Integer> values) {
            addCriterion("receiptID not in", values, "receiptid");
            return (Criteria) this;
        }

        public Criteria andReceiptidBetween(Integer value1, Integer value2) {
            addCriterion("receiptID between", value1, value2, "receiptid");
            return (Criteria) this;
        }

        public Criteria andReceiptidNotBetween(Integer value1, Integer value2) {
            addCriterion("receiptID not between", value1, value2, "receiptid");
            return (Criteria) this;
        }

        public Criteria andReceiptnumIsNull() {
            addCriterion("receiptNum is null");
            return (Criteria) this;
        }

        public Criteria andReceiptnumIsNotNull() {
            addCriterion("receiptNum is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptnumEqualTo(String value) {
            addCriterion("receiptNum =", value, "receiptnum");
            return (Criteria) this;
        }

        public Criteria andReceiptnumNotEqualTo(String value) {
            addCriterion("receiptNum <>", value, "receiptnum");
            return (Criteria) this;
        }

        public Criteria andReceiptnumGreaterThan(String value) {
            addCriterion("receiptNum >", value, "receiptnum");
            return (Criteria) this;
        }

        public Criteria andReceiptnumGreaterThanOrEqualTo(String value) {
            addCriterion("receiptNum >=", value, "receiptnum");
            return (Criteria) this;
        }

        public Criteria andReceiptnumLessThan(String value) {
            addCriterion("receiptNum <", value, "receiptnum");
            return (Criteria) this;
        }

        public Criteria andReceiptnumLessThanOrEqualTo(String value) {
            addCriterion("receiptNum <=", value, "receiptnum");
            return (Criteria) this;
        }

        public Criteria andReceiptnumLike(String value) {
            addCriterion("receiptNum like", value, "receiptnum");
            return (Criteria) this;
        }

        public Criteria andReceiptnumNotLike(String value) {
            addCriterion("receiptNum not like", value, "receiptnum");
            return (Criteria) this;
        }

        public Criteria andReceiptnumIn(List<String> values) {
            addCriterion("receiptNum in", values, "receiptnum");
            return (Criteria) this;
        }

        public Criteria andReceiptnumNotIn(List<String> values) {
            addCriterion("receiptNum not in", values, "receiptnum");
            return (Criteria) this;
        }

        public Criteria andReceiptnumBetween(String value1, String value2) {
            addCriterion("receiptNum between", value1, value2, "receiptnum");
            return (Criteria) this;
        }

        public Criteria andReceiptnumNotBetween(String value1, String value2) {
            addCriterion("receiptNum not between", value1, value2, "receiptnum");
            return (Criteria) this;
        }

        public Criteria andOutquantityIsNull() {
            addCriterion("outQuantity is null");
            return (Criteria) this;
        }

        public Criteria andOutquantityIsNotNull() {
            addCriterion("outQuantity is not null");
            return (Criteria) this;
        }

        public Criteria andOutquantityEqualTo(Integer value) {
            addCriterion("outQuantity =", value, "outquantity");
            return (Criteria) this;
        }

        public Criteria andOutquantityNotEqualTo(Integer value) {
            addCriterion("outQuantity <>", value, "outquantity");
            return (Criteria) this;
        }

        public Criteria andOutquantityGreaterThan(Integer value) {
            addCriterion("outQuantity >", value, "outquantity");
            return (Criteria) this;
        }

        public Criteria andOutquantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("outQuantity >=", value, "outquantity");
            return (Criteria) this;
        }

        public Criteria andOutquantityLessThan(Integer value) {
            addCriterion("outQuantity <", value, "outquantity");
            return (Criteria) this;
        }

        public Criteria andOutquantityLessThanOrEqualTo(Integer value) {
            addCriterion("outQuantity <=", value, "outquantity");
            return (Criteria) this;
        }

        public Criteria andOutquantityIn(List<Integer> values) {
            addCriterion("outQuantity in", values, "outquantity");
            return (Criteria) this;
        }

        public Criteria andOutquantityNotIn(List<Integer> values) {
            addCriterion("outQuantity not in", values, "outquantity");
            return (Criteria) this;
        }

        public Criteria andOutquantityBetween(Integer value1, Integer value2) {
            addCriterion("outQuantity between", value1, value2, "outquantity");
            return (Criteria) this;
        }

        public Criteria andOutquantityNotBetween(Integer value1, Integer value2) {
            addCriterion("outQuantity not between", value1, value2, "outquantity");
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

        public Criteria andPurchaseskuidIsNull() {
            addCriterion("purchaseSkuID is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseskuidIsNotNull() {
            addCriterion("purchaseSkuID is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseskuidEqualTo(Integer value) {
            addCriterion("purchaseSkuID =", value, "purchaseskuid");
            return (Criteria) this;
        }

        public Criteria andPurchaseskuidNotEqualTo(Integer value) {
            addCriterion("purchaseSkuID <>", value, "purchaseskuid");
            return (Criteria) this;
        }

        public Criteria andPurchaseskuidGreaterThan(Integer value) {
            addCriterion("purchaseSkuID >", value, "purchaseskuid");
            return (Criteria) this;
        }

        public Criteria andPurchaseskuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("purchaseSkuID >=", value, "purchaseskuid");
            return (Criteria) this;
        }

        public Criteria andPurchaseskuidLessThan(Integer value) {
            addCriterion("purchaseSkuID <", value, "purchaseskuid");
            return (Criteria) this;
        }

        public Criteria andPurchaseskuidLessThanOrEqualTo(Integer value) {
            addCriterion("purchaseSkuID <=", value, "purchaseskuid");
            return (Criteria) this;
        }

        public Criteria andPurchaseskuidIn(List<Integer> values) {
            addCriterion("purchaseSkuID in", values, "purchaseskuid");
            return (Criteria) this;
        }

        public Criteria andPurchaseskuidNotIn(List<Integer> values) {
            addCriterion("purchaseSkuID not in", values, "purchaseskuid");
            return (Criteria) this;
        }

        public Criteria andPurchaseskuidBetween(Integer value1, Integer value2) {
            addCriterion("purchaseSkuID between", value1, value2, "purchaseskuid");
            return (Criteria) this;
        }

        public Criteria andPurchaseskuidNotBetween(Integer value1, Integer value2) {
            addCriterion("purchaseSkuID not between", value1, value2, "purchaseskuid");
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