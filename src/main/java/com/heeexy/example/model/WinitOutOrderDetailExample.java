package com.heeexy.example.model;

import java.util.ArrayList;
import java.util.List;

public class WinitOutOrderDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WinitOutOrderDetailExample() {
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

        public Criteria andOutboundordernumIsNull() {
            addCriterion("outboundOrderNum is null");
            return (Criteria) this;
        }

        public Criteria andOutboundordernumIsNotNull() {
            addCriterion("outboundOrderNum is not null");
            return (Criteria) this;
        }

        public Criteria andOutboundordernumEqualTo(String value) {
            addCriterion("outboundOrderNum =", value, "outboundordernum");
            return (Criteria) this;
        }

        public Criteria andOutboundordernumNotEqualTo(String value) {
            addCriterion("outboundOrderNum <>", value, "outboundordernum");
            return (Criteria) this;
        }

        public Criteria andOutboundordernumGreaterThan(String value) {
            addCriterion("outboundOrderNum >", value, "outboundordernum");
            return (Criteria) this;
        }

        public Criteria andOutboundordernumGreaterThanOrEqualTo(String value) {
            addCriterion("outboundOrderNum >=", value, "outboundordernum");
            return (Criteria) this;
        }

        public Criteria andOutboundordernumLessThan(String value) {
            addCriterion("outboundOrderNum <", value, "outboundordernum");
            return (Criteria) this;
        }

        public Criteria andOutboundordernumLessThanOrEqualTo(String value) {
            addCriterion("outboundOrderNum <=", value, "outboundordernum");
            return (Criteria) this;
        }

        public Criteria andOutboundordernumLike(String value) {
            addCriterion("outboundOrderNum like", value, "outboundordernum");
            return (Criteria) this;
        }

        public Criteria andOutboundordernumNotLike(String value) {
            addCriterion("outboundOrderNum not like", value, "outboundordernum");
            return (Criteria) this;
        }

        public Criteria andOutboundordernumIn(List<String> values) {
            addCriterion("outboundOrderNum in", values, "outboundordernum");
            return (Criteria) this;
        }

        public Criteria andOutboundordernumNotIn(List<String> values) {
            addCriterion("outboundOrderNum not in", values, "outboundordernum");
            return (Criteria) this;
        }

        public Criteria andOutboundordernumBetween(String value1, String value2) {
            addCriterion("outboundOrderNum between", value1, value2, "outboundordernum");
            return (Criteria) this;
        }

        public Criteria andOutboundordernumNotBetween(String value1, String value2) {
            addCriterion("outboundOrderNum not between", value1, value2, "outboundordernum");
            return (Criteria) this;
        }

        public Criteria andSellerordernoIsNull() {
            addCriterion("sellerOrderNo is null");
            return (Criteria) this;
        }

        public Criteria andSellerordernoIsNotNull() {
            addCriterion("sellerOrderNo is not null");
            return (Criteria) this;
        }

        public Criteria andSellerordernoEqualTo(String value) {
            addCriterion("sellerOrderNo =", value, "sellerorderno");
            return (Criteria) this;
        }

        public Criteria andSellerordernoNotEqualTo(String value) {
            addCriterion("sellerOrderNo <>", value, "sellerorderno");
            return (Criteria) this;
        }

        public Criteria andSellerordernoGreaterThan(String value) {
            addCriterion("sellerOrderNo >", value, "sellerorderno");
            return (Criteria) this;
        }

        public Criteria andSellerordernoGreaterThanOrEqualTo(String value) {
            addCriterion("sellerOrderNo >=", value, "sellerorderno");
            return (Criteria) this;
        }

        public Criteria andSellerordernoLessThan(String value) {
            addCriterion("sellerOrderNo <", value, "sellerorderno");
            return (Criteria) this;
        }

        public Criteria andSellerordernoLessThanOrEqualTo(String value) {
            addCriterion("sellerOrderNo <=", value, "sellerorderno");
            return (Criteria) this;
        }

        public Criteria andSellerordernoLike(String value) {
            addCriterion("sellerOrderNo like", value, "sellerorderno");
            return (Criteria) this;
        }

        public Criteria andSellerordernoNotLike(String value) {
            addCriterion("sellerOrderNo not like", value, "sellerorderno");
            return (Criteria) this;
        }

        public Criteria andSellerordernoIn(List<String> values) {
            addCriterion("sellerOrderNo in", values, "sellerorderno");
            return (Criteria) this;
        }

        public Criteria andSellerordernoNotIn(List<String> values) {
            addCriterion("sellerOrderNo not in", values, "sellerorderno");
            return (Criteria) this;
        }

        public Criteria andSellerordernoBetween(String value1, String value2) {
            addCriterion("sellerOrderNo between", value1, value2, "sellerorderno");
            return (Criteria) this;
        }

        public Criteria andSellerordernoNotBetween(String value1, String value2) {
            addCriterion("sellerOrderNo not between", value1, value2, "sellerorderno");
            return (Criteria) this;
        }

        public Criteria andEbayorderidIsNull() {
            addCriterion("eBayOrderID is null");
            return (Criteria) this;
        }

        public Criteria andEbayorderidIsNotNull() {
            addCriterion("eBayOrderID is not null");
            return (Criteria) this;
        }

        public Criteria andEbayorderidEqualTo(String value) {
            addCriterion("eBayOrderID =", value, "ebayorderid");
            return (Criteria) this;
        }

        public Criteria andEbayorderidNotEqualTo(String value) {
            addCriterion("eBayOrderID <>", value, "ebayorderid");
            return (Criteria) this;
        }

        public Criteria andEbayorderidGreaterThan(String value) {
            addCriterion("eBayOrderID >", value, "ebayorderid");
            return (Criteria) this;
        }

