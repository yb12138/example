package com.heeexy.example.model;

import java.util.ArrayList;
import java.util.List;

public class ExchangerateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExchangerateExample() {
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

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andMonth1IsNull() {
            addCriterion("month1 is null");
            return (Criteria) this;
        }

        public Criteria andMonth1IsNotNull() {
            addCriterion("month1 is not null");
            return (Criteria) this;
        }

        public Criteria andMonth1EqualTo(Double value) {
            addCriterion("month1 =", value, "month1");
            return (Criteria) this;
        }

        public Criteria andMonth1NotEqualTo(Double value) {
            addCriterion("month1 <>", value, "month1");
            return (Criteria) this;
        }

        public Criteria andMonth1GreaterThan(Double value) {
            addCriterion("month1 >", value, "month1");
            return (Criteria) this;
        }

        public Criteria andMonth1GreaterThanOrEqualTo(Double value) {
            addCriterion("month1 >=", value, "month1");
            return (Criteria) this;
        }

        public Criteria andMonth1LessThan(Double value) {
            addCriterion("month1 <", value, "month1");
            return (Criteria) this;
        }

        public Criteria andMonth1LessThanOrEqualTo(Double value) {
            addCriterion("month1 <=", value, "month1");
            return (Criteria) this;
        }

        public Criteria andMonth1In(List<Double> values) {
            addCriterion("month1 in", values, "month1");
            return (Criteria) this;
        }

        public Criteria andMonth1NotIn(List<Double> values) {
            addCriterion("month1 not in", values, "month1");
            return (Criteria) this;
        }

        public Criteria andMonth1Between(Double value1, Double value2) {
            addCriterion("month1 between", value1, value2, "month1");
            return (Criteria) this;
        }

        public Criteria andMonth1NotBetween(Double value1, Double value2) {
            addCriterion("month1 not between", value1, value2, "month1");
            return (Criteria) this;
        }

        public Criteria andMonth2IsNull() {
            addCriterion("month2 is null");
            return (Criteria) this;
        }

        public Criteria andMonth2IsNotNull() {
            addCriterion("month2 is not null");
            return (Criteria) this;
        }

        public Criteria andMonth2EqualTo(Double value) {
            addCriterion("month2 =", value, "month2");
            return (Criteria) this;
        }

        public Criteria andMonth2NotEqualTo(Double value) {
            addCriterion("month2 <>", value, "month2");
            return (Criteria) this;
        }

        public Criteria andMonth2GreaterThan(Double value) {
            addCriterion("month2 >", value, "month2");
            return (Criteria) this;
        }

        public Criteria andMonth2GreaterThanOrEqualTo(Double value) {
            addCriterion("month2 >=", value, "month2");
            return (Criteria) this;
        }

        public Criteria andMonth2LessThan(Double value) {
            addCriterion("month2 <", value, "month2");
            return (Criteria) this;
        }

        public Criteria andMonth2LessThanOrEqualTo(Double value) {
            addCriterion("month2 <=", value, "month2");
            return (Criteria) this;
        }

        public Criteria andMonth2In(List<Double> values) {
            addCriterion("month2 in", values, "month2");
            return (Criteria) this;
        }

        public Criteria andMonth2NotIn(List<Double> values) {
            addCriterion("month2 not in", values, "month2");
            return (Criteria) this;
        }

        public Criteria andMonth2Between(Double value1, Double value2) {
            addCriterion("month2 between", value1, value2, "month2");
            return (Criteria) this;
        }

        public Criteria andMonth2NotBetween(Double value1, Double value2) {
            addCriterion("month2 not between", value1, value2, "month2");
            return (Criteria) this;
        }

        public Criteria andMonth3IsNull() {
            addCriterion("month3 is null");
            return (Criteria) this;
        }

        public Criteria andMonth3IsNotNull() {
            addCriterion("month3 is not null");
            return (Criteria) this;
        }

        public Criteria andMonth3EqualTo(Double value) {
            addCriterion("month3 =", value, "month3");
            return (Criteria) this;
        }

        public Criteria andMonth3NotEqualTo(Double value) {
            addCriterion("month3 <>", value, "month3");
            return (Criteria) this;
        }

