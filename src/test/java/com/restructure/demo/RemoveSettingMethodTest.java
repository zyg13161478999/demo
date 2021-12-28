package com.restructure.demo;


import org.junit.Assert;
import org.junit.Test;

/**
 * @author .gang
 * @date 2021/12/28
 */
public class RemoveSettingMethodTest {

    @Test
    public void should_return_false() {
        String test = "t";
        RemoveSettingMethod method = new RemoveSettingMethod("test");
        Assert.assertFalse(test.equals(method.get_id()));
    }

    @Test
    public void should_return_true() {
        String test = "test";
        RemoveSettingMethod method = new RemoveSettingMethod("test");
        Assert.assertTrue(test.equals(method.get_id()));
    }
}
