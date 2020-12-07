package com.heeexy.example.model;

import java.util.ArrayList;
import java.util.List;

public class DatacaciquesSubOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DatacaciquesSubOrderExample() {
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

        public Criteria andSysorderidIsNull() {
            addCriterion("sysOrderID is null");
            return (Criteria) this;
        }

        public Criteria andSysorderidIsNotNull() {
            addCriterion("sysOrderID is not null");
            return (Criteria) this;
        }

        public Criteria andSysorderidEqualTo(Long value) {
            addCriterion("sysOrderID =", value, "sysorderid");
            return (Criteria) this;
        }

        public Criteria andSysorderidNotEqualTo(Long value) {
            addCriterion("sysOrderID <>", value, "sysorderid");
            return (Criteria) this;
        }

        public Criteria andSysorderidGreaterThan(Long value) {
            addCriterion("sysOrderID >", value, "sysorderid");
            return (Criteria) this;
        }

        public Criteria andSysorderidGreaterThanOrEqualTo(Long value) {
            addCriterion("sysOrderID >=", value, "sysorderid");
            return (Criteria) this;
        }

        public Criteria andSysorderidLessThan(Long value) {
            addCriterion("sysOrderID <", value, "sysorderid");
            return (Criteria) this;
        }

        public Criteria andSysorderidLessThanOrEqualTo(Long value) {
            addCriterion("sysOrderID <=", value, "sysorderid");
            return (Criteria) this;
        }

        public Criteria andSysorderidIn(List<Long> values) {
            addCriterion("sysOrderID in", values, "sysorderid");
            return (Criteria) this;
        }

        public Criteria andSysorderidNotIn(List<Long> values) {
            addCriterion("sysOrderID not in", values, "sysorderid");
            return (Criteria) this;
        }

        public Criteria andSysorderidBetween(Long value1, Long value2) {
            addCriterion("sysOrderID between", value1, value2, "sysorderid");
            return (Criteria) this;
        }

        public Criteria andSysorderidNotBetween(Long value1, Long value2) {
            addCriterion("sysOrderID not between", value1, value2, "sysorderid");
            return (Criteria) this;
        }

        public Criteria andPftransactionidIsNull() {
            addCriterion("pfTransactionID is null");
            return (Criteria) this;
        }

        public Criteria andPftransactionidIsNotNull() {
            addCriterion("pfTransactionID is not null");
            return (Criteria) this;
        }

        public Criteria andPftransactionidEqualTo(String value) {
            addCriterion("pfTransactionID =", value, "pftransactionid");
            return (Criteria) this;
        }

        public Criteria andPftransactionidNotEqualTo(String value) {
            addCriterion("pfTransactionID <>", value, "pftransactionid");
            return (Criteria) this;
        }

        public Criteria andPftransactionidGreaterThan(String value) {
            addCriterion("pfTransactionID >", value, "pftransactionid");
            return (Criteria) this;
        }

        public Criteria andPftransactionidGreaterThanOrEqualTo(String value) {
            addCriterion("pfTransactionID >=", value, "pftransactionid");
            return (Criteria) this;
        }

        public Criteria andPftransactionidLessThan(String value) {
            addCriterion("pfTransactionID <", value, "pftransactionid");
            return (Criteria) this;
        }

        public Criteria andPftransactionidLessThanOrEqualTo(String value) {
            addCriterion("pfTransactionID <=", value, "pftransactionid");
            return (Criteria) this;
        }

        public Criteria andPftransactionidLike(String value) {
            addCriterion("pfTransactionID like", value, "pftransactionid");
            return (Criteria) this;
        }

        public Criteria andPftransactionidNotLike(String value) {
            addCriterion("pfTransactionID not like", value, "pftransactionid");
            return (Criteria) this;
        }

        public Criteria andPftransactionidIn(List<String> values) {
            addCriterion("pfTransactionID in", values, "pftransactionid");
            return (Criteria) this;
        }

        public Criteria andPftransactionidNotIn(List<String> values) {
            addCriterion("pfTransactionID not in", values, "pftransactionid");
            return (Criteria) this;
        }

        public Criteria andPftransactionidBetween(String value1, String value2) {
            addCriterion("pfTransactionID between", value1, value2, "pftransactionid");
            return (Criteria) this;
        }