        public Criteria andMonth3GreaterThan(Double value) {
            addCriterion("month3 >", value, "month3");
            return (Criteria) this;
        }

        public Criteria andMonth3GreaterThanOrEqualTo(Double value) {
            addCriterion("month3 >=", value, "month3");
            return (Criteria) this;
        }

        public Criteria andMonth3LessThan(Double value) {
            addCriterion("month3 <", value, "month3");
            return (Criteria) this;
        }

        public Criteria andMonth3LessThanOrEqualTo(Double value) {
            addCriterion("month3 <=", value, "month3");
            return (Criteria) this;
        }

        public Criteria andMonth3In(List<Double> values) {
            addCriterion("month3 in", values, "month3");
            return (Criteria) this;
        }

        public Criteria andMonth3NotIn(List<Double> values) {
            addCriterion("month3 not in", values, "month3");
            return (Criteria) this;
        }

        public Criteria andMonth3Between(Double value1, Double value2) {
            addCriterion("month3 between", value1, value2, "month3");
            return (Criteria) this;
        }

        public Criteria andMonth3NotBetween(Double value1, Double value2) {
            addCriterion("month3 not between", value1, value2, "month3");
            return (Criteria) this;
        }

        public Criteria andMonth4IsNull() {
            addCriterion("month4 is null");
            return (Criteria) this;
        }

        public Criteria andMonth4IsNotNull() {
            addCriterion("month4 is not null");
            return (Criteria) this;
        }

        public Criteria andMonth4EqualTo(Double value) {
            addCriterion("month4 =", value, "month4");
            return (Criteria) this;
        }

        public Criteria andMonth4NotEqualTo(Double value) {
            addCriterion("month4 <>", value, "month4");
            return (Criteria) this;
        }

        public Criteria andMonth4GreaterThan(Double value) {
            addCriterion("month4 >", value, "month4");
            return (Criteria) this;
        }

        public Criteria andMonth4GreaterThanOrEqualTo(Double value) {
            addCriterion("month4 >=", value, "month4");
            return (Criteria) this;
        }

        public Criteria andMonth4LessThan(Double value) {
            addCriterion("month4 <", value, "month4");
            return (Criteria) this;
        }

        public Criteria andMonth4LessThanOrEqualTo(Double value) {
            addCriterion("month4 <=", value, "month4");
            return (Criteria) this;
        }

        public Criteria andMonth4In(List<Double> values) {
            addCriterion("month4 in", values, "month4");
            return (Criteria) this;
        }

        public Criteria andMonth4NotIn(List<Double> values) {
            addCriterion("month4 not in", values, "month4");
            return (Criteria) this;
        }

        public Criteria andMonth4Between(Double value1, Double value2) {
            addCriterion("month4 between", value1, value2, "month4");
            return (Criteria) this;
        }

        public Criteria andMonth4NotBetween(Double value1, Double value2) {
            addCriterion("month4 not between", value1, value2, "month4");
            return (Criteria) this;
        }

        public Criteria andMonth5IsNull() {
            addCriterion("month5 is null");
            return (Criteria) this;
        }

        public Criteria andMonth5IsNotNull() {
            addCriterion("month5 is not null");
            return (Criteria) this;
        }

        public Criteria andMonth5EqualTo(Double value) {
            addCriterion("month5 =", value, "month5");
            return (Criteria) this;
        }

        public Criteria andMonth5NotEqualTo(Double value) {
            addCriterion("month5 <>", value, "month5");
            return (Criteria) this;
        }

        public Criteria andMonth5GreaterThan(Double value) {
            addCriterion("month5 >", value, "month5");
            return (Criteria) this;
        }

        public Criteria andMonth5GreaterThanOrEqualTo(Double value) {
            addCriterion("month5 >=", value, "month5");
            return (Criteria) this;
        }

        public Criteria andMonth5LessThan(Double value) {
            addCriterion("month5 <", value, "month5");
            return (Criteria) this;
        }

        public Criteria andMonth5LessThanOrEqualTo(Double value) {
            addCriterion("month5 <=", value, "month5");
            return (Criteria) this;
        }

        public Criteria andMonth5In(List<Double> values) {
            addCriterion("month5 in", values, "month5");
            return (Criteria) this;
        }