        public Criteria andEbayorderidGreaterThanOrEqualTo(String value) {
            addCriterion("eBayOrderID >=", value, "ebayorderid");
            return (Criteria) this;
        }

        public Criteria andEbayorderidLessThan(String value) {
            addCriterion("eBayOrderID <", value, "ebayorderid");
            return (Criteria) this;
        }

        public Criteria andEbayorderidLessThanOrEqualTo(String value) {
            addCriterion("eBayOrderID <=", value, "ebayorderid");
            return (Criteria) this;
        }

        public Criteria andEbayorderidLike(String value) {
            addCriterion("eBayOrderID like", value, "ebayorderid");
            return (Criteria) this;
        }

        public Criteria andEbayorderidNotLike(String value) {
            addCriterion("eBayOrderID not like", value, "ebayorderid");
            return (Criteria) this;
        }

        public Criteria andEbayorderidIn(List<String> values) {
            addCriterion("eBayOrderID in", values, "ebayorderid");
            return (Criteria) this;
        }

        public Criteria andEbayorderidNotIn(List<String> values) {
            addCriterion("eBayOrderID not in", values, "ebayorderid");
            return (Criteria) this;
        }

        public Criteria andEbayorderidBetween(String value1, String value2) {
            addCriterion("eBayOrderID between", value1, value2, "ebayorderid");
            return (Criteria) this;
        }

        public Criteria andEbayorderidNotBetween(String value1, String value2) {
            addCriterion("eBayOrderID not between", value1, value2, "ebayorderid");
            return (Criteria) this;
        }

        public Criteria andOutboundorderidIsNull() {
            addCriterion("outboundOrderID is null");
            return (Criteria) this;
        }

        public Criteria andOutboundorderidIsNotNull() {
            addCriterion("outboundOrderID is not null");
            return (Criteria) this;
        }

        public Criteria andOutboundorderidEqualTo(String value) {
            addCriterion("outboundOrderID =", value, "outboundorderid");
            return (Criteria) this;
        }

        public Criteria andOutboundorderidNotEqualTo(String value) {
            addCriterion("outboundOrderID <>", value, "outboundorderid");
            return (Criteria) this;
        }

        public Criteria andOutboundorderidGreaterThan(String value) {
            addCriterion("outboundOrderID >", value, "outboundorderid");
            return (Criteria) this;
        }

        public Criteria andOutboundorderidGreaterThanOrEqualTo(String value) {
            addCriterion("outboundOrderID >=", value, "outboundorderid");
            return (Criteria) this;
        }

        public Criteria andOutboundorderidLessThan(String value) {
            addCriterion("outboundOrderID <", value, "outboundorderid");
            return (Criteria) this;
        }

        public Criteria andOutboundorderidLessThanOrEqualTo(String value) {
            addCriterion("outboundOrderID <=", value, "outboundorderid");
            return (Criteria) this;
        }

        public Criteria andOutboundorderidLike(String value) {
            addCriterion("outboundOrderID like", value, "outboundorderid");
            return (Criteria) this;
        }

        public Criteria andOutboundorderidNotLike(String value) {
            addCriterion("outboundOrderID not like", value, "outboundorderid");
            return (Criteria) this;
        }

        public Criteria andOutboundorderidIn(List<String> values) {
            addCriterion("outboundOrderID in", values, "outboundorderid");
            return (Criteria) this;
        }

        public Criteria andOutboundorderidNotIn(List<String> values) {
            addCriterion("outboundOrderID not in", values, "outboundorderid");
            return (Criteria) this;
        }

        public Criteria andOutboundorderidBetween(String value1, String value2) {
            addCriterion("outboundOrderID between", value1, value2, "outboundorderid");
            return (Criteria) this;
        }

        public Criteria andOutboundorderidNotBetween(String value1, String value2) {
            addCriterion("outboundOrderID not between", value1, value2, "outboundorderid");
            return (Criteria) this;
        }

        public Criteria andWarehousenameIsNull() {
            addCriterion("warehouseName is null");
            return (Criteria) this;
        }

        public Criteria andWarehousenameIsNotNull() {
            addCriterion("warehouseName is not null");
            return (Criteria) this;
        }

        public Criteria andWarehousenameEqualTo(String value) {
            addCriterion("warehouseName =", value, "warehousename");
            return (Criteria) this;
        }

        public Criteria andWarehousenameNotEqualTo(String value) {
            addCriterion("warehouseName <>", value, "warehousename");
            return (Criteria) this;
        }

        public Criteria andWarehousenameGreaterThan(String value) {
            addCriterion("warehouseName >", value, "warehousename");
            return (Criteria) this;
        }

        public Criteria andWarehousenameGreaterThanOrEqualTo(String value) {
            addCriterion("warehouseName >=", value, "warehousename");
            return (Criteria) this;
        }

        public Criteria andWarehousenameLessThan(String value) {
            addCriterion("warehouseName <", value, "warehousename");
            return (Criteria) this;
        }

        public Criteria andWarehousenameLessThanOrEqualTo(String value) {
            addCriterion("warehouseName <=", value, "warehousename");
            return (Criteria) this;
        }

        public Criteria andWarehousenameLike(String value) {
            addCriterion("warehouseName like", value, "warehousename");
            return (Criteria) this;
        }

        public Criteria andWarehousenameNotLike(String value) {
            addCriterion("warehouseName not like", value, "warehousename");
            return (Criteria) this;
        }

        public Criteria andWarehousenameIn(List<String> values) {
            addCriterion("warehouseName in", values, "warehousename");
            return (Criteria) this;
        }

        public Criteria andWarehousenameNotIn(List<String> values) {
            addCriterion("warehouseName not in", values, "warehousename");
            return (Criteria) this;
        }

        public Criteria andWarehousenameBetween(String value1, String value2) {
            addCriterion("warehouseName between", value1, value2, "warehousename");
            return (Criteria) this;
        }

