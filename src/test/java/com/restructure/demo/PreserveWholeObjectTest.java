package com.restructure.demo;


import com.restructure.demo.bean.TempRange;
import org.junit.Assert;
import org.junit.Test;


/**
 * @author .gang
 * @date 2021/12/27
 */
public class PreserveWholeObjectTest {


    @Test
    public void should_in_plan() {
        PreserveWholeObject preserveWholeObject = new PreserveWholeObject(new PreserveWholeObject.MeetingPlan(new TempRange(1, 10)));
        final TempRange tempRange = new TempRange(3,8);
        Assert.assertTrue(preserveWholeObject.isWithinPlan(tempRange));
    }

    @Test
    public void should_not_in_plan() {
        PreserveWholeObject preserveWholeObject = new PreserveWholeObject(new PreserveWholeObject.MeetingPlan(new TempRange(2, 8)));
        final TempRange tempRange = new TempRange(1,8);
        Assert.assertFalse(preserveWholeObject.isWithinPlan(tempRange));
    }
}
