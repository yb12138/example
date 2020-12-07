package com.heeexy.example.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Sheet1Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Sheet1Example() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andCreatedateIsNull() {
            addCriterion("createDate is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("createDate is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Date value) {
            addCriterionForJDBCDate("createDate =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("createDate <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Date value) {
            addCriterionForJDBCDate("createDate >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("createDate >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Date value) {
            addCriterionForJDBCDate("createDate <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("createDate <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Date> values) {
            addCriterionForJDBCDate("createDate in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("createDate not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("createDate between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("createDate not between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andPurchasenumIsNull() {
            addCriterion("purchaseNum is null");
            return (Criteria) this;
        }

        public Criteria andPurchasenumIsNotNull() {
            addCriterion("purchaseNum is not null");
            return (Criteria) this;
        }

        public Criteria andPurchasenumEqualTo(String value) {
            addCriterion("purchaseNum =", value, "purchasenum");
            return (Criteria) this;
        }

        public Criteria andPurchasenumNotEqualTo(String value) {
            addCriterion("purchaseNum <>", value, "purchasenum");
            return (Criteria) this;
        }

        public Criteria andPurchasenumGreaterThan(String value) {
            addCriterion("purchaseNum >", value, "purchasenum");
            return (Criteria) this;
        }

        public Criteria andPurchasenumGreaterThanOrEqualTo(String value) {
            addCriterion("purchaseNum >=", value, "purchasenum");
            return (Criteria) this;
        }

        public Criteria andPurchasenumLessThan(String value) {
            addCriterion("purchaseNum <", value, "purchasenum");
            return (Criteria) this;
        }

        public Criteria andPurchasenumLessThanOrEqualTo(String value) {
            addCriterion("purchaseNum <=", value, "purchasenum");
            return (Criteria) this;
        }

        public Criteria andPurchasenumLike(String value) {
            addCriterion("purchaseNum like", value, "purchasenum");
            return (Criteria) this;
        }

        public Criteria andPurchasenumNotLike(String value) {
            addCriterion("purchaseNum not like", value, "purchasenum");
            return (Criteria) this;
        }

        public Criteria andPurchasenumIn(List<String> values) {
            addCriterion("purchaseNum in", values, "purchasenum");
            return (Criteria) this;
        }

        public Criteria andPurchasenumNotIn(List<String> values) {
            addCriterion("purchaseNum not in", values, "purchasenum");
            return (Criteria) this;
        }

        public Criteria andPurchasenumBetween(String value1, String value2) {
            addCriterion("purchaseNum between", value1, value2, "purchasenum");
            return (Criteria) this;
        }

        public Criteria andPurchasenumNotBetween(String value1, String value2) {
            addCriterion("purchaseNum not between", value1, value2, "purchasenum");
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

        public Criteria andSuppliernameIsNull() {
            addCriterion("supplierName is null");
            return (Criteria) this;
        }

        public Criteria andSuppliernameIsNotNull() {
            addCriterion("supplierName is not null");
            return (Criteria) this;
        }

        public Criteria andSuppliernameEqualTo(String value) {
            addCriterion("supplierName =", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameNotEqualTo(String value) {
            addCriterion("supplierName <>", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameGreaterThan(String value) {
            addCriterion("supplierName >", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameGreaterThanOrEqualTo(String value) {
            addCriterion("supplierName >=", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameLessThan(String value) {
            addCriterion("supplierName <", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameLessThanOrEqualTo(String value) {
            addCriterion("supplierName <=", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameLike(String value) {
            addCriterion("supplierName like", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameNotLike(String value) {
            addCriterion("supplierName not like", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameIn(List<String> values) {
            addCriterion("supplierName in", values, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameNotIn(List<String> values) {
            addCriterion("supplierName not in", values, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameBetween(String value1, String value2) {
            addCriterion("supplierName between", value1, value2, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameNotBetween(String value1, String value2) {
            addCriterion("supplierName not between", value1, value2, "suppliername");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNull() {
            addCriterion("quantity is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNotNull() {
            addCriterion("quantity is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityEqualTo(Integer value) {
            addCriterion("quantity =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(Integer value) {
            addCriterion("quantity <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(Integer value) {
            addCriterion("quantity >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("quantity >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(Integer value) {
            addCriterion("quantity <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("quantity <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<Integer> values) {
            addCriterion("quantity in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<Integer> values) {
            addCriterion("quantity not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(Integer value1, Integer value2) {
            addCriterion("quantity between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("quantity not between", value1, value2, "quantity");
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

        public Criteria andUnitpriceEqualTo(Double value) {
            addCriterion("unitprice =", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceNotEqualTo(Double value) {
            addCriterion("unitprice <>", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceGreaterThan(Double value) {
            addCriterion("unitprice >", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("unitprice >=", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceLessThan(Double value) {
            addCriterion("unitprice <", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceLessThanOrEqualTo(Double value) {
            addCriterion("unitprice <=", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceIn(List<Double> values) {
            addCriterion("unitprice in", values, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceNotIn(List<Double> values) {
            addCriterion("unitprice not in", values, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceBetween(Double value1, Double value2) {
            addCriterion("unitprice between", value1, value2, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceNotBetween(Double value1, Double value2) {
            addCriterion("unitprice not between", value1, value2, "unitprice");
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

        public Criteria andPurchaseamountIsNull() {
            addCriterion("purchaseamount is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountIsNotNull() {
            addCriterion("purchaseamount is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountEqualTo(String value) {
            addCriterion("purchaseamount =", value, "purchaseamount");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountNotEqualTo(String value) {
            addCriterion("purchaseamount <>", value, "purchaseamount");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountGreaterThan(String value) {
            addCriterion("purchaseamount >", value, "purchaseamount");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountGreaterThanOrEqualTo(String value) {
            addCriterion("purchaseamount >=", value, "purchaseamount");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountLessThan(String value) {
            addCriterion("purchaseamount <", value, "purchaseamount");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountLessThanOrEqualTo(String value) {
            addCriterion("purchaseamount <=", value, "purchaseamount");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountLike(String value) {
            addCriterion("purchaseamount like", value, "purchaseamount");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountNotLike(String value) {
            addCriterion("purchaseamount not like", value, "purchaseamount");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountIn(List<String> values) {
            addCriterion("purchaseamount in", values, "purchaseamount");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountNotIn(List<String> values) {
            addCriterion("purchaseamount not in", values, "purchaseamount");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountBetween(String value1, String value2) {
            addCriterion("purchaseamount between", value1, value2, "purchaseamount");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountNotBetween(String value1, String value2) {
            addCriterion("purchaseamount not between", value1, value2, "purchaseamount");
            return (Criteria) this;
        }

        public Criteria andSuppliernumIsNull() {
            addCriterion("supplierNum is null");
            return (Criteria) this;
        }

        public Criteria andSuppliernumIsNotNull() {
            addCriterion("supplierNum is not null");
            return (Criteria) this;
        }

        public Criteria andSuppliernumEqualTo(String value) {
            addCriterion("supplierNum =", value, "suppliernum");
            return (Criteria) this;
        }

        public Criteria andSuppliernumNotEqualTo(String value) {
            addCriterion("supplierNum <>", value, "suppliernum");
            return (Criteria) this;
        }

        public Criteria andSuppliernumGreaterThan(String value) {
            addCriterion("supplierNum >", value, "suppliernum");
            return (Criteria) this;
        }

        public Criteria andSuppliernumGreaterThanOrEqualTo(String value) {
            addCriterion("supplierNum >=", value, "suppliernum");
            return (Criteria) this;
        }

        public Criteria andSuppliernumLessThan(String value) {
            addCriterion("supplierNum <", value, "suppliernum");
            return (Criteria) this;
        }

        public Criteria andSuppliernumLessThanOrEqualTo(String value) {
            addCriterion("supplierNum <=", value, "suppliernum");
            return (Criteria) this;
        }

        public Criteria andSuppliernumLike(String value) {
            addCriterion("supplierNum like", value, "suppliernum");
            return (Criteria) this;
        }

        public Criteria andSuppliernumNotLike(String value) {
            addCriterion("supplierNum not like", value, "suppliernum");
            return (Criteria) this;
        }

        public Criteria andSuppliernumIn(List<String> values) {
            addCriterion("supplierNum in", values, "suppliernum");
            return (Criteria) this;
        }

        public Criteria andSuppliernumNotIn(List<String> values) {
            addCriterion("supplierNum not in", values, "suppliernum");
            return (Criteria) this;
        }

        public Criteria andSuppliernumBetween(String value1, String value2) {
            addCriterion("supplierNum between", value1, value2, "suppliernum");
            return (Criteria) this;
        }

        public Criteria andSuppliernumNotBetween(String value1, String value2) {
            addCriterion("supplierNum not between", value1, value2, "suppliernum");
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