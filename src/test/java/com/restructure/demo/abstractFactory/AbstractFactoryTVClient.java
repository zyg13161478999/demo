package com.restructure.demo.abstractFactory;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author .gang
 * @date 2022/7/20
 */
public class AbstractFactoryTVClient {
    @Test
    public void Haier_TV_AirConditioner() {
        try {
            EFactory factory = new HaierFactory();
            Television television = factory.produceTelevision();
            String play = television.play();
            Assert.assertEquals("HairTV", play);
            AirConditioner airConditioner = factory.produceAirConditioner();
            String changeTemperature = airConditioner.changeTemperature();
            Assert.assertEquals("HairAirConditionerChangeTemperature", changeTemperature);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void TCL_TV() {
        try {
            EFactory factory = new TCLFactory();
            Television television = factory.produceTelevision();
            String play = television.play();
            Assert.assertEquals("TCLTV", play);
            AirConditioner airConditioner = factory.produceAirConditioner();
            String changeTemperature = airConditioner.changeTemperature();
            Assert.assertEquals("TCLAirConditioner", changeTemperature);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


}
