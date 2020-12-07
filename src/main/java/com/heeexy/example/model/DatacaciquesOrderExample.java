package com.heeexy.example.model;

import java.util.ArrayList;
import java.util.List;

public class DatacaciquesOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DatacaciquesOrderExample() {
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

        public Criteria andPforderidIsNull() {
            addCriterion("pfOrderID is null");
            return (Criteria) this;
        }

        public Criteria andPforderidIsNotNull() {
            addCriterion("pfOrderID is not null");
            return (Criteria) this;
        }

        public Criteria andPforderidEqualTo(String value) {
            addCriterion("pfOrderID =", value, "pforderid");
            return (Criteria) this;
        }

        public Criteria andPforderidNotEqualTo(String value) {
            addCriterion("pfOrderID <>", value, "pforderid");
            return (Criteria) this;
        }

        public Criteria andPforderidGreaterThan(String value) {
            addCriterion("pfOrderID >", value, "pforderid");
            return (Criteria) this;
        }

        public Criteria andPforderidGreaterThanOrEqualTo(String value) {
            addCriterion("pfOrderID >=", value, "pforderid");
            return (Criteria) this;
        }

        public Criteria andPforderidLessThan(String value) {
            addCriterion("pfOrderID <", value, "pforderid");
            return (Criteria) this;
        }

        public Criteria andPforderidLessThanOrEqualTo(String value) {
            addCriterion("pfOrderID <=", value, "pforderid");
            return (Criteria) this;
        }

        public Criteria andPforderidLike(String value) {
            addCriterion("pfOrderID like", value, "pforderid");
            return (Criteria) this;
        }

        public Criteria andPforderidNotLike(String value) {
            addCriterion("pfOrderID not like", value, "pforderid");
            return (Criteria) this;
        }

        public Criteria andPforderidIn(List<String> values) {
            addCriterion("pfOrderID in", values, "pforderid");
            return (Criteria) this;
        }

        public Criteria andPforderidNotIn(List<String> values) {
            addCriterion("pfOrderID not in", values, "pforderid");
            return (Criteria) this;
        }

        public Criteria andPforderidBetween(String value1, String value2) {
            addCriterion("pfOrderID between", value1, value2, "pforderid");
            return (Criteria) this;
        }

        public Criteria andPforderidNotBetween(String value1, String value2) {
            addCriterion("pfOrderID not between", value1, value2, "pforderid");
            return (Criteria) this;
        }

        public Criteria andDisplayorderidIsNull() {
            addCriterion("displayOrderID is null");
            return (Criteria) this;
        }

        public Criteria andDisplayorderidIsNotNull() {
            addCriterion("displayOrderID is not null");
            return (Criteria) this;
        }

        public Criteria andDisplayorderidEqualTo(String value) {
            addCriterion("displayOrderID =", value, "displayorderid");
            return (Criteria) this;
        }

        public Criteria andDisplayorderidNotEqualTo(String value) {
            addCriterion("displayOrderID <>", value, "displayorderid");
            return (Criteria) this;
        }

        public Criteria andDisplayorderidGreaterThan(String value) {
            addCriterion("displayOrderID >", value, "displayorderid");
            return (Criteria) this;
        }

        public Criteria andDisplayorderidGreaterThanOrEqualTo(String value) {
            addCriterion("displayOrderID >=", value, "displayorderid");
            return (Criteria) this;
        }

        public Criteria andDisplayorderidLessThan(String value) {
            addCriterion("displayOrderID <", value, "displayorderid");
            return (Criteria) this;
        }

        public Criteria andDisplayorderidLessThanOrEqualTo(String value) {
            addCriterion("displayOrderID <=", value, "displayorderid");
            return (Criteria) this;
        }

        public Criteria andDisplayorderidLike(String value) {
            addCriterion("displayOrderID like", value, "displayorderid");
            return (Criteria) this;
        }

        public Criteria andDisplayorderidNotLike(String value) {
            addCriterion("displayOrderID not like", value, "displayorderid");
            return (Criteria) this;
        }

        public Criteria andDisplayorderidIn(List<String> values) {
            addCriterion("displayOrderID in", values, "displayorderid");
            return (Criteria) this;
        }

        public Criteria andDisplayorderidNotIn(List<String> values) {
            addCriterion("displayOrderID not in", values, "displayorderid");
            return (Criteria) this;
        }

        public Criteria andDisplayorderidBetween(String value1, String value2) {
            addCriterion("displayOrderID between", value1, value2, "displayorderid");
            return (Criteria) this;
        }

        public Criteria andDisplayorderidNotBetween(String value1, String value2) {
            addCriterion("displayOrderID not between", value1, value2, "displayorderid");
            return (Criteria) this;
        }

        public Criteria andPlatformidIsNull() {
            addCriterion("platformID is null");
            return (Criteria) this;
        }

