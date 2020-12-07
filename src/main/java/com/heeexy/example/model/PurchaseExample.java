package com.heeexy.example.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PurchaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PurchaseExample() {
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

        public Criteria andSpecialstatusIsNull() {
            addCriterion("specialStatus is null");
            return (Criteria) this;
        }

        public Criteria andSpecialstatusIsNotNull() {
            addCriterion("specialStatus is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialstatusEqualTo(Byte value) {
            addCriterion("specialStatus =", value, "specialstatus");
            return (Criteria) this;
        }

        public Criteria andSpecialstatusNotEqualTo(Byte value) {
            addCriterion("specialStatus <>", value, "specialstatus");
            return (Criteria) this;
        }

        public Criteria andSpecialstatusGreaterThan(Byte value) {
            addCriterion("specialStatus >", value, "specialstatus");
            return (Criteria) this;
        }

        public Criteria andSpecialstatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("specialStatus >=", value, "specialstatus");
            return (Criteria) this;
        }

        public Criteria andSpecialstatusLessThan(Byte value) {
            addCriterion("specialStatus <", value, "specialstatus");
            return (Criteria) this;
        }

        public Criteria andSpecialstatusLessThanOrEqualTo(Byte value) {
            addCriterion("specialStatus <=", value, "specialstatus");
            return (Criteria) this;
        }

        public Criteria andSpecialstatusIn(List<Byte> values) {
            addCriterion("specialStatus in", values, "specialstatus");
            return (Criteria) this;
        }

        public Criteria andSpecialstatusNotIn(List<Byte> values) {
            addCriterion("specialStatus not in", values, "specialstatus");
            return (Criteria) this;
        }

        public Criteria andSpecialstatusBetween(Byte value1, Byte value2) {
            addCriterion("specialStatus between", value1, value2, "specialstatus");
            return (Criteria) this;
        }

        public Criteria andSpecialstatusNotBetween(Byte value1, Byte value2) {
            addCriterion("specialStatus not between", value1, value2, "specialstatus");
            return (Criteria) this;
        }

        public Criteria andPurchasestatusIsNull() {
            addCriterion("purchaseStatus is null");
            return (Criteria) this;
        }

        public Criteria andPurchasestatusIsNotNull() {
            addCriterion("purchaseStatus is not null");
            return (Criteria) this;
        }

        public Criteria andPurchasestatusEqualTo(Byte value) {
            addCriterion("purchaseStatus =", value, "purchasestatus");
            return (Criteria) this;
        }

        public Criteria andPurchasestatusNotEqualTo(Byte value) {
            addCriterion("purchaseStatus <>", value, "purchasestatus");
            return (Criteria) this;
        }

        public Criteria andPurchasestatusGreaterThan(Byte value) {
            addCriterion("purchaseStatus >", value, "purchasestatus");
            return (Criteria) this;
        }

        public Criteria andPurchasestatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("purchaseStatus >=", value, "purchasestatus");
            return (Criteria) this;
        }

        public Criteria andPurchasestatusLessThan(Byte value) {
            addCriterion("purchaseStatus <", value, "purchasestatus");
            return (Criteria) this;
        }

        public Criteria andPurchasestatusLessThanOrEqualTo(Byte value) {
            addCriterion("purchaseStatus <=", value, "purchasestatus");
            return (Criteria) this;
        }

        public Criteria andPurchasestatusIn(List<Byte> values) {
            addCriterion("purchaseStatus in", values, "purchasestatus");
            return (Criteria) this;
        }

        public Criteria andPurchasestatusNotIn(List<Byte> values) {
            addCriterion("purchaseStatus not in", values, "purchasestatus");
            return (Criteria) this;
        }

        public Criteria andPurchasestatusBetween(Byte value1, Byte value2) {
            addCriterion("purchaseStatus between", value1, value2, "purchasestatus");
            return (Criteria) this;
        }

        public Criteria andPurchasestatusNotBetween(Byte value1, Byte value2) {
            addCriterion("purchaseStatus not between", value1, value2, "purchasestatus");
            return (Criteria) this;
        }

        public Criteria andFinancestatusIsNull() {
            addCriterion("financeStatus is null");
            return (Criteria) this;
        }

        public Criteria andFinancestatusIsNotNull() {
            addCriterion("financeStatus is not null");
            return (Criteria) this;
        }

        public Criteria andFinancestatusEqualTo(Byte value) {
            addCriterion("financeStatus =", value, "financestatus");
            return (Criteria) this;
        }

        public Criteria andFinancestatusNotEqualTo(Byte value) {
            addCriterion("financeStatus <>", value, "financestatus");
            return (Criteria) this;
        }

        public Criteria andFinancestatusGreaterThan(Byte value) {
            addCriterion("financeStatus >", value, "financestatus");
            return (Criteria) this;
        }

        public Criteria andFinancestatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("financeStatus >=", value, "financestatus");
            return (Criteria) this;
        }

        public Criteria andFinancestatusLessThan(Byte value) {
            addCriterion("financeStatus <", value, "financestatus");
            return (Criteria) this;
        }

        public Criteria andFinancestatusLessThanOrEqualTo(Byte value) {
            addCriterion("financeStatus <=", value, "financestatus");
            return (Criteria) this;
        }

        public Criteria andFinancestatusIn(List<Byte> values) {
            addCriterion("financeStatus in", values, "financestatus");
            return (Criteria) this;
        }

        public Criteria andFinancestatusNotIn(List<Byte> values) {
            addCriterion("financeStatus not in", values, "financestatus");
            return (Criteria) this;
        }

        public Criteria andFinancestatusBetween(Byte value1, Byte value2) {
            addCriterion("financeStatus between", value1, value2, "financestatus");
            return (Criteria) this;
        }

        public Criteria andFinancestatusNotBetween(Byte value1, Byte value2) {
            addCriterion("financeStatus not between", value1, value2, "financestatus");
            return (Criteria) this;
        }

        public Criteria andCnwarehouseinstatusIsNull() {
            addCriterion("cnWarehouseInStatus is null");
            return (Criteria) this;
        }

        public Criteria andCnwarehouseinstatusIsNotNull() {
            addCriterion("cnWarehouseInStatus is not null");
            return (Criteria) this;
        }

        public Criteria andCnwarehouseinstatusEqualTo(Byte value) {
            addCriterion("cnWarehouseInStatus =", value, "cnwarehouseinstatus");
            return (Criteria) this;
        }

        public Criteria andCnwarehouseinstatusNotEqualTo(Byte value) {
            addCriterion("cnWarehouseInStatus <>", value, "cnwarehouseinstatus");
            return (Criteria) this;
        }

        public Criteria andCnwarehouseinstatusGreaterThan(Byte value) {
            addCriterion("cnWarehouseInStatus >", value, "cnwarehouseinstatus");
            return (Criteria) this;
        }

        public Criteria andCnwarehouseinstatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("cnWarehouseInStatus >=", value, "cnwarehouseinstatus");
            return (Criteria) this;
        }

        public Criteria andCnwarehouseinstatusLessThan(Byte value) {
            addCriterion("cnWarehouseInStatus <", value, "cnwarehouseinstatus");
            return (Criteria) this;
        }

        public Criteria andCnwarehouseinstatusLessThanOrEqualTo(Byte value) {
            addCriterion("cnWarehouseInStatus <=", value, "cnwarehouseinstatus");
            return (Criteria) this;
        }

        public Criteria andCnwarehouseinstatusIn(List<Byte> values) {
            addCriterion("cnWarehouseInStatus in", values, "cnwarehouseinstatus");
            return (Criteria) this;
        }

        public Criteria andCnwarehouseinstatusNotIn(List<Byte> values) {
            addCriterion("cnWarehouseInStatus not in", values, "cnwarehouseinstatus");
            return (Criteria) this;
        }

        public Criteria andCnwarehouseinstatusBetween(Byte value1, Byte value2) {
            addCriterion("cnWarehouseInStatus between", value1, value2, "cnwarehouseinstatus");
            return (Criteria) this;
        }

        public Criteria andCnwarehouseinstatusNotBetween(Byte value1, Byte value2) {
            addCriterion("cnWarehouseInStatus not between", value1, value2, "cnwarehouseinstatus");
            return (Criteria) this;
        }

        public Criteria andCnwarehouseoutstatusIsNull() {
            addCriterion("cnWarehouseOutStatus is null");
            return (Criteria) this;
        }

        public Criteria andCnwarehouseoutstatusIsNotNull() {
            addCriterion("cnWarehouseOutStatus is not null");
            return (Criteria) this;
        }

        public Criteria andCnwarehouseoutstatusEqualTo(Byte value) {
            addCriterion("cnWarehouseOutStatus =", value, "cnwarehouseoutstatus");
            return (Criteria) this;
        }

        public Criteria andCnwarehouseoutstatusNotEqualTo(Byte value) {
            addCriterion("cnWarehouseOutStatus <>", value, "cnwarehouseoutstatus");
            return (Criteria) this;
        }

        public Criteria andCnwarehouseoutstatusGreaterThan(Byte value) {
            addCriterion("cnWarehouseOutStatus >", value, "cnwarehouseoutstatus");
            return (Criteria) this;
        }

        public Criteria andCnwarehouseoutstatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("cnWarehouseOutStatus >=", value, "cnwarehouseoutstatus");
            return (Criteria) this;
        }

        public Criteria andCnwarehouseoutstatusLessThan(Byte value) {
            addCriterion("cnWarehouseOutStatus <", value, "cnwarehouseoutstatus");
            return (Criteria) this;
        }

        public Criteria andCnwarehouseoutstatusLessThanOrEqualTo(Byte value) {
            addCriterion("cnWarehouseOutStatus <=", value, "cnwarehouseoutstatus");
            return (Criteria) this;
        }

        public Criteria andCnwarehouseoutstatusIn(List<Byte> values) {
            addCriterion("cnWarehouseOutStatus in", values, "cnwarehouseoutstatus");
            return (Criteria) this;
        }

        public Criteria andCnwarehouseoutstatusNotIn(List<Byte> values) {
            addCriterion("cnWarehouseOutStatus not in", values, "cnwarehouseoutstatus");
            return (Criteria) this;
        }

        public Criteria andCnwarehouseoutstatusBetween(Byte value1, Byte value2) {
            addCriterion("cnWarehouseOutStatus between", value1, value2, "cnwarehouseoutstatus");
            return (Criteria) this;
        }

        public Criteria andCnwarehouseoutstatusNotBetween(Byte value1, Byte value2) {
            addCriterion("cnWarehouseOutStatus not between", value1, value2, "cnwarehouseoutstatus");
            return (Criteria) this;
        }

        public Criteria andPurchasetotalquantityIsNull() {
            addCriterion("purchaseTotalQuantity is null");
            return (Criteria) this;
        }

        public Criteria andPurchasetotalquantityIsNotNull() {
            addCriterion("purchaseTotalQuantity is not null");
            return (Criteria) this;
        }

        public Criteria andPurchasetotalquantityEqualTo(Integer value) {
            addCriterion("purchaseTotalQuantity =", value, "purchasetotalquantity");
            return (Criteria) this;
        }

        public Criteria andPurchasetotalquantityNotEqualTo(Integer value) {
            addCriterion("purchaseTotalQuantity <>", value, "purchasetotalquantity");
            return (Criteria) this;
        }

        public Criteria andPurchasetotalquantityGreaterThan(Integer value) {
            addCriterion("purchaseTotalQuantity >", value, "purchasetotalquantity");
            return (Criteria) this;
        }

        public Criteria andPurchasetotalquantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("purchaseTotalQuantity >=", value, "purchasetotalquantity");
            return (Criteria) this;
        }

        public Criteria andPurchasetotalquantityLessThan(Integer value) {
            addCriterion("purchaseTotalQuantity <", value, "purchasetotalquantity");
            return (Criteria) this;
        }

        public Criteria andPurchasetotalquantityLessThanOrEqualTo(Integer value) {
            addCriterion("purchaseTotalQuantity <=", value, "purchasetotalquantity");
            return (Criteria) this;
        }

        public Criteria andPurchasetotalquantityIn(List<Integer> values) {
            addCriterion("purchaseTotalQuantity in", values, "purchasetotalquantity");
            return (Criteria) this;
        }

        public Criteria andPurchasetotalquantityNotIn(List<Integer> values) {
            addCriterion("purchaseTotalQuantity not in", values, "purchasetotalquantity");
            return (Criteria) this;
        }

        public Criteria andPurchasetotalquantityBetween(Integer value1, Integer value2) {
            addCriterion("purchaseTotalQuantity between", value1, value2, "purchasetotalquantity");
            return (Criteria) this;
        }

        public Criteria andPurchasetotalquantityNotBetween(Integer value1, Integer value2) {
            addCriterion("purchaseTotalQuantity not between", value1, value2, "purchasetotalquantity");
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

        public Criteria andPaidtotalamountIsNull() {
            addCriterion("paidTotalAmount is null");
            return (Criteria) this;
        }

        public Criteria andPaidtotalamountIsNotNull() {
            addCriterion("paidTotalAmount is not null");
            return (Criteria) this;
        }

        public Criteria andPaidtotalamountEqualTo(BigDecimal value) {
            addCriterion("paidTotalAmount =", value, "paidtotalamount");
            return (Criteria) this;
        }

        public Criteria andPaidtotalamountNotEqualTo(BigDecimal value) {
            addCriterion("paidTotalAmount <>", value, "paidtotalamount");
            return (Criteria) this;
        }

        public Criteria andPaidtotalamountGreaterThan(BigDecimal value) {
            addCriterion("paidTotalAmount >", value, "paidtotalamount");
            return (Criteria) this;
        }

        public Criteria andPaidtotalamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("paidTotalAmount >=", value, "paidtotalamount");
            return (Criteria) this;
        }

        public Criteria andPaidtotalamountLessThan(BigDecimal value) {
            addCriterion("paidTotalAmount <", value, "paidtotalamount");
            return (Criteria) this;
        }

        public Criteria andPaidtotalamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("paidTotalAmount <=", value, "paidtotalamount");
            return (Criteria) this;
        }

        public Criteria andPaidtotalamountIn(List<BigDecimal> values) {
            addCriterion("paidTotalAmount in", values, "paidtotalamount");
            return (Criteria) this;
        }

        public Criteria andPaidtotalamountNotIn(List<BigDecimal> values) {
            addCriterion("paidTotalAmount not in", values, "paidtotalamount");
            return (Criteria) this;
        }

        public Criteria andPaidtotalamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("paidTotalAmount between", value1, value2, "paidtotalamount");
            return (Criteria) this;
        }

        public Criteria andPaidtotalamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("paidTotalAmount not between", value1, value2, "paidtotalamount");
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

        public Criteria andFinanceauditornameIsNull() {
            addCriterion("financeAuditorName is null");
            return (Criteria) this;
        }

        public Criteria andFinanceauditornameIsNotNull() {
            addCriterion("financeAuditorName is not null");
            return (Criteria) this;
        }

        public Criteria andFinanceauditornameEqualTo(String value) {
            addCriterion("financeAuditorName =", value, "financeauditorname");
            return (Criteria) this;
        }

        public Criteria andFinanceauditornameNotEqualTo(String value) {
            addCriterion("financeAuditorName <>", value, "financeauditorname");
            return (Criteria) this;
        }

        public Criteria andFinanceauditornameGreaterThan(String value) {
            addCriterion("financeAuditorName >", value, "financeauditorname");
            return (Criteria) this;
        }

        public Criteria andFinanceauditornameGreaterThanOrEqualTo(String value) {
            addCriterion("financeAuditorName >=", value, "financeauditorname");
            return (Criteria) this;
        }

        public Criteria andFinanceauditornameLessThan(String value) {
            addCriterion("financeAuditorName <", value, "financeauditorname");
            return (Criteria) this;
        }

        public Criteria andFinanceauditornameLessThanOrEqualTo(String value) {
            addCriterion("financeAuditorName <=", value, "financeauditorname");
            return (Criteria) this;
        }

        public Criteria andFinanceauditornameLike(String value) {
            addCriterion("financeAuditorName like", value, "financeauditorname");
            return (Criteria) this;
        }

        public Criteria andFinanceauditornameNotLike(String value) {
            addCriterion("financeAuditorName not like", value, "financeauditorname");
            return (Criteria) this;
        }

        public Criteria andFinanceauditornameIn(List<String> values) {
            addCriterion("financeAuditorName in", values, "financeauditorname");
            return (Criteria) this;
        }

        public Criteria andFinanceauditornameNotIn(List<String> values) {
            addCriterion("financeAuditorName not in", values, "financeauditorname");
            return (Criteria) this;
        }

        public Criteria andFinanceauditornameBetween(String value1, String value2) {
            addCriterion("financeAuditorName between", value1, value2, "financeauditorname");
            return (Criteria) this;
        }

        public Criteria andFinanceauditornameNotBetween(String value1, String value2) {
            addCriterion("financeAuditorName not between", value1, value2, "financeauditorname");
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

        public Criteria andStockintotalquantityIsNull() {
            addCriterion("stockInTotalQuantity is null");
            return (Criteria) this;
        }

        public Criteria andStockintotalquantityIsNotNull() {
            addCriterion("stockInTotalQuantity is not null");
            return (Criteria) this;
        }

        public Criteria andStockintotalquantityEqualTo(Integer value) {
            addCriterion("stockInTotalQuantity =", value, "stockintotalquantity");
            return (Criteria) this;
        }

        public Criteria andStockintotalquantityNotEqualTo(Integer value) {
            addCriterion("stockInTotalQuantity <>", value, "stockintotalquantity");
            return (Criteria) this;
        }

        public Criteria andStockintotalquantityGreaterThan(Integer value) {
            addCriterion("stockInTotalQuantity >", value, "stockintotalquantity");
            return (Criteria) this;
        }

        public Criteria andStockintotalquantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("stockInTotalQuantity >=", value, "stockintotalquantity");
            return (Criteria) this;
        }

        public Criteria andStockintotalquantityLessThan(Integer value) {
            addCriterion("stockInTotalQuantity <", value, "stockintotalquantity");
            return (Criteria) this;
        }

        public Criteria andStockintotalquantityLessThanOrEqualTo(Integer value) {
            addCriterion("stockInTotalQuantity <=", value, "stockintotalquantity");
            return (Criteria) this;
        }

        public Criteria andStockintotalquantityIn(List<Integer> values) {
            addCriterion("stockInTotalQuantity in", values, "stockintotalquantity");
            return (Criteria) this;
        }

        public Criteria andStockintotalquantityNotIn(List<Integer> values) {
            addCriterion("stockInTotalQuantity not in", values, "stockintotalquantity");
            return (Criteria) this;
        }

        public Criteria andStockintotalquantityBetween(Integer value1, Integer value2) {
            addCriterion("stockInTotalQuantity between", value1, value2, "stockintotalquantity");
            return (Criteria) this;
        }

        public Criteria andStockintotalquantityNotBetween(Integer value1, Integer value2) {
            addCriterion("stockInTotalQuantity not between", value1, value2, "stockintotalquantity");
            return (Criteria) this;
        }

        public Criteria andDefectivetotalquantityIsNull() {
            addCriterion("defectiveTotalQuantity is null");
            return (Criteria) this;
        }

        public Criteria andDefectivetotalquantityIsNotNull() {
            addCriterion("defectiveTotalQuantity is not null");
            return (Criteria) this;
        }

        public Criteria andDefectivetotalquantityEqualTo(Integer value) {
            addCriterion("defectiveTotalQuantity =", value, "defectivetotalquantity");
            return (Criteria) this;
        }

        public Criteria andDefectivetotalquantityNotEqualTo(Integer value) {
            addCriterion("defectiveTotalQuantity <>", value, "defectivetotalquantity");
            return (Criteria) this;
        }

        public Criteria andDefectivetotalquantityGreaterThan(Integer value) {
            addCriterion("defectiveTotalQuantity >", value, "defectivetotalquantity");
            return (Criteria) this;
        }

        public Criteria andDefectivetotalquantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("defectiveTotalQuantity >=", value, "defectivetotalquantity");
            return (Criteria) this;
        }

        public Criteria andDefectivetotalquantityLessThan(Integer value) {
            addCriterion("defectiveTotalQuantity <", value, "defectivetotalquantity");
            return (Criteria) this;
        }

        public Criteria andDefectivetotalquantityLessThanOrEqualTo(Integer value) {
            addCriterion("defectiveTotalQuantity <=", value, "defectivetotalquantity");
            return (Criteria) this;
        }

        public Criteria andDefectivetotalquantityIn(List<Integer> values) {
            addCriterion("defectiveTotalQuantity in", values, "defectivetotalquantity");
            return (Criteria) this;
        }

        public Criteria andDefectivetotalquantityNotIn(List<Integer> values) {
            addCriterion("defectiveTotalQuantity not in", values, "defectivetotalquantity");
            return (Criteria) this;
        }

        public Criteria andDefectivetotalquantityBetween(Integer value1, Integer value2) {
            addCriterion("defectiveTotalQuantity between", value1, value2, "defectivetotalquantity");
            return (Criteria) this;
        }

        public Criteria andDefectivetotalquantityNotBetween(Integer value1, Integer value2) {
            addCriterion("defectiveTotalQuantity not between", value1, value2, "defectivetotalquantity");
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

        public Criteria andUpdateidIsNull() {
            addCriterion("updateID is null");
            return (Criteria) this;
        }

        public Criteria andUpdateidIsNotNull() {
            addCriterion("updateID is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateidEqualTo(Integer value) {
            addCriterion("updateID =", value, "updateid");
            return (Criteria) this;
        }

        public Criteria andUpdateidNotEqualTo(Integer value) {
            addCriterion("updateID <>", value, "updateid");
            return (Criteria) this;
        }

        public Criteria andUpdateidGreaterThan(Integer value) {
            addCriterion("updateID >", value, "updateid");
            return (Criteria) this;
        }

        public Criteria andUpdateidGreaterThanOrEqualTo(Integer value) {
            addCriterion("updateID >=", value, "updateid");
            return (Criteria) this;
        }

        public Criteria andUpdateidLessThan(Integer value) {
            addCriterion("updateID <", value, "updateid");
            return (Criteria) this;
        }

        public Criteria andUpdateidLessThanOrEqualTo(Integer value) {
            addCriterion("updateID <=", value, "updateid");
            return (Criteria) this;
        }

        public Criteria andUpdateidIn(List<Integer> values) {
            addCriterion("updateID in", values, "updateid");
            return (Criteria) this;
        }

        public Criteria andUpdateidNotIn(List<Integer> values) {
            addCriterion("updateID not in", values, "updateid");
            return (Criteria) this;
        }

        public Criteria andUpdateidBetween(Integer value1, Integer value2) {
            addCriterion("updateID between", value1, value2, "updateid");
            return (Criteria) this;
        }

        public Criteria andUpdateidNotBetween(Integer value1, Integer value2) {
            addCriterion("updateID not between", value1, value2, "updateid");
            return (Criteria) this;
        }

        public Criteria andUpdatenameIsNull() {
            addCriterion("updateName is null");
            return (Criteria) this;
        }

        public Criteria andUpdatenameIsNotNull() {
            addCriterion("updateName is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatenameEqualTo(String value) {
            addCriterion("updateName =", value, "updatename");
            return (Criteria) this;
        }

        public Criteria andUpdatenameNotEqualTo(String value) {
            addCriterion("updateName <>", value, "updatename");
            return (Criteria) this;
        }

        public Criteria andUpdatenameGreaterThan(String value) {
            addCriterion("updateName >", value, "updatename");
            return (Criteria) this;
        }

        public Criteria andUpdatenameGreaterThanOrEqualTo(String value) {
            addCriterion("updateName >=", value, "updatename");
            return (Criteria) this;
        }

        public Criteria andUpdatenameLessThan(String value) {
            addCriterion("updateName <", value, "updatename");
            return (Criteria) this;
        }

        public Criteria andUpdatenameLessThanOrEqualTo(String value) {
            addCriterion("updateName <=", value, "updatename");
            return (Criteria) this;
        }

        public Criteria andUpdatenameLike(String value) {
            addCriterion("updateName like", value, "updatename");
            return (Criteria) this;
        }

        public Criteria andUpdatenameNotLike(String value) {
            addCriterion("updateName not like", value, "updatename");
            return (Criteria) this;
        }

        public Criteria andUpdatenameIn(List<String> values) {
            addCriterion("updateName in", values, "updatename");
            return (Criteria) this;
        }

        public Criteria andUpdatenameNotIn(List<String> values) {
            addCriterion("updateName not in", values, "updatename");
            return (Criteria) this;
        }

        public Criteria andUpdatenameBetween(String value1, String value2) {
            addCriterion("updateName between", value1, value2, "updatename");
            return (Criteria) this;
        }

        public Criteria andUpdatenameNotBetween(String value1, String value2) {
            addCriterion("updateName not between", value1, value2, "updatename");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updateTime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updateTime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updateTime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updateTime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updateTime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updateTime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updateTime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updateTime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updateTime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updateTime not between", value1, value2, "updatetime");
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