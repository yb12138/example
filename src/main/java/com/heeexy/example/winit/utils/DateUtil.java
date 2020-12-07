package com.heeexy.example.winit.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateUtil {

    public static final String SIMPLE_DATE_STRING = "yyyy-MM-dd";

    public static final String FULL_DATE_STRING = "yyyy-MM-dd HH:mm:ss";
    public static final String FULL_DATE_STRING1 = "yyyy-MM-dd H:mm:ss";
    public static final String FULL_DATE_STRING2 = "yyyy-MM-dd 23:59:59";
    public static final String FULL_DATE_STRING3 = "yyyy-MM-dd 00:00:00";

    public static Date parse2Date(String date, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        try {
            return sdf.parse(date);
        } catch (ParseException e) {
            return null;
        }
    }

    /**
     * 拼接yyyy-MM-dd 23:59:59
     *
     * @param date
     * @return
     */
    public static Date spliceDate(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat(FULL_DATE_STRING2);
        String formatStr = sdf.format(date);
        sdf = new SimpleDateFormat(FULL_DATE_STRING);
        try {
            return sdf.parse(formatStr);
        } catch (ParseException e) {
            return null;
        }
    }

    /**
     * 拼接yyyy-MM-dd 00:00:00
     *
     * @param date
     * @return
     */
    public static Date spliceDate2(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat(FULL_DATE_STRING3);
        String formatStr = sdf.format(date);
        sdf = new SimpleDateFormat(FULL_DATE_STRING);
        try {
            return sdf.parse(formatStr);
        } catch (ParseException e) {
            return null;
        }
    }

    public static String parse2String(Date date, String format) {
        if (date == null) {
            return null;
        }
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(date);
    }

    public static String parse2StringByTimeZone(Date date, String format, TimeZone toTimeZone) {
        if (date == null) {
            return null;
        }
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        sdf.setTimeZone(toTimeZone);
        return sdf.format(date);
    }

    /**
     * 判断当前日期为星期几
     *
     * @param date
     * @return
     */
    public static int dayOfWeek(Date date) {
        Calendar aCalendar = Calendar.getInstance();
        aCalendar.setTime(date);
        int weekDay = aCalendar.get(Calendar.DAY_OF_WEEK);
        return weekDay - 1;
    }

    /**
     * 获取指定日期指定天数后的日期
     *
     * @param date  指定日期
     * @param index 指定天数
     * @param flag  是否将时分秒归0
     * @return
     */
    public static Date getNextDate(Date date, int index, boolean flag) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);// 获得当前时间
        if (flag) {
            // 日期不变，把时间设定为00：00：00
            cal.set(Calendar.HOUR_OF_DAY, 0);
            cal.set(Calendar.MINUTE, 00);
            cal.set(Calendar.SECOND, 00);
        }
        cal.set(Calendar.DATE, cal.get(Calendar.DATE) + index);
        return cal.getTime();
    }

    public static Date getDate(Date currentDate, int days) {
        /*
         * 1，根据传入日期获取下一天日期
         * 2，判断下一天日期是否为工作日，如果是则设置下一次循环日期为此日期
         *       如果不为工作日，为周6，日期前进2天，为周天前进1天
         * 3, 获取指定天数后的工作日
         */
        Date date = currentDate;
        /* 设置循环次数
         * 如果含最后一天则循环 days + 1 天，不需要含最后一天，则循环 days次
         *  */
        for (int i = 0; i < days + 1; i++) {

            Date nextDate = getNextDate(date, 1, false); //获取下一天的日期
            int weekDay = dayOfWeek(nextDate); //下一天日期为星期几
            if (weekDay == 1) { //为星期六
                date = getNextDate(date, 2, false);
            } else if (weekDay == 6) { //为星期天
                date = getNextDate(date, 3, false);
            } else {
                date = nextDate;
            }
        }
        return date;
    }

    /**
     * 将时间转换为指定时区的时间
     *
     * @param time
     * @param from
     * @param to
     * @return
     */
    public static Date convertDateOnTimeZone(long time, TimeZone from, TimeZone to) {
        return new Date(time - from.getOffset(time) + to.getOffset(time));
    }

    public static void main(String[] args) throws ParseException {
        Date date1 = DateUtil.parse2Date("2016-09-09", SIMPLE_DATE_STRING);
        Date parse = spliceDate(date1);
        System.out.println(parse);

    }

    /**
     * TODO Add comments here.
     *
     * @return
     */
    public static String getCurrentDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmssS");
        Date date = new Date();
        return dateFormat.format(date);
    }
}
