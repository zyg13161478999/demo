package com.restructure.demo.simpleFactory;

public class Client {
    public static void main(String args[]) {
        try {
            TV tv;
            tv = TVFactory.produceTV("Haier");
            tv.play();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
