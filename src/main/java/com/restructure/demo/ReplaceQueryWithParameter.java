package com.restructure.demo;

import com.restructure.demo.bean.Thermostat;

/**
 * @author .gang
 * 以参数取代查询
 * @date 2021/12/29
 */
public class ReplaceQueryWithParameter {


    public static String getThermostat(Thermostat thermostat) {
        if (thermostat.getSelectedTemperature() > thermostat.getCurrentTemperature()) {
            return "heat";
        } else if (thermostat.getSelectedTemperature() < thermostat.getCurrentTemperature()) {
            return "cool";
        } else {
            return "ok";
        }
    }
}