        public Criteria andPlatformidIsNotNull() {
            addCriterion("platformID is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformidEqualTo(Integer value) {
            addCriterion("platformID =", value, "platformid");
            return (Criteria) this;
        }

        public Criteria andPlatformidNotEqualTo(Integer value) {
            addCriterion("platformID <>", value, "platformid");
            return (Criteria) this;
        }

        public Criteria andPlatformidGreaterThan(Integer value) {
            addCriterion("platformID >", value, "platformid");
            return (Criteria) this;
        }

        public Criteria andPlatformidGreaterThanOrEqualTo(Integer value) {
            addCriterion("platformID >=", value, "platformid");
            return (Criteria) this;
        }

        public Criteria andPlatformidLessThan(Integer value) {
            addCriterion("platformID <", value, "platformid");
            return (Criteria) this;
        }

        public Criteria andPlatformidLessThanOrEqualTo(Integer value) {
            addCriterion("platformID <=", value, "platformid");
            return (Criteria) this;
        }

        public Criteria andPlatformidIn(List<Integer> values) {
            addCriterion("platformID in", values, "platformid");
            return (Criteria) this;
        }

        public Criteria andPlatformidNotIn(List<Integer> values) {
            addCriterion("platformID not in", values, "platformid");
            return (Criteria) this;
        }

        public Criteria andPlatformidBetween(Integer value1, Integer value2) {
            addCriterion("platformID between", value1, value2, "platformid");
            return (Criteria) this;
        }

        public Criteria andPlatformidNotBetween(Integer value1, Integer value2) {
            addCriterion("platformID not between", value1, value2, "platformid");
            return (Criteria) this;
        }

        public Criteria andPlatformnameIsNull() {
            addCriterion("platformName is null");
            return (Criteria) this;
        }

        public Criteria andPlatformnameIsNotNull() {
            addCriterion("platformName is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformnameEqualTo(String value) {
            addCriterion("platformName =", value, "platformname");
            return (Criteria) this;
        }

        public Criteria andPlatformnameNotEqualTo(String value) {
            addCriterion("platformName <>", value, "platformname");
            return (Criteria) this;
        }

        public Criteria andPlatformnameGreaterThan(String value) {
            addCriterion("platformName >", value, "platformname");
            return (Criteria) this;
        }

        public Criteria andPlatformnameGreaterThanOrEqualTo(String value) {
            addCriterion("platformName >=", value, "platformname");
            return (Criteria) this;
        }

        public Criteria andPlatformnameLessThan(String value) {
            addCriterion("platformName <", value, "platformname");
            return (Criteria) this;
        }

        public Criteria andPlatformnameLessThanOrEqualTo(String value) {
            addCriterion("platformName <=", value, "platformname");
            return (Criteria) this;
        }

        public Criteria andPlatformnameLike(String value) {
            addCriterion("platformName like", value, "platformname");
            return (Criteria) this;
        }

        public Criteria andPlatformnameNotLike(String value) {
            addCriterion("platformName not like", value, "platformname");
            return (Criteria) this;
        }

        public Criteria andPlatformnameIn(List<String> values) {
            addCriterion("platformName in", values, "platformname");
            return (Criteria) this;
        }

        public Criteria andPlatformnameNotIn(List<String> values) {
            addCriterion("platformName not in", values, "platformname");
            return (Criteria) this;
        }

        public Criteria andPlatformnameBetween(String value1, String value2) {
            addCriterion("platformName between", value1, value2, "platformname");
            return (Criteria) this;
        }

        public Criteria andPlatformnameNotBetween(String value1, String value2) {
            addCriterion("platformName not between", value1, value2, "platformname");
            return (Criteria) this;
        }

        public Criteria andPlatformaccountIsNull() {
            addCriterion("platformAccount is null");
            return (Criteria) this;
        }

        public Criteria andPlatformaccountIsNotNull() {
            addCriterion("platformAccount is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformaccountEqualTo(String value) {
            addCriterion("platformAccount =", value, "platformaccount");
            return (Criteria) this;
        }

        public Criteria andPlatformaccountNotEqualTo(String value) {
            addCriterion("platformAccount <>", value, "platformaccount");
            return (Criteria) this;
        }

        public Criteria andPlatformaccountGreaterThan(String value) {
            addCriterion("platformAccount >", value, "platformaccount");
            return (Criteria) this;
        }

        public Criteria andPlatformaccountGreaterThanOrEqualTo(String value) {
            addCriterion("platformAccount >=", value, "platformaccount");
            return (Criteria) this;
        }

        public Criteria andPlatformaccountLessThan(String value) {
            addCriterion("platformAccount <", value, "platformaccount");
            return (Criteria) this;
        }

        public Criteria andPlatformaccountLessThanOrEqualTo(String value) {
            addCriterion("platformAccount <=", value, "platformaccount");
            return (Criteria) this;
        }

        public Criteria andPlatformaccountLike(String value) {
            addCriterion("platformAccount like", value, "platformaccount");
            return (Criteria) this;
        }

        public Criteria andPlatformaccountNotLike(String value) {
            addCriterion("platformAccount not like", value, "platformaccount");
            return (Criteria) this;
        }

        public Criteria andPlatformaccountIn(List<String> values) {
            addCriterion("platformAccount in", values, "platformaccount");
            return (Criteria) this;
        }

        public Criteria andPlatformaccountNotIn(List<String> values) {
            addCriterion("platformAccount not in", values, "platformaccount");
            return (Criteria) this;
        }

        public Criteria andPlatformaccountBetween(String value1, String value2) {
            addCriterion("platformAccount between", value1, value2, "platformaccount");
            return (Criteria) this;
        }

        public Criteria andPlatformaccountNotBetween(String value1, String value2) {
            addCriterion("platformAccount not between", value1, value2, "platformaccount");
            return (Criteria) this;
        }

        public Criteria andShippingtimeIsNull() {
            addCriterion("shippingTime is null");
            return (Criteria) this;
        }

        public Criteria andShippingtimeIsNotNull() {
            addCriterion("shippingTime is not null");
            return (Criteria) this;
        }

        public Criteria andShippingtimeEqualTo(String value) {
            addCriterion("shippingTime =", value, "shippingtime");
            return (Criteria) this;
        }

        public Criteria andShippingtimeNotEqualTo(String value) {
            addCriterion("shippingTime <>", value, "shippingtime");
            return (Criteria) this;
        }

        public Criteria andShippingtimeGreaterThan(String value) {
            addCriterion("shippingTime >", value, "shippingtime");
            return (Criteria) this;
        }

        public Criteria andShippingtimeGreaterThanOrEqualTo(String value) {
            addCriterion("shippingTime >=", value, "shippingtime");
            return (Criteria) this;
        }

        public Criteria andShippingtimeLessThan(String value) {
            addCriterion("shippingTime <", value, "shippingtime");
            return (Criteria) this;
        }

        public Criteria andShippingtimeLessThanOrEqualTo(String value) {
            addCriterion("shippingTime <=", value, "shippingtime");
            return (Criteria) this;
        }

        public Criteria andShippingtimeLike(String value) {
            addCriterion("shippingTime like", value, "shippingtime");
            return (Criteria) this;
        }

        public Criteria andShippingtimeNotLike(String value) {
            addCriterion("shippingTime not like", value, "shippingtime");
            return (Criteria) this;
        }

        public Criteria andShippingtimeIn(List<String> values) {
            addCriterion("shippingTime in", values, "shippingtime");
            return (Criteria) this;
        }

        public Criteria andShippingtimeNotIn(List<String> values) {
            addCriterion("shippingTime not in", values, "shippingtime");
            return (Criteria) this;
        }

        public Criteria andShippingtimeBetween(String value1, String value2) {
            addCriterion("shippingTime between", value1, value2, "shippingtime");
            return (Criteria) this;
        }

        public Criteria andShippingtimeNotBetween(String value1, String value2) {
            addCriterion("shippingTime not between", value1, value2, "shippingtime");
            return (Criteria) this;
        }

        public Criteria andDeliverywaysIsNull() {
            addCriterion("deliveryWays is null");
            return (Criteria) this;
        }

        public Criteria andDeliverywaysIsNotNull() {
            addCriterion("deliveryWays is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverywaysEqualTo(String value) {
            addCriterion("deliveryWays =", value, "deliveryways");
            return (Criteria) this;
        }

        public Criteria andDeliverywaysNotEqualTo(String value) {
            addCriterion("deliveryWays <>", value, "deliveryways");
            return (Criteria) this;
        }

        public Criteria andDeliverywaysGreaterThan(String value) {
            addCriterion("deliveryWays >", value, "deliveryways");
            return (Criteria) this;
        }

        public Criteria andDeliverywaysGreaterThanOrEqualTo(String value) {
            addCriterion("deliveryWays >=", value, "deliveryways");
            return (Criteria) this;
        }

        public Criteria andDeliverywaysLessThan(String value) {
            addCriterion("deliveryWays <", value, "deliveryways");
            return (Criteria) this;
        }

        public Criteria andDeliverywaysLessThanOrEqualTo(String value) {
            addCriterion("deliveryWays <=", value, "deliveryways");
            return (Criteria) this;
        }

        public Criteria andDeliverywaysLike(String value) {
            addCriterion("deliveryWays like", value, "deliveryways");
            return (Criteria) this;
        }

        public Criteria andDeliverywaysNotLike(String value) {
            addCriterion("deliveryWays not like", value, "deliveryways");
            return (Criteria) this;
        }

        public Criteria andDeliverywaysIn(List<String> values) {
            addCriterion("deliveryWays in", values, "deliveryways");
            return (Criteria) this;
        }

        public Criteria andDeliverywaysNotIn(List<String> values) {
            addCriterion("deliveryWays not in", values, "deliveryways");
            return (Criteria) this;
        }

        public Criteria andDeliverywaysBetween(String value1, String value2) {
            addCriterion("deliveryWays between", value1, value2, "deliveryways");
            return (Criteria) this;
        }

        public Criteria andDeliverywaysNotBetween(String value1, String value2) {
            addCriterion("deliveryWays not between", value1, value2, "deliveryways");
            return (Criteria) this;
        }

        public Criteria andPfordercreatetimeIsNull() {
            addCriterion("pfOrderCreateTime is null");
            return (Criteria) this;
        }

        public Criteria andPfordercreatetimeIsNotNull() {
            addCriterion("pfOrderCreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andPfordercreatetimeEqualTo(String value) {
            addCriterion("pfOrderCreateTime =", value, "pfordercreatetime");
            return (Criteria) this;
        }

        public Criteria andPfordercreatetimeNotEqualTo(String value) {
            addCriterion("pfOrderCreateTime <>", value, "pfordercreatetime");
            return (Criteria) this;
        }

        public Criteria andPfordercreatetimeGreaterThan(String value) {
            addCriterion("pfOrderCreateTime >", value, "pfordercreatetime");
            return (Criteria) this;
        }

        public Criteria andPfordercreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("pfOrderCreateTime >=", value, "pfordercreatetime");
            return (Criteria) this;
        }

        public Criteria andPfordercreatetimeLessThan(String value) {
            addCriterion("pfOrderCreateTime <", value, "pfordercreatetime");
            return (Criteria) this;
        }

        public Criteria andPfordercreatetimeLessThanOrEqualTo(String value) {
            addCriterion("pfOrderCreateTime <=", value, "pfordercreatetime");
            return (Criteria) this;
        }

        public Criteria andPfordercreatetimeLike(String value) {
            addCriterion("pfOrderCreateTime like", value, "pfordercreatetime");
            return (Criteria) this;
        }

        public Criteria andPfordercreatetimeNotLike(String value) {
            addCriterion("pfOrderCreateTime not like", value, "pfordercreatetime");
            return (Criteria) this;
        }

        public Criteria andPfordercreatetimeIn(List<String> values) {
            addCriterion("pfOrderCreateTime in", values, "pfordercreatetime");
            return (Criteria) this;
        }

        public Criteria andPfordercreatetimeNotIn(List<String> values) {
            addCriterion("pfOrderCreateTime not in", values, "pfordercreatetime");
            return (Criteria) this;
        }

        public Criteria andPfordercreatetimeBetween(String value1, String value2) {
            addCriterion("pfOrderCreateTime between", value1, value2, "pfordercreatetime");
            return (Criteria) this;
        }

        public Criteria andPfordercreatetimeNotBetween(String value1, String value2) {
            addCriterion("pfOrderCreateTime not between", value1, value2, "pfordercreatetime");
            return (Criteria) this;
        }

        public Criteria andPaidtimeIsNull() {
            addCriterion("paidTime is null");
            return (Criteria) this;
        }

        public Criteria andPaidtimeIsNotNull() {
            addCriterion("paidTime is not null");
            return (Criteria) this;
        }

        public Criteria andPaidtimeEqualTo(String value) {
            addCriterion("paidTime =", value, "paidtime");
            return (Criteria) this;
        }

        public Criteria andPaidtimeNotEqualTo(String value) {
            addCriterion("paidTime <>", value, "paidtime");
            return (Criteria) this;
        }

        public Criteria andPaidtimeGreaterThan(String value) {
            addCriterion("paidTime >", value, "paidtime");
            return (Criteria) this;
        }

        public Criteria andPaidtimeGreaterThanOrEqualTo(String value) {
            addCriterion("paidTime >=", value, "paidtime");
            return (Criteria) this;
        }

        public Criteria andPaidtimeLessThan(String value) {
            addCriterion("paidTime <", value, "paidtime");
            return (Criteria) this;
        }

        public Criteria andPaidtimeLessThanOrEqualTo(String value) {
            addCriterion("paidTime <=", value, "paidtime");
            return (Criteria) this;
        }

        public Criteria andPaidtimeLike(String value) {
            addCriterion("paidTime like", value, "paidtime");
            return (Criteria) this;
        }

        public Criteria andPaidtimeNotLike(String value) {
            addCriterion("paidTime not like", value, "paidtime");
            return (Criteria) this;
        }

        public Criteria andPaidtimeIn(List<String> values) {
            addCriterion("paidTime in", values, "paidtime");
            return (Criteria) this;
        }

        public Criteria andPaidtimeNotIn(List<String> values) {
            addCriterion("paidTime not in", values, "paidtime");
            return (Criteria) this;
        }

        public Criteria andPaidtimeBetween(String value1, String value2) {
            addCriterion("paidTime between", value1, value2, "paidtime");
            return (Criteria) this;
        }

        public Criteria andPaidtimeNotBetween(String value1, String value2) {
            addCriterion("paidTime not between", value1, value2, "paidtime");
            return (Criteria) this;
        }

        public Criteria andBuyeridIsNull() {
            addCriterion("buyerID is null");
            return (Criteria) this;
        }

        public Criteria andBuyeridIsNotNull() {
            addCriterion("buyerID is not null");
            return (Criteria) this;
        }

        public Criteria andBuyeridEqualTo(String value) {
            addCriterion("buyerID =", value, "buyerid");
            return (Criteria) this;
        }

        public Criteria andBuyeridNotEqualTo(String value) {
            addCriterion("buyerID <>", value, "buyerid");
            return (Criteria) this;
        }

        public Criteria andBuyeridGreaterThan(String value) {
            addCriterion("buyerID >", value, "buyerid");
            return (Criteria) this;
        }

        public Criteria andBuyeridGreaterThanOrEqualTo(String value) {
            addCriterion("buyerID >=", value, "buyerid");
            return (Criteria) this;
        }

        public Criteria andBuyeridLessThan(String value) {
            addCriterion("buyerID <", value, "buyerid");
            return (Criteria) this;
        }

        public Criteria andBuyeridLessThanOrEqualTo(String value) {
            addCriterion("buyerID <=", value, "buyerid");
            return (Criteria) this;
        }

        public Criteria andBuyeridLike(String value) {
            addCriterion("buyerID like", value, "buyerid");
            return (Criteria) this;
        }

        public Criteria andBuyeridNotLike(String value) {
            addCriterion("buyerID not like", value, "buyerid");
            return (Criteria) this;
        }

        public Criteria andBuyeridIn(List<String> values) {
            addCriterion("buyerID in", values, "buyerid");
            return (Criteria) this;
        }

        public Criteria andBuyeridNotIn(List<String> values) {
            addCriterion("buyerID not in", values, "buyerid");
            return (Criteria) this;
        }

        public Criteria andBuyeridBetween(String value1, String value2) {
            addCriterion("buyerID between", value1, value2, "buyerid");
            return (Criteria) this;
        }

        public Criteria andBuyeridNotBetween(String value1, String value2) {
            addCriterion("buyerID not between", value1, value2, "buyerid");
            return (Criteria) this;
        }

        public Criteria andBuyernameIsNull() {
            addCriterion("buyerName is null");
            return (Criteria) this;
        }

        public Criteria andBuyernameIsNotNull() {
            addCriterion("buyerName is not null");
            return (Criteria) this;
        }

        public Criteria andBuyernameEqualTo(String value) {
            addCriterion("buyerName =", value, "buyername");
            return (Criteria) this;
        }

        public Criteria andBuyernameNotEqualTo(String value) {
            addCriterion("buyerName <>", value, "buyername");
            return (Criteria) this;
        }

        public Criteria andBuyernameGreaterThan(String value) {
            addCriterion("buyerName >", value, "buyername");
            return (Criteria) this;
        }

        public Criteria andBuyernameGreaterThanOrEqualTo(String value) {
            addCriterion("buyerName >=", value, "buyername");
            return (Criteria) this;
        }

        public Criteria andBuyernameLessThan(String value) {
            addCriterion("buyerName <", value, "buyername");
            return (Criteria) this;
        }

        public Criteria andBuyernameLessThanOrEqualTo(String value) {
            addCriterion("buyerName <=", value, "buyername");
            return (Criteria) this;
        }

        public Criteria andBuyernameLike(String value) {
            addCriterion("buyerName like", value, "buyername");
            return (Criteria) this;
        }

        public Criteria andBuyernameNotLike(String value) {
            addCriterion("buyerName not like", value, "buyername");
            return (Criteria) this;
        }

        public Criteria andBuyernameIn(List<String> values) {
            addCriterion("buyerName in", values, "buyername");
            return (Criteria) this;
        }

        public Criteria andBuyernameNotIn(List<String> values) {
            addCriterion("buyerName not in", values, "buyername");
            return (Criteria) this;
        }

        public Criteria andBuyernameBetween(String value1, String value2) {
            addCriterion("buyerName between", value1, value2, "buyername");
            return (Criteria) this;
        }

        public Criteria andBuyernameNotBetween(String value1, String value2) {
            addCriterion("buyerName not between", value1, value2, "buyername");
            return (Criteria) this;
        }

        public Criteria andBuyeremailIsNull() {
            addCriterion("buyerEmail is null");
            return (Criteria) this;
        }

        public Criteria andBuyeremailIsNotNull() {
            addCriterion("buyerEmail is not null");
            return (Criteria) this;
        }

        public Criteria andBuyeremailEqualTo(String value) {
            addCriterion("buyerEmail =", value, "buyeremail");
            return (Criteria) this;
        }

        public Criteria andBuyeremailNotEqualTo(String value) {
            addCriterion("buyerEmail <>", value, "buyeremail");
            return (Criteria) this;
        }

        public Criteria andBuyeremailGreaterThan(String value) {
            addCriterion("buyerEmail >", value, "buyeremail");
            return (Criteria) this;
        }

        public Criteria andBuyeremailGreaterThanOrEqualTo(String value) {
            addCriterion("buyerEmail >=", value, "buyeremail");
            return (Criteria) this;
        }

        public Criteria andBuyeremailLessThan(String value) {
            addCriterion("buyerEmail <", value, "buyeremail");
            return (Criteria) this;
        }

        public Criteria andBuyeremailLessThanOrEqualTo(String value) {
            addCriterion("buyerEmail <=", value, "buyeremail");
            return (Criteria) this;
        }

        public Criteria andBuyeremailLike(String value) {
            addCriterion("buyerEmail like", value, "buyeremail");
            return (Criteria) this;
        }

        public Criteria andBuyeremailNotLike(String value) {
            addCriterion("buyerEmail not like", value, "buyeremail");
            return (Criteria) this;
        }

        public Criteria andBuyeremailIn(List<String> values) {
            addCriterion("buyerEmail in", values, "buyeremail");
            return (Criteria) this;
        }

        public Criteria andBuyeremailNotIn(List<String> values) {
            addCriterion("buyerEmail not in", values, "buyeremail");
            return (Criteria) this;
        }

        public Criteria andBuyeremailBetween(String value1, String value2) {
            addCriterion("buyerEmail between", value1, value2, "buyeremail");
            return (Criteria) this;
        }

        public Criteria andBuyeremailNotBetween(String value1, String value2) {
            addCriterion("buyerEmail not between", value1, value2, "buyeremail");
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

        public Criteria andOrderamountIsNull() {
            addCriterion("orderAmount is null");
            return (Criteria) this;
        }

        public Criteria andOrderamountIsNotNull() {
            addCriterion("orderAmount is not null");
            return (Criteria) this;
        }

        public Criteria andOrderamountEqualTo(String value) {
            addCriterion("orderAmount =", value, "orderamount");
            return (Criteria) this;
        }

        public Criteria andOrderamountNotEqualTo(String value) {
            addCriterion("orderAmount <>", value, "orderamount");
            return (Criteria) this;
        }

        public Criteria andOrderamountGreaterThan(String value) {
            addCriterion("orderAmount >", value, "orderamount");
            return (Criteria) this;
        }

        public Criteria andOrderamountGreaterThanOrEqualTo(String value) {
            addCriterion("orderAmount >=", value, "orderamount");
            return (Criteria) this;
        }

        public Criteria andOrderamountLessThan(String value) {
            addCriterion("orderAmount <", value, "orderamount");
            return (Criteria) this;
        }

        public Criteria andOrderamountLessThanOrEqualTo(String value) {
            addCriterion("orderAmount <=", value, "orderamount");
            return (Criteria) this;
        }

        public Criteria andOrderamountLike(String value) {
            addCriterion("orderAmount like", value, "orderamount");
            return (Criteria) this;
        }

        public Criteria andOrderamountNotLike(String value) {
            addCriterion("orderAmount not like", value, "orderamount");
            return (Criteria) this;
        }

        public Criteria andOrderamountIn(List<String> values) {
            addCriterion("orderAmount in", values, "orderamount");
            return (Criteria) this;
        }

        public Criteria andOrderamountNotIn(List<String> values) {
            addCriterion("orderAmount not in", values, "orderamount");
            return (Criteria) this;
        }

        public Criteria andOrderamountBetween(String value1, String value2) {
            addCriterion("orderAmount between", value1, value2, "orderamount");
            return (Criteria) this;
        }

        public Criteria andOrderamountNotBetween(String value1, String value2) {
            addCriterion("orderAmount not between", value1, value2, "orderamount");
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

        public Criteria andPfshippingamountEqualTo(String value) {
            addCriterion("pfShippingAmount =", value, "pfshippingamount");
            return (Criteria) this;
        }

        public Criteria andPfshippingamountNotEqualTo(String value) {
            addCriterion("pfShippingAmount <>", value, "pfshippingamount");
            return (Criteria) this;
        }

        public Criteria andPfshippingamountGreaterThan(String value) {
            addCriterion("pfShippingAmount >", value, "pfshippingamount");
            return (Criteria) this;
        }

        public Criteria andPfshippingamountGreaterThanOrEqualTo(String value) {
            addCriterion("pfShippingAmount >=", value, "pfshippingamount");
            return (Criteria) this;
        }

        public Criteria andPfshippingamountLessThan(String value) {
            addCriterion("pfShippingAmount <", value, "pfshippingamount");
            return (Criteria) this;
        }

        public Criteria andPfshippingamountLessThanOrEqualTo(String value) {
            addCriterion("pfShippingAmount <=", value, "pfshippingamount");
            return (Criteria) this;
        }

        public Criteria andPfshippingamountLike(String value) {
            addCriterion("pfShippingAmount like", value, "pfshippingamount");
            return (Criteria) this;
        }

        public Criteria andPfshippingamountNotLike(String value) {
            addCriterion("pfShippingAmount not like", value, "pfshippingamount");
            return (Criteria) this;
        }

        public Criteria andPfshippingamountIn(List<String> values) {
            addCriterion("pfShippingAmount in", values, "pfshippingamount");
            return (Criteria) this;
        }

        public Criteria andPfshippingamountNotIn(List<String> values) {
            addCriterion("pfShippingAmount not in", values, "pfshippingamount");
            return (Criteria) this;
        }

        public Criteria andPfshippingamountBetween(String value1, String value2) {
            addCriterion("pfShippingAmount between", value1, value2, "pfshippingamount");
            return (Criteria) this;
        }

        public Criteria andPfshippingamountNotBetween(String value1, String value2) {
            addCriterion("pfShippingAmount not between", value1, value2, "pfshippingamount");
            return (Criteria) this;
        }

        public Criteria andSelleremailIsNull() {
            addCriterion("sellerEmail is null");
            return (Criteria) this;
        }

        public Criteria andSelleremailIsNotNull() {
            addCriterion("sellerEmail is not null");
            return (Criteria) this;
        }

        public Criteria andSelleremailEqualTo(String value) {
            addCriterion("sellerEmail =", value, "selleremail");
            return (Criteria) this;
        }

        public Criteria andSelleremailNotEqualTo(String value) {
            addCriterion("sellerEmail <>", value, "selleremail");
            return (Criteria) this;
        }

        public Criteria andSelleremailGreaterThan(String value) {
            addCriterion("sellerEmail >", value, "selleremail");
            return (Criteria) this;
        }

        public Criteria andSelleremailGreaterThanOrEqualTo(String value) {
            addCriterion("sellerEmail >=", value, "selleremail");
            return (Criteria) this;
        }

        public Criteria andSelleremailLessThan(String value) {
            addCriterion("sellerEmail <", value, "selleremail");
            return (Criteria) this;
        }

        public Criteria andSelleremailLessThanOrEqualTo(String value) {
            addCriterion("sellerEmail <=", value, "selleremail");
            return (Criteria) this;
        }

        public Criteria andSelleremailLike(String value) {
            addCriterion("sellerEmail like", value, "selleremail");
            return (Criteria) this;
        }

        public Criteria andSelleremailNotLike(String value) {
            addCriterion("sellerEmail not like", value, "selleremail");
            return (Criteria) this;
        }

        public Criteria andSelleremailIn(List<String> values) {
            addCriterion("sellerEmail in", values, "selleremail");
            return (Criteria) this;
        }

        public Criteria andSelleremailNotIn(List<String> values) {
            addCriterion("sellerEmail not in", values, "selleremail");
            return (Criteria) this;
        }

        public Criteria andSelleremailBetween(String value1, String value2) {
            addCriterion("sellerEmail between", value1, value2, "selleremail");
            return (Criteria) this;
        }

        public Criteria andSelleremailNotBetween(String value1, String value2) {
            addCriterion("sellerEmail not between", value1, value2, "selleremail");
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

        public Criteria andEbayrecordnumberIsNull() {
            addCriterion("ebayRecordNumber is null");
            return (Criteria) this;
        }

        public Criteria andEbayrecordnumberIsNotNull() {
            addCriterion("ebayRecordNumber is not null");
            return (Criteria) this;
        }

        public Criteria andEbayrecordnumberEqualTo(String value) {
            addCriterion("ebayRecordNumber =", value, "ebayrecordnumber");
            return (Criteria) this;
        }

        public Criteria andEbayrecordnumberNotEqualTo(String value) {
            addCriterion("ebayRecordNumber <>", value, "ebayrecordnumber");
            return (Criteria) this;
        }

        public Criteria andEbayrecordnumberGreaterThan(String value) {
            addCriterion("ebayRecordNumber >", value, "ebayrecordnumber");
            return (Criteria) this;
        }

        public Criteria andEbayrecordnumberGreaterThanOrEqualTo(String value) {
            addCriterion("ebayRecordNumber >=", value, "ebayrecordnumber");
            return (Criteria) this;
        }

        public Criteria andEbayrecordnumberLessThan(String value) {
            addCriterion("ebayRecordNumber <", value, "ebayrecordnumber");
            return (Criteria) this;
        }

        public Criteria andEbayrecordnumberLessThanOrEqualTo(String value) {
            addCriterion("ebayRecordNumber <=", value, "ebayrecordnumber");
            return (Criteria) this;
        }

        public Criteria andEbayrecordnumberLike(String value) {
            addCriterion("ebayRecordNumber like", value, "ebayrecordnumber");
            return (Criteria) this;
        }

        public Criteria andEbayrecordnumberNotLike(String value) {
            addCriterion("ebayRecordNumber not like", value, "ebayrecordnumber");
            return (Criteria) this;
        }

        public Criteria andEbayrecordnumberIn(List<String> values) {
            addCriterion("ebayRecordNumber in", values, "ebayrecordnumber");
            return (Criteria) this;
        }

        public Criteria andEbayrecordnumberNotIn(List<String> values) {
            addCriterion("ebayRecordNumber not in", values, "ebayrecordnumber");
            return (Criteria) this;
        }

        public Criteria andEbayrecordnumberBetween(String value1, String value2) {
            addCriterion("ebayRecordNumber between", value1, value2, "ebayrecordnumber");
            return (Criteria) this;
        }

        public Criteria andEbayrecordnumberNotBetween(String value1, String value2) {
            addCriterion("ebayRecordNumber not between", value1, value2, "ebayrecordnumber");
            return (Criteria) this;
        }

        public Criteria andTransactionidIsNull() {
            addCriterion("transactionID is null");
            return (Criteria) this;
        }

        public Criteria andTransactionidIsNotNull() {
            addCriterion("transactionID is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionidEqualTo(String value) {
            addCriterion("transactionID =", value, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidNotEqualTo(String value) {
            addCriterion("transactionID <>", value, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidGreaterThan(String value) {
            addCriterion("transactionID >", value, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidGreaterThanOrEqualTo(String value) {
            addCriterion("transactionID >=", value, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidLessThan(String value) {
            addCriterion("transactionID <", value, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidLessThanOrEqualTo(String value) {
            addCriterion("transactionID <=", value, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidLike(String value) {
            addCriterion("transactionID like", value, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidNotLike(String value) {
            addCriterion("transactionID not like", value, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidIn(List<String> values) {
            addCriterion("transactionID in", values, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidNotIn(List<String> values) {
            addCriterion("transactionID not in", values, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidBetween(String value1, String value2) {
            addCriterion("transactionID between", value1, value2, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidNotBetween(String value1, String value2) {
            addCriterion("transactionID not between", value1, value2, "transactionid");
            return (Criteria) this;
        }

        public Criteria andSiteidIsNull() {
            addCriterion("siteID is null");
            return (Criteria) this;
        }

        public Criteria andSiteidIsNotNull() {
            addCriterion("siteID is not null");
            return (Criteria) this;
        }

        public Criteria andSiteidEqualTo(String value) {
            addCriterion("siteID =", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidNotEqualTo(String value) {
            addCriterion("siteID <>", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidGreaterThan(String value) {
            addCriterion("siteID >", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidGreaterThanOrEqualTo(String value) {
            addCriterion("siteID >=", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidLessThan(String value) {
            addCriterion("siteID <", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidLessThanOrEqualTo(String value) {
            addCriterion("siteID <=", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidLike(String value) {
            addCriterion("siteID like", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidNotLike(String value) {
            addCriterion("siteID not like", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidIn(List<String> values) {
            addCriterion("siteID in", values, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidNotIn(List<String> values) {
            addCriterion("siteID not in", values, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidBetween(String value1, String value2) {
            addCriterion("siteID between", value1, value2, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidNotBetween(String value1, String value2) {
            addCriterion("siteID not between", value1, value2, "siteid");
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

        public Criteria andSysorderstatuspendingIsNull() {
            addCriterion("sysOrderStatusPending is null");
            return (Criteria) this;
        }

        public Criteria andSysorderstatuspendingIsNotNull() {
            addCriterion("sysOrderStatusPending is not null");
            return (Criteria) this;
        }

        public Criteria andSysorderstatuspendingEqualTo(Integer value) {
            addCriterion("sysOrderStatusPending =", value, "sysorderstatuspending");
            return (Criteria) this;
        }

        public Criteria andSysorderstatuspendingNotEqualTo(Integer value) {
            addCriterion("sysOrderStatusPending <>", value, "sysorderstatuspending");
            return (Criteria) this;
        }

        public Criteria andSysorderstatuspendingGreaterThan(Integer value) {
            addCriterion("sysOrderStatusPending >", value, "sysorderstatuspending");
            return (Criteria) this;
        }

        public Criteria andSysorderstatuspendingGreaterThanOrEqualTo(Integer value) {
            addCriterion("sysOrderStatusPending >=", value, "sysorderstatuspending");
            return (Criteria) this;
        }

        public Criteria andSysorderstatuspendingLessThan(Integer value) {
            addCriterion("sysOrderStatusPending <", value, "sysorderstatuspending");
            return (Criteria) this;
        }

        public Criteria andSysorderstatuspendingLessThanOrEqualTo(Integer value) {
            addCriterion("sysOrderStatusPending <=", value, "sysorderstatuspending");
            return (Criteria) this;
        }

        public Criteria andSysorderstatuspendingIn(List<Integer> values) {
            addCriterion("sysOrderStatusPending in", values, "sysorderstatuspending");
            return (Criteria) this;
        }

        public Criteria andSysorderstatuspendingNotIn(List<Integer> values) {
            addCriterion("sysOrderStatusPending not in", values, "sysorderstatuspending");
            return (Criteria) this;
        }

        public Criteria andSysorderstatuspendingBetween(Integer value1, Integer value2) {
            addCriterion("sysOrderStatusPending between", value1, value2, "sysorderstatuspending");
            return (Criteria) this;
        }

        public Criteria andSysorderstatuspendingNotBetween(Integer value1, Integer value2) {
            addCriterion("sysOrderStatusPending not between", value1, value2, "sysorderstatuspending");
            return (Criteria) this;
        }

        public Criteria andSysorderstatusdistributionIsNull() {
            addCriterion("sysOrderStatusDistribution is null");
            return (Criteria) this;
        }

        public Criteria andSysorderstatusdistributionIsNotNull() {
            addCriterion("sysOrderStatusDistribution is not null");
            return (Criteria) this;
        }

        public Criteria andSysorderstatusdistributionEqualTo(Integer value) {
            addCriterion("sysOrderStatusDistribution =", value, "sysorderstatusdistribution");
            return (Criteria) this;
        }

        public Criteria andSysorderstatusdistributionNotEqualTo(Integer value) {
            addCriterion("sysOrderStatusDistribution <>", value, "sysorderstatusdistribution");
            return (Criteria) this;
        }

        public Criteria andSysorderstatusdistributionGreaterThan(Integer value) {
            addCriterion("sysOrderStatusDistribution >", value, "sysorderstatusdistribution");
            return (Criteria) this;
        }

        public Criteria andSysorderstatusdistributionGreaterThanOrEqualTo(Integer value) {
            addCriterion("sysOrderStatusDistribution >=", value, "sysorderstatusdistribution");
            return (Criteria) this;
        }

        public Criteria andSysorderstatusdistributionLessThan(Integer value) {
            addCriterion("sysOrderStatusDistribution <", value, "sysorderstatusdistribution");
            return (Criteria) this;
        }

        public Criteria andSysorderstatusdistributionLessThanOrEqualTo(Integer value) {
            addCriterion("sysOrderStatusDistribution <=", value, "sysorderstatusdistribution");
            return (Criteria) this;
        }

        public Criteria andSysorderstatusdistributionIn(List<Integer> values) {
            addCriterion("sysOrderStatusDistribution in", values, "sysorderstatusdistribution");
            return (Criteria) this;
        }

        public Criteria andSysorderstatusdistributionNotIn(List<Integer> values) {
            addCriterion("sysOrderStatusDistribution not in", values, "sysorderstatusdistribution");
            return (Criteria) this;
        }

        public Criteria andSysorderstatusdistributionBetween(Integer value1, Integer value2) {
            addCriterion("sysOrderStatusDistribution between", value1, value2, "sysorderstatusdistribution");
            return (Criteria) this;
        }

        public Criteria andSysorderstatusdistributionNotBetween(Integer value1, Integer value2) {
            addCriterion("sysOrderStatusDistribution not between", value1, value2, "sysorderstatusdistribution");
            return (Criteria) this;
        }

        public Criteria andSysorderstatusshippedIsNull() {
            addCriterion("sysOrderStatusShipped is null");
            return (Criteria) this;
        }

        public Criteria andSysorderstatusshippedIsNotNull() {
            addCriterion("sysOrderStatusShipped is not null");
            return (Criteria) this;
        }

        public Criteria andSysorderstatusshippedEqualTo(Integer value) {
            addCriterion("sysOrderStatusShipped =", value, "sysorderstatusshipped");
            return (Criteria) this;
        }

        public Criteria andSysorderstatusshippedNotEqualTo(Integer value) {
            addCriterion("sysOrderStatusShipped <>", value, "sysorderstatusshipped");
            return (Criteria) this;
        }

        public Criteria andSysorderstatusshippedGreaterThan(Integer value) {
            addCriterion("sysOrderStatusShipped >", value, "sysorderstatusshipped");
            return (Criteria) this;
        }

        public Criteria andSysorderstatusshippedGreaterThanOrEqualTo(Integer value) {
            addCriterion("sysOrderStatusShipped >=", value, "sysorderstatusshipped");
            return (Criteria) this;
        }

        public Criteria andSysorderstatusshippedLessThan(Integer value) {
            addCriterion("sysOrderStatusShipped <", value, "sysorderstatusshipped");
            return (Criteria) this;
        }

        public Criteria andSysorderstatusshippedLessThanOrEqualTo(Integer value) {
            addCriterion("sysOrderStatusShipped <=", value, "sysorderstatusshipped");
            return (Criteria) this;
        }

        public Criteria andSysorderstatusshippedIn(List<Integer> values) {
            addCriterion("sysOrderStatusShipped in", values, "sysorderstatusshipped");
            return (Criteria) this;
        }

        public Criteria andSysorderstatusshippedNotIn(List<Integer> values) {
            addCriterion("sysOrderStatusShipped not in", values, "sysorderstatusshipped");
            return (Criteria) this;
        }

        public Criteria andSysorderstatusshippedBetween(Integer value1, Integer value2) {
            addCriterion("sysOrderStatusShipped between", value1, value2, "sysorderstatusshipped");
            return (Criteria) this;
        }

        public Criteria andSysorderstatusshippedNotBetween(Integer value1, Integer value2) {
            addCriterion("sysOrderStatusShipped not between", value1, value2, "sysorderstatusshipped");
            return (Criteria) this;
        }

        public Criteria andSysorderstatusreturnedIsNull() {
            addCriterion("sysOrderStatusReturned is null");
            return (Criteria) this;
        }

        public Criteria andSysorderstatusreturnedIsNotNull() {
            addCriterion("sysOrderStatusReturned is not null");
            return (Criteria) this;
        }

        public Criteria andSysorderstatusreturnedEqualTo(Integer value) {
            addCriterion("sysOrderStatusReturned =", value, "sysorderstatusreturned");
            return (Criteria) this;
        }

        public Criteria andSysorderstatusreturnedNotEqualTo(Integer value) {
            addCriterion("sysOrderStatusReturned <>", value, "sysorderstatusreturned");
            return (Criteria) this;
        }

        public Criteria andSysorderstatusreturnedGreaterThan(Integer value) {
            addCriterion("sysOrderStatusReturned >", value, "sysorderstatusreturned");
            return (Criteria) this;
        }

        public Criteria andSysorderstatusreturnedGreaterThanOrEqualTo(Integer value) {
            addCriterion("sysOrderStatusReturned >=", value, "sysorderstatusreturned");
            return (Criteria) this;
        }

        public Criteria andSysorderstatusreturnedLessThan(Integer value) {
            addCriterion("sysOrderStatusReturned <", value, "sysorderstatusreturned");
            return (Criteria) this;
        }

        public Criteria andSysorderstatusreturnedLessThanOrEqualTo(Integer value) {
            addCriterion("sysOrderStatusReturned <=", value, "sysorderstatusreturned");
            return (Criteria) this;
        }

        public Criteria andSysorderstatusreturnedIn(List<Integer> values) {
            addCriterion("sysOrderStatusReturned in", values, "sysorderstatusreturned");
            return (Criteria) this;
        }

        public Criteria andSysorderstatusreturnedNotIn(List<Integer> values) {
            addCriterion("sysOrderStatusReturned not in", values, "sysorderstatusreturned");
            return (Criteria) this;
        }

        public Criteria andSysorderstatusreturnedBetween(Integer value1, Integer value2) {
            addCriterion("sysOrderStatusReturned between", value1, value2, "sysorderstatusreturned");
            return (Criteria) this;
        }

        public Criteria andSysorderstatusreturnedNotBetween(Integer value1, Integer value2) {
            addCriterion("sysOrderStatusReturned not between", value1, value2, "sysorderstatusreturned");
            return (Criteria) this;
        }

        public Criteria andSysorderstatuscancelledIsNull() {
            addCriterion("sysOrderStatusCancelled is null");
            return (Criteria) this;
        }

        public Criteria andSysorderstatuscancelledIsNotNull() {
            addCriterion("sysOrderStatusCancelled is not null");
            return (Criteria) this;
        }

        public Criteria andSysorderstatuscancelledEqualTo(Integer value) {
            addCriterion("sysOrderStatusCancelled =", value, "sysorderstatuscancelled");
            return (Criteria) this;
        }

        public Criteria andSysorderstatuscancelledNotEqualTo(Integer value) {
            addCriterion("sysOrderStatusCancelled <>", value, "sysorderstatuscancelled");
            return (Criteria) this;
        }

        public Criteria andSysorderstatuscancelledGreaterThan(Integer value) {
            addCriterion("sysOrderStatusCancelled >", value, "sysorderstatuscancelled");
            return (Criteria) this;
        }

        public Criteria andSysorderstatuscancelledGreaterThanOrEqualTo(Integer value) {
            addCriterion("sysOrderStatusCancelled >=", value, "sysorderstatuscancelled");
            return (Criteria) this;
        }

        public Criteria andSysorderstatuscancelledLessThan(Integer value) {
            addCriterion("sysOrderStatusCancelled <", value, "sysorderstatuscancelled");
            return (Criteria) this;
        }

        public Criteria andSysorderstatuscancelledLessThanOrEqualTo(Integer value) {
            addCriterion("sysOrderStatusCancelled <=", value, "sysorderstatuscancelled");
            return (Criteria) this;
        }

        public Criteria andSysorderstatuscancelledIn(List<Integer> values) {
            addCriterion("sysOrderStatusCancelled in", values, "sysorderstatuscancelled");
            return (Criteria) this;
        }

        public Criteria andSysorderstatuscancelledNotIn(List<Integer> values) {
            addCriterion("sysOrderStatusCancelled not in", values, "sysorderstatuscancelled");
            return (Criteria) this;
        }

        public Criteria andSysorderstatuscancelledBetween(Integer value1, Integer value2) {
            addCriterion("sysOrderStatusCancelled between", value1, value2, "sysorderstatuscancelled");
            return (Criteria) this;
        }

        public Criteria andSysorderstatuscancelledNotBetween(Integer value1, Integer value2) {
            addCriterion("sysOrderStatusCancelled not between", value1, value2, "sysorderstatuscancelled");
            return (Criteria) this;
        }

        public Criteria andHandletypeIsNull() {
            addCriterion("handleType is null");
            return (Criteria) this;
        }

        public Criteria andHandletypeIsNotNull() {
            addCriterion("handleType is not null");
            return (Criteria) this;
        }

        public Criteria andHandletypeEqualTo(Integer value) {
            addCriterion("handleType =", value, "handletype");
            return (Criteria) this;
        }

        public Criteria andHandletypeNotEqualTo(Integer value) {
            addCriterion("handleType <>", value, "handletype");
            return (Criteria) this;
        }

        public Criteria andHandletypeGreaterThan(Integer value) {
            addCriterion("handleType >", value, "handletype");
            return (Criteria) this;
        }

        public Criteria andHandletypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("handleType >=", value, "handletype");
            return (Criteria) this;
        }

        public Criteria andHandletypeLessThan(Integer value) {
            addCriterion("handleType <", value, "handletype");
            return (Criteria) this;
        }

        public Criteria andHandletypeLessThanOrEqualTo(Integer value) {
            addCriterion("handleType <=", value, "handletype");
            return (Criteria) this;
        }

        public Criteria andHandletypeIn(List<Integer> values) {
            addCriterion("handleType in", values, "handletype");
            return (Criteria) this;
        }

        public Criteria andHandletypeNotIn(List<Integer> values) {
            addCriterion("handleType not in", values, "handletype");
            return (Criteria) this;
        }

        public Criteria andHandletypeBetween(Integer value1, Integer value2) {
            addCriterion("handleType between", value1, value2, "handletype");
            return (Criteria) this;
        }

        public Criteria andHandletypeNotBetween(Integer value1, Integer value2) {
            addCriterion("handleType not between", value1, value2, "handletype");
            return (Criteria) this;
        }

        public Criteria andIscircledIsNull() {
            addCriterion("isCircled is null");
            return (Criteria) this;
        }

        public Criteria andIscircledIsNotNull() {
            addCriterion("isCircled is not null");
            return (Criteria) this;
        }

        public Criteria andIscircledEqualTo(Integer value) {
            addCriterion("isCircled =", value, "iscircled");
            return (Criteria) this;
        }

        public Criteria andIscircledNotEqualTo(Integer value) {
            addCriterion("isCircled <>", value, "iscircled");
            return (Criteria) this;
        }

        public Criteria andIscircledGreaterThan(Integer value) {
            addCriterion("isCircled >", value, "iscircled");
            return (Criteria) this;
        }

        public Criteria andIscircledGreaterThanOrEqualTo(Integer value) {
            addCriterion("isCircled >=", value, "iscircled");
            return (Criteria) this;
        }

        public Criteria andIscircledLessThan(Integer value) {
            addCriterion("isCircled <", value, "iscircled");
            return (Criteria) this;
        }

        public Criteria andIscircledLessThanOrEqualTo(Integer value) {
            addCriterion("isCircled <=", value, "iscircled");
            return (Criteria) this;
        }

        public Criteria andIscircledIn(List<Integer> values) {
            addCriterion("isCircled in", values, "iscircled");
            return (Criteria) this;
        }

        public Criteria andIscircledNotIn(List<Integer> values) {
            addCriterion("isCircled not in", values, "iscircled");
            return (Criteria) this;
        }

        public Criteria andIscircledBetween(Integer value1, Integer value2) {
            addCriterion("isCircled between", value1, value2, "iscircled");
            return (Criteria) this;
        }

        public Criteria andIscircledNotBetween(Integer value1, Integer value2) {
            addCriterion("isCircled not between", value1, value2, "iscircled");
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