        public Criteria andPftransactionidNotBetween(String value1, String value2) {
            addCriterion("pfTransactionID not between", value1, value2, "pftransactionid");
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

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andPfitemidIsNull() {
            addCriterion("pfItemID is null");
            return (Criteria) this;
        }

        public Criteria andPfitemidIsNotNull() {
            addCriterion("pfItemID is not null");
            return (Criteria) this;
        }

        public Criteria andPfitemidEqualTo(String value) {
            addCriterion("pfItemID =", value, "pfitemid");
            return (Criteria) this;
        }

        public Criteria andPfitemidNotEqualTo(String value) {
            addCriterion("pfItemID <>", value, "pfitemid");
            return (Criteria) this;
        }

        public Criteria andPfitemidGreaterThan(String value) {
            addCriterion("pfItemID >", value, "pfitemid");
            return (Criteria) this;
        }

        public Criteria andPfitemidGreaterThanOrEqualTo(String value) {
            addCriterion("pfItemID >=", value, "pfitemid");
            return (Criteria) this;
        }

        public Criteria andPfitemidLessThan(String value) {
            addCriterion("pfItemID <", value, "pfitemid");
            return (Criteria) this;
        }

        public Criteria andPfitemidLessThanOrEqualTo(String value) {
            addCriterion("pfItemID <=", value, "pfitemid");
            return (Criteria) this;
        }

        public Criteria andPfitemidLike(String value) {
            addCriterion("pfItemID like", value, "pfitemid");
            return (Criteria) this;
        }

        public Criteria andPfitemidNotLike(String value) {
            addCriterion("pfItemID not like", value, "pfitemid");
            return (Criteria) this;
        }

        public Criteria andPfitemidIn(List<String> values) {
            addCriterion("pfItemID in", values, "pfitemid");
            return (Criteria) this;
        }

        public Criteria andPfitemidNotIn(List<String> values) {
            addCriterion("pfItemID not in", values, "pfitemid");
            return (Criteria) this;
        }

        public Criteria andPfitemidBetween(String value1, String value2) {
            addCriterion("pfItemID between", value1, value2, "pfitemid");
            return (Criteria) this;
        }

        public Criteria andPfitemidNotBetween(String value1, String value2) {
            addCriterion("pfItemID not between", value1, value2, "pfitemid");
            return (Criteria) this;
        }

        public Criteria andSysskuIsNull() {
            addCriterion("sysSku is null");
            return (Criteria) this;
        }

        public Criteria andSysskuIsNotNull() {
            addCriterion("sysSku is not null");
            return (Criteria) this;
        }

        public Criteria andSysskuEqualTo(String value) {
            addCriterion("sysSku =", value, "syssku");
            return (Criteria) this;
        }

        public Criteria andSysskuNotEqualTo(String value) {
            addCriterion("sysSku <>", value, "syssku");
            return (Criteria) this;
        }

        public Criteria andSysskuGreaterThan(String value) {
            addCriterion("sysSku >", value, "syssku");
            return (Criteria) this;
        }

        public Criteria andSysskuGreaterThanOrEqualTo(String value) {
            addCriterion("sysSku >=", value, "syssku");
            return (Criteria) this;
        }

        public Criteria andSysskuLessThan(String value) {
            addCriterion("sysSku <", value, "syssku");
            return (Criteria) this;
        }

        public Criteria andSysskuLessThanOrEqualTo(String value) {
            addCriterion("sysSku <=", value, "syssku");
            return (Criteria) this;
        }

        public Criteria andSysskuLike(String value) {
            addCriterion("sysSku like", value, "syssku");
            return (Criteria) this;
        }

        public Criteria andSysskuNotLike(String value) {
            addCriterion("sysSku not like", value, "syssku");
            return (Criteria) this;
        }

        public Criteria andSysskuIn(List<String> values) {
            addCriterion("sysSku in", values, "syssku");
            return (Criteria) this;
        }

        public Criteria andSysskuNotIn(List<String> values) {
            addCriterion("sysSku not in", values, "syssku");
            return (Criteria) this;
        }

        public Criteria andSysskuBetween(String value1, String value2) {
            addCriterion("sysSku between", value1, value2, "syssku");
            return (Criteria) this;
        }

        public Criteria andSysskuNotBetween(String value1, String value2) {
            addCriterion("sysSku not between", value1, value2, "syssku");
            return (Criteria) this;
        }

        public Criteria andPfskuIsNull() {
            addCriterion("pfSku is null");
            return (Criteria) this;
        }

        public Criteria andPfskuIsNotNull() {
            addCriterion("pfSku is not null");
            return (Criteria) this;
        }

        public Criteria andPfskuEqualTo(String value) {
            addCriterion("pfSku =", value, "pfsku");
            return (Criteria) this;
        }

        public Criteria andPfskuNotEqualTo(String value) {
            addCriterion("pfSku <>", value, "pfsku");
            return (Criteria) this;
        }

        public Criteria andPfskuGreaterThan(String value) {
            addCriterion("pfSku >", value, "pfsku");
            return (Criteria) this;
        }

        public Criteria andPfskuGreaterThanOrEqualTo(String value) {
            addCriterion("pfSku >=", value, "pfsku");
            return (Criteria) this;
        }

        public Criteria andPfskuLessThan(String value) {
            addCriterion("pfSku <", value, "pfsku");
            return (Criteria) this;
        }

        public Criteria andPfskuLessThanOrEqualTo(String value) {
            addCriterion("pfSku <=", value, "pfsku");
            return (Criteria) this;
        }

        public Criteria andPfskuLike(String value) {
            addCriterion("pfSku like", value, "pfsku");
            return (Criteria) this;
        }

        public Criteria andPfskuNotLike(String value) {
            addCriterion("pfSku not like", value, "pfsku");
            return (Criteria) this;
        }

        public Criteria andPfskuIn(List<String> values) {
            addCriterion("pfSku in", values, "pfsku");
            return (Criteria) this;
        }

        public Criteria andPfskuNotIn(List<String> values) {
            addCriterion("pfSku not in", values, "pfsku");
            return (Criteria) this;
        }

        public Criteria andPfskuBetween(String value1, String value2) {
            addCriterion("pfSku between", value1, value2, "pfsku");
            return (Criteria) this;
        }

        public Criteria andPfskuNotBetween(String value1, String value2) {
            addCriterion("pfSku not between", value1, value2, "pfsku");
            return (Criteria) this;
        }

        public Criteria andPfitempriceIsNull() {
            addCriterion("pfItemPrice is null");
            return (Criteria) this;
        }

        public Criteria andPfitempriceIsNotNull() {
            addCriterion("pfItemPrice is not null");
            return (Criteria) this;
        }

        public Criteria andPfitempriceEqualTo(Double value) {
            addCriterion("pfItemPrice =", value, "pfitemprice");
            return (Criteria) this;
        }

        public Criteria andPfitempriceNotEqualTo(Double value) {
            addCriterion("pfItemPrice <>", value, "pfitemprice");
            return (Criteria) this;
        }

        public Criteria andPfitempriceGreaterThan(Double value) {
            addCriterion("pfItemPrice >", value, "pfitemprice");
            return (Criteria) this;
        }

        public Criteria andPfitempriceGreaterThanOrEqualTo(Double value) {
            addCriterion("pfItemPrice >=", value, "pfitemprice");
            return (Criteria) this;
        }

        public Criteria andPfitempriceLessThan(Double value) {
            addCriterion("pfItemPrice <", value, "pfitemprice");
            return (Criteria) this;
        }

        public Criteria andPfitempriceLessThanOrEqualTo(Double value) {
            addCriterion("pfItemPrice <=", value, "pfitemprice");
            return (Criteria) this;
        }

        public Criteria andPfitempriceIn(List<Double> values) {
            addCriterion("pfItemPrice in", values, "pfitemprice");
            return (Criteria) this;
        }

        public Criteria andPfitempriceNotIn(List<Double> values) {
            addCriterion("pfItemPrice not in", values, "pfitemprice");
            return (Criteria) this;
        }

        public Criteria andPfitempriceBetween(Double value1, Double value2) {
            addCriterion("pfItemPrice between", value1, value2, "pfitemprice");
            return (Criteria) this;
        }

        public Criteria andPfitempriceNotBetween(Double value1, Double value2) {
            addCriterion("pfItemPrice not between", value1, value2, "pfitemprice");
            return (Criteria) this;
        }

        public Criteria andPfquantityIsNull() {
            addCriterion("pfQuantity is null");
            return (Criteria) this;
        }

        public Criteria andPfquantityIsNotNull() {
            addCriterion("pfQuantity is not null");
            return (Criteria) this;
        }

        public Criteria andPfquantityEqualTo(String value) {
            addCriterion("pfQuantity =", value, "pfquantity");
            return (Criteria) this;
        }

        public Criteria andPfquantityNotEqualTo(String value) {
            addCriterion("pfQuantity <>", value, "pfquantity");
            return (Criteria) this;
        }

        public Criteria andPfquantityGreaterThan(String value) {
            addCriterion("pfQuantity >", value, "pfquantity");
            return (Criteria) this;
        }

        public Criteria andPfquantityGreaterThanOrEqualTo(String value) {
            addCriterion("pfQuantity >=", value, "pfquantity");
            return (Criteria) this;
        }

        public Criteria andPfquantityLessThan(String value) {
            addCriterion("pfQuantity <", value, "pfquantity");
            return (Criteria) this;
        }

        public Criteria andPfquantityLessThanOrEqualTo(String value) {
            addCriterion("pfQuantity <=", value, "pfquantity");
            return (Criteria) this;
        }

        public Criteria andPfquantityLike(String value) {
            addCriterion("pfQuantity like", value, "pfquantity");
            return (Criteria) this;
        }

        public Criteria andPfquantityNotLike(String value) {
            addCriterion("pfQuantity not like", value, "pfquantity");
            return (Criteria) this;
        }

        public Criteria andPfquantityIn(List<String> values) {
            addCriterion("pfQuantity in", values, "pfquantity");
            return (Criteria) this;
        }

        public Criteria andPfquantityNotIn(List<String> values) {
            addCriterion("pfQuantity not in", values, "pfquantity");
            return (Criteria) this;
        }

        public Criteria andPfquantityBetween(String value1, String value2) {
            addCriterion("pfQuantity between", value1, value2, "pfquantity");
            return (Criteria) this;
        }

        public Criteria andPfquantityNotBetween(String value1, String value2) {
            addCriterion("pfQuantity not between", value1, value2, "pfquantity");
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

        public Criteria andCoverurlIsNull() {
            addCriterion("coverUrl is null");
            return (Criteria) this;
        }

        public Criteria andCoverurlIsNotNull() {
            addCriterion("coverUrl is not null");
            return (Criteria) this;
        }

        public Criteria andCoverurlEqualTo(String value) {
            addCriterion("coverUrl =", value, "coverurl");
            return (Criteria) this;
        }

        public Criteria andCoverurlNotEqualTo(String value) {
            addCriterion("coverUrl <>", value, "coverurl");
            return (Criteria) this;
        }

        public Criteria andCoverurlGreaterThan(String value) {
            addCriterion("coverUrl >", value, "coverurl");
            return (Criteria) this;
        }

        public Criteria andCoverurlGreaterThanOrEqualTo(String value) {
            addCriterion("coverUrl >=", value, "coverurl");
            return (Criteria) this;
        }

        public Criteria andCoverurlLessThan(String value) {
            addCriterion("coverUrl <", value, "coverurl");
            return (Criteria) this;
        }

        public Criteria andCoverurlLessThanOrEqualTo(String value) {
            addCriterion("coverUrl <=", value, "coverurl");
            return (Criteria) this;
        }

        public Criteria andCoverurlLike(String value) {
            addCriterion("coverUrl like", value, "coverurl");
            return (Criteria) this;
        }

        public Criteria andCoverurlNotLike(String value) {
            addCriterion("coverUrl not like", value, "coverurl");
            return (Criteria) this;
        }

        public Criteria andCoverurlIn(List<String> values) {
            addCriterion("coverUrl in", values, "coverurl");
            return (Criteria) this;
        }

        public Criteria andCoverurlNotIn(List<String> values) {
            addCriterion("coverUrl not in", values, "coverurl");
            return (Criteria) this;
        }

        public Criteria andCoverurlBetween(String value1, String value2) {
            addCriterion("coverUrl between", value1, value2, "coverurl");
            return (Criteria) this;
        }

        public Criteria andCoverurlNotBetween(String value1, String value2) {
            addCriterion("coverUrl not between", value1, value2, "coverurl");
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