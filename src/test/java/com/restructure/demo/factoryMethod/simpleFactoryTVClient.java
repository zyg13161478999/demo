package com.restructure.demo.factoryMethod;

import com.restructure.demo.simpleFactory.TV;
import com.restructure.demo.simpleFactory.TVFactory;
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
            com.restructure.demo.factoryMethod.TVFactory factory= new HaierTVFactory();
            TV tv=factory.produceTV();
            String play = tv.play();
            Assert.assertEquals("HaierTV",play);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void HisenseTV() {
        try {
            com.restructure.demo.factoryMethod.TVFactory factory= new HisenseTVFactory();
            TV tv=factory.produceTV();
            String play = tv.play();
            Assert.assertEquals("HisenseTV",play);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
