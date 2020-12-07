package com.heeexy.example.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WarehouseOutWarrantExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WarehouseOutWarrantExample() {
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

        public Criteria andOutnumIsNull() {
            addCriterion("outNum is null");
            return (Criteria) this;
        }

        public Criteria andOutnumIsNotNull() {
            addCriterion("outNum is not null");
            return (Criteria) this;
        }

        public Criteria andOutnumEqualTo(String value) {
            addCriterion("outNum =", value, "outnum");
            return (Criteria) this;
        }

        public Criteria andOutnumNotEqualTo(String value) {
            addCriterion("outNum <>", value, "outnum");
            return (Criteria) this;
        }

        public Criteria andOutnumGreaterThan(String value) {
            addCriterion("outNum >", value, "outnum");
            return (Criteria) this;
        }

        public Criteria andOutnumGreaterThanOrEqualTo(String value) {
            addCriterion("outNum >=", value, "outnum");
            return (Criteria) this;
        }

        public Criteria andOutnumLessThan(String value) {
            addCriterion("outNum <", value, "outnum");
            return (Criteria) this;
        }

        public Criteria andOutnumLessThanOrEqualTo(String value) {
            addCriterion("outNum <=", value, "outnum");
            return (Criteria) this;
        }

        public Criteria andOutnumLike(String value) {
            addCriterion("outNum like", value, "outnum");
            return (Criteria) this;
        }

        public Criteria andOutnumNotLike(String value) {
            addCriterion("outNum not like", value, "outnum");
            return (Criteria) this;
        }

        public Criteria andOutnumIn(List<String> values) {
            addCriterion("outNum in", values, "outnum");
            return (Criteria) this;
        }

        public Criteria andOutnumNotIn(List<String> values) {
            addCriterion("outNum not in", values, "outnum");
            return (Criteria) this;
        }

        public Criteria andOutnumBetween(String value1, String value2) {
            addCriterion("outNum between", value1, value2, "outnum");
            return (Criteria) this;
        }

        public Criteria andOutnumNotBetween(String value1, String value2) {
            addCriterion("outNum not between", value1, value2, "outnum");
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

        public Criteria andUseridIsNull() {
            addCriterion("userID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userID not between", value1, value2, "userid");
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

        public Criteria andWarehouseidIsNull() {
            addCriterion("warehouseID is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseidIsNotNull() {
            addCriterion("warehouseID is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseidEqualTo(Long value) {
            addCriterion("warehouseID =", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidNotEqualTo(Long value) {
            addCriterion("warehouseID <>", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidGreaterThan(Long value) {
            addCriterion("warehouseID >", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidGreaterThanOrEqualTo(Long value) {
            addCriterion("warehouseID >=", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidLessThan(Long value) {
            addCriterion("warehouseID <", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidLessThanOrEqualTo(Long value) {
            addCriterion("warehouseID <=", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidIn(List<Long> values) {
            addCriterion("warehouseID in", values, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidNotIn(List<Long> values) {
            addCriterion("warehouseID not in", values, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidBetween(Long value1, Long value2) {
            addCriterion("warehouseID between", value1, value2, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidNotBetween(Long value1, Long value2) {
            addCriterion("warehouseID not between", value1, value2, "warehouseid");
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

        public Criteria andCreatenameIsNull() {
            addCriterion("createName is null");
            return (Criteria) this;
        }

        public Criteria andCreatenameIsNotNull() {
            addCriterion("createName is not null");
            return (Criteria) this;
        }

        public Criteria andCreatenameEqualTo(String value) {
            addCriterion("createName =", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameNotEqualTo(String value) {
            addCriterion("createName <>", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameGreaterThan(String value) {
            addCriterion("createName >", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameGreaterThanOrEqualTo(String value) {
            addCriterion("createName >=", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameLessThan(String value) {
            addCriterion("createName <", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameLessThanOrEqualTo(String value) {
            addCriterion("createName <=", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameLike(String value) {
            addCriterion("createName like", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameNotLike(String value) {
            addCriterion("createName not like", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameIn(List<String> values) {
            addCriterion("createName in", values, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameNotIn(List<String> values) {
            addCriterion("createName not in", values, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameBetween(String value1, String value2) {
            addCriterion("createName between", value1, value2, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameNotBetween(String value1, String value2) {
            addCriterion("createName not between", value1, value2, "createname");
            return (Criteria) this;
        }

        public Criteria andArrivestatusIsNull() {
            addCriterion("arriveStatus is null");
            return (Criteria) this;
        }

        public Criteria andArrivestatusIsNotNull() {
            addCriterion("arriveStatus is not null");
            return (Criteria) this;
        }

        public Criteria andArrivestatusEqualTo(Integer value) {
            addCriterion("arriveStatus =", value, "arrivestatus");
            return (Criteria) this;
        }

        public Criteria andArrivestatusNotEqualTo(Integer value) {
            addCriterion("arriveStatus <>", value, "arrivestatus");
            return (Criteria) this;
        }

        public Criteria andArrivestatusGreaterThan(Integer value) {
            addCriterion("arriveStatus >", value, "arrivestatus");
            return (Criteria) this;
        }

        public Criteria andArrivestatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("arriveStatus >=", value, "arrivestatus");
            return (Criteria) this;
        }

        public Criteria andArrivestatusLessThan(Integer value) {
            addCriterion("arriveStatus <", value, "arrivestatus");
            return (Criteria) this;
        }

        public Criteria andArrivestatusLessThanOrEqualTo(Integer value) {
            addCriterion("arriveStatus <=", value, "arrivestatus");
            return (Criteria) this;
        }

        public Criteria andArrivestatusIn(List<Integer> values) {
            addCriterion("arriveStatus in", values, "arrivestatus");
            return (Criteria) this;
        }

        public Criteria andArrivestatusNotIn(List<Integer> values) {
            addCriterion("arriveStatus not in", values, "arrivestatus");
            return (Criteria) this;
        }

        public Criteria andArrivestatusBetween(Integer value1, Integer value2) {
            addCriterion("arriveStatus between", value1, value2, "arrivestatus");
            return (Criteria) this;
        }

        public Criteria andArrivestatusNotBetween(Integer value1, Integer value2) {
            addCriterion("arriveStatus not between", value1, value2, "arrivestatus");
            return (Criteria) this;
        }

        public Criteria andWarehouseorderIsNull() {
            addCriterion("warehouseOrder is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseorderIsNotNull() {
            addCriterion("warehouseOrder is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseorderEqualTo(String value) {
            addCriterion("warehouseOrder =", value, "warehouseorder");
            return (Criteria) this;
        }

        public Criteria andWarehouseorderNotEqualTo(String value) {
            addCriterion("warehouseOrder <>", value, "warehouseorder");
            return (Criteria) this;
        }

        public Criteria andWarehouseorderGreaterThan(String value) {
            addCriterion("warehouseOrder >", value, "warehouseorder");
            return (Criteria) this;
        }

        public Criteria andWarehouseorderGreaterThanOrEqualTo(String value) {
            addCriterion("warehouseOrder >=", value, "warehouseorder");
            return (Criteria) this;
        }

        public Criteria andWarehouseorderLessThan(String value) {
            addCriterion("warehouseOrder <", value, "warehouseorder");
            return (Criteria) this;
        }

        public Criteria andWarehouseorderLessThanOrEqualTo(String value) {
            addCriterion("warehouseOrder <=", value, "warehouseorder");
            return (Criteria) this;
        }

        public Criteria andWarehouseorderLike(String value) {
            addCriterion("warehouseOrder like", value, "warehouseorder");
            return (Criteria) this;
        }

        public Criteria andWarehouseorderNotLike(String value) {
            addCriterion("warehouseOrder not like", value, "warehouseorder");
            return (Criteria) this;
        }

        public Criteria andWarehouseorderIn(List<String> values) {
            addCriterion("warehouseOrder in", values, "warehouseorder");
            return (Criteria) this;
        }

        public Criteria andWarehouseorderNotIn(List<String> values) {
            addCriterion("warehouseOrder not in", values, "warehouseorder");
            return (Criteria) this;
        }

        public Criteria andWarehouseorderBetween(String value1, String value2) {
            addCriterion("warehouseOrder between", value1, value2, "warehouseorder");
            return (Criteria) this;
        }

        public Criteria andWarehouseorderNotBetween(String value1, String value2) {
            addCriterion("warehouseOrder not between", value1, value2, "warehouseorder");
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

        public Criteria andCnwarehousenameIsNull() {
            addCriterion("cnWarehouseName is null");
            return (Criteria) this;
        }

        public Criteria andCnwarehousenameIsNotNull() {
            addCriterion("cnWarehouseName is not null");
            return (Criteria) this;
        }

        public Criteria andCnwarehousenameEqualTo(String value) {
            addCriterion("cnWarehouseName =", value, "cnwarehousename");
            return (Criteria) this;
        }

        public Criteria andCnwarehousenameNotEqualTo(String value) {
            addCriterion("cnWarehouseName <>", value, "cnwarehousename");
            return (Criteria) this;
        }

        public Criteria andCnwarehousenameGreaterThan(String value) {
            addCriterion("cnWarehouseName >", value, "cnwarehousename");
            return (Criteria) this;
        }

        public Criteria andCnwarehousenameGreaterThanOrEqualTo(String value) {
            addCriterion("cnWarehouseName >=", value, "cnwarehousename");
            return (Criteria) this;
        }

        public Criteria andCnwarehousenameLessThan(String value) {
            addCriterion("cnWarehouseName <", value, "cnwarehousename");
            return (Criteria) this;
        }

        public Criteria andCnwarehousenameLessThanOrEqualTo(String value) {
            addCriterion("cnWarehouseName <=", value, "cnwarehousename");
            return (Criteria) this;
        }

        public Criteria andCnwarehousenameLike(String value) {
            addCriterion("cnWarehouseName like", value, "cnwarehousename");
            return (Criteria) this;
        }

        public Criteria andCnwarehousenameNotLike(String value) {
            addCriterion("cnWarehouseName not like", value, "cnwarehousename");
            return (Criteria) this;
        }

        public Criteria andCnwarehousenameIn(List<String> values) {
            addCriterion("cnWarehouseName in", values, "cnwarehousename");
            return (Criteria) this;
        }

        public Criteria andCnwarehousenameNotIn(List<String> values) {
            addCriterion("cnWarehouseName not in", values, "cnwarehousename");
            return (Criteria) this;
        }

        public Criteria andCnwarehousenameBetween(String value1, String value2) {
            addCriterion("cnWarehouseName between", value1, value2, "cnwarehousename");
            return (Criteria) this;
        }

        public Criteria andCnwarehousenameNotBetween(String value1, String value2) {
            addCriterion("cnWarehouseName not between", value1, value2, "cnwarehousename");
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