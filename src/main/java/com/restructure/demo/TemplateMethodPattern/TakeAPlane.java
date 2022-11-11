package com.restructure.demo.TemplateMethodPattern;

/**
 * @author .gang
 * @date 2022/11/8
 */
public abstract class TakeAPlane {


    /**
     * 坐飞机的流程是固定的
     */
    protected final String fly() {

        //买票
        this.buyTick();

        //安检
        this.SecurityCheck();

        //实现流程的微调，如果流程不用微调，可以不用
        if (isAnyThing()) {
            //返回
           return this.goBack();
        } else {
            //上飞机
            this.selectPlane();
            //飞行完成
           return this.CompletionOfFlight();
        }

    }

    protected final void buyTick() {
        System.out.println("买票");
    }

    protected final void SecurityCheck() {
        System.out.println("安检");
    }

    /**
     * 钩子方法
     */
    protected boolean isAnyThing() {
        return false;
    }

    protected final String goBack() {
        System.out.println("临时有事，原路回家");
        return "goBack";
    }

    protected abstract void selectPlane();

    protected final String CompletionOfFlight() {
        System.out.println("一路平安，飞行完成");
        return "FlightCompleted";
    }
}
