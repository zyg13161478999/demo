package com.restructure.demo.factoryMethod;

import com.restructure.demo.simpleFactory.TV;

public class Client {
    public static void main(String args[]) {
        try {
            TV tv;
            TVFactory factory= new HisenseTVFactory();
            tv=factory.produceTV();
            tv.play();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
