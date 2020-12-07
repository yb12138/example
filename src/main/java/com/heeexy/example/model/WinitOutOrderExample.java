package com.heeexy.example.model;

import java.util.ArrayList;
import java.util.List;

public class WinitOutOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WinitOutOrderExample() {
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

        public Criteria andExwarehouseidIsNull() {
            addCriterion("exwarehouseId is null");
            return (Criteria) this;
        }

        public Criteria andExwarehouseidIsNotNull() {
            addCriterion("exwarehouseId is not null");
            return (Criteria) this;
        }

        public Criteria andExwarehouseidEqualTo(String value) {
            addCriterion("exwarehouseId =", value, "exwarehouseid");
            return (Criteria) this;
        }

        public Criteria andExwarehouseidNotEqualTo(String value) {
            addCriterion("exwarehouseId <>", value, "exwarehouseid");
            return (Criteria) this;
        }

        public Criteria andExwarehouseidGreaterThan(String value) {
            addCriterion("exwarehouseId >", value, "exwarehouseid");
            return (Criteria) this;
        }

        public Criteria andExwarehouseidGreaterThanOrEqualTo(String value) {
            addCriterion("exwarehouseId >=", value, "exwarehouseid");
            return (Criteria) this;
        }

        public Criteria andExwarehouseidLessThan(String value) {
            addCriterion("exwarehouseId <", value, "exwarehouseid");
            return (Criteria) this;
        }

        public Criteria andExwarehouseidLessThanOrEqualTo(String value) {
            addCriterion("exwarehouseId <=", value, "exwarehouseid");
            return (Criteria) this;
        }

        public Criteria andExwarehouseidLike(String value) {
            addCriterion("exwarehouseId like", value, "exwarehouseid");
            return (Criteria) this;
        }

        public Criteria andExwarehouseidNotLike(String value) {
            addCriterion("exwarehouseId not like", value, "exwarehouseid");
            return (Criteria) this;
        }

        public Criteria andExwarehouseidIn(List<String> values) {
            addCriterion("exwarehouseId in", values, "exwarehouseid");
            return (Criteria) this;
        }

        public Criteria andExwarehouseidNotIn(List<String> values) {
            addCriterion("exwarehouseId not in", values, "exwarehouseid");
            return (Criteria) this;
        }

        public Criteria andExwarehouseidBetween(String value1, String value2) {
            addCriterion("exwarehouseId between", value1, value2, "exwarehouseid");
            return (Criteria) this;
        }

