package com.heeexy.example.model;

import java.util.ArrayList;
import java.util.List;

public class DatacaciquesPackageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DatacaciquesPackageExample() {
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

        public Criteria andPackageidIsNull() {
            addCriterion("packageID is null");
            return (Criteria) this;
        }

        public Criteria andPackageidIsNotNull() {
            addCriterion("packageID is not null");
            return (Criteria) this;
        }

        public Criteria andPackageidEqualTo(Long value) {
            addCriterion("packageID =", value, "packageid");
            return (Criteria) this;
        }

        public Criteria andPackageidNotEqualTo(Long value) {
            addCriterion("packageID <>", value, "packageid");
            return (Criteria) this;
        }

        public Criteria andPackageidGreaterThan(Long value) {
            addCriterion("packageID >", value, "packageid");
            return (Criteria) this;
        }

        public Criteria andPackageidGreaterThanOrEqualTo(Long value) {
            addCriterion("packageID >=", value, "packageid");
            return (Criteria) this;
        }

        public Criteria andPackageidLessThan(Long value) {
            addCriterion("packageID <", value, "packageid");
            return (Criteria) this;
        }

        public Criteria andPackageidLessThanOrEqualTo(Long value) {
            addCriterion("packageID <=", value, "packageid");
            return (Criteria) this;
        }

        public Criteria andPackageidIn(List<Long> values) {
            addCriterion("packageID in", values, "packageid");
            return (Criteria) this;
        }

        public Criteria andPackageidNotIn(List<Long> values) {
            addCriterion("packageID not in", values, "packageid");
            return (Criteria) this;
        }

        public Criteria andPackageidBetween(Long value1, Long value2) {
            addCriterion("packageID between", value1, value2, "packageid");
            return (Criteria) this;
        }

        public Criteria andPackageidNotBetween(Long value1, Long value2) {
            addCriterion("packageID not between", value1, value2, "packageid");
            return (Criteria) this;
        }

        public Criteria andPackagecodeIsNull() {
            addCriterion("packageCode is null");
            return (Criteria) this;
        }

        public Criteria andPackagecodeIsNotNull() {
            addCriterion("packageCode is not null");
            return (Criteria) this;
        }

        public Criteria andPackagecodeEqualTo(String value) {
            addCriterion("packageCode =", value, "packagecode");
            return (Criteria) this;
        }

        public Criteria andPackagecodeNotEqualTo(String value) {
            addCriterion("packageCode <>", value, "packagecode");
            return (Criteria) this;
        }

        public Criteria andPackagecodeGreaterThan(String value) {
            addCriterion("packageCode >", value, "packagecode");
            return (Criteria) this;
        }

        public Criteria andPackagecodeGreaterThanOrEqualTo(String value) {
            addCriterion("packageCode >=", value, "packagecode");
            return (Criteria) this;
        }

        public Criteria andPackagecodeLessThan(String value) {
            addCriterion("packageCode <", value, "packagecode");
            return (Criteria) this;
        }

        public Criteria andPackagecodeLessThanOrEqualTo(String value) {
            addCriterion("packageCode <=", value, "packagecode");
            return (Criteria) this;
        }

        public Criteria andPackagecodeLike(String value) {
            addCriterion("packageCode like", value, "packagecode");
            return (Criteria) this;
        }

        public Criteria andPackagecodeNotLike(String value) {
            addCriterion("packageCode not like", value, "packagecode");
            return (Criteria) this;
        }

        public Criteria andPackagecodeIn(List<String> values) {
            addCriterion("packageCode in", values, "packagecode");
            return (Criteria) this;
        }

        public Criteria andPackagecodeNotIn(List<String> values) {
            addCriterion("packageCode not in", values, "packagecode");
            return (Criteria) this;
        }

        public Criteria andPackagecodeBetween(String value1, String value2) {
            addCriterion("packageCode between", value1, value2, "packagecode");
            return (Criteria) this;
        }

        public Criteria andPackagecodeNotBetween(String value1, String value2) {
            addCriterion("packageCode not between", value1, value2, "packagecode");
            return (Criteria) this;
        }

