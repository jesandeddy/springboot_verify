package com.coder.date.test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * @author: chao.an
 * @since: 2024-10-09 16:57
 */
public class ZoneDateHelper {

    public static void defaultZone() {
        ZoneId defaultZone = ZoneId.systemDefault();
        System.out.println("默认时区" + defaultZone);
    }

    public static void compareAmericaZoneTime() {
        //查看美国纽约当前的时间
        ZoneId america = ZoneId.of("America/New_York");
        LocalDateTime shanghaiTime = LocalDateTime.now();
        LocalDateTime americaDateTime = LocalDateTime.now(america);
        System.out.println("当天中国时间：" + shanghaiTime);
        System.out.println("美国纽约时间：" + americaDateTime);
    }

    public static void withZoneTime() {
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("带有时区信息的时间：" + zonedDateTime);
    }
}
