package com.restructure.demo.utils;

import org.junit.Assert;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import static org.junit.Assert.*;

/**
 * @author .gang
 * @date 2022/2/21
 */
public class DateUtilsTest {

    @Test
    public void yyyy() throws ParseException {
        String dateByStringDatey = DateUtils.getDateByStringDate("2017-12-31", "yyyy-MM-dd");
        Assert.assertEquals("2017-12-31", dateByStringDatey);
    }

    @Test
    public void YYYY() throws ParseException {
        String dateByStringDateY = DateUtils.getDateByStringDate("2017-12-31", "YYYY-MM-dd");
        Assert.assertEquals("2017-12-31", dateByStringDateY);
    }

    /**
     * y	年份。一般用 yy 表示两位年份，yyyy 表示 4 位年份	使用 yy 表示的年扮，如 11；
     * 使用 yyyy 表示的年份，如 2011
     * M	月份。一般用 MM 表示月份，如果使用 MMM，则会
     * 根据语言环境显示不同语言的月份	使用 MM 表示的月份，如 05；
     * 使用 MMM 表示月份，
     * d	月份中的天数。一般用 dd 表示天数	使用 dd 表示的天数，如 01
     * D	年份中的天数。表示当天是当年的第几天， 用 D 表示	使用 D 表示的年份中的天数，如 295
     * E	星期几。用 E 表示，会根据语言环境的不同， 显示不
     * H	一天中的小时数（0~23)。一般用 HH 表示小时数	使用 HH 表示的小时数，如 18
     * h	一天中的小时数（1~12)。一般使用 hh 表示小时数	使用 hh 表示的小时数，如 10 (注意 10 有
     * 可能是 10 点，也可能是 22 点）
     * m	分钟数。一般使用 mm 表示分钟数	使用 mm 表示的分钟数，如 29
     * s	秒数。一般使用 ss 表示秒数	使用 ss 表示的秒数，如 38
     * S	毫秒数。一般使用 SSS 表示毫秒数	使用 SSS 表示的毫秒数，如 156
     *
     * @throws ParseException
     */
    @Test
    public void dateHH() throws ParseException {
        String date = DateUtils.getDateByStringDate("2017-12-31 23:59:59", "yyyy-MM-dd HH:mm:ss");
        Assert.assertEquals("2017-12-31 23:59:59", date);
    }

    @Test
    public void dateFhh() throws ParseException {
        String date = DateUtils.getDateByStringDate("2017-12-31 23:59:59", "yyyy-MM-dd hh:mm:ss");
        Assert.assertNotEquals("2017-12-31 23:59:59", date);
    }

    @Test
    public void week() throws ParseException {
        String date = DateUtils.getWeek(new Date(), "EEEE");
        System.out.println(date);
    }

    @Test
    public void currentTimeMillis() {
        System.out.println(System.currentTimeMillis());
        Date date = new Date();
        date.setTime(System.currentTimeMillis());
        System.out.println(new SimpleDateFormat().format(date));
    }

    /**
     * MONTH 指示月份的 get 和 set 的字段数字。这是一个特定于日历的值。
     * 在格里高利历和罗马儒略历中一年中的第一个月是 JANUARY，它为 0；
     * 最后一个月取决于一年中的月份数。 简单来说，因为这个值的初始值是0，因此我们要用它来表示正确的月份时就需要加1。
     */
    @Test
    public void month() {
        Calendar calendar = null;
        calendar = new GregorianCalendar();
        System.out.println(calendar.get(Calendar.MONTH));
    }


}