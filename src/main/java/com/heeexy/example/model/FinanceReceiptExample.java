package com.heeexy.example.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FinanceReceiptExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FinanceReceiptExample() {
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

        public Criteria andReceiptidIsNull() {
            addCriterion("receiptID is null");
            return (Criteria) this;
        }

        public Criteria andReceiptidIsNotNull() {
            addCriterion("receiptID is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptidEqualTo(Integer value) {
            addCriterion("receiptID =", value, "receiptid");
            return (Criteria) this;
        }

        public Criteria andReceiptidNotEqualTo(Integer value) {
            addCriterion("receiptID <>", value, "receiptid");
            return (Criteria) this;
        }

        public Criteria andReceiptidGreaterThan(Integer value) {
            addCriterion("receiptID >", value, "receiptid");
            return (Criteria) this;
        }

        public Criteria andReceiptidGreaterThanOrEqualTo(Integer value) {
            addCriterion("receiptID >=", value, "receiptid");
            return (Criteria) this;
        }

        public Criteria andReceiptidLessThan(Integer value) {
            addCriterion("receiptID <", value, "receiptid");
            return (Criteria) this;
        }

        public Criteria andReceiptidLessThanOrEqualTo(Integer value) {
            addCriterion("receiptID <=", value, "receiptid");
            return (Criteria) this;
        }

        public Criteria andReceiptidIn(List<Integer> values) {
            addCriterion("receiptID in", values, "receiptid");
            return (Criteria) this;
        }

        public Criteria andReceiptidNotIn(List<Integer> values) {
            addCriterion("receiptID not in", values, "receiptid");
            return (Criteria) this;
        }

        public Criteria andReceiptidBetween(Integer value1, Integer value2) {
            addCriterion("receiptID between", value1, value2, "receiptid");
            return (Criteria) this;
        }

        public Criteria andReceiptidNotBetween(Integer value1, Integer value2) {
            addCriterion("receiptID not between", value1, value2, "receiptid");
            return (Criteria) this;
        }

        public Criteria andReceiptnumIsNull() {
            addCriterion("receiptNum is null");
            return (Criteria) this;
        }

        public Criteria andReceiptnumIsNotNull() {
            addCriterion("receiptNum is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptnumEqualTo(String value) {
            addCriterion("receiptNum =", value, "receiptnum");
            return (Criteria) this;
        }

        public Criteria andReceiptnumNotEqualTo(String value) {
            addCriterion("receiptNum <>", value, "receiptnum");
            return (Criteria) this;
        }

        public Criteria andReceiptnumGreaterThan(String value) {
            addCriterion("receiptNum >", value, "receiptnum");
            return (Criteria) this;
        }

        public Criteria andReceiptnumGreaterThanOrEqualTo(String value) {
            addCriterion("receiptNum >=", value, "receiptnum");
            return (Criteria) this;
        }

        public Criteria andReceiptnumLessThan(String value) {
            addCriterion("receiptNum <", value, "receiptnum");
            return (Criteria) this;
        }

        public Criteria andReceiptnumLessThanOrEqualTo(String value) {
            addCriterion("receiptNum <=", value, "receiptnum");
            return (Criteria) this;
        }

        public Criteria andReceiptnumLike(String value) {
            addCriterion("receiptNum like", value, "receiptnum");
            return (Criteria) this;
        }

        public Criteria andReceiptnumNotLike(String value) {
            addCriterion("receiptNum not like", value, "receiptnum");
            return (Criteria) this;
        }

        public Criteria andReceiptnumIn(List<String> values) {
            addCriterion("receiptNum in", values, "receiptnum");
            return (Criteria) this;
        }

        public Criteria andReceiptnumNotIn(List<String> values) {
            addCriterion("receiptNum not in", values, "receiptnum");
            return (Criteria) this;
        }

        public Criteria andReceiptnumBetween(String value1, String value2) {
            addCriterion("receiptNum between", value1, value2, "receiptnum");
            return (Criteria) this;
        }

        public Criteria andReceiptnumNotBetween(String value1, String value2) {
            addCriterion("receiptNum not between", value1, value2, "receiptnum");
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

        public Criteria andTransactionnumberIsNull() {
            addCriterion("transactionNumber is null");
            return (Criteria) this;
        }

        public Criteria andTransactionnumberIsNotNull() {
            addCriterion("transactionNumber is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionnumberEqualTo(String value) {
            addCriterion("transactionNumber =", value, "transactionnumber");
            return (Criteria) this;
        }

        public Criteria andTransactionnumberNotEqualTo(String value) {
            addCriterion("transactionNumber <>", value, "transactionnumber");
            return (Criteria) this;
        }

        public Criteria andTransactionnumberGreaterThan(String value) {
            addCriterion("transactionNumber >", value, "transactionnumber");
            return (Criteria) this;
        }

        public Criteria andTransactionnumberGreaterThanOrEqualTo(String value) {
            addCriterion("transactionNumber >=", value, "transactionnumber");
            return (Criteria) this;
        }

        public Criteria andTransactionnumberLessThan(String value) {
            addCriterion("transactionNumber <", value, "transactionnumber");
            return (Criteria) this;
        }

        public Criteria andTransactionnumberLessThanOrEqualTo(String value) {
            addCriterion("transactionNumber <=", value, "transactionnumber");
            return (Criteria) this;
        }

        public Criteria andTransactionnumberLike(String value) {
            addCriterion("transactionNumber like", value, "transactionnumber");
            return (Criteria) this;
        }

        public Criteria andTransactionnumberNotLike(String value) {
            addCriterion("transactionNumber not like", value, "transactionnumber");
            return (Criteria) this;
        }

        public Criteria andTransactionnumberIn(List<String> values) {
            addCriterion("transactionNumber in", values, "transactionnumber");
            return (Criteria) this;
        }

        public Criteria andTransactionnumberNotIn(List<String> values) {
            addCriterion("transactionNumber not in", values, "transactionnumber");
            return (Criteria) this;
        }

        public Criteria andTransactionnumberBetween(String value1, String value2) {
            addCriterion("transactionNumber between", value1, value2, "transactionnumber");
            return (Criteria) this;
        }

        public Criteria andTransactionnumberNotBetween(String value1, String value2) {
            addCriterion("transactionNumber not between", value1, value2, "transactionnumber");
            return (Criteria) this;
        }

        public Criteria andSupplierordernumberIsNull() {
            addCriterion("supplierOrderNumber is null");
            return (Criteria) this;
        }

        public Criteria andSupplierordernumberIsNotNull() {
            addCriterion("supplierOrderNumber is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierordernumberEqualTo(String value) {
            addCriterion("supplierOrderNumber =", value, "supplierordernumber");
            return (Criteria) this;
        }

        public Criteria andSupplierordernumberNotEqualTo(String value) {
            addCriterion("supplierOrderNumber <>", value, "supplierordernumber");
            return (Criteria) this;
        }

        public Criteria andSupplierordernumberGreaterThan(String value) {
            addCriterion("supplierOrderNumber >", value, "supplierordernumber");
            return (Criteria) this;
        }

        public Criteria andSupplierordernumberGreaterThanOrEqualTo(String value) {
            addCriterion("supplierOrderNumber >=", value, "supplierordernumber");
            return (Criteria) this;
        }

        public Criteria andSupplierordernumberLessThan(String value) {
            addCriterion("supplierOrderNumber <", value, "supplierordernumber");
            return (Criteria) this;
        }

        public Criteria andSupplierordernumberLessThanOrEqualTo(String value) {
            addCriterion("supplierOrderNumber <=", value, "supplierordernumber");
            return (Criteria) this;
        }

        public Criteria andSupplierordernumberLike(String value) {
            addCriterion("supplierOrderNumber like", value, "supplierordernumber");
            return (Criteria) this;
        }

        public Criteria andSupplierordernumberNotLike(String value) {
            addCriterion("supplierOrderNumber not like", value, "supplierordernumber");
            return (Criteria) this;
        }

        public Criteria andSupplierordernumberIn(List<String> values) {
            addCriterion("supplierOrderNumber in", values, "supplierordernumber");
            return (Criteria) this;
        }

        public Criteria andSupplierordernumberNotIn(List<String> values) {
            addCriterion("supplierOrderNumber not in", values, "supplierordernumber");
            return (Criteria) this;
        }

        public Criteria andSupplierordernumberBetween(String value1, String value2) {
            addCriterion("supplierOrderNumber between", value1, value2, "supplierordernumber");
            return (Criteria) this;
        }

        public Criteria andSupplierordernumberNotBetween(String value1, String value2) {
            addCriterion("supplierOrderNumber not between", value1, value2, "supplierordernumber");
            return (Criteria) this;
        }

        public Criteria andIsneedrefundIsNull() {
            addCriterion("isNeedRefund is null");
            return (Criteria) this;
        }

        public Criteria andIsneedrefundIsNotNull() {
            addCriterion("isNeedRefund is not null");
            return (Criteria) this;
        }

        public Criteria andIsneedrefundEqualTo(Integer value) {
            addCriterion("isNeedRefund =", value, "isneedrefund");
            return (Criteria) this;
        }

        public Criteria andIsneedrefundNotEqualTo(Integer value) {
            addCriterion("isNeedRefund <>", value, "isneedrefund");
            return (Criteria) this;
        }

        public Criteria andIsneedrefundGreaterThan(Integer value) {
            addCriterion("isNeedRefund >", value, "isneedrefund");
            return (Criteria) this;
        }

        public Criteria andIsneedrefundGreaterThanOrEqualTo(Integer value) {
            addCriterion("isNeedRefund >=", value, "isneedrefund");
            return (Criteria) this;
        }

        public Criteria andIsneedrefundLessThan(Integer value) {
            addCriterion("isNeedRefund <", value, "isneedrefund");
            return (Criteria) this;
        }

        public Criteria andIsneedrefundLessThanOrEqualTo(Integer value) {
            addCriterion("isNeedRefund <=", value, "isneedrefund");
            return (Criteria) this;
        }

        public Criteria andIsneedrefundIn(List<Integer> values) {
            addCriterion("isNeedRefund in", values, "isneedrefund");
            return (Criteria) this;
        }

        public Criteria andIsneedrefundNotIn(List<Integer> values) {
            addCriterion("isNeedRefund not in", values, "isneedrefund");
            return (Criteria) this;
        }

        public Criteria andIsneedrefundBetween(Integer value1, Integer value2) {
            addCriterion("isNeedRefund between", value1, value2, "isneedrefund");
            return (Criteria) this;
        }

        public Criteria andIsneedrefundNotBetween(Integer value1, Integer value2) {
            addCriterion("isNeedRefund not between", value1, value2, "isneedrefund");
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

        public Criteria andReceivetotalamountIsNull() {
            addCriterion("receiveTotalAmount is null");
            return (Criteria) this;
        }

        public Criteria andReceivetotalamountIsNotNull() {
            addCriterion("receiveTotalAmount is not null");
            return (Criteria) this;
        }

        public Criteria andReceivetotalamountEqualTo(Double value) {
            addCriterion("receiveTotalAmount =", value, "receivetotalamount");
            return (Criteria) this;
        }

        public Criteria andReceivetotalamountNotEqualTo(Double value) {
            addCriterion("receiveTotalAmount <>", value, "receivetotalamount");
            return (Criteria) this;
        }

        public Criteria andReceivetotalamountGreaterThan(Double value) {
            addCriterion("receiveTotalAmount >", value, "receivetotalamount");
            return (Criteria) this;
        }

        public Criteria andReceivetotalamountGreaterThanOrEqualTo(Double value) {
            addCriterion("receiveTotalAmount >=", value, "receivetotalamount");
            return (Criteria) this;
        }

        public Criteria andReceivetotalamountLessThan(Double value) {
            addCriterion("receiveTotalAmount <", value, "receivetotalamount");
            return (Criteria) this;
        }

        public Criteria andReceivetotalamountLessThanOrEqualTo(Double value) {
            addCriterion("receiveTotalAmount <=", value, "receivetotalamount");
            return (Criteria) this;
        }

        public Criteria andReceivetotalamountIn(List<Double> values) {
            addCriterion("receiveTotalAmount in", values, "receivetotalamount");
            return (Criteria) this;
        }

        public Criteria andReceivetotalamountNotIn(List<Double> values) {
            addCriterion("receiveTotalAmount not in", values, "receivetotalamount");
            return (Criteria) this;
        }

        public Criteria andReceivetotalamountBetween(Double value1, Double value2) {
            addCriterion("receiveTotalAmount between", value1, value2, "receivetotalamount");
            return (Criteria) this;
        }

        public Criteria andReceivetotalamountNotBetween(Double value1, Double value2) {
            addCriterion("receiveTotalAmount not between", value1, value2, "receivetotalamount");
            return (Criteria) this;
        }

        public Criteria andAgreedtotalamountIsNull() {
            addCriterion("agreedTotalAmount is null");
            return (Criteria) this;
        }

        public Criteria andAgreedtotalamountIsNotNull() {
            addCriterion("agreedTotalAmount is not null");
            return (Criteria) this;
        }

        public Criteria andAgreedtotalamountEqualTo(Double value) {
            addCriterion("agreedTotalAmount =", value, "agreedtotalamount");
            return (Criteria) this;
        }

        public Criteria andAgreedtotalamountNotEqualTo(Double value) {
            addCriterion("agreedTotalAmount <>", value, "agreedtotalamount");
            return (Criteria) this;
        }

        public Criteria andAgreedtotalamountGreaterThan(Double value) {
            addCriterion("agreedTotalAmount >", value, "agreedtotalamount");
            return (Criteria) this;
        }

        public Criteria andAgreedtotalamountGreaterThanOrEqualTo(Double value) {
            addCriterion("agreedTotalAmount >=", value, "agreedtotalamount");
            return (Criteria) this;
        }

        public Criteria andAgreedtotalamountLessThan(Double value) {
            addCriterion("agreedTotalAmount <", value, "agreedtotalamount");
            return (Criteria) this;
        }

        public Criteria andAgreedtotalamountLessThanOrEqualTo(Double value) {
            addCriterion("agreedTotalAmount <=", value, "agreedtotalamount");
            return (Criteria) this;
        }

        public Criteria andAgreedtotalamountIn(List<Double> values) {
            addCriterion("agreedTotalAmount in", values, "agreedtotalamount");
            return (Criteria) this;
        }

        public Criteria andAgreedtotalamountNotIn(List<Double> values) {
            addCriterion("agreedTotalAmount not in", values, "agreedtotalamount");
            return (Criteria) this;
        }

        public Criteria andAgreedtotalamountBetween(Double value1, Double value2) {
            addCriterion("agreedTotalAmount between", value1, value2, "agreedtotalamount");
            return (Criteria) this;
        }

        public Criteria andAgreedtotalamountNotBetween(Double value1, Double value2) {
            addCriterion("agreedTotalAmount not between", value1, value2, "agreedtotalamount");
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

        public Criteria andReceiveridIsNull() {
            addCriterion("receiverID is null");
            return (Criteria) this;
        }

        public Criteria andReceiveridIsNotNull() {
            addCriterion("receiverID is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveridEqualTo(Integer value) {
            addCriterion("receiverID =", value, "receiverid");
            return (Criteria) this;
        }

        public Criteria andReceiveridNotEqualTo(Integer value) {
            addCriterion("receiverID <>", value, "receiverid");
            return (Criteria) this;
        }

        public Criteria andReceiveridGreaterThan(Integer value) {
            addCriterion("receiverID >", value, "receiverid");
            return (Criteria) this;
        }

        public Criteria andReceiveridGreaterThanOrEqualTo(Integer value) {
            addCriterion("receiverID >=", value, "receiverid");
            return (Criteria) this;
        }

        public Criteria andReceiveridLessThan(Integer value) {
            addCriterion("receiverID <", value, "receiverid");
            return (Criteria) this;
        }

        public Criteria andReceiveridLessThanOrEqualTo(Integer value) {
            addCriterion("receiverID <=", value, "receiverid");
            return (Criteria) this;
        }

        public Criteria andReceiveridIn(List<Integer> values) {
            addCriterion("receiverID in", values, "receiverid");
            return (Criteria) this;
        }

        public Criteria andReceiveridNotIn(List<Integer> values) {
            addCriterion("receiverID not in", values, "receiverid");
            return (Criteria) this;
        }

        public Criteria andReceiveridBetween(Integer value1, Integer value2) {
            addCriterion("receiverID between", value1, value2, "receiverid");
            return (Criteria) this;
        }

        public Criteria andReceiveridNotBetween(Integer value1, Integer value2) {
            addCriterion("receiverID not between", value1, value2, "receiverid");
            return (Criteria) this;
        }

        public Criteria andReceivetimeIsNull() {
            addCriterion("receiveTime is null");
            return (Criteria) this;
        }

        public Criteria andReceivetimeIsNotNull() {
            addCriterion("receiveTime is not null");
            return (Criteria) this;
        }

        public Criteria andReceivetimeEqualTo(Date value) {
            addCriterion("receiveTime =", value, "receivetime");
            return (Criteria) this;
        }

        public Criteria andReceivetimeNotEqualTo(Date value) {
            addCriterion("receiveTime <>", value, "receivetime");
            return (Criteria) this;
        }

        public Criteria andReceivetimeGreaterThan(Date value) {
            addCriterion("receiveTime >", value, "receivetime");
            return (Criteria) this;
        }

        public Criteria andReceivetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("receiveTime >=", value, "receivetime");
            return (Criteria) this;
        }

        public Criteria andReceivetimeLessThan(Date value) {
            addCriterion("receiveTime <", value, "receivetime");
            return (Criteria) this;
        }

        public Criteria andReceivetimeLessThanOrEqualTo(Date value) {
            addCriterion("receiveTime <=", value, "receivetime");
            return (Criteria) this;
        }

        public Criteria andReceivetimeIn(List<Date> values) {
            addCriterion("receiveTime in", values, "receivetime");
            return (Criteria) this;
        }

        public Criteria andReceivetimeNotIn(List<Date> values) {
            addCriterion("receiveTime not in", values, "receivetime");
            return (Criteria) this;
        }

        public Criteria andReceivetimeBetween(Date value1, Date value2) {
            addCriterion("receiveTime between", value1, value2, "receivetime");
            return (Criteria) this;
        }

        public Criteria andReceivetimeNotBetween(Date value1, Date value2) {
            addCriterion("receiveTime not between", value1, value2, "receivetime");
            return (Criteria) this;
        }

        public Criteria andApplyreasonIsNull() {
            addCriterion("applyReason is null");
            return (Criteria) this;
        }

        public Criteria andApplyreasonIsNotNull() {
            addCriterion("applyReason is not null");
            return (Criteria) this;
        }

        public Criteria andApplyreasonEqualTo(String value) {
            addCriterion("applyReason =", value, "applyreason");
            return (Criteria) this;
        }

        public Criteria andApplyreasonNotEqualTo(String value) {
            addCriterion("applyReason <>", value, "applyreason");
            return (Criteria) this;
        }

        public Criteria andApplyreasonGreaterThan(String value) {
            addCriterion("applyReason >", value, "applyreason");
            return (Criteria) this;
        }

        public Criteria andApplyreasonGreaterThanOrEqualTo(String value) {
            addCriterion("applyReason >=", value, "applyreason");
            return (Criteria) this;
        }

        public Criteria andApplyreasonLessThan(String value) {
            addCriterion("applyReason <", value, "applyreason");
            return (Criteria) this;
        }

        public Criteria andApplyreasonLessThanOrEqualTo(String value) {
            addCriterion("applyReason <=", value, "applyreason");
            return (Criteria) this;
        }

        public Criteria andApplyreasonLike(String value) {
            addCriterion("applyReason like", value, "applyreason");
            return (Criteria) this;
        }

        public Criteria andApplyreasonNotLike(String value) {
            addCriterion("applyReason not like", value, "applyreason");
            return (Criteria) this;
        }

        public Criteria andApplyreasonIn(List<String> values) {
            addCriterion("applyReason in", values, "applyreason");
            return (Criteria) this;
        }

        public Criteria andApplyreasonNotIn(List<String> values) {
            addCriterion("applyReason not in", values, "applyreason");
            return (Criteria) this;
        }

        public Criteria andApplyreasonBetween(String value1, String value2) {
            addCriterion("applyReason between", value1, value2, "applyreason");
            return (Criteria) this;
        }

        public Criteria andApplyreasonNotBetween(String value1, String value2) {
            addCriterion("applyReason not between", value1, value2, "applyreason");
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