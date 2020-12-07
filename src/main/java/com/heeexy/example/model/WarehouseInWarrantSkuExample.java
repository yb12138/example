package com.heeexy.example.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WarehouseInWarrantSkuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WarehouseInWarrantSkuExample() {
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

        public Criteria andInskuidIsNull() {
            addCriterion("inSkuID is null");
            return (Criteria) this;
        }

        public Criteria andInskuidIsNotNull() {
            addCriterion("inSkuID is not null");
            return (Criteria) this;
        }

        public Criteria andInskuidEqualTo(Integer value) {
            addCriterion("inSkuID =", value, "inskuid");
            return (Criteria) this;
        }

        public Criteria andInskuidNotEqualTo(Integer value) {
            addCriterion("inSkuID <>", value, "inskuid");
            return (Criteria) this;
        }

        public Criteria andInskuidGreaterThan(Integer value) {
            addCriterion("inSkuID >", value, "inskuid");
            return (Criteria) this;
        }

        public Criteria andInskuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("inSkuID >=", value, "inskuid");
            return (Criteria) this;
        }

        public Criteria andInskuidLessThan(Integer value) {
            addCriterion("inSkuID <", value, "inskuid");
            return (Criteria) this;
        }

        public Criteria andInskuidLessThanOrEqualTo(Integer value) {
            addCriterion("inSkuID <=", value, "inskuid");
            return (Criteria) this;
        }

        public Criteria andInskuidIn(List<Integer> values) {
            addCriterion("inSkuID in", values, "inskuid");
            return (Criteria) this;
        }

        public Criteria andInskuidNotIn(List<Integer> values) {
            addCriterion("inSkuID not in", values, "inskuid");
            return (Criteria) this;
        }

        public Criteria andInskuidBetween(Integer value1, Integer value2) {
            addCriterion("inSkuID between", value1, value2, "inskuid");
            return (Criteria) this;
        }

        public Criteria andInskuidNotBetween(Integer value1, Integer value2) {
            addCriterion("inSkuID not between", value1, value2, "inskuid");
            return (Criteria) this;
        }

        public Criteria andInidIsNull() {
            addCriterion("inID is null");
            return (Criteria) this;
        }

        public Criteria andInidIsNotNull() {
            addCriterion("inID is not null");
            return (Criteria) this;
        }

        public Criteria andInidEqualTo(Integer value) {
            addCriterion("inID =", value, "inid");
            return (Criteria) this;
        }

        public Criteria andInidNotEqualTo(Integer value) {
            addCriterion("inID <>", value, "inid");
            return (Criteria) this;
        }

        public Criteria andInidGreaterThan(Integer value) {
            addCriterion("inID >", value, "inid");
            return (Criteria) this;
        }

        public Criteria andInidGreaterThanOrEqualTo(Integer value) {
            addCriterion("inID >=", value, "inid");
            return (Criteria) this;
        }

        public Criteria andInidLessThan(Integer value) {
            addCriterion("inID <", value, "inid");
            return (Criteria) this;
        }

        public Criteria andInidLessThanOrEqualTo(Integer value) {
            addCriterion("inID <=", value, "inid");
            return (Criteria) this;
        }

        public Criteria andInidIn(List<Integer> values) {
            addCriterion("inID in", values, "inid");
            return (Criteria) this;
        }

        public Criteria andInidNotIn(List<Integer> values) {
            addCriterion("inID not in", values, "inid");
            return (Criteria) this;
        }

        public Criteria andInidBetween(Integer value1, Integer value2) {
            addCriterion("inID between", value1, value2, "inid");
            return (Criteria) this;
        }

        public Criteria andInidNotBetween(Integer value1, Integer value2) {
            addCriterion("inID not between", value1, value2, "inid");
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

        public Criteria andTypecountIsNull() {
            addCriterion("typeCount is null");
            return (Criteria) this;
        }

        public Criteria andTypecountIsNotNull() {
            addCriterion("typeCount is not null");
            return (Criteria) this;
        }

        public Criteria andTypecountEqualTo(Integer value) {
            addCriterion("typeCount =", value, "typecount");
            return (Criteria) this;
        }

        public Criteria andTypecountNotEqualTo(Integer value) {
            addCriterion("typeCount <>", value, "typecount");
            return (Criteria) this;
        }

        public Criteria andTypecountGreaterThan(Integer value) {
            addCriterion("typeCount >", value, "typecount");
            return (Criteria) this;
        }

        public Criteria andTypecountGreaterThanOrEqualTo(Integer value) {
            addCriterion("typeCount >=", value, "typecount");
            return (Criteria) this;
        }

        public Criteria andTypecountLessThan(Integer value) {
            addCriterion("typeCount <", value, "typecount");
            return (Criteria) this;
        }

        public Criteria andTypecountLessThanOrEqualTo(Integer value) {
            addCriterion("typeCount <=", value, "typecount");
            return (Criteria) this;
        }

        public Criteria andTypecountIn(List<Integer> values) {
            addCriterion("typeCount in", values, "typecount");
            return (Criteria) this;
        }

        public Criteria andTypecountNotIn(List<Integer> values) {
            addCriterion("typeCount not in", values, "typecount");
            return (Criteria) this;
        }

        public Criteria andTypecountBetween(Integer value1, Integer value2) {
            addCriterion("typeCount between", value1, value2, "typecount");
            return (Criteria) this;
        }

        public Criteria andTypecountNotBetween(Integer value1, Integer value2) {
            addCriterion("typeCount not between", value1, value2, "typecount");
            return (Criteria) this;
        }

        public Criteria andIncountIsNull() {
            addCriterion("inCount is null");
            return (Criteria) this;
        }

        public Criteria andIncountIsNotNull() {
            addCriterion("inCount is not null");
            return (Criteria) this;
        }

        public Criteria andIncountEqualTo(Integer value) {
            addCriterion("inCount =", value, "incount");
            return (Criteria) this;
        }

        public Criteria andIncountNotEqualTo(Integer value) {
            addCriterion("inCount <>", value, "incount");
            return (Criteria) this;
        }

        public Criteria andIncountGreaterThan(Integer value) {
            addCriterion("inCount >", value, "incount");
            return (Criteria) this;
        }

        public Criteria andIncountGreaterThanOrEqualTo(Integer value) {
            addCriterion("inCount >=", value, "incount");
            return (Criteria) this;
        }

        public Criteria andIncountLessThan(Integer value) {
            addCriterion("inCount <", value, "incount");
            return (Criteria) this;
        }

        public Criteria andIncountLessThanOrEqualTo(Integer value) {
            addCriterion("inCount <=", value, "incount");
            return (Criteria) this;
        }

        public Criteria andIncountIn(List<Integer> values) {
            addCriterion("inCount in", values, "incount");
            return (Criteria) this;
        }

        public Criteria andIncountNotIn(List<Integer> values) {
            addCriterion("inCount not in", values, "incount");
            return (Criteria) this;
        }

        public Criteria andIncountBetween(Integer value1, Integer value2) {
            addCriterion("inCount between", value1, value2, "incount");
            return (Criteria) this;
        }

        public Criteria andIncountNotBetween(Integer value1, Integer value2) {
            addCriterion("inCount not between", value1, value2, "incount");
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

        public Criteria andUnitpriceIsNull() {
            addCriterion("unitprice is null");
            return (Criteria) this;
        }

        public Criteria andUnitpriceIsNotNull() {
            addCriterion("unitprice is not null");
            return (Criteria) this;
        }

        public Criteria andUnitpriceEqualTo(BigDecimal value) {
            addCriterion("unitprice =", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceNotEqualTo(BigDecimal value) {
            addCriterion("unitprice <>", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceGreaterThan(BigDecimal value) {
            addCriterion("unitprice >", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("unitprice >=", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceLessThan(BigDecimal value) {
            addCriterion("unitprice <", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("unitprice <=", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceIn(List<BigDecimal> values) {
            addCriterion("unitprice in", values, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceNotIn(List<BigDecimal> values) {
            addCriterion("unitprice not in", values, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unitprice between", value1, value2, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unitprice not between", value1, value2, "unitprice");
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

        public Criteria andFareEqualTo(BigDecimal value) {
            addCriterion("fare =", value, "fare");
            return (Criteria) this;
        }

        public Criteria andFareNotEqualTo(BigDecimal value) {
            addCriterion("fare <>", value, "fare");
            return (Criteria) this;
        }

        public Criteria andFareGreaterThan(BigDecimal value) {
            addCriterion("fare >", value, "fare");
            return (Criteria) this;
        }

        public Criteria andFareGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fare >=", value, "fare");
            return (Criteria) this;
        }

        public Criteria andFareLessThan(BigDecimal value) {
            addCriterion("fare <", value, "fare");
            return (Criteria) this;
        }

        public Criteria andFareLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fare <=", value, "fare");
            return (Criteria) this;
        }

        public Criteria andFareIn(List<BigDecimal> values) {
            addCriterion("fare in", values, "fare");
            return (Criteria) this;
        }

        public Criteria andFareNotIn(List<BigDecimal> values) {
            addCriterion("fare not in", values, "fare");
            return (Criteria) this;
        }

        public Criteria andFareBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fare between", value1, value2, "fare");
            return (Criteria) this;
        }

        public Criteria andFareNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fare not between", value1, value2, "fare");
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

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andOutcountIsNull() {
            addCriterion("outCount is null");
            return (Criteria) this;
        }

        public Criteria andOutcountIsNotNull() {
            addCriterion("outCount is not null");
            return (Criteria) this;
        }

        public Criteria andOutcountEqualTo(Integer value) {
            addCriterion("outCount =", value, "outcount");
            return (Criteria) this;
        }

        public Criteria andOutcountNotEqualTo(Integer value) {
            addCriterion("outCount <>", value, "outcount");
            return (Criteria) this;
        }

        public Criteria andOutcountGreaterThan(Integer value) {
            addCriterion("outCount >", value, "outcount");
            return (Criteria) this;
        }

        public Criteria andOutcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("outCount >=", value, "outcount");
            return (Criteria) this;
        }

        public Criteria andOutcountLessThan(Integer value) {
            addCriterion("outCount <", value, "outcount");
            return (Criteria) this;
        }

        public Criteria andOutcountLessThanOrEqualTo(Integer value) {
            addCriterion("outCount <=", value, "outcount");
            return (Criteria) this;
        }

        public Criteria andOutcountIn(List<Integer> values) {
            addCriterion("outCount in", values, "outcount");
            return (Criteria) this;
        }

        public Criteria andOutcountNotIn(List<Integer> values) {
            addCriterion("outCount not in", values, "outcount");
            return (Criteria) this;
        }

        public Criteria andOutcountBetween(Integer value1, Integer value2) {
            addCriterion("outCount between", value1, value2, "outcount");
            return (Criteria) this;
        }

        public Criteria andOutcountNotBetween(Integer value1, Integer value2) {
            addCriterion("outCount not between", value1, value2, "outcount");
            return (Criteria) this;
        }

        public Criteria andInnumIsNull() {
            addCriterion("inNum is null");
            return (Criteria) this;
        }

        public Criteria andInnumIsNotNull() {
            addCriterion("inNum is not null");
            return (Criteria) this;
        }

        public Criteria andInnumEqualTo(String value) {
            addCriterion("inNum =", value, "innum");
            return (Criteria) this;
        }

        public Criteria andInnumNotEqualTo(String value) {
            addCriterion("inNum <>", value, "innum");
            return (Criteria) this;
        }

        public Criteria andInnumGreaterThan(String value) {
            addCriterion("inNum >", value, "innum");
            return (Criteria) this;
        }

        public Criteria andInnumGreaterThanOrEqualTo(String value) {
            addCriterion("inNum >=", value, "innum");
            return (Criteria) this;
        }

        public Criteria andInnumLessThan(String value) {
            addCriterion("inNum <", value, "innum");
            return (Criteria) this;
        }

        public Criteria andInnumLessThanOrEqualTo(String value) {
            addCriterion("inNum <=", value, "innum");
            return (Criteria) this;
        }

        public Criteria andInnumLike(String value) {
            addCriterion("inNum like", value, "innum");
            return (Criteria) this;
        }

        public Criteria andInnumNotLike(String value) {
            addCriterion("inNum not like", value, "innum");
            return (Criteria) this;
        }

        public Criteria andInnumIn(List<String> values) {
            addCriterion("inNum in", values, "innum");
            return (Criteria) this;
        }

        public Criteria andInnumNotIn(List<String> values) {
            addCriterion("inNum not in", values, "innum");
            return (Criteria) this;
        }

        public Criteria andInnumBetween(String value1, String value2) {
            addCriterion("inNum between", value1, value2, "innum");
            return (Criteria) this;
        }

        public Criteria andInnumNotBetween(String value1, String value2) {
            addCriterion("inNum not between", value1, value2, "innum");
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