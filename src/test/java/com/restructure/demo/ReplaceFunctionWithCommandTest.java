package com.restructure.demo;


import org.junit.Assert;
import org.junit.Test;

/**
 * @author .gang
 * @date 2021/12/29
 */
public class ReplaceFunctionWithCommandTest {


    @Test
    public void gamma() {
        ReplaceFunctionWithCommand command  = new ReplaceFunctionWithCommand();
        int gamma = command.gamma(1, 2, 3);
        Assert.assertEquals(517,gamma);

    }
}
