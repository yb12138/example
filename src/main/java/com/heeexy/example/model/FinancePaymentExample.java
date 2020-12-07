package com.heeexy.example.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FinancePaymentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FinancePaymentExample() {
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

        public Criteria andPaymentidIsNull() {
            addCriterion("paymentID is null");
            return (Criteria) this;
        }

        public Criteria andPaymentidIsNotNull() {
            addCriterion("paymentID is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentidEqualTo(Integer value) {
            addCriterion("paymentID =", value, "paymentid");
            return (Criteria) this;
        }

        public Criteria andPaymentidNotEqualTo(Integer value) {
            addCriterion("paymentID <>", value, "paymentid");
            return (Criteria) this;
        }

        public Criteria andPaymentidGreaterThan(Integer value) {
            addCriterion("paymentID >", value, "paymentid");
            return (Criteria) this;
        }

        public Criteria andPaymentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("paymentID >=", value, "paymentid");
            return (Criteria) this;
        }

        public Criteria andPaymentidLessThan(Integer value) {
            addCriterion("paymentID <", value, "paymentid");
            return (Criteria) this;
        }

        public Criteria andPaymentidLessThanOrEqualTo(Integer value) {
            addCriterion("paymentID <=", value, "paymentid");
            return (Criteria) this;
        }

        public Criteria andPaymentidIn(List<Integer> values) {
            addCriterion("paymentID in", values, "paymentid");
            return (Criteria) this;
        }

        public Criteria andPaymentidNotIn(List<Integer> values) {
            addCriterion("paymentID not in", values, "paymentid");
            return (Criteria) this;
        }

        public Criteria andPaymentidBetween(Integer value1, Integer value2) {
            addCriterion("paymentID between", value1, value2, "paymentid");
            return (Criteria) this;
        }

        public Criteria andPaymentidNotBetween(Integer value1, Integer value2) {
            addCriterion("paymentID not between", value1, value2, "paymentid");
            return (Criteria) this;
        }

        public Criteria andPaymentnumIsNull() {
            addCriterion("paymentNum is null");
            return (Criteria) this;
        }

        public Criteria andPaymentnumIsNotNull() {
            addCriterion("paymentNum is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentnumEqualTo(String value) {
            addCriterion("paymentNum =", value, "paymentnum");
            return (Criteria) this;
        }

        public Criteria andPaymentnumNotEqualTo(String value) {
            addCriterion("paymentNum <>", value, "paymentnum");
            return (Criteria) this;
        }

        public Criteria andPaymentnumGreaterThan(String value) {
            addCriterion("paymentNum >", value, "paymentnum");
            return (Criteria) this;
        }

        public Criteria andPaymentnumGreaterThanOrEqualTo(String value) {
            addCriterion("paymentNum >=", value, "paymentnum");
            return (Criteria) this;
        }

        public Criteria andPaymentnumLessThan(String value) {
            addCriterion("paymentNum <", value, "paymentnum");
            return (Criteria) this;
        }

        public Criteria andPaymentnumLessThanOrEqualTo(String value) {
            addCriterion("paymentNum <=", value, "paymentnum");
            return (Criteria) this;
        }

        public Criteria andPaymentnumLike(String value) {
            addCriterion("paymentNum like", value, "paymentnum");
            return (Criteria) this;
        }

        public Criteria andPaymentnumNotLike(String value) {
            addCriterion("paymentNum not like", value, "paymentnum");
            return (Criteria) this;
        }

        public Criteria andPaymentnumIn(List<String> values) {
            addCriterion("paymentNum in", values, "paymentnum");
            return (Criteria) this;
        }

        public Criteria andPaymentnumNotIn(List<String> values) {
            addCriterion("paymentNum not in", values, "paymentnum");
            return (Criteria) this;
        }

        public Criteria andPaymentnumBetween(String value1, String value2) {
            addCriterion("paymentNum between", value1, value2, "paymentnum");
            return (Criteria) this;
        }

        public Criteria andPaymentnumNotBetween(String value1, String value2) {
            addCriterion("paymentNum not between", value1, value2, "paymentnum");
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

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
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

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andPurchaseidIsNull() {
            addCriterion("purchaseID is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseidIsNotNull() {
            addCriterion("purchaseID is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseidEqualTo(Integer value) {
            addCriterion("purchaseID =", value, "purchaseid");
            return (Criteria) this;
        }

        public Criteria andPurchaseidNotEqualTo(Integer value) {
            addCriterion("purchaseID <>", value, "purchaseid");
            return (Criteria) this;
        }

        public Criteria andPurchaseidGreaterThan(Integer value) {
            addCriterion("purchaseID >", value, "purchaseid");
            return (Criteria) this;
        }

        public Criteria andPurchaseidGreaterThanOrEqualTo(Integer value) {
            addCriterion("purchaseID >=", value, "purchaseid");
            return (Criteria) this;
        }

        public Criteria andPurchaseidLessThan(Integer value) {
            addCriterion("purchaseID <", value, "purchaseid");
            return (Criteria) this;
        }

        public Criteria andPurchaseidLessThanOrEqualTo(Integer value) {
            addCriterion("purchaseID <=", value, "purchaseid");
            return (Criteria) this;
        }

        public Criteria andPurchaseidIn(List<Integer> values) {
            addCriterion("purchaseID in", values, "purchaseid");
            return (Criteria) this;
        }

        public Criteria andPurchaseidNotIn(List<Integer> values) {
            addCriterion("purchaseID not in", values, "purchaseid");
            return (Criteria) this;
        }

        public Criteria andPurchaseidBetween(Integer value1, Integer value2) {
            addCriterion("purchaseID between", value1, value2, "purchaseid");
            return (Criteria) this;
        }

        public Criteria andPurchaseidNotBetween(Integer value1, Integer value2) {
            addCriterion("purchaseID not between", value1, value2, "purchaseid");
            return (Criteria) this;
        }

        public Criteria andFinanceauditoridIsNull() {
            addCriterion("financeAuditorID is null");
            return (Criteria) this;
        }

        public Criteria andFinanceauditoridIsNotNull() {
            addCriterion("financeAuditorID is not null");
            return (Criteria) this;
        }

        public Criteria andFinanceauditoridEqualTo(Integer value) {
            addCriterion("financeAuditorID =", value, "financeauditorid");
            return (Criteria) this;
        }

        public Criteria andFinanceauditoridNotEqualTo(Integer value) {
            addCriterion("financeAuditorID <>", value, "financeauditorid");
            return (Criteria) this;
        }

        public Criteria andFinanceauditoridGreaterThan(Integer value) {
            addCriterion("financeAuditorID >", value, "financeauditorid");
            return (Criteria) this;
        }

        public Criteria andFinanceauditoridGreaterThanOrEqualTo(Integer value) {
            addCriterion("financeAuditorID >=", value, "financeauditorid");
            return (Criteria) this;
        }

        public Criteria andFinanceauditoridLessThan(Integer value) {
            addCriterion("financeAuditorID <", value, "financeauditorid");
            return (Criteria) this;
        }

        public Criteria andFinanceauditoridLessThanOrEqualTo(Integer value) {
            addCriterion("financeAuditorID <=", value, "financeauditorid");
            return (Criteria) this;
        }

        public Criteria andFinanceauditoridIn(List<Integer> values) {
            addCriterion("financeAuditorID in", values, "financeauditorid");
            return (Criteria) this;
        }

        public Criteria andFinanceauditoridNotIn(List<Integer> values) {
            addCriterion("financeAuditorID not in", values, "financeauditorid");
            return (Criteria) this;
        }

        public Criteria andFinanceauditoridBetween(Integer value1, Integer value2) {
            addCriterion("financeAuditorID between", value1, value2, "financeauditorid");
            return (Criteria) this;
        }

        public Criteria andFinanceauditoridNotBetween(Integer value1, Integer value2) {
            addCriterion("financeAuditorID not between", value1, value2, "financeauditorid");
            return (Criteria) this;
        }

        public Criteria andAuditopinionIsNull() {
            addCriterion("auditOpinion is null");
            return (Criteria) this;
        }

        public Criteria andAuditopinionIsNotNull() {
            addCriterion("auditOpinion is not null");
            return (Criteria) this;
        }

        public Criteria andAuditopinionEqualTo(String value) {
            addCriterion("auditOpinion =", value, "auditopinion");
            return (Criteria) this;
        }

        public Criteria andAuditopinionNotEqualTo(String value) {
            addCriterion("auditOpinion <>", value, "auditopinion");
            return (Criteria) this;
        }

        public Criteria andAuditopinionGreaterThan(String value) {
            addCriterion("auditOpinion >", value, "auditopinion");
            return (Criteria) this;
        }

        public Criteria andAuditopinionGreaterThanOrEqualTo(String value) {
            addCriterion("auditOpinion >=", value, "auditopinion");
            return (Criteria) this;
        }

        public Criteria andAuditopinionLessThan(String value) {
            addCriterion("auditOpinion <", value, "auditopinion");
            return (Criteria) this;
        }

        public Criteria andAuditopinionLessThanOrEqualTo(String value) {
            addCriterion("auditOpinion <=", value, "auditopinion");
            return (Criteria) this;
        }

        public Criteria andAuditopinionLike(String value) {
            addCriterion("auditOpinion like", value, "auditopinion");
            return (Criteria) this;
        }

        public Criteria andAuditopinionNotLike(String value) {
            addCriterion("auditOpinion not like", value, "auditopinion");
            return (Criteria) this;
        }

        public Criteria andAuditopinionIn(List<String> values) {
            addCriterion("auditOpinion in", values, "auditopinion");
            return (Criteria) this;
        }

        public Criteria andAuditopinionNotIn(List<String> values) {
            addCriterion("auditOpinion not in", values, "auditopinion");
            return (Criteria) this;
        }

        public Criteria andAuditopinionBetween(String value1, String value2) {
            addCriterion("auditOpinion between", value1, value2, "auditopinion");
            return (Criteria) this;
        }

        public Criteria andAuditopinionNotBetween(String value1, String value2) {
            addCriterion("auditOpinion not between", value1, value2, "auditopinion");
            return (Criteria) this;
        }

        public Criteria andNeedpaytotalamountIsNull() {
            addCriterion("needPayTotalAmount is null");
            return (Criteria) this;
        }

        public Criteria andNeedpaytotalamountIsNotNull() {
            addCriterion("needPayTotalAmount is not null");
            return (Criteria) this;
        }

        public Criteria andNeedpaytotalamountEqualTo(BigDecimal value) {
            addCriterion("needPayTotalAmount =", value, "needpaytotalamount");
            return (Criteria) this;
        }

        public Criteria andNeedpaytotalamountNotEqualTo(BigDecimal value) {
            addCriterion("needPayTotalAmount <>", value, "needpaytotalamount");
            return (Criteria) this;
        }

        public Criteria andNeedpaytotalamountGreaterThan(BigDecimal value) {
            addCriterion("needPayTotalAmount >", value, "needpaytotalamount");
            return (Criteria) this;
        }

        public Criteria andNeedpaytotalamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("needPayTotalAmount >=", value, "needpaytotalamount");
            return (Criteria) this;
        }

        public Criteria andNeedpaytotalamountLessThan(BigDecimal value) {
            addCriterion("needPayTotalAmount <", value, "needpaytotalamount");
            return (Criteria) this;
        }

        public Criteria andNeedpaytotalamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("needPayTotalAmount <=", value, "needpaytotalamount");
            return (Criteria) this;
        }

        public Criteria andNeedpaytotalamountIn(List<BigDecimal> values) {
            addCriterion("needPayTotalAmount in", values, "needpaytotalamount");
            return (Criteria) this;
        }

        public Criteria andNeedpaytotalamountNotIn(List<BigDecimal> values) {
            addCriterion("needPayTotalAmount not in", values, "needpaytotalamount");
            return (Criteria) this;
        }

        public Criteria andNeedpaytotalamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("needPayTotalAmount between", value1, value2, "needpaytotalamount");
            return (Criteria) this;
        }

        public Criteria andNeedpaytotalamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("needPayTotalAmount not between", value1, value2, "needpaytotalamount");
            return (Criteria) this;
        }

        public Criteria andPurchasetotalamountIsNull() {
            addCriterion("purchaseTotalAmount is null");
            return (Criteria) this;
        }

        public Criteria andPurchasetotalamountIsNotNull() {
            addCriterion("purchaseTotalAmount is not null");
            return (Criteria) this;
        }

        public Criteria andPurchasetotalamountEqualTo(BigDecimal value) {
            addCriterion("purchaseTotalAmount =", value, "purchasetotalamount");
            return (Criteria) this;
        }

        public Criteria andPurchasetotalamountNotEqualTo(BigDecimal value) {
            addCriterion("purchaseTotalAmount <>", value, "purchasetotalamount");
            return (Criteria) this;
        }

        public Criteria andPurchasetotalamountGreaterThan(BigDecimal value) {
            addCriterion("purchaseTotalAmount >", value, "purchasetotalamount");
            return (Criteria) this;
        }

        public Criteria andPurchasetotalamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("purchaseTotalAmount >=", value, "purchasetotalamount");
            return (Criteria) this;
        }

        public Criteria andPurchasetotalamountLessThan(BigDecimal value) {
            addCriterion("purchaseTotalAmount <", value, "purchasetotalamount");
            return (Criteria) this;
        }

        public Criteria andPurchasetotalamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("purchaseTotalAmount <=", value, "purchasetotalamount");
            return (Criteria) this;
        }

        public Criteria andPurchasetotalamountIn(List<BigDecimal> values) {
            addCriterion("purchaseTotalAmount in", values, "purchasetotalamount");
            return (Criteria) this;
        }

        public Criteria andPurchasetotalamountNotIn(List<BigDecimal> values) {
            addCriterion("purchaseTotalAmount not in", values, "purchasetotalamount");
            return (Criteria) this;
        }

        public Criteria andPurchasetotalamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("purchaseTotalAmount between", value1, value2, "purchasetotalamount");
            return (Criteria) this;
        }

        public Criteria andPurchasetotalamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("purchaseTotalAmount not between", value1, value2, "purchasetotalamount");
            return (Criteria) this;
        }

        public Criteria andFreighttotalamountIsNull() {
            addCriterion("freightTotalAmount is null");
            return (Criteria) this;
        }

        public Criteria andFreighttotalamountIsNotNull() {
            addCriterion("freightTotalAmount is not null");
            return (Criteria) this;
        }

        public Criteria andFreighttotalamountEqualTo(BigDecimal value) {
            addCriterion("freightTotalAmount =", value, "freighttotalamount");
            return (Criteria) this;
        }

        public Criteria andFreighttotalamountNotEqualTo(BigDecimal value) {
            addCriterion("freightTotalAmount <>", value, "freighttotalamount");
            return (Criteria) this;
        }

        public Criteria andFreighttotalamountGreaterThan(BigDecimal value) {
            addCriterion("freightTotalAmount >", value, "freighttotalamount");
            return (Criteria) this;
        }

        public Criteria andFreighttotalamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("freightTotalAmount >=", value, "freighttotalamount");
            return (Criteria) this;
        }

        public Criteria andFreighttotalamountLessThan(BigDecimal value) {
            addCriterion("freightTotalAmount <", value, "freighttotalamount");
            return (Criteria) this;
        }

        public Criteria andFreighttotalamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("freightTotalAmount <=", value, "freighttotalamount");
            return (Criteria) this;
        }

        public Criteria andFreighttotalamountIn(List<BigDecimal> values) {
            addCriterion("freightTotalAmount in", values, "freighttotalamount");
            return (Criteria) this;
        }

        public Criteria andFreighttotalamountNotIn(List<BigDecimal> values) {
            addCriterion("freightTotalAmount not in", values, "freighttotalamount");
            return (Criteria) this;
        }

        public Criteria andFreighttotalamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("freightTotalAmount between", value1, value2, "freighttotalamount");
            return (Criteria) this;
        }

        public Criteria andFreighttotalamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("freightTotalAmount not between", value1, value2, "freighttotalamount");
            return (Criteria) this;
        }

        public Criteria andStockintotalamountIsNull() {
            addCriterion("stockInTotalAmount is null");
            return (Criteria) this;
        }

        public Criteria andStockintotalamountIsNotNull() {
            addCriterion("stockInTotalAmount is not null");
            return (Criteria) this;
        }

        public Criteria andStockintotalamountEqualTo(BigDecimal value) {
            addCriterion("stockInTotalAmount =", value, "stockintotalamount");
            return (Criteria) this;
        }

        public Criteria andStockintotalamountNotEqualTo(BigDecimal value) {
            addCriterion("stockInTotalAmount <>", value, "stockintotalamount");
            return (Criteria) this;
        }

        public Criteria andStockintotalamountGreaterThan(BigDecimal value) {
            addCriterion("stockInTotalAmount >", value, "stockintotalamount");
            return (Criteria) this;
        }

        public Criteria andStockintotalamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("stockInTotalAmount >=", value, "stockintotalamount");
            return (Criteria) this;
        }

        public Criteria andStockintotalamountLessThan(BigDecimal value) {
            addCriterion("stockInTotalAmount <", value, "stockintotalamount");
            return (Criteria) this;
        }

        public Criteria andStockintotalamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("stockInTotalAmount <=", value, "stockintotalamount");
            return (Criteria) this;
        }

        public Criteria andStockintotalamountIn(List<BigDecimal> values) {
            addCriterion("stockInTotalAmount in", values, "stockintotalamount");
            return (Criteria) this;
        }

        public Criteria andStockintotalamountNotIn(List<BigDecimal> values) {
            addCriterion("stockInTotalAmount not in", values, "stockintotalamount");
            return (Criteria) this;
        }

        public Criteria andStockintotalamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("stockInTotalAmount between", value1, value2, "stockintotalamount");
            return (Criteria) this;
        }

        public Criteria andStockintotalamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("stockInTotalAmount not between", value1, value2, "stockintotalamount");
            return (Criteria) this;
        }

        public Criteria andDefectivetotalamountIsNull() {
            addCriterion("defectiveTotalAmount is null");
            return (Criteria) this;
        }

        public Criteria andDefectivetotalamountIsNotNull() {
            addCriterion("defectiveTotalAmount is not null");
            return (Criteria) this;
        }

        public Criteria andDefectivetotalamountEqualTo(BigDecimal value) {
            addCriterion("defectiveTotalAmount =", value, "defectivetotalamount");
            return (Criteria) this;
        }

        public Criteria andDefectivetotalamountNotEqualTo(BigDecimal value) {
            addCriterion("defectiveTotalAmount <>", value, "defectivetotalamount");
            return (Criteria) this;
        }

        public Criteria andDefectivetotalamountGreaterThan(BigDecimal value) {
            addCriterion("defectiveTotalAmount >", value, "defectivetotalamount");
            return (Criteria) this;
        }

        public Criteria andDefectivetotalamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("defectiveTotalAmount >=", value, "defectivetotalamount");
            return (Criteria) this;
        }

        public Criteria andDefectivetotalamountLessThan(BigDecimal value) {
            addCriterion("defectiveTotalAmount <", value, "defectivetotalamount");
            return (Criteria) this;
        }

        public Criteria andDefectivetotalamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("defectiveTotalAmount <=", value, "defectivetotalamount");
            return (Criteria) this;
        }

        public Criteria andDefectivetotalamountIn(List<BigDecimal> values) {
            addCriterion("defectiveTotalAmount in", values, "defectivetotalamount");
            return (Criteria) this;
        }

        public Criteria andDefectivetotalamountNotIn(List<BigDecimal> values) {
            addCriterion("defectiveTotalAmount not in", values, "defectivetotalamount");
            return (Criteria) this;
        }

        public Criteria andDefectivetotalamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("defectiveTotalAmount between", value1, value2, "defectivetotalamount");
            return (Criteria) this;
        }

        public Criteria andDefectivetotalamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("defectiveTotalAmount not between", value1, value2, "defectivetotalamount");
            return (Criteria) this;
        }

        public Criteria andPayeridIsNull() {
            addCriterion("payerID is null");
            return (Criteria) this;
        }

        public Criteria andPayeridIsNotNull() {
            addCriterion("payerID is not null");
            return (Criteria) this;
        }

        public Criteria andPayeridEqualTo(Integer value) {
            addCriterion("payerID =", value, "payerid");
            return (Criteria) this;
        }

        public Criteria andPayeridNotEqualTo(Integer value) {
            addCriterion("payerID <>", value, "payerid");
            return (Criteria) this;
        }

        public Criteria andPayeridGreaterThan(Integer value) {
            addCriterion("payerID >", value, "payerid");
            return (Criteria) this;
        }

        public Criteria andPayeridGreaterThanOrEqualTo(Integer value) {
            addCriterion("payerID >=", value, "payerid");
            return (Criteria) this;
        }

        public Criteria andPayeridLessThan(Integer value) {
            addCriterion("payerID <", value, "payerid");
            return (Criteria) this;
        }

        public Criteria andPayeridLessThanOrEqualTo(Integer value) {
            addCriterion("payerID <=", value, "payerid");
            return (Criteria) this;
        }

        public Criteria andPayeridIn(List<Integer> values) {
            addCriterion("payerID in", values, "payerid");
            return (Criteria) this;
        }

        public Criteria andPayeridNotIn(List<Integer> values) {
            addCriterion("payerID not in", values, "payerid");
            return (Criteria) this;
        }

        public Criteria andPayeridBetween(Integer value1, Integer value2) {
            addCriterion("payerID between", value1, value2, "payerid");
            return (Criteria) this;
        }

        public Criteria andPayeridNotBetween(Integer value1, Integer value2) {
            addCriterion("payerID not between", value1, value2, "payerid");
            return (Criteria) this;
        }

        public Criteria andPayernameIsNull() {
            addCriterion("payerName is null");
            return (Criteria) this;
        }

        public Criteria andPayernameIsNotNull() {
            addCriterion("payerName is not null");
            return (Criteria) this;
        }

        public Criteria andPayernameEqualTo(String value) {
            addCriterion("payerName =", value, "payername");
            return (Criteria) this;
        }

        public Criteria andPayernameNotEqualTo(String value) {
            addCriterion("payerName <>", value, "payername");
            return (Criteria) this;
        }

        public Criteria andPayernameGreaterThan(String value) {
            addCriterion("payerName >", value, "payername");
            return (Criteria) this;
        }

        public Criteria andPayernameGreaterThanOrEqualTo(String value) {
            addCriterion("payerName >=", value, "payername");
            return (Criteria) this;
        }

        public Criteria andPayernameLessThan(String value) {
            addCriterion("payerName <", value, "payername");
            return (Criteria) this;
        }

        public Criteria andPayernameLessThanOrEqualTo(String value) {
            addCriterion("payerName <=", value, "payername");
            return (Criteria) this;
        }

        public Criteria andPayernameLike(String value) {
            addCriterion("payerName like", value, "payername");
            return (Criteria) this;
        }

        public Criteria andPayernameNotLike(String value) {
            addCriterion("payerName not like", value, "payername");
            return (Criteria) this;
        }

        public Criteria andPayernameIn(List<String> values) {
            addCriterion("payerName in", values, "payername");
            return (Criteria) this;
        }

        public Criteria andPayernameNotIn(List<String> values) {
            addCriterion("payerName not in", values, "payername");
            return (Criteria) this;
        }

        public Criteria andPayernameBetween(String value1, String value2) {
            addCriterion("payerName between", value1, value2, "payername");
            return (Criteria) this;
        }

        public Criteria andPayernameNotBetween(String value1, String value2) {
            addCriterion("payerName not between", value1, value2, "payername");
            return (Criteria) this;
        }

        public Criteria andPaytimeIsNull() {
            addCriterion("payTime is null");
            return (Criteria) this;
        }

        public Criteria andPaytimeIsNotNull() {
            addCriterion("payTime is not null");
            return (Criteria) this;
        }

        public Criteria andPaytimeEqualTo(Date value) {
            addCriterion("payTime =", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotEqualTo(Date value) {
            addCriterion("payTime <>", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeGreaterThan(Date value) {
            addCriterion("payTime >", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("payTime >=", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeLessThan(Date value) {
            addCriterion("payTime <", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeLessThanOrEqualTo(Date value) {
            addCriterion("payTime <=", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeIn(List<Date> values) {
            addCriterion("payTime in", values, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotIn(List<Date> values) {
            addCriterion("payTime not in", values, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeBetween(Date value1, Date value2) {
            addCriterion("payTime between", value1, value2, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotBetween(Date value1, Date value2) {
            addCriterion("payTime not between", value1, value2, "paytime");
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

        public Criteria andCreatenameIsNull() {
            addCriterion("createName is null");
            return (Criteria) this;
        }

        public Criteria andCreatenameIsNotNull() {
            addCriterion("createName is not null");
            return (Criteria) this;
        }

        public Criteria andCreatenameEqualTo(String value) {
            addCriterion("createName =", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameNotEqualTo(String value) {
            addCriterion("createName <>", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameGreaterThan(String value) {
            addCriterion("createName >", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameGreaterThanOrEqualTo(String value) {
            addCriterion("createName >=", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameLessThan(String value) {
            addCriterion("createName <", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameLessThanOrEqualTo(String value) {
            addCriterion("createName <=", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameLike(String value) {
            addCriterion("createName like", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameNotLike(String value) {
            addCriterion("createName not like", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameIn(List<String> values) {
            addCriterion("createName in", values, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameNotIn(List<String> values) {
            addCriterion("createName not in", values, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameBetween(String value1, String value2) {
            addCriterion("createName between", value1, value2, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameNotBetween(String value1, String value2) {
            addCriterion("createName not between", value1, value2, "createname");
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

        public Criteria andCreateidIsNull() {
            addCriterion("createID is null");
            return (Criteria) this;
        }

        public Criteria andCreateidIsNotNull() {
            addCriterion("createID is not null");
            return (Criteria) this;
        }

        public Criteria andCreateidEqualTo(Integer value) {
            addCriterion("createID =", value, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidNotEqualTo(Integer value) {
            addCriterion("createID <>", value, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidGreaterThan(Integer value) {
            addCriterion("createID >", value, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidGreaterThanOrEqualTo(Integer value) {
            addCriterion("createID >=", value, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidLessThan(Integer value) {
            addCriterion("createID <", value, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidLessThanOrEqualTo(Integer value) {
            addCriterion("createID <=", value, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidIn(List<Integer> values) {
            addCriterion("createID in", values, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidNotIn(List<Integer> values) {
            addCriterion("createID not in", values, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidBetween(Integer value1, Integer value2) {
            addCriterion("createID between", value1, value2, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidNotBetween(Integer value1, Integer value2) {
            addCriterion("createID not between", value1, value2, "createid");
            return (Criteria) this;
        }

        public Criteria andHaspaytotalamountIsNull() {
            addCriterion("hasPayTotalAmount is null");
            return (Criteria) this;
        }

        public Criteria andHaspaytotalamountIsNotNull() {
            addCriterion("hasPayTotalAmount is not null");
            return (Criteria) this;
        }

        public Criteria andHaspaytotalamountEqualTo(BigDecimal value) {
            addCriterion("hasPayTotalAmount =", value, "haspaytotalamount");
            return (Criteria) this;
        }

        public Criteria andHaspaytotalamountNotEqualTo(BigDecimal value) {
            addCriterion("hasPayTotalAmount <>", value, "haspaytotalamount");
            return (Criteria) this;
        }

        public Criteria andHaspaytotalamountGreaterThan(BigDecimal value) {
            addCriterion("hasPayTotalAmount >", value, "haspaytotalamount");
            return (Criteria) this;
        }

        public Criteria andHaspaytotalamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("hasPayTotalAmount >=", value, "haspaytotalamount");
            return (Criteria) this;
        }

        public Criteria andHaspaytotalamountLessThan(BigDecimal value) {
            addCriterion("hasPayTotalAmount <", value, "haspaytotalamount");
            return (Criteria) this;
        }

        public Criteria andHaspaytotalamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("hasPayTotalAmount <=", value, "haspaytotalamount");
            return (Criteria) this;
        }

        public Criteria andHaspaytotalamountIn(List<BigDecimal> values) {
            addCriterion("hasPayTotalAmount in", values, "haspaytotalamount");
            return (Criteria) this;
        }

        public Criteria andHaspaytotalamountNotIn(List<BigDecimal> values) {
            addCriterion("hasPayTotalAmount not in", values, "haspaytotalamount");
            return (Criteria) this;
        }

        public Criteria andHaspaytotalamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("hasPayTotalAmount between", value1, value2, "haspaytotalamount");
            return (Criteria) this;
        }

        public Criteria andHaspaytotalamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("hasPayTotalAmount not between", value1, value2, "haspaytotalamount");
            return (Criteria) this;
        }

        public Criteria andFirsttimeIsNull() {
            addCriterion("FirstTime is null");
            return (Criteria) this;
        }

        public Criteria andFirsttimeIsNotNull() {
            addCriterion("FirstTime is not null");
            return (Criteria) this;
        }

        public Criteria andFirsttimeEqualTo(Date value) {
            addCriterion("FirstTime =", value, "firsttime");
            return (Criteria) this;
        }

        public Criteria andFirsttimeNotEqualTo(Date value) {
            addCriterion("FirstTime <>", value, "firsttime");
            return (Criteria) this;
        }

        public Criteria andFirsttimeGreaterThan(Date value) {
            addCriterion("FirstTime >", value, "firsttime");
            return (Criteria) this;
        }

        public Criteria andFirsttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("FirstTime >=", value, "firsttime");
            return (Criteria) this;
        }

        public Criteria andFirsttimeLessThan(Date value) {
            addCriterion("FirstTime <", value, "firsttime");
            return (Criteria) this;
        }

        public Criteria andFirsttimeLessThanOrEqualTo(Date value) {
            addCriterion("FirstTime <=", value, "firsttime");
            return (Criteria) this;
        }

        public Criteria andFirsttimeIn(List<Date> values) {
            addCriterion("FirstTime in", values, "firsttime");
            return (Criteria) this;
        }

        public Criteria andFirsttimeNotIn(List<Date> values) {
            addCriterion("FirstTime not in", values, "firsttime");
            return (Criteria) this;
        }

        public Criteria andFirsttimeBetween(Date value1, Date value2) {
            addCriterion("FirstTime between", value1, value2, "firsttime");
            return (Criteria) this;
        }

        public Criteria andFirsttimeNotBetween(Date value1, Date value2) {
            addCriterion("FirstTime not between", value1, value2, "firsttime");
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