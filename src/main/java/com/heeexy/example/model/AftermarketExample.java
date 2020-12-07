package com.heeexy.example.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AftermarketExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AftermarketExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSkuIsNull() {
            addCriterion("sku is null");
            return (Criteria) this;
        }

        public Criteria andSkuIsNotNull() {
            addCriterion("sku is not null");
            return (Criteria) this;
        }

        public Criteria andSkuEqualTo(String value) {
            addCriterion("sku =", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuNotEqualTo(String value) {
            addCriterion("sku <>", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuGreaterThan(String value) {
            addCriterion("sku >", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuGreaterThanOrEqualTo(String value) {
            addCriterion("sku >=", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuLessThan(String value) {
            addCriterion("sku <", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuLessThanOrEqualTo(String value) {
            addCriterion("sku <=", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuLike(String value) {
            addCriterion("sku like", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuNotLike(String value) {
            addCriterion("sku not like", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuIn(List<String> values) {
            addCriterion("sku in", values, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuNotIn(List<String> values) {
            addCriterion("sku not in", values, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuBetween(String value1, String value2) {
            addCriterion("sku between", value1, value2, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuNotBetween(String value1, String value2) {
            addCriterion("sku not between", value1, value2, "sku");
            return (Criteria) this;
        }

        public Criteria andCnnameIsNull() {
            addCriterion("cnName is null");
            return (Criteria) this;
        }

        public Criteria andCnnameIsNotNull() {
            addCriterion("cnName is not null");
            return (Criteria) this;
        }

        public Criteria andCnnameEqualTo(String value) {
            addCriterion("cnName =", value, "cnname");
            return (Criteria) this;
        }

        public Criteria andCnnameNotEqualTo(String value) {
            addCriterion("cnName <>", value, "cnname");
            return (Criteria) this;
        }

        public Criteria andCnnameGreaterThan(String value) {
            addCriterion("cnName >", value, "cnname");
            return (Criteria) this;
        }

        public Criteria andCnnameGreaterThanOrEqualTo(String value) {
            addCriterion("cnName >=", value, "cnname");
            return (Criteria) this;
        }

        public Criteria andCnnameLessThan(String value) {
            addCriterion("cnName <", value, "cnname");
            return (Criteria) this;
        }

        public Criteria andCnnameLessThanOrEqualTo(String value) {
            addCriterion("cnName <=", value, "cnname");
            return (Criteria) this;
        }

        public Criteria andCnnameLike(String value) {
            addCriterion("cnName like", value, "cnname");
            return (Criteria) this;
        }

        public Criteria andCnnameNotLike(String value) {
            addCriterion("cnName not like", value, "cnname");
            return (Criteria) this;
        }

        public Criteria andCnnameIn(List<String> values) {
            addCriterion("cnName in", values, "cnname");
            return (Criteria) this;
        }

        public Criteria andCnnameNotIn(List<String> values) {
            addCriterion("cnName not in", values, "cnname");
            return (Criteria) this;
        }

        public Criteria andCnnameBetween(String value1, String value2) {
            addCriterion("cnName between", value1, value2, "cnname");
            return (Criteria) this;
        }

        public Criteria andCnnameNotBetween(String value1, String value2) {
            addCriterion("cnName not between", value1, value2, "cnname");
            return (Criteria) this;
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

        public Criteria andCustomidIsNull() {
            addCriterion("customid is null");
            return (Criteria) this;
        }

        public Criteria andCustomidIsNotNull() {
            addCriterion("customid is not null");
            return (Criteria) this;
        }

        public Criteria andCustomidEqualTo(String value) {
            addCriterion("customid =", value, "customid");
            return (Criteria) this;
        }

        public Criteria andCustomidNotEqualTo(String value) {
            addCriterion("customid <>", value, "customid");
            return (Criteria) this;
        }

        public Criteria andCustomidGreaterThan(String value) {
            addCriterion("customid >", value, "customid");
            return (Criteria) this;
        }

        public Criteria andCustomidGreaterThanOrEqualTo(String value) {
            addCriterion("customid >=", value, "customid");
            return (Criteria) this;
        }

        public Criteria andCustomidLessThan(String value) {
            addCriterion("customid <", value, "customid");
            return (Criteria) this;
        }

        public Criteria andCustomidLessThanOrEqualTo(String value) {
            addCriterion("customid <=", value, "customid");
            return (Criteria) this;
        }

        public Criteria andCustomidLike(String value) {
            addCriterion("customid like", value, "customid");
            return (Criteria) this;
        }

        public Criteria andCustomidNotLike(String value) {
            addCriterion("customid not like", value, "customid");
            return (Criteria) this;
        }

        public Criteria andCustomidIn(List<String> values) {
            addCriterion("customid in", values, "customid");
            return (Criteria) this;
        }

        public Criteria andCustomidNotIn(List<String> values) {
            addCriterion("customid not in", values, "customid");
            return (Criteria) this;
        }

        public Criteria andCustomidBetween(String value1, String value2) {
            addCriterion("customid between", value1, value2, "customid");
            return (Criteria) this;
        }

        public Criteria andCustomidNotBetween(String value1, String value2) {
            addCriterion("customid not between", value1, value2, "customid");
            return (Criteria) this;
        }

        public Criteria andReasonidIsNull() {
            addCriterion("reasonid is null");
            return (Criteria) this;
        }

        public Criteria andReasonidIsNotNull() {
            addCriterion("reasonid is not null");
            return (Criteria) this;
        }

        public Criteria andReasonidEqualTo(Integer value) {
            addCriterion("reasonid =", value, "reasonid");
            return (Criteria) this;
        }

        public Criteria andReasonidNotEqualTo(Integer value) {
            addCriterion("reasonid <>", value, "reasonid");
            return (Criteria) this;
        }

        public Criteria andReasonidGreaterThan(Integer value) {
            addCriterion("reasonid >", value, "reasonid");
            return (Criteria) this;
        }

        public Criteria andReasonidGreaterThanOrEqualTo(Integer value) {
            addCriterion("reasonid >=", value, "reasonid");
            return (Criteria) this;
        }

        public Criteria andReasonidLessThan(Integer value) {
            addCriterion("reasonid <", value, "reasonid");
            return (Criteria) this;
        }

        public Criteria andReasonidLessThanOrEqualTo(Integer value) {
            addCriterion("reasonid <=", value, "reasonid");
            return (Criteria) this;
        }

        public Criteria andReasonidIn(List<Integer> values) {
            addCriterion("reasonid in", values, "reasonid");
            return (Criteria) this;
        }

        public Criteria andReasonidNotIn(List<Integer> values) {
            addCriterion("reasonid not in", values, "reasonid");
            return (Criteria) this;
        }

        public Criteria andReasonidBetween(Integer value1, Integer value2) {
            addCriterion("reasonid between", value1, value2, "reasonid");
            return (Criteria) this;
        }

        public Criteria andReasonidNotBetween(Integer value1, Integer value2) {
            addCriterion("reasonid not between", value1, value2, "reasonid");
            return (Criteria) this;
        }

        public Criteria andReasonnameIsNull() {
            addCriterion("reasonname is null");
            return (Criteria) this;
        }

        public Criteria andReasonnameIsNotNull() {
            addCriterion("reasonname is not null");
            return (Criteria) this;
        }

        public Criteria andReasonnameEqualTo(String value) {
            addCriterion("reasonname =", value, "reasonname");
            return (Criteria) this;
        }

        public Criteria andReasonnameNotEqualTo(String value) {
            addCriterion("reasonname <>", value, "reasonname");
            return (Criteria) this;
        }

        public Criteria andReasonnameGreaterThan(String value) {
            addCriterion("reasonname >", value, "reasonname");
            return (Criteria) this;
        }

        public Criteria andReasonnameGreaterThanOrEqualTo(String value) {
            addCriterion("reasonname >=", value, "reasonname");
            return (Criteria) this;
        }

        public Criteria andReasonnameLessThan(String value) {
            addCriterion("reasonname <", value, "reasonname");
            return (Criteria) this;
        }

        public Criteria andReasonnameLessThanOrEqualTo(String value) {
            addCriterion("reasonname <=", value, "reasonname");
            return (Criteria) this;
        }

        public Criteria andReasonnameLike(String value) {
            addCriterion("reasonname like", value, "reasonname");
            return (Criteria) this;
        }

        public Criteria andReasonnameNotLike(String value) {
            addCriterion("reasonname not like", value, "reasonname");
            return (Criteria) this;
        }

        public Criteria andReasonnameIn(List<String> values) {
            addCriterion("reasonname in", values, "reasonname");
            return (Criteria) this;
        }

        public Criteria andReasonnameNotIn(List<String> values) {
            addCriterion("reasonname not in", values, "reasonname");
            return (Criteria) this;
        }

        public Criteria andReasonnameBetween(String value1, String value2) {
            addCriterion("reasonname between", value1, value2, "reasonname");
            return (Criteria) this;
        }

        public Criteria andReasonnameNotBetween(String value1, String value2) {
            addCriterion("reasonname not between", value1, value2, "reasonname");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(String value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(String value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(String value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(String value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(String value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLike(String value) {
            addCriterion("money like", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotLike(String value) {
            addCriterion("money not like", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<String> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<String> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(String value1, String value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(String value1, String value2) {
            addCriterion("money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andWay1IsNull() {
            addCriterion("way1 is null");
            return (Criteria) this;
        }

        public Criteria andWay1IsNotNull() {
            addCriterion("way1 is not null");
            return (Criteria) this;
        }

        public Criteria andWay1EqualTo(String value) {
            addCriterion("way1 =", value, "way1");
            return (Criteria) this;
        }

        public Criteria andWay1NotEqualTo(String value) {
            addCriterion("way1 <>", value, "way1");
            return (Criteria) this;
        }

        public Criteria andWay1GreaterThan(String value) {
            addCriterion("way1 >", value, "way1");
            return (Criteria) this;
        }

        public Criteria andWay1GreaterThanOrEqualTo(String value) {
            addCriterion("way1 >=", value, "way1");
            return (Criteria) this;
        }

        public Criteria andWay1LessThan(String value) {
            addCriterion("way1 <", value, "way1");
            return (Criteria) this;
        }

        public Criteria andWay1LessThanOrEqualTo(String value) {
            addCriterion("way1 <=", value, "way1");
            return (Criteria) this;
        }

        public Criteria andWay1Like(String value) {
            addCriterion("way1 like", value, "way1");
            return (Criteria) this;
        }

        public Criteria andWay1NotLike(String value) {
            addCriterion("way1 not like", value, "way1");
            return (Criteria) this;
        }

        public Criteria andWay1In(List<String> values) {
            addCriterion("way1 in", values, "way1");
            return (Criteria) this;
        }

        public Criteria andWay1NotIn(List<String> values) {
            addCriterion("way1 not in", values, "way1");
            return (Criteria) this;
        }

        public Criteria andWay1Between(String value1, String value2) {
            addCriterion("way1 between", value1, value2, "way1");
            return (Criteria) this;
        }

        public Criteria andWay1NotBetween(String value1, String value2) {
            addCriterion("way1 not between", value1, value2, "way1");
            return (Criteria) this;
        }

        public Criteria andWay2IsNull() {
            addCriterion("way2 is null");
            return (Criteria) this;
        }

        public Criteria andWay2IsNotNull() {
            addCriterion("way2 is not null");
            return (Criteria) this;
        }

        public Criteria andWay2EqualTo(String value) {
            addCriterion("way2 =", value, "way2");
            return (Criteria) this;
        }

        public Criteria andWay2NotEqualTo(String value) {
            addCriterion("way2 <>", value, "way2");
            return (Criteria) this;
        }

        public Criteria andWay2GreaterThan(String value) {
            addCriterion("way2 >", value, "way2");
            return (Criteria) this;
        }

        public Criteria andWay2GreaterThanOrEqualTo(String value) {
            addCriterion("way2 >=", value, "way2");
            return (Criteria) this;
        }

        public Criteria andWay2LessThan(String value) {
            addCriterion("way2 <", value, "way2");
            return (Criteria) this;
        }

        public Criteria andWay2LessThanOrEqualTo(String value) {
            addCriterion("way2 <=", value, "way2");
            return (Criteria) this;
        }

        public Criteria andWay2Like(String value) {
            addCriterion("way2 like", value, "way2");
            return (Criteria) this;
        }

        public Criteria andWay2NotLike(String value) {
            addCriterion("way2 not like", value, "way2");
            return (Criteria) this;
        }

        public Criteria andWay2In(List<String> values) {
            addCriterion("way2 in", values, "way2");
            return (Criteria) this;
        }

        public Criteria andWay2NotIn(List<String> values) {
            addCriterion("way2 not in", values, "way2");
            return (Criteria) this;
        }

        public Criteria andWay2Between(String value1, String value2) {
            addCriterion("way2 between", value1, value2, "way2");
            return (Criteria) this;
        }

        public Criteria andWay2NotBetween(String value1, String value2) {
            addCriterion("way2 not between", value1, value2, "way2");
            return (Criteria) this;
        }

        public Criteria andImgurlIsNull() {
            addCriterion("imgurl is null");
            return (Criteria) this;
        }

        public Criteria andImgurlIsNotNull() {
            addCriterion("imgurl is not null");
            return (Criteria) this;
        }

        public Criteria andImgurlEqualTo(String value) {
            addCriterion("imgurl =", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotEqualTo(String value) {
            addCriterion("imgurl <>", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlGreaterThan(String value) {
            addCriterion("imgurl >", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlGreaterThanOrEqualTo(String value) {
            addCriterion("imgurl >=", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlLessThan(String value) {
            addCriterion("imgurl <", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlLessThanOrEqualTo(String value) {
            addCriterion("imgurl <=", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlLike(String value) {
            addCriterion("imgurl like", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotLike(String value) {
            addCriterion("imgurl not like", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlIn(List<String> values) {
            addCriterion("imgurl in", values, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotIn(List<String> values) {
            addCriterion("imgurl not in", values, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlBetween(String value1, String value2) {
            addCriterion("imgurl between", value1, value2, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotBetween(String value1, String value2) {
            addCriterion("imgurl not between", value1, value2, "imgurl");
            return (Criteria) this;
        }

        public Criteria andAccountidIsNull() {
            addCriterion("accountid is null");
            return (Criteria) this;
        }

        public Criteria andAccountidIsNotNull() {
            addCriterion("accountid is not null");
            return (Criteria) this;
        }

        public Criteria andAccountidEqualTo(Integer value) {
            addCriterion("accountid =", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidNotEqualTo(Integer value) {
            addCriterion("accountid <>", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidGreaterThan(Integer value) {
            addCriterion("accountid >", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidGreaterThanOrEqualTo(Integer value) {
            addCriterion("accountid >=", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidLessThan(Integer value) {
            addCriterion("accountid <", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidLessThanOrEqualTo(Integer value) {
            addCriterion("accountid <=", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidIn(List<Integer> values) {
            addCriterion("accountid in", values, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidNotIn(List<Integer> values) {
            addCriterion("accountid not in", values, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidBetween(Integer value1, Integer value2) {
            addCriterion("accountid between", value1, value2, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidNotBetween(Integer value1, Integer value2) {
            addCriterion("accountid not between", value1, value2, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountnameIsNull() {
            addCriterion("accountname is null");
            return (Criteria) this;
        }

        public Criteria andAccountnameIsNotNull() {
            addCriterion("accountname is not null");
            return (Criteria) this;
        }

        public Criteria andAccountnameEqualTo(String value) {
            addCriterion("accountname =", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameNotEqualTo(String value) {
            addCriterion("accountname <>", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameGreaterThan(String value) {
            addCriterion("accountname >", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameGreaterThanOrEqualTo(String value) {
            addCriterion("accountname >=", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameLessThan(String value) {
            addCriterion("accountname <", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameLessThanOrEqualTo(String value) {
            addCriterion("accountname <=", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameLike(String value) {
            addCriterion("accountname like", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameNotLike(String value) {
            addCriterion("accountname not like", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameIn(List<String> values) {
            addCriterion("accountname in", values, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameNotIn(List<String> values) {
            addCriterion("accountname not in", values, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameBetween(String value1, String value2) {
            addCriterion("accountname between", value1, value2, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameNotBetween(String value1, String value2) {
            addCriterion("accountname not between", value1, value2, "accountname");
            return (Criteria) this;
        }

        public Criteria andPaypalidIsNull() {
            addCriterion("paypalid is null");
            return (Criteria) this;
        }

        public Criteria andPaypalidIsNotNull() {
            addCriterion("paypalid is not null");
            return (Criteria) this;
        }

        public Criteria andPaypalidEqualTo(Integer value) {
            addCriterion("paypalid =", value, "paypalid");
            return (Criteria) this;
        }

        public Criteria andPaypalidNotEqualTo(Integer value) {
            addCriterion("paypalid <>", value, "paypalid");
            return (Criteria) this;
        }

        public Criteria andPaypalidGreaterThan(Integer value) {
            addCriterion("paypalid >", value, "paypalid");
            return (Criteria) this;
        }

        public Criteria andPaypalidGreaterThanOrEqualTo(Integer value) {
            addCriterion("paypalid >=", value, "paypalid");
            return (Criteria) this;
        }

        public Criteria andPaypalidLessThan(Integer value) {
            addCriterion("paypalid <", value, "paypalid");
            return (Criteria) this;
        }

        public Criteria andPaypalidLessThanOrEqualTo(Integer value) {
            addCriterion("paypalid <=", value, "paypalid");
            return (Criteria) this;
        }

        public Criteria andPaypalidIn(List<Integer> values) {
            addCriterion("paypalid in", values, "paypalid");
            return (Criteria) this;
        }

        public Criteria andPaypalidNotIn(List<Integer> values) {
            addCriterion("paypalid not in", values, "paypalid");
            return (Criteria) this;
        }

        public Criteria andPaypalidBetween(Integer value1, Integer value2) {
            addCriterion("paypalid between", value1, value2, "paypalid");
            return (Criteria) this;
        }

        public Criteria andPaypalidNotBetween(Integer value1, Integer value2) {
            addCriterion("paypalid not between", value1, value2, "paypalid");
            return (Criteria) this;
        }

        public Criteria andPaypalinameIsNull() {
            addCriterion("paypaliname is null");
            return (Criteria) this;
        }

        public Criteria andPaypalinameIsNotNull() {
            addCriterion("paypaliname is not null");
            return (Criteria) this;
        }

        public Criteria andPaypalinameEqualTo(String value) {
            addCriterion("paypaliname =", value, "paypaliname");
            return (Criteria) this;
        }

        public Criteria andPaypalinameNotEqualTo(String value) {
            addCriterion("paypaliname <>", value, "paypaliname");
            return (Criteria) this;
        }

        public Criteria andPaypalinameGreaterThan(String value) {
            addCriterion("paypaliname >", value, "paypaliname");
            return (Criteria) this;
        }

        public Criteria andPaypalinameGreaterThanOrEqualTo(String value) {
            addCriterion("paypaliname >=", value, "paypaliname");
            return (Criteria) this;
        }

        public Criteria andPaypalinameLessThan(String value) {
            addCriterion("paypaliname <", value, "paypaliname");
            return (Criteria) this;
        }

        public Criteria andPaypalinameLessThanOrEqualTo(String value) {
            addCriterion("paypaliname <=", value, "paypaliname");
            return (Criteria) this;
        }

        public Criteria andPaypalinameLike(String value) {
            addCriterion("paypaliname like", value, "paypaliname");
            return (Criteria) this;
        }

        public Criteria andPaypalinameNotLike(String value) {
            addCriterion("paypaliname not like", value, "paypaliname");
            return (Criteria) this;
        }

        public Criteria andPaypalinameIn(List<String> values) {
            addCriterion("paypaliname in", values, "paypaliname");
            return (Criteria) this;
        }

        public Criteria andPaypalinameNotIn(List<String> values) {
            addCriterion("paypaliname not in", values, "paypaliname");
            return (Criteria) this;
        }

        public Criteria andPaypalinameBetween(String value1, String value2) {
            addCriterion("paypaliname between", value1, value2, "paypaliname");
            return (Criteria) this;
        }

        public Criteria andPaypalinameNotBetween(String value1, String value2) {
            addCriterion("paypaliname not between", value1, value2, "paypaliname");
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