        public Criteria andMonth5NotIn(List<Double> values) {
            addCriterion("month5 not in", values, "month5");
            return (Criteria) this;
        }

        public Criteria andMonth5Between(Double value1, Double value2) {
            addCriterion("month5 between", value1, value2, "month5");
            return (Criteria) this;
        }

        public Criteria andMonth5NotBetween(Double value1, Double value2) {
            addCriterion("month5 not between", value1, value2, "month5");
            return (Criteria) this;
        }

        public Criteria andMonth6IsNull() {
            addCriterion("month6 is null");
            return (Criteria) this;
        }

        public Criteria andMonth6IsNotNull() {
            addCriterion("month6 is not null");
            return (Criteria) this;
        }

        public Criteria andMonth6EqualTo(Double value) {
            addCriterion("month6 =", value, "month6");
            return (Criteria) this;
        }

        public Criteria andMonth6NotEqualTo(Double value) {
            addCriterion("month6 <>", value, "month6");
            return (Criteria) this;
        }

        public Criteria andMonth6GreaterThan(Double value) {
            addCriterion("month6 >", value, "month6");
            return (Criteria) this;
        }

        public Criteria andMonth6GreaterThanOrEqualTo(Double value) {
            addCriterion("month6 >=", value, "month6");
            return (Criteria) this;
        }

        public Criteria andMonth6LessThan(Double value) {
            addCriterion("month6 <", value, "month6");
            return (Criteria) this;
        }

        public Criteria andMonth6LessThanOrEqualTo(Double value) {
            addCriterion("month6 <=", value, "month6");
            return (Criteria) this;
        }

        public Criteria andMonth6In(List<Double> values) {
            addCriterion("month6 in", values, "month6");
            return (Criteria) this;
        }

        public Criteria andMonth6NotIn(List<Double> values) {
            addCriterion("month6 not in", values, "month6");
            return (Criteria) this;
        }

        public Criteria andMonth6Between(Double value1, Double value2) {
            addCriterion("month6 between", value1, value2, "month6");
            return (Criteria) this;
        }

        public Criteria andMonth6NotBetween(Double value1, Double value2) {
            addCriterion("month6 not between", value1, value2, "month6");
            return (Criteria) this;
        }

        public Criteria andMonth7IsNull() {
            addCriterion("month7 is null");
            return (Criteria) this;
        }

        public Criteria andMonth7IsNotNull() {
            addCriterion("month7 is not null");
            return (Criteria) this;
        }

        public Criteria andMonth7EqualTo(Double value) {
            addCriterion("month7 =", value, "month7");
            return (Criteria) this;
        }

        public Criteria andMonth7NotEqualTo(Double value) {
            addCriterion("month7 <>", value, "month7");
            return (Criteria) this;
        }

        public Criteria andMonth7GreaterThan(Double value) {
            addCriterion("month7 >", value, "month7");
            return (Criteria) this;
        }

        public Criteria andMonth7GreaterThanOrEqualTo(Double value) {
            addCriterion("month7 >=", value, "month7");
            return (Criteria) this;
        }

        public Criteria andMonth7LessThan(Double value) {
            addCriterion("month7 <", value, "month7");
            return (Criteria) this;
        }

        public Criteria andMonth7LessThanOrEqualTo(Double value) {
            addCriterion("month7 <=", value, "month7");
            return (Criteria) this;
        }

        public Criteria andMonth7In(List<Double> values) {
            addCriterion("month7 in", values, "month7");
            return (Criteria) this;
        }

        public Criteria andMonth7NotIn(List<Double> values) {
            addCriterion("month7 not in", values, "month7");
            return (Criteria) this;
        }

        public Criteria andMonth7Between(Double value1, Double value2) {
            addCriterion("month7 between", value1, value2, "month7");
            return (Criteria) this;
        }

        public Criteria andMonth7NotBetween(Double value1, Double value2) {
            addCriterion("month7 not between", value1, value2, "month7");
            return (Criteria) this;
        }

        public Criteria andMonth8IsNull() {
            addCriterion("month8 is null");
            return (Criteria) this;
        }

        public Criteria andMonth8IsNotNull() {
            addCriterion("month8 is not null");
            return (Criteria) this;
        }

