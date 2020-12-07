package com.heeexy.example.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GcOutOrderDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GcOutOrderDetailExample() {
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

        public Criteria andAbnormalProblemReasonIsNull() {
            addCriterion("abnormal_problem_reason is null");
            return (Criteria) this;
        }

        public Criteria andAbnormalProblemReasonIsNotNull() {
            addCriterion("abnormal_problem_reason is not null");
            return (Criteria) this;
        }

        public Criteria andAbnormalProblemReasonEqualTo(String value) {
            addCriterion("abnormal_problem_reason =", value, "abnormalProblemReason");
            return (Criteria) this;
        }

        public Criteria andAbnormalProblemReasonNotEqualTo(String value) {
            addCriterion("abnormal_problem_reason <>", value, "abnormalProblemReason");
            return (Criteria) this;
        }

        public Criteria andAbnormalProblemReasonGreaterThan(String value) {
            addCriterion("abnormal_problem_reason >", value, "abnormalProblemReason");
            return (Criteria) this;
        }

        public Criteria andAbnormalProblemReasonGreaterThanOrEqualTo(String value) {
            addCriterion("abnormal_problem_reason >=", value, "abnormalProblemReason");
            return (Criteria) this;
        }

        public Criteria andAbnormalProblemReasonLessThan(String value) {
            addCriterion("abnormal_problem_reason <", value, "abnormalProblemReason");
            return (Criteria) this;
        }

        public Criteria andAbnormalProblemReasonLessThanOrEqualTo(String value) {
            addCriterion("abnormal_problem_reason <=", value, "abnormalProblemReason");
            return (Criteria) this;
        }

        public Criteria andAbnormalProblemReasonLike(String value) {
            addCriterion("abnormal_problem_reason like", value, "abnormalProblemReason");
            return (Criteria) this;
        }

        public Criteria andAbnormalProblemReasonNotLike(String value) {
            addCriterion("abnormal_problem_reason not like", value, "abnormalProblemReason");
            return (Criteria) this;
        }

        public Criteria andAbnormalProblemReasonIn(List<String> values) {
            addCriterion("abnormal_problem_reason in", values, "abnormalProblemReason");
            return (Criteria) this;
        }

        public Criteria andAbnormalProblemReasonNotIn(List<String> values) {
            addCriterion("abnormal_problem_reason not in", values, "abnormalProblemReason");
            return (Criteria) this;
        }

        public Criteria andAbnormalProblemReasonBetween(String value1, String value2) {
            addCriterion("abnormal_problem_reason between", value1, value2, "abnormalProblemReason");
            return (Criteria) this;
        }

        public Criteria andAbnormalProblemReasonNotBetween(String value1, String value2) {
            addCriterion("abnormal_problem_reason not between", value1, value2, "abnormalProblemReason");
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

        public Criteria andOrderWeightEqualTo(Float value) {
            addCriterion("order_weight =", value, "orderWeight");
            return (Criteria) this;
        }

        public Criteria andOrderWeightNotEqualTo(Float value) {
            addCriterion("order_weight <>", value, "orderWeight");
            return (Criteria) this;
        }

        public Criteria andOrderWeightGreaterThan(Float value) {
            addCriterion("order_weight >", value, "orderWeight");
            return (Criteria) this;
        }

        public Criteria andOrderWeightGreaterThanOrEqualTo(Float value) {
            addCriterion("order_weight >=", value, "orderWeight");
            return (Criteria) this;
        }

        public Criteria andOrderWeightLessThan(Float value) {
            addCriterion("order_weight <", value, "orderWeight");
            return (Criteria) this;
        }

        public Criteria andOrderWeightLessThanOrEqualTo(Float value) {
            addCriterion("order_weight <=", value, "orderWeight");
            return (Criteria) this;
        }

        public Criteria andOrderWeightIn(List<Float> values) {
            addCriterion("order_weight in", values, "orderWeight");
            return (Criteria) this;
        }

        public Criteria andOrderWeightNotIn(List<Float> values) {
            addCriterion("order_weight not in", values, "orderWeight");
            return (Criteria) this;
        }

        public Criteria andOrderWeightBetween(Float value1, Float value2) {
            addCriterion("order_weight between", value1, value2, "orderWeight");
            return (Criteria) this;
        }

        public Criteria andOrderWeightNotBetween(Float value1, Float value2) {
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

        public Criteria andDateReleaseIsNull() {
            addCriterion("date_release is null");
            return (Criteria) this;
        }

        public Criteria andDateReleaseIsNotNull() {
            addCriterion("date_release is not null");
            return (Criteria) this;
        }

        public Criteria andDateReleaseEqualTo(Date value) {
            addCriterion("date_release =", value, "dateRelease");
            return (Criteria) this;
        }

        public Criteria andDateReleaseNotEqualTo(Date value) {
            addCriterion("date_release <>", value, "dateRelease");
            return (Criteria) this;
        }

        public Criteria andDateReleaseGreaterThan(Date value) {
            addCriterion("date_release >", value, "dateRelease");
            return (Criteria) this;
        }

        public Criteria andDateReleaseGreaterThanOrEqualTo(Date value) {
            addCriterion("date_release >=", value, "dateRelease");
            return (Criteria) this;
        }

        public Criteria andDateReleaseLessThan(Date value) {
            addCriterion("date_release <", value, "dateRelease");
            return (Criteria) this;
        }

        public Criteria andDateReleaseLessThanOrEqualTo(Date value) {
            addCriterion("date_release <=", value, "dateRelease");
            return (Criteria) this;
        }

        public Criteria andDateReleaseIn(List<Date> values) {
            addCriterion("date_release in", values, "dateRelease");
            return (Criteria) this;
        }

        public Criteria andDateReleaseNotIn(List<Date> values) {
            addCriterion("date_release not in", values, "dateRelease");
            return (Criteria) this;
        }

        public Criteria andDateReleaseBetween(Date value1, Date value2) {
            addCriterion("date_release between", value1, value2, "dateRelease");
            return (Criteria) this;
        }

        public Criteria andDateReleaseNotBetween(Date value1, Date value2) {
            addCriterion("date_release not between", value1, value2, "dateRelease");
            return (Criteria) this;
        }

        public Criteria andDateShippingIsNull() {
            addCriterion("date_shipping is null");
            return (Criteria) this;
        }

        public Criteria andDateShippingIsNotNull() {
            addCriterion("date_shipping is not null");
            return (Criteria) this;
        }

        public Criteria andDateShippingEqualTo(Date value) {
            addCriterion("date_shipping =", value, "dateShipping");
            return (Criteria) this;
        }

        public Criteria andDateShippingNotEqualTo(Date value) {
            addCriterion("date_shipping <>", value, "dateShipping");
            return (Criteria) this;
        }

        public Criteria andDateShippingGreaterThan(Date value) {
            addCriterion("date_shipping >", value, "dateShipping");
            return (Criteria) this;
        }

        public Criteria andDateShippingGreaterThanOrEqualTo(Date value) {
            addCriterion("date_shipping >=", value, "dateShipping");
            return (Criteria) this;
        }

        public Criteria andDateShippingLessThan(Date value) {
            addCriterion("date_shipping <", value, "dateShipping");
            return (Criteria) this;
        }

        public Criteria andDateShippingLessThanOrEqualTo(Date value) {
            addCriterion("date_shipping <=", value, "dateShipping");
            return (Criteria) this;
        }

        public Criteria andDateShippingIn(List<Date> values) {
            addCriterion("date_shipping in", values, "dateShipping");
            return (Criteria) this;
        }

        public Criteria andDateShippingNotIn(List<Date> values) {
            addCriterion("date_shipping not in", values, "dateShipping");
            return (Criteria) this;
        }

        public Criteria andDateShippingBetween(Date value1, Date value2) {
            addCriterion("date_shipping between", value1, value2, "dateShipping");
            return (Criteria) this;
        }

        public Criteria andDateShippingNotBetween(Date value1, Date value2) {
            addCriterion("date_shipping not between", value1, value2, "dateShipping");
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

        public Criteria andTotalfeeIsNull() {
            addCriterion("totalFee is null");
            return (Criteria) this;
        }

        public Criteria andTotalfeeIsNotNull() {
            addCriterion("totalFee is not null");
            return (Criteria) this;
        }

        public Criteria andTotalfeeEqualTo(Float value) {
            addCriterion("totalFee =", value, "totalfee");
            return (Criteria) this;
        }

        public Criteria andTotalfeeNotEqualTo(Float value) {
            addCriterion("totalFee <>", value, "totalfee");
            return (Criteria) this;
        }

        public Criteria andTotalfeeGreaterThan(Float value) {
            addCriterion("totalFee >", value, "totalfee");
            return (Criteria) this;
        }

        public Criteria andTotalfeeGreaterThanOrEqualTo(Float value) {
            addCriterion("totalFee >=", value, "totalfee");
            return (Criteria) this;
        }

        public Criteria andTotalfeeLessThan(Float value) {
            addCriterion("totalFee <", value, "totalfee");
            return (Criteria) this;
        }

        public Criteria andTotalfeeLessThanOrEqualTo(Float value) {
            addCriterion("totalFee <=", value, "totalfee");
            return (Criteria) this;
        }

        public Criteria andTotalfeeIn(List<Float> values) {
            addCriterion("totalFee in", values, "totalfee");
            return (Criteria) this;
        }

        public Criteria andTotalfeeNotIn(List<Float> values) {
            addCriterion("totalFee not in", values, "totalfee");
            return (Criteria) this;
        }

        public Criteria andTotalfeeBetween(Float value1, Float value2) {
            addCriterion("totalFee between", value1, value2, "totalfee");
            return (Criteria) this;
        }

        public Criteria andTotalfeeNotBetween(Float value1, Float value2) {
            addCriterion("totalFee not between", value1, value2, "totalfee");
            return (Criteria) this;
        }

        public Criteria andShippingIsNull() {
            addCriterion("SHIPPING is null");
            return (Criteria) this;
        }

        public Criteria andShippingIsNotNull() {
            addCriterion("SHIPPING is not null");
            return (Criteria) this;
        }

        public Criteria andShippingEqualTo(Float value) {
            addCriterion("SHIPPING =", value, "shipping");
            return (Criteria) this;
        }

        public Criteria andShippingNotEqualTo(Float value) {
            addCriterion("SHIPPING <>", value, "shipping");
            return (Criteria) this;
        }

        public Criteria andShippingGreaterThan(Float value) {
            addCriterion("SHIPPING >", value, "shipping");
            return (Criteria) this;
        }

        public Criteria andShippingGreaterThanOrEqualTo(Float value) {
            addCriterion("SHIPPING >=", value, "shipping");
            return (Criteria) this;
        }

        public Criteria andShippingLessThan(Float value) {
            addCriterion("SHIPPING <", value, "shipping");
            return (Criteria) this;
        }

        public Criteria andShippingLessThanOrEqualTo(Float value) {
            addCriterion("SHIPPING <=", value, "shipping");
            return (Criteria) this;
        }

        public Criteria andShippingIn(List<Float> values) {
            addCriterion("SHIPPING in", values, "shipping");
            return (Criteria) this;
        }

        public Criteria andShippingNotIn(List<Float> values) {
            addCriterion("SHIPPING not in", values, "shipping");
            return (Criteria) this;
        }

        public Criteria andShippingBetween(Float value1, Float value2) {
            addCriterion("SHIPPING between", value1, value2, "shipping");
            return (Criteria) this;
        }

        public Criteria andShippingNotBetween(Float value1, Float value2) {
            addCriterion("SHIPPING not between", value1, value2, "shipping");
            return (Criteria) this;
        }

        public Criteria andOpfIsNull() {
            addCriterion("OPF is null");
            return (Criteria) this;
        }

        public Criteria andOpfIsNotNull() {
            addCriterion("OPF is not null");
            return (Criteria) this;
        }

        public Criteria andOpfEqualTo(Float value) {
            addCriterion("OPF =", value, "opf");
            return (Criteria) this;
        }

        public Criteria andOpfNotEqualTo(Float value) {
            addCriterion("OPF <>", value, "opf");
            return (Criteria) this;
        }

        public Criteria andOpfGreaterThan(Float value) {
            addCriterion("OPF >", value, "opf");
            return (Criteria) this;
        }

        public Criteria andOpfGreaterThanOrEqualTo(Float value) {
            addCriterion("OPF >=", value, "opf");
            return (Criteria) this;
        }

        public Criteria andOpfLessThan(Float value) {
            addCriterion("OPF <", value, "opf");
            return (Criteria) this;
        }

        public Criteria andOpfLessThanOrEqualTo(Float value) {
            addCriterion("OPF <=", value, "opf");
            return (Criteria) this;
        }

        public Criteria andOpfIn(List<Float> values) {
            addCriterion("OPF in", values, "opf");
            return (Criteria) this;
        }

        public Criteria andOpfNotIn(List<Float> values) {
            addCriterion("OPF not in", values, "opf");
            return (Criteria) this;
        }

        public Criteria andOpfBetween(Float value1, Float value2) {
            addCriterion("OPF between", value1, value2, "opf");
            return (Criteria) this;
        }

        public Criteria andOpfNotBetween(Float value1, Float value2) {
            addCriterion("OPF not between", value1, value2, "opf");
            return (Criteria) this;
        }

        public Criteria andFscIsNull() {
            addCriterion("FSC is null");
            return (Criteria) this;
        }

        public Criteria andFscIsNotNull() {
            addCriterion("FSC is not null");
            return (Criteria) this;
        }

        public Criteria andFscEqualTo(Float value) {
            addCriterion("FSC =", value, "fsc");
            return (Criteria) this;
        }

        public Criteria andFscNotEqualTo(Float value) {
            addCriterion("FSC <>", value, "fsc");
            return (Criteria) this;
        }

        public Criteria andFscGreaterThan(Float value) {
            addCriterion("FSC >", value, "fsc");
            return (Criteria) this;
        }

        public Criteria andFscGreaterThanOrEqualTo(Float value) {
            addCriterion("FSC >=", value, "fsc");
            return (Criteria) this;
        }

        public Criteria andFscLessThan(Float value) {
            addCriterion("FSC <", value, "fsc");
            return (Criteria) this;
        }

        public Criteria andFscLessThanOrEqualTo(Float value) {
            addCriterion("FSC <=", value, "fsc");
            return (Criteria) this;
        }

        public Criteria andFscIn(List<Float> values) {
            addCriterion("FSC in", values, "fsc");
            return (Criteria) this;
        }

        public Criteria andFscNotIn(List<Float> values) {
            addCriterion("FSC not in", values, "fsc");
            return (Criteria) this;
        }

        public Criteria andFscBetween(Float value1, Float value2) {
            addCriterion("FSC between", value1, value2, "fsc");
            return (Criteria) this;
        }

        public Criteria andFscNotBetween(Float value1, Float value2) {
            addCriterion("FSC not between", value1, value2, "fsc");
            return (Criteria) this;
        }

        public Criteria andDtIsNull() {
            addCriterion("DT is null");
            return (Criteria) this;
        }

        public Criteria andDtIsNotNull() {
            addCriterion("DT is not null");
            return (Criteria) this;
        }

        public Criteria andDtEqualTo(Float value) {
            addCriterion("DT =", value, "dt");
            return (Criteria) this;
        }

        public Criteria andDtNotEqualTo(Float value) {
            addCriterion("DT <>", value, "dt");
            return (Criteria) this;
        }

        public Criteria andDtGreaterThan(Float value) {
            addCriterion("DT >", value, "dt");
            return (Criteria) this;
        }

        public Criteria andDtGreaterThanOrEqualTo(Float value) {
            addCriterion("DT >=", value, "dt");
            return (Criteria) this;
        }

        public Criteria andDtLessThan(Float value) {
            addCriterion("DT <", value, "dt");
            return (Criteria) this;
        }

        public Criteria andDtLessThanOrEqualTo(Float value) {
            addCriterion("DT <=", value, "dt");
            return (Criteria) this;
        }

        public Criteria andDtIn(List<Float> values) {
            addCriterion("DT in", values, "dt");
            return (Criteria) this;
        }

        public Criteria andDtNotIn(List<Float> values) {
            addCriterion("DT not in", values, "dt");
            return (Criteria) this;
        }

        public Criteria andDtBetween(Float value1, Float value2) {
            addCriterion("DT between", value1, value2, "dt");
            return (Criteria) this;
        }

        public Criteria andDtNotBetween(Float value1, Float value2) {
            addCriterion("DT not between", value1, value2, "dt");
            return (Criteria) this;
        }

        public Criteria andRsfIsNull() {
            addCriterion("RSF is null");
            return (Criteria) this;
        }

        public Criteria andRsfIsNotNull() {
            addCriterion("RSF is not null");
            return (Criteria) this;
        }

        public Criteria andRsfEqualTo(Float value) {
            addCriterion("RSF =", value, "rsf");
            return (Criteria) this;
        }

        public Criteria andRsfNotEqualTo(Float value) {
            addCriterion("RSF <>", value, "rsf");
            return (Criteria) this;
        }

        public Criteria andRsfGreaterThan(Float value) {
            addCriterion("RSF >", value, "rsf");
            return (Criteria) this;
        }

        public Criteria andRsfGreaterThanOrEqualTo(Float value) {
            addCriterion("RSF >=", value, "rsf");
            return (Criteria) this;
        }

        public Criteria andRsfLessThan(Float value) {
            addCriterion("RSF <", value, "rsf");
            return (Criteria) this;
        }

        public Criteria andRsfLessThanOrEqualTo(Float value) {
            addCriterion("RSF <=", value, "rsf");
            return (Criteria) this;
        }

        public Criteria andRsfIn(List<Float> values) {
            addCriterion("RSF in", values, "rsf");
            return (Criteria) this;
        }

        public Criteria andRsfNotIn(List<Float> values) {
            addCriterion("RSF not in", values, "rsf");
            return (Criteria) this;
        }

        public Criteria andRsfBetween(Float value1, Float value2) {
            addCriterion("RSF between", value1, value2, "rsf");
            return (Criteria) this;
        }

        public Criteria andRsfNotBetween(Float value1, Float value2) {
            addCriterion("RSF not between", value1, value2, "rsf");
            return (Criteria) this;
        }

        public Criteria andOtfIsNull() {
            addCriterion("OTF is null");
            return (Criteria) this;
        }

        public Criteria andOtfIsNotNull() {
            addCriterion("OTF is not null");
            return (Criteria) this;
        }

        public Criteria andOtfEqualTo(Float value) {
            addCriterion("OTF =", value, "otf");
            return (Criteria) this;
        }

        public Criteria andOtfNotEqualTo(Float value) {
            addCriterion("OTF <>", value, "otf");
            return (Criteria) this;
        }

        public Criteria andOtfGreaterThan(Float value) {
            addCriterion("OTF >", value, "otf");
            return (Criteria) this;
        }

        public Criteria andOtfGreaterThanOrEqualTo(Float value) {
            addCriterion("OTF >=", value, "otf");
            return (Criteria) this;
        }

        public Criteria andOtfLessThan(Float value) {
            addCriterion("OTF <", value, "otf");
            return (Criteria) this;
        }

        public Criteria andOtfLessThanOrEqualTo(Float value) {
            addCriterion("OTF <=", value, "otf");
            return (Criteria) this;
        }

        public Criteria andOtfIn(List<Float> values) {
            addCriterion("OTF in", values, "otf");
            return (Criteria) this;
        }

        public Criteria andOtfNotIn(List<Float> values) {
            addCriterion("OTF not in", values, "otf");
            return (Criteria) this;
        }

        public Criteria andOtfBetween(Float value1, Float value2) {
            addCriterion("OTF between", value1, value2, "otf");
            return (Criteria) this;
        }

        public Criteria andOtfNotBetween(Float value1, Float value2) {
            addCriterion("OTF not between", value1, value2, "otf");
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

        public Criteria andProductSkuIsNull() {
            addCriterion("product_sku is null");
            return (Criteria) this;
        }

        public Criteria andProductSkuIsNotNull() {
            addCriterion("product_sku is not null");
            return (Criteria) this;
        }

        public Criteria andProductSkuEqualTo(String value) {
            addCriterion("product_sku =", value, "productSku");
            return (Criteria) this;
        }

        public Criteria andProductSkuNotEqualTo(String value) {
            addCriterion("product_sku <>", value, "productSku");
            return (Criteria) this;
        }

        public Criteria andProductSkuGreaterThan(String value) {
            addCriterion("product_sku >", value, "productSku");
            return (Criteria) this;
        }

        public Criteria andProductSkuGreaterThanOrEqualTo(String value) {
            addCriterion("product_sku >=", value, "productSku");
            return (Criteria) this;
        }

        public Criteria andProductSkuLessThan(String value) {
            addCriterion("product_sku <", value, "productSku");
            return (Criteria) this;
        }

        public Criteria andProductSkuLessThanOrEqualTo(String value) {
            addCriterion("product_sku <=", value, "productSku");
            return (Criteria) this;
        }

        public Criteria andProductSkuLike(String value) {
            addCriterion("product_sku like", value, "productSku");
            return (Criteria) this;
        }

        public Criteria andProductSkuNotLike(String value) {
            addCriterion("product_sku not like", value, "productSku");
            return (Criteria) this;
        }

        public Criteria andProductSkuIn(List<String> values) {
            addCriterion("product_sku in", values, "productSku");
            return (Criteria) this;
        }

        public Criteria andProductSkuNotIn(List<String> values) {
            addCriterion("product_sku not in", values, "productSku");
            return (Criteria) this;
        }

        public Criteria andProductSkuBetween(String value1, String value2) {
            addCriterion("product_sku between", value1, value2, "productSku");
            return (Criteria) this;
        }

        public Criteria andProductSkuNotBetween(String value1, String value2) {
            addCriterion("product_sku not between", value1, value2, "productSku");
            return (Criteria) this;
        }

        public Criteria andFbaProductCodeIsNull() {
            addCriterion("fba_product_code is null");
            return (Criteria) this;
        }

        public Criteria andFbaProductCodeIsNotNull() {
            addCriterion("fba_product_code is not null");
            return (Criteria) this;
        }

        public Criteria andFbaProductCodeEqualTo(String value) {
            addCriterion("fba_product_code =", value, "fbaProductCode");
            return (Criteria) this;
        }

        public Criteria andFbaProductCodeNotEqualTo(String value) {
            addCriterion("fba_product_code <>", value, "fbaProductCode");
            return (Criteria) this;
        }

        public Criteria andFbaProductCodeGreaterThan(String value) {
            addCriterion("fba_product_code >", value, "fbaProductCode");
            return (Criteria) this;
        }

        public Criteria andFbaProductCodeGreaterThanOrEqualTo(String value) {
            addCriterion("fba_product_code >=", value, "fbaProductCode");
            return (Criteria) this;
        }

        public Criteria andFbaProductCodeLessThan(String value) {
            addCriterion("fba_product_code <", value, "fbaProductCode");
            return (Criteria) this;
        }

        public Criteria andFbaProductCodeLessThanOrEqualTo(String value) {
            addCriterion("fba_product_code <=", value, "fbaProductCode");
            return (Criteria) this;
        }

        public Criteria andFbaProductCodeLike(String value) {
            addCriterion("fba_product_code like", value, "fbaProductCode");
            return (Criteria) this;
        }

        public Criteria andFbaProductCodeNotLike(String value) {
            addCriterion("fba_product_code not like", value, "fbaProductCode");
            return (Criteria) this;
        }

        public Criteria andFbaProductCodeIn(List<String> values) {
            addCriterion("fba_product_code in", values, "fbaProductCode");
            return (Criteria) this;
        }

        public Criteria andFbaProductCodeNotIn(List<String> values) {
            addCriterion("fba_product_code not in", values, "fbaProductCode");
            return (Criteria) this;
        }

        public Criteria andFbaProductCodeBetween(String value1, String value2) {
            addCriterion("fba_product_code between", value1, value2, "fbaProductCode");
            return (Criteria) this;
        }

        public Criteria andFbaProductCodeNotBetween(String value1, String value2) {
            addCriterion("fba_product_code not between", value1, value2, "fbaProductCode");
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

        public Criteria andTransactionIdIsNull() {
            addCriterion("transaction_id is null");
            return (Criteria) this;
        }

        public Criteria andTransactionIdIsNotNull() {
            addCriterion("transaction_id is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionIdEqualTo(String value) {
            addCriterion("transaction_id =", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotEqualTo(String value) {
            addCriterion("transaction_id <>", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdGreaterThan(String value) {
            addCriterion("transaction_id >", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdGreaterThanOrEqualTo(String value) {
            addCriterion("transaction_id >=", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdLessThan(String value) {
            addCriterion("transaction_id <", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdLessThanOrEqualTo(String value) {
            addCriterion("transaction_id <=", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdLike(String value) {
            addCriterion("transaction_id like", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotLike(String value) {
            addCriterion("transaction_id not like", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdIn(List<String> values) {
            addCriterion("transaction_id in", values, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotIn(List<String> values) {
            addCriterion("transaction_id not in", values, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdBetween(String value1, String value2) {
            addCriterion("transaction_id between", value1, value2, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotBetween(String value1, String value2) {
            addCriterion("transaction_id not between", value1, value2, "transactionId");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNull() {
            addCriterion("item_id is null");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNotNull() {
            addCriterion("item_id is not null");
            return (Criteria) this;
        }

        public Criteria andItemIdEqualTo(String value) {
            addCriterion("item_id =", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotEqualTo(String value) {
            addCriterion("item_id <>", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThan(String value) {
            addCriterion("item_id >", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThanOrEqualTo(String value) {
            addCriterion("item_id >=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThan(String value) {
            addCriterion("item_id <", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThanOrEqualTo(String value) {
            addCriterion("item_id <=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLike(String value) {
            addCriterion("item_id like", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotLike(String value) {
            addCriterion("item_id not like", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdIn(List<String> values) {
            addCriterion("item_id in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotIn(List<String> values) {
            addCriterion("item_id not in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdBetween(String value1, String value2) {
            addCriterion("item_id between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotBetween(String value1, String value2) {
            addCriterion("item_id not between", value1, value2, "itemId");
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