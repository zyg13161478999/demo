package com.restructure.demo.abstractFactory;

/**
 * @author mac
 */
public class HaierFactory implements EFactory {
    @Override
    public Television produceTelevision() {
        return new HaierTelevision();
    }

    @Override
    public AirConditioner produceAirConditioner() {
        return new HairAirConditioner();
    }
}