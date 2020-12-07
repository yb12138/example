package com.heeexy.example.model;

import java.util.ArrayList;
import java.util.List;

public class ProductCountryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductCountryExample() {
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

        public Criteria andPcidIsNull() {
            addCriterion("pcID is null");
            return (Criteria) this;
        }

        public Criteria andPcidIsNotNull() {
            addCriterion("pcID is not null");
            return (Criteria) this;
        }

        public Criteria andPcidEqualTo(Integer value) {
            addCriterion("pcID =", value, "pcid");
            return (Criteria) this;
        }

        public Criteria andPcidNotEqualTo(Integer value) {
            addCriterion("pcID <>", value, "pcid");
            return (Criteria) this;
        }

        public Criteria andPcidGreaterThan(Integer value) {
            addCriterion("pcID >", value, "pcid");
            return (Criteria) this;
        }

        public Criteria andPcidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pcID >=", value, "pcid");
            return (Criteria) this;
        }

        public Criteria andPcidLessThan(Integer value) {
            addCriterion("pcID <", value, "pcid");
            return (Criteria) this;
        }

        public Criteria andPcidLessThanOrEqualTo(Integer value) {
            addCriterion("pcID <=", value, "pcid");
            return (Criteria) this;
        }

        public Criteria andPcidIn(List<Integer> values) {
            addCriterion("pcID in", values, "pcid");
            return (Criteria) this;
        }

        public Criteria andPcidNotIn(List<Integer> values) {
            addCriterion("pcID not in", values, "pcid");
            return (Criteria) this;
        }

        public Criteria andPcidBetween(Integer value1, Integer value2) {
            addCriterion("pcID between", value1, value2, "pcid");
            return (Criteria) this;
        }

        public Criteria andPcidNotBetween(Integer value1, Integer value2) {
            addCriterion("pcID not between", value1, value2, "pcid");
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

        public Criteria andCountrycodeIsNull() {
            addCriterion("countryCode is null");
            return (Criteria) this;
        }

        public Criteria andCountrycodeIsNotNull() {
            addCriterion("countryCode is not null");
            return (Criteria) this;
        }

        public Criteria andCountrycodeEqualTo(String value) {
            addCriterion("countryCode =", value, "countrycode");
            return (Criteria) this;
        }

        public Criteria andCountrycodeNotEqualTo(String value) {
            addCriterion("countryCode <>", value, "countrycode");
            return (Criteria) this;
        }

        public Criteria andCountrycodeGreaterThan(String value) {
            addCriterion("countryCode >", value, "countrycode");
            return (Criteria) this;
        }

        public Criteria andCountrycodeGreaterThanOrEqualTo(String value) {
            addCriterion("countryCode >=", value, "countrycode");
            return (Criteria) this;
        }

        public Criteria andCountrycodeLessThan(String value) {
            addCriterion("countryCode <", value, "countrycode");
            return (Criteria) this;
        }

        public Criteria andCountrycodeLessThanOrEqualTo(String value) {
            addCriterion("countryCode <=", value, "countrycode");
            return (Criteria) this;
        }

        public Criteria andCountrycodeLike(String value) {
            addCriterion("countryCode like", value, "countrycode");
            return (Criteria) this;
        }

        public Criteria andCountrycodeNotLike(String value) {
            addCriterion("countryCode not like", value, "countrycode");
            return (Criteria) this;
        }

        public Criteria andCountrycodeIn(List<String> values) {
            addCriterion("countryCode in", values, "countrycode");
            return (Criteria) this;
        }

        public Criteria andCountrycodeNotIn(List<String> values) {
            addCriterion("countryCode not in", values, "countrycode");
            return (Criteria) this;
        }

        public Criteria andCountrycodeBetween(String value1, String value2) {
            addCriterion("countryCode between", value1, value2, "countrycode");
            return (Criteria) this;
        }

        public Criteria andCountrycodeNotBetween(String value1, String value2) {
            addCriterion("countryCode not between", value1, value2, "countrycode");
            return (Criteria) this;
        }

        public Criteria andProductlengthIsNull() {
            addCriterion("productlength is null");
            return (Criteria) this;
        }

        public Criteria andProductlengthIsNotNull() {
            addCriterion("productlength is not null");
            return (Criteria) this;
        }

        public Criteria andProductlengthEqualTo(Double value) {
            addCriterion("productlength =", value, "productlength");
            return (Criteria) this;
        }

        public Criteria andProductlengthNotEqualTo(Double value) {
            addCriterion("productlength <>", value, "productlength");
            return (Criteria) this;
        }

        public Criteria andProductlengthGreaterThan(Double value) {
            addCriterion("productlength >", value, "productlength");
            return (Criteria) this;
        }

        public Criteria andProductlengthGreaterThanOrEqualTo(Double value) {
            addCriterion("productlength >=", value, "productlength");
            return (Criteria) this;
        }

        public Criteria andProductlengthLessThan(Double value) {
            addCriterion("productlength <", value, "productlength");
            return (Criteria) this;
        }

        public Criteria andProductlengthLessThanOrEqualTo(Double value) {
            addCriterion("productlength <=", value, "productlength");
            return (Criteria) this;
        }

        public Criteria andProductlengthIn(List<Double> values) {
            addCriterion("productlength in", values, "productlength");
            return (Criteria) this;
        }

        public Criteria andProductlengthNotIn(List<Double> values) {
            addCriterion("productlength not in", values, "productlength");
            return (Criteria) this;
        }

        public Criteria andProductlengthBetween(Double value1, Double value2) {
            addCriterion("productlength between", value1, value2, "productlength");
            return (Criteria) this;
        }

        public Criteria andProductlengthNotBetween(Double value1, Double value2) {
            addCriterion("productlength not between", value1, value2, "productlength");
            return (Criteria) this;
        }

        public Criteria andProductwidthIsNull() {
            addCriterion("productwidth is null");
            return (Criteria) this;
        }

        public Criteria andProductwidthIsNotNull() {
            addCriterion("productwidth is not null");
            return (Criteria) this;
        }

        public Criteria andProductwidthEqualTo(Double value) {
            addCriterion("productwidth =", value, "productwidth");
            return (Criteria) this;
        }

        public Criteria andProductwidthNotEqualTo(Double value) {
            addCriterion("productwidth <>", value, "productwidth");
            return (Criteria) this;
        }

        public Criteria andProductwidthGreaterThan(Double value) {
            addCriterion("productwidth >", value, "productwidth");
            return (Criteria) this;
        }

        public Criteria andProductwidthGreaterThanOrEqualTo(Double value) {
            addCriterion("productwidth >=", value, "productwidth");
            return (Criteria) this;
        }

        public Criteria andProductwidthLessThan(Double value) {
            addCriterion("productwidth <", value, "productwidth");
            return (Criteria) this;
        }

        public Criteria andProductwidthLessThanOrEqualTo(Double value) {
            addCriterion("productwidth <=", value, "productwidth");
            return (Criteria) this;
        }

        public Criteria andProductwidthIn(List<Double> values) {
            addCriterion("productwidth in", values, "productwidth");
            return (Criteria) this;
        }

        public Criteria andProductwidthNotIn(List<Double> values) {
            addCriterion("productwidth not in", values, "productwidth");
            return (Criteria) this;
        }

        public Criteria andProductwidthBetween(Double value1, Double value2) {
            addCriterion("productwidth between", value1, value2, "productwidth");
            return (Criteria) this;
        }

        public Criteria andProductwidthNotBetween(Double value1, Double value2) {
            addCriterion("productwidth not between", value1, value2, "productwidth");
            return (Criteria) this;
        }

        public Criteria andProductheightIsNull() {
            addCriterion("productheight is null");
            return (Criteria) this;
        }

        public Criteria andProductheightIsNotNull() {
            addCriterion("productheight is not null");
            return (Criteria) this;
        }

        public Criteria andProductheightEqualTo(Double value) {
            addCriterion("productheight =", value, "productheight");
            return (Criteria) this;
        }

        public Criteria andProductheightNotEqualTo(Double value) {
            addCriterion("productheight <>", value, "productheight");
            return (Criteria) this;
        }

        public Criteria andProductheightGreaterThan(Double value) {
            addCriterion("productheight >", value, "productheight");
            return (Criteria) this;
        }

        public Criteria andProductheightGreaterThanOrEqualTo(Double value) {
            addCriterion("productheight >=", value, "productheight");
            return (Criteria) this;
        }

        public Criteria andProductheightLessThan(Double value) {
            addCriterion("productheight <", value, "productheight");
            return (Criteria) this;
        }

        public Criteria andProductheightLessThanOrEqualTo(Double value) {
            addCriterion("productheight <=", value, "productheight");
            return (Criteria) this;
        }

        public Criteria andProductheightIn(List<Double> values) {
            addCriterion("productheight in", values, "productheight");
            return (Criteria) this;
        }

        public Criteria andProductheightNotIn(List<Double> values) {
            addCriterion("productheight not in", values, "productheight");
            return (Criteria) this;
        }

        public Criteria andProductheightBetween(Double value1, Double value2) {
            addCriterion("productheight between", value1, value2, "productheight");
            return (Criteria) this;
        }

        public Criteria andProductheightNotBetween(Double value1, Double value2) {
            addCriterion("productheight not between", value1, value2, "productheight");
            return (Criteria) this;
        }

        public Criteria andImportpriceIsNull() {
            addCriterion("importPrice is null");
            return (Criteria) this;
        }

        public Criteria andImportpriceIsNotNull() {
            addCriterion("importPrice is not null");
            return (Criteria) this;
        }

        public Criteria andImportpriceEqualTo(Double value) {
            addCriterion("importPrice =", value, "importprice");
            return (Criteria) this;
        }

        public Criteria andImportpriceNotEqualTo(Double value) {
            addCriterion("importPrice <>", value, "importprice");
            return (Criteria) this;
        }

        public Criteria andImportpriceGreaterThan(Double value) {
            addCriterion("importPrice >", value, "importprice");
            return (Criteria) this;
        }

        public Criteria andImportpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("importPrice >=", value, "importprice");
            return (Criteria) this;
        }

        public Criteria andImportpriceLessThan(Double value) {
            addCriterion("importPrice <", value, "importprice");
            return (Criteria) this;
        }

        public Criteria andImportpriceLessThanOrEqualTo(Double value) {
            addCriterion("importPrice <=", value, "importprice");
            return (Criteria) this;
        }

        public Criteria andImportpriceIn(List<Double> values) {
            addCriterion("importPrice in", values, "importprice");
            return (Criteria) this;
        }

        public Criteria andImportpriceNotIn(List<Double> values) {
            addCriterion("importPrice not in", values, "importprice");
            return (Criteria) this;
        }

        public Criteria andImportpriceBetween(Double value1, Double value2) {
            addCriterion("importPrice between", value1, value2, "importprice");
            return (Criteria) this;
        }

        public Criteria andImportpriceNotBetween(Double value1, Double value2) {
            addCriterion("importPrice not between", value1, value2, "importprice");
            return (Criteria) this;
        }

        public Criteria andExportpriceIsNull() {
            addCriterion("exportPrice is null");
            return (Criteria) this;
        }

        public Criteria andExportpriceIsNotNull() {
            addCriterion("exportPrice is not null");
            return (Criteria) this;
        }

        public Criteria andExportpriceEqualTo(Double value) {
            addCriterion("exportPrice =", value, "exportprice");
            return (Criteria) this;
        }

        public Criteria andExportpriceNotEqualTo(Double value) {
            addCriterion("exportPrice <>", value, "exportprice");
            return (Criteria) this;
        }

        public Criteria andExportpriceGreaterThan(Double value) {
            addCriterion("exportPrice >", value, "exportprice");
            return (Criteria) this;
        }

        public Criteria andExportpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("exportPrice >=", value, "exportprice");
            return (Criteria) this;
        }

        public Criteria andExportpriceLessThan(Double value) {
            addCriterion("exportPrice <", value, "exportprice");
            return (Criteria) this;
        }

        public Criteria andExportpriceLessThanOrEqualTo(Double value) {
            addCriterion("exportPrice <=", value, "exportprice");
            return (Criteria) this;
        }

        public Criteria andExportpriceIn(List<Double> values) {
            addCriterion("exportPrice in", values, "exportprice");
            return (Criteria) this;
        }

        public Criteria andExportpriceNotIn(List<Double> values) {
            addCriterion("exportPrice not in", values, "exportprice");
            return (Criteria) this;
        }

        public Criteria andExportpriceBetween(Double value1, Double value2) {
            addCriterion("exportPrice between", value1, value2, "exportprice");
            return (Criteria) this;
        }

        public Criteria andExportpriceNotBetween(Double value1, Double value2) {
            addCriterion("exportPrice not between", value1, value2, "exportprice");
            return (Criteria) this;
        }

        public Criteria andVolumeIsNull() {
            addCriterion("volume is null");
            return (Criteria) this;
        }

        public Criteria andVolumeIsNotNull() {
            addCriterion("volume is not null");
            return (Criteria) this;
        }

        public Criteria andVolumeEqualTo(Double value) {
            addCriterion("volume =", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotEqualTo(Double value) {
            addCriterion("volume <>", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThan(Double value) {
            addCriterion("volume >", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThanOrEqualTo(Double value) {
            addCriterion("volume >=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThan(Double value) {
            addCriterion("volume <", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThanOrEqualTo(Double value) {
            addCriterion("volume <=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeIn(List<Double> values) {
            addCriterion("volume in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotIn(List<Double> values) {
            addCriterion("volume not in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeBetween(Double value1, Double value2) {
            addCriterion("volume between", value1, value2, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotBetween(Double value1, Double value2) {
            addCriterion("volume not between", value1, value2, "volume");
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

        public Criteria andRebaterateIsNull() {
            addCriterion("rebateRate is null");
            return (Criteria) this;
        }

        public Criteria andRebaterateIsNotNull() {
            addCriterion("rebateRate is not null");
            return (Criteria) this;
        }

        public Criteria andRebaterateEqualTo(Double value) {
            addCriterion("rebateRate =", value, "rebaterate");
            return (Criteria) this;
        }

        public Criteria andRebaterateNotEqualTo(Double value) {
            addCriterion("rebateRate <>", value, "rebaterate");
            return (Criteria) this;
        }

        public Criteria andRebaterateGreaterThan(Double value) {
            addCriterion("rebateRate >", value, "rebaterate");
            return (Criteria) this;
        }

        public Criteria andRebaterateGreaterThanOrEqualTo(Double value) {
            addCriterion("rebateRate >=", value, "rebaterate");
            return (Criteria) this;
        }

        public Criteria andRebaterateLessThan(Double value) {
            addCriterion("rebateRate <", value, "rebaterate");
            return (Criteria) this;
        }

        public Criteria andRebaterateLessThanOrEqualTo(Double value) {
            addCriterion("rebateRate <=", value, "rebaterate");
            return (Criteria) this;
        }

        public Criteria andRebaterateIn(List<Double> values) {
            addCriterion("rebateRate in", values, "rebaterate");
            return (Criteria) this;
        }

        public Criteria andRebaterateNotIn(List<Double> values) {
            addCriterion("rebateRate not in", values, "rebaterate");
            return (Criteria) this;
        }

        public Criteria andRebaterateBetween(Double value1, Double value2) {
            addCriterion("rebateRate between", value1, value2, "rebaterate");
            return (Criteria) this;
        }

        public Criteria andRebaterateNotBetween(Double value1, Double value2) {
            addCriterion("rebateRate not between", value1, value2, "rebaterate");
            return (Criteria) this;
        }

        public Criteria andImportrateIsNull() {
            addCriterion("importRate is null");
            return (Criteria) this;
        }

        public Criteria andImportrateIsNotNull() {
            addCriterion("importRate is not null");
            return (Criteria) this;
        }

        public Criteria andImportrateEqualTo(Double value) {
            addCriterion("importRate =", value, "importrate");
            return (Criteria) this;
        }

        public Criteria andImportrateNotEqualTo(Double value) {
            addCriterion("importRate <>", value, "importrate");
            return (Criteria) this;
        }

        public Criteria andImportrateGreaterThan(Double value) {
            addCriterion("importRate >", value, "importrate");
            return (Criteria) this;
        }

        public Criteria andImportrateGreaterThanOrEqualTo(Double value) {
            addCriterion("importRate >=", value, "importrate");
            return (Criteria) this;
        }

        public Criteria andImportrateLessThan(Double value) {
            addCriterion("importRate <", value, "importrate");
            return (Criteria) this;
        }

        public Criteria andImportrateLessThanOrEqualTo(Double value) {
            addCriterion("importRate <=", value, "importrate");
            return (Criteria) this;
        }

        public Criteria andImportrateIn(List<Double> values) {
            addCriterion("importRate in", values, "importrate");
            return (Criteria) this;
        }

        public Criteria andImportrateNotIn(List<Double> values) {
            addCriterion("importRate not in", values, "importrate");
            return (Criteria) this;
        }

        public Criteria andImportrateBetween(Double value1, Double value2) {
            addCriterion("importRate between", value1, value2, "importrate");
            return (Criteria) this;
        }

        public Criteria andImportrateNotBetween(Double value1, Double value2) {
            addCriterion("importRate not between", value1, value2, "importrate");
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