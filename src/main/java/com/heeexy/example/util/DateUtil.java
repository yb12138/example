package com.heeexy.example.util;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class DateUtil {
    public static Integer getLastDayOfMonth(int year, int month) {
        Calendar cal = Calendar.getInstance();
        //设置年份
        cal.set(Calendar.YEAR, year);
        //设置月份
        cal.set(Calendar.MONTH, month - 1);
        //获取某月最大天数
        int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        return lastDay;
    }

    public static Map<Integer, Integer> calcDay(int year, int month, int day, int off) {
        Calendar cal = Calendar.getInstance();
        cal.clear();
        cal.set(Calendar.YEAR, year);
        //设置月份
        cal.set(Calendar.MONTH, month - 1);
        cal.set(Calendar.DAY_OF_MONTH, day);
        int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        int temp = (lastDay - day) + 1;
        if (temp < off) {
            cal.add(Calendar.DATE, temp);
            Map<Integer, Integer> map = calcDay(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH) + 1, cal.get(Calendar.DAY_OF_MONTH), off - temp);
            map.put(month, temp);
            return map;
        } else {
            Map<Integer, Integer> map = new HashMap<>();
            map.put(month, off);
            return map;
        }

    }

    public static boolean ignoreCaseEquals(String str1, String str2) {
        return str1 == null ? str2 == null : str1.equalsIgnoreCase(str2);
    }
}
