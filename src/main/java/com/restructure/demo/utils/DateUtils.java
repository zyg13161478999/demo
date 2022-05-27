package com.restructure.demo.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author .gang
 * @date 2022/2/21
 */
public class DateUtils {

    /**
     * String转date
     * @param
     * @return
     */
    public static String getDateByStringDate(String stringDate,String format) throws ParseException {
        return new SimpleDateFormat(format).format(new SimpleDateFormat(format).parse(stringDate));
    }


    /**
     * String转date
     * @param
     * @return
     */
    public static String getWeek(Date date,String format) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        return simpleDateFormat.format(date);
    }
}
