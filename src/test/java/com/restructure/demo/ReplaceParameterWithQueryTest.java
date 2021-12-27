package com.restructure.demo;

import org.junit.Assert;
import org.junit.Test;


/**
 * @author .gang
 * @date 2021/12/27
 */
public class ReplaceParameterWithQueryTest {


    @Test
    public void should_return_final_price() {
        ReplaceParameterWithQuery replaceParameterWithQuery = new ReplaceParameterWithQuery();
        Assert.assertEquals(Double.valueOf(16.0),replaceParameterWithQuery.calcFinalPrice());
    }
}
