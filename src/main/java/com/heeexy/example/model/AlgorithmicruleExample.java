package com.heeexy.example.model;

import java.util.ArrayList;
import java.util.List;

public class AlgorithmicruleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AlgorithmicruleExample() {
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

        public Criteria andAlidIsNull() {
            addCriterion("alID is null");
            return (Criteria) this;
        }

        public Criteria andAlidIsNotNull() {
            addCriterion("alID is not null");
            return (Criteria) this;
        }

        public Criteria andAlidEqualTo(Integer value) {
            addCriterion("alID =", value, "alid");
            return (Criteria) this;
        }

        public Criteria andAlidNotEqualTo(Integer value) {
            addCriterion("alID <>", value, "alid");
            return (Criteria) this;
        }

        public Criteria andAlidGreaterThan(Integer value) {
            addCriterion("alID >", value, "alid");
            return (Criteria) this;
        }

        public Criteria andAlidGreaterThanOrEqualTo(Integer value) {
            addCriterion("alID >=", value, "alid");
            return (Criteria) this;
        }

        public Criteria andAlidLessThan(Integer value) {
            addCriterion("alID <", value, "alid");
            return (Criteria) this;
        }

        public Criteria andAlidLessThanOrEqualTo(Integer value) {
            addCriterion("alID <=", value, "alid");
            return (Criteria) this;
        }

        public Criteria andAlidIn(List<Integer> values) {
            addCriterion("alID in", values, "alid");
            return (Criteria) this;
        }

        public Criteria andAlidNotIn(List<Integer> values) {
            addCriterion("alID not in", values, "alid");
            return (Criteria) this;
        }

        public Criteria andAlidBetween(Integer value1, Integer value2) {
            addCriterion("alID between", value1, value2, "alid");
            return (Criteria) this;
        }