        public Criteria andWarehousenameNotBetween(String value1, String value2) {
            addCriterion("warehouseName not between", value1, value2, "warehousename");
            return (Criteria) this;
        }

        public Criteria andWarehouseidIsNull() {
            addCriterion("warehouseID is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseidIsNotNull() {
            addCriterion("warehouseID is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseidEqualTo(String value) {
            addCriterion("warehouseID =", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidNotEqualTo(String value) {
            addCriterion("warehouseID <>", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidGreaterThan(String value) {
            addCriterion("warehouseID >", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidGreaterThanOrEqualTo(String value) {
            addCriterion("warehouseID >=", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidLessThan(String value) {
            addCriterion("warehouseID <", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidLessThanOrEqualTo(String value) {
            addCriterion("warehouseID <=", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidLike(String value) {
            addCriterion("warehouseID like", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidNotLike(String value) {
            addCriterion("warehouseID not like", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidIn(List<String> values) {
            addCriterion("warehouseID in", values, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidNotIn(List<String> values) {
            addCriterion("warehouseID not in", values, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidBetween(String value1, String value2) {
            addCriterion("warehouseID between", value1, value2, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidNotBetween(String value1, String value2) {
            addCriterion("warehouseID not between", value1, value2, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andOrderedtimeIsNull() {
            addCriterion("orderedTime is null");
            return (Criteria) this;
        }

        public Criteria andOrderedtimeIsNotNull() {
            addCriterion("orderedTime is not null");
            return (Criteria) this;
        }

        public Criteria andOrderedtimeEqualTo(String value) {
            addCriterion("orderedTime =", value, "orderedtime");
            return (Criteria) this;
        }

        public Criteria andOrderedtimeNotEqualTo(String value) {
            addCriterion("orderedTime <>", value, "orderedtime");
            return (Criteria) this;
        }

        public Criteria andOrderedtimeGreaterThan(String value) {
            addCriterion("orderedTime >", value, "orderedtime");
            return (Criteria) this;
        }

        public Criteria andOrderedtimeGreaterThanOrEqualTo(String value) {
            addCriterion("orderedTime >=", value, "orderedtime");
            return (Criteria) this;
        }

        public Criteria andOrderedtimeLessThan(String value) {
            addCriterion("orderedTime <", value, "orderedtime");
            return (Criteria) this;
        }

        public Criteria andOrderedtimeLessThanOrEqualTo(String value) {
            addCriterion("orderedTime <=", value, "orderedtime");
            return (Criteria) this;
        }

        public Criteria andOrderedtimeLike(String value) {
            addCriterion("orderedTime like", value, "orderedtime");
            return (Criteria) this;
        }

        public Criteria andOrderedtimeNotLike(String value) {
            addCriterion("orderedTime not like", value, "orderedtime");
            return (Criteria) this;
        }

        public Criteria andOrderedtimeIn(List<String> values) {
            addCriterion("orderedTime in", values, "orderedtime");
            return (Criteria) this;
        }

        public Criteria andOrderedtimeNotIn(List<String> values) {
            addCriterion("orderedTime not in", values, "orderedtime");
            return (Criteria) this;
        }

        public Criteria andOrderedtimeBetween(String value1, String value2) {
            addCriterion("orderedTime between", value1, value2, "orderedtime");
            return (Criteria) this;
        }

        public Criteria andOrderedtimeNotBetween(String value1, String value2) {
            addCriterion("orderedTime not between", value1, value2, "orderedtime");
            return (Criteria) this;
        }

        public Criteria andOutbounddateIsNull() {
            addCriterion("outboundDate is null");
            return (Criteria) this;
        }

        public Criteria andOutbounddateIsNotNull() {
            addCriterion("outboundDate is not null");
            return (Criteria) this;
        }

        public Criteria andOutbounddateEqualTo(String value) {
            addCriterion("outboundDate =", value, "outbounddate");
            return (Criteria) this;
        }

        public Criteria andOutbounddateNotEqualTo(String value) {
            addCriterion("outboundDate <>", value, "outbounddate");
            return (Criteria) this;
        }

        public Criteria andOutbounddateGreaterThan(String value) {
            addCriterion("outboundDate >", value, "outbounddate");
            return (Criteria) this;
        }

        public Criteria andOutbounddateGreaterThanOrEqualTo(String value) {
            addCriterion("outboundDate >=", value, "outbounddate");
            return (Criteria) this;
        }

        public Criteria andOutbounddateLessThan(String value) {
            addCriterion("outboundDate <", value, "outbounddate");
            return (Criteria) this;
        }

        public Criteria andOutbounddateLessThanOrEqualTo(String value) {
            addCriterion("outboundDate <=", value, "outbounddate");
            return (Criteria) this;
        }

        public Criteria andOutbounddateLike(String value) {
            addCriterion("outboundDate like", value, "outbounddate");
            return (Criteria) this;
        }

        public Criteria andOutbounddateNotLike(String value) {
            addCriterion("outboundDate not like", value, "outbounddate");
            return (Criteria) this;
        }

        public Criteria andOutbounddateIn(List<String> values) {
            addCriterion("outboundDate in", values, "outbounddate");
            return (Criteria) this;
        }

        public Criteria andOutbounddateNotIn(List<String> values) {
            addCriterion("outboundDate not in", values, "outbounddate");
            return (Criteria) this;
        }

        public Criteria andOutbounddateBetween(String value1, String value2) {
            addCriterion("outboundDate between", value1, value2, "outbounddate");
            return (Criteria) this;
        }

        public Criteria andOutbounddateNotBetween(String value1, String value2) {
            addCriterion("outboundDate not between", value1, value2, "outbounddate");
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

        public Criteria andStatusnameIsNull() {
            addCriterion("statusName is null");
            return (Criteria) this;
        }

        public Criteria andStatusnameIsNotNull() {
            addCriterion("statusName is not null");
            return (Criteria) this;
        }

        public Criteria andStatusnameEqualTo(String value) {
            addCriterion("statusName =", value, "statusname");
            return (Criteria) this;
        }

        public Criteria andStatusnameNotEqualTo(String value) {
            addCriterion("statusName <>", value, "statusname");
            return (Criteria) this;
        }

        public Criteria andStatusnameGreaterThan(String value) {
            addCriterion("statusName >", value, "statusname");
            return (Criteria) this;
        }

        public Criteria andStatusnameGreaterThanOrEqualTo(String value) {
            addCriterion("statusName >=", value, "statusname");
            return (Criteria) this;
        }

        public Criteria andStatusnameLessThan(String value) {
            addCriterion("statusName <", value, "statusname");
            return (Criteria) this;
        }

        public Criteria andStatusnameLessThanOrEqualTo(String value) {
            addCriterion("statusName <=", value, "statusname");
            return (Criteria) this;
        }

        public Criteria andStatusnameLike(String value) {
            addCriterion("statusName like", value, "statusname");
            return (Criteria) this;
        }

        public Criteria andStatusnameNotLike(String value) {
            addCriterion("statusName not like", value, "statusname");
            return (Criteria) this;
        }

        public Criteria andStatusnameIn(List<String> values) {
            addCriterion("statusName in", values, "statusname");
            return (Criteria) this;
        }

        public Criteria andStatusnameNotIn(List<String> values) {
            addCriterion("statusName not in", values, "statusname");
            return (Criteria) this;
        }

        public Criteria andStatusnameBetween(String value1, String value2) {
            addCriterion("statusName between", value1, value2, "statusname");
            return (Criteria) this;
        }

        public Criteria andStatusnameNotBetween(String value1, String value2) {
            addCriterion("statusName not between", value1, value2, "statusname");
            return (Criteria) this;
        }

        public Criteria andReasonforvoidIsNull() {
            addCriterion("reasonForVoid is null");
            return (Criteria) this;
        }

        public Criteria andReasonforvoidIsNotNull() {
            addCriterion("reasonForVoid is not null");
            return (Criteria) this;
        }

        public Criteria andReasonforvoidEqualTo(String value) {
            addCriterion("reasonForVoid =", value, "reasonforvoid");
            return (Criteria) this;
        }

        public Criteria andReasonforvoidNotEqualTo(String value) {
            addCriterion("reasonForVoid <>", value, "reasonforvoid");
            return (Criteria) this;
        }

        public Criteria andReasonforvoidGreaterThan(String value) {
            addCriterion("reasonForVoid >", value, "reasonforvoid");
            return (Criteria) this;
        }

        public Criteria andReasonforvoidGreaterThanOrEqualTo(String value) {
            addCriterion("reasonForVoid >=", value, "reasonforvoid");
            return (Criteria) this;
        }

        public Criteria andReasonforvoidLessThan(String value) {
            addCriterion("reasonForVoid <", value, "reasonforvoid");
            return (Criteria) this;
        }

        public Criteria andReasonforvoidLessThanOrEqualTo(String value) {
            addCriterion("reasonForVoid <=", value, "reasonforvoid");
            return (Criteria) this;
        }

        public Criteria andReasonforvoidLike(String value) {
            addCriterion("reasonForVoid like", value, "reasonforvoid");
            return (Criteria) this;
        }

        public Criteria andReasonforvoidNotLike(String value) {
            addCriterion("reasonForVoid not like", value, "reasonforvoid");
            return (Criteria) this;
        }

        public Criteria andReasonforvoidIn(List<String> values) {
            addCriterion("reasonForVoid in", values, "reasonforvoid");
            return (Criteria) this;
        }

        public Criteria andReasonforvoidNotIn(List<String> values) {
            addCriterion("reasonForVoid not in", values, "reasonforvoid");
            return (Criteria) this;
        }

        public Criteria andReasonforvoidBetween(String value1, String value2) {
            addCriterion("reasonForVoid between", value1, value2, "reasonforvoid");
            return (Criteria) this;
        }

        public Criteria andReasonforvoidNotBetween(String value1, String value2) {
            addCriterion("reasonForVoid not between", value1, value2, "reasonforvoid");
            return (Criteria) this;
        }

        public Criteria andChargeableweightIsNull() {
            addCriterion("chargeableWeight is null");
            return (Criteria) this;
        }

        public Criteria andChargeableweightIsNotNull() {
            addCriterion("chargeableWeight is not null");
            return (Criteria) this;
        }

        public Criteria andChargeableweightEqualTo(Double value) {
            addCriterion("chargeableWeight =", value, "chargeableweight");
            return (Criteria) this;
        }

        public Criteria andChargeableweightNotEqualTo(Double value) {
            addCriterion("chargeableWeight <>", value, "chargeableweight");
            return (Criteria) this;
        }

        public Criteria andChargeableweightGreaterThan(Double value) {
            addCriterion("chargeableWeight >", value, "chargeableweight");
            return (Criteria) this;
        }

        public Criteria andChargeableweightGreaterThanOrEqualTo(Double value) {
            addCriterion("chargeableWeight >=", value, "chargeableweight");
            return (Criteria) this;
        }

        public Criteria andChargeableweightLessThan(Double value) {
            addCriterion("chargeableWeight <", value, "chargeableweight");
            return (Criteria) this;
        }

        public Criteria andChargeableweightLessThanOrEqualTo(Double value) {
            addCriterion("chargeableWeight <=", value, "chargeableweight");
            return (Criteria) this;
        }

        public Criteria andChargeableweightIn(List<Double> values) {
            addCriterion("chargeableWeight in", values, "chargeableweight");
            return (Criteria) this;
        }

        public Criteria andChargeableweightNotIn(List<Double> values) {
            addCriterion("chargeableWeight not in", values, "chargeableweight");
            return (Criteria) this;
        }

        public Criteria andChargeableweightBetween(Double value1, Double value2) {
            addCriterion("chargeableWeight between", value1, value2, "chargeableweight");
            return (Criteria) this;
        }

        public Criteria andChargeableweightNotBetween(Double value1, Double value2) {
            addCriterion("chargeableWeight not between", value1, value2, "chargeableweight");
            return (Criteria) this;
        }

        public Criteria andTransactiondateIsNull() {
            addCriterion("transactionDate is null");
            return (Criteria) this;
        }

        public Criteria andTransactiondateIsNotNull() {
            addCriterion("transactionDate is not null");
            return (Criteria) this;
        }

        public Criteria andTransactiondateEqualTo(String value) {
            addCriterion("transactionDate =", value, "transactiondate");
            return (Criteria) this;
        }

        public Criteria andTransactiondateNotEqualTo(String value) {
            addCriterion("transactionDate <>", value, "transactiondate");
            return (Criteria) this;
        }

        public Criteria andTransactiondateGreaterThan(String value) {
            addCriterion("transactionDate >", value, "transactiondate");
            return (Criteria) this;
        }

        public Criteria andTransactiondateGreaterThanOrEqualTo(String value) {
            addCriterion("transactionDate >=", value, "transactiondate");
            return (Criteria) this;
        }

        public Criteria andTransactiondateLessThan(String value) {
            addCriterion("transactionDate <", value, "transactiondate");
            return (Criteria) this;
        }

        public Criteria andTransactiondateLessThanOrEqualTo(String value) {
            addCriterion("transactionDate <=", value, "transactiondate");
            return (Criteria) this;
        }

        public Criteria andTransactiondateLike(String value) {
            addCriterion("transactionDate like", value, "transactiondate");
            return (Criteria) this;
        }

        public Criteria andTransactiondateNotLike(String value) {
            addCriterion("transactionDate not like", value, "transactiondate");
            return (Criteria) this;
        }

        public Criteria andTransactiondateIn(List<String> values) {
            addCriterion("transactionDate in", values, "transactiondate");
            return (Criteria) this;
        }

        public Criteria andTransactiondateNotIn(List<String> values) {
            addCriterion("transactionDate not in", values, "transactiondate");
            return (Criteria) this;
        }

        public Criteria andTransactiondateBetween(String value1, String value2) {
            addCriterion("transactionDate between", value1, value2, "transactiondate");
            return (Criteria) this;
        }

        public Criteria andTransactiondateNotBetween(String value1, String value2) {
            addCriterion("transactionDate not between", value1, value2, "transactiondate");
            return (Criteria) this;
        }

        public Criteria andDeliverycostsIsNull() {
            addCriterion("deliveryCosts is null");
            return (Criteria) this;
        }

        public Criteria andDeliverycostsIsNotNull() {
            addCriterion("deliveryCosts is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverycostsEqualTo(Double value) {
            addCriterion("deliveryCosts =", value, "deliverycosts");
            return (Criteria) this;
        }

        public Criteria andDeliverycostsNotEqualTo(Double value) {
            addCriterion("deliveryCosts <>", value, "deliverycosts");
            return (Criteria) this;
        }

        public Criteria andDeliverycostsGreaterThan(Double value) {
            addCriterion("deliveryCosts >", value, "deliverycosts");
            return (Criteria) this;
        }

        public Criteria andDeliverycostsGreaterThanOrEqualTo(Double value) {
            addCriterion("deliveryCosts >=", value, "deliverycosts");
            return (Criteria) this;
        }

        public Criteria andDeliverycostsLessThan(Double value) {
            addCriterion("deliveryCosts <", value, "deliverycosts");
            return (Criteria) this;
        }

        public Criteria andDeliverycostsLessThanOrEqualTo(Double value) {
            addCriterion("deliveryCosts <=", value, "deliverycosts");
            return (Criteria) this;
        }

        public Criteria andDeliverycostsIn(List<Double> values) {
            addCriterion("deliveryCosts in", values, "deliverycosts");
            return (Criteria) this;
        }

        public Criteria andDeliverycostsNotIn(List<Double> values) {
            addCriterion("deliveryCosts not in", values, "deliverycosts");
            return (Criteria) this;
        }

        public Criteria andDeliverycostsBetween(Double value1, Double value2) {
            addCriterion("deliveryCosts between", value1, value2, "deliverycosts");
            return (Criteria) this;
        }

        public Criteria andDeliverycostsNotBetween(Double value1, Double value2) {
            addCriterion("deliveryCosts not between", value1, value2, "deliverycosts");
            return (Criteria) this;
        }

        public Criteria andDeliverycostscodeIsNull() {
            addCriterion("deliveryCostsCode is null");
            return (Criteria) this;
        }

        public Criteria andDeliverycostscodeIsNotNull() {
            addCriterion("deliveryCostsCode is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverycostscodeEqualTo(String value) {
            addCriterion("deliveryCostsCode =", value, "deliverycostscode");
            return (Criteria) this;
        }

        public Criteria andDeliverycostscodeNotEqualTo(String value) {
            addCriterion("deliveryCostsCode <>", value, "deliverycostscode");
            return (Criteria) this;
        }

        public Criteria andDeliverycostscodeGreaterThan(String value) {
            addCriterion("deliveryCostsCode >", value, "deliverycostscode");
            return (Criteria) this;
        }

        public Criteria andDeliverycostscodeGreaterThanOrEqualTo(String value) {
            addCriterion("deliveryCostsCode >=", value, "deliverycostscode");
            return (Criteria) this;
        }

        public Criteria andDeliverycostscodeLessThan(String value) {
            addCriterion("deliveryCostsCode <", value, "deliverycostscode");
            return (Criteria) this;
        }

        public Criteria andDeliverycostscodeLessThanOrEqualTo(String value) {
            addCriterion("deliveryCostsCode <=", value, "deliverycostscode");
            return (Criteria) this;
        }

        public Criteria andDeliverycostscodeLike(String value) {
            addCriterion("deliveryCostsCode like", value, "deliverycostscode");
            return (Criteria) this;
        }

        public Criteria andDeliverycostscodeNotLike(String value) {
            addCriterion("deliveryCostsCode not like", value, "deliverycostscode");
            return (Criteria) this;
        }

        public Criteria andDeliverycostscodeIn(List<String> values) {
            addCriterion("deliveryCostsCode in", values, "deliverycostscode");
            return (Criteria) this;
        }

        public Criteria andDeliverycostscodeNotIn(List<String> values) {
            addCriterion("deliveryCostsCode not in", values, "deliverycostscode");
            return (Criteria) this;
        }

        public Criteria andDeliverycostscodeBetween(String value1, String value2) {
            addCriterion("deliveryCostsCode between", value1, value2, "deliverycostscode");
            return (Criteria) this;
        }

        public Criteria andDeliverycostscodeNotBetween(String value1, String value2) {
            addCriterion("deliveryCostsCode not between", value1, value2, "deliverycostscode");
            return (Criteria) this;
        }

        public Criteria andEbayvalidateresultIsNull() {
            addCriterion("eBayValidateResult is null");
            return (Criteria) this;
        }

        public Criteria andEbayvalidateresultIsNotNull() {
            addCriterion("eBayValidateResult is not null");
            return (Criteria) this;
        }

        public Criteria andEbayvalidateresultEqualTo(String value) {
            addCriterion("eBayValidateResult =", value, "ebayvalidateresult");
            return (Criteria) this;
        }

        public Criteria andEbayvalidateresultNotEqualTo(String value) {
            addCriterion("eBayValidateResult <>", value, "ebayvalidateresult");
            return (Criteria) this;
        }

        public Criteria andEbayvalidateresultGreaterThan(String value) {
            addCriterion("eBayValidateResult >", value, "ebayvalidateresult");
            return (Criteria) this;
        }

        public Criteria andEbayvalidateresultGreaterThanOrEqualTo(String value) {
            addCriterion("eBayValidateResult >=", value, "ebayvalidateresult");
            return (Criteria) this;
        }

        public Criteria andEbayvalidateresultLessThan(String value) {
            addCriterion("eBayValidateResult <", value, "ebayvalidateresult");
            return (Criteria) this;
        }

        public Criteria andEbayvalidateresultLessThanOrEqualTo(String value) {
            addCriterion("eBayValidateResult <=", value, "ebayvalidateresult");
            return (Criteria) this;
        }

        public Criteria andEbayvalidateresultLike(String value) {
            addCriterion("eBayValidateResult like", value, "ebayvalidateresult");
            return (Criteria) this;
        }

        public Criteria andEbayvalidateresultNotLike(String value) {
            addCriterion("eBayValidateResult not like", value, "ebayvalidateresult");
            return (Criteria) this;
        }

        public Criteria andEbayvalidateresultIn(List<String> values) {
            addCriterion("eBayValidateResult in", values, "ebayvalidateresult");
            return (Criteria) this;
        }

        public Criteria andEbayvalidateresultNotIn(List<String> values) {
            addCriterion("eBayValidateResult not in", values, "ebayvalidateresult");
            return (Criteria) this;
        }

        public Criteria andEbayvalidateresultBetween(String value1, String value2) {
            addCriterion("eBayValidateResult between", value1, value2, "ebayvalidateresult");
            return (Criteria) this;
        }

        public Criteria andEbayvalidateresultNotBetween(String value1, String value2) {
            addCriterion("eBayValidateResult not between", value1, value2, "ebayvalidateresult");
            return (Criteria) this;
        }

        public Criteria andRebatefeecostsIsNull() {
            addCriterion("rebateFeeCosts is null");
            return (Criteria) this;
        }

        public Criteria andRebatefeecostsIsNotNull() {
            addCriterion("rebateFeeCosts is not null");
            return (Criteria) this;
        }

        public Criteria andRebatefeecostsEqualTo(Double value) {
            addCriterion("rebateFeeCosts =", value, "rebatefeecosts");
            return (Criteria) this;
        }

        public Criteria andRebatefeecostsNotEqualTo(Double value) {
            addCriterion("rebateFeeCosts <>", value, "rebatefeecosts");
            return (Criteria) this;
        }

        public Criteria andRebatefeecostsGreaterThan(Double value) {
            addCriterion("rebateFeeCosts >", value, "rebatefeecosts");
            return (Criteria) this;
        }

        public Criteria andRebatefeecostsGreaterThanOrEqualTo(Double value) {
            addCriterion("rebateFeeCosts >=", value, "rebatefeecosts");
            return (Criteria) this;
        }

        public Criteria andRebatefeecostsLessThan(Double value) {
            addCriterion("rebateFeeCosts <", value, "rebatefeecosts");
            return (Criteria) this;
        }

        public Criteria andRebatefeecostsLessThanOrEqualTo(Double value) {
            addCriterion("rebateFeeCosts <=", value, "rebatefeecosts");
            return (Criteria) this;
        }

        public Criteria andRebatefeecostsIn(List<Double> values) {
            addCriterion("rebateFeeCosts in", values, "rebatefeecosts");
            return (Criteria) this;
        }

        public Criteria andRebatefeecostsNotIn(List<Double> values) {
            addCriterion("rebateFeeCosts not in", values, "rebatefeecosts");
            return (Criteria) this;
        }

        public Criteria andRebatefeecostsBetween(Double value1, Double value2) {
            addCriterion("rebateFeeCosts between", value1, value2, "rebatefeecosts");
            return (Criteria) this;
        }

        public Criteria andRebatefeecostsNotBetween(Double value1, Double value2) {
            addCriterion("rebateFeeCosts not between", value1, value2, "rebatefeecosts");
            return (Criteria) this;
        }

        public Criteria andRebatefeecostscodeIsNull() {
            addCriterion("rebateFeeCostsCode is null");
            return (Criteria) this;
        }

        public Criteria andRebatefeecostscodeIsNotNull() {
            addCriterion("rebateFeeCostsCode is not null");
            return (Criteria) this;
        }

        public Criteria andRebatefeecostscodeEqualTo(String value) {
            addCriterion("rebateFeeCostsCode =", value, "rebatefeecostscode");
            return (Criteria) this;
        }

        public Criteria andRebatefeecostscodeNotEqualTo(String value) {
            addCriterion("rebateFeeCostsCode <>", value, "rebatefeecostscode");
            return (Criteria) this;
        }

        public Criteria andRebatefeecostscodeGreaterThan(String value) {
            addCriterion("rebateFeeCostsCode >", value, "rebatefeecostscode");
            return (Criteria) this;
        }

        public Criteria andRebatefeecostscodeGreaterThanOrEqualTo(String value) {
            addCriterion("rebateFeeCostsCode >=", value, "rebatefeecostscode");
            return (Criteria) this;
        }

        public Criteria andRebatefeecostscodeLessThan(String value) {
            addCriterion("rebateFeeCostsCode <", value, "rebatefeecostscode");
            return (Criteria) this;
        }

        public Criteria andRebatefeecostscodeLessThanOrEqualTo(String value) {
            addCriterion("rebateFeeCostsCode <=", value, "rebatefeecostscode");
            return (Criteria) this;
        }

        public Criteria andRebatefeecostscodeLike(String value) {
            addCriterion("rebateFeeCostsCode like", value, "rebatefeecostscode");
            return (Criteria) this;
        }

        public Criteria andRebatefeecostscodeNotLike(String value) {
            addCriterion("rebateFeeCostsCode not like", value, "rebatefeecostscode");
            return (Criteria) this;
        }

        public Criteria andRebatefeecostscodeIn(List<String> values) {
            addCriterion("rebateFeeCostsCode in", values, "rebatefeecostscode");
            return (Criteria) this;
        }

        public Criteria andRebatefeecostscodeNotIn(List<String> values) {
            addCriterion("rebateFeeCostsCode not in", values, "rebatefeecostscode");
            return (Criteria) this;
        }

        public Criteria andRebatefeecostscodeBetween(String value1, String value2) {
            addCriterion("rebateFeeCostsCode between", value1, value2, "rebatefeecostscode");
            return (Criteria) this;
        }

        public Criteria andRebatefeecostscodeNotBetween(String value1, String value2) {
            addCriterion("rebateFeeCostsCode not between", value1, value2, "rebatefeecostscode");
            return (Criteria) this;
        }

        public Criteria andHandlingfeeIsNull() {
            addCriterion("handlingFee is null");
            return (Criteria) this;
        }

        public Criteria andHandlingfeeIsNotNull() {
            addCriterion("handlingFee is not null");
            return (Criteria) this;
        }

        public Criteria andHandlingfeeEqualTo(Double value) {
            addCriterion("handlingFee =", value, "handlingfee");
            return (Criteria) this;
        }

        public Criteria andHandlingfeeNotEqualTo(Double value) {
            addCriterion("handlingFee <>", value, "handlingfee");
            return (Criteria) this;
        }

        public Criteria andHandlingfeeGreaterThan(Double value) {
            addCriterion("handlingFee >", value, "handlingfee");
            return (Criteria) this;
        }

        public Criteria andHandlingfeeGreaterThanOrEqualTo(Double value) {
            addCriterion("handlingFee >=", value, "handlingfee");
            return (Criteria) this;
        }

        public Criteria andHandlingfeeLessThan(Double value) {
            addCriterion("handlingFee <", value, "handlingfee");
            return (Criteria) this;
        }

        public Criteria andHandlingfeeLessThanOrEqualTo(Double value) {
            addCriterion("handlingFee <=", value, "handlingfee");
            return (Criteria) this;
        }

        public Criteria andHandlingfeeIn(List<Double> values) {
            addCriterion("handlingFee in", values, "handlingfee");
            return (Criteria) this;
        }

        public Criteria andHandlingfeeNotIn(List<Double> values) {
            addCriterion("handlingFee not in", values, "handlingfee");
            return (Criteria) this;
        }

        public Criteria andHandlingfeeBetween(Double value1, Double value2) {
            addCriterion("handlingFee between", value1, value2, "handlingfee");
            return (Criteria) this;
        }

        public Criteria andHandlingfeeNotBetween(Double value1, Double value2) {
            addCriterion("handlingFee not between", value1, value2, "handlingfee");
            return (Criteria) this;
        }

        public Criteria andHandlingfeecodeIsNull() {
            addCriterion("handlingfeeCode is null");
            return (Criteria) this;
        }

        public Criteria andHandlingfeecodeIsNotNull() {
            addCriterion("handlingfeeCode is not null");
            return (Criteria) this;
        }

        public Criteria andHandlingfeecodeEqualTo(String value) {
            addCriterion("handlingfeeCode =", value, "handlingfeecode");
            return (Criteria) this;
        }

        public Criteria andHandlingfeecodeNotEqualTo(String value) {
            addCriterion("handlingfeeCode <>", value, "handlingfeecode");
            return (Criteria) this;
        }

        public Criteria andHandlingfeecodeGreaterThan(String value) {
            addCriterion("handlingfeeCode >", value, "handlingfeecode");
            return (Criteria) this;
        }

        public Criteria andHandlingfeecodeGreaterThanOrEqualTo(String value) {
            addCriterion("handlingfeeCode >=", value, "handlingfeecode");
            return (Criteria) this;
        }

        public Criteria andHandlingfeecodeLessThan(String value) {
            addCriterion("handlingfeeCode <", value, "handlingfeecode");
            return (Criteria) this;
        }

        public Criteria andHandlingfeecodeLessThanOrEqualTo(String value) {
            addCriterion("handlingfeeCode <=", value, "handlingfeecode");
            return (Criteria) this;
        }

        public Criteria andHandlingfeecodeLike(String value) {
            addCriterion("handlingfeeCode like", value, "handlingfeecode");
            return (Criteria) this;
        }

        public Criteria andHandlingfeecodeNotLike(String value) {
            addCriterion("handlingfeeCode not like", value, "handlingfeecode");
            return (Criteria) this;
        }

        public Criteria andHandlingfeecodeIn(List<String> values) {
            addCriterion("handlingfeeCode in", values, "handlingfeecode");
            return (Criteria) this;
        }

        public Criteria andHandlingfeecodeNotIn(List<String> values) {
            addCriterion("handlingfeeCode not in", values, "handlingfeecode");
            return (Criteria) this;
        }

        public Criteria andHandlingfeecodeBetween(String value1, String value2) {
            addCriterion("handlingfeeCode between", value1, value2, "handlingfeecode");
            return (Criteria) this;
        }

        public Criteria andHandlingfeecodeNotBetween(String value1, String value2) {
            addCriterion("handlingfeeCode not between", value1, value2, "handlingfeecode");
            return (Criteria) this;
        }

        public Criteria andTotalcostIsNull() {
            addCriterion("totalCost is null");
            return (Criteria) this;
        }

        public Criteria andTotalcostIsNotNull() {
            addCriterion("totalCost is not null");
            return (Criteria) this;
        }

        public Criteria andTotalcostEqualTo(Double value) {
            addCriterion("totalCost =", value, "totalcost");
            return (Criteria) this;
        }

        public Criteria andTotalcostNotEqualTo(Double value) {
            addCriterion("totalCost <>", value, "totalcost");
            return (Criteria) this;
        }

        public Criteria andTotalcostGreaterThan(Double value) {
            addCriterion("totalCost >", value, "totalcost");
            return (Criteria) this;
        }

        public Criteria andTotalcostGreaterThanOrEqualTo(Double value) {
            addCriterion("totalCost >=", value, "totalcost");
            return (Criteria) this;
        }

        public Criteria andTotalcostLessThan(Double value) {
            addCriterion("totalCost <", value, "totalcost");
            return (Criteria) this;
        }

        public Criteria andTotalcostLessThanOrEqualTo(Double value) {
            addCriterion("totalCost <=", value, "totalcost");
            return (Criteria) this;
        }

        public Criteria andTotalcostIn(List<Double> values) {
            addCriterion("totalCost in", values, "totalcost");
            return (Criteria) this;
        }

        public Criteria andTotalcostNotIn(List<Double> values) {
            addCriterion("totalCost not in", values, "totalcost");
            return (Criteria) this;
        }

        public Criteria andTotalcostBetween(Double value1, Double value2) {
            addCriterion("totalCost between", value1, value2, "totalcost");
            return (Criteria) this;
        }

        public Criteria andTotalcostNotBetween(Double value1, Double value2) {
            addCriterion("totalCost not between", value1, value2, "totalcost");
            return (Criteria) this;
        }

        public Criteria andProductcodeIsNull() {
            addCriterion("productCode is null");
            return (Criteria) this;
        }

        public Criteria andProductcodeIsNotNull() {
            addCriterion("productCode is not null");
            return (Criteria) this;
        }

        public Criteria andProductcodeEqualTo(String value) {
            addCriterion("productCode =", value, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeNotEqualTo(String value) {
            addCriterion("productCode <>", value, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeGreaterThan(String value) {
            addCriterion("productCode >", value, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeGreaterThanOrEqualTo(String value) {
            addCriterion("productCode >=", value, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeLessThan(String value) {
            addCriterion("productCode <", value, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeLessThanOrEqualTo(String value) {
            addCriterion("productCode <=", value, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeLike(String value) {
            addCriterion("productCode like", value, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeNotLike(String value) {
            addCriterion("productCode not like", value, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeIn(List<String> values) {
            addCriterion("productCode in", values, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeNotIn(List<String> values) {
            addCriterion("productCode not in", values, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeBetween(String value1, String value2) {
            addCriterion("productCode between", value1, value2, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeNotBetween(String value1, String value2) {
            addCriterion("productCode not between", value1, value2, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductnumIsNull() {
            addCriterion("productNum is null");
            return (Criteria) this;
        }

        public Criteria andProductnumIsNotNull() {
            addCriterion("productNum is not null");
            return (Criteria) this;
        }

        public Criteria andProductnumEqualTo(Integer value) {
            addCriterion("productNum =", value, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumNotEqualTo(Integer value) {
            addCriterion("productNum <>", value, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumGreaterThan(Integer value) {
            addCriterion("productNum >", value, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("productNum >=", value, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumLessThan(Integer value) {
            addCriterion("productNum <", value, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumLessThanOrEqualTo(Integer value) {
            addCriterion("productNum <=", value, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumIn(List<Integer> values) {
            addCriterion("productNum in", values, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumNotIn(List<Integer> values) {
            addCriterion("productNum not in", values, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumBetween(Integer value1, Integer value2) {
            addCriterion("productNum between", value1, value2, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumNotBetween(Integer value1, Integer value2) {
            addCriterion("productNum not between", value1, value2, "productnum");
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