        public Criteria andSyspackagestatusIsNull() {
            addCriterion("sysPackageStatus is null");
            return (Criteria) this;
        }

        public Criteria andSyspackagestatusIsNotNull() {
            addCriterion("sysPackageStatus is not null");
            return (Criteria) this;
        }

        public Criteria andSyspackagestatusEqualTo(String value) {
            addCriterion("sysPackageStatus =", value, "syspackagestatus");
            return (Criteria) this;
        }

        public Criteria andSyspackagestatusNotEqualTo(String value) {
            addCriterion("sysPackageStatus <>", value, "syspackagestatus");
            return (Criteria) this;
        }

        public Criteria andSyspackagestatusGreaterThan(String value) {
            addCriterion("sysPackageStatus >", value, "syspackagestatus");
            return (Criteria) this;
        }

        public Criteria andSyspackagestatusGreaterThanOrEqualTo(String value) {
            addCriterion("sysPackageStatus >=", value, "syspackagestatus");
            return (Criteria) this;
        }

        public Criteria andSyspackagestatusLessThan(String value) {
            addCriterion("sysPackageStatus <", value, "syspackagestatus");
            return (Criteria) this;
        }

        public Criteria andSyspackagestatusLessThanOrEqualTo(String value) {
            addCriterion("sysPackageStatus <=", value, "syspackagestatus");
            return (Criteria) this;
        }

        public Criteria andSyspackagestatusLike(String value) {
            addCriterion("sysPackageStatus like", value, "syspackagestatus");
            return (Criteria) this;
        }

        public Criteria andSyspackagestatusNotLike(String value) {
            addCriterion("sysPackageStatus not like", value, "syspackagestatus");
            return (Criteria) this;
        }

        public Criteria andSyspackagestatusIn(List<String> values) {
            addCriterion("sysPackageStatus in", values, "syspackagestatus");
            return (Criteria) this;
        }

        public Criteria andSyspackagestatusNotIn(List<String> values) {
            addCriterion("sysPackageStatus not in", values, "syspackagestatus");
            return (Criteria) this;
        }

        public Criteria andSyspackagestatusBetween(String value1, String value2) {
            addCriterion("sysPackageStatus between", value1, value2, "syspackagestatus");
            return (Criteria) this;
        }

        public Criteria andSyspackagestatusNotBetween(String value1, String value2) {
            addCriterion("sysPackageStatus not between", value1, value2, "syspackagestatus");
            return (Criteria) this;
        }

        public Criteria andShiptrackingidIsNull() {
            addCriterion("shipTrackingID is null");
            return (Criteria) this;
        }

        public Criteria andShiptrackingidIsNotNull() {
            addCriterion("shipTrackingID is not null");
            return (Criteria) this;
        }

        public Criteria andShiptrackingidEqualTo(String value) {
            addCriterion("shipTrackingID =", value, "shiptrackingid");
            return (Criteria) this;
        }

        public Criteria andShiptrackingidNotEqualTo(String value) {
            addCriterion("shipTrackingID <>", value, "shiptrackingid");
            return (Criteria) this;
        }

        public Criteria andShiptrackingidGreaterThan(String value) {
            addCriterion("shipTrackingID >", value, "shiptrackingid");
            return (Criteria) this;
        }

        public Criteria andShiptrackingidGreaterThanOrEqualTo(String value) {
            addCriterion("shipTrackingID >=", value, "shiptrackingid");
            return (Criteria) this;
        }

        public Criteria andShiptrackingidLessThan(String value) {
            addCriterion("shipTrackingID <", value, "shiptrackingid");
            return (Criteria) this;
        }

        public Criteria andShiptrackingidLessThanOrEqualTo(String value) {
            addCriterion("shipTrackingID <=", value, "shiptrackingid");
            return (Criteria) this;
        }

        public Criteria andShiptrackingidLike(String value) {
            addCriterion("shipTrackingID like", value, "shiptrackingid");
            return (Criteria) this;
        }

        public Criteria andShiptrackingidNotLike(String value) {
            addCriterion("shipTrackingID not like", value, "shiptrackingid");
            return (Criteria) this;
        }

