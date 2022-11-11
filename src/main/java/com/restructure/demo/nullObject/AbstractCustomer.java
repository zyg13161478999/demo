package com.restructure.demo.nullObject;


/**
 * 抽象对象
 */
abstract class AbstractCustomer {
    String name;

    /**
     * 获取名称
     * @return
     */
    abstract String getName();

    /**
     * 是否是空值
     * @return
     */
    abstract boolean isNull();
}
