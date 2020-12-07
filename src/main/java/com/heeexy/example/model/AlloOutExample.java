package com.heeexy.example.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AlloOutExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AlloOutExample() {
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

        public Criteria andAlloidIsNull() {
            addCriterion("alloID is null");
            return (Criteria) this;
        }

        public Criteria andAlloidIsNotNull() {
            addCriterion("alloID is not null");
            return (Criteria) this;
        }

        public Criteria andAlloidEqualTo(Integer value) {
            addCriterion("alloID =", value, "alloid");
            return (Criteria) this;
        }

        public Criteria andAlloidNotEqualTo(Integer value) {
            addCriterion("alloID <>", value, "alloid");
            return (Criteria) this;
        }

        public Criteria andAlloidGreaterThan(Integer value) {
            addCriterion("alloID >", value, "alloid");
            return (Criteria) this;
        }

        public Criteria andAlloidGreaterThanOrEqualTo(Integer value) {
            addCriterion("alloID >=", value, "alloid");
            return (Criteria) this;
        }

        public Criteria andAlloidLessThan(Integer value) {
            addCriterion("alloID <", value, "alloid");
            return (Criteria) this;
        }

        public Criteria andAlloidLessThanOrEqualTo(Integer value) {
            addCriterion("alloID <=", value, "alloid");
            return (Criteria) this;
        }

        public Criteria andAlloidIn(List<Integer> values) {
            addCriterion("alloID in", values, "alloid");
            return (Criteria) this;
        }

        public Criteria andAlloidNotIn(List<Integer> values) {
            addCriterion("alloID not in", values, "alloid");
            return (Criteria) this;
        }

        public Criteria andAlloidBetween(Integer value1, Integer value2) {
            addCriterion("alloID between", value1, value2, "alloid");
            return (Criteria) this;
        }

        public Criteria andAlloidNotBetween(Integer value1, Integer value2) {
            addCriterion("alloID not between", value1, value2, "alloid");
            return (Criteria) this;
        }

        public Criteria andAllonumIsNull() {
            addCriterion("alloNum is null");
            return (Criteria) this;
        }

        public Criteria andAllonumIsNotNull() {
            addCriterion("alloNum is not null");
            return (Criteria) this;
        }

        public Criteria andAllonumEqualTo(String value) {
            addCriterion("alloNum =", value, "allonum");
            return (Criteria) this;
        }

        public Criteria andAllonumNotEqualTo(String value) {
            addCriterion("alloNum <>", value, "allonum");
            return (Criteria) this;
        }

        public Criteria andAllonumGreaterThan(String value) {
            addCriterion("alloNum >", value, "allonum");
            return (Criteria) this;
        }

        public Criteria andAllonumGreaterThanOrEqualTo(String value) {
            addCriterion("alloNum >=", value, "allonum");
            return (Criteria) this;
        }

        public Criteria andAllonumLessThan(String value) {
            addCriterion("alloNum <", value, "allonum");
            return (Criteria) this;
        }

        public Criteria andAllonumLessThanOrEqualTo(String value) {
            addCriterion("alloNum <=", value, "allonum");
            return (Criteria) this;
        }

        public Criteria andAllonumLike(String value) {
            addCriterion("alloNum like", value, "allonum");
            return (Criteria) this;
        }

        public Criteria andAllonumNotLike(String value) {
            addCriterion("alloNum not like", value, "allonum");
            return (Criteria) this;
        }

        public Criteria andAllonumIn(List<String> values) {
            addCriterion("alloNum in", values, "allonum");
            return (Criteria) this;
        }

        public Criteria andAllonumNotIn(List<String> values) {
            addCriterion("alloNum not in", values, "allonum");
            return (Criteria) this;
        }

        public Criteria andAllonumBetween(String value1, String value2) {
            addCriterion("alloNum between", value1, value2, "allonum");
            return (Criteria) this;
        }

        public Criteria andAllonumNotBetween(String value1, String value2) {
            addCriterion("alloNum not between", value1, value2, "allonum");
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

        public Criteria andUsernameIsNull() {
            addCriterion("userName is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("userName is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("userName =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("userName <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("userName >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("userName >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("userName <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("userName <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("userName like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("userName not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("userName in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("userName not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("userName between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("userName not between", value1, value2, "username");
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

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updateTime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updateTime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updateTime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updateTime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updateTime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updateTime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updateTime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updateTime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updateTime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updateTime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andFareIsNull() {
            addCriterion("fare is null");
            return (Criteria) this;
        }

        public Criteria andFareIsNotNull() {
            addCriterion("fare is not null");
            return (Criteria) this;
        }

        public Criteria andFareEqualTo(Double value) {
            addCriterion("fare =", value, "fare");
            return (Criteria) this;
        }

        public Criteria andFareNotEqualTo(Double value) {
            addCriterion("fare <>", value, "fare");
            return (Criteria) this;
        }

        public Criteria andFareGreaterThan(Double value) {
            addCriterion("fare >", value, "fare");
            return (Criteria) this;
        }

        public Criteria andFareGreaterThanOrEqualTo(Double value) {
            addCriterion("fare >=", value, "fare");
            return (Criteria) this;
        }

        public Criteria andFareLessThan(Double value) {
            addCriterion("fare <", value, "fare");
            return (Criteria) this;
        }

        public Criteria andFareLessThanOrEqualTo(Double value) {
            addCriterion("fare <=", value, "fare");
            return (Criteria) this;
        }

        public Criteria andFareIn(List<Double> values) {
            addCriterion("fare in", values, "fare");
            return (Criteria) this;
        }

        public Criteria andFareNotIn(List<Double> values) {
            addCriterion("fare not in", values, "fare");
            return (Criteria) this;
        }

        public Criteria andFareBetween(Double value1, Double value2) {
            addCriterion("fare between", value1, value2, "fare");
            return (Criteria) this;
        }

        public Criteria andFareNotBetween(Double value1, Double value2) {
            addCriterion("fare not between", value1, value2, "fare");
            return (Criteria) this;
        }

        public Criteria andStoragefareIsNull() {
            addCriterion("storageFare is null");
            return (Criteria) this;
        }

        public Criteria andStoragefareIsNotNull() {
            addCriterion("storageFare is not null");
            return (Criteria) this;
        }

        public Criteria andStoragefareEqualTo(Double value) {
            addCriterion("storageFare =", value, "storagefare");
            return (Criteria) this;
        }

        public Criteria andStoragefareNotEqualTo(Double value) {
            addCriterion("storageFare <>", value, "storagefare");
            return (Criteria) this;
        }

        public Criteria andStoragefareGreaterThan(Double value) {
            addCriterion("storageFare >", value, "storagefare");
            return (Criteria) this;
        }

        public Criteria andStoragefareGreaterThanOrEqualTo(Double value) {
            addCriterion("storageFare >=", value, "storagefare");
            return (Criteria) this;
        }

        public Criteria andStoragefareLessThan(Double value) {
            addCriterion("storageFare <", value, "storagefare");
            return (Criteria) this;
        }

        public Criteria andStoragefareLessThanOrEqualTo(Double value) {
            addCriterion("storageFare <=", value, "storagefare");
            return (Criteria) this;
        }

        public Criteria andStoragefareIn(List<Double> values) {
            addCriterion("storageFare in", values, "storagefare");
            return (Criteria) this;
        }

        public Criteria andStoragefareNotIn(List<Double> values) {
            addCriterion("storageFare not in", values, "storagefare");
            return (Criteria) this;
        }

        public Criteria andStoragefareBetween(Double value1, Double value2) {
            addCriterion("storageFare between", value1, value2, "storagefare");
            return (Criteria) this;
        }

        public Criteria andStoragefareNotBetween(Double value1, Double value2) {
            addCriterion("storageFare not between", value1, value2, "storagefare");
            return (Criteria) this;
        }

        public Criteria andValuetaxIsNull() {
            addCriterion("valueTax is null");
            return (Criteria) this;
        }

        public Criteria andValuetaxIsNotNull() {
            addCriterion("valueTax is not null");
            return (Criteria) this;
        }

        public Criteria andValuetaxEqualTo(Double value) {
            addCriterion("valueTax =", value, "valuetax");
            return (Criteria) this;
        }

        public Criteria andValuetaxNotEqualTo(Double value) {
            addCriterion("valueTax <>", value, "valuetax");
            return (Criteria) this;
        }

        public Criteria andValuetaxGreaterThan(Double value) {
            addCriterion("valueTax >", value, "valuetax");
            return (Criteria) this;
        }

        public Criteria andValuetaxGreaterThanOrEqualTo(Double value) {
            addCriterion("valueTax >=", value, "valuetax");
            return (Criteria) this;
        }

        public Criteria andValuetaxLessThan(Double value) {
            addCriterion("valueTax <", value, "valuetax");
            return (Criteria) this;
        }

        public Criteria andValuetaxLessThanOrEqualTo(Double value) {
            addCriterion("valueTax <=", value, "valuetax");
            return (Criteria) this;
        }

        public Criteria andValuetaxIn(List<Double> values) {
            addCriterion("valueTax in", values, "valuetax");
            return (Criteria) this;
        }

        public Criteria andValuetaxNotIn(List<Double> values) {
            addCriterion("valueTax not in", values, "valuetax");
            return (Criteria) this;
        }

        public Criteria andValuetaxBetween(Double value1, Double value2) {
            addCriterion("valueTax between", value1, value2, "valuetax");
            return (Criteria) this;
        }

        public Criteria andValuetaxNotBetween(Double value1, Double value2) {
            addCriterion("valueTax not between", value1, value2, "valuetax");
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

        public Criteria andAllweightIsNull() {
            addCriterion("allWeight is null");
            return (Criteria) this;
        }

        public Criteria andAllweightIsNotNull() {
            addCriterion("allWeight is not null");
            return (Criteria) this;
        }

        public Criteria andAllweightEqualTo(Double value) {
            addCriterion("allWeight =", value, "allweight");
            return (Criteria) this;
        }

        public Criteria andAllweightNotEqualTo(Double value) {
            addCriterion("allWeight <>", value, "allweight");
            return (Criteria) this;
        }

        public Criteria andAllweightGreaterThan(Double value) {
            addCriterion("allWeight >", value, "allweight");
            return (Criteria) this;
        }

        public Criteria andAllweightGreaterThanOrEqualTo(Double value) {
            addCriterion("allWeight >=", value, "allweight");
            return (Criteria) this;
        }

        public Criteria andAllweightLessThan(Double value) {
            addCriterion("allWeight <", value, "allweight");
            return (Criteria) this;
        }

        public Criteria andAllweightLessThanOrEqualTo(Double value) {
            addCriterion("allWeight <=", value, "allweight");
            return (Criteria) this;
        }

        public Criteria andAllweightIn(List<Double> values) {
            addCriterion("allWeight in", values, "allweight");
            return (Criteria) this;
        }

        public Criteria andAllweightNotIn(List<Double> values) {
            addCriterion("allWeight not in", values, "allweight");
            return (Criteria) this;
        }

        public Criteria andAllweightBetween(Double value1, Double value2) {
            addCriterion("allWeight between", value1, value2, "allweight");
            return (Criteria) this;
        }

        public Criteria andAllweightNotBetween(Double value1, Double value2) {
            addCriterion("allWeight not between", value1, value2, "allweight");
            return (Criteria) this;
        }

        public Criteria andAllvolumeIsNull() {
            addCriterion("allVolume is null");
            return (Criteria) this;
        }

        public Criteria andAllvolumeIsNotNull() {
            addCriterion("allVolume is not null");
            return (Criteria) this;
        }

        public Criteria andAllvolumeEqualTo(Double value) {
            addCriterion("allVolume =", value, "allvolume");
            return (Criteria) this;
        }

        public Criteria andAllvolumeNotEqualTo(Double value) {
            addCriterion("allVolume <>", value, "allvolume");
            return (Criteria) this;
        }

        public Criteria andAllvolumeGreaterThan(Double value) {
            addCriterion("allVolume >", value, "allvolume");
            return (Criteria) this;
        }

        public Criteria andAllvolumeGreaterThanOrEqualTo(Double value) {
            addCriterion("allVolume >=", value, "allvolume");
            return (Criteria) this;
        }

        public Criteria andAllvolumeLessThan(Double value) {
            addCriterion("allVolume <", value, "allvolume");
            return (Criteria) this;
        }

        public Criteria andAllvolumeLessThanOrEqualTo(Double value) {
            addCriterion("allVolume <=", value, "allvolume");
            return (Criteria) this;
        }

        public Criteria andAllvolumeIn(List<Double> values) {
            addCriterion("allVolume in", values, "allvolume");
            return (Criteria) this;
        }

        public Criteria andAllvolumeNotIn(List<Double> values) {
            addCriterion("allVolume not in", values, "allvolume");
            return (Criteria) this;
        }

        public Criteria andAllvolumeBetween(Double value1, Double value2) {
            addCriterion("allVolume between", value1, value2, "allvolume");
            return (Criteria) this;
        }

        public Criteria andAllvolumeNotBetween(Double value1, Double value2) {
            addCriterion("allVolume not between", value1, value2, "allvolume");
            return (Criteria) this;
        }

        public Criteria andSkuquantityIsNull() {
            addCriterion("skuQuantity is null");
            return (Criteria) this;
        }

        public Criteria andSkuquantityIsNotNull() {
            addCriterion("skuQuantity is not null");
            return (Criteria) this;
        }

        public Criteria andSkuquantityEqualTo(Integer value) {
            addCriterion("skuQuantity =", value, "skuquantity");
            return (Criteria) this;
        }

        public Criteria andSkuquantityNotEqualTo(Integer value) {
            addCriterion("skuQuantity <>", value, "skuquantity");
            return (Criteria) this;
        }

        public Criteria andSkuquantityGreaterThan(Integer value) {
            addCriterion("skuQuantity >", value, "skuquantity");
            return (Criteria) this;
        }

        public Criteria andSkuquantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("skuQuantity >=", value, "skuquantity");
            return (Criteria) this;
        }

        public Criteria andSkuquantityLessThan(Integer value) {
            addCriterion("skuQuantity <", value, "skuquantity");
            return (Criteria) this;
        }

        public Criteria andSkuquantityLessThanOrEqualTo(Integer value) {
            addCriterion("skuQuantity <=", value, "skuquantity");
            return (Criteria) this;
        }

        public Criteria andSkuquantityIn(List<Integer> values) {
            addCriterion("skuQuantity in", values, "skuquantity");
            return (Criteria) this;
        }

        public Criteria andSkuquantityNotIn(List<Integer> values) {
            addCriterion("skuQuantity not in", values, "skuquantity");
            return (Criteria) this;
        }

        public Criteria andSkuquantityBetween(Integer value1, Integer value2) {
            addCriterion("skuQuantity between", value1, value2, "skuquantity");
            return (Criteria) this;
        }

        public Criteria andSkuquantityNotBetween(Integer value1, Integer value2) {
            addCriterion("skuQuantity not between", value1, value2, "skuquantity");
            return (Criteria) this;
        }

        public Criteria andArrivetimeIsNull() {
            addCriterion("arriveTime is null");
            return (Criteria) this;
        }

        public Criteria andArrivetimeIsNotNull() {
            addCriterion("arriveTime is not null");
            return (Criteria) this;
        }

        public Criteria andArrivetimeEqualTo(Date value) {
            addCriterion("arriveTime =", value, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeNotEqualTo(Date value) {
            addCriterion("arriveTime <>", value, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeGreaterThan(Date value) {
            addCriterion("arriveTime >", value, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("arriveTime >=", value, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeLessThan(Date value) {
            addCriterion("arriveTime <", value, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeLessThanOrEqualTo(Date value) {
            addCriterion("arriveTime <=", value, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeIn(List<Date> values) {
            addCriterion("arriveTime in", values, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeNotIn(List<Date> values) {
            addCriterion("arriveTime not in", values, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeBetween(Date value1, Date value2) {
            addCriterion("arriveTime between", value1, value2, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeNotBetween(Date value1, Date value2) {
            addCriterion("arriveTime not between", value1, value2, "arrivetime");
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