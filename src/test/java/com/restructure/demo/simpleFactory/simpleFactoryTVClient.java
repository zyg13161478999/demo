package com.restructure.demo.simpleFactory;

import com.restructure.demo.bean.Employee;
import org.junit.Assert;
import org.junit.Test;

import java.text.DateFormat;

/**
 * @author .gang
 * @date 2022/5/24
 */
public class simpleFactoryTVClient {

    @Test
    public void HaierTV() {
        try {
            TV tv = TVFactory.produceTV("Haier");
            String play = tv.play();
            Assert.assertEquals("HaierTV",play);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void TCL_TV() {
        try {
            TV tv = TVFactory.produceTV("TCL");
        } catch (Exception e) {
            Assert.assertEquals("对不起，暂不能生产该品牌电视机！",e.getMessage());
        }
    }
}
