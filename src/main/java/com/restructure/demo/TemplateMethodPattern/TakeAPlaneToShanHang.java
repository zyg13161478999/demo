package com.restructure.demo.TemplateMethodPattern;

/**
 * @author .gang
 * @date 2022/11/8
 */
public class TakeAPlaneToShanHang extends TakeAPlane {

    private boolean anyThing = false;

    public TakeAPlaneToShanHang(boolean anyThing) {
        this.anyThing = anyThing;
    }

    /**
     * 留给子类的方法
     */
    @Override
    protected void selectPlane() {
        System.out.println("上了山航的飞机");
    }

    /**
     * 重写钩子方法
     */
    @Override
    protected boolean isAnyThing() {
        return this.anyThing;
    }

}
