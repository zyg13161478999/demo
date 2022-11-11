package com.restructure.demo.nullObject;


/**
 * 空对象
 */
class NullObject extends AbstractCustomer {
    @Override
    String getName() {
        return "Not Available in Customer Database";
    }
    @Override
    boolean isNull() {
        return true;
    }
}