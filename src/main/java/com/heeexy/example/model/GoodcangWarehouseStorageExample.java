package com.heeexy.example.model;

import java.util.ArrayList;
import java.util.List;

public class GoodcangWarehouseStorageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodcangWarehouseStorageExample() {
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

        public Criteria andProductSkuIsNull() {
            addCriterion("product_sku is null");
            return (Criteria) this;
        }

        public Criteria andProductSkuIsNotNull() {
            addCriterion("product_sku is not null");
            return (Criteria) this;
        }

        public Criteria andProductSkuEqualTo(String value) {
            addCriterion("product_sku =", value, "productSku");
            return (Criteria) this;
        }

        public Criteria andProductSkuNotEqualTo(String value) {
            addCriterion("product_sku <>", value, "productSku");
            return (Criteria) this;
        }

        public Criteria andProductSkuGreaterThan(String value) {
            addCriterion("product_sku >", value, "productSku");
            return (Criteria) this;
        }

        public Criteria andProductSkuGreaterThanOrEqualTo(String value) {
            addCriterion("product_sku >=", value, "productSku");
            return (Criteria) this;
        }

        public Criteria andProductSkuLessThan(String value) {
            addCriterion("product_sku <", value, "productSku");
            return (Criteria) this;
        }

        public Criteria andProductSkuLessThanOrEqualTo(String value) {
            addCriterion("product_sku <=", value, "productSku");
            return (Criteria) this;
        }

        public Criteria andProductSkuLike(String value) {
            addCriterion("product_sku like", value, "productSku");
            return (Criteria) this;
        }

        public Criteria andProductSkuNotLike(String value) {
            addCriterion("product_sku not like", value, "productSku");
            return (Criteria) this;
        }

        public Criteria andProductSkuIn(List<String> values) {
            addCriterion("product_sku in", values, "productSku");
            return (Criteria) this;
        }

        public Criteria andProductSkuNotIn(List<String> values) {
            addCriterion("product_sku not in", values, "productSku");
            return (Criteria) this;
        }

        public Criteria andProductSkuBetween(String value1, String value2) {
            addCriterion("product_sku between", value1, value2, "productSku");
            return (Criteria) this;
        }

