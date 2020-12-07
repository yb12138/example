package com.heeexy.example.model;

import java.util.ArrayList;
import java.util.List;

public class ProductNewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductNewExample() {
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

        public Criteria andLinkurl1IsNull() {
            addCriterion("linkURL1 is null");
            return (Criteria) this;
        }

        public Criteria andLinkurl1IsNotNull() {
            addCriterion("linkURL1 is not null");
            return (Criteria) this;
        }

        public Criteria andLinkurl1EqualTo(String value) {
            addCriterion("linkURL1 =", value, "linkurl1");
            return (Criteria) this;
        }

        public Criteria andLinkurl1NotEqualTo(String value) {
            addCriterion("linkURL1 <>", value, "linkurl1");
            return (Criteria) this;
        }

        public Criteria andLinkurl1GreaterThan(String value) {
            addCriterion("linkURL1 >", value, "linkurl1");
            return (Criteria) this;
        }

        public Criteria andLinkurl1GreaterThanOrEqualTo(String value) {
            addCriterion("linkURL1 >=", value, "linkurl1");
            return (Criteria) this;
        }

        public Criteria andLinkurl1LessThan(String value) {
            addCriterion("linkURL1 <", value, "linkurl1");
            return (Criteria) this;
        }

        public Criteria andLinkurl1LessThanOrEqualTo(String value) {
            addCriterion("linkURL1 <=", value, "linkurl1");
            return (Criteria) this;
        }

        public Criteria andLinkurl1Like(String value) {
            addCriterion("linkURL1 like", value, "linkurl1");
            return (Criteria) this;
        }

        public Criteria andLinkurl1NotLike(String value) {
            addCriterion("linkURL1 not like", value, "linkurl1");
            return (Criteria) this;
        }

        public Criteria andLinkurl1In(List<String> values) {
            addCriterion("linkURL1 in", values, "linkurl1");
            return (Criteria) this;
        }

        public Criteria andLinkurl1NotIn(List<String> values) {
            addCriterion("linkURL1 not in", values, "linkurl1");
            return (Criteria) this;
        }

        public Criteria andLinkurl1Between(String value1, String value2) {
            addCriterion("linkURL1 between", value1, value2, "linkurl1");
            return (Criteria) this;
        }

        public Criteria andLinkurl1NotBetween(String value1, String value2) {
            addCriterion("linkURL1 not between", value1, value2, "linkurl1");
            return (Criteria) this;
        }

        public Criteria andLinkurl2IsNull() {
            addCriterion("linkURL2 is null");
            return (Criteria) this;
        }

        public Criteria andLinkurl2IsNotNull() {
            addCriterion("linkURL2 is not null");
            return (Criteria) this;
        }

        public Criteria andLinkurl2EqualTo(String value) {
            addCriterion("linkURL2 =", value, "linkurl2");
            return (Criteria) this;
        }

        public Criteria andLinkurl2NotEqualTo(String value) {
            addCriterion("linkURL2 <>", value, "linkurl2");
            return (Criteria) this;
        }

        public Criteria andLinkurl2GreaterThan(String value) {
            addCriterion("linkURL2 >", value, "linkurl2");
            return (Criteria) this;
        }

        public Criteria andLinkurl2GreaterThanOrEqualTo(String value) {
            addCriterion("linkURL2 >=", value, "linkurl2");
            return (Criteria) this;
        }

        public Criteria andLinkurl2LessThan(String value) {
            addCriterion("linkURL2 <", value, "linkurl2");
            return (Criteria) this;
        }

        public Criteria andLinkurl2LessThanOrEqualTo(String value) {
            addCriterion("linkURL2 <=", value, "linkurl2");
            return (Criteria) this;
        }

        public Criteria andLinkurl2Like(String value) {
            addCriterion("linkURL2 like", value, "linkurl2");
            return (Criteria) this;
        }

        public Criteria andLinkurl2NotLike(String value) {
            addCriterion("linkURL2 not like", value, "linkurl2");
            return (Criteria) this;
        }

        public Criteria andLinkurl2In(List<String> values) {
            addCriterion("linkURL2 in", values, "linkurl2");
            return (Criteria) this;
        }

        public Criteria andLinkurl2NotIn(List<String> values) {
            addCriterion("linkURL2 not in", values, "linkurl2");
            return (Criteria) this;
        }

        public Criteria andLinkurl2Between(String value1, String value2) {
            addCriterion("linkURL2 between", value1, value2, "linkurl2");
            return (Criteria) this;
        }

        public Criteria andLinkurl2NotBetween(String value1, String value2) {
            addCriterion("linkURL2 not between", value1, value2, "linkurl2");
            return (Criteria) this;
        }

        public Criteria andWidthIsNull() {
            addCriterion("width is null");
            return (Criteria) this;
        }

        public Criteria andWidthIsNotNull() {
            addCriterion("width is not null");
            return (Criteria) this;
        }