        public Criteria andShiptrackingidIn(List<String> values) {
            addCriterion("shipTrackingID in", values, "shiptrackingid");
            return (Criteria) this;
        }

        public Criteria andShiptrackingidNotIn(List<String> values) {
            addCriterion("shipTrackingID not in", values, "shiptrackingid");
            return (Criteria) this;
        }

        public Criteria andShiptrackingidBetween(String value1, String value2) {
            addCriterion("shipTrackingID between", value1, value2, "shiptrackingid");
            return (Criteria) this;
        }

        public Criteria andShiptrackingidNotBetween(String value1, String value2) {
            addCriterion("shipTrackingID not between", value1, value2, "shiptrackingid");
            return (Criteria) this;
        }

        public Criteria andProductweightIsNull() {
            addCriterion("productWeight is null");
            return (Criteria) this;
        }

        public Criteria andProductweightIsNotNull() {
            addCriterion("productWeight is not null");
            return (Criteria) this;
        }

        public Criteria andProductweightEqualTo(Double value) {
            addCriterion("productWeight =", value, "productweight");
            return (Criteria) this;
        }

        public Criteria andProductweightNotEqualTo(Double value) {
            addCriterion("productWeight <>", value, "productweight");
            return (Criteria) this;
        }

        public Criteria andProductweightGreaterThan(Double value) {
            addCriterion("productWeight >", value, "productweight");
            return (Criteria) this;
        }

        public Criteria andProductweightGreaterThanOrEqualTo(Double value) {
            addCriterion("productWeight >=", value, "productweight");
            return (Criteria) this;
        }

        public Criteria andProductweightLessThan(Double value) {
            addCriterion("productWeight <", value, "productweight");
            return (Criteria) this;
        }

        public Criteria andProductweightLessThanOrEqualTo(Double value) {
            addCriterion("productWeight <=", value, "productweight");
            return (Criteria) this;
        }

        public Criteria andProductweightIn(List<Double> values) {
            addCriterion("productWeight in", values, "productweight");
            return (Criteria) this;
        }

        public Criteria andProductweightNotIn(List<Double> values) {
            addCriterion("productWeight not in", values, "productweight");
            return (Criteria) this;
        }

        public Criteria andProductweightBetween(Double value1, Double value2) {
            addCriterion("productWeight between", value1, value2, "productweight");
            return (Criteria) this;
        }

        public Criteria andProductweightNotBetween(Double value1, Double value2) {
            addCriterion("productWeight not between", value1, value2, "productweight");
            return (Criteria) this;
        }

        public Criteria andRealweightIsNull() {
            addCriterion("realWeight is null");
            return (Criteria) this;
        }

        public Criteria andRealweightIsNotNull() {
            addCriterion("realWeight is not null");
            return (Criteria) this;
        }

        public Criteria andRealweightEqualTo(Double value) {
            addCriterion("realWeight =", value, "realweight");
            return (Criteria) this;
        }

        public Criteria andRealweightNotEqualTo(Double value) {
            addCriterion("realWeight <>", value, "realweight");
            return (Criteria) this;
        }

        public Criteria andRealweightGreaterThan(Double value) {
            addCriterion("realWeight >", value, "realweight");
            return (Criteria) this;
        }

        public Criteria andRealweightGreaterThanOrEqualTo(Double value) {
            addCriterion("realWeight >=", value, "realweight");
            return (Criteria) this;
        }

        public Criteria andRealweightLessThan(Double value) {
            addCriterion("realWeight <", value, "realweight");
            return (Criteria) this;
        }

        public Criteria andRealweightLessThanOrEqualTo(Double value) {
            addCriterion("realWeight <=", value, "realweight");
            return (Criteria) this;
        }

        public Criteria andRealweightIn(List<Double> values) {
            addCriterion("realWeight in", values, "realweight");
            return (Criteria) this;
        }

        public Criteria andRealweightNotIn(List<Double> values) {
            addCriterion("realWeight not in", values, "realweight");
            return (Criteria) this;
        }

        public Criteria andRealweightBetween(Double value1, Double value2) {
            addCriterion("realWeight between", value1, value2, "realweight");
            return (Criteria) this;
        }