        public Criteria andProductSkuNotBetween(String value1, String value2) {
            addCriterion("product_sku not between", value1, value2, "productSku");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeIsNull() {
            addCriterion("warehouse_code is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeIsNotNull() {
            addCriterion("warehouse_code is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeEqualTo(String value) {
            addCriterion("warehouse_code =", value, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeNotEqualTo(String value) {
            addCriterion("warehouse_code <>", value, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeGreaterThan(String value) {
            addCriterion("warehouse_code >", value, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeGreaterThanOrEqualTo(String value) {
            addCriterion("warehouse_code >=", value, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeLessThan(String value) {
            addCriterion("warehouse_code <", value, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeLessThanOrEqualTo(String value) {
            addCriterion("warehouse_code <=", value, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeLike(String value) {
            addCriterion("warehouse_code like", value, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeNotLike(String value) {
            addCriterion("warehouse_code not like", value, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeIn(List<String> values) {
            addCriterion("warehouse_code in", values, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeNotIn(List<String> values) {
            addCriterion("warehouse_code not in", values, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeBetween(String value1, String value2) {
            addCriterion("warehouse_code between", value1, value2, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeNotBetween(String value1, String value2) {
            addCriterion("warehouse_code not between", value1, value2, "warehouseCode");
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

        public Criteria andOnwayIsNull() {
            addCriterion("onway is null");
            return (Criteria) this;
        }

        public Criteria andOnwayIsNotNull() {
            addCriterion("onway is not null");
            return (Criteria) this;
        }

        public Criteria andOnwayEqualTo(Integer value) {
            addCriterion("onway =", value, "onway");
            return (Criteria) this;
        }

        public Criteria andOnwayNotEqualTo(Integer value) {
            addCriterion("onway <>", value, "onway");
            return (Criteria) this;
        }

        public Criteria andOnwayGreaterThan(Integer value) {
            addCriterion("onway >", value, "onway");
            return (Criteria) this;
        }

        public Criteria andOnwayGreaterThanOrEqualTo(Integer value) {
            addCriterion("onway >=", value, "onway");
            return (Criteria) this;
        }

        public Criteria andOnwayLessThan(Integer value) {
            addCriterion("onway <", value, "onway");
            return (Criteria) this;
        }

        public Criteria andOnwayLessThanOrEqualTo(Integer value) {
            addCriterion("onway <=", value, "onway");
            return (Criteria) this;
        }

        public Criteria andOnwayIn(List<Integer> values) {
            addCriterion("onway in", values, "onway");
            return (Criteria) this;
        }

        public Criteria andOnwayNotIn(List<Integer> values) {
            addCriterion("onway not in", values, "onway");
            return (Criteria) this;
        }

        public Criteria andOnwayBetween(Integer value1, Integer value2) {
            addCriterion("onway between", value1, value2, "onway");
            return (Criteria) this;
        }

        public Criteria andOnwayNotBetween(Integer value1, Integer value2) {
            addCriterion("onway not between", value1, value2, "onway");
            return (Criteria) this;
        }

        public Criteria andPendingIsNull() {
            addCriterion("pending is null");
            return (Criteria) this;
        }

        public Criteria andPendingIsNotNull() {
            addCriterion("pending is not null");
            return (Criteria) this;
        }

        public Criteria andPendingEqualTo(Integer value) {
            addCriterion("pending =", value, "pending");
            return (Criteria) this;
        }

        public Criteria andPendingNotEqualTo(Integer value) {
            addCriterion("pending <>", value, "pending");
            return (Criteria) this;
        }

        public Criteria andPendingGreaterThan(Integer value) {
            addCriterion("pending >", value, "pending");
            return (Criteria) this;
        }

        public Criteria andPendingGreaterThanOrEqualTo(Integer value) {
            addCriterion("pending >=", value, "pending");
            return (Criteria) this;
        }

        public Criteria andPendingLessThan(Integer value) {
            addCriterion("pending <", value, "pending");
            return (Criteria) this;
        }

        public Criteria andPendingLessThanOrEqualTo(Integer value) {
            addCriterion("pending <=", value, "pending");
            return (Criteria) this;
        }

        public Criteria andPendingIn(List<Integer> values) {
            addCriterion("pending in", values, "pending");
            return (Criteria) this;
        }

        public Criteria andPendingNotIn(List<Integer> values) {
            addCriterion("pending not in", values, "pending");
            return (Criteria) this;
        }

        public Criteria andPendingBetween(Integer value1, Integer value2) {
            addCriterion("pending between", value1, value2, "pending");
            return (Criteria) this;
        }

        public Criteria andPendingNotBetween(Integer value1, Integer value2) {
            addCriterion("pending not between", value1, value2, "pending");
            return (Criteria) this;
        }

        public Criteria andSellableIsNull() {
            addCriterion("sellable is null");
            return (Criteria) this;
        }

        public Criteria andSellableIsNotNull() {
            addCriterion("sellable is not null");
            return (Criteria) this;
        }

        public Criteria andSellableEqualTo(Integer value) {
            addCriterion("sellable =", value, "sellable");
            return (Criteria) this;
        }

        public Criteria andSellableNotEqualTo(Integer value) {
            addCriterion("sellable <>", value, "sellable");
            return (Criteria) this;
        }

        public Criteria andSellableGreaterThan(Integer value) {
            addCriterion("sellable >", value, "sellable");
            return (Criteria) this;
        }

        public Criteria andSellableGreaterThanOrEqualTo(Integer value) {
            addCriterion("sellable >=", value, "sellable");
            return (Criteria) this;
        }

        public Criteria andSellableLessThan(Integer value) {
            addCriterion("sellable <", value, "sellable");
            return (Criteria) this;
        }

        public Criteria andSellableLessThanOrEqualTo(Integer value) {
            addCriterion("sellable <=", value, "sellable");
            return (Criteria) this;
        }

        public Criteria andSellableIn(List<Integer> values) {
            addCriterion("sellable in", values, "sellable");
            return (Criteria) this;
        }

        public Criteria andSellableNotIn(List<Integer> values) {
            addCriterion("sellable not in", values, "sellable");
            return (Criteria) this;
        }

        public Criteria andSellableBetween(Integer value1, Integer value2) {
            addCriterion("sellable between", value1, value2, "sellable");
            return (Criteria) this;
        }

        public Criteria andSellableNotBetween(Integer value1, Integer value2) {
            addCriterion("sellable not between", value1, value2, "sellable");
            return (Criteria) this;
        }

        public Criteria andUnsellableIsNull() {
            addCriterion("unsellable is null");
            return (Criteria) this;
        }

        public Criteria andUnsellableIsNotNull() {
            addCriterion("unsellable is not null");
            return (Criteria) this;
        }

        public Criteria andUnsellableEqualTo(Integer value) {
            addCriterion("unsellable =", value, "unsellable");
            return (Criteria) this;
        }

        public Criteria andUnsellableNotEqualTo(Integer value) {
            addCriterion("unsellable <>", value, "unsellable");
            return (Criteria) this;
        }

        public Criteria andUnsellableGreaterThan(Integer value) {
            addCriterion("unsellable >", value, "unsellable");
            return (Criteria) this;
        }

        public Criteria andUnsellableGreaterThanOrEqualTo(Integer value) {
            addCriterion("unsellable >=", value, "unsellable");
            return (Criteria) this;
        }

        public Criteria andUnsellableLessThan(Integer value) {
            addCriterion("unsellable <", value, "unsellable");
            return (Criteria) this;
        }

        public Criteria andUnsellableLessThanOrEqualTo(Integer value) {
            addCriterion("unsellable <=", value, "unsellable");
            return (Criteria) this;
        }

        public Criteria andUnsellableIn(List<Integer> values) {
            addCriterion("unsellable in", values, "unsellable");
            return (Criteria) this;
        }

        public Criteria andUnsellableNotIn(List<Integer> values) {
            addCriterion("unsellable not in", values, "unsellable");
            return (Criteria) this;
        }

        public Criteria andUnsellableBetween(Integer value1, Integer value2) {
            addCriterion("unsellable between", value1, value2, "unsellable");
            return (Criteria) this;
        }

        public Criteria andUnsellableNotBetween(Integer value1, Integer value2) {
            addCriterion("unsellable not between", value1, value2, "unsellable");
            return (Criteria) this;
        }

        public Criteria andReservedIsNull() {
            addCriterion("reserved is null");
            return (Criteria) this;
        }

        public Criteria andReservedIsNotNull() {
            addCriterion("reserved is not null");
            return (Criteria) this;
        }

        public Criteria andReservedEqualTo(Integer value) {
            addCriterion("reserved =", value, "reserved");
            return (Criteria) this;
        }

        public Criteria andReservedNotEqualTo(Integer value) {
            addCriterion("reserved <>", value, "reserved");
            return (Criteria) this;
        }

        public Criteria andReservedGreaterThan(Integer value) {
            addCriterion("reserved >", value, "reserved");
            return (Criteria) this;
        }

        public Criteria andReservedGreaterThanOrEqualTo(Integer value) {
            addCriterion("reserved >=", value, "reserved");
            return (Criteria) this;
        }

        public Criteria andReservedLessThan(Integer value) {
            addCriterion("reserved <", value, "reserved");
            return (Criteria) this;
        }

        public Criteria andReservedLessThanOrEqualTo(Integer value) {
            addCriterion("reserved <=", value, "reserved");
            return (Criteria) this;
        }

        public Criteria andReservedIn(List<Integer> values) {
            addCriterion("reserved in", values, "reserved");
            return (Criteria) this;
        }

        public Criteria andReservedNotIn(List<Integer> values) {
            addCriterion("reserved not in", values, "reserved");
            return (Criteria) this;
        }

        public Criteria andReservedBetween(Integer value1, Integer value2) {
            addCriterion("reserved between", value1, value2, "reserved");
            return (Criteria) this;
        }

        public Criteria andReservedNotBetween(Integer value1, Integer value2) {
            addCriterion("reserved not between", value1, value2, "reserved");
            return (Criteria) this;
        }

        public Criteria andShippedIsNull() {
            addCriterion("shipped is null");
            return (Criteria) this;
        }

        public Criteria andShippedIsNotNull() {
            addCriterion("shipped is not null");
            return (Criteria) this;
        }

        public Criteria andShippedEqualTo(Integer value) {
            addCriterion("shipped =", value, "shipped");
            return (Criteria) this;
        }

        public Criteria andShippedNotEqualTo(Integer value) {
            addCriterion("shipped <>", value, "shipped");
            return (Criteria) this;
        }

        public Criteria andShippedGreaterThan(Integer value) {
            addCriterion("shipped >", value, "shipped");
            return (Criteria) this;
        }

        public Criteria andShippedGreaterThanOrEqualTo(Integer value) {
            addCriterion("shipped >=", value, "shipped");
            return (Criteria) this;
        }

        public Criteria andShippedLessThan(Integer value) {
            addCriterion("shipped <", value, "shipped");
            return (Criteria) this;
        }

        public Criteria andShippedLessThanOrEqualTo(Integer value) {
            addCriterion("shipped <=", value, "shipped");
            return (Criteria) this;
        }

        public Criteria andShippedIn(List<Integer> values) {
            addCriterion("shipped in", values, "shipped");
            return (Criteria) this;
        }

        public Criteria andShippedNotIn(List<Integer> values) {
            addCriterion("shipped not in", values, "shipped");
            return (Criteria) this;
        }

        public Criteria andShippedBetween(Integer value1, Integer value2) {
            addCriterion("shipped between", value1, value2, "shipped");
            return (Criteria) this;
        }

        public Criteria andShippedNotBetween(Integer value1, Integer value2) {
            addCriterion("shipped not between", value1, value2, "shipped");
            return (Criteria) this;
        }

        public Criteria andProductBarcodeIsNull() {
            addCriterion("product_barcode is null");
            return (Criteria) this;
        }

        public Criteria andProductBarcodeIsNotNull() {
            addCriterion("product_barcode is not null");
            return (Criteria) this;
        }

        public Criteria andProductBarcodeEqualTo(String value) {
            addCriterion("product_barcode =", value, "productBarcode");
            return (Criteria) this;
        }

        public Criteria andProductBarcodeNotEqualTo(String value) {
            addCriterion("product_barcode <>", value, "productBarcode");
            return (Criteria) this;
        }

        public Criteria andProductBarcodeGreaterThan(String value) {
            addCriterion("product_barcode >", value, "productBarcode");
            return (Criteria) this;
        }

        public Criteria andProductBarcodeGreaterThanOrEqualTo(String value) {
            addCriterion("product_barcode >=", value, "productBarcode");
            return (Criteria) this;
        }

        public Criteria andProductBarcodeLessThan(String value) {
            addCriterion("product_barcode <", value, "productBarcode");
            return (Criteria) this;
        }

        public Criteria andProductBarcodeLessThanOrEqualTo(String value) {
            addCriterion("product_barcode <=", value, "productBarcode");
            return (Criteria) this;
        }

        public Criteria andProductBarcodeLike(String value) {
            addCriterion("product_barcode like", value, "productBarcode");
            return (Criteria) this;
        }

        public Criteria andProductBarcodeNotLike(String value) {
            addCriterion("product_barcode not like", value, "productBarcode");
            return (Criteria) this;
        }

        public Criteria andProductBarcodeIn(List<String> values) {
            addCriterion("product_barcode in", values, "productBarcode");
            return (Criteria) this;
        }

        public Criteria andProductBarcodeNotIn(List<String> values) {
            addCriterion("product_barcode not in", values, "productBarcode");
            return (Criteria) this;
        }

        public Criteria andProductBarcodeBetween(String value1, String value2) {
            addCriterion("product_barcode between", value1, value2, "productBarcode");
            return (Criteria) this;
        }

        public Criteria andProductBarcodeNotBetween(String value1, String value2) {
            addCriterion("product_barcode not between", value1, value2, "productBarcode");
            return (Criteria) this;
        }

        public Criteria andSoldSharedIsNull() {
            addCriterion("sold_shared is null");
            return (Criteria) this;
        }

        public Criteria andSoldSharedIsNotNull() {
            addCriterion("sold_shared is not null");
            return (Criteria) this;
        }

        public Criteria andSoldSharedEqualTo(Integer value) {
            addCriterion("sold_shared =", value, "soldShared");
            return (Criteria) this;
        }

        public Criteria andSoldSharedNotEqualTo(Integer value) {
            addCriterion("sold_shared <>", value, "soldShared");
            return (Criteria) this;
        }

        public Criteria andSoldSharedGreaterThan(Integer value) {
            addCriterion("sold_shared >", value, "soldShared");
            return (Criteria) this;
        }

        public Criteria andSoldSharedGreaterThanOrEqualTo(Integer value) {
            addCriterion("sold_shared >=", value, "soldShared");
            return (Criteria) this;
        }

        public Criteria andSoldSharedLessThan(Integer value) {
            addCriterion("sold_shared <", value, "soldShared");
            return (Criteria) this;
        }

        public Criteria andSoldSharedLessThanOrEqualTo(Integer value) {
            addCriterion("sold_shared <=", value, "soldShared");
            return (Criteria) this;
        }

        public Criteria andSoldSharedIn(List<Integer> values) {
            addCriterion("sold_shared in", values, "soldShared");
            return (Criteria) this;
        }

        public Criteria andSoldSharedNotIn(List<Integer> values) {
            addCriterion("sold_shared not in", values, "soldShared");
            return (Criteria) this;
        }

        public Criteria andSoldSharedBetween(Integer value1, Integer value2) {
            addCriterion("sold_shared between", value1, value2, "soldShared");
            return (Criteria) this;
        }

        public Criteria andSoldSharedNotBetween(Integer value1, Integer value2) {
            addCriterion("sold_shared not between", value1, value2, "soldShared");
            return (Criteria) this;
        }

        public Criteria andStockingIsNull() {
            addCriterion("stocking is null");
            return (Criteria) this;
        }

        public Criteria andStockingIsNotNull() {
            addCriterion("stocking is not null");
            return (Criteria) this;
        }

        public Criteria andStockingEqualTo(Integer value) {
            addCriterion("stocking =", value, "stocking");
            return (Criteria) this;
        }

        public Criteria andStockingNotEqualTo(Integer value) {
            addCriterion("stocking <>", value, "stocking");
            return (Criteria) this;
        }

        public Criteria andStockingGreaterThan(Integer value) {
            addCriterion("stocking >", value, "stocking");
            return (Criteria) this;
        }

        public Criteria andStockingGreaterThanOrEqualTo(Integer value) {
            addCriterion("stocking >=", value, "stocking");
            return (Criteria) this;
        }

        public Criteria andStockingLessThan(Integer value) {
            addCriterion("stocking <", value, "stocking");
            return (Criteria) this;
        }

        public Criteria andStockingLessThanOrEqualTo(Integer value) {
            addCriterion("stocking <=", value, "stocking");
            return (Criteria) this;
        }

        public Criteria andStockingIn(List<Integer> values) {
            addCriterion("stocking in", values, "stocking");
            return (Criteria) this;
        }

        public Criteria andStockingNotIn(List<Integer> values) {
            addCriterion("stocking not in", values, "stocking");
            return (Criteria) this;
        }

        public Criteria andStockingBetween(Integer value1, Integer value2) {
            addCriterion("stocking between", value1, value2, "stocking");
            return (Criteria) this;
        }

        public Criteria andStockingNotBetween(Integer value1, Integer value2) {
            addCriterion("stocking not between", value1, value2, "stocking");
            return (Criteria) this;
        }

        public Criteria andPiNoStockIsNull() {
            addCriterion("pi_no_stock is null");
            return (Criteria) this;
        }

        public Criteria andPiNoStockIsNotNull() {
            addCriterion("pi_no_stock is not null");
            return (Criteria) this;
        }

        public Criteria andPiNoStockEqualTo(Integer value) {
            addCriterion("pi_no_stock =", value, "piNoStock");
            return (Criteria) this;
        }

        public Criteria andPiNoStockNotEqualTo(Integer value) {
            addCriterion("pi_no_stock <>", value, "piNoStock");
            return (Criteria) this;
        }

        public Criteria andPiNoStockGreaterThan(Integer value) {
            addCriterion("pi_no_stock >", value, "piNoStock");
            return (Criteria) this;
        }

        public Criteria andPiNoStockGreaterThanOrEqualTo(Integer value) {
            addCriterion("pi_no_stock >=", value, "piNoStock");
            return (Criteria) this;
        }

        public Criteria andPiNoStockLessThan(Integer value) {
            addCriterion("pi_no_stock <", value, "piNoStock");
            return (Criteria) this;
        }

        public Criteria andPiNoStockLessThanOrEqualTo(Integer value) {
            addCriterion("pi_no_stock <=", value, "piNoStock");
            return (Criteria) this;
        }

        public Criteria andPiNoStockIn(List<Integer> values) {
            addCriterion("pi_no_stock in", values, "piNoStock");
            return (Criteria) this;
        }

        public Criteria andPiNoStockNotIn(List<Integer> values) {
            addCriterion("pi_no_stock not in", values, "piNoStock");
            return (Criteria) this;
        }

        public Criteria andPiNoStockBetween(Integer value1, Integer value2) {
            addCriterion("pi_no_stock between", value1, value2, "piNoStock");
            return (Criteria) this;
        }

        public Criteria andPiNoStockNotBetween(Integer value1, Integer value2) {
            addCriterion("pi_no_stock not between", value1, value2, "piNoStock");
            return (Criteria) this;
        }

        public Criteria andTuneOutIsNull() {
            addCriterion("tune_out is null");
            return (Criteria) this;
        }

        public Criteria andTuneOutIsNotNull() {
            addCriterion("tune_out is not null");
            return (Criteria) this;
        }

        public Criteria andTuneOutEqualTo(Integer value) {
            addCriterion("tune_out =", value, "tuneOut");
            return (Criteria) this;
        }

        public Criteria andTuneOutNotEqualTo(Integer value) {
            addCriterion("tune_out <>", value, "tuneOut");
            return (Criteria) this;
        }

        public Criteria andTuneOutGreaterThan(Integer value) {
            addCriterion("tune_out >", value, "tuneOut");
            return (Criteria) this;
        }

        public Criteria andTuneOutGreaterThanOrEqualTo(Integer value) {
            addCriterion("tune_out >=", value, "tuneOut");
            return (Criteria) this;
        }

        public Criteria andTuneOutLessThan(Integer value) {
            addCriterion("tune_out <", value, "tuneOut");
            return (Criteria) this;
        }

        public Criteria andTuneOutLessThanOrEqualTo(Integer value) {
            addCriterion("tune_out <=", value, "tuneOut");
            return (Criteria) this;
        }

        public Criteria andTuneOutIn(List<Integer> values) {
            addCriterion("tune_out in", values, "tuneOut");
            return (Criteria) this;
        }

        public Criteria andTuneOutNotIn(List<Integer> values) {
            addCriterion("tune_out not in", values, "tuneOut");
            return (Criteria) this;
        }

        public Criteria andTuneOutBetween(Integer value1, Integer value2) {
            addCriterion("tune_out between", value1, value2, "tuneOut");
            return (Criteria) this;
        }

        public Criteria andTuneOutNotBetween(Integer value1, Integer value2) {
            addCriterion("tune_out not between", value1, value2, "tuneOut");
            return (Criteria) this;
        }

        public Criteria andTuneInIsNull() {
            addCriterion("tune_in is null");
            return (Criteria) this;
        }

        public Criteria andTuneInIsNotNull() {
            addCriterion("tune_in is not null");
            return (Criteria) this;
        }

        public Criteria andTuneInEqualTo(Integer value) {
            addCriterion("tune_in =", value, "tuneIn");
            return (Criteria) this;
        }

        public Criteria andTuneInNotEqualTo(Integer value) {
            addCriterion("tune_in <>", value, "tuneIn");
            return (Criteria) this;
        }

        public Criteria andTuneInGreaterThan(Integer value) {
            addCriterion("tune_in >", value, "tuneIn");
            return (Criteria) this;
        }

        public Criteria andTuneInGreaterThanOrEqualTo(Integer value) {
            addCriterion("tune_in >=", value, "tuneIn");
            return (Criteria) this;
        }

        public Criteria andTuneInLessThan(Integer value) {
            addCriterion("tune_in <", value, "tuneIn");
            return (Criteria) this;
        }

        public Criteria andTuneInLessThanOrEqualTo(Integer value) {
            addCriterion("tune_in <=", value, "tuneIn");
            return (Criteria) this;
        }

        public Criteria andTuneInIn(List<Integer> values) {
            addCriterion("tune_in in", values, "tuneIn");
            return (Criteria) this;
        }

        public Criteria andTuneInNotIn(List<Integer> values) {
            addCriterion("tune_in not in", values, "tuneIn");
            return (Criteria) this;
        }

        public Criteria andTuneInBetween(Integer value1, Integer value2) {
            addCriterion("tune_in between", value1, value2, "tuneIn");
            return (Criteria) this;
        }

        public Criteria andTuneInNotBetween(Integer value1, Integer value2) {
            addCriterion("tune_in not between", value1, value2, "tuneIn");
            return (Criteria) this;
        }

        public Criteria andProductSalesValueIsNull() {
            addCriterion("product_sales_value is null");
            return (Criteria) this;
        }

        public Criteria andProductSalesValueIsNotNull() {
            addCriterion("product_sales_value is not null");
            return (Criteria) this;
        }

        public Criteria andProductSalesValueEqualTo(Double value) {
            addCriterion("product_sales_value =", value, "productSalesValue");
            return (Criteria) this;
        }

        public Criteria andProductSalesValueNotEqualTo(Double value) {
            addCriterion("product_sales_value <>", value, "productSalesValue");
            return (Criteria) this;
        }

        public Criteria andProductSalesValueGreaterThan(Double value) {
            addCriterion("product_sales_value >", value, "productSalesValue");
            return (Criteria) this;
        }

        public Criteria andProductSalesValueGreaterThanOrEqualTo(Double value) {
            addCriterion("product_sales_value >=", value, "productSalesValue");
            return (Criteria) this;
        }

        public Criteria andProductSalesValueLessThan(Double value) {
            addCriterion("product_sales_value <", value, "productSalesValue");
            return (Criteria) this;
        }

        public Criteria andProductSalesValueLessThanOrEqualTo(Double value) {
            addCriterion("product_sales_value <=", value, "productSalesValue");
            return (Criteria) this;
        }

        public Criteria andProductSalesValueIn(List<Double> values) {
            addCriterion("product_sales_value in", values, "productSalesValue");
            return (Criteria) this;
        }

        public Criteria andProductSalesValueNotIn(List<Double> values) {
            addCriterion("product_sales_value not in", values, "productSalesValue");
            return (Criteria) this;
        }

        public Criteria andProductSalesValueBetween(Double value1, Double value2) {
            addCriterion("product_sales_value between", value1, value2, "productSalesValue");
            return (Criteria) this;
        }

        public Criteria andProductSalesValueNotBetween(Double value1, Double value2) {
            addCriterion("product_sales_value not between", value1, value2, "productSalesValue");
            return (Criteria) this;
        }

        public Criteria andWarehouseDescIsNull() {
            addCriterion("warehouse_desc is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseDescIsNotNull() {
            addCriterion("warehouse_desc is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseDescEqualTo(String value) {
            addCriterion("warehouse_desc =", value, "warehouseDesc");
            return (Criteria) this;
        }

        public Criteria andWarehouseDescNotEqualTo(String value) {
            addCriterion("warehouse_desc <>", value, "warehouseDesc");
            return (Criteria) this;
        }

        public Criteria andWarehouseDescGreaterThan(String value) {
            addCriterion("warehouse_desc >", value, "warehouseDesc");
            return (Criteria) this;
        }

        public Criteria andWarehouseDescGreaterThanOrEqualTo(String value) {
            addCriterion("warehouse_desc >=", value, "warehouseDesc");
            return (Criteria) this;
        }

        public Criteria andWarehouseDescLessThan(String value) {
            addCriterion("warehouse_desc <", value, "warehouseDesc");
            return (Criteria) this;
        }

        public Criteria andWarehouseDescLessThanOrEqualTo(String value) {
            addCriterion("warehouse_desc <=", value, "warehouseDesc");
            return (Criteria) this;
        }

        public Criteria andWarehouseDescLike(String value) {
            addCriterion("warehouse_desc like", value, "warehouseDesc");
            return (Criteria) this;
        }

        public Criteria andWarehouseDescNotLike(String value) {
            addCriterion("warehouse_desc not like", value, "warehouseDesc");
            return (Criteria) this;
        }

        public Criteria andWarehouseDescIn(List<String> values) {
            addCriterion("warehouse_desc in", values, "warehouseDesc");
            return (Criteria) this;
        }

        public Criteria andWarehouseDescNotIn(List<String> values) {
            addCriterion("warehouse_desc not in", values, "warehouseDesc");
            return (Criteria) this;
        }

        public Criteria andWarehouseDescBetween(String value1, String value2) {
            addCriterion("warehouse_desc between", value1, value2, "warehouseDesc");
            return (Criteria) this;
        }

        public Criteria andWarehouseDescNotBetween(String value1, String value2) {
            addCriterion("warehouse_desc not between", value1, value2, "warehouseDesc");
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