        public Criteria andWidthEqualTo(Double value) {
            addCriterion("width =", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotEqualTo(Double value) {
            addCriterion("width <>", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthGreaterThan(Double value) {
            addCriterion("width >", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthGreaterThanOrEqualTo(Double value) {
            addCriterion("width >=", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthLessThan(Double value) {
            addCriterion("width <", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthLessThanOrEqualTo(Double value) {
            addCriterion("width <=", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthIn(List<Double> values) {
            addCriterion("width in", values, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotIn(List<Double> values) {
            addCriterion("width not in", values, "width");
            return (Criteria) this;
        }

        public Criteria andWidthBetween(Double value1, Double value2) {
            addCriterion("width between", value1, value2, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotBetween(Double value1, Double value2) {
            addCriterion("width not between", value1, value2, "width");
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

        public Criteria andLengthIsNull() {
            addCriterion("length is null");
            return (Criteria) this;
        }

        public Criteria andLengthIsNotNull() {
            addCriterion("length is not null");
            return (Criteria) this;
        }

        public Criteria andLengthEqualTo(Double value) {
            addCriterion("length =", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotEqualTo(Double value) {
            addCriterion("length <>", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthGreaterThan(Double value) {
            addCriterion("length >", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthGreaterThanOrEqualTo(Double value) {
            addCriterion("length >=", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthLessThan(Double value) {
            addCriterion("length <", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthLessThanOrEqualTo(Double value) {
            addCriterion("length <=", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthIn(List<Double> values) {
            addCriterion("length in", values, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotIn(List<Double> values) {
            addCriterion("length not in", values, "length");
            return (Criteria) this;
        }

        public Criteria andLengthBetween(Double value1, Double value2) {
            addCriterion("length between", value1, value2, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotBetween(Double value1, Double value2) {
            addCriterion("length not between", value1, value2, "length");
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

        public Criteria andImgurl1IsNull() {
            addCriterion("imgURL1 is null");
            return (Criteria) this;
        }

        public Criteria andImgurl1IsNotNull() {
            addCriterion("imgURL1 is not null");
            return (Criteria) this;
        }

        public Criteria andImgurl1EqualTo(String value) {
            addCriterion("imgURL1 =", value, "imgurl1");
            return (Criteria) this;
        }

        public Criteria andImgurl1NotEqualTo(String value) {
            addCriterion("imgURL1 <>", value, "imgurl1");
            return (Criteria) this;
        }

        public Criteria andImgurl1GreaterThan(String value) {
            addCriterion("imgURL1 >", value, "imgurl1");
            return (Criteria) this;
        }

        public Criteria andImgurl1GreaterThanOrEqualTo(String value) {
            addCriterion("imgURL1 >=", value, "imgurl1");
            return (Criteria) this;
        }

        public Criteria andImgurl1LessThan(String value) {
            addCriterion("imgURL1 <", value, "imgurl1");
            return (Criteria) this;
        }

        public Criteria andImgurl1LessThanOrEqualTo(String value) {
            addCriterion("imgURL1 <=", value, "imgurl1");
            return (Criteria) this;
        }

        public Criteria andImgurl1Like(String value) {
            addCriterion("imgURL1 like", value, "imgurl1");
            return (Criteria) this;
        }

        public Criteria andImgurl1NotLike(String value) {
            addCriterion("imgURL1 not like", value, "imgurl1");
            return (Criteria) this;
        }

        public Criteria andImgurl1In(List<String> values) {
            addCriterion("imgURL1 in", values, "imgurl1");
            return (Criteria) this;
        }

        public Criteria andImgurl1NotIn(List<String> values) {
            addCriterion("imgURL1 not in", values, "imgurl1");
            return (Criteria) this;
        }

        public Criteria andImgurl1Between(String value1, String value2) {
            addCriterion("imgURL1 between", value1, value2, "imgurl1");
            return (Criteria) this;
        }

        public Criteria andImgurl1NotBetween(String value1, String value2) {
            addCriterion("imgURL1 not between", value1, value2, "imgurl1");
            return (Criteria) this;
        }

        public Criteria andImgurl2IsNull() {
            addCriterion("imgURL2 is null");
            return (Criteria) this;
        }

        public Criteria andImgurl2IsNotNull() {
            addCriterion("imgURL2 is not null");
            return (Criteria) this;
        }

        public Criteria andImgurl2EqualTo(String value) {
            addCriterion("imgURL2 =", value, "imgurl2");
            return (Criteria) this;
        }

        public Criteria andImgurl2NotEqualTo(String value) {
            addCriterion("imgURL2 <>", value, "imgurl2");
            return (Criteria) this;
        }

        public Criteria andImgurl2GreaterThan(String value) {
            addCriterion("imgURL2 >", value, "imgurl2");
            return (Criteria) this;
        }

        public Criteria andImgurl2GreaterThanOrEqualTo(String value) {
            addCriterion("imgURL2 >=", value, "imgurl2");
            return (Criteria) this;
        }

        public Criteria andImgurl2LessThan(String value) {
            addCriterion("imgURL2 <", value, "imgurl2");
            return (Criteria) this;
        }

        public Criteria andImgurl2LessThanOrEqualTo(String value) {
            addCriterion("imgURL2 <=", value, "imgurl2");
            return (Criteria) this;
        }

        public Criteria andImgurl2Like(String value) {
            addCriterion("imgURL2 like", value, "imgurl2");
            return (Criteria) this;
        }

        public Criteria andImgurl2NotLike(String value) {
            addCriterion("imgURL2 not like", value, "imgurl2");
            return (Criteria) this;
        }

        public Criteria andImgurl2In(List<String> values) {
            addCriterion("imgURL2 in", values, "imgurl2");
            return (Criteria) this;
        }

        public Criteria andImgurl2NotIn(List<String> values) {
            addCriterion("imgURL2 not in", values, "imgurl2");
            return (Criteria) this;
        }

        public Criteria andImgurl2Between(String value1, String value2) {
            addCriterion("imgURL2 between", value1, value2, "imgurl2");
            return (Criteria) this;
        }

        public Criteria andImgurl2NotBetween(String value1, String value2) {
            addCriterion("imgURL2 not between", value1, value2, "imgurl2");
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

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andOperatestatusIsNull() {
            addCriterion("operateStatus is null");
            return (Criteria) this;
        }

        public Criteria andOperatestatusIsNotNull() {
            addCriterion("operateStatus is not null");
            return (Criteria) this;
        }

        public Criteria andOperatestatusEqualTo(Integer value) {
            addCriterion("operateStatus =", value, "operatestatus");
            return (Criteria) this;
        }

        public Criteria andOperatestatusNotEqualTo(Integer value) {
            addCriterion("operateStatus <>", value, "operatestatus");
            return (Criteria) this;
        }

        public Criteria andOperatestatusGreaterThan(Integer value) {
            addCriterion("operateStatus >", value, "operatestatus");
            return (Criteria) this;
        }

        public Criteria andOperatestatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("operateStatus >=", value, "operatestatus");
            return (Criteria) this;
        }

        public Criteria andOperatestatusLessThan(Integer value) {
            addCriterion("operateStatus <", value, "operatestatus");
            return (Criteria) this;
        }

        public Criteria andOperatestatusLessThanOrEqualTo(Integer value) {
            addCriterion("operateStatus <=", value, "operatestatus");
            return (Criteria) this;
        }

        public Criteria andOperatestatusIn(List<Integer> values) {
            addCriterion("operateStatus in", values, "operatestatus");
            return (Criteria) this;
        }

        public Criteria andOperatestatusNotIn(List<Integer> values) {
            addCriterion("operateStatus not in", values, "operatestatus");
            return (Criteria) this;
        }

        public Criteria andOperatestatusBetween(Integer value1, Integer value2) {
            addCriterion("operateStatus between", value1, value2, "operatestatus");
            return (Criteria) this;
        }

        public Criteria andOperatestatusNotBetween(Integer value1, Integer value2) {
            addCriterion("operateStatus not between", value1, value2, "operatestatus");
            return (Criteria) this;
        }

        public Criteria andOpplinkUkIsNull() {
            addCriterion("opplink_UK is null");
            return (Criteria) this;
        }

        public Criteria andOpplinkUkIsNotNull() {
            addCriterion("opplink_UK is not null");
            return (Criteria) this;
        }

        public Criteria andOpplinkUkEqualTo(String value) {
            addCriterion("opplink_UK =", value, "opplinkUk");
            return (Criteria) this;
        }

        public Criteria andOpplinkUkNotEqualTo(String value) {
            addCriterion("opplink_UK <>", value, "opplinkUk");
            return (Criteria) this;
        }

        public Criteria andOpplinkUkGreaterThan(String value) {
            addCriterion("opplink_UK >", value, "opplinkUk");
            return (Criteria) this;
        }

        public Criteria andOpplinkUkGreaterThanOrEqualTo(String value) {
            addCriterion("opplink_UK >=", value, "opplinkUk");
            return (Criteria) this;
        }

        public Criteria andOpplinkUkLessThan(String value) {
            addCriterion("opplink_UK <", value, "opplinkUk");
            return (Criteria) this;
        }

        public Criteria andOpplinkUkLessThanOrEqualTo(String value) {
            addCriterion("opplink_UK <=", value, "opplinkUk");
            return (Criteria) this;
        }

        public Criteria andOpplinkUkLike(String value) {
            addCriterion("opplink_UK like", value, "opplinkUk");
            return (Criteria) this;
        }

        public Criteria andOpplinkUkNotLike(String value) {
            addCriterion("opplink_UK not like", value, "opplinkUk");
            return (Criteria) this;
        }

        public Criteria andOpplinkUkIn(List<String> values) {
            addCriterion("opplink_UK in", values, "opplinkUk");
            return (Criteria) this;
        }

        public Criteria andOpplinkUkNotIn(List<String> values) {
            addCriterion("opplink_UK not in", values, "opplinkUk");
            return (Criteria) this;
        }

        public Criteria andOpplinkUkBetween(String value1, String value2) {
            addCriterion("opplink_UK between", value1, value2, "opplinkUk");
            return (Criteria) this;
        }

        public Criteria andOpplinkUkNotBetween(String value1, String value2) {
            addCriterion("opplink_UK not between", value1, value2, "opplinkUk");
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

        public Criteria andDelivertimeIsNull() {
            addCriterion("deliverTime is null");
            return (Criteria) this;
        }

        public Criteria andDelivertimeIsNotNull() {
            addCriterion("deliverTime is not null");
            return (Criteria) this;
        }

        public Criteria andDelivertimeEqualTo(Integer value) {
            addCriterion("deliverTime =", value, "delivertime");
            return (Criteria) this;
        }

        public Criteria andDelivertimeNotEqualTo(Integer value) {
            addCriterion("deliverTime <>", value, "delivertime");
            return (Criteria) this;
        }

        public Criteria andDelivertimeGreaterThan(Integer value) {
            addCriterion("deliverTime >", value, "delivertime");
            return (Criteria) this;
        }

        public Criteria andDelivertimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("deliverTime >=", value, "delivertime");
            return (Criteria) this;
        }

        public Criteria andDelivertimeLessThan(Integer value) {
            addCriterion("deliverTime <", value, "delivertime");
            return (Criteria) this;
        }

        public Criteria andDelivertimeLessThanOrEqualTo(Integer value) {
            addCriterion("deliverTime <=", value, "delivertime");
            return (Criteria) this;
        }

        public Criteria andDelivertimeIn(List<Integer> values) {
            addCriterion("deliverTime in", values, "delivertime");
            return (Criteria) this;
        }

        public Criteria andDelivertimeNotIn(List<Integer> values) {
            addCriterion("deliverTime not in", values, "delivertime");
            return (Criteria) this;
        }

        public Criteria andDelivertimeBetween(Integer value1, Integer value2) {
            addCriterion("deliverTime between", value1, value2, "delivertime");
            return (Criteria) this;
        }

        public Criteria andDelivertimeNotBetween(Integer value1, Integer value2) {
            addCriterion("deliverTime not between", value1, value2, "delivertime");
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

        public Criteria andExceptsellUkIsNull() {
            addCriterion("exceptSell_UK is null");
            return (Criteria) this;
        }

        public Criteria andExceptsellUkIsNotNull() {
            addCriterion("exceptSell_UK is not null");
            return (Criteria) this;
        }

        public Criteria andExceptsellUkEqualTo(Double value) {
            addCriterion("exceptSell_UK =", value, "exceptsellUk");
            return (Criteria) this;
        }

        public Criteria andExceptsellUkNotEqualTo(Double value) {
            addCriterion("exceptSell_UK <>", value, "exceptsellUk");
            return (Criteria) this;
        }

        public Criteria andExceptsellUkGreaterThan(Double value) {
            addCriterion("exceptSell_UK >", value, "exceptsellUk");
            return (Criteria) this;
        }

        public Criteria andExceptsellUkGreaterThanOrEqualTo(Double value) {
            addCriterion("exceptSell_UK >=", value, "exceptsellUk");
            return (Criteria) this;
        }

        public Criteria andExceptsellUkLessThan(Double value) {
            addCriterion("exceptSell_UK <", value, "exceptsellUk");
            return (Criteria) this;
        }

        public Criteria andExceptsellUkLessThanOrEqualTo(Double value) {
            addCriterion("exceptSell_UK <=", value, "exceptsellUk");
            return (Criteria) this;
        }

        public Criteria andExceptsellUkIn(List<Double> values) {
            addCriterion("exceptSell_UK in", values, "exceptsellUk");
            return (Criteria) this;
        }

        public Criteria andExceptsellUkNotIn(List<Double> values) {
            addCriterion("exceptSell_UK not in", values, "exceptsellUk");
            return (Criteria) this;
        }

        public Criteria andExceptsellUkBetween(Double value1, Double value2) {
            addCriterion("exceptSell_UK between", value1, value2, "exceptsellUk");
            return (Criteria) this;
        }

        public Criteria andExceptsellUkNotBetween(Double value1, Double value2) {
            addCriterion("exceptSell_UK not between", value1, value2, "exceptsellUk");
            return (Criteria) this;
        }

        public Criteria andProfitrateUkIsNull() {
            addCriterion("profitrate_UK is null");
            return (Criteria) this;
        }

        public Criteria andProfitrateUkIsNotNull() {
            addCriterion("profitrate_UK is not null");
            return (Criteria) this;
        }

        public Criteria andProfitrateUkEqualTo(String value) {
            addCriterion("profitrate_UK =", value, "profitrateUk");
            return (Criteria) this;
        }

        public Criteria andProfitrateUkNotEqualTo(String value) {
            addCriterion("profitrate_UK <>", value, "profitrateUk");
            return (Criteria) this;
        }

        public Criteria andProfitrateUkGreaterThan(String value) {
            addCriterion("profitrate_UK >", value, "profitrateUk");
            return (Criteria) this;
        }

        public Criteria andProfitrateUkGreaterThanOrEqualTo(String value) {
            addCriterion("profitrate_UK >=", value, "profitrateUk");
            return (Criteria) this;
        }

        public Criteria andProfitrateUkLessThan(String value) {
            addCriterion("profitrate_UK <", value, "profitrateUk");
            return (Criteria) this;
        }

        public Criteria andProfitrateUkLessThanOrEqualTo(String value) {
            addCriterion("profitrate_UK <=", value, "profitrateUk");
            return (Criteria) this;
        }

        public Criteria andProfitrateUkLike(String value) {
            addCriterion("profitrate_UK like", value, "profitrateUk");
            return (Criteria) this;
        }

        public Criteria andProfitrateUkNotLike(String value) {
            addCriterion("profitrate_UK not like", value, "profitrateUk");
            return (Criteria) this;
        }

        public Criteria andProfitrateUkIn(List<String> values) {
            addCriterion("profitrate_UK in", values, "profitrateUk");
            return (Criteria) this;
        }

        public Criteria andProfitrateUkNotIn(List<String> values) {
            addCriterion("profitrate_UK not in", values, "profitrateUk");
            return (Criteria) this;
        }

        public Criteria andProfitrateUkBetween(String value1, String value2) {
            addCriterion("profitrate_UK between", value1, value2, "profitrateUk");
            return (Criteria) this;
        }

        public Criteria andProfitrateUkNotBetween(String value1, String value2) {
            addCriterion("profitrate_UK not between", value1, value2, "profitrateUk");
            return (Criteria) this;
        }

        public Criteria andExceptsellDeIsNull() {
            addCriterion("exceptSell_DE is null");
            return (Criteria) this;
        }

        public Criteria andExceptsellDeIsNotNull() {
            addCriterion("exceptSell_DE is not null");
            return (Criteria) this;
        }

        public Criteria andExceptsellDeEqualTo(Double value) {
            addCriterion("exceptSell_DE =", value, "exceptsellDe");
            return (Criteria) this;
        }

        public Criteria andExceptsellDeNotEqualTo(Double value) {
            addCriterion("exceptSell_DE <>", value, "exceptsellDe");
            return (Criteria) this;
        }

        public Criteria andExceptsellDeGreaterThan(Double value) {
            addCriterion("exceptSell_DE >", value, "exceptsellDe");
            return (Criteria) this;
        }

        public Criteria andExceptsellDeGreaterThanOrEqualTo(Double value) {
            addCriterion("exceptSell_DE >=", value, "exceptsellDe");
            return (Criteria) this;
        }

        public Criteria andExceptsellDeLessThan(Double value) {
            addCriterion("exceptSell_DE <", value, "exceptsellDe");
            return (Criteria) this;
        }

        public Criteria andExceptsellDeLessThanOrEqualTo(Double value) {
            addCriterion("exceptSell_DE <=", value, "exceptsellDe");
            return (Criteria) this;
        }

        public Criteria andExceptsellDeIn(List<Double> values) {
            addCriterion("exceptSell_DE in", values, "exceptsellDe");
            return (Criteria) this;
        }

        public Criteria andExceptsellDeNotIn(List<Double> values) {
            addCriterion("exceptSell_DE not in", values, "exceptsellDe");
            return (Criteria) this;
        }

        public Criteria andExceptsellDeBetween(Double value1, Double value2) {
            addCriterion("exceptSell_DE between", value1, value2, "exceptsellDe");
            return (Criteria) this;
        }

        public Criteria andExceptsellDeNotBetween(Double value1, Double value2) {
            addCriterion("exceptSell_DE not between", value1, value2, "exceptsellDe");
            return (Criteria) this;
        }

        public Criteria andProfitrateDeIsNull() {
            addCriterion("profitrate_DE is null");
            return (Criteria) this;
        }

        public Criteria andProfitrateDeIsNotNull() {
            addCriterion("profitrate_DE is not null");
            return (Criteria) this;
        }

        public Criteria andProfitrateDeEqualTo(Double value) {
            addCriterion("profitrate_DE =", value, "profitrateDe");
            return (Criteria) this;
        }

        public Criteria andProfitrateDeNotEqualTo(Double value) {
            addCriterion("profitrate_DE <>", value, "profitrateDe");
            return (Criteria) this;
        }

        public Criteria andProfitrateDeGreaterThan(Double value) {
            addCriterion("profitrate_DE >", value, "profitrateDe");
            return (Criteria) this;
        }

        public Criteria andProfitrateDeGreaterThanOrEqualTo(Double value) {
            addCriterion("profitrate_DE >=", value, "profitrateDe");
            return (Criteria) this;
        }

        public Criteria andProfitrateDeLessThan(Double value) {
            addCriterion("profitrate_DE <", value, "profitrateDe");
            return (Criteria) this;
        }

        public Criteria andProfitrateDeLessThanOrEqualTo(Double value) {
            addCriterion("profitrate_DE <=", value, "profitrateDe");
            return (Criteria) this;
        }

        public Criteria andProfitrateDeIn(List<Double> values) {
            addCriterion("profitrate_DE in", values, "profitrateDe");
            return (Criteria) this;
        }

        public Criteria andProfitrateDeNotIn(List<Double> values) {
            addCriterion("profitrate_DE not in", values, "profitrateDe");
            return (Criteria) this;
        }

        public Criteria andProfitrateDeBetween(Double value1, Double value2) {
            addCriterion("profitrate_DE between", value1, value2, "profitrateDe");
            return (Criteria) this;
        }

        public Criteria andProfitrateDeNotBetween(Double value1, Double value2) {
            addCriterion("profitrate_DE not between", value1, value2, "profitrateDe");
            return (Criteria) this;
        }

        public Criteria andExceptsellUsIsNull() {
            addCriterion("exceptSell_US is null");
            return (Criteria) this;
        }

        public Criteria andExceptsellUsIsNotNull() {
            addCriterion("exceptSell_US is not null");
            return (Criteria) this;
        }

        public Criteria andExceptsellUsEqualTo(Double value) {
            addCriterion("exceptSell_US =", value, "exceptsellUs");
            return (Criteria) this;
        }

        public Criteria andExceptsellUsNotEqualTo(Double value) {
            addCriterion("exceptSell_US <>", value, "exceptsellUs");
            return (Criteria) this;
        }

        public Criteria andExceptsellUsGreaterThan(Double value) {
            addCriterion("exceptSell_US >", value, "exceptsellUs");
            return (Criteria) this;
        }

        public Criteria andExceptsellUsGreaterThanOrEqualTo(Double value) {
            addCriterion("exceptSell_US >=", value, "exceptsellUs");
            return (Criteria) this;
        }

        public Criteria andExceptsellUsLessThan(Double value) {
            addCriterion("exceptSell_US <", value, "exceptsellUs");
            return (Criteria) this;
        }

        public Criteria andExceptsellUsLessThanOrEqualTo(Double value) {
            addCriterion("exceptSell_US <=", value, "exceptsellUs");
            return (Criteria) this;
        }

        public Criteria andExceptsellUsIn(List<Double> values) {
            addCriterion("exceptSell_US in", values, "exceptsellUs");
            return (Criteria) this;
        }

        public Criteria andExceptsellUsNotIn(List<Double> values) {
            addCriterion("exceptSell_US not in", values, "exceptsellUs");
            return (Criteria) this;
        }

        public Criteria andExceptsellUsBetween(Double value1, Double value2) {
            addCriterion("exceptSell_US between", value1, value2, "exceptsellUs");
            return (Criteria) this;
        }

        public Criteria andExceptsellUsNotBetween(Double value1, Double value2) {
            addCriterion("exceptSell_US not between", value1, value2, "exceptsellUs");
            return (Criteria) this;
        }

        public Criteria andProfitrateUsIsNull() {
            addCriterion("profitrate_US is null");
            return (Criteria) this;
        }

        public Criteria andProfitrateUsIsNotNull() {
            addCriterion("profitrate_US is not null");
            return (Criteria) this;
        }

        public Criteria andProfitrateUsEqualTo(String value) {
            addCriterion("profitrate_US =", value, "profitrateUs");
            return (Criteria) this;
        }

        public Criteria andProfitrateUsNotEqualTo(String value) {
            addCriterion("profitrate_US <>", value, "profitrateUs");
            return (Criteria) this;
        }

        public Criteria andProfitrateUsGreaterThan(String value) {
            addCriterion("profitrate_US >", value, "profitrateUs");
            return (Criteria) this;
        }

        public Criteria andProfitrateUsGreaterThanOrEqualTo(String value) {
            addCriterion("profitrate_US >=", value, "profitrateUs");
            return (Criteria) this;
        }

        public Criteria andProfitrateUsLessThan(String value) {
            addCriterion("profitrate_US <", value, "profitrateUs");
            return (Criteria) this;
        }

        public Criteria andProfitrateUsLessThanOrEqualTo(String value) {
            addCriterion("profitrate_US <=", value, "profitrateUs");
            return (Criteria) this;
        }

        public Criteria andProfitrateUsLike(String value) {
            addCriterion("profitrate_US like", value, "profitrateUs");
            return (Criteria) this;
        }

        public Criteria andProfitrateUsNotLike(String value) {
            addCriterion("profitrate_US not like", value, "profitrateUs");
            return (Criteria) this;
        }

        public Criteria andProfitrateUsIn(List<String> values) {
            addCriterion("profitrate_US in", values, "profitrateUs");
            return (Criteria) this;
        }

        public Criteria andProfitrateUsNotIn(List<String> values) {
            addCriterion("profitrate_US not in", values, "profitrateUs");
            return (Criteria) this;
        }

        public Criteria andProfitrateUsBetween(String value1, String value2) {
            addCriterion("profitrate_US between", value1, value2, "profitrateUs");
            return (Criteria) this;
        }

        public Criteria andProfitrateUsNotBetween(String value1, String value2) {
            addCriterion("profitrate_US not between", value1, value2, "profitrateUs");
            return (Criteria) this;
        }

        public Criteria andOpplinkDeIsNull() {
            addCriterion("opplink_DE is null");
            return (Criteria) this;
        }

        public Criteria andOpplinkDeIsNotNull() {
            addCriterion("opplink_DE is not null");
            return (Criteria) this;
        }

        public Criteria andOpplinkDeEqualTo(String value) {
            addCriterion("opplink_DE =", value, "opplinkDe");
            return (Criteria) this;
        }

        public Criteria andOpplinkDeNotEqualTo(String value) {
            addCriterion("opplink_DE <>", value, "opplinkDe");
            return (Criteria) this;
        }

        public Criteria andOpplinkDeGreaterThan(String value) {
            addCriterion("opplink_DE >", value, "opplinkDe");
            return (Criteria) this;
        }

        public Criteria andOpplinkDeGreaterThanOrEqualTo(String value) {
            addCriterion("opplink_DE >=", value, "opplinkDe");
            return (Criteria) this;
        }

        public Criteria andOpplinkDeLessThan(String value) {
            addCriterion("opplink_DE <", value, "opplinkDe");
            return (Criteria) this;
        }

        public Criteria andOpplinkDeLessThanOrEqualTo(String value) {
            addCriterion("opplink_DE <=", value, "opplinkDe");
            return (Criteria) this;
        }

        public Criteria andOpplinkDeLike(String value) {
            addCriterion("opplink_DE like", value, "opplinkDe");
            return (Criteria) this;
        }

        public Criteria andOpplinkDeNotLike(String value) {
            addCriterion("opplink_DE not like", value, "opplinkDe");
            return (Criteria) this;
        }

        public Criteria andOpplinkDeIn(List<String> values) {
            addCriterion("opplink_DE in", values, "opplinkDe");
            return (Criteria) this;
        }

        public Criteria andOpplinkDeNotIn(List<String> values) {
            addCriterion("opplink_DE not in", values, "opplinkDe");
            return (Criteria) this;
        }

        public Criteria andOpplinkDeBetween(String value1, String value2) {
            addCriterion("opplink_DE between", value1, value2, "opplinkDe");
            return (Criteria) this;
        }

        public Criteria andOpplinkDeNotBetween(String value1, String value2) {
            addCriterion("opplink_DE not between", value1, value2, "opplinkDe");
            return (Criteria) this;
        }

        public Criteria andOpplinkUsIsNull() {
            addCriterion("opplink_US is null");
            return (Criteria) this;
        }

        public Criteria andOpplinkUsIsNotNull() {
            addCriterion("opplink_US is not null");
            return (Criteria) this;
        }

        public Criteria andOpplinkUsEqualTo(String value) {
            addCriterion("opplink_US =", value, "opplinkUs");
            return (Criteria) this;
        }

        public Criteria andOpplinkUsNotEqualTo(String value) {
            addCriterion("opplink_US <>", value, "opplinkUs");
            return (Criteria) this;
        }

        public Criteria andOpplinkUsGreaterThan(String value) {
            addCriterion("opplink_US >", value, "opplinkUs");
            return (Criteria) this;
        }

        public Criteria andOpplinkUsGreaterThanOrEqualTo(String value) {
            addCriterion("opplink_US >=", value, "opplinkUs");
            return (Criteria) this;
        }

        public Criteria andOpplinkUsLessThan(String value) {
            addCriterion("opplink_US <", value, "opplinkUs");
            return (Criteria) this;
        }

        public Criteria andOpplinkUsLessThanOrEqualTo(String value) {
            addCriterion("opplink_US <=", value, "opplinkUs");
            return (Criteria) this;
        }

        public Criteria andOpplinkUsLike(String value) {
            addCriterion("opplink_US like", value, "opplinkUs");
            return (Criteria) this;
        }

        public Criteria andOpplinkUsNotLike(String value) {
            addCriterion("opplink_US not like", value, "opplinkUs");
            return (Criteria) this;
        }

        public Criteria andOpplinkUsIn(List<String> values) {
            addCriterion("opplink_US in", values, "opplinkUs");
            return (Criteria) this;
        }

        public Criteria andOpplinkUsNotIn(List<String> values) {
            addCriterion("opplink_US not in", values, "opplinkUs");
            return (Criteria) this;
        }

        public Criteria andOpplinkUsBetween(String value1, String value2) {
            addCriterion("opplink_US between", value1, value2, "opplinkUs");
            return (Criteria) this;
        }

        public Criteria andOpplinkUsNotBetween(String value1, String value2) {
            addCriterion("opplink_US not between", value1, value2, "opplinkUs");
            return (Criteria) this;
        }

        public Criteria andPriceUkIsNull() {
            addCriterion("price_UK is null");
            return (Criteria) this;
        }

        public Criteria andPriceUkIsNotNull() {
            addCriterion("price_UK is not null");
            return (Criteria) this;
        }

        public Criteria andPriceUkEqualTo(Double value) {
            addCriterion("price_UK =", value, "priceUk");
            return (Criteria) this;
        }

        public Criteria andPriceUkNotEqualTo(Double value) {
            addCriterion("price_UK <>", value, "priceUk");
            return (Criteria) this;
        }

        public Criteria andPriceUkGreaterThan(Double value) {
            addCriterion("price_UK >", value, "priceUk");
            return (Criteria) this;
        }

        public Criteria andPriceUkGreaterThanOrEqualTo(Double value) {
            addCriterion("price_UK >=", value, "priceUk");
            return (Criteria) this;
        }

        public Criteria andPriceUkLessThan(Double value) {
            addCriterion("price_UK <", value, "priceUk");
            return (Criteria) this;
        }

        public Criteria andPriceUkLessThanOrEqualTo(Double value) {
            addCriterion("price_UK <=", value, "priceUk");
            return (Criteria) this;
        }

        public Criteria andPriceUkIn(List<Double> values) {
            addCriterion("price_UK in", values, "priceUk");
            return (Criteria) this;
        }

        public Criteria andPriceUkNotIn(List<Double> values) {
            addCriterion("price_UK not in", values, "priceUk");
            return (Criteria) this;
        }

        public Criteria andPriceUkBetween(Double value1, Double value2) {
            addCriterion("price_UK between", value1, value2, "priceUk");
            return (Criteria) this;
        }

        public Criteria andPriceUkNotBetween(Double value1, Double value2) {
            addCriterion("price_UK not between", value1, value2, "priceUk");
            return (Criteria) this;
        }

        public Criteria andPriceDeIsNull() {
            addCriterion("price_DE is null");
            return (Criteria) this;
        }

        public Criteria andPriceDeIsNotNull() {
            addCriterion("price_DE is not null");
            return (Criteria) this;
        }

        public Criteria andPriceDeEqualTo(Double value) {
            addCriterion("price_DE =", value, "priceDe");
            return (Criteria) this;
        }

        public Criteria andPriceDeNotEqualTo(Double value) {
            addCriterion("price_DE <>", value, "priceDe");
            return (Criteria) this;
        }

        public Criteria andPriceDeGreaterThan(Double value) {
            addCriterion("price_DE >", value, "priceDe");
            return (Criteria) this;
        }

        public Criteria andPriceDeGreaterThanOrEqualTo(Double value) {
            addCriterion("price_DE >=", value, "priceDe");
            return (Criteria) this;
        }

        public Criteria andPriceDeLessThan(Double value) {
            addCriterion("price_DE <", value, "priceDe");
            return (Criteria) this;
        }

        public Criteria andPriceDeLessThanOrEqualTo(Double value) {
            addCriterion("price_DE <=", value, "priceDe");
            return (Criteria) this;
        }

        public Criteria andPriceDeIn(List<Double> values) {
            addCriterion("price_DE in", values, "priceDe");
            return (Criteria) this;
        }

        public Criteria andPriceDeNotIn(List<Double> values) {
            addCriterion("price_DE not in", values, "priceDe");
            return (Criteria) this;
        }

        public Criteria andPriceDeBetween(Double value1, Double value2) {
            addCriterion("price_DE between", value1, value2, "priceDe");
            return (Criteria) this;
        }

        public Criteria andPriceDeNotBetween(Double value1, Double value2) {
            addCriterion("price_DE not between", value1, value2, "priceDe");
            return (Criteria) this;
        }

        public Criteria andPriceUsIsNull() {
            addCriterion("price_US is null");
            return (Criteria) this;
        }

        public Criteria andPriceUsIsNotNull() {
            addCriterion("price_US is not null");
            return (Criteria) this;
        }

        public Criteria andPriceUsEqualTo(Double value) {
            addCriterion("price_US =", value, "priceUs");
            return (Criteria) this;
        }

        public Criteria andPriceUsNotEqualTo(Double value) {
            addCriterion("price_US <>", value, "priceUs");
            return (Criteria) this;
        }

        public Criteria andPriceUsGreaterThan(Double value) {
            addCriterion("price_US >", value, "priceUs");
            return (Criteria) this;
        }

        public Criteria andPriceUsGreaterThanOrEqualTo(Double value) {
            addCriterion("price_US >=", value, "priceUs");
            return (Criteria) this;
        }

        public Criteria andPriceUsLessThan(Double value) {
            addCriterion("price_US <", value, "priceUs");
            return (Criteria) this;
        }

        public Criteria andPriceUsLessThanOrEqualTo(Double value) {
            addCriterion("price_US <=", value, "priceUs");
            return (Criteria) this;
        }

        public Criteria andPriceUsIn(List<Double> values) {
            addCriterion("price_US in", values, "priceUs");
            return (Criteria) this;
        }

        public Criteria andPriceUsNotIn(List<Double> values) {
            addCriterion("price_US not in", values, "priceUs");
            return (Criteria) this;
        }

        public Criteria andPriceUsBetween(Double value1, Double value2) {
            addCriterion("price_US between", value1, value2, "priceUs");
            return (Criteria) this;
        }

        public Criteria andPriceUsNotBetween(Double value1, Double value2) {
            addCriterion("price_US not between", value1, value2, "priceUs");
            return (Criteria) this;
        }

        public Criteria andSuppliernameIsNull() {
            addCriterion("suppliername is null");
            return (Criteria) this;
        }

        public Criteria andSuppliernameIsNotNull() {
            addCriterion("suppliername is not null");
            return (Criteria) this;
        }

        public Criteria andSuppliernameEqualTo(String value) {
            addCriterion("suppliername =", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameNotEqualTo(String value) {
            addCriterion("suppliername <>", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameGreaterThan(String value) {
            addCriterion("suppliername >", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameGreaterThanOrEqualTo(String value) {
            addCriterion("suppliername >=", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameLessThan(String value) {
            addCriterion("suppliername <", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameLessThanOrEqualTo(String value) {
            addCriterion("suppliername <=", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameLike(String value) {
            addCriterion("suppliername like", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameNotLike(String value) {
            addCriterion("suppliername not like", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameIn(List<String> values) {
            addCriterion("suppliername in", values, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameNotIn(List<String> values) {
            addCriterion("suppliername not in", values, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameBetween(String value1, String value2) {
            addCriterion("suppliername between", value1, value2, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameNotBetween(String value1, String value2) {
            addCriterion("suppliername not between", value1, value2, "suppliername");
            return (Criteria) this;
        }

        public Criteria andAccountIsNull() {
            addCriterion("account is null");
            return (Criteria) this;
        }

        public Criteria andAccountIsNotNull() {
            addCriterion("account is not null");
            return (Criteria) this;
        }

        public Criteria andAccountEqualTo(Integer value) {
            addCriterion("account =", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotEqualTo(Integer value) {
            addCriterion("account <>", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThan(Integer value) {
            addCriterion("account >", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThanOrEqualTo(Integer value) {
            addCriterion("account >=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThan(Integer value) {
            addCriterion("account <", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThanOrEqualTo(Integer value) {
            addCriterion("account <=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountIn(List<Integer> values) {
            addCriterion("account in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotIn(List<Integer> values) {
            addCriterion("account not in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountBetween(Integer value1, Integer value2) {
            addCriterion("account between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotBetween(Integer value1, Integer value2) {
            addCriterion("account not between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("userName is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("userName is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("userName =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("userName <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("userName >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("userName >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("userName <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("userName <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("userName like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("userName not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("userName in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("userName not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("userName between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("userName not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userID not between", value1, value2, "userid");
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