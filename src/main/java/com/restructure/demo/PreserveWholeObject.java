package com.restructure.demo;

import com.restructure.demo.bean.TempRange;

/**
 * @author .gang
 * 保持对象完整
 * @date 2021/12/27
 */
public class PreserveWholeObject {

    private MeetingPlan plan;

    public PreserveWholeObject(MeetingPlan plan) {
        this.plan = plan;
    }

    public boolean isWithinPlan(int low,int high){
        boolean range = plan.withinRange(low, high);
        return range;
    }

    public static class MeetingPlan {

        private final TempRange tempRange;


        public MeetingPlan(TempRange tempRange) {
            this.tempRange = tempRange;
        }

        public boolean withinRange(int low, int high) {
            if (low > tempRange.getLow() && high < tempRange.getHigh()) {
                return true;
            }
            return false;
        }
    }
}
