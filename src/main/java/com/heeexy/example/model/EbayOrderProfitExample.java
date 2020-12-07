package com.heeexy.example.model;

import java.util.ArrayList;
import java.util.List;

public class EbayOrderProfitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EbayOrderProfitExample() {
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

        public Criteria andOrderidIsNull() {
            addCriterion("orderID is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("orderID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(String value) {
            addCriterion("orderID =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(String value) {
            addCriterion("orderID <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(String value) {
            addCriterion("orderID >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(String value) {
            addCriterion("orderID >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(String value) {
            addCriterion("orderID <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(String value) {
            addCriterion("orderID <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLike(String value) {
            addCriterion("orderID like", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotLike(String value) {
            addCriterion("orderID not like", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<String> values) {
            addCriterion("orderID in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<String> values) {
            addCriterion("orderID not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(String value1, String value2) {
            addCriterion("orderID between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(String value1, String value2) {
            addCriterion("orderID not between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andProfitIsNull() {
            addCriterion("profit is null");
            return (Criteria) this;
        }

        public Criteria andProfitIsNotNull() {
            addCriterion("profit is not null");
            return (Criteria) this;
        }

        public Criteria andProfitEqualTo(Double value) {
            addCriterion("profit =", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitNotEqualTo(Double value) {
            addCriterion("profit <>", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitGreaterThan(Double value) {
            addCriterion("profit >", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitGreaterThanOrEqualTo(Double value) {
            addCriterion("profit >=", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitLessThan(Double value) {
            addCriterion("profit <", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitLessThanOrEqualTo(Double value) {
            addCriterion("profit <=", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitIn(List<Double> values) {
            addCriterion("profit in", values, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitNotIn(List<Double> values) {
            addCriterion("profit not in", values, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitBetween(Double value1, Double value2) {
            addCriterion("profit between", value1, value2, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitNotBetween(Double value1, Double value2) {
            addCriterion("profit not between", value1, value2, "profit");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(Double value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(Double value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(Double value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(Double value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(Double value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<Double> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<Double> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(Double value1, Double value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(Double value1, Double value2) {
            addCriterion("amount not between", value1, value2, "amount");
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

        public Criteria andRebateIsNull() {
            addCriterion("rebate is null");
            return (Criteria) this;
        }

        public Criteria andRebateIsNotNull() {
            addCriterion("rebate is not null");
            return (Criteria) this;
        }

        public Criteria andRebateEqualTo(Double value) {
            addCriterion("rebate =", value, "rebate");
            return (Criteria) this;
        }

        public Criteria andRebateNotEqualTo(Double value) {
            addCriterion("rebate <>", value, "rebate");
            return (Criteria) this;
        }

        public Criteria andRebateGreaterThan(Double value) {
            addCriterion("rebate >", value, "rebate");
            return (Criteria) this;
        }

        public Criteria andRebateGreaterThanOrEqualTo(Double value) {
            addCriterion("rebate >=", value, "rebate");
            return (Criteria) this;
        }

        public Criteria andRebateLessThan(Double value) {
            addCriterion("rebate <", value, "rebate");
            return (Criteria) this;
        }

        public Criteria andRebateLessThanOrEqualTo(Double value) {
            addCriterion("rebate <=", value, "rebate");
            return (Criteria) this;
        }

        public Criteria andRebateIn(List<Double> values) {
            addCriterion("rebate in", values, "rebate");
            return (Criteria) this;
        }

        public Criteria andRebateNotIn(List<Double> values) {
            addCriterion("rebate not in", values, "rebate");
            return (Criteria) this;
        }

        public Criteria andRebateBetween(Double value1, Double value2) {
            addCriterion("rebate between", value1, value2, "rebate");
            return (Criteria) this;
        }

        public Criteria andRebateNotBetween(Double value1, Double value2) {
            addCriterion("rebate not between", value1, value2, "rebate");
            return (Criteria) this;
        }

        public Criteria andPaidamountIsNull() {
            addCriterion("paidAmount is null");
            return (Criteria) this;
        }

        public Criteria andPaidamountIsNotNull() {
            addCriterion("paidAmount is not null");
            return (Criteria) this;
        }

        public Criteria andPaidamountEqualTo(Double value) {
            addCriterion("paidAmount =", value, "paidamount");
            return (Criteria) this;
        }

        public Criteria andPaidamountNotEqualTo(Double value) {
            addCriterion("paidAmount <>", value, "paidamount");
            return (Criteria) this;
        }

        public Criteria andPaidamountGreaterThan(Double value) {
            addCriterion("paidAmount >", value, "paidamount");
            return (Criteria) this;
        }

        public Criteria andPaidamountGreaterThanOrEqualTo(Double value) {
            addCriterion("paidAmount >=", value, "paidamount");
            return (Criteria) this;
        }

        public Criteria andPaidamountLessThan(Double value) {
            addCriterion("paidAmount <", value, "paidamount");
            return (Criteria) this;
        }

        public Criteria andPaidamountLessThanOrEqualTo(Double value) {
            addCriterion("paidAmount <=", value, "paidamount");
            return (Criteria) this;
        }

        public Criteria andPaidamountIn(List<Double> values) {
            addCriterion("paidAmount in", values, "paidamount");
            return (Criteria) this;
        }

        public Criteria andPaidamountNotIn(List<Double> values) {
            addCriterion("paidAmount not in", values, "paidamount");
            return (Criteria) this;
        }

        public Criteria andPaidamountBetween(Double value1, Double value2) {
            addCriterion("paidAmount between", value1, value2, "paidamount");
            return (Criteria) this;
        }

        public Criteria andPaidamountNotBetween(Double value1, Double value2) {
            addCriterion("paidAmount not between", value1, value2, "paidamount");
            return (Criteria) this;
        }

        public Criteria andFareIsNull() {
            addCriterion("Fare is null");
            return (Criteria) this;
        }

        public Criteria andFareIsNotNull() {
            addCriterion("Fare is not null");
            return (Criteria) this;
        }

        public Criteria andFareEqualTo(Double value) {
            addCriterion("Fare =", value, "fare");
            return (Criteria) this;
        }

        public Criteria andFareNotEqualTo(Double value) {
            addCriterion("Fare <>", value, "fare");
            return (Criteria) this;
        }

        public Criteria andFareGreaterThan(Double value) {
            addCriterion("Fare >", value, "fare");
            return (Criteria) this;
        }

        public Criteria andFareGreaterThanOrEqualTo(Double value) {
            addCriterion("Fare >=", value, "fare");
            return (Criteria) this;
        }

        public Criteria andFareLessThan(Double value) {
            addCriterion("Fare <", value, "fare");
            return (Criteria) this;
        }

        public Criteria andFareLessThanOrEqualTo(Double value) {
            addCriterion("Fare <=", value, "fare");
            return (Criteria) this;
        }

        public Criteria andFareIn(List<Double> values) {
            addCriterion("Fare in", values, "fare");
            return (Criteria) this;
        }

        public Criteria andFareNotIn(List<Double> values) {
            addCriterion("Fare not in", values, "fare");
            return (Criteria) this;
        }

        public Criteria andFareBetween(Double value1, Double value2) {
            addCriterion("Fare between", value1, value2, "fare");
            return (Criteria) this;
        }

        public Criteria andFareNotBetween(Double value1, Double value2) {
            addCriterion("Fare not between", value1, value2, "fare");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Double value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Double value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Double value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Double value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Double value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Double> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Double> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Double value1, Double value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Double value1, Double value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andCostIsNull() {
            addCriterion("cost is null");
            return (Criteria) this;
        }

        public Criteria andCostIsNotNull() {
            addCriterion("cost is not null");
            return (Criteria) this;
        }

        public Criteria andCostEqualTo(Double value) {
            addCriterion("cost =", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotEqualTo(Double value) {
            addCriterion("cost <>", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThan(Double value) {
            addCriterion("cost >", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThanOrEqualTo(Double value) {
            addCriterion("cost >=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThan(Double value) {
            addCriterion("cost <", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThanOrEqualTo(Double value) {
            addCriterion("cost <=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostIn(List<Double> values) {
            addCriterion("cost in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotIn(List<Double> values) {
            addCriterion("cost not in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostBetween(Double value1, Double value2) {
            addCriterion("cost between", value1, value2, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotBetween(Double value1, Double value2) {
            addCriterion("cost not between", value1, value2, "cost");
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

        public Criteria andRateIsNull() {
            addCriterion("rate is null");
            return (Criteria) this;
        }

        public Criteria andRateIsNotNull() {
            addCriterion("rate is not null");
            return (Criteria) this;
        }

        public Criteria andRateEqualTo(Double value) {
            addCriterion("rate =", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotEqualTo(Double value) {
            addCriterion("rate <>", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThan(Double value) {
            addCriterion("rate >", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThanOrEqualTo(Double value) {
            addCriterion("rate >=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThan(Double value) {
            addCriterion("rate <", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThanOrEqualTo(Double value) {
            addCriterion("rate <=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateIn(List<Double> values) {
            addCriterion("rate in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotIn(List<Double> values) {
            addCriterion("rate not in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateBetween(Double value1, Double value2) {
            addCriterion("rate between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotBetween(Double value1, Double value2) {
            addCriterion("rate not between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andGbpIsNull() {
            addCriterion("gbp is null");
            return (Criteria) this;
        }

        public Criteria andGbpIsNotNull() {
            addCriterion("gbp is not null");
            return (Criteria) this;
        }

        public Criteria andGbpEqualTo(String value) {
            addCriterion("gbp =", value, "gbp");
            return (Criteria) this;
        }

        public Criteria andGbpNotEqualTo(String value) {
            addCriterion("gbp <>", value, "gbp");
            return (Criteria) this;
        }

        public Criteria andGbpGreaterThan(String value) {
            addCriterion("gbp >", value, "gbp");
            return (Criteria) this;
        }

        public Criteria andGbpGreaterThanOrEqualTo(String value) {
            addCriterion("gbp >=", value, "gbp");
            return (Criteria) this;
        }

        public Criteria andGbpLessThan(String value) {
            addCriterion("gbp <", value, "gbp");
            return (Criteria) this;
        }

        public Criteria andGbpLessThanOrEqualTo(String value) {
            addCriterion("gbp <=", value, "gbp");
            return (Criteria) this;
        }

        public Criteria andGbpLike(String value) {
            addCriterion("gbp like", value, "gbp");
            return (Criteria) this;
        }

        public Criteria andGbpNotLike(String value) {
            addCriterion("gbp not like", value, "gbp");
            return (Criteria) this;
        }

        public Criteria andGbpIn(List<String> values) {
            addCriterion("gbp in", values, "gbp");
            return (Criteria) this;
        }

        public Criteria andGbpNotIn(List<String> values) {
            addCriterion("gbp not in", values, "gbp");
            return (Criteria) this;
        }

        public Criteria andGbpBetween(String value1, String value2) {
            addCriterion("gbp between", value1, value2, "gbp");
            return (Criteria) this;
        }

        public Criteria andGbpNotBetween(String value1, String value2) {
            addCriterion("gbp not between", value1, value2, "gbp");
            return (Criteria) this;
        }

        public Criteria andProfitaIsNull() {
            addCriterion("profitA is null");
            return (Criteria) this;
        }

        public Criteria andProfitaIsNotNull() {
            addCriterion("profitA is not null");
            return (Criteria) this;
        }

        public Criteria andProfitaEqualTo(Double value) {
            addCriterion("profitA =", value, "profita");
            return (Criteria) this;
        }

        public Criteria andProfitaNotEqualTo(Double value) {
            addCriterion("profitA <>", value, "profita");
            return (Criteria) this;
        }

        public Criteria andProfitaGreaterThan(Double value) {
            addCriterion("profitA >", value, "profita");
            return (Criteria) this;
        }

        public Criteria andProfitaGreaterThanOrEqualTo(Double value) {
            addCriterion("profitA >=", value, "profita");
            return (Criteria) this;
        }

        public Criteria andProfitaLessThan(Double value) {
            addCriterion("profitA <", value, "profita");
            return (Criteria) this;
        }

        public Criteria andProfitaLessThanOrEqualTo(Double value) {
            addCriterion("profitA <=", value, "profita");
            return (Criteria) this;
        }

        public Criteria andProfitaIn(List<Double> values) {
            addCriterion("profitA in", values, "profita");
            return (Criteria) this;
        }

        public Criteria andProfitaNotIn(List<Double> values) {
            addCriterion("profitA not in", values, "profita");
            return (Criteria) this;
        }

        public Criteria andProfitaBetween(Double value1, Double value2) {
            addCriterion("profitA between", value1, value2, "profita");
            return (Criteria) this;
        }

        public Criteria andProfitaNotBetween(Double value1, Double value2) {
            addCriterion("profitA not between", value1, value2, "profita");
            return (Criteria) this;
        }

        public Criteria andProfitbIsNull() {
            addCriterion("profitB is null");
            return (Criteria) this;
        }

        public Criteria andProfitbIsNotNull() {
            addCriterion("profitB is not null");
            return (Criteria) this;
        }

        public Criteria andProfitbEqualTo(Double value) {
            addCriterion("profitB =", value, "profitb");
            return (Criteria) this;
        }

        public Criteria andProfitbNotEqualTo(Double value) {
            addCriterion("profitB <>", value, "profitb");
            return (Criteria) this;
        }

        public Criteria andProfitbGreaterThan(Double value) {
            addCriterion("profitB >", value, "profitb");
            return (Criteria) this;
        }

        public Criteria andProfitbGreaterThanOrEqualTo(Double value) {
            addCriterion("profitB >=", value, "profitb");
            return (Criteria) this;
        }

        public Criteria andProfitbLessThan(Double value) {
            addCriterion("profitB <", value, "profitb");
            return (Criteria) this;
        }

        public Criteria andProfitbLessThanOrEqualTo(Double value) {
            addCriterion("profitB <=", value, "profitb");
            return (Criteria) this;
        }

        public Criteria andProfitbIn(List<Double> values) {
            addCriterion("profitB in", values, "profitb");
            return (Criteria) this;
        }

        public Criteria andProfitbNotIn(List<Double> values) {
            addCriterion("profitB not in", values, "profitb");
            return (Criteria) this;
        }

        public Criteria andProfitbBetween(Double value1, Double value2) {
            addCriterion("profitB between", value1, value2, "profitb");
            return (Criteria) this;
        }

        public Criteria andProfitbNotBetween(Double value1, Double value2) {
            addCriterion("profitB not between", value1, value2, "profitb");
            return (Criteria) this;
        }

        public Criteria andProfitcIsNull() {
            addCriterion("profitC is null");
            return (Criteria) this;
        }

        public Criteria andProfitcIsNotNull() {
            addCriterion("profitC is not null");
            return (Criteria) this;
        }

        public Criteria andProfitcEqualTo(Double value) {
            addCriterion("profitC =", value, "profitc");
            return (Criteria) this;
        }

        public Criteria andProfitcNotEqualTo(Double value) {
            addCriterion("profitC <>", value, "profitc");
            return (Criteria) this;
        }

        public Criteria andProfitcGreaterThan(Double value) {
            addCriterion("profitC >", value, "profitc");
            return (Criteria) this;
        }

        public Criteria andProfitcGreaterThanOrEqualTo(Double value) {
            addCriterion("profitC >=", value, "profitc");
            return (Criteria) this;
        }

        public Criteria andProfitcLessThan(Double value) {
            addCriterion("profitC <", value, "profitc");
            return (Criteria) this;
        }

        public Criteria andProfitcLessThanOrEqualTo(Double value) {
            addCriterion("profitC <=", value, "profitc");
            return (Criteria) this;
        }

        public Criteria andProfitcIn(List<Double> values) {
            addCriterion("profitC in", values, "profitc");
            return (Criteria) this;
        }

        public Criteria andProfitcNotIn(List<Double> values) {
            addCriterion("profitC not in", values, "profitc");
            return (Criteria) this;
        }

        public Criteria andProfitcBetween(Double value1, Double value2) {
            addCriterion("profitC between", value1, value2, "profitc");
            return (Criteria) this;
        }

        public Criteria andProfitcNotBetween(Double value1, Double value2) {
            addCriterion("profitC not between", value1, value2, "profitc");
            return (Criteria) this;
        }

        public Criteria andProfitcrateIsNull() {
            addCriterion("profitCRate is null");
            return (Criteria) this;
        }

        public Criteria andProfitcrateIsNotNull() {
            addCriterion("profitCRate is not null");
            return (Criteria) this;
        }

        public Criteria andProfitcrateEqualTo(Double value) {
            addCriterion("profitCRate =", value, "profitcrate");
            return (Criteria) this;
        }

        public Criteria andProfitcrateNotEqualTo(Double value) {
            addCriterion("profitCRate <>", value, "profitcrate");
            return (Criteria) this;
        }

        public Criteria andProfitcrateGreaterThan(Double value) {
            addCriterion("profitCRate >", value, "profitcrate");
            return (Criteria) this;
        }

        public Criteria andProfitcrateGreaterThanOrEqualTo(Double value) {
            addCriterion("profitCRate >=", value, "profitcrate");
            return (Criteria) this;
        }

        public Criteria andProfitcrateLessThan(Double value) {
            addCriterion("profitCRate <", value, "profitcrate");
            return (Criteria) this;
        }

        public Criteria andProfitcrateLessThanOrEqualTo(Double value) {
            addCriterion("profitCRate <=", value, "profitcrate");
            return (Criteria) this;
        }

        public Criteria andProfitcrateIn(List<Double> values) {
            addCriterion("profitCRate in", values, "profitcrate");
            return (Criteria) this;
        }

        public Criteria andProfitcrateNotIn(List<Double> values) {
            addCriterion("profitCRate not in", values, "profitcrate");
            return (Criteria) this;
        }

        public Criteria andProfitcrateBetween(Double value1, Double value2) {
            addCriterion("profitCRate between", value1, value2, "profitcrate");
            return (Criteria) this;
        }

        public Criteria andProfitcrateNotBetween(Double value1, Double value2) {
            addCriterion("profitCRate not between", value1, value2, "profitcrate");
            return (Criteria) this;
        }

        public Criteria andCostrateIsNull() {
            addCriterion("costRate is null");
            return (Criteria) this;
        }

        public Criteria andCostrateIsNotNull() {
            addCriterion("costRate is not null");
            return (Criteria) this;
        }

        public Criteria andCostrateEqualTo(Double value) {
            addCriterion("costRate =", value, "costrate");
            return (Criteria) this;
        }

        public Criteria andCostrateNotEqualTo(Double value) {
            addCriterion("costRate <>", value, "costrate");
            return (Criteria) this;
        }

        public Criteria andCostrateGreaterThan(Double value) {
            addCriterion("costRate >", value, "costrate");
            return (Criteria) this;
        }

        public Criteria andCostrateGreaterThanOrEqualTo(Double value) {
            addCriterion("costRate >=", value, "costrate");
            return (Criteria) this;
        }

        public Criteria andCostrateLessThan(Double value) {
            addCriterion("costRate <", value, "costrate");
            return (Criteria) this;
        }

        public Criteria andCostrateLessThanOrEqualTo(Double value) {
            addCriterion("costRate <=", value, "costrate");
            return (Criteria) this;
        }

        public Criteria andCostrateIn(List<Double> values) {
            addCriterion("costRate in", values, "costrate");
            return (Criteria) this;
        }

        public Criteria andCostrateNotIn(List<Double> values) {
            addCriterion("costRate not in", values, "costrate");
            return (Criteria) this;
        }

        public Criteria andCostrateBetween(Double value1, Double value2) {
            addCriterion("costRate between", value1, value2, "costrate");
            return (Criteria) this;
        }

        public Criteria andCostrateNotBetween(Double value1, Double value2) {
            addCriterion("costRate not between", value1, value2, "costrate");
            return (Criteria) this;
        }

        public Criteria andFreightIsNull() {
            addCriterion("freight is null");
            return (Criteria) this;
        }

        public Criteria andFreightIsNotNull() {
            addCriterion("freight is not null");
            return (Criteria) this;
        }

        public Criteria andFreightEqualTo(Double value) {
            addCriterion("freight =", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightNotEqualTo(Double value) {
            addCriterion("freight <>", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightGreaterThan(Double value) {
            addCriterion("freight >", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightGreaterThanOrEqualTo(Double value) {
            addCriterion("freight >=", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightLessThan(Double value) {
            addCriterion("freight <", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightLessThanOrEqualTo(Double value) {
            addCriterion("freight <=", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightIn(List<Double> values) {
            addCriterion("freight in", values, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightNotIn(List<Double> values) {
            addCriterion("freight not in", values, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightBetween(Double value1, Double value2) {
            addCriterion("freight between", value1, value2, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightNotBetween(Double value1, Double value2) {
            addCriterion("freight not between", value1, value2, "freight");
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