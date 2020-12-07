package com.heeexy.example.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GcOutOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GcOutOrderExample() {
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

        public Criteria andOrderCodeIsNull() {
            addCriterion("order_code is null");
            return (Criteria) this;
        }

        public Criteria andOrderCodeIsNotNull() {
            addCriterion("order_code is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCodeEqualTo(String value) {
            addCriterion("order_code =", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotEqualTo(String value) {
            addCriterion("order_code <>", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeGreaterThan(String value) {
            addCriterion("order_code >", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeGreaterThanOrEqualTo(String value) {
            addCriterion("order_code >=", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeLessThan(String value) {
            addCriterion("order_code <", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeLessThanOrEqualTo(String value) {
            addCriterion("order_code <=", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeLike(String value) {
            addCriterion("order_code like", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotLike(String value) {
            addCriterion("order_code not like", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeIn(List<String> values) {
            addCriterion("order_code in", values, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotIn(List<String> values) {
            addCriterion("order_code not in", values, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeBetween(String value1, String value2) {
            addCriterion("order_code between", value1, value2, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotBetween(String value1, String value2) {
            addCriterion("order_code not between", value1, value2, "orderCode");
            return (Criteria) this;
        }

        public Criteria andReferenceNoIsNull() {
            addCriterion("reference_no is null");
            return (Criteria) this;
        }

        public Criteria andReferenceNoIsNotNull() {
            addCriterion("reference_no is not null");
            return (Criteria) this;
        }

        public Criteria andReferenceNoEqualTo(String value) {
            addCriterion("reference_no =", value, "referenceNo");
            return (Criteria) this;
        }

        public Criteria andReferenceNoNotEqualTo(String value) {
            addCriterion("reference_no <>", value, "referenceNo");
            return (Criteria) this;
        }

        public Criteria andReferenceNoGreaterThan(String value) {
            addCriterion("reference_no >", value, "referenceNo");
            return (Criteria) this;
        }

        public Criteria andReferenceNoGreaterThanOrEqualTo(String value) {
            addCriterion("reference_no >=", value, "referenceNo");
            return (Criteria) this;
        }

        public Criteria andReferenceNoLessThan(String value) {
            addCriterion("reference_no <", value, "referenceNo");
            return (Criteria) this;
        }

        public Criteria andReferenceNoLessThanOrEqualTo(String value) {
            addCriterion("reference_no <=", value, "referenceNo");
            return (Criteria) this;
        }

        public Criteria andReferenceNoLike(String value) {
            addCriterion("reference_no like", value, "referenceNo");
            return (Criteria) this;
        }

        public Criteria andReferenceNoNotLike(String value) {
            addCriterion("reference_no not like", value, "referenceNo");
            return (Criteria) this;
        }

        public Criteria andReferenceNoIn(List<String> values) {
            addCriterion("reference_no in", values, "referenceNo");
            return (Criteria) this;
        }

        public Criteria andReferenceNoNotIn(List<String> values) {
            addCriterion("reference_no not in", values, "referenceNo");
            return (Criteria) this;
        }

        public Criteria andReferenceNoBetween(String value1, String value2) {
            addCriterion("reference_no between", value1, value2, "referenceNo");
            return (Criteria) this;
        }

        public Criteria andReferenceNoNotBetween(String value1, String value2) {
            addCriterion("reference_no not between", value1, value2, "referenceNo");
            return (Criteria) this;
        }

        public Criteria andPlatformIsNull() {
            addCriterion("platform is null");
            return (Criteria) this;
        }

        public Criteria andPlatformIsNotNull() {
            addCriterion("platform is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformEqualTo(String value) {
            addCriterion("platform =", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotEqualTo(String value) {
            addCriterion("platform <>", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformGreaterThan(String value) {
            addCriterion("platform >", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformGreaterThanOrEqualTo(String value) {
            addCriterion("platform >=", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLessThan(String value) {
            addCriterion("platform <", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLessThanOrEqualTo(String value) {
            addCriterion("platform <=", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLike(String value) {
            addCriterion("platform like", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotLike(String value) {
            addCriterion("platform not like", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformIn(List<String> values) {
            addCriterion("platform in", values, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotIn(List<String> values) {
            addCriterion("platform not in", values, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformBetween(String value1, String value2) {
            addCriterion("platform between", value1, value2, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotBetween(String value1, String value2) {
            addCriterion("platform not between", value1, value2, "platform");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNull() {
            addCriterion("order_status is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("order_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(String value) {
            addCriterion("order_status =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(String value) {
            addCriterion("order_status <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(String value) {
            addCriterion("order_status >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(String value) {
            addCriterion("order_status >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(String value) {
            addCriterion("order_status <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(String value) {
            addCriterion("order_status <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLike(String value) {
            addCriterion("order_status like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotLike(String value) {
            addCriterion("order_status not like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<String> values) {
            addCriterion("order_status in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<String> values) {
            addCriterion("order_status not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(String value1, String value2) {
            addCriterion("order_status between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(String value1, String value2) {
            addCriterion("order_status not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andShippingMethodIsNull() {
            addCriterion("shipping_method is null");
            return (Criteria) this;
        }

        public Criteria andShippingMethodIsNotNull() {
            addCriterion("shipping_method is not null");
            return (Criteria) this;
        }

        public Criteria andShippingMethodEqualTo(String value) {
            addCriterion("shipping_method =", value, "shippingMethod");
            return (Criteria) this;
        }

        public Criteria andShippingMethodNotEqualTo(String value) {
            addCriterion("shipping_method <>", value, "shippingMethod");
            return (Criteria) this;
        }

        public Criteria andShippingMethodGreaterThan(String value) {
            addCriterion("shipping_method >", value, "shippingMethod");
            return (Criteria) this;
        }

        public Criteria andShippingMethodGreaterThanOrEqualTo(String value) {
            addCriterion("shipping_method >=", value, "shippingMethod");
            return (Criteria) this;
        }

        public Criteria andShippingMethodLessThan(String value) {
            addCriterion("shipping_method <", value, "shippingMethod");
            return (Criteria) this;
        }

        public Criteria andShippingMethodLessThanOrEqualTo(String value) {
            addCriterion("shipping_method <=", value, "shippingMethod");
            return (Criteria) this;
        }

        public Criteria andShippingMethodLike(String value) {
            addCriterion("shipping_method like", value, "shippingMethod");
            return (Criteria) this;
        }

        public Criteria andShippingMethodNotLike(String value) {
            addCriterion("shipping_method not like", value, "shippingMethod");
            return (Criteria) this;
        }

        public Criteria andShippingMethodIn(List<String> values) {
            addCriterion("shipping_method in", values, "shippingMethod");
            return (Criteria) this;
        }

        public Criteria andShippingMethodNotIn(List<String> values) {
            addCriterion("shipping_method not in", values, "shippingMethod");
            return (Criteria) this;
        }

        public Criteria andShippingMethodBetween(String value1, String value2) {
            addCriterion("shipping_method between", value1, value2, "shippingMethod");
            return (Criteria) this;
        }

        public Criteria andShippingMethodNotBetween(String value1, String value2) {
            addCriterion("shipping_method not between", value1, value2, "shippingMethod");
            return (Criteria) this;
        }

        public Criteria andTrackingNoIsNull() {
            addCriterion("tracking_no is null");
            return (Criteria) this;
        }

        public Criteria andTrackingNoIsNotNull() {
            addCriterion("tracking_no is not null");
            return (Criteria) this;
        }

        public Criteria andTrackingNoEqualTo(String value) {
            addCriterion("tracking_no =", value, "trackingNo");
            return (Criteria) this;
        }

        public Criteria andTrackingNoNotEqualTo(String value) {
            addCriterion("tracking_no <>", value, "trackingNo");
            return (Criteria) this;
        }

        public Criteria andTrackingNoGreaterThan(String value) {
            addCriterion("tracking_no >", value, "trackingNo");
            return (Criteria) this;
        }

        public Criteria andTrackingNoGreaterThanOrEqualTo(String value) {
            addCriterion("tracking_no >=", value, "trackingNo");
            return (Criteria) this;
        }

        public Criteria andTrackingNoLessThan(String value) {
            addCriterion("tracking_no <", value, "trackingNo");
            return (Criteria) this;
        }

        public Criteria andTrackingNoLessThanOrEqualTo(String value) {
            addCriterion("tracking_no <=", value, "trackingNo");
            return (Criteria) this;
        }

        public Criteria andTrackingNoLike(String value) {
            addCriterion("tracking_no like", value, "trackingNo");
            return (Criteria) this;
        }

        public Criteria andTrackingNoNotLike(String value) {
            addCriterion("tracking_no not like", value, "trackingNo");
            return (Criteria) this;
        }

        public Criteria andTrackingNoIn(List<String> values) {
            addCriterion("tracking_no in", values, "trackingNo");
            return (Criteria) this;
        }

        public Criteria andTrackingNoNotIn(List<String> values) {
            addCriterion("tracking_no not in", values, "trackingNo");
            return (Criteria) this;
        }

        public Criteria andTrackingNoBetween(String value1, String value2) {
            addCriterion("tracking_no between", value1, value2, "trackingNo");
            return (Criteria) this;
        }

        public Criteria andTrackingNoNotBetween(String value1, String value2) {
            addCriterion("tracking_no not between", value1, value2, "trackingNo");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeIsNull() {
            addCriterion("warehouse_code is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeIsNotNull() {
            addCriterion("warehouse_code is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeEqualTo(String value) {
            addCriterion("warehouse_code =", value, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeNotEqualTo(String value) {
            addCriterion("warehouse_code <>", value, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeGreaterThan(String value) {
            addCriterion("warehouse_code >", value, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeGreaterThanOrEqualTo(String value) {
            addCriterion("warehouse_code >=", value, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeLessThan(String value) {
            addCriterion("warehouse_code <", value, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeLessThanOrEqualTo(String value) {
            addCriterion("warehouse_code <=", value, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeLike(String value) {
            addCriterion("warehouse_code like", value, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeNotLike(String value) {
            addCriterion("warehouse_code not like", value, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeIn(List<String> values) {
            addCriterion("warehouse_code in", values, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeNotIn(List<String> values) {
            addCriterion("warehouse_code not in", values, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeBetween(String value1, String value2) {
            addCriterion("warehouse_code between", value1, value2, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeNotBetween(String value1, String value2) {
            addCriterion("warehouse_code not between", value1, value2, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andOrderWeightIsNull() {
            addCriterion("order_weight is null");
            return (Criteria) this;
        }

        public Criteria andOrderWeightIsNotNull() {
            addCriterion("order_weight is not null");
            return (Criteria) this;
        }

        public Criteria andOrderWeightEqualTo(Double value) {
            addCriterion("order_weight =", value, "orderWeight");
            return (Criteria) this;
        }

        public Criteria andOrderWeightNotEqualTo(Double value) {
            addCriterion("order_weight <>", value, "orderWeight");
            return (Criteria) this;
        }

        public Criteria andOrderWeightGreaterThan(Double value) {
            addCriterion("order_weight >", value, "orderWeight");
            return (Criteria) this;
        }

        public Criteria andOrderWeightGreaterThanOrEqualTo(Double value) {
            addCriterion("order_weight >=", value, "orderWeight");
            return (Criteria) this;
        }

        public Criteria andOrderWeightLessThan(Double value) {
            addCriterion("order_weight <", value, "orderWeight");
            return (Criteria) this;
        }

        public Criteria andOrderWeightLessThanOrEqualTo(Double value) {
            addCriterion("order_weight <=", value, "orderWeight");
            return (Criteria) this;
        }

        public Criteria andOrderWeightIn(List<Double> values) {
            addCriterion("order_weight in", values, "orderWeight");
            return (Criteria) this;
        }

        public Criteria andOrderWeightNotIn(List<Double> values) {
            addCriterion("order_weight not in", values, "orderWeight");
            return (Criteria) this;
        }

        public Criteria andOrderWeightBetween(Double value1, Double value2) {
            addCriterion("order_weight between", value1, value2, "orderWeight");
            return (Criteria) this;
        }

        public Criteria andOrderWeightNotBetween(Double value1, Double value2) {
            addCriterion("order_weight not between", value1, value2, "orderWeight");
            return (Criteria) this;
        }

        public Criteria andOrderDescIsNull() {
            addCriterion("order_desc is null");
            return (Criteria) this;
        }

        public Criteria andOrderDescIsNotNull() {
            addCriterion("order_desc is not null");
            return (Criteria) this;
        }

        public Criteria andOrderDescEqualTo(String value) {
            addCriterion("order_desc =", value, "orderDesc");
            return (Criteria) this;
        }

        public Criteria andOrderDescNotEqualTo(String value) {
            addCriterion("order_desc <>", value, "orderDesc");
            return (Criteria) this;
        }

        public Criteria andOrderDescGreaterThan(String value) {
            addCriterion("order_desc >", value, "orderDesc");
            return (Criteria) this;
        }

        public Criteria andOrderDescGreaterThanOrEqualTo(String value) {
            addCriterion("order_desc >=", value, "orderDesc");
            return (Criteria) this;
        }

        public Criteria andOrderDescLessThan(String value) {
            addCriterion("order_desc <", value, "orderDesc");
            return (Criteria) this;
        }

        public Criteria andOrderDescLessThanOrEqualTo(String value) {
            addCriterion("order_desc <=", value, "orderDesc");
            return (Criteria) this;
        }

        public Criteria andOrderDescLike(String value) {
            addCriterion("order_desc like", value, "orderDesc");
            return (Criteria) this;
        }

        public Criteria andOrderDescNotLike(String value) {
            addCriterion("order_desc not like", value, "orderDesc");
            return (Criteria) this;
        }

        public Criteria andOrderDescIn(List<String> values) {
            addCriterion("order_desc in", values, "orderDesc");
            return (Criteria) this;
        }

        public Criteria andOrderDescNotIn(List<String> values) {
            addCriterion("order_desc not in", values, "orderDesc");
            return (Criteria) this;
        }

        public Criteria andOrderDescBetween(String value1, String value2) {
            addCriterion("order_desc between", value1, value2, "orderDesc");
            return (Criteria) this;
        }

        public Criteria andOrderDescNotBetween(String value1, String value2) {
            addCriterion("order_desc not between", value1, value2, "orderDesc");
            return (Criteria) this;
        }

        public Criteria andDateCreateIsNull() {
            addCriterion("date_create is null");
            return (Criteria) this;
        }

        public Criteria andDateCreateIsNotNull() {
            addCriterion("date_create is not null");
            return (Criteria) this;
        }

        public Criteria andDateCreateEqualTo(Date value) {
            addCriterion("date_create =", value, "dateCreate");
            return (Criteria) this;
        }

        public Criteria andDateCreateNotEqualTo(Date value) {
            addCriterion("date_create <>", value, "dateCreate");
            return (Criteria) this;
        }

        public Criteria andDateCreateGreaterThan(Date value) {
            addCriterion("date_create >", value, "dateCreate");
            return (Criteria) this;
        }

        public Criteria andDateCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("date_create >=", value, "dateCreate");
            return (Criteria) this;
        }

        public Criteria andDateCreateLessThan(Date value) {
            addCriterion("date_create <", value, "dateCreate");
            return (Criteria) this;
        }

        public Criteria andDateCreateLessThanOrEqualTo(Date value) {
            addCriterion("date_create <=", value, "dateCreate");
            return (Criteria) this;
        }

        public Criteria andDateCreateIn(List<Date> values) {
            addCriterion("date_create in", values, "dateCreate");
            return (Criteria) this;
        }

        public Criteria andDateCreateNotIn(List<Date> values) {
            addCriterion("date_create not in", values, "dateCreate");
            return (Criteria) this;
        }

        public Criteria andDateCreateBetween(Date value1, Date value2) {
            addCriterion("date_create between", value1, value2, "dateCreate");
            return (Criteria) this;
        }

        public Criteria andDateCreateNotBetween(Date value1, Date value2) {
            addCriterion("date_create not between", value1, value2, "dateCreate");
            return (Criteria) this;
        }

        public Criteria andDateModifyIsNull() {
            addCriterion("date_modify is null");
            return (Criteria) this;
        }

        public Criteria andDateModifyIsNotNull() {
            addCriterion("date_modify is not null");
            return (Criteria) this;
        }

        public Criteria andDateModifyEqualTo(Date value) {
            addCriterion("date_modify =", value, "dateModify");
            return (Criteria) this;
        }

        public Criteria andDateModifyNotEqualTo(Date value) {
            addCriterion("date_modify <>", value, "dateModify");
            return (Criteria) this;
        }

        public Criteria andDateModifyGreaterThan(Date value) {
            addCriterion("date_modify >", value, "dateModify");
            return (Criteria) this;
        }

        public Criteria andDateModifyGreaterThanOrEqualTo(Date value) {
            addCriterion("date_modify >=", value, "dateModify");
            return (Criteria) this;
        }

        public Criteria andDateModifyLessThan(Date value) {
            addCriterion("date_modify <", value, "dateModify");
            return (Criteria) this;
        }

        public Criteria andDateModifyLessThanOrEqualTo(Date value) {
            addCriterion("date_modify <=", value, "dateModify");
            return (Criteria) this;
        }

        public Criteria andDateModifyIn(List<Date> values) {
            addCriterion("date_modify in", values, "dateModify");
            return (Criteria) this;
        }

        public Criteria andDateModifyNotIn(List<Date> values) {
            addCriterion("date_modify not in", values, "dateModify");
            return (Criteria) this;
        }

        public Criteria andDateModifyBetween(Date value1, Date value2) {
            addCriterion("date_modify between", value1, value2, "dateModify");
            return (Criteria) this;
        }

        public Criteria andDateModifyNotBetween(Date value1, Date value2) {
            addCriterion("date_modify not between", value1, value2, "dateModify");
            return (Criteria) this;
        }

        public Criteria andConsigneeCountryCodeIsNull() {
            addCriterion("consignee_country_code is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeCountryCodeIsNotNull() {
            addCriterion("consignee_country_code is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeCountryCodeEqualTo(String value) {
            addCriterion("consignee_country_code =", value, "consigneeCountryCode");
            return (Criteria) this;
        }

        public Criteria andConsigneeCountryCodeNotEqualTo(String value) {
            addCriterion("consignee_country_code <>", value, "consigneeCountryCode");
            return (Criteria) this;
        }

        public Criteria andConsigneeCountryCodeGreaterThan(String value) {
            addCriterion("consignee_country_code >", value, "consigneeCountryCode");
            return (Criteria) this;
        }

        public Criteria andConsigneeCountryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("consignee_country_code >=", value, "consigneeCountryCode");
            return (Criteria) this;
        }

        public Criteria andConsigneeCountryCodeLessThan(String value) {
            addCriterion("consignee_country_code <", value, "consigneeCountryCode");
            return (Criteria) this;
        }

        public Criteria andConsigneeCountryCodeLessThanOrEqualTo(String value) {
            addCriterion("consignee_country_code <=", value, "consigneeCountryCode");
            return (Criteria) this;
        }

        public Criteria andConsigneeCountryCodeLike(String value) {
            addCriterion("consignee_country_code like", value, "consigneeCountryCode");
            return (Criteria) this;
        }

        public Criteria andConsigneeCountryCodeNotLike(String value) {
            addCriterion("consignee_country_code not like", value, "consigneeCountryCode");
            return (Criteria) this;
        }

        public Criteria andConsigneeCountryCodeIn(List<String> values) {
            addCriterion("consignee_country_code in", values, "consigneeCountryCode");
            return (Criteria) this;
        }

        public Criteria andConsigneeCountryCodeNotIn(List<String> values) {
            addCriterion("consignee_country_code not in", values, "consigneeCountryCode");
            return (Criteria) this;
        }

        public Criteria andConsigneeCountryCodeBetween(String value1, String value2) {
            addCriterion("consignee_country_code between", value1, value2, "consigneeCountryCode");
            return (Criteria) this;
        }

        public Criteria andConsigneeCountryCodeNotBetween(String value1, String value2) {
            addCriterion("consignee_country_code not between", value1, value2, "consigneeCountryCode");
            return (Criteria) this;
        }

        public Criteria andConsigneeCountryNameIsNull() {
            addCriterion("consignee_country_name is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeCountryNameIsNotNull() {
            addCriterion("consignee_country_name is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeCountryNameEqualTo(String value) {
            addCriterion("consignee_country_name =", value, "consigneeCountryName");
            return (Criteria) this;
        }

        public Criteria andConsigneeCountryNameNotEqualTo(String value) {
            addCriterion("consignee_country_name <>", value, "consigneeCountryName");
            return (Criteria) this;
        }

        public Criteria andConsigneeCountryNameGreaterThan(String value) {
            addCriterion("consignee_country_name >", value, "consigneeCountryName");
            return (Criteria) this;
        }

        public Criteria andConsigneeCountryNameGreaterThanOrEqualTo(String value) {
            addCriterion("consignee_country_name >=", value, "consigneeCountryName");
            return (Criteria) this;
        }

        public Criteria andConsigneeCountryNameLessThan(String value) {
            addCriterion("consignee_country_name <", value, "consigneeCountryName");
            return (Criteria) this;
        }

        public Criteria andConsigneeCountryNameLessThanOrEqualTo(String value) {
            addCriterion("consignee_country_name <=", value, "consigneeCountryName");
            return (Criteria) this;
        }

        public Criteria andConsigneeCountryNameLike(String value) {
            addCriterion("consignee_country_name like", value, "consigneeCountryName");
            return (Criteria) this;
        }

        public Criteria andConsigneeCountryNameNotLike(String value) {
            addCriterion("consignee_country_name not like", value, "consigneeCountryName");
            return (Criteria) this;
        }

        public Criteria andConsigneeCountryNameIn(List<String> values) {
            addCriterion("consignee_country_name in", values, "consigneeCountryName");
            return (Criteria) this;
        }

        public Criteria andConsigneeCountryNameNotIn(List<String> values) {
            addCriterion("consignee_country_name not in", values, "consigneeCountryName");
            return (Criteria) this;
        }

        public Criteria andConsigneeCountryNameBetween(String value1, String value2) {
            addCriterion("consignee_country_name between", value1, value2, "consigneeCountryName");
            return (Criteria) this;
        }

        public Criteria andConsigneeCountryNameNotBetween(String value1, String value2) {
            addCriterion("consignee_country_name not between", value1, value2, "consigneeCountryName");
            return (Criteria) this;
        }

        public Criteria andConsigneeStateIsNull() {
            addCriterion("consignee_state is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeStateIsNotNull() {
            addCriterion("consignee_state is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeStateEqualTo(String value) {
            addCriterion("consignee_state =", value, "consigneeState");
            return (Criteria) this;
        }

        public Criteria andConsigneeStateNotEqualTo(String value) {
            addCriterion("consignee_state <>", value, "consigneeState");
            return (Criteria) this;
        }

        public Criteria andConsigneeStateGreaterThan(String value) {
            addCriterion("consignee_state >", value, "consigneeState");
            return (Criteria) this;
        }

        public Criteria andConsigneeStateGreaterThanOrEqualTo(String value) {
            addCriterion("consignee_state >=", value, "consigneeState");
            return (Criteria) this;
        }

        public Criteria andConsigneeStateLessThan(String value) {
            addCriterion("consignee_state <", value, "consigneeState");
            return (Criteria) this;
        }

        public Criteria andConsigneeStateLessThanOrEqualTo(String value) {
            addCriterion("consignee_state <=", value, "consigneeState");
            return (Criteria) this;
        }

        public Criteria andConsigneeStateLike(String value) {
            addCriterion("consignee_state like", value, "consigneeState");
            return (Criteria) this;
        }

        public Criteria andConsigneeStateNotLike(String value) {
            addCriterion("consignee_state not like", value, "consigneeState");
            return (Criteria) this;
        }

        public Criteria andConsigneeStateIn(List<String> values) {
            addCriterion("consignee_state in", values, "consigneeState");
            return (Criteria) this;
        }

        public Criteria andConsigneeStateNotIn(List<String> values) {
            addCriterion("consignee_state not in", values, "consigneeState");
            return (Criteria) this;
        }

        public Criteria andConsigneeStateBetween(String value1, String value2) {
            addCriterion("consignee_state between", value1, value2, "consigneeState");
            return (Criteria) this;
        }

        public Criteria andConsigneeStateNotBetween(String value1, String value2) {
            addCriterion("consignee_state not between", value1, value2, "consigneeState");
            return (Criteria) this;
        }

        public Criteria andConsigneeCityIsNull() {
            addCriterion("consignee_city is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeCityIsNotNull() {
            addCriterion("consignee_city is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeCityEqualTo(String value) {
            addCriterion("consignee_city =", value, "consigneeCity");
            return (Criteria) this;
        }

        public Criteria andConsigneeCityNotEqualTo(String value) {
            addCriterion("consignee_city <>", value, "consigneeCity");
            return (Criteria) this;
        }

        public Criteria andConsigneeCityGreaterThan(String value) {
            addCriterion("consignee_city >", value, "consigneeCity");
            return (Criteria) this;
        }

        public Criteria andConsigneeCityGreaterThanOrEqualTo(String value) {
            addCriterion("consignee_city >=", value, "consigneeCity");
            return (Criteria) this;
        }

        public Criteria andConsigneeCityLessThan(String value) {
            addCriterion("consignee_city <", value, "consigneeCity");
            return (Criteria) this;
        }

        public Criteria andConsigneeCityLessThanOrEqualTo(String value) {
            addCriterion("consignee_city <=", value, "consigneeCity");
            return (Criteria) this;
        }

        public Criteria andConsigneeCityLike(String value) {
            addCriterion("consignee_city like", value, "consigneeCity");
            return (Criteria) this;
        }

        public Criteria andConsigneeCityNotLike(String value) {
            addCriterion("consignee_city not like", value, "consigneeCity");
            return (Criteria) this;
        }

        public Criteria andConsigneeCityIn(List<String> values) {
            addCriterion("consignee_city in", values, "consigneeCity");
            return (Criteria) this;
        }

        public Criteria andConsigneeCityNotIn(List<String> values) {
            addCriterion("consignee_city not in", values, "consigneeCity");
            return (Criteria) this;
        }

        public Criteria andConsigneeCityBetween(String value1, String value2) {
            addCriterion("consignee_city between", value1, value2, "consigneeCity");
            return (Criteria) this;
        }

        public Criteria andConsigneeCityNotBetween(String value1, String value2) {
            addCriterion("consignee_city not between", value1, value2, "consigneeCity");
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