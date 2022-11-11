package com.restructure.demo.nullObject;


/**
 * 具体对象
 */
class RealCustomer extends AbstractCustomer {
    public RealCustomer(final String name) {
        this.name = name;
    }

    @Override
    String getName() {
        return "姓名：" + this.name;
    }

    @Override
    boolean isNull() {
        return false;
    }
}
