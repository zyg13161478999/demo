package com.restructure.demo.abstractFactory;

/**
 * @author mac
 */
public class HairAirConditioner implements AirConditioner {
    @Override
    public String changeTemperature() {
        return "HairAirConditionerChangeTemperature";
    }
}