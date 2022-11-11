package com.restructure.demo.TemplateMethodPattern;

/**
 * @author .gang
 * @date 2022/11/8
 */
public class TakeAPlaneToHaiHang extends TakeAPlane {
    private boolean anyThing = false;

    public TakeAPlaneToHaiHang(boolean anyThing) {
        this.anyThing = anyThing;
    }

    /**
     * 留给子类的方法
     */
    @Override
    protected void selectPlane() {
        System.out.println("上了海航的飞机");
    }

    /**
     * 重写钩子方法
     */
    @Override
    protected boolean isAnyThing() {
        return this.anyThing;
    }

}
