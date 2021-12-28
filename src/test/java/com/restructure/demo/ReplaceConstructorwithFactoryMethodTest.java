package com.restructure.demo;


import com.restructure.demo.bean.Employee;
import com.restructure.demo.bean.Engineer;
import com.restructure.demo.bean.Manager;
import com.restructure.demo.bean.Salesman;
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
        Assert.assertTrue(new Salesman().getClass() == method.getLevel(Employee.SALESMAN).getClass());
    }

    @Test
    public void should_return_ENGINEER() throws Exception {
        ReplaceConstructorwithFactoryMethod method = new ReplaceConstructorwithFactoryMethod();
        Assert.assertTrue(new Manager().getClass() == method.getLevel(Employee.MANAGER).getClass());
    }

    @Test
    public void should_return_MANAGER() throws Exception {
        ReplaceConstructorwithFactoryMethod method = new ReplaceConstructorwithFactoryMethod();
        Assert.assertTrue(new Engineer().getClass() == method.getLevel(Employee.ENGINEER).getClass());
    }
}
