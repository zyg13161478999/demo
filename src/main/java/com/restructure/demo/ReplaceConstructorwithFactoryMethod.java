package com.restructure.demo;

import com.restructure.demo.bean.Employee;

/**
 * @author .gang
 * 以工厂函数取代构造函数
 * @date 2021/12/28
 */
public class ReplaceConstructorwithFactoryMethod {

    public Employee getLevel(int type){
        return new Employee(type);
    }
}
