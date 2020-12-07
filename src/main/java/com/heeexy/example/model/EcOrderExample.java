package com.heeexy.example.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EcOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EcOrderExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("order_id like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("order_id not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
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

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andRefnoIsNull() {
            addCriterion("refNo is null");
            return (Criteria) this;
        }

        public Criteria andRefnoIsNotNull() {
            addCriterion("refNo is not null");
            return (Criteria) this;
        }

        public Criteria andRefnoEqualTo(String value) {
            addCriterion("refNo =", value, "refno");
            return (Criteria) this;
        }

        public Criteria andRefnoNotEqualTo(String value) {
            addCriterion("refNo <>", value, "refno");
            return (Criteria) this;
        }

        public Criteria andRefnoGreaterThan(String value) {
            addCriterion("refNo >", value, "refno");
            return (Criteria) this;
        }

        public Criteria andRefnoGreaterThanOrEqualTo(String value) {
            addCriterion("refNo >=", value, "refno");
            return (Criteria) this;
        }

        public Criteria andRefnoLessThan(String value) {
            addCriterion("refNo <", value, "refno");
            return (Criteria) this;
        }

        public Criteria andRefnoLessThanOrEqualTo(String value) {
            addCriterion("refNo <=", value, "refno");
            return (Criteria) this;
        }

        public Criteria andRefnoLike(String value) {
            addCriterion("refNo like", value, "refno");
            return (Criteria) this;
        }

        public Criteria andRefnoNotLike(String value) {
            addCriterion("refNo not like", value, "refno");
            return (Criteria) this;
        }

        public Criteria andRefnoIn(List<String> values) {
            addCriterion("refNo in", values, "refno");
            return (Criteria) this;
        }

        public Criteria andRefnoNotIn(List<String> values) {
            addCriterion("refNo not in", values, "refno");
            return (Criteria) this;
        }

        public Criteria andRefnoBetween(String value1, String value2) {
            addCriterion("refNo between", value1, value2, "refno");
            return (Criteria) this;
        }

        public Criteria andRefnoNotBetween(String value1, String value2) {
            addCriterion("refNo not between", value1, value2, "refno");
            return (Criteria) this;
        }

        public Criteria andSaleordercodeIsNull() {
            addCriterion("saleOrderCode is null");
            return (Criteria) this;
        }

        public Criteria andSaleordercodeIsNotNull() {
            addCriterion("saleOrderCode is not null");
            return (Criteria) this;
        }

        public Criteria andSaleordercodeEqualTo(String value) {
            addCriterion("saleOrderCode =", value, "saleordercode");
            return (Criteria) this;
        }

        public Criteria andSaleordercodeNotEqualTo(String value) {
            addCriterion("saleOrderCode <>", value, "saleordercode");
            return (Criteria) this;
        }

        public Criteria andSaleordercodeGreaterThan(String value) {
            addCriterion("saleOrderCode >", value, "saleordercode");
            return (Criteria) this;
        }

        public Criteria andSaleordercodeGreaterThanOrEqualTo(String value) {
            addCriterion("saleOrderCode >=", value, "saleordercode");
            return (Criteria) this;
        }

        public Criteria andSaleordercodeLessThan(String value) {
            addCriterion("saleOrderCode <", value, "saleordercode");
            return (Criteria) this;
        }

        public Criteria andSaleordercodeLessThanOrEqualTo(String value) {
            addCriterion("saleOrderCode <=", value, "saleordercode");
            return (Criteria) this;
        }

        public Criteria andSaleordercodeLike(String value) {
            addCriterion("saleOrderCode like", value, "saleordercode");
            return (Criteria) this;
        }

        public Criteria andSaleordercodeNotLike(String value) {
            addCriterion("saleOrderCode not like", value, "saleordercode");
            return (Criteria) this;
        }

        public Criteria andSaleordercodeIn(List<String> values) {
            addCriterion("saleOrderCode in", values, "saleordercode");
            return (Criteria) this;
        }

        public Criteria andSaleordercodeNotIn(List<String> values) {
            addCriterion("saleOrderCode not in", values, "saleordercode");
            return (Criteria) this;
        }

        public Criteria andSaleordercodeBetween(String value1, String value2) {
            addCriterion("saleOrderCode between", value1, value2, "saleordercode");
            return (Criteria) this;
        }

        public Criteria andSaleordercodeNotBetween(String value1, String value2) {
            addCriterion("saleOrderCode not between", value1, value2, "saleordercode");
            return (Criteria) this;
        }

        public Criteria andSysordercodeIsNull() {
            addCriterion("sysOrderCode is null");
            return (Criteria) this;
        }

        public Criteria andSysordercodeIsNotNull() {
            addCriterion("sysOrderCode is not null");
            return (Criteria) this;
        }

        public Criteria andSysordercodeEqualTo(String value) {
            addCriterion("sysOrderCode =", value, "sysordercode");
            return (Criteria) this;
        }

        public Criteria andSysordercodeNotEqualTo(String value) {
            addCriterion("sysOrderCode <>", value, "sysordercode");
            return (Criteria) this;
        }

        public Criteria andSysordercodeGreaterThan(String value) {
            addCriterion("sysOrderCode >", value, "sysordercode");
            return (Criteria) this;
        }

        public Criteria andSysordercodeGreaterThanOrEqualTo(String value) {
            addCriterion("sysOrderCode >=", value, "sysordercode");
            return (Criteria) this;
        }

        public Criteria andSysordercodeLessThan(String value) {
            addCriterion("sysOrderCode <", value, "sysordercode");
            return (Criteria) this;
        }

        public Criteria andSysordercodeLessThanOrEqualTo(String value) {
            addCriterion("sysOrderCode <=", value, "sysordercode");
            return (Criteria) this;
        }

        public Criteria andSysordercodeLike(String value) {
            addCriterion("sysOrderCode like", value, "sysordercode");
            return (Criteria) this;
        }

        public Criteria andSysordercodeNotLike(String value) {
            addCriterion("sysOrderCode not like", value, "sysordercode");
            return (Criteria) this;
        }

        public Criteria andSysordercodeIn(List<String> values) {
            addCriterion("sysOrderCode in", values, "sysordercode");
            return (Criteria) this;
        }

        public Criteria andSysordercodeNotIn(List<String> values) {
            addCriterion("sysOrderCode not in", values, "sysordercode");
            return (Criteria) this;
        }

        public Criteria andSysordercodeBetween(String value1, String value2) {
            addCriterion("sysOrderCode between", value1, value2, "sysordercode");
            return (Criteria) this;
        }

        public Criteria andSysordercodeNotBetween(String value1, String value2) {
            addCriterion("sysOrderCode not between", value1, value2, "sysordercode");
            return (Criteria) this;
        }

        public Criteria andWarehouseordercodeIsNull() {
            addCriterion("warehouseOrderCode is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseordercodeIsNotNull() {
            addCriterion("warehouseOrderCode is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseordercodeEqualTo(String value) {
            addCriterion("warehouseOrderCode =", value, "warehouseordercode");
            return (Criteria) this;
        }

        public Criteria andWarehouseordercodeNotEqualTo(String value) {
            addCriterion("warehouseOrderCode <>", value, "warehouseordercode");
            return (Criteria) this;
        }

        public Criteria andWarehouseordercodeGreaterThan(String value) {
            addCriterion("warehouseOrderCode >", value, "warehouseordercode");
            return (Criteria) this;
        }

        public Criteria andWarehouseordercodeGreaterThanOrEqualTo(String value) {
            addCriterion("warehouseOrderCode >=", value, "warehouseordercode");
            return (Criteria) this;
        }

        public Criteria andWarehouseordercodeLessThan(String value) {
            addCriterion("warehouseOrderCode <", value, "warehouseordercode");
            return (Criteria) this;
        }

        public Criteria andWarehouseordercodeLessThanOrEqualTo(String value) {
            addCriterion("warehouseOrderCode <=", value, "warehouseordercode");
            return (Criteria) this;
        }

        public Criteria andWarehouseordercodeLike(String value) {
            addCriterion("warehouseOrderCode like", value, "warehouseordercode");
            return (Criteria) this;
        }

        public Criteria andWarehouseordercodeNotLike(String value) {
            addCriterion("warehouseOrderCode not like", value, "warehouseordercode");
            return (Criteria) this;
        }

        public Criteria andWarehouseordercodeIn(List<String> values) {
            addCriterion("warehouseOrderCode in", values, "warehouseordercode");
            return (Criteria) this;
        }

        public Criteria andWarehouseordercodeNotIn(List<String> values) {
            addCriterion("warehouseOrderCode not in", values, "warehouseordercode");
            return (Criteria) this;
        }

        public Criteria andWarehouseordercodeBetween(String value1, String value2) {
            addCriterion("warehouseOrderCode between", value1, value2, "warehouseordercode");
            return (Criteria) this;
        }

        public Criteria andWarehouseordercodeNotBetween(String value1, String value2) {
            addCriterion("warehouseOrderCode not between", value1, value2, "warehouseordercode");
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

        public Criteria andCreateddateEqualTo(Date value) {
            addCriterion("createdDate =", value, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateNotEqualTo(Date value) {
            addCriterion("createdDate <>", value, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateGreaterThan(Date value) {
            addCriterion("createdDate >", value, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateGreaterThanOrEqualTo(Date value) {
            addCriterion("createdDate >=", value, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateLessThan(Date value) {
            addCriterion("createdDate <", value, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateLessThanOrEqualTo(Date value) {
            addCriterion("createdDate <=", value, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateIn(List<Date> values) {
            addCriterion("createdDate in", values, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateNotIn(List<Date> values) {
            addCriterion("createdDate not in", values, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateBetween(Date value1, Date value2) {
            addCriterion("createdDate between", value1, value2, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateNotBetween(Date value1, Date value2) {
            addCriterion("createdDate not between", value1, value2, "createddate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIsNull() {
            addCriterion("updateDate is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIsNotNull() {
            addCriterion("updateDate is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedateEqualTo(Date value) {
            addCriterion("updateDate =", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotEqualTo(Date value) {
            addCriterion("updateDate <>", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateGreaterThan(Date value) {
            addCriterion("updateDate >", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("updateDate >=", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateLessThan(Date value) {
            addCriterion("updateDate <", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateLessThanOrEqualTo(Date value) {
            addCriterion("updateDate <=", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIn(List<Date> values) {
            addCriterion("updateDate in", values, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotIn(List<Date> values) {
            addCriterion("updateDate not in", values, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateBetween(Date value1, Date value2) {
            addCriterion("updateDate between", value1, value2, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotBetween(Date value1, Date value2) {
            addCriterion("updateDate not between", value1, value2, "updatedate");
            return (Criteria) this;
        }

        public Criteria andDatepaidplatformIsNull() {
            addCriterion("datePaidPlatform is null");
            return (Criteria) this;
        }

        public Criteria andDatepaidplatformIsNotNull() {
            addCriterion("datePaidPlatform is not null");
            return (Criteria) this;
        }

        public Criteria andDatepaidplatformEqualTo(Date value) {
            addCriterion("datePaidPlatform =", value, "datepaidplatform");
            return (Criteria) this;
        }

        public Criteria andDatepaidplatformNotEqualTo(Date value) {
            addCriterion("datePaidPlatform <>", value, "datepaidplatform");
            return (Criteria) this;
        }

        public Criteria andDatepaidplatformGreaterThan(Date value) {
            addCriterion("datePaidPlatform >", value, "datepaidplatform");
            return (Criteria) this;
        }

        public Criteria andDatepaidplatformGreaterThanOrEqualTo(Date value) {
            addCriterion("datePaidPlatform >=", value, "datepaidplatform");
            return (Criteria) this;
        }

        public Criteria andDatepaidplatformLessThan(Date value) {
            addCriterion("datePaidPlatform <", value, "datepaidplatform");
            return (Criteria) this;
        }

        public Criteria andDatepaidplatformLessThanOrEqualTo(Date value) {
            addCriterion("datePaidPlatform <=", value, "datepaidplatform");
            return (Criteria) this;
        }

        public Criteria andDatepaidplatformIn(List<Date> values) {
            addCriterion("datePaidPlatform in", values, "datepaidplatform");
            return (Criteria) this;
        }

        public Criteria andDatepaidplatformNotIn(List<Date> values) {
            addCriterion("datePaidPlatform not in", values, "datepaidplatform");
            return (Criteria) this;
        }

        public Criteria andDatepaidplatformBetween(Date value1, Date value2) {
            addCriterion("datePaidPlatform between", value1, value2, "datepaidplatform");
            return (Criteria) this;
        }

        public Criteria andDatepaidplatformNotBetween(Date value1, Date value2) {
            addCriterion("datePaidPlatform not between", value1, value2, "datepaidplatform");
            return (Criteria) this;
        }

        public Criteria andDatecreateplatformIsNull() {
            addCriterion("dateCreatePlatform is null");
            return (Criteria) this;
        }

        public Criteria andDatecreateplatformIsNotNull() {
            addCriterion("dateCreatePlatform is not null");
            return (Criteria) this;
        }

        public Criteria andDatecreateplatformEqualTo(Date value) {
            addCriterion("dateCreatePlatform =", value, "datecreateplatform");
            return (Criteria) this;
        }

        public Criteria andDatecreateplatformNotEqualTo(Date value) {
            addCriterion("dateCreatePlatform <>", value, "datecreateplatform");
            return (Criteria) this;
        }

        public Criteria andDatecreateplatformGreaterThan(Date value) {
            addCriterion("dateCreatePlatform >", value, "datecreateplatform");
            return (Criteria) this;
        }

        public Criteria andDatecreateplatformGreaterThanOrEqualTo(Date value) {
            addCriterion("dateCreatePlatform >=", value, "datecreateplatform");
            return (Criteria) this;
        }

        public Criteria andDatecreateplatformLessThan(Date value) {
            addCriterion("dateCreatePlatform <", value, "datecreateplatform");
            return (Criteria) this;
        }

        public Criteria andDatecreateplatformLessThanOrEqualTo(Date value) {
            addCriterion("dateCreatePlatform <=", value, "datecreateplatform");
            return (Criteria) this;
        }

        public Criteria andDatecreateplatformIn(List<Date> values) {
            addCriterion("dateCreatePlatform in", values, "datecreateplatform");
            return (Criteria) this;
        }

        public Criteria andDatecreateplatformNotIn(List<Date> values) {
            addCriterion("dateCreatePlatform not in", values, "datecreateplatform");
            return (Criteria) this;
        }

        public Criteria andDatecreateplatformBetween(Date value1, Date value2) {
            addCriterion("dateCreatePlatform between", value1, value2, "datecreateplatform");
            return (Criteria) this;
        }

        public Criteria andDatecreateplatformNotBetween(Date value1, Date value2) {
            addCriterion("dateCreatePlatform not between", value1, value2, "datecreateplatform");
            return (Criteria) this;
        }

        public Criteria andPlatformshipstatusIsNull() {
            addCriterion("platformShipStatus is null");
            return (Criteria) this;
        }

        public Criteria andPlatformshipstatusIsNotNull() {
            addCriterion("platformShipStatus is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformshipstatusEqualTo(Integer value) {
            addCriterion("platformShipStatus =", value, "platformshipstatus");
            return (Criteria) this;
        }

        public Criteria andPlatformshipstatusNotEqualTo(Integer value) {
            addCriterion("platformShipStatus <>", value, "platformshipstatus");
            return (Criteria) this;
        }

        public Criteria andPlatformshipstatusGreaterThan(Integer value) {
            addCriterion("platformShipStatus >", value, "platformshipstatus");
            return (Criteria) this;
        }

        public Criteria andPlatformshipstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("platformShipStatus >=", value, "platformshipstatus");
            return (Criteria) this;
        }

        public Criteria andPlatformshipstatusLessThan(Integer value) {
            addCriterion("platformShipStatus <", value, "platformshipstatus");
            return (Criteria) this;
        }

        public Criteria andPlatformshipstatusLessThanOrEqualTo(Integer value) {
            addCriterion("platformShipStatus <=", value, "platformshipstatus");
            return (Criteria) this;
        }

        public Criteria andPlatformshipstatusIn(List<Integer> values) {
            addCriterion("platformShipStatus in", values, "platformshipstatus");
            return (Criteria) this;
        }

        public Criteria andPlatformshipstatusNotIn(List<Integer> values) {
            addCriterion("platformShipStatus not in", values, "platformshipstatus");
            return (Criteria) this;
        }

        public Criteria andPlatformshipstatusBetween(Integer value1, Integer value2) {
            addCriterion("platformShipStatus between", value1, value2, "platformshipstatus");
            return (Criteria) this;
        }

        public Criteria andPlatformshipstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("platformShipStatus not between", value1, value2, "platformshipstatus");
            return (Criteria) this;
        }

        public Criteria andPlatformshiptimeIsNull() {
            addCriterion("platformShipTime is null");
            return (Criteria) this;
        }

        public Criteria andPlatformshiptimeIsNotNull() {
            addCriterion("platformShipTime is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformshiptimeEqualTo(Date value) {
            addCriterion("platformShipTime =", value, "platformshiptime");
            return (Criteria) this;
        }

        public Criteria andPlatformshiptimeNotEqualTo(Date value) {
            addCriterion("platformShipTime <>", value, "platformshiptime");
            return (Criteria) this;
        }

        public Criteria andPlatformshiptimeGreaterThan(Date value) {
            addCriterion("platformShipTime >", value, "platformshiptime");
            return (Criteria) this;
        }

        public Criteria andPlatformshiptimeGreaterThanOrEqualTo(Date value) {
            addCriterion("platformShipTime >=", value, "platformshiptime");
            return (Criteria) this;
        }

        public Criteria andPlatformshiptimeLessThan(Date value) {
            addCriterion("platformShipTime <", value, "platformshiptime");
            return (Criteria) this;
        }

        public Criteria andPlatformshiptimeLessThanOrEqualTo(Date value) {
            addCriterion("platformShipTime <=", value, "platformshiptime");
            return (Criteria) this;
        }

        public Criteria andPlatformshiptimeIn(List<Date> values) {
            addCriterion("platformShipTime in", values, "platformshiptime");
            return (Criteria) this;
        }

        public Criteria andPlatformshiptimeNotIn(List<Date> values) {
            addCriterion("platformShipTime not in", values, "platformshiptime");
            return (Criteria) this;
        }

        public Criteria andPlatformshiptimeBetween(Date value1, Date value2) {
            addCriterion("platformShipTime between", value1, value2, "platformshiptime");
            return (Criteria) this;
        }

        public Criteria andPlatformshiptimeNotBetween(Date value1, Date value2) {
            addCriterion("platformShipTime not between", value1, value2, "platformshiptime");
            return (Criteria) this;
        }

        public Criteria andDatewarehouseshippingIsNull() {
            addCriterion("dateWarehouseShipping is null");
            return (Criteria) this;
        }

        public Criteria andDatewarehouseshippingIsNotNull() {
            addCriterion("dateWarehouseShipping is not null");
            return (Criteria) this;
        }

        public Criteria andDatewarehouseshippingEqualTo(Date value) {
            addCriterion("dateWarehouseShipping =", value, "datewarehouseshipping");
            return (Criteria) this;
        }

        public Criteria andDatewarehouseshippingNotEqualTo(Date value) {
            addCriterion("dateWarehouseShipping <>", value, "datewarehouseshipping");
            return (Criteria) this;
        }

        public Criteria andDatewarehouseshippingGreaterThan(Date value) {
            addCriterion("dateWarehouseShipping >", value, "datewarehouseshipping");
            return (Criteria) this;
        }

        public Criteria andDatewarehouseshippingGreaterThanOrEqualTo(Date value) {
            addCriterion("dateWarehouseShipping >=", value, "datewarehouseshipping");
            return (Criteria) this;
        }

        public Criteria andDatewarehouseshippingLessThan(Date value) {
            addCriterion("dateWarehouseShipping <", value, "datewarehouseshipping");
            return (Criteria) this;
        }

        public Criteria andDatewarehouseshippingLessThanOrEqualTo(Date value) {
            addCriterion("dateWarehouseShipping <=", value, "datewarehouseshipping");
            return (Criteria) this;
        }

        public Criteria andDatewarehouseshippingIn(List<Date> values) {
            addCriterion("dateWarehouseShipping in", values, "datewarehouseshipping");
            return (Criteria) this;
        }

        public Criteria andDatewarehouseshippingNotIn(List<Date> values) {
            addCriterion("dateWarehouseShipping not in", values, "datewarehouseshipping");
            return (Criteria) this;
        }

        public Criteria andDatewarehouseshippingBetween(Date value1, Date value2) {
            addCriterion("dateWarehouseShipping between", value1, value2, "datewarehouseshipping");
            return (Criteria) this;
        }

        public Criteria andDatewarehouseshippingNotBetween(Date value1, Date value2) {
            addCriterion("dateWarehouseShipping not between", value1, value2, "datewarehouseshipping");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNull() {
            addCriterion("currency is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNotNull() {
            addCriterion("currency is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyEqualTo(String value) {
            addCriterion("currency =", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotEqualTo(String value) {
            addCriterion("currency <>", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThan(String value) {
            addCriterion("currency >", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("currency >=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThan(String value) {
            addCriterion("currency <", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThanOrEqualTo(String value) {
            addCriterion("currency <=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLike(String value) {
            addCriterion("currency like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotLike(String value) {
            addCriterion("currency not like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyIn(List<String> values) {
            addCriterion("currency in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotIn(List<String> values) {
            addCriterion("currency not in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyBetween(String value1, String value2) {
            addCriterion("currency between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotBetween(String value1, String value2) {
            addCriterion("currency not between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andAmountpaidIsNull() {
            addCriterion("amountpaid is null");
            return (Criteria) this;
        }

        public Criteria andAmountpaidIsNotNull() {
            addCriterion("amountpaid is not null");
            return (Criteria) this;
        }

        public Criteria andAmountpaidEqualTo(Float value) {
            addCriterion("amountpaid =", value, "amountpaid");
            return (Criteria) this;
        }

        public Criteria andAmountpaidNotEqualTo(Float value) {
            addCriterion("amountpaid <>", value, "amountpaid");
            return (Criteria) this;
        }

        public Criteria andAmountpaidGreaterThan(Float value) {
            addCriterion("amountpaid >", value, "amountpaid");
            return (Criteria) this;
        }

        public Criteria andAmountpaidGreaterThanOrEqualTo(Float value) {
            addCriterion("amountpaid >=", value, "amountpaid");
            return (Criteria) this;
        }

        public Criteria andAmountpaidLessThan(Float value) {
            addCriterion("amountpaid <", value, "amountpaid");
            return (Criteria) this;
        }

        public Criteria andAmountpaidLessThanOrEqualTo(Float value) {
            addCriterion("amountpaid <=", value, "amountpaid");
            return (Criteria) this;
        }

        public Criteria andAmountpaidIn(List<Float> values) {
            addCriterion("amountpaid in", values, "amountpaid");
            return (Criteria) this;
        }

        public Criteria andAmountpaidNotIn(List<Float> values) {
            addCriterion("amountpaid not in", values, "amountpaid");
            return (Criteria) this;
        }

        public Criteria andAmountpaidBetween(Float value1, Float value2) {
            addCriterion("amountpaid between", value1, value2, "amountpaid");
            return (Criteria) this;
        }

        public Criteria andAmountpaidNotBetween(Float value1, Float value2) {
            addCriterion("amountpaid not between", value1, value2, "amountpaid");
            return (Criteria) this;
        }

        public Criteria andSubtotalIsNull() {
            addCriterion("subtotal is null");
            return (Criteria) this;
        }

        public Criteria andSubtotalIsNotNull() {
            addCriterion("subtotal is not null");
            return (Criteria) this;
        }

        public Criteria andSubtotalEqualTo(Float value) {
            addCriterion("subtotal =", value, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalNotEqualTo(Float value) {
            addCriterion("subtotal <>", value, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalGreaterThan(Float value) {
            addCriterion("subtotal >", value, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalGreaterThanOrEqualTo(Float value) {
            addCriterion("subtotal >=", value, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalLessThan(Float value) {
            addCriterion("subtotal <", value, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalLessThanOrEqualTo(Float value) {
            addCriterion("subtotal <=", value, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalIn(List<Float> values) {
            addCriterion("subtotal in", values, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalNotIn(List<Float> values) {
            addCriterion("subtotal not in", values, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalBetween(Float value1, Float value2) {
            addCriterion("subtotal between", value1, value2, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalNotBetween(Float value1, Float value2) {
            addCriterion("subtotal not between", value1, value2, "subtotal");
            return (Criteria) this;
        }

        public Criteria andShipfeeIsNull() {
            addCriterion("shipFee is null");
            return (Criteria) this;
        }

        public Criteria andShipfeeIsNotNull() {
            addCriterion("shipFee is not null");
            return (Criteria) this;
        }

        public Criteria andShipfeeEqualTo(Float value) {
            addCriterion("shipFee =", value, "shipfee");
            return (Criteria) this;
        }

        public Criteria andShipfeeNotEqualTo(Float value) {
            addCriterion("shipFee <>", value, "shipfee");
            return (Criteria) this;
        }

        public Criteria andShipfeeGreaterThan(Float value) {
            addCriterion("shipFee >", value, "shipfee");
            return (Criteria) this;
        }

        public Criteria andShipfeeGreaterThanOrEqualTo(Float value) {
            addCriterion("shipFee >=", value, "shipfee");
            return (Criteria) this;
        }

        public Criteria andShipfeeLessThan(Float value) {
            addCriterion("shipFee <", value, "shipfee");
            return (Criteria) this;
        }

        public Criteria andShipfeeLessThanOrEqualTo(Float value) {
            addCriterion("shipFee <=", value, "shipfee");
            return (Criteria) this;
        }

        public Criteria andShipfeeIn(List<Float> values) {
            addCriterion("shipFee in", values, "shipfee");
            return (Criteria) this;
        }

        public Criteria andShipfeeNotIn(List<Float> values) {
            addCriterion("shipFee not in", values, "shipfee");
            return (Criteria) this;
        }

        public Criteria andShipfeeBetween(Float value1, Float value2) {
            addCriterion("shipFee between", value1, value2, "shipfee");
            return (Criteria) this;
        }

        public Criteria andShipfeeNotBetween(Float value1, Float value2) {
            addCriterion("shipFee not between", value1, value2, "shipfee");
            return (Criteria) this;
        }

        public Criteria andPlatformfeetotalIsNull() {
            addCriterion("platformFeeTotal is null");
            return (Criteria) this;
        }

        public Criteria andPlatformfeetotalIsNotNull() {
            addCriterion("platformFeeTotal is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformfeetotalEqualTo(Float value) {
            addCriterion("platformFeeTotal =", value, "platformfeetotal");
            return (Criteria) this;
        }

        public Criteria andPlatformfeetotalNotEqualTo(Float value) {
            addCriterion("platformFeeTotal <>", value, "platformfeetotal");
            return (Criteria) this;
        }

        public Criteria andPlatformfeetotalGreaterThan(Float value) {
            addCriterion("platformFeeTotal >", value, "platformfeetotal");
            return (Criteria) this;
        }

        public Criteria andPlatformfeetotalGreaterThanOrEqualTo(Float value) {
            addCriterion("platformFeeTotal >=", value, "platformfeetotal");
            return (Criteria) this;
        }

        public Criteria andPlatformfeetotalLessThan(Float value) {
            addCriterion("platformFeeTotal <", value, "platformfeetotal");
            return (Criteria) this;
        }

        public Criteria andPlatformfeetotalLessThanOrEqualTo(Float value) {
            addCriterion("platformFeeTotal <=", value, "platformfeetotal");
            return (Criteria) this;
        }

        public Criteria andPlatformfeetotalIn(List<Float> values) {
            addCriterion("platformFeeTotal in", values, "platformfeetotal");
            return (Criteria) this;
        }

        public Criteria andPlatformfeetotalNotIn(List<Float> values) {
            addCriterion("platformFeeTotal not in", values, "platformfeetotal");
            return (Criteria) this;
        }

        public Criteria andPlatformfeetotalBetween(Float value1, Float value2) {
            addCriterion("platformFeeTotal between", value1, value2, "platformfeetotal");
            return (Criteria) this;
        }

        public Criteria andPlatformfeetotalNotBetween(Float value1, Float value2) {
            addCriterion("platformFeeTotal not between", value1, value2, "platformfeetotal");
            return (Criteria) this;
        }

        public Criteria andFinalvaluefeetotalIsNull() {
            addCriterion("finalvaluefeeTotal is null");
            return (Criteria) this;
        }

        public Criteria andFinalvaluefeetotalIsNotNull() {
            addCriterion("finalvaluefeeTotal is not null");
            return (Criteria) this;
        }

        public Criteria andFinalvaluefeetotalEqualTo(Float value) {
            addCriterion("finalvaluefeeTotal =", value, "finalvaluefeetotal");
            return (Criteria) this;
        }

        public Criteria andFinalvaluefeetotalNotEqualTo(Float value) {
            addCriterion("finalvaluefeeTotal <>", value, "finalvaluefeetotal");
            return (Criteria) this;
        }

        public Criteria andFinalvaluefeetotalGreaterThan(Float value) {
            addCriterion("finalvaluefeeTotal >", value, "finalvaluefeetotal");
            return (Criteria) this;
        }

        public Criteria andFinalvaluefeetotalGreaterThanOrEqualTo(Float value) {
            addCriterion("finalvaluefeeTotal >=", value, "finalvaluefeetotal");
            return (Criteria) this;
        }

        public Criteria andFinalvaluefeetotalLessThan(Float value) {
            addCriterion("finalvaluefeeTotal <", value, "finalvaluefeetotal");
            return (Criteria) this;
        }

        public Criteria andFinalvaluefeetotalLessThanOrEqualTo(Float value) {
            addCriterion("finalvaluefeeTotal <=", value, "finalvaluefeetotal");
            return (Criteria) this;
        }

        public Criteria andFinalvaluefeetotalIn(List<Float> values) {
            addCriterion("finalvaluefeeTotal in", values, "finalvaluefeetotal");
            return (Criteria) this;
        }

        public Criteria andFinalvaluefeetotalNotIn(List<Float> values) {
            addCriterion("finalvaluefeeTotal not in", values, "finalvaluefeetotal");
            return (Criteria) this;
        }

        public Criteria andFinalvaluefeetotalBetween(Float value1, Float value2) {
            addCriterion("finalvaluefeeTotal between", value1, value2, "finalvaluefeetotal");
            return (Criteria) this;
        }

        public Criteria andFinalvaluefeetotalNotBetween(Float value1, Float value2) {
            addCriterion("finalvaluefeeTotal not between", value1, value2, "finalvaluefeetotal");
            return (Criteria) this;
        }

        public Criteria andOtherfeeIsNull() {
            addCriterion("otherFee is null");
            return (Criteria) this;
        }

        public Criteria andOtherfeeIsNotNull() {
            addCriterion("otherFee is not null");
            return (Criteria) this;
        }

        public Criteria andOtherfeeEqualTo(Float value) {
            addCriterion("otherFee =", value, "otherfee");
            return (Criteria) this;
        }

        public Criteria andOtherfeeNotEqualTo(Float value) {
            addCriterion("otherFee <>", value, "otherfee");
            return (Criteria) this;
        }

        public Criteria andOtherfeeGreaterThan(Float value) {
            addCriterion("otherFee >", value, "otherfee");
            return (Criteria) this;
        }

        public Criteria andOtherfeeGreaterThanOrEqualTo(Float value) {
            addCriterion("otherFee >=", value, "otherfee");
            return (Criteria) this;
        }

        public Criteria andOtherfeeLessThan(Float value) {
            addCriterion("otherFee <", value, "otherfee");
            return (Criteria) this;
        }

        public Criteria andOtherfeeLessThanOrEqualTo(Float value) {
            addCriterion("otherFee <=", value, "otherfee");
            return (Criteria) this;
        }

        public Criteria andOtherfeeIn(List<Float> values) {
            addCriterion("otherFee in", values, "otherfee");
            return (Criteria) this;
        }

        public Criteria andOtherfeeNotIn(List<Float> values) {
            addCriterion("otherFee not in", values, "otherfee");
            return (Criteria) this;
        }

        public Criteria andOtherfeeBetween(Float value1, Float value2) {
            addCriterion("otherFee between", value1, value2, "otherfee");
            return (Criteria) this;
        }

        public Criteria andOtherfeeNotBetween(Float value1, Float value2) {
            addCriterion("otherFee not between", value1, value2, "otherfee");
            return (Criteria) this;
        }

        public Criteria andCostshipfeeIsNull() {
            addCriterion("costShipFee is null");
            return (Criteria) this;
        }

        public Criteria andCostshipfeeIsNotNull() {
            addCriterion("costShipFee is not null");
            return (Criteria) this;
        }

        public Criteria andCostshipfeeEqualTo(Float value) {
            addCriterion("costShipFee =", value, "costshipfee");
            return (Criteria) this;
        }

        public Criteria andCostshipfeeNotEqualTo(Float value) {
            addCriterion("costShipFee <>", value, "costshipfee");
            return (Criteria) this;
        }

        public Criteria andCostshipfeeGreaterThan(Float value) {
            addCriterion("costShipFee >", value, "costshipfee");
            return (Criteria) this;
        }

        public Criteria andCostshipfeeGreaterThanOrEqualTo(Float value) {
            addCriterion("costShipFee >=", value, "costshipfee");
            return (Criteria) this;
        }

        public Criteria andCostshipfeeLessThan(Float value) {
            addCriterion("costShipFee <", value, "costshipfee");
            return (Criteria) this;
        }

        public Criteria andCostshipfeeLessThanOrEqualTo(Float value) {
            addCriterion("costShipFee <=", value, "costshipfee");
            return (Criteria) this;
        }

        public Criteria andCostshipfeeIn(List<Float> values) {
            addCriterion("costShipFee in", values, "costshipfee");
            return (Criteria) this;
        }

        public Criteria andCostshipfeeNotIn(List<Float> values) {
            addCriterion("costShipFee not in", values, "costshipfee");
            return (Criteria) this;
        }

        public Criteria andCostshipfeeBetween(Float value1, Float value2) {
            addCriterion("costShipFee between", value1, value2, "costshipfee");
            return (Criteria) this;
        }

        public Criteria andCostshipfeeNotBetween(Float value1, Float value2) {
            addCriterion("costShipFee not between", value1, value2, "costshipfee");
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