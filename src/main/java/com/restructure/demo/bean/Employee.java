package com.restructure.demo.bean;

/**
 * @author .gang
 * 以工厂函数取代构造函数
 * @date 2021/12/28
 */
public class Employee {
    private int _type;
    //工程师
    public static final int ENGINEER = 0;
    //售货员
    public static final int SALESMAN = 1;
    //经理
    public static final int MANAGER = 2;
    public Employee(int type) {
        this._type = type;
    }

    public int get_type() {
        return _type;
    }
}
