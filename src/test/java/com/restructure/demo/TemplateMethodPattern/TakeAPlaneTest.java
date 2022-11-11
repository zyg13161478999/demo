package com.restructure.demo.TemplateMethodPattern;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author .gang
 * @date 2022/11/10
 */
public class TakeAPlaneTest {

    @Test
    public void haiHangFlightCompleted() {
        //坐海航出差
        TakeAPlane haiHang = new TakeAPlaneToHaiHang(false);
        String fly = haiHang.fly();
        Assert.assertEquals("FlightCompleted",fly);
    }

    @Test
    public void haiHangGoBack() {
        //坐海航,家里临时有事，回家
        TakeAPlane haiHang = new TakeAPlaneToHaiHang(true);
        String fly = haiHang.fly();
        Assert.assertEquals("goBack",fly);
    }

    @Test
    public void shanHangFlightCompleted() {
        //坐山航出差
        TakeAPlane shanHang = new TakeAPlaneToShanHang(false);
        String fly = shanHang.fly();
        Assert.assertEquals("FlightCompleted",fly);
    }

    @Test
    public void shanHangGoBack() {
        //坐山航,家里临时有事，回家
        TakeAPlane shanHang = new TakeAPlaneToShanHang(true);
        String fly = shanHang.fly();
        Assert.assertEquals("goBack",fly);
    }
}