        public Criteria andAlidNotBetween(Integer value1, Integer value2) {
            addCriterion("alID not between", value1, value2, "alid");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeAirIsNull() {
            addCriterion("delivery_time_air is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeAirIsNotNull() {
            addCriterion("delivery_time_air is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeAirEqualTo(Integer value) {
            addCriterion("delivery_time_air =", value, "deliveryTimeAir");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeAirNotEqualTo(Integer value) {
            addCriterion("delivery_time_air <>", value, "deliveryTimeAir");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeAirGreaterThan(Integer value) {
            addCriterion("delivery_time_air >", value, "deliveryTimeAir");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeAirGreaterThanOrEqualTo(Integer value) {
            addCriterion("delivery_time_air >=", value, "deliveryTimeAir");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeAirLessThan(Integer value) {
            addCriterion("delivery_time_air <", value, "deliveryTimeAir");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeAirLessThanOrEqualTo(Integer value) {
            addCriterion("delivery_time_air <=", value, "deliveryTimeAir");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeAirIn(List<Integer> values) {
            addCriterion("delivery_time_air in", values, "deliveryTimeAir");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeAirNotIn(List<Integer> values) {
            addCriterion("delivery_time_air not in", values, "deliveryTimeAir");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeAirBetween(Integer value1, Integer value2) {
            addCriterion("delivery_time_air between", value1, value2, "deliveryTimeAir");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeAirNotBetween(Integer value1, Integer value2) {
            addCriterion("delivery_time_air not between", value1, value2, "deliveryTimeAir");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeShipIsNull() {
            addCriterion("delivery_time_ship is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeShipIsNotNull() {
            addCriterion("delivery_time_ship is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeShipEqualTo(Integer value) {
            addCriterion("delivery_time_ship =", value, "deliveryTimeShip");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeShipNotEqualTo(Integer value) {
            addCriterion("delivery_time_ship <>", value, "deliveryTimeShip");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeShipGreaterThan(Integer value) {
            addCriterion("delivery_time_ship >", value, "deliveryTimeShip");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeShipGreaterThanOrEqualTo(Integer value) {
            addCriterion("delivery_time_ship >=", value, "deliveryTimeShip");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeShipLessThan(Integer value) {
            addCriterion("delivery_time_ship <", value, "deliveryTimeShip");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeShipLessThanOrEqualTo(Integer value) {
            addCriterion("delivery_time_ship <=", value, "deliveryTimeShip");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeShipIn(List<Integer> values) {
            addCriterion("delivery_time_ship in", values, "deliveryTimeShip");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeShipNotIn(List<Integer> values) {
            addCriterion("delivery_time_ship not in", values, "deliveryTimeShip");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeShipBetween(Integer value1, Integer value2) {
            addCriterion("delivery_time_ship between", value1, value2, "deliveryTimeShip");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeShipNotBetween(Integer value1, Integer value2) {
            addCriterion("delivery_time_ship not between", value1, value2, "deliveryTimeShip");
            return (Criteria) this;
        }

        public Criteria andProcessTimeAirIsNull() {
            addCriterion("process_time_air is null");
            return (Criteria) this;
        }

        public Criteria andProcessTimeAirIsNotNull() {
            addCriterion("process_time_air is not null");
            return (Criteria) this;
        }

        public Criteria andProcessTimeAirEqualTo(Integer value) {
            addCriterion("process_time_air =", value, "processTimeAir");
            return (Criteria) this;
        }

        public Criteria andProcessTimeAirNotEqualTo(Integer value) {
            addCriterion("process_time_air <>", value, "processTimeAir");
            return (Criteria) this;
        }

        public Criteria andProcessTimeAirGreaterThan(Integer value) {
            addCriterion("process_time_air >", value, "processTimeAir");
            return (Criteria) this;
        }

        public Criteria andProcessTimeAirGreaterThanOrEqualTo(Integer value) {
            addCriterion("process_time_air >=", value, "processTimeAir");
            return (Criteria) this;
        }

        public Criteria andProcessTimeAirLessThan(Integer value) {
            addCriterion("process_time_air <", value, "processTimeAir");
            return (Criteria) this;
        }

        public Criteria andProcessTimeAirLessThanOrEqualTo(Integer value) {
            addCriterion("process_time_air <=", value, "processTimeAir");
            return (Criteria) this;
        }

        public Criteria andProcessTimeAirIn(List<Integer> values) {
            addCriterion("process_time_air in", values, "processTimeAir");
            return (Criteria) this;
        }

        public Criteria andProcessTimeAirNotIn(List<Integer> values) {
            addCriterion("process_time_air not in", values, "processTimeAir");
            return (Criteria) this;
        }

        public Criteria andProcessTimeAirBetween(Integer value1, Integer value2) {
            addCriterion("process_time_air between", value1, value2, "processTimeAir");
            return (Criteria) this;
        }

        public Criteria andProcessTimeAirNotBetween(Integer value1, Integer value2) {
            addCriterion("process_time_air not between", value1, value2, "processTimeAir");
            return (Criteria) this;
        }

        public Criteria andSafestockAirIsNull() {
            addCriterion("safestock_air is null");
            return (Criteria) this;
        }

        public Criteria andSafestockAirIsNotNull() {
            addCriterion("safestock_air is not null");
            return (Criteria) this;
        }

        public Criteria andSafestockAirEqualTo(Integer value) {
            addCriterion("safestock_air =", value, "safestockAir");
            return (Criteria) this;
        }

        public Criteria andSafestockAirNotEqualTo(Integer value) {
            addCriterion("safestock_air <>", value, "safestockAir");
            return (Criteria) this;
        }

        public Criteria andSafestockAirGreaterThan(Integer value) {
            addCriterion("safestock_air >", value, "safestockAir");
            return (Criteria) this;
        }

        public Criteria andSafestockAirGreaterThanOrEqualTo(Integer value) {
            addCriterion("safestock_air >=", value, "safestockAir");
            return (Criteria) this;
        }

        public Criteria andSafestockAirLessThan(Integer value) {
            addCriterion("safestock_air <", value, "safestockAir");
            return (Criteria) this;
        }

        public Criteria andSafestockAirLessThanOrEqualTo(Integer value) {
            addCriterion("safestock_air <=", value, "safestockAir");
            return (Criteria) this;
        }

        public Criteria andSafestockAirIn(List<Integer> values) {
            addCriterion("safestock_air in", values, "safestockAir");
            return (Criteria) this;
        }

        public Criteria andSafestockAirNotIn(List<Integer> values) {
            addCriterion("safestock_air not in", values, "safestockAir");
            return (Criteria) this;
        }

        public Criteria andSafestockAirBetween(Integer value1, Integer value2) {
            addCriterion("safestock_air between", value1, value2, "safestockAir");
            return (Criteria) this;
        }

        public Criteria andSafestockAirNotBetween(Integer value1, Integer value2) {
            addCriterion("safestock_air not between", value1, value2, "safestockAir");
            return (Criteria) this;
        }

        public Criteria andSafestockShipIsNull() {
            addCriterion("safestock_ship is null");
            return (Criteria) this;
        }

        public Criteria andSafestockShipIsNotNull() {
            addCriterion("safestock_ship is not null");
            return (Criteria) this;
        }

        public Criteria andSafestockShipEqualTo(Integer value) {
            addCriterion("safestock_ship =", value, "safestockShip");
            return (Criteria) this;
        }

        public Criteria andSafestockShipNotEqualTo(Integer value) {
            addCriterion("safestock_ship <>", value, "safestockShip");
            return (Criteria) this;
        }

        public Criteria andSafestockShipGreaterThan(Integer value) {
            addCriterion("safestock_ship >", value, "safestockShip");
            return (Criteria) this;
        }

        public Criteria andSafestockShipGreaterThanOrEqualTo(Integer value) {
            addCriterion("safestock_ship >=", value, "safestockShip");
            return (Criteria) this;
        }

        public Criteria andSafestockShipLessThan(Integer value) {
            addCriterion("safestock_ship <", value, "safestockShip");
            return (Criteria) this;
        }

        public Criteria andSafestockShipLessThanOrEqualTo(Integer value) {
            addCriterion("safestock_ship <=", value, "safestockShip");
            return (Criteria) this;
        }

        public Criteria andSafestockShipIn(List<Integer> values) {
            addCriterion("safestock_ship in", values, "safestockShip");
            return (Criteria) this;
        }

        public Criteria andSafestockShipNotIn(List<Integer> values) {
            addCriterion("safestock_ship not in", values, "safestockShip");
            return (Criteria) this;
        }

        public Criteria andSafestockShipBetween(Integer value1, Integer value2) {
            addCriterion("safestock_ship between", value1, value2, "safestockShip");
            return (Criteria) this;
        }

        public Criteria andSafestockShipNotBetween(Integer value1, Integer value2) {
            addCriterion("safestock_ship not between", value1, value2, "safestockShip");
            return (Criteria) this;
        }

        public Criteria andFirstReplenishAirIsNull() {
            addCriterion("first_replenish_air is null");
            return (Criteria) this;
        }

        public Criteria andFirstReplenishAirIsNotNull() {
            addCriterion("first_replenish_air is not null");
            return (Criteria) this;
        }

        public Criteria andFirstReplenishAirEqualTo(Integer value) {
            addCriterion("first_replenish_air =", value, "firstReplenishAir");
            return (Criteria) this;
        }

        public Criteria andFirstReplenishAirNotEqualTo(Integer value) {
            addCriterion("first_replenish_air <>", value, "firstReplenishAir");
            return (Criteria) this;
        }

        public Criteria andFirstReplenishAirGreaterThan(Integer value) {
            addCriterion("first_replenish_air >", value, "firstReplenishAir");
            return (Criteria) this;
        }

        public Criteria andFirstReplenishAirGreaterThanOrEqualTo(Integer value) {
            addCriterion("first_replenish_air >=", value, "firstReplenishAir");
            return (Criteria) this;
        }

        public Criteria andFirstReplenishAirLessThan(Integer value) {
            addCriterion("first_replenish_air <", value, "firstReplenishAir");
            return (Criteria) this;
        }

        public Criteria andFirstReplenishAirLessThanOrEqualTo(Integer value) {
            addCriterion("first_replenish_air <=", value, "firstReplenishAir");
            return (Criteria) this;
        }

        public Criteria andFirstReplenishAirIn(List<Integer> values) {
            addCriterion("first_replenish_air in", values, "firstReplenishAir");
            return (Criteria) this;
        }

        public Criteria andFirstReplenishAirNotIn(List<Integer> values) {
            addCriterion("first_replenish_air not in", values, "firstReplenishAir");
            return (Criteria) this;
        }

        public Criteria andFirstReplenishAirBetween(Integer value1, Integer value2) {
            addCriterion("first_replenish_air between", value1, value2, "firstReplenishAir");
            return (Criteria) this;
        }

        public Criteria andFirstReplenishAirNotBetween(Integer value1, Integer value2) {
            addCriterion("first_replenish_air not between", value1, value2, "firstReplenishAir");
            return (Criteria) this;
        }

        public Criteria andReplenishAmountAirIsNull() {
            addCriterion("replenish_amount_air is null");
            return (Criteria) this;
        }

        public Criteria andReplenishAmountAirIsNotNull() {
            addCriterion("replenish_amount_air is not null");
            return (Criteria) this;
        }

        public Criteria andReplenishAmountAirEqualTo(Integer value) {
            addCriterion("replenish_amount_air =", value, "replenishAmountAir");
            return (Criteria) this;
        }

        public Criteria andReplenishAmountAirNotEqualTo(Integer value) {
            addCriterion("replenish_amount_air <>", value, "replenishAmountAir");
            return (Criteria) this;
        }

        public Criteria andReplenishAmountAirGreaterThan(Integer value) {
            addCriterion("replenish_amount_air >", value, "replenishAmountAir");
            return (Criteria) this;
        }

        public Criteria andReplenishAmountAirGreaterThanOrEqualTo(Integer value) {
            addCriterion("replenish_amount_air >=", value, "replenishAmountAir");
            return (Criteria) this;
        }

        public Criteria andReplenishAmountAirLessThan(Integer value) {
            addCriterion("replenish_amount_air <", value, "replenishAmountAir");
            return (Criteria) this;
        }

        public Criteria andReplenishAmountAirLessThanOrEqualTo(Integer value) {
            addCriterion("replenish_amount_air <=", value, "replenishAmountAir");
            return (Criteria) this;
        }

        public Criteria andReplenishAmountAirIn(List<Integer> values) {
            addCriterion("replenish_amount_air in", values, "replenishAmountAir");
            return (Criteria) this;
        }

        public Criteria andReplenishAmountAirNotIn(List<Integer> values) {
            addCriterion("replenish_amount_air not in", values, "replenishAmountAir");
            return (Criteria) this;
        }

        public Criteria andReplenishAmountAirBetween(Integer value1, Integer value2) {
            addCriterion("replenish_amount_air between", value1, value2, "replenishAmountAir");
            return (Criteria) this;
        }

        public Criteria andReplenishAmountAirNotBetween(Integer value1, Integer value2) {
            addCriterion("replenish_amount_air not between", value1, value2, "replenishAmountAir");
            return (Criteria) this;
        }

        public Criteria andReplenishAmountShipIsNull() {
            addCriterion("replenish_amount_ship is null");
            return (Criteria) this;
        }

        public Criteria andReplenishAmountShipIsNotNull() {
            addCriterion("replenish_amount_ship is not null");
            return (Criteria) this;
        }

        public Criteria andReplenishAmountShipEqualTo(Integer value) {
            addCriterion("replenish_amount_ship =", value, "replenishAmountShip");
            return (Criteria) this;
        }

        public Criteria andReplenishAmountShipNotEqualTo(Integer value) {
            addCriterion("replenish_amount_ship <>", value, "replenishAmountShip");
            return (Criteria) this;
        }

        public Criteria andReplenishAmountShipGreaterThan(Integer value) {
            addCriterion("replenish_amount_ship >", value, "replenishAmountShip");
            return (Criteria) this;
        }

        public Criteria andReplenishAmountShipGreaterThanOrEqualTo(Integer value) {
            addCriterion("replenish_amount_ship >=", value, "replenishAmountShip");
            return (Criteria) this;
        }

        public Criteria andReplenishAmountShipLessThan(Integer value) {
            addCriterion("replenish_amount_ship <", value, "replenishAmountShip");
            return (Criteria) this;
        }

        public Criteria andReplenishAmountShipLessThanOrEqualTo(Integer value) {
            addCriterion("replenish_amount_ship <=", value, "replenishAmountShip");
            return (Criteria) this;
        }

        public Criteria andReplenishAmountShipIn(List<Integer> values) {
            addCriterion("replenish_amount_ship in", values, "replenishAmountShip");
            return (Criteria) this;
        }

        public Criteria andReplenishAmountShipNotIn(List<Integer> values) {
            addCriterion("replenish_amount_ship not in", values, "replenishAmountShip");
            return (Criteria) this;
        }

        public Criteria andReplenishAmountShipBetween(Integer value1, Integer value2) {
            addCriterion("replenish_amount_ship between", value1, value2, "replenishAmountShip");
            return (Criteria) this;
        }

        public Criteria andReplenishAmountShipNotBetween(Integer value1, Integer value2) {
            addCriterion("replenish_amount_ship not between", value1, value2, "replenishAmountShip");
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

        public Criteria andFirstReplenishShipIsNull() {
            addCriterion("first_replenish_ship is null");
            return (Criteria) this;
        }

        public Criteria andFirstReplenishShipIsNotNull() {
            addCriterion("first_replenish_ship is not null");
            return (Criteria) this;
        }

        public Criteria andFirstReplenishShipEqualTo(Integer value) {
            addCriterion("first_replenish_ship =", value, "firstReplenishShip");
            return (Criteria) this;
        }

        public Criteria andFirstReplenishShipNotEqualTo(Integer value) {
            addCriterion("first_replenish_ship <>", value, "firstReplenishShip");
            return (Criteria) this;
        }

        public Criteria andFirstReplenishShipGreaterThan(Integer value) {
            addCriterion("first_replenish_ship >", value, "firstReplenishShip");
            return (Criteria) this;
        }

        public Criteria andFirstReplenishShipGreaterThanOrEqualTo(Integer value) {
            addCriterion("first_replenish_ship >=", value, "firstReplenishShip");
            return (Criteria) this;
        }

        public Criteria andFirstReplenishShipLessThan(Integer value) {
            addCriterion("first_replenish_ship <", value, "firstReplenishShip");
            return (Criteria) this;
        }

        public Criteria andFirstReplenishShipLessThanOrEqualTo(Integer value) {
            addCriterion("first_replenish_ship <=", value, "firstReplenishShip");
            return (Criteria) this;
        }

        public Criteria andFirstReplenishShipIn(List<Integer> values) {
            addCriterion("first_replenish_ship in", values, "firstReplenishShip");
            return (Criteria) this;
        }

        public Criteria andFirstReplenishShipNotIn(List<Integer> values) {
            addCriterion("first_replenish_ship not in", values, "firstReplenishShip");
            return (Criteria) this;
        }

        public Criteria andFirstReplenishShipBetween(Integer value1, Integer value2) {
            addCriterion("first_replenish_ship between", value1, value2, "firstReplenishShip");
            return (Criteria) this;
        }

        public Criteria andFirstReplenishShipNotBetween(Integer value1, Integer value2) {
            addCriterion("first_replenish_ship not between", value1, value2, "firstReplenishShip");
            return (Criteria) this;
        }

        public Criteria andHeadwaytimeAirIsNull() {
            addCriterion("headwaytime_air is null");
            return (Criteria) this;
        }

        public Criteria andHeadwaytimeAirIsNotNull() {
            addCriterion("headwaytime_air is not null");
            return (Criteria) this;
        }

        public Criteria andHeadwaytimeAirEqualTo(Integer value) {
            addCriterion("headwaytime_air =", value, "headwaytimeAir");
            return (Criteria) this;
        }

        public Criteria andHeadwaytimeAirNotEqualTo(Integer value) {
            addCriterion("headwaytime_air <>", value, "headwaytimeAir");
            return (Criteria) this;
        }

        public Criteria andHeadwaytimeAirGreaterThan(Integer value) {
            addCriterion("headwaytime_air >", value, "headwaytimeAir");
            return (Criteria) this;
        }

        public Criteria andHeadwaytimeAirGreaterThanOrEqualTo(Integer value) {
            addCriterion("headwaytime_air >=", value, "headwaytimeAir");
            return (Criteria) this;
        }

        public Criteria andHeadwaytimeAirLessThan(Integer value) {
            addCriterion("headwaytime_air <", value, "headwaytimeAir");
            return (Criteria) this;
        }

        public Criteria andHeadwaytimeAirLessThanOrEqualTo(Integer value) {
            addCriterion("headwaytime_air <=", value, "headwaytimeAir");
            return (Criteria) this;
        }

        public Criteria andHeadwaytimeAirIn(List<Integer> values) {
            addCriterion("headwaytime_air in", values, "headwaytimeAir");
            return (Criteria) this;
        }

        public Criteria andHeadwaytimeAirNotIn(List<Integer> values) {
            addCriterion("headwaytime_air not in", values, "headwaytimeAir");
            return (Criteria) this;
        }

        public Criteria andHeadwaytimeAirBetween(Integer value1, Integer value2) {
            addCriterion("headwaytime_air between", value1, value2, "headwaytimeAir");
            return (Criteria) this;
        }

        public Criteria andHeadwaytimeAirNotBetween(Integer value1, Integer value2) {
            addCriterion("headwaytime_air not between", value1, value2, "headwaytimeAir");
            return (Criteria) this;
        }

        public Criteria andHeadwaytimeShipIsNull() {
            addCriterion("headwaytime_ship is null");
            return (Criteria) this;
        }

        public Criteria andHeadwaytimeShipIsNotNull() {
            addCriterion("headwaytime_ship is not null");
            return (Criteria) this;
        }

        public Criteria andHeadwaytimeShipEqualTo(Integer value) {
            addCriterion("headwaytime_ship =", value, "headwaytimeShip");
            return (Criteria) this;
        }

        public Criteria andHeadwaytimeShipNotEqualTo(Integer value) {
            addCriterion("headwaytime_ship <>", value, "headwaytimeShip");
            return (Criteria) this;
        }

        public Criteria andHeadwaytimeShipGreaterThan(Integer value) {
            addCriterion("headwaytime_ship >", value, "headwaytimeShip");
            return (Criteria) this;
        }

        public Criteria andHeadwaytimeShipGreaterThanOrEqualTo(Integer value) {
            addCriterion("headwaytime_ship >=", value, "headwaytimeShip");
            return (Criteria) this;
        }

        public Criteria andHeadwaytimeShipLessThan(Integer value) {
            addCriterion("headwaytime_ship <", value, "headwaytimeShip");
            return (Criteria) this;
        }

        public Criteria andHeadwaytimeShipLessThanOrEqualTo(Integer value) {
            addCriterion("headwaytime_ship <=", value, "headwaytimeShip");
            return (Criteria) this;
        }

        public Criteria andHeadwaytimeShipIn(List<Integer> values) {
            addCriterion("headwaytime_ship in", values, "headwaytimeShip");
            return (Criteria) this;
        }

        public Criteria andHeadwaytimeShipNotIn(List<Integer> values) {
            addCriterion("headwaytime_ship not in", values, "headwaytimeShip");
            return (Criteria) this;
        }

        public Criteria andHeadwaytimeShipBetween(Integer value1, Integer value2) {
            addCriterion("headwaytime_ship between", value1, value2, "headwaytimeShip");
            return (Criteria) this;
        }

        public Criteria andHeadwaytimeShipNotBetween(Integer value1, Integer value2) {
            addCriterion("headwaytime_ship not between", value1, value2, "headwaytimeShip");
            return (Criteria) this;
        }

        public Criteria andSecondAirTimeIsNull() {
            addCriterion("second_air_time is null");
            return (Criteria) this;
        }

        public Criteria andSecondAirTimeIsNotNull() {
            addCriterion("second_air_time is not null");
            return (Criteria) this;
        }

        public Criteria andSecondAirTimeEqualTo(Integer value) {
            addCriterion("second_air_time =", value, "secondAirTime");
            return (Criteria) this;
        }

        public Criteria andSecondAirTimeNotEqualTo(Integer value) {
            addCriterion("second_air_time <>", value, "secondAirTime");
            return (Criteria) this;
        }

        public Criteria andSecondAirTimeGreaterThan(Integer value) {
            addCriterion("second_air_time >", value, "secondAirTime");
            return (Criteria) this;
        }

        public Criteria andSecondAirTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("second_air_time >=", value, "secondAirTime");
            return (Criteria) this;
        }

        public Criteria andSecondAirTimeLessThan(Integer value) {
            addCriterion("second_air_time <", value, "secondAirTime");
            return (Criteria) this;
        }

        public Criteria andSecondAirTimeLessThanOrEqualTo(Integer value) {
            addCriterion("second_air_time <=", value, "secondAirTime");
            return (Criteria) this;
        }

        public Criteria andSecondAirTimeIn(List<Integer> values) {
            addCriterion("second_air_time in", values, "secondAirTime");
            return (Criteria) this;
        }

        public Criteria andSecondAirTimeNotIn(List<Integer> values) {
            addCriterion("second_air_time not in", values, "secondAirTime");
            return (Criteria) this;
        }

        public Criteria andSecondAirTimeBetween(Integer value1, Integer value2) {
            addCriterion("second_air_time between", value1, value2, "secondAirTime");
            return (Criteria) this;
        }

        public Criteria andSecondAirTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("second_air_time not between", value1, value2, "secondAirTime");
            return (Criteria) this;
        }

        public Criteria andSecondShipTimeIsNull() {
            addCriterion("second_ship_time is null");
            return (Criteria) this;
        }

        public Criteria andSecondShipTimeIsNotNull() {
            addCriterion("second_ship_time is not null");
            return (Criteria) this;
        }

        public Criteria andSecondShipTimeEqualTo(Integer value) {
            addCriterion("second_ship_time =", value, "secondShipTime");
            return (Criteria) this;
        }

        public Criteria andSecondShipTimeNotEqualTo(Integer value) {
            addCriterion("second_ship_time <>", value, "secondShipTime");
            return (Criteria) this;
        }

        public Criteria andSecondShipTimeGreaterThan(Integer value) {
            addCriterion("second_ship_time >", value, "secondShipTime");
            return (Criteria) this;
        }

        public Criteria andSecondShipTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("second_ship_time >=", value, "secondShipTime");
            return (Criteria) this;
        }

        public Criteria andSecondShipTimeLessThan(Integer value) {
            addCriterion("second_ship_time <", value, "secondShipTime");
            return (Criteria) this;
        }

        public Criteria andSecondShipTimeLessThanOrEqualTo(Integer value) {
            addCriterion("second_ship_time <=", value, "secondShipTime");
            return (Criteria) this;
        }

        public Criteria andSecondShipTimeIn(List<Integer> values) {
            addCriterion("second_ship_time in", values, "secondShipTime");
            return (Criteria) this;
        }

        public Criteria andSecondShipTimeNotIn(List<Integer> values) {
            addCriterion("second_ship_time not in", values, "secondShipTime");
            return (Criteria) this;
        }

        public Criteria andSecondShipTimeBetween(Integer value1, Integer value2) {
            addCriterion("second_ship_time between", value1, value2, "secondShipTime");
            return (Criteria) this;
        }

        public Criteria andSecondShipTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("second_ship_time not between", value1, value2, "secondShipTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeShipIsNull() {
            addCriterion("process_time_ship is null");
            return (Criteria) this;
        }

        public Criteria andProcessTimeShipIsNotNull() {
            addCriterion("process_time_ship is not null");
            return (Criteria) this;
        }

        public Criteria andProcessTimeShipEqualTo(Integer value) {
            addCriterion("process_time_ship =", value, "processTimeShip");
            return (Criteria) this;
        }

        public Criteria andProcessTimeShipNotEqualTo(Integer value) {
            addCriterion("process_time_ship <>", value, "processTimeShip");
            return (Criteria) this;
        }

        public Criteria andProcessTimeShipGreaterThan(Integer value) {
            addCriterion("process_time_ship >", value, "processTimeShip");
            return (Criteria) this;
        }

        public Criteria andProcessTimeShipGreaterThanOrEqualTo(Integer value) {
            addCriterion("process_time_ship >=", value, "processTimeShip");
            return (Criteria) this;
        }

        public Criteria andProcessTimeShipLessThan(Integer value) {
            addCriterion("process_time_ship <", value, "processTimeShip");
            return (Criteria) this;
        }

        public Criteria andProcessTimeShipLessThanOrEqualTo(Integer value) {
            addCriterion("process_time_ship <=", value, "processTimeShip");
            return (Criteria) this;
        }

        public Criteria andProcessTimeShipIn(List<Integer> values) {
            addCriterion("process_time_ship in", values, "processTimeShip");
            return (Criteria) this;
        }

        public Criteria andProcessTimeShipNotIn(List<Integer> values) {
            addCriterion("process_time_ship not in", values, "processTimeShip");
            return (Criteria) this;
        }

        public Criteria andProcessTimeShipBetween(Integer value1, Integer value2) {
            addCriterion("process_time_ship between", value1, value2, "processTimeShip");
            return (Criteria) this;
        }

        public Criteria andProcessTimeShipNotBetween(Integer value1, Integer value2) {
            addCriterion("process_time_ship not between", value1, value2, "processTimeShip");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeTrainIsNull() {
            addCriterion("delivery_time_train is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeTrainIsNotNull() {
            addCriterion("delivery_time_train is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeTrainEqualTo(Integer value) {
            addCriterion("delivery_time_train =", value, "deliveryTimeTrain");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeTrainNotEqualTo(Integer value) {
            addCriterion("delivery_time_train <>", value, "deliveryTimeTrain");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeTrainGreaterThan(Integer value) {
            addCriterion("delivery_time_train >", value, "deliveryTimeTrain");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeTrainGreaterThanOrEqualTo(Integer value) {
            addCriterion("delivery_time_train >=", value, "deliveryTimeTrain");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeTrainLessThan(Integer value) {
            addCriterion("delivery_time_train <", value, "deliveryTimeTrain");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeTrainLessThanOrEqualTo(Integer value) {
            addCriterion("delivery_time_train <=", value, "deliveryTimeTrain");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeTrainIn(List<Integer> values) {
            addCriterion("delivery_time_train in", values, "deliveryTimeTrain");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeTrainNotIn(List<Integer> values) {
            addCriterion("delivery_time_train not in", values, "deliveryTimeTrain");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeTrainBetween(Integer value1, Integer value2) {
            addCriterion("delivery_time_train between", value1, value2, "deliveryTimeTrain");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeTrainNotBetween(Integer value1, Integer value2) {
            addCriterion("delivery_time_train not between", value1, value2, "deliveryTimeTrain");
            return (Criteria) this;
        }

        public Criteria andProcessTimeTrainIsNull() {
            addCriterion("process_time_train is null");
            return (Criteria) this;
        }

        public Criteria andProcessTimeTrainIsNotNull() {
            addCriterion("process_time_train is not null");
            return (Criteria) this;
        }

        public Criteria andProcessTimeTrainEqualTo(Integer value) {
            addCriterion("process_time_train =", value, "processTimeTrain");
            return (Criteria) this;
        }

        public Criteria andProcessTimeTrainNotEqualTo(Integer value) {
            addCriterion("process_time_train <>", value, "processTimeTrain");
            return (Criteria) this;
        }

        public Criteria andProcessTimeTrainGreaterThan(Integer value) {
            addCriterion("process_time_train >", value, "processTimeTrain");
            return (Criteria) this;
        }

        public Criteria andProcessTimeTrainGreaterThanOrEqualTo(Integer value) {
            addCriterion("process_time_train >=", value, "processTimeTrain");
            return (Criteria) this;
        }

        public Criteria andProcessTimeTrainLessThan(Integer value) {
            addCriterion("process_time_train <", value, "processTimeTrain");
            return (Criteria) this;
        }

        public Criteria andProcessTimeTrainLessThanOrEqualTo(Integer value) {
            addCriterion("process_time_train <=", value, "processTimeTrain");
            return (Criteria) this;
        }

        public Criteria andProcessTimeTrainIn(List<Integer> values) {
            addCriterion("process_time_train in", values, "processTimeTrain");
            return (Criteria) this;
        }

        public Criteria andProcessTimeTrainNotIn(List<Integer> values) {
            addCriterion("process_time_train not in", values, "processTimeTrain");
            return (Criteria) this;
        }

        public Criteria andProcessTimeTrainBetween(Integer value1, Integer value2) {
            addCriterion("process_time_train between", value1, value2, "processTimeTrain");
            return (Criteria) this;
        }

        public Criteria andProcessTimeTrainNotBetween(Integer value1, Integer value2) {
            addCriterion("process_time_train not between", value1, value2, "processTimeTrain");
            return (Criteria) this;
        }

        public Criteria andSafestockTrainIsNull() {
            addCriterion("safestock_train is null");
            return (Criteria) this;
        }

        public Criteria andSafestockTrainIsNotNull() {
            addCriterion("safestock_train is not null");
            return (Criteria) this;
        }

        public Criteria andSafestockTrainEqualTo(Integer value) {
            addCriterion("safestock_train =", value, "safestockTrain");
            return (Criteria) this;
        }

        public Criteria andSafestockTrainNotEqualTo(Integer value) {
            addCriterion("safestock_train <>", value, "safestockTrain");
            return (Criteria) this;
        }

        public Criteria andSafestockTrainGreaterThan(Integer value) {
            addCriterion("safestock_train >", value, "safestockTrain");
            return (Criteria) this;
        }

        public Criteria andSafestockTrainGreaterThanOrEqualTo(Integer value) {
            addCriterion("safestock_train >=", value, "safestockTrain");
            return (Criteria) this;
        }

        public Criteria andSafestockTrainLessThan(Integer value) {
            addCriterion("safestock_train <", value, "safestockTrain");
            return (Criteria) this;
        }

        public Criteria andSafestockTrainLessThanOrEqualTo(Integer value) {
            addCriterion("safestock_train <=", value, "safestockTrain");
            return (Criteria) this;
        }

        public Criteria andSafestockTrainIn(List<Integer> values) {
            addCriterion("safestock_train in", values, "safestockTrain");
            return (Criteria) this;
        }

        public Criteria andSafestockTrainNotIn(List<Integer> values) {
            addCriterion("safestock_train not in", values, "safestockTrain");
            return (Criteria) this;
        }

        public Criteria andSafestockTrainBetween(Integer value1, Integer value2) {
            addCriterion("safestock_train between", value1, value2, "safestockTrain");
            return (Criteria) this;
        }

        public Criteria andSafestockTrainNotBetween(Integer value1, Integer value2) {
            addCriterion("safestock_train not between", value1, value2, "safestockTrain");
            return (Criteria) this;
        }

        public Criteria andReplenishAmountTrainIsNull() {
            addCriterion("replenish_amount_train is null");
            return (Criteria) this;
        }

        public Criteria andReplenishAmountTrainIsNotNull() {
            addCriterion("replenish_amount_train is not null");
            return (Criteria) this;
        }

        public Criteria andReplenishAmountTrainEqualTo(Integer value) {
            addCriterion("replenish_amount_train =", value, "replenishAmountTrain");
            return (Criteria) this;
        }

        public Criteria andReplenishAmountTrainNotEqualTo(Integer value) {
            addCriterion("replenish_amount_train <>", value, "replenishAmountTrain");
            return (Criteria) this;
        }

        public Criteria andReplenishAmountTrainGreaterThan(Integer value) {
            addCriterion("replenish_amount_train >", value, "replenishAmountTrain");
            return (Criteria) this;
        }

        public Criteria andReplenishAmountTrainGreaterThanOrEqualTo(Integer value) {
            addCriterion("replenish_amount_train >=", value, "replenishAmountTrain");
            return (Criteria) this;
        }

        public Criteria andReplenishAmountTrainLessThan(Integer value) {
            addCriterion("replenish_amount_train <", value, "replenishAmountTrain");
            return (Criteria) this;
        }

        public Criteria andReplenishAmountTrainLessThanOrEqualTo(Integer value) {
            addCriterion("replenish_amount_train <=", value, "replenishAmountTrain");
            return (Criteria) this;
        }

        public Criteria andReplenishAmountTrainIn(List<Integer> values) {
            addCriterion("replenish_amount_train in", values, "replenishAmountTrain");
            return (Criteria) this;
        }

        public Criteria andReplenishAmountTrainNotIn(List<Integer> values) {
            addCriterion("replenish_amount_train not in", values, "replenishAmountTrain");
            return (Criteria) this;
        }

        public Criteria andReplenishAmountTrainBetween(Integer value1, Integer value2) {
            addCriterion("replenish_amount_train between", value1, value2, "replenishAmountTrain");
            return (Criteria) this;
        }

        public Criteria andReplenishAmountTrainNotBetween(Integer value1, Integer value2) {
            addCriterion("replenish_amount_train not between", value1, value2, "replenishAmountTrain");
            return (Criteria) this;
        }

        public Criteria andFirstReplenishTrainIsNull() {
            addCriterion("first_replenish_train is null");
            return (Criteria) this;
        }

        public Criteria andFirstReplenishTrainIsNotNull() {
            addCriterion("first_replenish_train is not null");
            return (Criteria) this;
        }

        public Criteria andFirstReplenishTrainEqualTo(Integer value) {
            addCriterion("first_replenish_train =", value, "firstReplenishTrain");
            return (Criteria) this;
        }

        public Criteria andFirstReplenishTrainNotEqualTo(Integer value) {
            addCriterion("first_replenish_train <>", value, "firstReplenishTrain");
            return (Criteria) this;
        }

        public Criteria andFirstReplenishTrainGreaterThan(Integer value) {
            addCriterion("first_replenish_train >", value, "firstReplenishTrain");
            return (Criteria) this;
        }

        public Criteria andFirstReplenishTrainGreaterThanOrEqualTo(Integer value) {
            addCriterion("first_replenish_train >=", value, "firstReplenishTrain");
            return (Criteria) this;
        }

        public Criteria andFirstReplenishTrainLessThan(Integer value) {
            addCriterion("first_replenish_train <", value, "firstReplenishTrain");
            return (Criteria) this;
        }

        public Criteria andFirstReplenishTrainLessThanOrEqualTo(Integer value) {
            addCriterion("first_replenish_train <=", value, "firstReplenishTrain");
            return (Criteria) this;
        }

        public Criteria andFirstReplenishTrainIn(List<Integer> values) {
            addCriterion("first_replenish_train in", values, "firstReplenishTrain");
            return (Criteria) this;
        }

        public Criteria andFirstReplenishTrainNotIn(List<Integer> values) {
            addCriterion("first_replenish_train not in", values, "firstReplenishTrain");
            return (Criteria) this;
        }

        public Criteria andFirstReplenishTrainBetween(Integer value1, Integer value2) {
            addCriterion("first_replenish_train between", value1, value2, "firstReplenishTrain");
            return (Criteria) this;
        }

        public Criteria andFirstReplenishTrainNotBetween(Integer value1, Integer value2) {
            addCriterion("first_replenish_train not between", value1, value2, "firstReplenishTrain");
            return (Criteria) this;
        }

        public Criteria andHeadwaytimeTrainIsNull() {
            addCriterion("headwaytime_train is null");
            return (Criteria) this;
        }

        public Criteria andHeadwaytimeTrainIsNotNull() {
            addCriterion("headwaytime_train is not null");
            return (Criteria) this;
        }

        public Criteria andHeadwaytimeTrainEqualTo(Integer value) {
            addCriterion("headwaytime_train =", value, "headwaytimeTrain");
            return (Criteria) this;
        }

        public Criteria andHeadwaytimeTrainNotEqualTo(Integer value) {
            addCriterion("headwaytime_train <>", value, "headwaytimeTrain");
            return (Criteria) this;
        }

        public Criteria andHeadwaytimeTrainGreaterThan(Integer value) {
            addCriterion("headwaytime_train >", value, "headwaytimeTrain");
            return (Criteria) this;
        }

        public Criteria andHeadwaytimeTrainGreaterThanOrEqualTo(Integer value) {
            addCriterion("headwaytime_train >=", value, "headwaytimeTrain");
            return (Criteria) this;
        }

        public Criteria andHeadwaytimeTrainLessThan(Integer value) {
            addCriterion("headwaytime_train <", value, "headwaytimeTrain");
            return (Criteria) this;
        }

        public Criteria andHeadwaytimeTrainLessThanOrEqualTo(Integer value) {
            addCriterion("headwaytime_train <=", value, "headwaytimeTrain");
            return (Criteria) this;
        }

        public Criteria andHeadwaytimeTrainIn(List<Integer> values) {
            addCriterion("headwaytime_train in", values, "headwaytimeTrain");
            return (Criteria) this;
        }

        public Criteria andHeadwaytimeTrainNotIn(List<Integer> values) {
            addCriterion("headwaytime_train not in", values, "headwaytimeTrain");
            return (Criteria) this;
        }

        public Criteria andHeadwaytimeTrainBetween(Integer value1, Integer value2) {
            addCriterion("headwaytime_train between", value1, value2, "headwaytimeTrain");
            return (Criteria) this;
        }

        public Criteria andHeadwaytimeTrainNotBetween(Integer value1, Integer value2) {
            addCriterion("headwaytime_train not between", value1, value2, "headwaytimeTrain");
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