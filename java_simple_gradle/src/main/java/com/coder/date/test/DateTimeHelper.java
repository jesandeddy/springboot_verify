package com.coder.date.test;

import java.time.LocalTime;

/**
 * @author: chao.an
 * @since: 2024-10-09 16:53
 */
public class DateTimeHelper {

    public static void getCurrentTime() {
        LocalTime nowTime = LocalTime.now();
        System.out.println("当前时间：" + nowTime);
        //如果不想显示毫秒
        LocalTime nowTime2 = LocalTime.now().withNano(0); //14:43:14
        System.out.println("当前时间：" + nowTime2);
    }

    public static void showTime() {
        //指定时间
        LocalTime time = LocalTime.of(14, 10, 21); //14:10:21
        LocalTime time2 = LocalTime.parse("12:00:01"); // 12:00:01
        System.out.println("指定时间：" + time);
        System.out.println("指定时间：" + time2);
    }
}