        public Criteria andMonth8EqualTo(Double value) {
            addCriterion("month8 =", value, "month8");
            return (Criteria) this;
        }

        public Criteria andMonth8NotEqualTo(Double value) {
            addCriterion("month8 <>", value, "month8");
            return (Criteria) this;
        }

        public Criteria andMonth8GreaterThan(Double value) {
            addCriterion("month8 >", value, "month8");
            return (Criteria) this;
        }

        public Criteria andMonth8GreaterThanOrEqualTo(Double value) {
            addCriterion("month8 >=", value, "month8");
            return (Criteria) this;
        }

        public Criteria andMonth8LessThan(Double value) {
            addCriterion("month8 <", value, "month8");
            return (Criteria) this;
        }

        public Criteria andMonth8LessThanOrEqualTo(Double value) {
            addCriterion("month8 <=", value, "month8");
            return (Criteria) this;
        }

        public Criteria andMonth8In(List<Double> values) {
            addCriterion("month8 in", values, "month8");
            return (Criteria) this;
        }

        public Criteria andMonth8NotIn(List<Double> values) {
            addCriterion("month8 not in", values, "month8");
            return (Criteria) this;
        }

        public Criteria andMonth8Between(Double value1, Double value2) {
            addCriterion("month8 between", value1, value2, "month8");
            return (Criteria) this;
        }

        public Criteria andMonth8NotBetween(Double value1, Double value2) {
            addCriterion("month8 not between", value1, value2, "month8");
            return (Criteria) this;
        }

        public Criteria andMonth9IsNull() {
            addCriterion("month9 is null");
            return (Criteria) this;
        }

        public Criteria andMonth9IsNotNull() {
            addCriterion("month9 is not null");
            return (Criteria) this;
        }

        public Criteria andMonth9EqualTo(Double value) {
            addCriterion("month9 =", value, "month9");
            return (Criteria) this;
        }

        public Criteria andMonth9NotEqualTo(Double value) {
            addCriterion("month9 <>", value, "month9");
            return (Criteria) this;
        }

        public Criteria andMonth9GreaterThan(Double value) {
            addCriterion("month9 >", value, "month9");
            return (Criteria) this;
        }

        public Criteria andMonth9GreaterThanOrEqualTo(Double value) {
            addCriterion("month9 >=", value, "month9");
            return (Criteria) this;
        }

        public Criteria andMonth9LessThan(Double value) {
            addCriterion("month9 <", value, "month9");
            return (Criteria) this;
        }

        public Criteria andMonth9LessThanOrEqualTo(Double value) {
            addCriterion("month9 <=", value, "month9");
            return (Criteria) this;
        }

        public Criteria andMonth9In(List<Double> values) {
            addCriterion("month9 in", values, "month9");
            return (Criteria) this;
        }

        public Criteria andMonth9NotIn(List<Double> values) {
            addCriterion("month9 not in", values, "month9");
            return (Criteria) this;
        }

        public Criteria andMonth9Between(Double value1, Double value2) {
            addCriterion("month9 between", value1, value2, "month9");
            return (Criteria) this;
        }

        public Criteria andMonth9NotBetween(Double value1, Double value2) {
            addCriterion("month9 not between", value1, value2, "month9");
            return (Criteria) this;
        }

        public Criteria andMonth10IsNull() {
            addCriterion("month10 is null");
            return (Criteria) this;
        }

        public Criteria andMonth10IsNotNull() {
            addCriterion("month10 is not null");
            return (Criteria) this;
        }

        public Criteria andMonth10EqualTo(Double value) {
            addCriterion("month10 =", value, "month10");
            return (Criteria) this;
        }

        public Criteria andMonth10NotEqualTo(Double value) {
            addCriterion("month10 <>", value, "month10");
            return (Criteria) this;
        }

        public Criteria andMonth10GreaterThan(Double value) {
            addCriterion("month10 >", value, "month10");
            return (Criteria) this;
        }

        public Criteria andMonth10GreaterThanOrEqualTo(Double value) {
            addCriterion("month10 >=", value, "month10");
            return (Criteria) this;
        }

        public Criteria andMonth10LessThan(Double value) {
            addCriterion("month10 <", value, "month10");
            return (Criteria) this;
        }