        public Criteria andExwarehouseidNotBetween(String value1, String value2) {
            addCriterion("exwarehouseId not between", value1, value2, "exwarehouseid");
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

        public Criteria andItemqtyIsNull() {
            addCriterion("itemqty is null");
            return (Criteria) this;
        }

        public Criteria andItemqtyIsNotNull() {
            addCriterion("itemqty is not null");
            return (Criteria) this;
        }

        public Criteria andItemqtyEqualTo(Integer value) {
            addCriterion("itemqty =", value, "itemqty");
            return (Criteria) this;
        }

        public Criteria andItemqtyNotEqualTo(Integer value) {
            addCriterion("itemqty <>", value, "itemqty");
            return (Criteria) this;
        }

        public Criteria andItemqtyGreaterThan(Integer value) {
            addCriterion("itemqty >", value, "itemqty");
            return (Criteria) this;
        }

        public Criteria andItemqtyGreaterThanOrEqualTo(Integer value) {
            addCriterion("itemqty >=", value, "itemqty");
            return (Criteria) this;
        }

        public Criteria andItemqtyLessThan(Integer value) {
            addCriterion("itemqty <", value, "itemqty");
            return (Criteria) this;
        }

        public Criteria andItemqtyLessThanOrEqualTo(Integer value) {
            addCriterion("itemqty <=", value, "itemqty");
            return (Criteria) this;
        }

        public Criteria andItemqtyIn(List<Integer> values) {
            addCriterion("itemqty in", values, "itemqty");
            return (Criteria) this;
        }

        public Criteria andItemqtyNotIn(List<Integer> values) {
            addCriterion("itemqty not in", values, "itemqty");
            return (Criteria) this;
        }

        public Criteria andItemqtyBetween(Integer value1, Integer value2) {
            addCriterion("itemqty between", value1, value2, "itemqty");
            return (Criteria) this;
        }

        public Criteria andItemqtyNotBetween(Integer value1, Integer value2) {
            addCriterion("itemqty not between", value1, value2, "itemqty");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(Double value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(Double value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(Double value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(Double value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(Double value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(Double value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<Double> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<Double> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(Double value1, Double value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(Double value1, Double value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andCountrynameIsNull() {
            addCriterion("countryName is null");
            return (Criteria) this;
        }

        public Criteria andCountrynameIsNotNull() {
            addCriterion("countryName is not null");
            return (Criteria) this;
        }

        public Criteria andCountrynameEqualTo(String value) {
            addCriterion("countryName =", value, "countryname");
            return (Criteria) this;
        }

        public Criteria andCountrynameNotEqualTo(String value) {
            addCriterion("countryName <>", value, "countryname");
            return (Criteria) this;
        }

        public Criteria andCountrynameGreaterThan(String value) {
            addCriterion("countryName >", value, "countryname");
            return (Criteria) this;
        }

        public Criteria andCountrynameGreaterThanOrEqualTo(String value) {
            addCriterion("countryName >=", value, "countryname");
            return (Criteria) this;
        }

        public Criteria andCountrynameLessThan(String value) {
            addCriterion("countryName <", value, "countryname");
            return (Criteria) this;
        }

        public Criteria andCountrynameLessThanOrEqualTo(String value) {
            addCriterion("countryName <=", value, "countryname");
            return (Criteria) this;
        }

        public Criteria andCountrynameLike(String value) {
            addCriterion("countryName like", value, "countryname");
            return (Criteria) this;
        }

        public Criteria andCountrynameNotLike(String value) {
            addCriterion("countryName not like", value, "countryname");
            return (Criteria) this;
        }

        public Criteria andCountrynameIn(List<String> values) {
            addCriterion("countryName in", values, "countryname");
            return (Criteria) this;
        }

        public Criteria andCountrynameNotIn(List<String> values) {
            addCriterion("countryName not in", values, "countryname");
            return (Criteria) this;
        }

        public Criteria andCountrynameBetween(String value1, String value2) {
            addCriterion("countryName between", value1, value2, "countryname");
            return (Criteria) this;
        }

        public Criteria andCountrynameNotBetween(String value1, String value2) {
            addCriterion("countryName not between", value1, value2, "countryname");
            return (Criteria) this;
        }

        public Criteria andDocumentnumIsNull() {
            addCriterion("documentNum is null");
            return (Criteria) this;
        }

        public Criteria andDocumentnumIsNotNull() {
            addCriterion("documentNum is not null");
            return (Criteria) this;
        }

        public Criteria andDocumentnumEqualTo(String value) {
            addCriterion("documentNum =", value, "documentnum");
            return (Criteria) this;
        }

        public Criteria andDocumentnumNotEqualTo(String value) {
            addCriterion("documentNum <>", value, "documentnum");
            return (Criteria) this;
        }

        public Criteria andDocumentnumGreaterThan(String value) {
            addCriterion("documentNum >", value, "documentnum");
            return (Criteria) this;
        }

        public Criteria andDocumentnumGreaterThanOrEqualTo(String value) {
            addCriterion("documentNum >=", value, "documentnum");
            return (Criteria) this;
        }

        public Criteria andDocumentnumLessThan(String value) {
            addCriterion("documentNum <", value, "documentnum");
            return (Criteria) this;
        }

        public Criteria andDocumentnumLessThanOrEqualTo(String value) {
            addCriterion("documentNum <=", value, "documentnum");
            return (Criteria) this;
        }

        public Criteria andDocumentnumLike(String value) {
            addCriterion("documentNum like", value, "documentnum");
            return (Criteria) this;
        }

        public Criteria andDocumentnumNotLike(String value) {
            addCriterion("documentNum not like", value, "documentnum");
            return (Criteria) this;
        }

        public Criteria andDocumentnumIn(List<String> values) {
            addCriterion("documentNum in", values, "documentnum");
            return (Criteria) this;
        }

        public Criteria andDocumentnumNotIn(List<String> values) {
            addCriterion("documentNum not in", values, "documentnum");
            return (Criteria) this;
        }

        public Criteria andDocumentnumBetween(String value1, String value2) {
            addCriterion("documentNum between", value1, value2, "documentnum");
            return (Criteria) this;
        }

        public Criteria andDocumentnumNotBetween(String value1, String value2) {
            addCriterion("documentNum not between", value1, value2, "documentnum");
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

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andEbayselleridIsNull() {
            addCriterion("eBaySellerID is null");
            return (Criteria) this;
        }

        public Criteria andEbayselleridIsNotNull() {
            addCriterion("eBaySellerID is not null");
            return (Criteria) this;
        }

        public Criteria andEbayselleridEqualTo(String value) {
            addCriterion("eBaySellerID =", value, "ebaysellerid");
            return (Criteria) this;
        }

        public Criteria andEbayselleridNotEqualTo(String value) {
            addCriterion("eBaySellerID <>", value, "ebaysellerid");
            return (Criteria) this;
        }

        public Criteria andEbayselleridGreaterThan(String value) {
            addCriterion("eBaySellerID >", value, "ebaysellerid");
            return (Criteria) this;
        }

        public Criteria andEbayselleridGreaterThanOrEqualTo(String value) {
            addCriterion("eBaySellerID >=", value, "ebaysellerid");
            return (Criteria) this;
        }

        public Criteria andEbayselleridLessThan(String value) {
            addCriterion("eBaySellerID <", value, "ebaysellerid");
            return (Criteria) this;
        }

        public Criteria andEbayselleridLessThanOrEqualTo(String value) {
            addCriterion("eBaySellerID <=", value, "ebaysellerid");
            return (Criteria) this;
        }

        public Criteria andEbayselleridLike(String value) {
            addCriterion("eBaySellerID like", value, "ebaysellerid");
            return (Criteria) this;
        }

        public Criteria andEbayselleridNotLike(String value) {
            addCriterion("eBaySellerID not like", value, "ebaysellerid");
            return (Criteria) this;
        }

        public Criteria andEbayselleridIn(List<String> values) {
            addCriterion("eBaySellerID in", values, "ebaysellerid");
            return (Criteria) this;
        }

        public Criteria andEbayselleridNotIn(List<String> values) {
            addCriterion("eBaySellerID not in", values, "ebaysellerid");
            return (Criteria) this;
        }

        public Criteria andEbayselleridBetween(String value1, String value2) {
            addCriterion("eBaySellerID between", value1, value2, "ebaysellerid");
            return (Criteria) this;
        }

        public Criteria andEbayselleridNotBetween(String value1, String value2) {
            addCriterion("eBaySellerID not between", value1, value2, "ebaysellerid");
            return (Criteria) this;
        }

        public Criteria andSellerordernoIsNull() {
            addCriterion("sellerOrderNo is null");
            return (Criteria) this;
        }

        public Criteria andSellerordernoIsNotNull() {
            addCriterion("sellerOrderNo is not null");
            return (Criteria) this;
        }

        public Criteria andSellerordernoEqualTo(String value) {
            addCriterion("sellerOrderNo =", value, "sellerorderno");
            return (Criteria) this;
        }

        public Criteria andSellerordernoNotEqualTo(String value) {
            addCriterion("sellerOrderNo <>", value, "sellerorderno");
            return (Criteria) this;
        }

        public Criteria andSellerordernoGreaterThan(String value) {
            addCriterion("sellerOrderNo >", value, "sellerorderno");
            return (Criteria) this;
        }

        public Criteria andSellerordernoGreaterThanOrEqualTo(String value) {
            addCriterion("sellerOrderNo >=", value, "sellerorderno");
            return (Criteria) this;
        }

        public Criteria andSellerordernoLessThan(String value) {
            addCriterion("sellerOrderNo <", value, "sellerorderno");
            return (Criteria) this;
        }

        public Criteria andSellerordernoLessThanOrEqualTo(String value) {
            addCriterion("sellerOrderNo <=", value, "sellerorderno");
            return (Criteria) this;
        }

        public Criteria andSellerordernoLike(String value) {
            addCriterion("sellerOrderNo like", value, "sellerorderno");
            return (Criteria) this;
        }

        public Criteria andSellerordernoNotLike(String value) {
            addCriterion("sellerOrderNo not like", value, "sellerorderno");
            return (Criteria) this;
        }

        public Criteria andSellerordernoIn(List<String> values) {
            addCriterion("sellerOrderNo in", values, "sellerorderno");
            return (Criteria) this;
        }

        public Criteria andSellerordernoNotIn(List<String> values) {
            addCriterion("sellerOrderNo not in", values, "sellerorderno");
            return (Criteria) this;
        }

        public Criteria andSellerordernoBetween(String value1, String value2) {
            addCriterion("sellerOrderNo between", value1, value2, "sellerorderno");
            return (Criteria) this;
        }

        public Criteria andSellerordernoNotBetween(String value1, String value2) {
            addCriterion("sellerOrderNo not between", value1, value2, "sellerorderno");
            return (Criteria) this;
        }

        public Criteria andStatusnameIsNull() {
            addCriterion("statusName is null");
            return (Criteria) this;
        }

        public Criteria andStatusnameIsNotNull() {
            addCriterion("statusName is not null");
            return (Criteria) this;
        }

        public Criteria andStatusnameEqualTo(String value) {
            addCriterion("statusName =", value, "statusname");
            return (Criteria) this;
        }

        public Criteria andStatusnameNotEqualTo(String value) {
            addCriterion("statusName <>", value, "statusname");
            return (Criteria) this;
        }

        public Criteria andStatusnameGreaterThan(String value) {
            addCriterion("statusName >", value, "statusname");
            return (Criteria) this;
        }

        public Criteria andStatusnameGreaterThanOrEqualTo(String value) {
            addCriterion("statusName >=", value, "statusname");
            return (Criteria) this;
        }

        public Criteria andStatusnameLessThan(String value) {
            addCriterion("statusName <", value, "statusname");
            return (Criteria) this;
        }

        public Criteria andStatusnameLessThanOrEqualTo(String value) {
            addCriterion("statusName <=", value, "statusname");
            return (Criteria) this;
        }

        public Criteria andStatusnameLike(String value) {
            addCriterion("statusName like", value, "statusname");
            return (Criteria) this;
        }

        public Criteria andStatusnameNotLike(String value) {
            addCriterion("statusName not like", value, "statusname");
            return (Criteria) this;
        }

        public Criteria andStatusnameIn(List<String> values) {
            addCriterion("statusName in", values, "statusname");
            return (Criteria) this;
        }

        public Criteria andStatusnameNotIn(List<String> values) {
            addCriterion("statusName not in", values, "statusname");
            return (Criteria) this;
        }

        public Criteria andStatusnameBetween(String value1, String value2) {
            addCriterion("statusName between", value1, value2, "statusname");
            return (Criteria) this;
        }

        public Criteria andStatusnameNotBetween(String value1, String value2) {
            addCriterion("statusName not between", value1, value2, "statusname");
            return (Criteria) this;
        }

        public Criteria andWarehouseidIsNull() {
            addCriterion("warehouseId is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseidIsNotNull() {
            addCriterion("warehouseId is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseidEqualTo(Integer value) {
            addCriterion("warehouseId =", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidNotEqualTo(Integer value) {
            addCriterion("warehouseId <>", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidGreaterThan(Integer value) {
            addCriterion("warehouseId >", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidGreaterThanOrEqualTo(Integer value) {
            addCriterion("warehouseId >=", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidLessThan(Integer value) {
            addCriterion("warehouseId <", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidLessThanOrEqualTo(Integer value) {
            addCriterion("warehouseId <=", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidIn(List<Integer> values) {
            addCriterion("warehouseId in", values, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidNotIn(List<Integer> values) {
            addCriterion("warehouseId not in", values, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidBetween(Integer value1, Integer value2) {
            addCriterion("warehouseId between", value1, value2, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidNotBetween(Integer value1, Integer value2) {
            addCriterion("warehouseId not between", value1, value2, "warehouseid");
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