        public Criteria andRealweightNotBetween(Double value1, Double value2) {
            addCriterion("realWeight not between", value1, value2, "realweight");
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

        public Criteria andCreatetimeEqualTo(String value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(String value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(String value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(String value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLike(String value) {
            addCriterion("createTime like", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotLike(String value) {
            addCriterion("createTime not like", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<String> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<String> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(String value1, String value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(String value1, String value2) {
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

        public Criteria andCurrencycodeIsNull() {
            addCriterion("currencyCode is null");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeIsNotNull() {
            addCriterion("currencyCode is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeEqualTo(String value) {
            addCriterion("currencyCode =", value, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeNotEqualTo(String value) {
            addCriterion("currencyCode <>", value, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeGreaterThan(String value) {
            addCriterion("currencyCode >", value, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeGreaterThanOrEqualTo(String value) {
            addCriterion("currencyCode >=", value, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeLessThan(String value) {
            addCriterion("currencyCode <", value, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeLessThanOrEqualTo(String value) {
            addCriterion("currencyCode <=", value, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeLike(String value) {
            addCriterion("currencyCode like", value, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeNotLike(String value) {
            addCriterion("currencyCode not like", value, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeIn(List<String> values) {
            addCriterion("currencyCode in", values, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeNotIn(List<String> values) {
            addCriterion("currencyCode not in", values, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeBetween(String value1, String value2) {
            addCriterion("currencyCode between", value1, value2, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeNotBetween(String value1, String value2) {
            addCriterion("currencyCode not between", value1, value2, "currencycode");
            return (Criteria) this;
        }

        public Criteria andSysproductfeeIsNull() {
            addCriterion("sysProductFee is null");
            return (Criteria) this;
        }

        public Criteria andSysproductfeeIsNotNull() {
            addCriterion("sysProductFee is not null");
            return (Criteria) this;
        }

        public Criteria andSysproductfeeEqualTo(Double value) {
            addCriterion("sysProductFee =", value, "sysproductfee");
            return (Criteria) this;
        }

        public Criteria andSysproductfeeNotEqualTo(Double value) {
            addCriterion("sysProductFee <>", value, "sysproductfee");
            return (Criteria) this;
        }

        public Criteria andSysproductfeeGreaterThan(Double value) {
            addCriterion("sysProductFee >", value, "sysproductfee");
            return (Criteria) this;
        }

        public Criteria andSysproductfeeGreaterThanOrEqualTo(Double value) {
            addCriterion("sysProductFee >=", value, "sysproductfee");
            return (Criteria) this;
        }

        public Criteria andSysproductfeeLessThan(Double value) {
            addCriterion("sysProductFee <", value, "sysproductfee");
            return (Criteria) this;
        }

        public Criteria andSysproductfeeLessThanOrEqualTo(Double value) {
            addCriterion("sysProductFee <=", value, "sysproductfee");
            return (Criteria) this;
        }

        public Criteria andSysproductfeeIn(List<Double> values) {
            addCriterion("sysProductFee in", values, "sysproductfee");
            return (Criteria) this;
        }

        public Criteria andSysproductfeeNotIn(List<Double> values) {
            addCriterion("sysProductFee not in", values, "sysproductfee");
            return (Criteria) this;
        }

        public Criteria andSysproductfeeBetween(Double value1, Double value2) {
            addCriterion("sysProductFee between", value1, value2, "sysproductfee");
            return (Criteria) this;
        }

        public Criteria andSysproductfeeNotBetween(Double value1, Double value2) {
            addCriterion("sysProductFee not between", value1, value2, "sysproductfee");
            return (Criteria) this;
        }

        public Criteria andPackageplatfeeIsNull() {
            addCriterion("packagePlatFee is null");
            return (Criteria) this;
        }

        public Criteria andPackageplatfeeIsNotNull() {
            addCriterion("packagePlatFee is not null");
            return (Criteria) this;
        }

        public Criteria andPackageplatfeeEqualTo(Double value) {
            addCriterion("packagePlatFee =", value, "packageplatfee");
            return (Criteria) this;
        }

        public Criteria andPackageplatfeeNotEqualTo(Double value) {
            addCriterion("packagePlatFee <>", value, "packageplatfee");
            return (Criteria) this;
        }

        public Criteria andPackageplatfeeGreaterThan(Double value) {
            addCriterion("packagePlatFee >", value, "packageplatfee");
            return (Criteria) this;
        }

        public Criteria andPackageplatfeeGreaterThanOrEqualTo(Double value) {
            addCriterion("packagePlatFee >=", value, "packageplatfee");
            return (Criteria) this;
        }

        public Criteria andPackageplatfeeLessThan(Double value) {
            addCriterion("packagePlatFee <", value, "packageplatfee");
            return (Criteria) this;
        }

        public Criteria andPackageplatfeeLessThanOrEqualTo(Double value) {
            addCriterion("packagePlatFee <=", value, "packageplatfee");
            return (Criteria) this;
        }

        public Criteria andPackageplatfeeIn(List<Double> values) {
            addCriterion("packagePlatFee in", values, "packageplatfee");
            return (Criteria) this;
        }

        public Criteria andPackageplatfeeNotIn(List<Double> values) {
            addCriterion("packagePlatFee not in", values, "packageplatfee");
            return (Criteria) this;
        }

        public Criteria andPackageplatfeeBetween(Double value1, Double value2) {
            addCriterion("packagePlatFee between", value1, value2, "packageplatfee");
            return (Criteria) this;
        }

        public Criteria andPackageplatfeeNotBetween(Double value1, Double value2) {
            addCriterion("packagePlatFee not between", value1, value2, "packageplatfee");
            return (Criteria) this;
        }

        public Criteria andPftransferamountIsNull() {
            addCriterion("pfTransferAmount is null");
            return (Criteria) this;
        }

        public Criteria andPftransferamountIsNotNull() {
            addCriterion("pfTransferAmount is not null");
            return (Criteria) this;
        }

        public Criteria andPftransferamountEqualTo(Double value) {
            addCriterion("pfTransferAmount =", value, "pftransferamount");
            return (Criteria) this;
        }

        public Criteria andPftransferamountNotEqualTo(Double value) {
            addCriterion("pfTransferAmount <>", value, "pftransferamount");
            return (Criteria) this;
        }

        public Criteria andPftransferamountGreaterThan(Double value) {
            addCriterion("pfTransferAmount >", value, "pftransferamount");
            return (Criteria) this;
        }

        public Criteria andPftransferamountGreaterThanOrEqualTo(Double value) {
            addCriterion("pfTransferAmount >=", value, "pftransferamount");
            return (Criteria) this;
        }

        public Criteria andPftransferamountLessThan(Double value) {
            addCriterion("pfTransferAmount <", value, "pftransferamount");
            return (Criteria) this;
        }

        public Criteria andPftransferamountLessThanOrEqualTo(Double value) {
            addCriterion("pfTransferAmount <=", value, "pftransferamount");
            return (Criteria) this;
        }

        public Criteria andPftransferamountIn(List<Double> values) {
            addCriterion("pfTransferAmount in", values, "pftransferamount");
            return (Criteria) this;
        }

        public Criteria andPftransferamountNotIn(List<Double> values) {
            addCriterion("pfTransferAmount not in", values, "pftransferamount");
            return (Criteria) this;
        }

        public Criteria andPftransferamountBetween(Double value1, Double value2) {
            addCriterion("pfTransferAmount between", value1, value2, "pftransferamount");
            return (Criteria) this;
        }

        public Criteria andPftransferamountNotBetween(Double value1, Double value2) {
            addCriterion("pfTransferAmount not between", value1, value2, "pftransferamount");
            return (Criteria) this;
        }

        public Criteria andPfshippingamountIsNull() {
            addCriterion("pfShippingAmount is null");
            return (Criteria) this;
        }

        public Criteria andPfshippingamountIsNotNull() {
            addCriterion("pfShippingAmount is not null");
            return (Criteria) this;
        }

        public Criteria andPfshippingamountEqualTo(Double value) {
            addCriterion("pfShippingAmount =", value, "pfshippingamount");
            return (Criteria) this;
        }

        public Criteria andPfshippingamountNotEqualTo(Double value) {
            addCriterion("pfShippingAmount <>", value, "pfshippingamount");
            return (Criteria) this;
        }

        public Criteria andPfshippingamountGreaterThan(Double value) {
            addCriterion("pfShippingAmount >", value, "pfshippingamount");
            return (Criteria) this;
        }

        public Criteria andPfshippingamountGreaterThanOrEqualTo(Double value) {
            addCriterion("pfShippingAmount >=", value, "pfshippingamount");
            return (Criteria) this;
        }

        public Criteria andPfshippingamountLessThan(Double value) {
            addCriterion("pfShippingAmount <", value, "pfshippingamount");
            return (Criteria) this;
        }

        public Criteria andPfshippingamountLessThanOrEqualTo(Double value) {
            addCriterion("pfShippingAmount <=", value, "pfshippingamount");
            return (Criteria) this;
        }

        public Criteria andPfshippingamountIn(List<Double> values) {
            addCriterion("pfShippingAmount in", values, "pfshippingamount");
            return (Criteria) this;
        }

        public Criteria andPfshippingamountNotIn(List<Double> values) {
            addCriterion("pfShippingAmount not in", values, "pfshippingamount");
            return (Criteria) this;
        }

        public Criteria andPfshippingamountBetween(Double value1, Double value2) {
            addCriterion("pfShippingAmount between", value1, value2, "pfshippingamount");
            return (Criteria) this;
        }

        public Criteria andPfshippingamountNotBetween(Double value1, Double value2) {
            addCriterion("pfShippingAmount not between", value1, value2, "pfshippingamount");
            return (Criteria) this;
        }

        public Criteria andRefundamountIsNull() {
            addCriterion("refundAmount is null");
            return (Criteria) this;
        }

        public Criteria andRefundamountIsNotNull() {
            addCriterion("refundAmount is not null");
            return (Criteria) this;
        }

        public Criteria andRefundamountEqualTo(Double value) {
            addCriterion("refundAmount =", value, "refundamount");
            return (Criteria) this;
        }

        public Criteria andRefundamountNotEqualTo(Double value) {
            addCriterion("refundAmount <>", value, "refundamount");
            return (Criteria) this;
        }

        public Criteria andRefundamountGreaterThan(Double value) {
            addCriterion("refundAmount >", value, "refundamount");
            return (Criteria) this;
        }

        public Criteria andRefundamountGreaterThanOrEqualTo(Double value) {
            addCriterion("refundAmount >=", value, "refundamount");
            return (Criteria) this;
        }

        public Criteria andRefundamountLessThan(Double value) {
            addCriterion("refundAmount <", value, "refundamount");
            return (Criteria) this;
        }

        public Criteria andRefundamountLessThanOrEqualTo(Double value) {
            addCriterion("refundAmount <=", value, "refundamount");
            return (Criteria) this;
        }

        public Criteria andRefundamountIn(List<Double> values) {
            addCriterion("refundAmount in", values, "refundamount");
            return (Criteria) this;
        }

        public Criteria andRefundamountNotIn(List<Double> values) {
            addCriterion("refundAmount not in", values, "refundamount");
            return (Criteria) this;
        }

        public Criteria andRefundamountBetween(Double value1, Double value2) {
            addCriterion("refundAmount between", value1, value2, "refundamount");
            return (Criteria) this;
        }

        public Criteria andRefundamountNotBetween(Double value1, Double value2) {
            addCriterion("refundAmount not between", value1, value2, "refundamount");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("flag is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("flag is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(Integer value) {
            addCriterion("flag =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(Integer value) {
            addCriterion("flag <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(Integer value) {
            addCriterion("flag >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("flag >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(Integer value) {
            addCriterion("flag <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(Integer value) {
            addCriterion("flag <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<Integer> values) {
            addCriterion("flag in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<Integer> values) {
            addCriterion("flag not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(Integer value1, Integer value2) {
            addCriterion("flag between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("flag not between", value1, value2, "flag");
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