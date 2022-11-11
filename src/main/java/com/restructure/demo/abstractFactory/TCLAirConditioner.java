package com.restructure.demo.abstractFactory;

/**
 * @author mac
 */
public class TCLAirConditioner implements AirConditioner {
    @Override
    public String changeTemperature() {
        return "TCLAirConditioner";
    }
}