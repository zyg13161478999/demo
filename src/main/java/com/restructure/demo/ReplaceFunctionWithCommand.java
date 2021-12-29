package com.restructure.demo;

/**
 * @author .gang
 * 以命令取代函数
 * @date 2021/12/29
 */
public class ReplaceFunctionWithCommand {


    /**
     * 计量方法(需要三个参数)
     */
    public int gamma(int inputVal, int quantity, int yearToDate) {
        int importantValue1 = (inputVal * quantity) + delta();
        int importantValue2 = (inputVal * yearToDate) + 100;
        if ((yearToDate - importantValue1) > 100) {
            importantValue2 -= 20;
        }
        int importantValue3 = importantValue2 * 7;
        return importantValue3 - 2 * importantValue1;
    }


    /**
     * 变量: 增量幅度值
     * 重构方法之: 用查询方法代替临时变量
     *
     * @return
     */
    public int delta() {//此处设置public, 以便函数对象获取(同包下可以设置default, 最低可见度原则)
        return 100;
    }

}
