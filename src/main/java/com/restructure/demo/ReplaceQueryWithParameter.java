package com.restructure.demo;

import com.restructure.demo.bean.Thermostat;

/**
 * @author .gang
 * 以参数取代查询
 * @date 2021/12/29
 */
public class ReplaceQueryWithParameter {


    public static String getThermostat(Thermostat thermostat) {
        int selectedTemperature = thermostat.getSelectedTemperature();
        int currentTemperature = thermostat.getCurrentTemperature();
        if (selectedTemperature > currentTemperature) {
            return "heat";
        } else if (selectedTemperature < currentTemperature) {
            return "cool";
        } else {
            return "ok";
        }
    }
}
