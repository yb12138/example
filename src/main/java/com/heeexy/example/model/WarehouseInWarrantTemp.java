package com.heeexy.example.model;

import java.util.List;

public class WarehouseInWarrantTemp {
    private WarehouseInWarrant warehouseInWarrant;

    private List<WarehouseInWarrantSku> skus;

    public WarehouseInWarrant getWarehouseInWarrant() {
        return warehouseInWarrant;
    }

    public void setWarehouseInWarrant(WarehouseInWarrant warehouseInWarrant) {
        this.warehouseInWarrant = warehouseInWarrant;
    }

    public List<WarehouseInWarrantSku> getSkus() {
        return skus;
    }

    public void setSkus(List<WarehouseInWarrantSku> skus) {
        this.skus = skus;
    }
}
