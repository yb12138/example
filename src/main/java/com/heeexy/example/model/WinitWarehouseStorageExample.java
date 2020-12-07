package com.heeexy.example.model;

import java.util.ArrayList;
import java.util.List;

public class WinitWarehouseStorageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WinitWarehouseStorageExample() {
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

        public Criteria andWorehouseidIsNull() {
            addCriterion("worehouseID is null");
            return (Criteria) this;
        }

        public Criteria andWorehouseidIsNotNull() {
            addCriterion("worehouseID is not null");
            return (Criteria) this;
        }

        public Criteria andWorehouseidEqualTo(Long value) {
            addCriterion("worehouseID =", value, "worehouseid");
            return (Criteria) this;
        }

        public Criteria andWorehouseidNotEqualTo(Long value) {
            addCriterion("worehouseID <>", value, "worehouseid");
            return (Criteria) this;
        }

        public Criteria andWorehouseidGreaterThan(Long value) {
            addCriterion("worehouseID >", value, "worehouseid");
            return (Criteria) this;
        }

        public Criteria andWorehouseidGreaterThanOrEqualTo(Long value) {
            addCriterion("worehouseID >=", value, "worehouseid");
            return (Criteria) this;
        }

        public Criteria andWorehouseidLessThan(Long value) {
            addCriterion("worehouseID <", value, "worehouseid");
            return (Criteria) this;
        }

        public Criteria andWorehouseidLessThanOrEqualTo(Long value) {
            addCriterion("worehouseID <=", value, "worehouseid");
            return (Criteria) this;
        }

        public Criteria andWorehouseidIn(List<Long> values) {
            addCriterion("worehouseID in", values, "worehouseid");
            return (Criteria) this;
        }

        public Criteria andWorehouseidNotIn(List<Long> values) {
            addCriterion("worehouseID not in", values, "worehouseid");
            return (Criteria) this;
        }

        public Criteria andWorehouseidBetween(Long value1, Long value2) {
            addCriterion("worehouseID between", value1, value2, "worehouseid");
            return (Criteria) this;
        }

        public Criteria andWorehouseidNotBetween(Long value1, Long value2) {
            addCriterion("worehouseID not between", value1, value2, "worehouseid");
            return (Criteria) this;
        }

        public Criteria andWorehousenameIsNull() {
            addCriterion("worehouseName is null");
            return (Criteria) this;
        }

        public Criteria andWorehousenameIsNotNull() {
            addCriterion("worehouseName is not null");
            return (Criteria) this;
        }

        public Criteria andWorehousenameEqualTo(String value) {
            addCriterion("worehouseName =", value, "worehousename");
            return (Criteria) this;
        }

        public Criteria andWorehousenameNotEqualTo(String value) {
            addCriterion("worehouseName <>", value, "worehousename");
            return (Criteria) this;
        }

        public Criteria andWorehousenameGreaterThan(String value) {
            addCriterion("worehouseName >", value, "worehousename");
            return (Criteria) this;
        }

        public Criteria andWorehousenameGreaterThanOrEqualTo(String value) {
            addCriterion("worehouseName >=", value, "worehousename");
            return (Criteria) this;
        }

        public Criteria andWorehousenameLessThan(String value) {
            addCriterion("worehouseName <", value, "worehousename");
            return (Criteria) this;
        }

        public Criteria andWorehousenameLessThanOrEqualTo(String value) {
            addCriterion("worehouseName <=", value, "worehousename");
            return (Criteria) this;
        }

        public Criteria andWorehousenameLike(String value) {
            addCriterion("worehouseName like", value, "worehousename");
            return (Criteria) this;
        }

        public Criteria andWorehousenameNotLike(String value) {
            addCriterion("worehouseName not like", value, "worehousename");
            return (Criteria) this;
        }

        public Criteria andWorehousenameIn(List<String> values) {
            addCriterion("worehouseName in", values, "worehousename");
            return (Criteria) this;
        }

