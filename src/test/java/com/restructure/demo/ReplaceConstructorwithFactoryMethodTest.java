package com.restructure.demo;


import com.restructure.demo.bean.Employee;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author .gang
 * @date 2021/12/28
 */
public class ReplaceConstructorwithFactoryMethodTest {


    @Test
    public void should_return_SALESMAN() throws Exception {
        ReplaceConstructorwithFactoryMethod method = new ReplaceConstructorwithFactoryMethod();
        Assert.assertEquals(1,method.getLevel(Employee.SALESMAN).getType());
    }

    @Test
    public void should_return_ENGINEER() throws Exception {
        ReplaceConstructorwithFactoryMethod method = new ReplaceConstructorwithFactoryMethod();
        Assert.assertEquals(2,method.getLevel(Employee.MANAGER).getType());
    }

    @Test
    public void should_return_MANAGER() throws Exception {
        ReplaceConstructorwithFactoryMethod method = new ReplaceConstructorwithFactoryMethod();
        Assert.assertEquals(0,method.getLevel(Employee.ENGINEER).getType());
    }
}
