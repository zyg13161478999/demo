package com.restructure.demo.bean;

import com.restructure.demo.PreserveWholeObject;

/**
 * @author .gang
 * @date 2021/12/27
 */
public class TempRange {

    private int low;

    private int high;

    public TempRange(int low,int high){
        this.low = low;
        this.high = high;
    }

    public int getLow() {
        return low;
    }

    public int getHigh() {
        return high;
    }

    public boolean isInclude(TempRange tempRange) {
         if (tempRange.getLow() > getLow() && tempRange.getHigh() < getHigh()) {
             return true;
         }
         return false;
     }
}
