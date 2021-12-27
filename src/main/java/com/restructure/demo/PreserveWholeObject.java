package com.restructure.demo;

import com.restructure.demo.bean.TempRange;

/**
 * @author .gang
 * 11．4 保持对象完整 Preserve Whole Object
 * (将一个对象的一堆数据收集起来，并以该对象替换他们，从而来提高函数的可读性)
 * 减小参数列表，提高代码可读性
 * @date 2021/12/27
 */
public class PreserveWholeObject {

    private MeetingPlan plan;

    public PreserveWholeObject(MeetingPlan plan) {
        this.plan = plan;
    }

    public boolean isWithinPlan(TempRange tempRange){
        return plan.withinRange(tempRange);
    }

    public static class MeetingPlan {

        private final TempRange tempRange;


        public MeetingPlan(TempRange tempRange) {
            this.tempRange = tempRange;
        }

        public boolean withinRange(TempRange tempRange) {
            return this.tempRange.isInclude(tempRange);
        }

    }
}
