package com.restructure.demo;


import com.restructure.demo.bean.Employee;
import com.restructure.demo.bean.Salesman;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author .gang
 * @date 2021/12/28
 */
public class ReplaceConstructorwithFactoryMethodTest {


    private Salesman Salesman;

    @Test
    public void should_return_SALESMAN() {
        ReplaceConstructorwithFactoryMethod method = new ReplaceConstructorwithFactoryMethod();
        Assert.assertEquals(1,method.getLevel(Employee.SALESMAN).get_type());
    }

    @Test
    public void should_return_ENGINEER() {
        ReplaceConstructorwithFactoryMethod method = new ReplaceConstructorwithFactoryMethod();
        Assert.assertEquals(2,method.getLevel(Employee.MANAGER).get_type());
    }

    @Test
    public void should_return_MANAGER() {
        ReplaceConstructorwithFactoryMethod method = new ReplaceConstructorwithFactoryMethod();
        Assert.assertEquals(0,method.getLevel(Employee.ENGINEER).get_type());
    }
}
