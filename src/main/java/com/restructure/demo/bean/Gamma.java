package com.restructure.demo.bean;

import com.restructure.demo.ReplaceFunctionWithCommand;

/**
 * @author .gang
 * @date 2021/12/29
 */
public class Gamma {
    private final ReplaceFunctionWithCommand account;
    private int inputVal;
    private int quantity;
    private int yearToDate;
    private int importantValue1;
    private int importantValue2;
    private int importantValue3;


    /**
     * 计量方法对象构造器, 计量方法需要三个参数, 并且还需
     * 多传一个原函数所在对象参数, 用以获得依赖的属性或方法
     */
    public Gamma(int inputValArg, int quantityArg, int yearToDateArg, ReplaceFunctionWithCommand source){
        this.account = source;
        this.inputVal = inputValArg;
        this.quantity = quantityArg;
        this.yearToDate = yearToDateArg;
    }


    /**
     * 计量方法
     */
    public int compute(){
        this.importantValue1 = (inputVal * quantity) + account.delta();
        this.importantValue2 = (inputVal * yearToDate) + 100;
        if((yearToDate - this.importantValue1) > 100) {
            this.importantValue2 -= 20;
        }
        this.importantValue3 = this.importantValue2 * 7;
        return this.importantValue3 - 2 * this.importantValue1;
    }
}
