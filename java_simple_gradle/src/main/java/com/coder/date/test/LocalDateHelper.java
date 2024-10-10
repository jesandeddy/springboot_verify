package com.coder.date.test;

import java.time.LocalDate;
import java.time.MonthDay;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

/**
 * @author: chao.an
 * @since: 2024-10-09 16:38
 */
public class LocalDateHelper {

    public static void showLocalDate() {
        LocalDate todayDate = LocalDate.now();
        System.out.println("今天的日期：" + todayDate);
    }

    public static void verifyDate() {
        LocalDate birthday = LocalDate.of(1990, 10, 12);
        System.out.println("生日日期:" + birthday);
        MonthDay birthdayMd = MonthDay.of(birthday.getMonth(), birthday.getDayOfMonth());
        System.out.println("生日月" + birthdayMd);
        MonthDay today = MonthDay.from(LocalDate.of(2016, 10, 12));
        System.out.println(today.equals(birthdayMd));
    }

    public static void specialDayTest() {
        LocalDate today = LocalDate.now();
        LocalDate firstDay = today.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println("当前月的第一天：" + firstDay);
        //取today的第1天，另外一种写法
        LocalDate firstDay2 = today.withDayOfMonth(1);
        System.out.println("当前月的第一天：" + firstDay2);

        LocalDate lastDay = today.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("当前月的最后一天：" + lastDay);

        LocalDate tomorrow = today.plusDays(1);
        System.out.println("下一天：" + tomorrow);

        //判断是否为闰年
        boolean isLeapYear = tomorrow.isLeapYear();
        System.out.println(isLeapYear);
    }

    public static void comparePeriod() {
        LocalDate today = LocalDate.now();
        LocalDate specifyDate = LocalDate.of(2024, 10, 8);
        Period period = Period.between(specifyDate,today);
        System.out.println(period.getDays());
        System.out.println(period.getMonths());

        System.out.println(specifyDate.until(today, ChronoUnit.DAYS)); //40
    }
}