        public Criteria andWorehousenameNotIn(List<String> values) {
            addCriterion("worehouseName not in", values, "worehousename");
            return (Criteria) this;
        }

        public Criteria andWorehousenameBetween(String value1, String value2) {
            addCriterion("worehouseName between", value1, value2, "worehousename");
            return (Criteria) this;
        }

        public Criteria andWorehousenameNotBetween(String value1, String value2) {
            addCriterion("worehouseName not between", value1, value2, "worehousename");
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

        public Criteria andHeightIsNull() {
            addCriterion("height is null");
            return (Criteria) this;
        }

        public Criteria andHeightIsNotNull() {
            addCriterion("height is not null");
            return (Criteria) this;
        }

        public Criteria andHeightEqualTo(Double value) {
            addCriterion("height =", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotEqualTo(Double value) {
            addCriterion("height <>", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThan(Double value) {
            addCriterion("height >", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThanOrEqualTo(Double value) {
            addCriterion("height >=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThan(Double value) {
            addCriterion("height <", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThanOrEqualTo(Double value) {
            addCriterion("height <=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightIn(List<Double> values) {
            addCriterion("height in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotIn(List<Double> values) {
            addCriterion("height not in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightBetween(Double value1, Double value2) {
            addCriterion("height between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotBetween(Double value1, Double value2) {
            addCriterion("height not between", value1, value2, "height");
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

        public Criteria andQtyavailableIsNull() {
            addCriterion("qtyAvailable is null");
            return (Criteria) this;
        }

        public Criteria andQtyavailableIsNotNull() {
            addCriterion("qtyAvailable is not null");
            return (Criteria) this;
        }

        public Criteria andQtyavailableEqualTo(String value) {
            addCriterion("qtyAvailable =", value, "qtyavailable");
            return (Criteria) this;
        }

        public Criteria andQtyavailableNotEqualTo(String value) {
            addCriterion("qtyAvailable <>", value, "qtyavailable");
            return (Criteria) this;
        }

        public Criteria andQtyavailableGreaterThan(String value) {
            addCriterion("qtyAvailable >", value, "qtyavailable");
            return (Criteria) this;
        }

        public Criteria andQtyavailableGreaterThanOrEqualTo(String value) {
            addCriterion("qtyAvailable >=", value, "qtyavailable");
            return (Criteria) this;
        }

        public Criteria andQtyavailableLessThan(String value) {
            addCriterion("qtyAvailable <", value, "qtyavailable");
            return (Criteria) this;
        }

        public Criteria andQtyavailableLessThanOrEqualTo(String value) {
            addCriterion("qtyAvailable <=", value, "qtyavailable");
            return (Criteria) this;
        }

        public Criteria andQtyavailableLike(String value) {
            addCriterion("qtyAvailable like", value, "qtyavailable");
            return (Criteria) this;
        }

        public Criteria andQtyavailableNotLike(String value) {
            addCriterion("qtyAvailable not like", value, "qtyavailable");
            return (Criteria) this;
        }

        public Criteria andQtyavailableIn(List<String> values) {
            addCriterion("qtyAvailable in", values, "qtyavailable");
            return (Criteria) this;
        }

        public Criteria andQtyavailableNotIn(List<String> values) {
            addCriterion("qtyAvailable not in", values, "qtyavailable");
            return (Criteria) this;
        }

        public Criteria andQtyavailableBetween(String value1, String value2) {
            addCriterion("qtyAvailable between", value1, value2, "qtyavailable");
            return (Criteria) this;
        }

        public Criteria andQtyavailableNotBetween(String value1, String value2) {
            addCriterion("qtyAvailable not between", value1, value2, "qtyavailable");
            return (Criteria) this;
        }

        public Criteria andDoiIsNull() {
            addCriterion("DOI is null");
            return (Criteria) this;
        }

        public Criteria andDoiIsNotNull() {
            addCriterion("DOI is not null");
            return (Criteria) this;
        }

        public Criteria andDoiEqualTo(String value) {
            addCriterion("DOI =", value, "doi");
            return (Criteria) this;
        }

        public Criteria andDoiNotEqualTo(String value) {
            addCriterion("DOI <>", value, "doi");
            return (Criteria) this;
        }

        public Criteria andDoiGreaterThan(String value) {
            addCriterion("DOI >", value, "doi");
            return (Criteria) this;
        }

        public Criteria andDoiGreaterThanOrEqualTo(String value) {
            addCriterion("DOI >=", value, "doi");
            return (Criteria) this;
        }

        public Criteria andDoiLessThan(String value) {
            addCriterion("DOI <", value, "doi");
            return (Criteria) this;
        }

        public Criteria andDoiLessThanOrEqualTo(String value) {
            addCriterion("DOI <=", value, "doi");
            return (Criteria) this;
        }

        public Criteria andDoiLike(String value) {
            addCriterion("DOI like", value, "doi");
            return (Criteria) this;
        }

        public Criteria andDoiNotLike(String value) {
            addCriterion("DOI not like", value, "doi");
            return (Criteria) this;
        }

        public Criteria andDoiIn(List<String> values) {
            addCriterion("DOI in", values, "doi");
            return (Criteria) this;
        }

        public Criteria andDoiNotIn(List<String> values) {
            addCriterion("DOI not in", values, "doi");
            return (Criteria) this;
        }

        public Criteria andDoiBetween(String value1, String value2) {
            addCriterion("DOI between", value1, value2, "doi");
            return (Criteria) this;
        }

        public Criteria andDoiNotBetween(String value1, String value2) {
            addCriterion("DOI not between", value1, value2, "doi");
            return (Criteria) this;
        }

        public Criteria andAveragesalesqty7IsNull() {
            addCriterion("averageSalesQty7 is null");
            return (Criteria) this;
        }

        public Criteria andAveragesalesqty7IsNotNull() {
            addCriterion("averageSalesQty7 is not null");
            return (Criteria) this;
        }

        public Criteria andAveragesalesqty7EqualTo(String value) {
            addCriterion("averageSalesQty7 =", value, "averagesalesqty7");
            return (Criteria) this;
        }

        public Criteria andAveragesalesqty7NotEqualTo(String value) {
            addCriterion("averageSalesQty7 <>", value, "averagesalesqty7");
            return (Criteria) this;
        }

        public Criteria andAveragesalesqty7GreaterThan(String value) {
            addCriterion("averageSalesQty7 >", value, "averagesalesqty7");
            return (Criteria) this;
        }

        public Criteria andAveragesalesqty7GreaterThanOrEqualTo(String value) {
            addCriterion("averageSalesQty7 >=", value, "averagesalesqty7");
            return (Criteria) this;
        }

        public Criteria andAveragesalesqty7LessThan(String value) {
            addCriterion("averageSalesQty7 <", value, "averagesalesqty7");
            return (Criteria) this;
        }

        public Criteria andAveragesalesqty7LessThanOrEqualTo(String value) {
            addCriterion("averageSalesQty7 <=", value, "averagesalesqty7");
            return (Criteria) this;
        }

        public Criteria andAveragesalesqty7Like(String value) {
            addCriterion("averageSalesQty7 like", value, "averagesalesqty7");
            return (Criteria) this;
        }

        public Criteria andAveragesalesqty7NotLike(String value) {
            addCriterion("averageSalesQty7 not like", value, "averagesalesqty7");
            return (Criteria) this;
        }

        public Criteria andAveragesalesqty7In(List<String> values) {
            addCriterion("averageSalesQty7 in", values, "averagesalesqty7");
            return (Criteria) this;
        }

        public Criteria andAveragesalesqty7NotIn(List<String> values) {
            addCriterion("averageSalesQty7 not in", values, "averagesalesqty7");
            return (Criteria) this;
        }

        public Criteria andAveragesalesqty7Between(String value1, String value2) {
            addCriterion("averageSalesQty7 between", value1, value2, "averagesalesqty7");
            return (Criteria) this;
        }

        public Criteria andAveragesalesqty7NotBetween(String value1, String value2) {
            addCriterion("averageSalesQty7 not between", value1, value2, "averagesalesqty7");
            return (Criteria) this;
        }

        public Criteria andAveragesalesqty15IsNull() {
            addCriterion("averageSalesQty15 is null");
            return (Criteria) this;
        }

        public Criteria andAveragesalesqty15IsNotNull() {
            addCriterion("averageSalesQty15 is not null");
            return (Criteria) this;
        }

        public Criteria andAveragesalesqty15EqualTo(String value) {
            addCriterion("averageSalesQty15 =", value, "averagesalesqty15");
            return (Criteria) this;
        }

        public Criteria andAveragesalesqty15NotEqualTo(String value) {
            addCriterion("averageSalesQty15 <>", value, "averagesalesqty15");
            return (Criteria) this;
        }

        public Criteria andAveragesalesqty15GreaterThan(String value) {
            addCriterion("averageSalesQty15 >", value, "averagesalesqty15");
            return (Criteria) this;
        }

        public Criteria andAveragesalesqty15GreaterThanOrEqualTo(String value) {
            addCriterion("averageSalesQty15 >=", value, "averagesalesqty15");
            return (Criteria) this;
        }

        public Criteria andAveragesalesqty15LessThan(String value) {
            addCriterion("averageSalesQty15 <", value, "averagesalesqty15");
            return (Criteria) this;
        }

        public Criteria andAveragesalesqty15LessThanOrEqualTo(String value) {
            addCriterion("averageSalesQty15 <=", value, "averagesalesqty15");
            return (Criteria) this;
        }

        public Criteria andAveragesalesqty15Like(String value) {
            addCriterion("averageSalesQty15 like", value, "averagesalesqty15");
            return (Criteria) this;
        }

        public Criteria andAveragesalesqty15NotLike(String value) {
            addCriterion("averageSalesQty15 not like", value, "averagesalesqty15");
            return (Criteria) this;
        }

        public Criteria andAveragesalesqty15In(List<String> values) {
            addCriterion("averageSalesQty15 in", values, "averagesalesqty15");
            return (Criteria) this;
        }

        public Criteria andAveragesalesqty15NotIn(List<String> values) {
            addCriterion("averageSalesQty15 not in", values, "averagesalesqty15");
            return (Criteria) this;
        }

        public Criteria andAveragesalesqty15Between(String value1, String value2) {
            addCriterion("averageSalesQty15 between", value1, value2, "averagesalesqty15");
            return (Criteria) this;
        }

        public Criteria andAveragesalesqty15NotBetween(String value1, String value2) {
            addCriterion("averageSalesQty15 not between", value1, value2, "averagesalesqty15");
            return (Criteria) this;
        }

        public Criteria andAveragesalesqtyIsNull() {
            addCriterion("averageSalesQty is null");
            return (Criteria) this;
        }

        public Criteria andAveragesalesqtyIsNotNull() {
            addCriterion("averageSalesQty is not null");
            return (Criteria) this;
        }

        public Criteria andAveragesalesqtyEqualTo(String value) {
            addCriterion("averageSalesQty =", value, "averagesalesqty");
            return (Criteria) this;
        }

        public Criteria andAveragesalesqtyNotEqualTo(String value) {
            addCriterion("averageSalesQty <>", value, "averagesalesqty");
            return (Criteria) this;
        }

        public Criteria andAveragesalesqtyGreaterThan(String value) {
            addCriterion("averageSalesQty >", value, "averagesalesqty");
            return (Criteria) this;
        }

        public Criteria andAveragesalesqtyGreaterThanOrEqualTo(String value) {
            addCriterion("averageSalesQty >=", value, "averagesalesqty");
            return (Criteria) this;
        }

        public Criteria andAveragesalesqtyLessThan(String value) {
            addCriterion("averageSalesQty <", value, "averagesalesqty");
            return (Criteria) this;
        }

        public Criteria andAveragesalesqtyLessThanOrEqualTo(String value) {
            addCriterion("averageSalesQty <=", value, "averagesalesqty");
            return (Criteria) this;
        }

        public Criteria andAveragesalesqtyLike(String value) {
            addCriterion("averageSalesQty like", value, "averagesalesqty");
            return (Criteria) this;
        }

        public Criteria andAveragesalesqtyNotLike(String value) {
            addCriterion("averageSalesQty not like", value, "averagesalesqty");
            return (Criteria) this;
        }

        public Criteria andAveragesalesqtyIn(List<String> values) {
            addCriterion("averageSalesQty in", values, "averagesalesqty");
            return (Criteria) this;
        }

        public Criteria andAveragesalesqtyNotIn(List<String> values) {
            addCriterion("averageSalesQty not in", values, "averagesalesqty");
            return (Criteria) this;
        }

        public Criteria andAveragesalesqtyBetween(String value1, String value2) {
            addCriterion("averageSalesQty between", value1, value2, "averagesalesqty");
            return (Criteria) this;
        }

        public Criteria andAveragesalesqtyNotBetween(String value1, String value2) {
            addCriterion("averageSalesQty not between", value1, value2, "averagesalesqty");
            return (Criteria) this;
        }

        public Criteria andQtyorderedIsNull() {
            addCriterion("qtyOrdered is null");
            return (Criteria) this;
        }

        public Criteria andQtyorderedIsNotNull() {
            addCriterion("qtyOrdered is not null");
            return (Criteria) this;
        }

        public Criteria andQtyorderedEqualTo(String value) {
            addCriterion("qtyOrdered =", value, "qtyordered");
            return (Criteria) this;
        }

        public Criteria andQtyorderedNotEqualTo(String value) {
            addCriterion("qtyOrdered <>", value, "qtyordered");
            return (Criteria) this;
        }

        public Criteria andQtyorderedGreaterThan(String value) {
            addCriterion("qtyOrdered >", value, "qtyordered");
            return (Criteria) this;
        }

        public Criteria andQtyorderedGreaterThanOrEqualTo(String value) {
            addCriterion("qtyOrdered >=", value, "qtyordered");
            return (Criteria) this;
        }

        public Criteria andQtyorderedLessThan(String value) {
            addCriterion("qtyOrdered <", value, "qtyordered");
            return (Criteria) this;
        }

        public Criteria andQtyorderedLessThanOrEqualTo(String value) {
            addCriterion("qtyOrdered <=", value, "qtyordered");
            return (Criteria) this;
        }

        public Criteria andQtyorderedLike(String value) {
            addCriterion("qtyOrdered like", value, "qtyordered");
            return (Criteria) this;
        }

        public Criteria andQtyorderedNotLike(String value) {
            addCriterion("qtyOrdered not like", value, "qtyordered");
            return (Criteria) this;
        }

        public Criteria andQtyorderedIn(List<String> values) {
            addCriterion("qtyOrdered in", values, "qtyordered");
            return (Criteria) this;
        }

        public Criteria andQtyorderedNotIn(List<String> values) {
            addCriterion("qtyOrdered not in", values, "qtyordered");
            return (Criteria) this;
        }

        public Criteria andQtyorderedBetween(String value1, String value2) {
            addCriterion("qtyOrdered between", value1, value2, "qtyordered");
            return (Criteria) this;
        }

        public Criteria andQtyorderedNotBetween(String value1, String value2) {
            addCriterion("qtyOrdered not between", value1, value2, "qtyordered");
            return (Criteria) this;
        }

        public Criteria andQtyreservedIsNull() {
            addCriterion("qtyReserved is null");
            return (Criteria) this;
        }

        public Criteria andQtyreservedIsNotNull() {
            addCriterion("qtyReserved is not null");
            return (Criteria) this;
        }

        public Criteria andQtyreservedEqualTo(String value) {
            addCriterion("qtyReserved =", value, "qtyreserved");
            return (Criteria) this;
        }

        public Criteria andQtyreservedNotEqualTo(String value) {
            addCriterion("qtyReserved <>", value, "qtyreserved");
            return (Criteria) this;
        }

        public Criteria andQtyreservedGreaterThan(String value) {
            addCriterion("qtyReserved >", value, "qtyreserved");
            return (Criteria) this;
        }

        public Criteria andQtyreservedGreaterThanOrEqualTo(String value) {
            addCriterion("qtyReserved >=", value, "qtyreserved");
            return (Criteria) this;
        }

        public Criteria andQtyreservedLessThan(String value) {
            addCriterion("qtyReserved <", value, "qtyreserved");
            return (Criteria) this;
        }

        public Criteria andQtyreservedLessThanOrEqualTo(String value) {
            addCriterion("qtyReserved <=", value, "qtyreserved");
            return (Criteria) this;
        }

        public Criteria andQtyreservedLike(String value) {
            addCriterion("qtyReserved like", value, "qtyreserved");
            return (Criteria) this;
        }

        public Criteria andQtyreservedNotLike(String value) {
            addCriterion("qtyReserved not like", value, "qtyreserved");
            return (Criteria) this;
        }

        public Criteria andQtyreservedIn(List<String> values) {
            addCriterion("qtyReserved in", values, "qtyreserved");
            return (Criteria) this;
        }

        public Criteria andQtyreservedNotIn(List<String> values) {
            addCriterion("qtyReserved not in", values, "qtyreserved");
            return (Criteria) this;
        }

        public Criteria andQtyreservedBetween(String value1, String value2) {
            addCriterion("qtyReserved between", value1, value2, "qtyreserved");
            return (Criteria) this;
        }

        public Criteria andQtyreservedNotBetween(String value1, String value2) {
            addCriterion("qtyReserved not between", value1, value2, "qtyreserved");
            return (Criteria) this;
        }

        public Criteria andAvadayIsNull() {
            addCriterion("avaDay is null");
            return (Criteria) this;
        }

        public Criteria andAvadayIsNotNull() {
            addCriterion("avaDay is not null");
            return (Criteria) this;
        }

        public Criteria andAvadayEqualTo(Double value) {
            addCriterion("avaDay =", value, "avaday");
            return (Criteria) this;
        }

        public Criteria andAvadayNotEqualTo(Double value) {
            addCriterion("avaDay <>", value, "avaday");
            return (Criteria) this;
        }

        public Criteria andAvadayGreaterThan(Double value) {
            addCriterion("avaDay >", value, "avaday");
            return (Criteria) this;
        }

        public Criteria andAvadayGreaterThanOrEqualTo(Double value) {
            addCriterion("avaDay >=", value, "avaday");
            return (Criteria) this;
        }

        public Criteria andAvadayLessThan(Double value) {
            addCriterion("avaDay <", value, "avaday");
            return (Criteria) this;
        }

        public Criteria andAvadayLessThanOrEqualTo(Double value) {
            addCriterion("avaDay <=", value, "avaday");
            return (Criteria) this;
        }

        public Criteria andAvadayIn(List<Double> values) {
            addCriterion("avaDay in", values, "avaday");
            return (Criteria) this;
        }

        public Criteria andAvadayNotIn(List<Double> values) {
            addCriterion("avaDay not in", values, "avaday");
            return (Criteria) this;
        }

        public Criteria andAvadayBetween(Double value1, Double value2) {
            addCriterion("avaDay between", value1, value2, "avaday");
            return (Criteria) this;
        }

        public Criteria andAvadayNotBetween(Double value1, Double value2) {
            addCriterion("avaDay not between", value1, value2, "avaday");
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