        public Criteria andMonth10LessThanOrEqualTo(Double value) {
            addCriterion("month10 <=", value, "month10");
            return (Criteria) this;
        }

        public Criteria andMonth10In(List<Double> values) {
            addCriterion("month10 in", values, "month10");
            return (Criteria) this;
        }

        public Criteria andMonth10NotIn(List<Double> values) {
            addCriterion("month10 not in", values, "month10");
            return (Criteria) this;
        }

        public Criteria andMonth10Between(Double value1, Double value2) {
            addCriterion("month10 between", value1, value2, "month10");
            return (Criteria) this;
        }

        public Criteria andMonth10NotBetween(Double value1, Double value2) {
            addCriterion("month10 not between", value1, value2, "month10");
            return (Criteria) this;
        }

        public Criteria andMonth11IsNull() {
            addCriterion("month11 is null");
            return (Criteria) this;
        }

        public Criteria andMonth11IsNotNull() {
            addCriterion("month11 is not null");
            return (Criteria) this;
        }

        public Criteria andMonth11EqualTo(Double value) {
            addCriterion("month11 =", value, "month11");
            return (Criteria) this;
        }

        public Criteria andMonth11NotEqualTo(Double value) {
            addCriterion("month11 <>", value, "month11");
            return (Criteria) this;
        }

        public Criteria andMonth11GreaterThan(Double value) {
            addCriterion("month11 >", value, "month11");
            return (Criteria) this;
        }

        public Criteria andMonth11GreaterThanOrEqualTo(Double value) {
            addCriterion("month11 >=", value, "month11");
            return (Criteria) this;
        }

        public Criteria andMonth11LessThan(Double value) {
            addCriterion("month11 <", value, "month11");
            return (Criteria) this;
        }

        public Criteria andMonth11LessThanOrEqualTo(Double value) {
            addCriterion("month11 <=", value, "month11");
            return (Criteria) this;
        }

        public Criteria andMonth11In(List<Double> values) {
            addCriterion("month11 in", values, "month11");
            return (Criteria) this;
        }

        public Criteria andMonth11NotIn(List<Double> values) {
            addCriterion("month11 not in", values, "month11");
            return (Criteria) this;
        }

        public Criteria andMonth11Between(Double value1, Double value2) {
            addCriterion("month11 between", value1, value2, "month11");
            return (Criteria) this;
        }

        public Criteria andMonth11NotBetween(Double value1, Double value2) {
            addCriterion("month11 not between", value1, value2, "month11");
            return (Criteria) this;
        }

        public Criteria andMonth12IsNull() {
            addCriterion("month12 is null");
            return (Criteria) this;
        }

        public Criteria andMonth12IsNotNull() {
            addCriterion("month12 is not null");
            return (Criteria) this;
        }

        public Criteria andMonth12EqualTo(Double value) {
            addCriterion("month12 =", value, "month12");
            return (Criteria) this;
        }

        public Criteria andMonth12NotEqualTo(Double value) {
            addCriterion("month12 <>", value, "month12");
            return (Criteria) this;
        }

        public Criteria andMonth12GreaterThan(Double value) {
            addCriterion("month12 >", value, "month12");
            return (Criteria) this;
        }

        public Criteria andMonth12GreaterThanOrEqualTo(Double value) {
            addCriterion("month12 >=", value, "month12");
            return (Criteria) this;
        }

        public Criteria andMonth12LessThan(Double value) {
            addCriterion("month12 <", value, "month12");
            return (Criteria) this;
        }

        public Criteria andMonth12LessThanOrEqualTo(Double value) {
            addCriterion("month12 <=", value, "month12");
            return (Criteria) this;
        }

        public Criteria andMonth12In(List<Double> values) {
            addCriterion("month12 in", values, "month12");
            return (Criteria) this;
        }

        public Criteria andMonth12NotIn(List<Double> values) {
            addCriterion("month12 not in", values, "month12");
            return (Criteria) this;
        }

        public Criteria andMonth12Between(Double value1, Double value2) {
            addCriterion("month12 between", value1, value2, "month12");
            return (Criteria) this;
        }

        public Criteria andMonth12NotBetween(Double value1, Double value2) {
            addCriterion("month12 not between", value1, value2, "month12");
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