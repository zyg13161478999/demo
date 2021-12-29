package com.restructure.demo.bean;

/**
 * @author .gang
 * 以工厂函数取代构造函数
 * 工厂函数是简单工厂模式的核心函数，实现了对象创建和使用的分离。
 * @date 2021/12/28
 */
public class Employee {
    public int _type;
    //工程师
    public static final int ENGINEER = 0;
    //售货员
    public static final int SALESMAN = 1;
    //经理
    public static final int MANAGER = 2;

    public Employee() {
    }

    public static Employee create(int type) throws Exception {
        switch (type) {
            case 0:
                return new Engineer();
            case 1:
                return new Salesman();
            case 2:
                return new Manager();
            default:
                throw new Exception("Incorrect type code value.");
        }
    }


}
