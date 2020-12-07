package com.heeexy.example.model;

import java.util.ArrayList;
import java.util.List;

public class WinitRebateMoneyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WinitRebateMoneyExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBusinessdocumentnoIsNull() {
            addCriterion("businessDocumentNo is null");
            return (Criteria) this;
        }

        public Criteria andBusinessdocumentnoIsNotNull() {
            addCriterion("businessDocumentNo is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessdocumentnoEqualTo(String value) {
            addCriterion("businessDocumentNo =", value, "businessdocumentno");
            return (Criteria) this;
        }

        public Criteria andBusinessdocumentnoNotEqualTo(String value) {
            addCriterion("businessDocumentNo <>", value, "businessdocumentno");
            return (Criteria) this;
        }

        public Criteria andBusinessdocumentnoGreaterThan(String value) {
            addCriterion("businessDocumentNo >", value, "businessdocumentno");
            return (Criteria) this;
        }

        public Criteria andBusinessdocumentnoGreaterThanOrEqualTo(String value) {
            addCriterion("businessDocumentNo >=", value, "businessdocumentno");
            return (Criteria) this;
        }

        public Criteria andBusinessdocumentnoLessThan(String value) {
            addCriterion("businessDocumentNo <", value, "businessdocumentno");
            return (Criteria) this;
        }

        public Criteria andBusinessdocumentnoLessThanOrEqualTo(String value) {
            addCriterion("businessDocumentNo <=", value, "businessdocumentno");
            return (Criteria) this;
        }

        public Criteria andBusinessdocumentnoLike(String value) {
            addCriterion("businessDocumentNo like", value, "businessdocumentno");
            return (Criteria) this;
        }

        public Criteria andBusinessdocumentnoNotLike(String value) {
            addCriterion("businessDocumentNo not like", value, "businessdocumentno");
            return (Criteria) this;
        }

        public Criteria andBusinessdocumentnoIn(List<String> values) {
            addCriterion("businessDocumentNo in", values, "businessdocumentno");
            return (Criteria) this;
        }

        public Criteria andBusinessdocumentnoNotIn(List<String> values) {
            addCriterion("businessDocumentNo not in", values, "businessdocumentno");
            return (Criteria) this;
        }

        public Criteria andBusinessdocumentnoBetween(String value1, String value2) {
            addCriterion("businessDocumentNo between", value1, value2, "businessdocumentno");
            return (Criteria) this;
        }

        public Criteria andBusinessdocumentnoNotBetween(String value1, String value2) {
            addCriterion("businessDocumentNo not between", value1, value2, "businessdocumentno");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNull() {
            addCriterion("created is null");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNotNull() {
            addCriterion("created is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedEqualTo(String value) {
            addCriterion("created =", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotEqualTo(String value) {
            addCriterion("created <>", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThan(String value) {
            addCriterion("created >", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThanOrEqualTo(String value) {
            addCriterion("created >=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThan(String value) {
            addCriterion("created <", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThanOrEqualTo(String value) {
            addCriterion("created <=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLike(String value) {
            addCriterion("created like", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotLike(String value) {
            addCriterion("created not like", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedIn(List<String> values) {
            addCriterion("created in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotIn(List<String> values) {
            addCriterion("created not in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedBetween(String value1, String value2) {
            addCriterion("created between", value1, value2, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotBetween(String value1, String value2) {
            addCriterion("created not between", value1, value2, "created");
            return (Criteria) this;
        }

        public Criteria andChargenameIsNull() {
            addCriterion("chargeName is null");
            return (Criteria) this;
        }

        public Criteria andChargenameIsNotNull() {
            addCriterion("chargeName is not null");
            return (Criteria) this;
        }

        public Criteria andChargenameEqualTo(String value) {
            addCriterion("chargeName =", value, "chargename");
            return (Criteria) this;
        }

        public Criteria andChargenameNotEqualTo(String value) {
            addCriterion("chargeName <>", value, "chargename");
            return (Criteria) this;
        }

        public Criteria andChargenameGreaterThan(String value) {
            addCriterion("chargeName >", value, "chargename");
            return (Criteria) this;
        }

        public Criteria andChargenameGreaterThanOrEqualTo(String value) {
            addCriterion("chargeName >=", value, "chargename");
            return (Criteria) this;
        }

        public Criteria andChargenameLessThan(String value) {
            addCriterion("chargeName <", value, "chargename");
            return (Criteria) this;
        }

        public Criteria andChargenameLessThanOrEqualTo(String value) {
            addCriterion("chargeName <=", value, "chargename");
            return (Criteria) this;
        }

        public Criteria andChargenameLike(String value) {
            addCriterion("chargeName like", value, "chargename");
            return (Criteria) this;
        }

        public Criteria andChargenameNotLike(String value) {
            addCriterion("chargeName not like", value, "chargename");
            return (Criteria) this;
        }

        public Criteria andChargenameIn(List<String> values) {
            addCriterion("chargeName in", values, "chargename");
            return (Criteria) this;
        }

        public Criteria andChargenameNotIn(List<String> values) {
            addCriterion("chargeName not in", values, "chargename");
            return (Criteria) this;
        }

        public Criteria andChargenameBetween(String value1, String value2) {
            addCriterion("chargeName between", value1, value2, "chargename");
            return (Criteria) this;
        }

        public Criteria andChargenameNotBetween(String value1, String value2) {
            addCriterion("chargeName not between", value1, value2, "chargename");
            return (Criteria) this;
        }

        public Criteria andChargecodeIsNull() {
            addCriterion("chargeCode is null");
            return (Criteria) this;
        }

        public Criteria andChargecodeIsNotNull() {
            addCriterion("chargeCode is not null");
            return (Criteria) this;
        }

        public Criteria andChargecodeEqualTo(Integer value) {
            addCriterion("chargeCode =", value, "chargecode");
            return (Criteria) this;
        }

        public Criteria andChargecodeNotEqualTo(Integer value) {
            addCriterion("chargeCode <>", value, "chargecode");
            return (Criteria) this;
        }

        public Criteria andChargecodeGreaterThan(Integer value) {
            addCriterion("chargeCode >", value, "chargecode");
            return (Criteria) this;
        }

        public Criteria andChargecodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("chargeCode >=", value, "chargecode");
            return (Criteria) this;
        }

        public Criteria andChargecodeLessThan(Integer value) {
            addCriterion("chargeCode <", value, "chargecode");
            return (Criteria) this;
        }

        public Criteria andChargecodeLessThanOrEqualTo(Integer value) {
            addCriterion("chargeCode <=", value, "chargecode");
            return (Criteria) this;
        }

        public Criteria andChargecodeIn(List<Integer> values) {
            addCriterion("chargeCode in", values, "chargecode");
            return (Criteria) this;
        }

        public Criteria andChargecodeNotIn(List<Integer> values) {
            addCriterion("chargeCode not in", values, "chargecode");
            return (Criteria) this;
        }

        public Criteria andChargecodeBetween(Integer value1, Integer value2) {
            addCriterion("chargeCode between", value1, value2, "chargecode");
            return (Criteria) this;
        }

        public Criteria andChargecodeNotBetween(Integer value1, Integer value2) {
            addCriterion("chargeCode not between", value1, value2, "chargecode");
            return (Criteria) this;
        }

        public Criteria andSourceamtIsNull() {
            addCriterion("sourceAmt is null");
            return (Criteria) this;
        }

        public Criteria andSourceamtIsNotNull() {
            addCriterion("sourceAmt is not null");
            return (Criteria) this;
        }

        public Criteria andSourceamtEqualTo(Double value) {
            addCriterion("sourceAmt =", value, "sourceamt");
            return (Criteria) this;
        }

        public Criteria andSourceamtNotEqualTo(Double value) {
            addCriterion("sourceAmt <>", value, "sourceamt");
            return (Criteria) this;
        }

        public Criteria andSourceamtGreaterThan(Double value) {
            addCriterion("sourceAmt >", value, "sourceamt");
            return (Criteria) this;
        }

        public Criteria andSourceamtGreaterThanOrEqualTo(Double value) {
            addCriterion("sourceAmt >=", value, "sourceamt");
            return (Criteria) this;
        }

        public Criteria andSourceamtLessThan(Double value) {
            addCriterion("sourceAmt <", value, "sourceamt");
            return (Criteria) this;
        }

        public Criteria andSourceamtLessThanOrEqualTo(Double value) {
            addCriterion("sourceAmt <=", value, "sourceamt");
            return (Criteria) this;
        }

        public Criteria andSourceamtIn(List<Double> values) {
            addCriterion("sourceAmt in", values, "sourceamt");
            return (Criteria) this;
        }

        public Criteria andSourceamtNotIn(List<Double> values) {
            addCriterion("sourceAmt not in", values, "sourceamt");
            return (Criteria) this;
        }

        public Criteria andSourceamtBetween(Double value1, Double value2) {
            addCriterion("sourceAmt between", value1, value2, "sourceamt");
            return (Criteria) this;
        }

        public Criteria andSourceamtNotBetween(Double value1, Double value2) {
            addCriterion("sourceAmt not between", value1, value2, "sourceamt");
            return (Criteria) this;
        }

        public Criteria andSourcecurrencyIsNull() {
            addCriterion("sourceCurrency is null");
            return (Criteria) this;
        }

        public Criteria andSourcecurrencyIsNotNull() {
            addCriterion("sourceCurrency is not null");
            return (Criteria) this;
        }

        public Criteria andSourcecurrencyEqualTo(String value) {
            addCriterion("sourceCurrency =", value, "sourcecurrency");
            return (Criteria) this;
        }

        public Criteria andSourcecurrencyNotEqualTo(String value) {
            addCriterion("sourceCurrency <>", value, "sourcecurrency");
            return (Criteria) this;
        }

        public Criteria andSourcecurrencyGreaterThan(String value) {
            addCriterion("sourceCurrency >", value, "sourcecurrency");
            return (Criteria) this;
        }

        public Criteria andSourcecurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("sourceCurrency >=", value, "sourcecurrency");
            return (Criteria) this;
        }

        public Criteria andSourcecurrencyLessThan(String value) {
            addCriterion("sourceCurrency <", value, "sourcecurrency");
            return (Criteria) this;
        }

        public Criteria andSourcecurrencyLessThanOrEqualTo(String value) {
            addCriterion("sourceCurrency <=", value, "sourcecurrency");
            return (Criteria) this;
        }

        public Criteria andSourcecurrencyLike(String value) {
            addCriterion("sourceCurrency like", value, "sourcecurrency");
            return (Criteria) this;
        }

        public Criteria andSourcecurrencyNotLike(String value) {
            addCriterion("sourceCurrency not like", value, "sourcecurrency");
            return (Criteria) this;
        }

        public Criteria andSourcecurrencyIn(List<String> values) {
            addCriterion("sourceCurrency in", values, "sourcecurrency");
            return (Criteria) this;
        }

        public Criteria andSourcecurrencyNotIn(List<String> values) {
            addCriterion("sourceCurrency not in", values, "sourcecurrency");
            return (Criteria) this;
        }

        public Criteria andSourcecurrencyBetween(String value1, String value2) {
            addCriterion("sourceCurrency between", value1, value2, "sourcecurrency");
            return (Criteria) this;
        }

        public Criteria andSourcecurrencyNotBetween(String value1, String value2) {
            addCriterion("sourceCurrency not between", value1, value2, "sourcecurrency");
            return (Criteria) this;
        }

        public Criteria andChargeweightIsNull() {
            addCriterion("chargeWeight is null");
            return (Criteria) this;
        }

        public Criteria andChargeweightIsNotNull() {
            addCriterion("chargeWeight is not null");
            return (Criteria) this;
        }

        public Criteria andChargeweightEqualTo(Double value) {
            addCriterion("chargeWeight =", value, "chargeweight");
            return (Criteria) this;
        }

        public Criteria andChargeweightNotEqualTo(Double value) {
            addCriterion("chargeWeight <>", value, "chargeweight");
            return (Criteria) this;
        }

        public Criteria andChargeweightGreaterThan(Double value) {
            addCriterion("chargeWeight >", value, "chargeweight");
            return (Criteria) this;
        }

        public Criteria andChargeweightGreaterThanOrEqualTo(Double value) {
            addCriterion("chargeWeight >=", value, "chargeweight");
            return (Criteria) this;
        }

        public Criteria andChargeweightLessThan(Double value) {
            addCriterion("chargeWeight <", value, "chargeweight");
            return (Criteria) this;
        }

        public Criteria andChargeweightLessThanOrEqualTo(Double value) {
            addCriterion("chargeWeight <=", value, "chargeweight");
            return (Criteria) this;
        }

        public Criteria andChargeweightIn(List<Double> values) {
            addCriterion("chargeWeight in", values, "chargeweight");
            return (Criteria) this;
        }

        public Criteria andChargeweightNotIn(List<Double> values) {
            addCriterion("chargeWeight not in", values, "chargeweight");
            return (Criteria) this;
        }

        public Criteria andChargeweightBetween(Double value1, Double value2) {
            addCriterion("chargeWeight between", value1, value2, "chargeweight");
            return (Criteria) this;
        }

        public Criteria andChargeweightNotBetween(Double value1, Double value2) {
            addCriterion("chargeWeight not between", value1, value2, "chargeweight");
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