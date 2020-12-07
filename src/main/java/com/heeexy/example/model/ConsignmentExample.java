package com.heeexy.example.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ConsignmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ConsignmentExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDeliveryServiceIdIsNull() {
            addCriterion("delivery_service_id is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryServiceIdIsNotNull() {
            addCriterion("delivery_service_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryServiceIdEqualTo(Integer value) {
            addCriterion("delivery_service_id =", value, "deliveryServiceId");
            return (Criteria) this;
        }

        public Criteria andDeliveryServiceIdNotEqualTo(Integer value) {
            addCriterion("delivery_service_id <>", value, "deliveryServiceId");
            return (Criteria) this;
        }

        public Criteria andDeliveryServiceIdGreaterThan(Integer value) {
            addCriterion("delivery_service_id >", value, "deliveryServiceId");
            return (Criteria) this;
        }

        public Criteria andDeliveryServiceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("delivery_service_id >=", value, "deliveryServiceId");
            return (Criteria) this;
        }

        public Criteria andDeliveryServiceIdLessThan(Integer value) {
            addCriterion("delivery_service_id <", value, "deliveryServiceId");
            return (Criteria) this;
        }

        public Criteria andDeliveryServiceIdLessThanOrEqualTo(Integer value) {
            addCriterion("delivery_service_id <=", value, "deliveryServiceId");
            return (Criteria) this;
        }

        public Criteria andDeliveryServiceIdIn(List<Integer> values) {
            addCriterion("delivery_service_id in", values, "deliveryServiceId");
            return (Criteria) this;
        }

        public Criteria andDeliveryServiceIdNotIn(List<Integer> values) {
            addCriterion("delivery_service_id not in", values, "deliveryServiceId");
            return (Criteria) this;
        }

        public Criteria andDeliveryServiceIdBetween(Integer value1, Integer value2) {
            addCriterion("delivery_service_id between", value1, value2, "deliveryServiceId");
            return (Criteria) this;
        }

        public Criteria andDeliveryServiceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("delivery_service_id not between", value1, value2, "deliveryServiceId");
            return (Criteria) this;
        }

        public Criteria andSalesReferenceIsNull() {
            addCriterion("sales_reference is null");
            return (Criteria) this;
        }

        public Criteria andSalesReferenceIsNotNull() {
            addCriterion("sales_reference is not null");
            return (Criteria) this;
        }

        public Criteria andSalesReferenceEqualTo(String value) {
            addCriterion("sales_reference =", value, "salesReference");
            return (Criteria) this;
        }

        public Criteria andSalesReferenceNotEqualTo(String value) {
            addCriterion("sales_reference <>", value, "salesReference");
            return (Criteria) this;
        }

        public Criteria andSalesReferenceGreaterThan(String value) {
            addCriterion("sales_reference >", value, "salesReference");
            return (Criteria) this;
        }

        public Criteria andSalesReferenceGreaterThanOrEqualTo(String value) {
            addCriterion("sales_reference >=", value, "salesReference");
            return (Criteria) this;
        }

        public Criteria andSalesReferenceLessThan(String value) {
            addCriterion("sales_reference <", value, "salesReference");
            return (Criteria) this;
        }

        public Criteria andSalesReferenceLessThanOrEqualTo(String value) {
            addCriterion("sales_reference <=", value, "salesReference");
            return (Criteria) this;
        }

        public Criteria andSalesReferenceLike(String value) {
            addCriterion("sales_reference like", value, "salesReference");
            return (Criteria) this;
        }

        public Criteria andSalesReferenceNotLike(String value) {
            addCriterion("sales_reference not like", value, "salesReference");
            return (Criteria) this;
        }

        public Criteria andSalesReferenceIn(List<String> values) {
            addCriterion("sales_reference in", values, "salesReference");
            return (Criteria) this;
        }

        public Criteria andSalesReferenceNotIn(List<String> values) {
            addCriterion("sales_reference not in", values, "salesReference");
            return (Criteria) this;
        }

        public Criteria andSalesReferenceBetween(String value1, String value2) {
            addCriterion("sales_reference between", value1, value2, "salesReference");
            return (Criteria) this;
        }

        public Criteria andSalesReferenceNotBetween(String value1, String value2) {
            addCriterion("sales_reference not between", value1, value2, "salesReference");
            return (Criteria) this;
        }

        public Criteria andPaymentReferenceIsNull() {
            addCriterion("payment_reference is null");
            return (Criteria) this;
        }

        public Criteria andPaymentReferenceIsNotNull() {
            addCriterion("payment_reference is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentReferenceEqualTo(String value) {
            addCriterion("payment_reference =", value, "paymentReference");
            return (Criteria) this;
        }

        public Criteria andPaymentReferenceNotEqualTo(String value) {
            addCriterion("payment_reference <>", value, "paymentReference");
            return (Criteria) this;
        }

        public Criteria andPaymentReferenceGreaterThan(String value) {
            addCriterion("payment_reference >", value, "paymentReference");
            return (Criteria) this;
        }

        public Criteria andPaymentReferenceGreaterThanOrEqualTo(String value) {
            addCriterion("payment_reference >=", value, "paymentReference");
            return (Criteria) this;
        }

        public Criteria andPaymentReferenceLessThan(String value) {
            addCriterion("payment_reference <", value, "paymentReference");
            return (Criteria) this;
        }

        public Criteria andPaymentReferenceLessThanOrEqualTo(String value) {
            addCriterion("payment_reference <=", value, "paymentReference");
            return (Criteria) this;
        }

        public Criteria andPaymentReferenceLike(String value) {
            addCriterion("payment_reference like", value, "paymentReference");
            return (Criteria) this;
        }

        public Criteria andPaymentReferenceNotLike(String value) {
            addCriterion("payment_reference not like", value, "paymentReference");
            return (Criteria) this;
        }

        public Criteria andPaymentReferenceIn(List<String> values) {
            addCriterion("payment_reference in", values, "paymentReference");
            return (Criteria) this;
        }

        public Criteria andPaymentReferenceNotIn(List<String> values) {
            addCriterion("payment_reference not in", values, "paymentReference");
            return (Criteria) this;
        }

        public Criteria andPaymentReferenceBetween(String value1, String value2) {
            addCriterion("payment_reference between", value1, value2, "paymentReference");
            return (Criteria) this;
        }

        public Criteria andPaymentReferenceNotBetween(String value1, String value2) {
            addCriterion("payment_reference not between", value1, value2, "paymentReference");
            return (Criteria) this;
        }

        public Criteria andDeliveryReferenceIsNull() {
            addCriterion("delivery_reference is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryReferenceIsNotNull() {
            addCriterion("delivery_reference is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryReferenceEqualTo(String value) {
            addCriterion("delivery_reference =", value, "deliveryReference");
            return (Criteria) this;
        }

        public Criteria andDeliveryReferenceNotEqualTo(String value) {
            addCriterion("delivery_reference <>", value, "deliveryReference");
            return (Criteria) this;
        }

        public Criteria andDeliveryReferenceGreaterThan(String value) {
            addCriterion("delivery_reference >", value, "deliveryReference");
            return (Criteria) this;
        }

        public Criteria andDeliveryReferenceGreaterThanOrEqualTo(String value) {
            addCriterion("delivery_reference >=", value, "deliveryReference");
            return (Criteria) this;
        }

        public Criteria andDeliveryReferenceLessThan(String value) {
            addCriterion("delivery_reference <", value, "deliveryReference");
            return (Criteria) this;
        }

        public Criteria andDeliveryReferenceLessThanOrEqualTo(String value) {
            addCriterion("delivery_reference <=", value, "deliveryReference");
            return (Criteria) this;
        }

        public Criteria andDeliveryReferenceLike(String value) {
            addCriterion("delivery_reference like", value, "deliveryReference");
            return (Criteria) this;
        }

        public Criteria andDeliveryReferenceNotLike(String value) {
            addCriterion("delivery_reference not like", value, "deliveryReference");
            return (Criteria) this;
        }

        public Criteria andDeliveryReferenceIn(List<String> values) {
            addCriterion("delivery_reference in", values, "deliveryReference");
            return (Criteria) this;
        }

        public Criteria andDeliveryReferenceNotIn(List<String> values) {
            addCriterion("delivery_reference not in", values, "deliveryReference");
            return (Criteria) this;
        }

        public Criteria andDeliveryReferenceBetween(String value1, String value2) {
            addCriterion("delivery_reference between", value1, value2, "deliveryReference");
            return (Criteria) this;
        }

        public Criteria andDeliveryReferenceNotBetween(String value1, String value2) {
            addCriterion("delivery_reference not between", value1, value2, "deliveryReference");
            return (Criteria) this;
        }

        public Criteria andArriveTimeIsNull() {
            addCriterion("arrive_time is null");
            return (Criteria) this;
        }

        public Criteria andArriveTimeIsNotNull() {
            addCriterion("arrive_time is not null");
            return (Criteria) this;
        }

        public Criteria andArriveTimeEqualTo(Date value) {
            addCriterion("arrive_time =", value, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeNotEqualTo(Date value) {
            addCriterion("arrive_time <>", value, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeGreaterThan(Date value) {
            addCriterion("arrive_time >", value, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("arrive_time >=", value, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeLessThan(Date value) {
            addCriterion("arrive_time <", value, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeLessThanOrEqualTo(Date value) {
            addCriterion("arrive_time <=", value, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeIn(List<Date> values) {
            addCriterion("arrive_time in", values, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeNotIn(List<Date> values) {
            addCriterion("arrive_time not in", values, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeBetween(Date value1, Date value2) {
            addCriterion("arrive_time between", value1, value2, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeNotBetween(Date value1, Date value2) {
            addCriterion("arrive_time not between", value1, value2, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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

        public Criteria andCurrencyCodeIsNull() {
            addCriterion("currency_code is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeIsNotNull() {
            addCriterion("currency_code is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeEqualTo(String value) {
            addCriterion("currency_code =", value, "currencyCode");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeNotEqualTo(String value) {
            addCriterion("currency_code <>", value, "currencyCode");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeGreaterThan(String value) {
            addCriterion("currency_code >", value, "currencyCode");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("currency_code >=", value, "currencyCode");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeLessThan(String value) {
            addCriterion("currency_code <", value, "currencyCode");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeLessThanOrEqualTo(String value) {
            addCriterion("currency_code <=", value, "currencyCode");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeLike(String value) {
            addCriterion("currency_code like", value, "currencyCode");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeNotLike(String value) {
            addCriterion("currency_code not like", value, "currencyCode");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeIn(List<String> values) {
            addCriterion("currency_code in", values, "currencyCode");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeNotIn(List<String> values) {
            addCriterion("currency_code not in", values, "currencyCode");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeBetween(String value1, String value2) {
            addCriterion("currency_code between", value1, value2, "currencyCode");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeNotBetween(String value1, String value2) {
            addCriterion("currency_code not between", value1, value2, "currencyCode");
            return (Criteria) this;
        }

        public Criteria andProductClientRefIsNull() {
            addCriterion("product_client_ref is null");
            return (Criteria) this;
        }

        public Criteria andProductClientRefIsNotNull() {
            addCriterion("product_client_ref is not null");
            return (Criteria) this;
        }

        public Criteria andProductClientRefEqualTo(String value) {
            addCriterion("product_client_ref =", value, "productClientRef");
            return (Criteria) this;
        }

        public Criteria andProductClientRefNotEqualTo(String value) {
            addCriterion("product_client_ref <>", value, "productClientRef");
            return (Criteria) this;
        }

        public Criteria andProductClientRefGreaterThan(String value) {
            addCriterion("product_client_ref >", value, "productClientRef");
            return (Criteria) this;
        }

        public Criteria andProductClientRefGreaterThanOrEqualTo(String value) {
            addCriterion("product_client_ref >=", value, "productClientRef");
            return (Criteria) this;
        }

        public Criteria andProductClientRefLessThan(String value) {
            addCriterion("product_client_ref <", value, "productClientRef");
            return (Criteria) this;
        }

        public Criteria andProductClientRefLessThanOrEqualTo(String value) {
            addCriterion("product_client_ref <=", value, "productClientRef");
            return (Criteria) this;
        }

        public Criteria andProductClientRefLike(String value) {
            addCriterion("product_client_ref like", value, "productClientRef");
            return (Criteria) this;
        }

        public Criteria andProductClientRefNotLike(String value) {
            addCriterion("product_client_ref not like", value, "productClientRef");
            return (Criteria) this;
        }

        public Criteria andProductClientRefIn(List<String> values) {
            addCriterion("product_client_ref in", values, "productClientRef");
            return (Criteria) this;
        }

        public Criteria andProductClientRefNotIn(List<String> values) {
            addCriterion("product_client_ref not in", values, "productClientRef");
            return (Criteria) this;
        }

        public Criteria andProductClientRefBetween(String value1, String value2) {
            addCriterion("product_client_ref between", value1, value2, "productClientRef");
            return (Criteria) this;
        }

        public Criteria andProductClientRefNotBetween(String value1, String value2) {
            addCriterion("product_client_ref not between", value1, value2, "productClientRef");
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

        public Criteria andTotalDeliveryFeeIsNull() {
            addCriterion("total_delivery_fee is null");
            return (Criteria) this;
        }

        public Criteria andTotalDeliveryFeeIsNotNull() {
            addCriterion("total_delivery_fee is not null");
            return (Criteria) this;
        }

        public Criteria andTotalDeliveryFeeEqualTo(Double value) {
            addCriterion("total_delivery_fee =", value, "totalDeliveryFee");
            return (Criteria) this;
        }

        public Criteria andTotalDeliveryFeeNotEqualTo(Double value) {
            addCriterion("total_delivery_fee <>", value, "totalDeliveryFee");
            return (Criteria) this;
        }

        public Criteria andTotalDeliveryFeeGreaterThan(Double value) {
            addCriterion("total_delivery_fee >", value, "totalDeliveryFee");
            return (Criteria) this;
        }

        public Criteria andTotalDeliveryFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("total_delivery_fee >=", value, "totalDeliveryFee");
            return (Criteria) this;
        }

        public Criteria andTotalDeliveryFeeLessThan(Double value) {
            addCriterion("total_delivery_fee <", value, "totalDeliveryFee");
            return (Criteria) this;
        }

        public Criteria andTotalDeliveryFeeLessThanOrEqualTo(Double value) {
            addCriterion("total_delivery_fee <=", value, "totalDeliveryFee");
            return (Criteria) this;
        }

        public Criteria andTotalDeliveryFeeIn(List<Double> values) {
            addCriterion("total_delivery_fee in", values, "totalDeliveryFee");
            return (Criteria) this;
        }

        public Criteria andTotalDeliveryFeeNotIn(List<Double> values) {
            addCriterion("total_delivery_fee not in", values, "totalDeliveryFee");
            return (Criteria) this;
        }

        public Criteria andTotalDeliveryFeeBetween(Double value1, Double value2) {
            addCriterion("total_delivery_fee between", value1, value2, "totalDeliveryFee");
            return (Criteria) this;
        }

        public Criteria andTotalDeliveryFeeNotBetween(Double value1, Double value2) {
            addCriterion("total_delivery_fee not between", value1, value2, "totalDeliveryFee");
            return (Criteria) this;
        }

        public Criteria andTotalHandlingFeeIsNull() {
            addCriterion("total_handling_fee is null");
            return (Criteria) this;
        }

        public Criteria andTotalHandlingFeeIsNotNull() {
            addCriterion("total_handling_fee is not null");
            return (Criteria) this;
        }

        public Criteria andTotalHandlingFeeEqualTo(Double value) {
            addCriterion("total_handling_fee =", value, "totalHandlingFee");
            return (Criteria) this;
        }

        public Criteria andTotalHandlingFeeNotEqualTo(Double value) {
            addCriterion("total_handling_fee <>", value, "totalHandlingFee");
            return (Criteria) this;
        }

        public Criteria andTotalHandlingFeeGreaterThan(Double value) {
            addCriterion("total_handling_fee >", value, "totalHandlingFee");
            return (Criteria) this;
        }

        public Criteria andTotalHandlingFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("total_handling_fee >=", value, "totalHandlingFee");
            return (Criteria) this;
        }

        public Criteria andTotalHandlingFeeLessThan(Double value) {
            addCriterion("total_handling_fee <", value, "totalHandlingFee");
            return (Criteria) this;
        }

        public Criteria andTotalHandlingFeeLessThanOrEqualTo(Double value) {
            addCriterion("total_handling_fee <=", value, "totalHandlingFee");
            return (Criteria) this;
        }

        public Criteria andTotalHandlingFeeIn(List<Double> values) {
            addCriterion("total_handling_fee in", values, "totalHandlingFee");
            return (Criteria) this;
        }

        public Criteria andTotalHandlingFeeNotIn(List<Double> values) {
            addCriterion("total_handling_fee not in", values, "totalHandlingFee");
            return (Criteria) this;
        }

        public Criteria andTotalHandlingFeeBetween(Double value1, Double value2) {
            addCriterion("total_handling_fee between", value1, value2, "totalHandlingFee");
            return (Criteria) this;
        }

        public Criteria andTotalHandlingFeeNotBetween(Double value1, Double value2) {
            addCriterion("total_handling_fee not between", value1, value2, "totalHandlingFee");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCustomIdentityReferenceIsNull() {
            addCriterion("custom_identity_reference is null");
            return (Criteria) this;
        }

        public Criteria andCustomIdentityReferenceIsNotNull() {
            addCriterion("custom_identity_reference is not null");
            return (Criteria) this;
        }

        public Criteria andCustomIdentityReferenceEqualTo(String value) {
            addCriterion("custom_identity_reference =", value, "customIdentityReference");
            return (Criteria) this;
        }

        public Criteria andCustomIdentityReferenceNotEqualTo(String value) {
            addCriterion("custom_identity_reference <>", value, "customIdentityReference");
            return (Criteria) this;
        }

        public Criteria andCustomIdentityReferenceGreaterThan(String value) {
            addCriterion("custom_identity_reference >", value, "customIdentityReference");
            return (Criteria) this;
        }

        public Criteria andCustomIdentityReferenceGreaterThanOrEqualTo(String value) {
            addCriterion("custom_identity_reference >=", value, "customIdentityReference");
            return (Criteria) this;
        }

        public Criteria andCustomIdentityReferenceLessThan(String value) {
            addCriterion("custom_identity_reference <", value, "customIdentityReference");
            return (Criteria) this;
        }

        public Criteria andCustomIdentityReferenceLessThanOrEqualTo(String value) {
            addCriterion("custom_identity_reference <=", value, "customIdentityReference");
            return (Criteria) this;
        }

        public Criteria andCustomIdentityReferenceLike(String value) {
            addCriterion("custom_identity_reference like", value, "customIdentityReference");
            return (Criteria) this;
        }

        public Criteria andCustomIdentityReferenceNotLike(String value) {
            addCriterion("custom_identity_reference not like", value, "customIdentityReference");
            return (Criteria) this;
        }

        public Criteria andCustomIdentityReferenceIn(List<String> values) {
            addCriterion("custom_identity_reference in", values, "customIdentityReference");
            return (Criteria) this;
        }

        public Criteria andCustomIdentityReferenceNotIn(List<String> values) {
            addCriterion("custom_identity_reference not in", values, "customIdentityReference");
            return (Criteria) this;
        }

        public Criteria andCustomIdentityReferenceBetween(String value1, String value2) {
            addCriterion("custom_identity_reference between", value1, value2, "customIdentityReference");
            return (Criteria) this;
        }

        public Criteria andCustomIdentityReferenceNotBetween(String value1, String value2) {
            addCriterion("custom_identity_reference not between", value1, value2, "customIdentityReference");
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