package com.heeexy.example.model;

import java.util.ArrayList;
import java.util.List;

public class ProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductExample() {
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

        public Criteria andEnnameIsNull() {
            addCriterion("enName is null");
            return (Criteria) this;
        }

        public Criteria andEnnameIsNotNull() {
            addCriterion("enName is not null");
            return (Criteria) this;
        }

        public Criteria andEnnameEqualTo(String value) {
            addCriterion("enName =", value, "enname");
            return (Criteria) this;
        }

        public Criteria andEnnameNotEqualTo(String value) {
            addCriterion("enName <>", value, "enname");
            return (Criteria) this;
        }

        public Criteria andEnnameGreaterThan(String value) {
            addCriterion("enName >", value, "enname");
            return (Criteria) this;
        }

        public Criteria andEnnameGreaterThanOrEqualTo(String value) {
            addCriterion("enName >=", value, "enname");
            return (Criteria) this;
        }

        public Criteria andEnnameLessThan(String value) {
            addCriterion("enName <", value, "enname");
            return (Criteria) this;
        }

        public Criteria andEnnameLessThanOrEqualTo(String value) {
            addCriterion("enName <=", value, "enname");
            return (Criteria) this;
        }

        public Criteria andEnnameLike(String value) {
            addCriterion("enName like", value, "enname");
            return (Criteria) this;
        }

        public Criteria andEnnameNotLike(String value) {
            addCriterion("enName not like", value, "enname");
            return (Criteria) this;
        }

        public Criteria andEnnameIn(List<String> values) {
            addCriterion("enName in", values, "enname");
            return (Criteria) this;
        }

        public Criteria andEnnameNotIn(List<String> values) {
            addCriterion("enName not in", values, "enname");
            return (Criteria) this;
        }

        public Criteria andEnnameBetween(String value1, String value2) {
            addCriterion("enName between", value1, value2, "enname");
            return (Criteria) this;
        }

        public Criteria andEnnameNotBetween(String value1, String value2) {
            addCriterion("enName not between", value1, value2, "enname");
            return (Criteria) this;
        }

        public Criteria andRegisteredlengthIsNull() {
            addCriterion("registeredLength is null");
            return (Criteria) this;
        }

