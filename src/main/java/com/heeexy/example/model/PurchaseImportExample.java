package com.heeexy.example.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PurchaseImportExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PurchaseImportExample() {
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

        public Criteria andSupplierorderIsNull() {
            addCriterion("supplierOrder is null");
            return (Criteria) this;
        }

        public Criteria andSupplierorderIsNotNull() {
            addCriterion("supplierOrder is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierorderEqualTo(String value) {
            addCriterion("supplierOrder =", value, "supplierorder");
            return (Criteria) this;
        }

        public Criteria andSupplierorderNotEqualTo(String value) {
            addCriterion("supplierOrder <>", value, "supplierorder");
            return (Criteria) this;
        }

        public Criteria andSupplierorderGreaterThan(String value) {
            addCriterion("supplierOrder >", value, "supplierorder");
            return (Criteria) this;
        }

        public Criteria andSupplierorderGreaterThanOrEqualTo(String value) {
            addCriterion("supplierOrder >=", value, "supplierorder");
            return (Criteria) this;
        }

        public Criteria andSupplierorderLessThan(String value) {
            addCriterion("supplierOrder <", value, "supplierorder");
            return (Criteria) this;
        }

        public Criteria andSupplierorderLessThanOrEqualTo(String value) {
            addCriterion("supplierOrder <=", value, "supplierorder");
            return (Criteria) this;
        }

        public Criteria andSupplierorderLike(String value) {
            addCriterion("supplierOrder like", value, "supplierorder");
            return (Criteria) this;
        }

        public Criteria andSupplierorderNotLike(String value) {
            addCriterion("supplierOrder not like", value, "supplierorder");
            return (Criteria) this;
        }

        public Criteria andSupplierorderIn(List<String> values) {
            addCriterion("supplierOrder in", values, "supplierorder");
            return (Criteria) this;
        }

        public Criteria andSupplierorderNotIn(List<String> values) {
            addCriterion("supplierOrder not in", values, "supplierorder");
            return (Criteria) this;
        }

        public Criteria andSupplierorderBetween(String value1, String value2) {
            addCriterion("supplierOrder between", value1, value2, "supplierorder");
            return (Criteria) this;
        }

        public Criteria andSupplierorderNotBetween(String value1, String value2) {
            addCriterion("supplierOrder not between", value1, value2, "supplierorder");
            return (Criteria) this;
        }

        public Criteria andTransactionIsNull() {
            addCriterion("transaction is null");
            return (Criteria) this;
        }

        public Criteria andTransactionIsNotNull() {
            addCriterion("transaction is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionEqualTo(String value) {
            addCriterion("transaction =", value, "transaction");
            return (Criteria) this;
        }

        public Criteria andTransactionNotEqualTo(String value) {
            addCriterion("transaction <>", value, "transaction");
            return (Criteria) this;
        }

        public Criteria andTransactionGreaterThan(String value) {
            addCriterion("transaction >", value, "transaction");
            return (Criteria) this;
        }

        public Criteria andTransactionGreaterThanOrEqualTo(String value) {
            addCriterion("transaction >=", value, "transaction");
            return (Criteria) this;
        }

        public Criteria andTransactionLessThan(String value) {
            addCriterion("transaction <", value, "transaction");
            return (Criteria) this;
        }

        public Criteria andTransactionLessThanOrEqualTo(String value) {
            addCriterion("transaction <=", value, "transaction");
            return (Criteria) this;
        }

        public Criteria andTransactionLike(String value) {
            addCriterion("transaction like", value, "transaction");
            return (Criteria) this;
        }

        public Criteria andTransactionNotLike(String value) {
            addCriterion("transaction not like", value, "transaction");
            return (Criteria) this;
        }

        public Criteria andTransactionIn(List<String> values) {
            addCriterion("transaction in", values, "transaction");
            return (Criteria) this;
        }

        public Criteria andTransactionNotIn(List<String> values) {
            addCriterion("transaction not in", values, "transaction");
            return (Criteria) this;
        }

        public Criteria andTransactionBetween(String value1, String value2) {
            addCriterion("transaction between", value1, value2, "transaction");
            return (Criteria) this;
        }

        public Criteria andTransactionNotBetween(String value1, String value2) {
            addCriterion("transaction not between", value1, value2, "transaction");
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

        public Criteria andCnwarehouseoutstatusIsNull() {
            addCriterion("cnWarehouseOutStatus is null");
            return (Criteria) this;
        }

        public Criteria andCnwarehouseoutstatusIsNotNull() {
            addCriterion("cnWarehouseOutStatus is not null");
            return (Criteria) this;
        }

        public Criteria andCnwarehouseoutstatusEqualTo(Integer value) {
            addCriterion("cnWarehouseOutStatus =", value, "cnwarehouseoutstatus");
            return (Criteria) this;
        }

        public Criteria andCnwarehouseoutstatusNotEqualTo(Integer value) {
            addCriterion("cnWarehouseOutStatus <>", value, "cnwarehouseoutstatus");
            return (Criteria) this;
        }

        public Criteria andCnwarehouseoutstatusGreaterThan(Integer value) {
            addCriterion("cnWarehouseOutStatus >", value, "cnwarehouseoutstatus");
            return (Criteria) this;
        }

        public Criteria andCnwarehouseoutstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("cnWarehouseOutStatus >=", value, "cnwarehouseoutstatus");
            return (Criteria) this;
        }

        public Criteria andCnwarehouseoutstatusLessThan(Integer value) {
            addCriterion("cnWarehouseOutStatus <", value, "cnwarehouseoutstatus");
            return (Criteria) this;
        }

        public Criteria andCnwarehouseoutstatusLessThanOrEqualTo(Integer value) {
            addCriterion("cnWarehouseOutStatus <=", value, "cnwarehouseoutstatus");
            return (Criteria) this;
        }

        public Criteria andCnwarehouseoutstatusIn(List<Integer> values) {
            addCriterion("cnWarehouseOutStatus in", values, "cnwarehouseoutstatus");
            return (Criteria) this;
        }

        public Criteria andCnwarehouseoutstatusNotIn(List<Integer> values) {
            addCriterion("cnWarehouseOutStatus not in", values, "cnwarehouseoutstatus");
            return (Criteria) this;
        }

        public Criteria andCnwarehouseoutstatusBetween(Integer value1, Integer value2) {
            addCriterion("cnWarehouseOutStatus between", value1, value2, "cnwarehouseoutstatus");
            return (Criteria) this;
        }

        public Criteria andCnwarehouseoutstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("cnWarehouseOutStatus not between", value1, value2, "cnwarehouseoutstatus");
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

        public Criteria andPurchaseallcountIsNull() {
            addCriterion("purchaseAllCount is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseallcountIsNotNull() {
            addCriterion("purchaseAllCount is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseallcountEqualTo(Integer value) {
            addCriterion("purchaseAllCount =", value, "purchaseallcount");
            return (Criteria) this;
        }

        public Criteria andPurchaseallcountNotEqualTo(Integer value) {
            addCriterion("purchaseAllCount <>", value, "purchaseallcount");
            return (Criteria) this;
        }

        public Criteria andPurchaseallcountGreaterThan(Integer value) {
            addCriterion("purchaseAllCount >", value, "purchaseallcount");
            return (Criteria) this;
        }

        public Criteria andPurchaseallcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("purchaseAllCount >=", value, "purchaseallcount");
            return (Criteria) this;
        }

        public Criteria andPurchaseallcountLessThan(Integer value) {
            addCriterion("purchaseAllCount <", value, "purchaseallcount");
            return (Criteria) this;
        }

        public Criteria andPurchaseallcountLessThanOrEqualTo(Integer value) {
            addCriterion("purchaseAllCount <=", value, "purchaseallcount");
            return (Criteria) this;
        }

        public Criteria andPurchaseallcountIn(List<Integer> values) {
            addCriterion("purchaseAllCount in", values, "purchaseallcount");
            return (Criteria) this;
        }

        public Criteria andPurchaseallcountNotIn(List<Integer> values) {
            addCriterion("purchaseAllCount not in", values, "purchaseallcount");
            return (Criteria) this;
        }

        public Criteria andPurchaseallcountBetween(Integer value1, Integer value2) {
            addCriterion("purchaseAllCount between", value1, value2, "purchaseallcount");
            return (Criteria) this;
        }

        public Criteria andPurchaseallcountNotBetween(Integer value1, Integer value2) {
            addCriterion("purchaseAllCount not between", value1, value2, "purchaseallcount");
            return (Criteria) this;
        }

        public Criteria andPurchaseallamountIsNull() {
            addCriterion("purchaseAllAmount is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseallamountIsNotNull() {
            addCriterion("purchaseAllAmount is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseallamountEqualTo(Double value) {
            addCriterion("purchaseAllAmount =", value, "purchaseallamount");
            return (Criteria) this;
        }

        public Criteria andPurchaseallamountNotEqualTo(Double value) {
            addCriterion("purchaseAllAmount <>", value, "purchaseallamount");
            return (Criteria) this;
        }

        public Criteria andPurchaseallamountGreaterThan(Double value) {
            addCriterion("purchaseAllAmount >", value, "purchaseallamount");
            return (Criteria) this;
        }

        public Criteria andPurchaseallamountGreaterThanOrEqualTo(Double value) {
            addCriterion("purchaseAllAmount >=", value, "purchaseallamount");
            return (Criteria) this;
        }

        public Criteria andPurchaseallamountLessThan(Double value) {
            addCriterion("purchaseAllAmount <", value, "purchaseallamount");
            return (Criteria) this;
        }

        public Criteria andPurchaseallamountLessThanOrEqualTo(Double value) {
            addCriterion("purchaseAllAmount <=", value, "purchaseallamount");
            return (Criteria) this;
        }

        public Criteria andPurchaseallamountIn(List<Double> values) {
            addCriterion("purchaseAllAmount in", values, "purchaseallamount");
            return (Criteria) this;
        }

        public Criteria andPurchaseallamountNotIn(List<Double> values) {
            addCriterion("purchaseAllAmount not in", values, "purchaseallamount");
            return (Criteria) this;
        }

        public Criteria andPurchaseallamountBetween(Double value1, Double value2) {
            addCriterion("purchaseAllAmount between", value1, value2, "purchaseallamount");
            return (Criteria) this;
        }

        public Criteria andPurchaseallamountNotBetween(Double value1, Double value2) {
            addCriterion("purchaseAllAmount not between", value1, value2, "purchaseallamount");
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
            addCriterionForJDBCDate("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterionForJDBCDate("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterionForJDBCDate("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("createTime not between", value1, value2, "createtime");
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