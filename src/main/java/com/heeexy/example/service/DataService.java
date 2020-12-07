package com.heeexy.example.service;

/**
 * 拉取万邑通，谷仓出库订单号,万邑通返利，酋长订单等基础数据
 */
public interface DataService {

    void updateBasicData();

    /**
     * 更新万邑通库存
     */
    void synStorageData();

    void synGoodData();

    //每天更新万邑通出库单
    void updateWinitOut();

    //更新谷仓出库单
    void generateGoodOrder();

    void generateWinitOrder();

    //出库单数据矫正
    void checkOutData();

}