        public Criteria andRegisteredlengthIsNotNull() {
            addCriterion("registeredLength is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteredlengthEqualTo(Double value) {
            addCriterion("registeredLength =", value, "registeredlength");
            return (Criteria) this;
        }

        public Criteria andRegisteredlengthNotEqualTo(Double value) {
            addCriterion("registeredLength <>", value, "registeredlength");
            return (Criteria) this;
        }

        public Criteria andRegisteredlengthGreaterThan(Double value) {
            addCriterion("registeredLength >", value, "registeredlength");
            return (Criteria) this;
        }

        public Criteria andRegisteredlengthGreaterThanOrEqualTo(Double value) {
            addCriterion("registeredLength >=", value, "registeredlength");
            return (Criteria) this;
        }

        public Criteria andRegisteredlengthLessThan(Double value) {
            addCriterion("registeredLength <", value, "registeredlength");
            return (Criteria) this;
        }

        public Criteria andRegisteredlengthLessThanOrEqualTo(Double value) {
            addCriterion("registeredLength <=", value, "registeredlength");
            return (Criteria) this;
        }

        public Criteria andRegisteredlengthIn(List<Double> values) {
            addCriterion("registeredLength in", values, "registeredlength");
            return (Criteria) this;
        }

        public Criteria andRegisteredlengthNotIn(List<Double> values) {
            addCriterion("registeredLength not in", values, "registeredlength");
            return (Criteria) this;
        }

        public Criteria andRegisteredlengthBetween(Double value1, Double value2) {
            addCriterion("registeredLength between", value1, value2, "registeredlength");
            return (Criteria) this;
        }

        public Criteria andRegisteredlengthNotBetween(Double value1, Double value2) {
            addCriterion("registeredLength not between", value1, value2, "registeredlength");
            return (Criteria) this;
        }

        public Criteria andRegisteredwidthIsNull() {
            addCriterion("registeredWidth is null");
            return (Criteria) this;
        }

        public Criteria andRegisteredwidthIsNotNull() {
            addCriterion("registeredWidth is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteredwidthEqualTo(Double value) {
            addCriterion("registeredWidth =", value, "registeredwidth");
            return (Criteria) this;
        }

        public Criteria andRegisteredwidthNotEqualTo(Double value) {
            addCriterion("registeredWidth <>", value, "registeredwidth");
            return (Criteria) this;
        }

        public Criteria andRegisteredwidthGreaterThan(Double value) {
            addCriterion("registeredWidth >", value, "registeredwidth");
            return (Criteria) this;
        }

        public Criteria andRegisteredwidthGreaterThanOrEqualTo(Double value) {
            addCriterion("registeredWidth >=", value, "registeredwidth");
            return (Criteria) this;
        }

        public Criteria andRegisteredwidthLessThan(Double value) {
            addCriterion("registeredWidth <", value, "registeredwidth");
            return (Criteria) this;
        }

        public Criteria andRegisteredwidthLessThanOrEqualTo(Double value) {
            addCriterion("registeredWidth <=", value, "registeredwidth");
            return (Criteria) this;
        }

        public Criteria andRegisteredwidthIn(List<Double> values) {
            addCriterion("registeredWidth in", values, "registeredwidth");
            return (Criteria) this;
        }

        public Criteria andRegisteredwidthNotIn(List<Double> values) {
            addCriterion("registeredWidth not in", values, "registeredwidth");
            return (Criteria) this;
        }

        public Criteria andRegisteredwidthBetween(Double value1, Double value2) {
            addCriterion("registeredWidth between", value1, value2, "registeredwidth");
            return (Criteria) this;
        }

        public Criteria andRegisteredwidthNotBetween(Double value1, Double value2) {
            addCriterion("registeredWidth not between", value1, value2, "registeredwidth");
            return (Criteria) this;
        }

        public Criteria andRegisteredheightIsNull() {
            addCriterion("registeredHeight is null");
            return (Criteria) this;
        }

        public Criteria andRegisteredheightIsNotNull() {
            addCriterion("registeredHeight is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteredheightEqualTo(Double value) {
            addCriterion("registeredHeight =", value, "registeredheight");
            return (Criteria) this;
        }

        public Criteria andRegisteredheightNotEqualTo(Double value) {
            addCriterion("registeredHeight <>", value, "registeredheight");
            return (Criteria) this;
        }

        public Criteria andRegisteredheightGreaterThan(Double value) {
            addCriterion("registeredHeight >", value, "registeredheight");
            return (Criteria) this;
        }

        public Criteria andRegisteredheightGreaterThanOrEqualTo(Double value) {
            addCriterion("registeredHeight >=", value, "registeredheight");
            return (Criteria) this;
        }

        public Criteria andRegisteredheightLessThan(Double value) {
            addCriterion("registeredHeight <", value, "registeredheight");
            return (Criteria) this;
        }

        public Criteria andRegisteredheightLessThanOrEqualTo(Double value) {
            addCriterion("registeredHeight <=", value, "registeredheight");
            return (Criteria) this;
        }

        public Criteria andRegisteredheightIn(List<Double> values) {
            addCriterion("registeredHeight in", values, "registeredheight");
            return (Criteria) this;
        }

        public Criteria andRegisteredheightNotIn(List<Double> values) {
            addCriterion("registeredHeight not in", values, "registeredheight");
            return (Criteria) this;
        }

        public Criteria andRegisteredheightBetween(Double value1, Double value2) {
            addCriterion("registeredHeight between", value1, value2, "registeredheight");
            return (Criteria) this;
        }

        public Criteria andRegisteredheightNotBetween(Double value1, Double value2) {
            addCriterion("registeredHeight not between", value1, value2, "registeredheight");
            return (Criteria) this;
        }

        public Criteria andBrandedIsNull() {
            addCriterion("branded is null");
            return (Criteria) this;
        }

        public Criteria andBrandedIsNotNull() {
            addCriterion("branded is not null");
            return (Criteria) this;
        }

        public Criteria andBrandedEqualTo(String value) {
            addCriterion("branded =", value, "branded");
            return (Criteria) this;
        }

        public Criteria andBrandedNotEqualTo(String value) {
            addCriterion("branded <>", value, "branded");
            return (Criteria) this;
        }

        public Criteria andBrandedGreaterThan(String value) {
            addCriterion("branded >", value, "branded");
            return (Criteria) this;
        }

        public Criteria andBrandedGreaterThanOrEqualTo(String value) {
            addCriterion("branded >=", value, "branded");
            return (Criteria) this;
        }

        public Criteria andBrandedLessThan(String value) {
            addCriterion("branded <", value, "branded");
            return (Criteria) this;
        }

        public Criteria andBrandedLessThanOrEqualTo(String value) {
            addCriterion("branded <=", value, "branded");
            return (Criteria) this;
        }

        public Criteria andBrandedLike(String value) {
            addCriterion("branded like", value, "branded");
            return (Criteria) this;
        }

        public Criteria andBrandedNotLike(String value) {
            addCriterion("branded not like", value, "branded");
            return (Criteria) this;
        }

        public Criteria andBrandedIn(List<String> values) {
            addCriterion("branded in", values, "branded");
            return (Criteria) this;
        }

        public Criteria andBrandedNotIn(List<String> values) {
            addCriterion("branded not in", values, "branded");
            return (Criteria) this;
        }

        public Criteria andBrandedBetween(String value1, String value2) {
            addCriterion("branded between", value1, value2, "branded");
            return (Criteria) this;
        }

        public Criteria andBrandedNotBetween(String value1, String value2) {
            addCriterion("branded not between", value1, value2, "branded");
            return (Criteria) this;
        }

        public Criteria andBrandednameIsNull() {
            addCriterion("brandedName is null");
            return (Criteria) this;
        }

        public Criteria andBrandednameIsNotNull() {
            addCriterion("brandedName is not null");
            return (Criteria) this;
        }

        public Criteria andBrandednameEqualTo(String value) {
            addCriterion("brandedName =", value, "brandedname");
            return (Criteria) this;
        }

        public Criteria andBrandednameNotEqualTo(String value) {
            addCriterion("brandedName <>", value, "brandedname");
            return (Criteria) this;
        }

        public Criteria andBrandednameGreaterThan(String value) {
            addCriterion("brandedName >", value, "brandedname");
            return (Criteria) this;
        }

        public Criteria andBrandednameGreaterThanOrEqualTo(String value) {
            addCriterion("brandedName >=", value, "brandedname");
            return (Criteria) this;
        }

        public Criteria andBrandednameLessThan(String value) {
            addCriterion("brandedName <", value, "brandedname");
            return (Criteria) this;
        }

        public Criteria andBrandednameLessThanOrEqualTo(String value) {
            addCriterion("brandedName <=", value, "brandedname");
            return (Criteria) this;
        }

        public Criteria andBrandednameLike(String value) {
            addCriterion("brandedName like", value, "brandedname");
            return (Criteria) this;
        }

        public Criteria andBrandednameNotLike(String value) {
            addCriterion("brandedName not like", value, "brandedname");
            return (Criteria) this;
        }

        public Criteria andBrandednameIn(List<String> values) {
            addCriterion("brandedName in", values, "brandedname");
            return (Criteria) this;
        }

        public Criteria andBrandednameNotIn(List<String> values) {
            addCriterion("brandedName not in", values, "brandedname");
            return (Criteria) this;
        }

        public Criteria andBrandednameBetween(String value1, String value2) {
            addCriterion("brandedName between", value1, value2, "brandedname");
            return (Criteria) this;
        }

        public Criteria andBrandednameNotBetween(String value1, String value2) {
            addCriterion("brandedName not between", value1, value2, "brandedname");
            return (Criteria) this;
        }

        public Criteria andModelIsNull() {
            addCriterion("model is null");
            return (Criteria) this;
        }

        public Criteria andModelIsNotNull() {
            addCriterion("model is not null");
            return (Criteria) this;
        }

        public Criteria andModelEqualTo(String value) {
            addCriterion("model =", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotEqualTo(String value) {
            addCriterion("model <>", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThan(String value) {
            addCriterion("model >", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThanOrEqualTo(String value) {
            addCriterion("model >=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThan(String value) {
            addCriterion("model <", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThanOrEqualTo(String value) {
            addCriterion("model <=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLike(String value) {
            addCriterion("model like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotLike(String value) {
            addCriterion("model not like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelIn(List<String> values) {
            addCriterion("model in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotIn(List<String> values) {
            addCriterion("model not in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelBetween(String value1, String value2) {
            addCriterion("model between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotBetween(String value1, String value2) {
            addCriterion("model not between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andDisplaypageurlIsNull() {
            addCriterion("displayPageUrl is null");
            return (Criteria) this;
        }

        public Criteria andDisplaypageurlIsNotNull() {
            addCriterion("displayPageUrl is not null");
            return (Criteria) this;
        }

        public Criteria andDisplaypageurlEqualTo(String value) {
            addCriterion("displayPageUrl =", value, "displaypageurl");
            return (Criteria) this;
        }

        public Criteria andDisplaypageurlNotEqualTo(String value) {
            addCriterion("displayPageUrl <>", value, "displaypageurl");
            return (Criteria) this;
        }

        public Criteria andDisplaypageurlGreaterThan(String value) {
            addCriterion("displayPageUrl >", value, "displaypageurl");
            return (Criteria) this;
        }

        public Criteria andDisplaypageurlGreaterThanOrEqualTo(String value) {
            addCriterion("displayPageUrl >=", value, "displaypageurl");
            return (Criteria) this;
        }

        public Criteria andDisplaypageurlLessThan(String value) {
            addCriterion("displayPageUrl <", value, "displaypageurl");
            return (Criteria) this;
        }

        public Criteria andDisplaypageurlLessThanOrEqualTo(String value) {
            addCriterion("displayPageUrl <=", value, "displaypageurl");
            return (Criteria) this;
        }

        public Criteria andDisplaypageurlLike(String value) {
            addCriterion("displayPageUrl like", value, "displaypageurl");
            return (Criteria) this;
        }

        public Criteria andDisplaypageurlNotLike(String value) {
            addCriterion("displayPageUrl not like", value, "displaypageurl");
            return (Criteria) this;
        }

        public Criteria andDisplaypageurlIn(List<String> values) {
            addCriterion("displayPageUrl in", values, "displaypageurl");
            return (Criteria) this;
        }

        public Criteria andDisplaypageurlNotIn(List<String> values) {
            addCriterion("displayPageUrl not in", values, "displaypageurl");
            return (Criteria) this;
        }

        public Criteria andDisplaypageurlBetween(String value1, String value2) {
            addCriterion("displayPageUrl between", value1, value2, "displaypageurl");
            return (Criteria) this;
        }

        public Criteria andDisplaypageurlNotBetween(String value1, String value2) {
            addCriterion("displayPageUrl not between", value1, value2, "displaypageurl");
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

        public Criteria andInportdeclaredvalueIsNull() {
            addCriterion("inportDeclaredvalue is null");
            return (Criteria) this;
        }

        public Criteria andInportdeclaredvalueIsNotNull() {
            addCriterion("inportDeclaredvalue is not null");
            return (Criteria) this;
        }

        public Criteria andInportdeclaredvalueEqualTo(String value) {
            addCriterion("inportDeclaredvalue =", value, "inportdeclaredvalue");
            return (Criteria) this;
        }

        public Criteria andInportdeclaredvalueNotEqualTo(String value) {
            addCriterion("inportDeclaredvalue <>", value, "inportdeclaredvalue");
            return (Criteria) this;
        }

        public Criteria andInportdeclaredvalueGreaterThan(String value) {
            addCriterion("inportDeclaredvalue >", value, "inportdeclaredvalue");
            return (Criteria) this;
        }

        public Criteria andInportdeclaredvalueGreaterThanOrEqualTo(String value) {
            addCriterion("inportDeclaredvalue >=", value, "inportdeclaredvalue");
            return (Criteria) this;
        }

        public Criteria andInportdeclaredvalueLessThan(String value) {
            addCriterion("inportDeclaredvalue <", value, "inportdeclaredvalue");
            return (Criteria) this;
        }

        public Criteria andInportdeclaredvalueLessThanOrEqualTo(String value) {
            addCriterion("inportDeclaredvalue <=", value, "inportdeclaredvalue");
            return (Criteria) this;
        }

        public Criteria andInportdeclaredvalueLike(String value) {
            addCriterion("inportDeclaredvalue like", value, "inportdeclaredvalue");
            return (Criteria) this;
        }

        public Criteria andInportdeclaredvalueNotLike(String value) {
            addCriterion("inportDeclaredvalue not like", value, "inportdeclaredvalue");
            return (Criteria) this;
        }

        public Criteria andInportdeclaredvalueIn(List<String> values) {
            addCriterion("inportDeclaredvalue in", values, "inportdeclaredvalue");
            return (Criteria) this;
        }

        public Criteria andInportdeclaredvalueNotIn(List<String> values) {
            addCriterion("inportDeclaredvalue not in", values, "inportdeclaredvalue");
            return (Criteria) this;
        }

        public Criteria andInportdeclaredvalueBetween(String value1, String value2) {
            addCriterion("inportDeclaredvalue between", value1, value2, "inportdeclaredvalue");
            return (Criteria) this;
        }

        public Criteria andInportdeclaredvalueNotBetween(String value1, String value2) {
            addCriterion("inportDeclaredvalue not between", value1, value2, "inportdeclaredvalue");
            return (Criteria) this;
        }

        public Criteria andExportdeclaredvalueIsNull() {
            addCriterion("exportDeclaredvalue is null");
            return (Criteria) this;
        }

        public Criteria andExportdeclaredvalueIsNotNull() {
            addCriterion("exportDeclaredvalue is not null");
            return (Criteria) this;
        }

        public Criteria andExportdeclaredvalueEqualTo(String value) {
            addCriterion("exportDeclaredvalue =", value, "exportdeclaredvalue");
            return (Criteria) this;
        }

        public Criteria andExportdeclaredvalueNotEqualTo(String value) {
            addCriterion("exportDeclaredvalue <>", value, "exportdeclaredvalue");
            return (Criteria) this;
        }

        public Criteria andExportdeclaredvalueGreaterThan(String value) {
            addCriterion("exportDeclaredvalue >", value, "exportdeclaredvalue");
            return (Criteria) this;
        }

        public Criteria andExportdeclaredvalueGreaterThanOrEqualTo(String value) {
            addCriterion("exportDeclaredvalue >=", value, "exportdeclaredvalue");
            return (Criteria) this;
        }

        public Criteria andExportdeclaredvalueLessThan(String value) {
            addCriterion("exportDeclaredvalue <", value, "exportdeclaredvalue");
            return (Criteria) this;
        }

        public Criteria andExportdeclaredvalueLessThanOrEqualTo(String value) {
            addCriterion("exportDeclaredvalue <=", value, "exportdeclaredvalue");
            return (Criteria) this;
        }

        public Criteria andExportdeclaredvalueLike(String value) {
            addCriterion("exportDeclaredvalue like", value, "exportdeclaredvalue");
            return (Criteria) this;
        }

        public Criteria andExportdeclaredvalueNotLike(String value) {
            addCriterion("exportDeclaredvalue not like", value, "exportdeclaredvalue");
            return (Criteria) this;
        }

        public Criteria andExportdeclaredvalueIn(List<String> values) {
            addCriterion("exportDeclaredvalue in", values, "exportdeclaredvalue");
            return (Criteria) this;
        }

        public Criteria andExportdeclaredvalueNotIn(List<String> values) {
            addCriterion("exportDeclaredvalue not in", values, "exportdeclaredvalue");
            return (Criteria) this;
        }

        public Criteria andExportdeclaredvalueBetween(String value1, String value2) {
            addCriterion("exportDeclaredvalue between", value1, value2, "exportdeclaredvalue");
            return (Criteria) this;
        }

        public Criteria andExportdeclaredvalueNotBetween(String value1, String value2) {
            addCriterion("exportDeclaredvalue not between", value1, value2, "exportdeclaredvalue");
            return (Criteria) this;
        }

        public Criteria andBatteryIsNull() {
            addCriterion("battery is null");
            return (Criteria) this;
        }

        public Criteria andBatteryIsNotNull() {
            addCriterion("battery is not null");
            return (Criteria) this;
        }

        public Criteria andBatteryEqualTo(String value) {
            addCriterion("battery =", value, "battery");
            return (Criteria) this;
        }

        public Criteria andBatteryNotEqualTo(String value) {
            addCriterion("battery <>", value, "battery");
            return (Criteria) this;
        }

        public Criteria andBatteryGreaterThan(String value) {
            addCriterion("battery >", value, "battery");
            return (Criteria) this;
        }

        public Criteria andBatteryGreaterThanOrEqualTo(String value) {
            addCriterion("battery >=", value, "battery");
            return (Criteria) this;
        }

        public Criteria andBatteryLessThan(String value) {
            addCriterion("battery <", value, "battery");
            return (Criteria) this;
        }

        public Criteria andBatteryLessThanOrEqualTo(String value) {
            addCriterion("battery <=", value, "battery");
            return (Criteria) this;
        }

        public Criteria andBatteryLike(String value) {
            addCriterion("battery like", value, "battery");
            return (Criteria) this;
        }

        public Criteria andBatteryNotLike(String value) {
            addCriterion("battery not like", value, "battery");
            return (Criteria) this;
        }

        public Criteria andBatteryIn(List<String> values) {
            addCriterion("battery in", values, "battery");
            return (Criteria) this;
        }

        public Criteria andBatteryNotIn(List<String> values) {
            addCriterion("battery not in", values, "battery");
            return (Criteria) this;
        }

        public Criteria andBatteryBetween(String value1, String value2) {
            addCriterion("battery between", value1, value2, "battery");
            return (Criteria) this;
        }

        public Criteria andBatteryNotBetween(String value1, String value2) {
            addCriterion("battery not between", value1, value2, "battery");
            return (Criteria) this;
        }

        public Criteria andExportcountryIsNull() {
            addCriterion("exportcountry is null");
            return (Criteria) this;
        }

        public Criteria andExportcountryIsNotNull() {
            addCriterion("exportcountry is not null");
            return (Criteria) this;
        }

        public Criteria andExportcountryEqualTo(String value) {
            addCriterion("exportcountry =", value, "exportcountry");
            return (Criteria) this;
        }

        public Criteria andExportcountryNotEqualTo(String value) {
            addCriterion("exportcountry <>", value, "exportcountry");
            return (Criteria) this;
        }

        public Criteria andExportcountryGreaterThan(String value) {
            addCriterion("exportcountry >", value, "exportcountry");
            return (Criteria) this;
        }

        public Criteria andExportcountryGreaterThanOrEqualTo(String value) {
            addCriterion("exportcountry >=", value, "exportcountry");
            return (Criteria) this;
        }

        public Criteria andExportcountryLessThan(String value) {
            addCriterion("exportcountry <", value, "exportcountry");
            return (Criteria) this;
        }

        public Criteria andExportcountryLessThanOrEqualTo(String value) {
            addCriterion("exportcountry <=", value, "exportcountry");
            return (Criteria) this;
        }

        public Criteria andExportcountryLike(String value) {
            addCriterion("exportcountry like", value, "exportcountry");
            return (Criteria) this;
        }

        public Criteria andExportcountryNotLike(String value) {
            addCriterion("exportcountry not like", value, "exportcountry");
            return (Criteria) this;
        }

        public Criteria andExportcountryIn(List<String> values) {
            addCriterion("exportcountry in", values, "exportcountry");
            return (Criteria) this;
        }

        public Criteria andExportcountryNotIn(List<String> values) {
            addCriterion("exportcountry not in", values, "exportcountry");
            return (Criteria) this;
        }

        public Criteria andExportcountryBetween(String value1, String value2) {
            addCriterion("exportcountry between", value1, value2, "exportcountry");
            return (Criteria) this;
        }

        public Criteria andExportcountryNotBetween(String value1, String value2) {
            addCriterion("exportcountry not between", value1, value2, "exportcountry");
            return (Criteria) this;
        }

        public Criteria andInporcountryIsNull() {
            addCriterion("inporCountry is null");
            return (Criteria) this;
        }

        public Criteria andInporcountryIsNotNull() {
            addCriterion("inporCountry is not null");
            return (Criteria) this;
        }

        public Criteria andInporcountryEqualTo(String value) {
            addCriterion("inporCountry =", value, "inporcountry");
            return (Criteria) this;
        }

        public Criteria andInporcountryNotEqualTo(String value) {
            addCriterion("inporCountry <>", value, "inporcountry");
            return (Criteria) this;
        }

        public Criteria andInporcountryGreaterThan(String value) {
            addCriterion("inporCountry >", value, "inporcountry");
            return (Criteria) this;
        }

        public Criteria andInporcountryGreaterThanOrEqualTo(String value) {
            addCriterion("inporCountry >=", value, "inporcountry");
            return (Criteria) this;
        }

        public Criteria andInporcountryLessThan(String value) {
            addCriterion("inporCountry <", value, "inporcountry");
            return (Criteria) this;
        }

        public Criteria andInporcountryLessThanOrEqualTo(String value) {
            addCriterion("inporCountry <=", value, "inporcountry");
            return (Criteria) this;
        }

        public Criteria andInporcountryLike(String value) {
            addCriterion("inporCountry like", value, "inporcountry");
            return (Criteria) this;
        }

        public Criteria andInporcountryNotLike(String value) {
            addCriterion("inporCountry not like", value, "inporcountry");
            return (Criteria) this;
        }

        public Criteria andInporcountryIn(List<String> values) {
            addCriterion("inporCountry in", values, "inporcountry");
            return (Criteria) this;
        }

        public Criteria andInporcountryNotIn(List<String> values) {
            addCriterion("inporCountry not in", values, "inporcountry");
            return (Criteria) this;
        }

        public Criteria andInporcountryBetween(String value1, String value2) {
            addCriterion("inporCountry between", value1, value2, "inporcountry");
            return (Criteria) this;
        }

        public Criteria andInporcountryNotBetween(String value1, String value2) {
            addCriterion("inporCountry not between", value1, value2, "inporcountry");
            return (Criteria) this;
        }

        public Criteria andRegisteredweightIsNull() {
            addCriterion("registeredWeight is null");
            return (Criteria) this;
        }

        public Criteria andRegisteredweightIsNotNull() {
            addCriterion("registeredWeight is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteredweightEqualTo(Double value) {
            addCriterion("registeredWeight =", value, "registeredweight");
            return (Criteria) this;
        }

        public Criteria andRegisteredweightNotEqualTo(Double value) {
            addCriterion("registeredWeight <>", value, "registeredweight");
            return (Criteria) this;
        }

        public Criteria andRegisteredweightGreaterThan(Double value) {
            addCriterion("registeredWeight >", value, "registeredweight");
            return (Criteria) this;
        }

        public Criteria andRegisteredweightGreaterThanOrEqualTo(Double value) {
            addCriterion("registeredWeight >=", value, "registeredweight");
            return (Criteria) this;
        }

        public Criteria andRegisteredweightLessThan(Double value) {
            addCriterion("registeredWeight <", value, "registeredweight");
            return (Criteria) this;
        }

        public Criteria andRegisteredweightLessThanOrEqualTo(Double value) {
            addCriterion("registeredWeight <=", value, "registeredweight");
            return (Criteria) this;
        }

        public Criteria andRegisteredweightIn(List<Double> values) {
            addCriterion("registeredWeight in", values, "registeredweight");
            return (Criteria) this;
        }

        public Criteria andRegisteredweightNotIn(List<Double> values) {
            addCriterion("registeredWeight not in", values, "registeredweight");
            return (Criteria) this;
        }

        public Criteria andRegisteredweightBetween(Double value1, Double value2) {
            addCriterion("registeredWeight between", value1, value2, "registeredweight");
            return (Criteria) this;
        }

        public Criteria andRegisteredweightNotBetween(Double value1, Double value2) {
            addCriterion("registeredWeight not between", value1, value2, "registeredweight");
            return (Criteria) this;
        }

        public Criteria andIsnewIsNull() {
            addCriterion("isNew is null");
            return (Criteria) this;
        }

        public Criteria andIsnewIsNotNull() {
            addCriterion("isNew is not null");
            return (Criteria) this;
        }

        public Criteria andIsnewEqualTo(String value) {
            addCriterion("isNew =", value, "isnew");
            return (Criteria) this;
        }

        public Criteria andIsnewNotEqualTo(String value) {
            addCriterion("isNew <>", value, "isnew");
            return (Criteria) this;
        }

        public Criteria andIsnewGreaterThan(String value) {
            addCriterion("isNew >", value, "isnew");
            return (Criteria) this;
        }

        public Criteria andIsnewGreaterThanOrEqualTo(String value) {
            addCriterion("isNew >=", value, "isnew");
            return (Criteria) this;
        }

        public Criteria andIsnewLessThan(String value) {
            addCriterion("isNew <", value, "isnew");
            return (Criteria) this;
        }

        public Criteria andIsnewLessThanOrEqualTo(String value) {
            addCriterion("isNew <=", value, "isnew");
            return (Criteria) this;
        }

        public Criteria andIsnewLike(String value) {
            addCriterion("isNew like", value, "isnew");
            return (Criteria) this;
        }

        public Criteria andIsnewNotLike(String value) {
            addCriterion("isNew not like", value, "isnew");
            return (Criteria) this;
        }

        public Criteria andIsnewIn(List<String> values) {
            addCriterion("isNew in", values, "isnew");
            return (Criteria) this;
        }

        public Criteria andIsnewNotIn(List<String> values) {
            addCriterion("isNew not in", values, "isnew");
            return (Criteria) this;
        }

        public Criteria andIsnewBetween(String value1, String value2) {
            addCriterion("isNew between", value1, value2, "isnew");
            return (Criteria) this;
        }

        public Criteria andIsnewNotBetween(String value1, String value2) {
            addCriterion("isNew not between", value1, value2, "isnew");
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

        public Criteria andHeadwaytypeIsNull() {
            addCriterion("headwayType is null");
            return (Criteria) this;
        }

        public Criteria andHeadwaytypeIsNotNull() {
            addCriterion("headwayType is not null");
            return (Criteria) this;
        }

        public Criteria andHeadwaytypeEqualTo(String value) {
            addCriterion("headwayType =", value, "headwaytype");
            return (Criteria) this;
        }

        public Criteria andHeadwaytypeNotEqualTo(String value) {
            addCriterion("headwayType <>", value, "headwaytype");
            return (Criteria) this;
        }

        public Criteria andHeadwaytypeGreaterThan(String value) {
            addCriterion("headwayType >", value, "headwaytype");
            return (Criteria) this;
        }

        public Criteria andHeadwaytypeGreaterThanOrEqualTo(String value) {
            addCriterion("headwayType >=", value, "headwaytype");
            return (Criteria) this;
        }

        public Criteria andHeadwaytypeLessThan(String value) {
            addCriterion("headwayType <", value, "headwaytype");
            return (Criteria) this;
        }

        public Criteria andHeadwaytypeLessThanOrEqualTo(String value) {
            addCriterion("headwayType <=", value, "headwaytype");
            return (Criteria) this;
        }

        public Criteria andHeadwaytypeLike(String value) {
            addCriterion("headwayType like", value, "headwaytype");
            return (Criteria) this;
        }

        public Criteria andHeadwaytypeNotLike(String value) {
            addCriterion("headwayType not like", value, "headwaytype");
            return (Criteria) this;
        }

        public Criteria andHeadwaytypeIn(List<String> values) {
            addCriterion("headwayType in", values, "headwaytype");
            return (Criteria) this;
        }

        public Criteria andHeadwaytypeNotIn(List<String> values) {
            addCriterion("headwayType not in", values, "headwaytype");
            return (Criteria) this;
        }

        public Criteria andHeadwaytypeBetween(String value1, String value2) {
            addCriterion("headwayType between", value1, value2, "headwaytype");
            return (Criteria) this;
        }

        public Criteria andHeadwaytypeNotBetween(String value1, String value2) {
            addCriterion("headwayType not between", value1, value2, "headwaytype");
            return (Criteria) this;
        }

        public Criteria andProductlevelIsNull() {
            addCriterion("productlevel is null");
            return (Criteria) this;
        }

        public Criteria andProductlevelIsNotNull() {
            addCriterion("productlevel is not null");
            return (Criteria) this;
        }

        public Criteria andProductlevelEqualTo(String value) {
            addCriterion("productlevel =", value, "productlevel");
            return (Criteria) this;
        }

        public Criteria andProductlevelNotEqualTo(String value) {
            addCriterion("productlevel <>", value, "productlevel");
            return (Criteria) this;
        }

        public Criteria andProductlevelGreaterThan(String value) {
            addCriterion("productlevel >", value, "productlevel");
            return (Criteria) this;
        }

        public Criteria andProductlevelGreaterThanOrEqualTo(String value) {
            addCriterion("productlevel >=", value, "productlevel");
            return (Criteria) this;
        }

        public Criteria andProductlevelLessThan(String value) {
            addCriterion("productlevel <", value, "productlevel");
            return (Criteria) this;
        }

        public Criteria andProductlevelLessThanOrEqualTo(String value) {
            addCriterion("productlevel <=", value, "productlevel");
            return (Criteria) this;
        }

        public Criteria andProductlevelLike(String value) {
            addCriterion("productlevel like", value, "productlevel");
            return (Criteria) this;
        }

        public Criteria andProductlevelNotLike(String value) {
            addCriterion("productlevel not like", value, "productlevel");
            return (Criteria) this;
        }

        public Criteria andProductlevelIn(List<String> values) {
            addCriterion("productlevel in", values, "productlevel");
            return (Criteria) this;
        }

        public Criteria andProductlevelNotIn(List<String> values) {
            addCriterion("productlevel not in", values, "productlevel");
            return (Criteria) this;
        }

        public Criteria andProductlevelBetween(String value1, String value2) {
            addCriterion("productlevel between", value1, value2, "productlevel");
            return (Criteria) this;
        }

        public Criteria andProductlevelNotBetween(String value1, String value2) {
            addCriterion("productlevel not between", value1, value2, "productlevel");
            return (Criteria) this;
        }

        public Criteria andSalegroupidIsNull() {
            addCriterion("salegroupID is null");
            return (Criteria) this;
        }

        public Criteria andSalegroupidIsNotNull() {
            addCriterion("salegroupID is not null");
            return (Criteria) this;
        }

        public Criteria andSalegroupidEqualTo(Integer value) {
            addCriterion("salegroupID =", value, "salegroupid");
            return (Criteria) this;
        }

        public Criteria andSalegroupidNotEqualTo(Integer value) {
            addCriterion("salegroupID <>", value, "salegroupid");
            return (Criteria) this;
        }

        public Criteria andSalegroupidGreaterThan(Integer value) {
            addCriterion("salegroupID >", value, "salegroupid");
            return (Criteria) this;
        }

        public Criteria andSalegroupidGreaterThanOrEqualTo(Integer value) {
            addCriterion("salegroupID >=", value, "salegroupid");
            return (Criteria) this;
        }

        public Criteria andSalegroupidLessThan(Integer value) {
            addCriterion("salegroupID <", value, "salegroupid");
            return (Criteria) this;
        }

        public Criteria andSalegroupidLessThanOrEqualTo(Integer value) {
            addCriterion("salegroupID <=", value, "salegroupid");
            return (Criteria) this;
        }

        public Criteria andSalegroupidIn(List<Integer> values) {
            addCriterion("salegroupID in", values, "salegroupid");
            return (Criteria) this;
        }

        public Criteria andSalegroupidNotIn(List<Integer> values) {
            addCriterion("salegroupID not in", values, "salegroupid");
            return (Criteria) this;
        }

        public Criteria andSalegroupidBetween(Integer value1, Integer value2) {
            addCriterion("salegroupID between", value1, value2, "salegroupid");
            return (Criteria) this;
        }

        public Criteria andSalegroupidNotBetween(Integer value1, Integer value2) {
            addCriterion("salegroupID not between", value1, value2, "salegroupid");
            return (Criteria) this;
        }

        public Criteria andSalegroupnameIsNull() {
            addCriterion("salegroupName is null");
            return (Criteria) this;
        }

        public Criteria andSalegroupnameIsNotNull() {
            addCriterion("salegroupName is not null");
            return (Criteria) this;
        }

        public Criteria andSalegroupnameEqualTo(String value) {
            addCriterion("salegroupName =", value, "salegroupname");
            return (Criteria) this;
        }

        public Criteria andSalegroupnameNotEqualTo(String value) {
            addCriterion("salegroupName <>", value, "salegroupname");
            return (Criteria) this;
        }

        public Criteria andSalegroupnameGreaterThan(String value) {
            addCriterion("salegroupName >", value, "salegroupname");
            return (Criteria) this;
        }

        public Criteria andSalegroupnameGreaterThanOrEqualTo(String value) {
            addCriterion("salegroupName >=", value, "salegroupname");
            return (Criteria) this;
        }

        public Criteria andSalegroupnameLessThan(String value) {
            addCriterion("salegroupName <", value, "salegroupname");
            return (Criteria) this;
        }

        public Criteria andSalegroupnameLessThanOrEqualTo(String value) {
            addCriterion("salegroupName <=", value, "salegroupname");
            return (Criteria) this;
        }

        public Criteria andSalegroupnameLike(String value) {
            addCriterion("salegroupName like", value, "salegroupname");
            return (Criteria) this;
        }

        public Criteria andSalegroupnameNotLike(String value) {
            addCriterion("salegroupName not like", value, "salegroupname");
            return (Criteria) this;
        }

        public Criteria andSalegroupnameIn(List<String> values) {
            addCriterion("salegroupName in", values, "salegroupname");
            return (Criteria) this;
        }

        public Criteria andSalegroupnameNotIn(List<String> values) {
            addCriterion("salegroupName not in", values, "salegroupname");
            return (Criteria) this;
        }

        public Criteria andSalegroupnameBetween(String value1, String value2) {
            addCriterion("salegroupName between", value1, value2, "salegroupname");
            return (Criteria) this;
        }

        public Criteria andSalegroupnameNotBetween(String value1, String value2) {
            addCriterion("salegroupName not between", value1, value2, "salegroupname");
            return (Criteria) this;
        }

        public Criteria andProductgroupidIsNull() {
            addCriterion("productgroupID is null");
            return (Criteria) this;
        }

        public Criteria andProductgroupidIsNotNull() {
            addCriterion("productgroupID is not null");
            return (Criteria) this;
        }

        public Criteria andProductgroupidEqualTo(Integer value) {
            addCriterion("productgroupID =", value, "productgroupid");
            return (Criteria) this;
        }

        public Criteria andProductgroupidNotEqualTo(Integer value) {
            addCriterion("productgroupID <>", value, "productgroupid");
            return (Criteria) this;
        }

        public Criteria andProductgroupidGreaterThan(Integer value) {
            addCriterion("productgroupID >", value, "productgroupid");
            return (Criteria) this;
        }

        public Criteria andProductgroupidGreaterThanOrEqualTo(Integer value) {
            addCriterion("productgroupID >=", value, "productgroupid");
            return (Criteria) this;
        }

        public Criteria andProductgroupidLessThan(Integer value) {
            addCriterion("productgroupID <", value, "productgroupid");
            return (Criteria) this;
        }

        public Criteria andProductgroupidLessThanOrEqualTo(Integer value) {
            addCriterion("productgroupID <=", value, "productgroupid");
            return (Criteria) this;
        }

        public Criteria andProductgroupidIn(List<Integer> values) {
            addCriterion("productgroupID in", values, "productgroupid");
            return (Criteria) this;
        }

        public Criteria andProductgroupidNotIn(List<Integer> values) {
            addCriterion("productgroupID not in", values, "productgroupid");
            return (Criteria) this;
        }

        public Criteria andProductgroupidBetween(Integer value1, Integer value2) {
            addCriterion("productgroupID between", value1, value2, "productgroupid");
            return (Criteria) this;
        }

        public Criteria andProductgroupidNotBetween(Integer value1, Integer value2) {
            addCriterion("productgroupID not between", value1, value2, "productgroupid");
            return (Criteria) this;
        }

        public Criteria andProductgroupnameIsNull() {
            addCriterion("productgroupName is null");
            return (Criteria) this;
        }

        public Criteria andProductgroupnameIsNotNull() {
            addCriterion("productgroupName is not null");
            return (Criteria) this;
        }

        public Criteria andProductgroupnameEqualTo(String value) {
            addCriterion("productgroupName =", value, "productgroupname");
            return (Criteria) this;
        }

        public Criteria andProductgroupnameNotEqualTo(String value) {
            addCriterion("productgroupName <>", value, "productgroupname");
            return (Criteria) this;
        }

        public Criteria andProductgroupnameGreaterThan(String value) {
            addCriterion("productgroupName >", value, "productgroupname");
            return (Criteria) this;
        }

        public Criteria andProductgroupnameGreaterThanOrEqualTo(String value) {
            addCriterion("productgroupName >=", value, "productgroupname");
            return (Criteria) this;
        }

        public Criteria andProductgroupnameLessThan(String value) {
            addCriterion("productgroupName <", value, "productgroupname");
            return (Criteria) this;
        }

        public Criteria andProductgroupnameLessThanOrEqualTo(String value) {
            addCriterion("productgroupName <=", value, "productgroupname");
            return (Criteria) this;
        }

        public Criteria andProductgroupnameLike(String value) {
            addCriterion("productgroupName like", value, "productgroupname");
            return (Criteria) this;
        }

        public Criteria andProductgroupnameNotLike(String value) {
            addCriterion("productgroupName not like", value, "productgroupname");
            return (Criteria) this;
        }

        public Criteria andProductgroupnameIn(List<String> values) {
            addCriterion("productgroupName in", values, "productgroupname");
            return (Criteria) this;
        }

        public Criteria andProductgroupnameNotIn(List<String> values) {
            addCriterion("productgroupName not in", values, "productgroupname");
            return (Criteria) this;
        }

        public Criteria andProductgroupnameBetween(String value1, String value2) {
            addCriterion("productgroupName between", value1, value2, "productgroupname");
            return (Criteria) this;
        }

        public Criteria andProductgroupnameNotBetween(String value1, String value2) {
            addCriterion("productgroupName not between", value1, value2, "productgroupname");
            return (Criteria) this;
        }

        public Criteria andIsactiveIsNull() {
            addCriterion("isActive is null");
            return (Criteria) this;
        }

        public Criteria andIsactiveIsNotNull() {
            addCriterion("isActive is not null");
            return (Criteria) this;
        }

        public Criteria andIsactiveEqualTo(String value) {
            addCriterion("isActive =", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveNotEqualTo(String value) {
            addCriterion("isActive <>", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveGreaterThan(String value) {
            addCriterion("isActive >", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveGreaterThanOrEqualTo(String value) {
            addCriterion("isActive >=", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveLessThan(String value) {
            addCriterion("isActive <", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveLessThanOrEqualTo(String value) {
            addCriterion("isActive <=", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveLike(String value) {
            addCriterion("isActive like", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveNotLike(String value) {
            addCriterion("isActive not like", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveIn(List<String> values) {
            addCriterion("isActive in", values, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveNotIn(List<String> values) {
            addCriterion("isActive not in", values, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveBetween(String value1, String value2) {
            addCriterion("isActive between", value1, value2, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveNotBetween(String value1, String value2) {
            addCriterion("isActive not between", value1, value2, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIsNull() {
            addCriterion("isDelete is null");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIsNotNull() {
            addCriterion("isDelete is not null");
            return (Criteria) this;
        }

        public Criteria andIsdeleteEqualTo(String value) {
            addCriterion("isDelete =", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotEqualTo(String value) {
            addCriterion("isDelete <>", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThan(String value) {
            addCriterion("isDelete >", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThanOrEqualTo(String value) {
            addCriterion("isDelete >=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThan(String value) {
            addCriterion("isDelete <", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThanOrEqualTo(String value) {
            addCriterion("isDelete <=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLike(String value) {
            addCriterion("isDelete like", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotLike(String value) {
            addCriterion("isDelete not like", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIn(List<String> values) {
            addCriterion("isDelete in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotIn(List<String> values) {
            addCriterion("isDelete not in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteBetween(String value1, String value2) {
            addCriterion("isDelete between", value1, value2, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotBetween(String value1, String value2) {
            addCriterion("isDelete not between", value1, value2, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsplusIsNull() {
            addCriterion("isPlus is null");
            return (Criteria) this;
        }

        public Criteria andIsplusIsNotNull() {
            addCriterion("isPlus is not null");
            return (Criteria) this;
        }

        public Criteria andIsplusEqualTo(String value) {
            addCriterion("isPlus =", value, "isplus");
            return (Criteria) this;
        }

        public Criteria andIsplusNotEqualTo(String value) {
            addCriterion("isPlus <>", value, "isplus");
            return (Criteria) this;
        }

        public Criteria andIsplusGreaterThan(String value) {
            addCriterion("isPlus >", value, "isplus");
            return (Criteria) this;
        }

        public Criteria andIsplusGreaterThanOrEqualTo(String value) {
            addCriterion("isPlus >=", value, "isplus");
            return (Criteria) this;
        }

        public Criteria andIsplusLessThan(String value) {
            addCriterion("isPlus <", value, "isplus");
            return (Criteria) this;
        }

        public Criteria andIsplusLessThanOrEqualTo(String value) {
            addCriterion("isPlus <=", value, "isplus");
            return (Criteria) this;
        }

        public Criteria andIsplusLike(String value) {
            addCriterion("isPlus like", value, "isplus");
            return (Criteria) this;
        }

        public Criteria andIsplusNotLike(String value) {
            addCriterion("isPlus not like", value, "isplus");
            return (Criteria) this;
        }

        public Criteria andIsplusIn(List<String> values) {
            addCriterion("isPlus in", values, "isplus");
            return (Criteria) this;
        }

        public Criteria andIsplusNotIn(List<String> values) {
            addCriterion("isPlus not in", values, "isplus");
            return (Criteria) this;
        }

        public Criteria andIsplusBetween(String value1, String value2) {
            addCriterion("isPlus between", value1, value2, "isplus");
            return (Criteria) this;
        }

        public Criteria andIsplusNotBetween(String value1, String value2) {
            addCriterion("isPlus not between", value1, value2, "isplus");
            return (Criteria) this;
        }

        public Criteria andRegisteredvolumeIsNull() {
            addCriterion("registeredVolume is null");
            return (Criteria) this;
        }

        public Criteria andRegisteredvolumeIsNotNull() {
            addCriterion("registeredVolume is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteredvolumeEqualTo(Double value) {
            addCriterion("registeredVolume =", value, "registeredvolume");
            return (Criteria) this;
        }

        public Criteria andRegisteredvolumeNotEqualTo(Double value) {
            addCriterion("registeredVolume <>", value, "registeredvolume");
            return (Criteria) this;
        }

        public Criteria andRegisteredvolumeGreaterThan(Double value) {
            addCriterion("registeredVolume >", value, "registeredvolume");
            return (Criteria) this;
        }

        public Criteria andRegisteredvolumeGreaterThanOrEqualTo(Double value) {
            addCriterion("registeredVolume >=", value, "registeredvolume");
            return (Criteria) this;
        }

        public Criteria andRegisteredvolumeLessThan(Double value) {
            addCriterion("registeredVolume <", value, "registeredvolume");
            return (Criteria) this;
        }

        public Criteria andRegisteredvolumeLessThanOrEqualTo(Double value) {
            addCriterion("registeredVolume <=", value, "registeredvolume");
            return (Criteria) this;
        }

        public Criteria andRegisteredvolumeIn(List<Double> values) {
            addCriterion("registeredVolume in", values, "registeredvolume");
            return (Criteria) this;
        }

        public Criteria andRegisteredvolumeNotIn(List<Double> values) {
            addCriterion("registeredVolume not in", values, "registeredvolume");
            return (Criteria) this;
        }

        public Criteria andRegisteredvolumeBetween(Double value1, Double value2) {
            addCriterion("registeredVolume between", value1, value2, "registeredvolume");
            return (Criteria) this;
        }

        public Criteria andRegisteredvolumeNotBetween(Double value1, Double value2) {
            addCriterion("registeredVolume not between", value1, value2, "registeredvolume");
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

        public Criteria andMidIsNull() {
            addCriterion("mid is null");
            return (Criteria) this;
        }

        public Criteria andMidIsNotNull() {
            addCriterion("mid is not null");
            return (Criteria) this;
        }

        public Criteria andMidEqualTo(Integer value) {
            addCriterion("mid =", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotEqualTo(Integer value) {
            addCriterion("mid <>", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThan(Integer value) {
            addCriterion("mid >", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThanOrEqualTo(Integer value) {
            addCriterion("mid >=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThan(Integer value) {
            addCriterion("mid <", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThanOrEqualTo(Integer value) {
            addCriterion("mid <=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidIn(List<Integer> values) {
            addCriterion("mid in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotIn(List<Integer> values) {
            addCriterion("mid not in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidBetween(Integer value1, Integer value2) {
            addCriterion("mid between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotBetween(Integer value1, Integer value2) {
            addCriterion("mid not between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMcodeIsNull() {
            addCriterion("mcode is null");
            return (Criteria) this;
        }

        public Criteria andMcodeIsNotNull() {
            addCriterion("mcode is not null");
            return (Criteria) this;
        }

        public Criteria andMcodeEqualTo(String value) {
            addCriterion("mcode =", value, "mcode");
            return (Criteria) this;
        }

        public Criteria andMcodeNotEqualTo(String value) {
            addCriterion("mcode <>", value, "mcode");
            return (Criteria) this;
        }

        public Criteria andMcodeGreaterThan(String value) {
            addCriterion("mcode >", value, "mcode");
            return (Criteria) this;
        }

        public Criteria andMcodeGreaterThanOrEqualTo(String value) {
            addCriterion("mcode >=", value, "mcode");
            return (Criteria) this;
        }

        public Criteria andMcodeLessThan(String value) {
            addCriterion("mcode <", value, "mcode");
            return (Criteria) this;
        }

        public Criteria andMcodeLessThanOrEqualTo(String value) {
            addCriterion("mcode <=", value, "mcode");
            return (Criteria) this;
        }

        public Criteria andMcodeLike(String value) {
            addCriterion("mcode like", value, "mcode");
            return (Criteria) this;
        }

        public Criteria andMcodeNotLike(String value) {
            addCriterion("mcode not like", value, "mcode");
            return (Criteria) this;
        }

        public Criteria andMcodeIn(List<String> values) {
            addCriterion("mcode in", values, "mcode");
            return (Criteria) this;
        }

        public Criteria andMcodeNotIn(List<String> values) {
            addCriterion("mcode not in", values, "mcode");
            return (Criteria) this;
        }

        public Criteria andMcodeBetween(String value1, String value2) {
            addCriterion("mcode between", value1, value2, "mcode");
            return (Criteria) this;
        }

        public Criteria andMcodeNotBetween(String value1, String value2) {
            addCriterion("mcode not between", value1, value2, "mcode");
            return (Criteria) this;
        }

        public Criteria andSupplieridIsNull() {
            addCriterion("supplierID is null");
            return (Criteria) this;
        }

        public Criteria andSupplieridIsNotNull() {
            addCriterion("supplierID is not null");
            return (Criteria) this;
        }

        public Criteria andSupplieridEqualTo(Integer value) {
            addCriterion("supplierID =", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridNotEqualTo(Integer value) {
            addCriterion("supplierID <>", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridGreaterThan(Integer value) {
            addCriterion("supplierID >", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridGreaterThanOrEqualTo(Integer value) {
            addCriterion("supplierID >=", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridLessThan(Integer value) {
            addCriterion("supplierID <", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridLessThanOrEqualTo(Integer value) {
            addCriterion("supplierID <=", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridIn(List<Integer> values) {
            addCriterion("supplierID in", values, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridNotIn(List<Integer> values) {
            addCriterion("supplierID not in", values, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridBetween(Integer value1, Integer value2) {
            addCriterion("supplierID between", value1, value2, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridNotBetween(Integer value1, Integer value2) {
            addCriterion("supplierID not between", value1, value2, "supplierid");
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

        public Criteria andSupplierlink1IsNull() {
            addCriterion("supplierlink1 is null");
            return (Criteria) this;
        }

        public Criteria andSupplierlink1IsNotNull() {
            addCriterion("supplierlink1 is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierlink1EqualTo(String value) {
            addCriterion("supplierlink1 =", value, "supplierlink1");
            return (Criteria) this;
        }

        public Criteria andSupplierlink1NotEqualTo(String value) {
            addCriterion("supplierlink1 <>", value, "supplierlink1");
            return (Criteria) this;
        }

        public Criteria andSupplierlink1GreaterThan(String value) {
            addCriterion("supplierlink1 >", value, "supplierlink1");
            return (Criteria) this;
        }

        public Criteria andSupplierlink1GreaterThanOrEqualTo(String value) {
            addCriterion("supplierlink1 >=", value, "supplierlink1");
            return (Criteria) this;
        }

        public Criteria andSupplierlink1LessThan(String value) {
            addCriterion("supplierlink1 <", value, "supplierlink1");
            return (Criteria) this;
        }

        public Criteria andSupplierlink1LessThanOrEqualTo(String value) {
            addCriterion("supplierlink1 <=", value, "supplierlink1");
            return (Criteria) this;
        }

        public Criteria andSupplierlink1Like(String value) {
            addCriterion("supplierlink1 like", value, "supplierlink1");
            return (Criteria) this;
        }

        public Criteria andSupplierlink1NotLike(String value) {
            addCriterion("supplierlink1 not like", value, "supplierlink1");
            return (Criteria) this;
        }

        public Criteria andSupplierlink1In(List<String> values) {
            addCriterion("supplierlink1 in", values, "supplierlink1");
            return (Criteria) this;
        }

        public Criteria andSupplierlink1NotIn(List<String> values) {
            addCriterion("supplierlink1 not in", values, "supplierlink1");
            return (Criteria) this;
        }

        public Criteria andSupplierlink1Between(String value1, String value2) {
            addCriterion("supplierlink1 between", value1, value2, "supplierlink1");
            return (Criteria) this;
        }

        public Criteria andSupplierlink1NotBetween(String value1, String value2) {
            addCriterion("supplierlink1 not between", value1, value2, "supplierlink1");
            return (Criteria) this;
        }

        public Criteria andSupplierlink2IsNull() {
            addCriterion("supplierlink2 is null");
            return (Criteria) this;
        }

        public Criteria andSupplierlink2IsNotNull() {
            addCriterion("supplierlink2 is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierlink2EqualTo(String value) {
            addCriterion("supplierlink2 =", value, "supplierlink2");
            return (Criteria) this;
        }

        public Criteria andSupplierlink2NotEqualTo(String value) {
            addCriterion("supplierlink2 <>", value, "supplierlink2");
            return (Criteria) this;
        }

        public Criteria andSupplierlink2GreaterThan(String value) {
            addCriterion("supplierlink2 >", value, "supplierlink2");
            return (Criteria) this;
        }

        public Criteria andSupplierlink2GreaterThanOrEqualTo(String value) {
            addCriterion("supplierlink2 >=", value, "supplierlink2");
            return (Criteria) this;
        }

        public Criteria andSupplierlink2LessThan(String value) {
            addCriterion("supplierlink2 <", value, "supplierlink2");
            return (Criteria) this;
        }

        public Criteria andSupplierlink2LessThanOrEqualTo(String value) {
            addCriterion("supplierlink2 <=", value, "supplierlink2");
            return (Criteria) this;
        }

        public Criteria andSupplierlink2Like(String value) {
            addCriterion("supplierlink2 like", value, "supplierlink2");
            return (Criteria) this;
        }

        public Criteria andSupplierlink2NotLike(String value) {
            addCriterion("supplierlink2 not like", value, "supplierlink2");
            return (Criteria) this;
        }

        public Criteria andSupplierlink2In(List<String> values) {
            addCriterion("supplierlink2 in", values, "supplierlink2");
            return (Criteria) this;
        }

        public Criteria andSupplierlink2NotIn(List<String> values) {
            addCriterion("supplierlink2 not in", values, "supplierlink2");
            return (Criteria) this;
        }

        public Criteria andSupplierlink2Between(String value1, String value2) {
            addCriterion("supplierlink2 between", value1, value2, "supplierlink2");
            return (Criteria) this;
        }

        public Criteria andSupplierlink2NotBetween(String value1, String value2) {
            addCriterion("supplierlink2 not between", value1, value2, "supplierlink2");
            return (Criteria) this;
        }

        public Criteria andSupplierlink3IsNull() {
            addCriterion("supplierlink3 is null");
            return (Criteria) this;
        }

        public Criteria andSupplierlink3IsNotNull() {
            addCriterion("supplierlink3 is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierlink3EqualTo(String value) {
            addCriterion("supplierlink3 =", value, "supplierlink3");
            return (Criteria) this;
        }

        public Criteria andSupplierlink3NotEqualTo(String value) {
            addCriterion("supplierlink3 <>", value, "supplierlink3");
            return (Criteria) this;
        }

        public Criteria andSupplierlink3GreaterThan(String value) {
            addCriterion("supplierlink3 >", value, "supplierlink3");
            return (Criteria) this;
        }

        public Criteria andSupplierlink3GreaterThanOrEqualTo(String value) {
            addCriterion("supplierlink3 >=", value, "supplierlink3");
            return (Criteria) this;
        }

        public Criteria andSupplierlink3LessThan(String value) {
            addCriterion("supplierlink3 <", value, "supplierlink3");
            return (Criteria) this;
        }

        public Criteria andSupplierlink3LessThanOrEqualTo(String value) {
            addCriterion("supplierlink3 <=", value, "supplierlink3");
            return (Criteria) this;
        }

        public Criteria andSupplierlink3Like(String value) {
            addCriterion("supplierlink3 like", value, "supplierlink3");
            return (Criteria) this;
        }

        public Criteria andSupplierlink3NotLike(String value) {
            addCriterion("supplierlink3 not like", value, "supplierlink3");
            return (Criteria) this;
        }

        public Criteria andSupplierlink3In(List<String> values) {
            addCriterion("supplierlink3 in", values, "supplierlink3");
            return (Criteria) this;
        }

        public Criteria andSupplierlink3NotIn(List<String> values) {
            addCriterion("supplierlink3 not in", values, "supplierlink3");
            return (Criteria) this;
        }

        public Criteria andSupplierlink3Between(String value1, String value2) {
            addCriterion("supplierlink3 between", value1, value2, "supplierlink3");
            return (Criteria) this;
        }

        public Criteria andSupplierlink3NotBetween(String value1, String value2) {
            addCriterion("supplierlink3 not between", value1, value2, "supplierlink3");
            return (Criteria) this;
        }

        public Criteria andDeliverytimeIsNull() {
            addCriterion("deliverytime is null");
            return (Criteria) this;
        }

        public Criteria andDeliverytimeIsNotNull() {
            addCriterion("deliverytime is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverytimeEqualTo(Integer value) {
            addCriterion("deliverytime =", value, "deliverytime");
            return (Criteria) this;
        }

        public Criteria andDeliverytimeNotEqualTo(Integer value) {
            addCriterion("deliverytime <>", value, "deliverytime");
            return (Criteria) this;
        }

        public Criteria andDeliverytimeGreaterThan(Integer value) {
            addCriterion("deliverytime >", value, "deliverytime");
            return (Criteria) this;
        }

        public Criteria andDeliverytimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("deliverytime >=", value, "deliverytime");
            return (Criteria) this;
        }

        public Criteria andDeliverytimeLessThan(Integer value) {
            addCriterion("deliverytime <", value, "deliverytime");
            return (Criteria) this;
        }

        public Criteria andDeliverytimeLessThanOrEqualTo(Integer value) {
            addCriterion("deliverytime <=", value, "deliverytime");
            return (Criteria) this;
        }

        public Criteria andDeliverytimeIn(List<Integer> values) {
            addCriterion("deliverytime in", values, "deliverytime");
            return (Criteria) this;
        }

        public Criteria andDeliverytimeNotIn(List<Integer> values) {
            addCriterion("deliverytime not in", values, "deliverytime");
            return (Criteria) this;
        }

        public Criteria andDeliverytimeBetween(Integer value1, Integer value2) {
            addCriterion("deliverytime between", value1, value2, "deliverytime");
            return (Criteria) this;
        }

        public Criteria andDeliverytimeNotBetween(Integer value1, Integer value2) {
            addCriterion("deliverytime not between", value1, value2, "deliverytime");
            return (Criteria) this;
        }

        public Criteria andRegisterlinkIsNull() {
            addCriterion("registerlink is null");
            return (Criteria) this;
        }

        public Criteria andRegisterlinkIsNotNull() {
            addCriterion("registerlink is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterlinkEqualTo(String value) {
            addCriterion("registerlink =", value, "registerlink");
            return (Criteria) this;
        }

        public Criteria andRegisterlinkNotEqualTo(String value) {
            addCriterion("registerlink <>", value, "registerlink");
            return (Criteria) this;
        }

        public Criteria andRegisterlinkGreaterThan(String value) {
            addCriterion("registerlink >", value, "registerlink");
            return (Criteria) this;
        }

        public Criteria andRegisterlinkGreaterThanOrEqualTo(String value) {
            addCriterion("registerlink >=", value, "registerlink");
            return (Criteria) this;
        }

        public Criteria andRegisterlinkLessThan(String value) {
            addCriterion("registerlink <", value, "registerlink");
            return (Criteria) this;
        }

        public Criteria andRegisterlinkLessThanOrEqualTo(String value) {
            addCriterion("registerlink <=", value, "registerlink");
            return (Criteria) this;
        }

        public Criteria andRegisterlinkLike(String value) {
            addCriterion("registerlink like", value, "registerlink");
            return (Criteria) this;
        }

        public Criteria andRegisterlinkNotLike(String value) {
            addCriterion("registerlink not like", value, "registerlink");
            return (Criteria) this;
        }

        public Criteria andRegisterlinkIn(List<String> values) {
            addCriterion("registerlink in", values, "registerlink");
            return (Criteria) this;
        }

        public Criteria andRegisterlinkNotIn(List<String> values) {
            addCriterion("registerlink not in", values, "registerlink");
            return (Criteria) this;
        }

        public Criteria andRegisterlinkBetween(String value1, String value2) {
            addCriterion("registerlink between", value1, value2, "registerlink");
            return (Criteria) this;
        }

        public Criteria andRegisterlinkNotBetween(String value1, String value2) {
            addCriterion("registerlink not between", value1, value2, "registerlink");
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