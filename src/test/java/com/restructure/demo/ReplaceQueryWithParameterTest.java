package com.restructure.demo;

import com.restructure.demo.bean.Thermostat;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author .gang
 * @date 2021/12/29
 */
public class ReplaceQueryWithParameterTest {

    @Test
    public void heat() {
        Thermostat thermostat = new Thermostat();
        thermostat.setCurrentTemperature(10);
        thermostat.setSelectedTemperature(12);
        Assert.assertEquals("heat",ReplaceQueryWithParameter.getThermostat(thermostat));
    }

    @Test
    public void cool() {
        Thermostat thermostat = new Thermostat();
        thermostat.setCurrentTemperature(15);
        thermostat.setSelectedTemperature(12);
        Assert.assertEquals("cool",ReplaceQueryWithParameter.getThermostat(thermostat));
    }

    @Test
    public void ok() {
        Thermostat thermostat = new Thermostat();
        thermostat.setCurrentTemperature(15);
        thermostat.setSelectedTemperature(15);
        Assert.assertEquals("ok",ReplaceQueryWithParameter.getThermostat(thermostat));
    }
}