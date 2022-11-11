package com.restructure.demo.nullObject;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author .gang
 * @date 2022/9/15
 */
public class NullPatternDemo {
    public static void main(String[] args) {

        AbstractCustomer customer1 = CustomerFactory.getCustomer("Rob");
        AbstractCustomer customer2 = CustomerFactory.getCustomer("Bob");
        AbstractCustomer customer3 = CustomerFactory.getCustomer("Julie");
        AbstractCustomer customer4 = CustomerFactory.getCustomer("Laura");

        System.out.println("Customers");
        System.out.println(customer1.getName());
        System.out.println(customer2.getName());
        System.out.println(customer3.getName());
        System.out.println(customer4.getName());
        LocalDate l_da1 = LocalDate.parse("2022-09-21");
        System.out.println(l_da1.isAfter(LocalDate.now()));

    }
}
