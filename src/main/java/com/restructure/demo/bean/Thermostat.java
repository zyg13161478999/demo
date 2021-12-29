package com.restructure.demo.bean;

/**
 * @author .gang
 * @date 2021/12/29
 */
public class Thermostat {

    /**
     * 挑选的温度
     */
    private   int selectedTemperature;

    /**
     * 当前温度
     */
    private   int currentTemperature;


    public int getSelectedTemperature() {
        return selectedTemperature;
    }

    public void setSelectedTemperature(int selectedTemperature) {
        this.selectedTemperature = selectedTemperature;
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(int currentTemperature) {
        this.currentTemperature = currentTemperature;
    }
}
