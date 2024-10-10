package com.coder.date.test;

/**
 * @author: chao.an
 * @since: 2024-10-09 16:37
 */
public class DateTest {

    /**
     * Instant：时间戳
     * Duration：持续时间，时间差
     * LocalDate：只包含日期，比如：2016-10-20
     * LocalTime：只包含时间，比如：23:12:10
     * LocalDateTime：包含日期和时间，比如：2016-10-20 23:14:21
     * Period：时间段
     * ZoneOffset：时区偏移量，比如：+8:00
     * ZonedDateTime：带时区的时间
     * Clock：时钟，比如获取目前美国纽约的时间
     */
    private static final String TIME_DESCRIPTION = "up";

    public static void main(String[] args) {
        /*LocalDateHelper.showLocalDate();
        LocalDateHelper.specialDayTest();
        LocalDateHelper.verifyDate();*/
        /*DateTimeHelper.getCurrentTime();
        DateTimeHelper.showTime();*/
        /*ZoneDateHelper.defaultZone();
        ZoneDateHelper.compareAmericaZoneTime();
        ZoneDateHelper.withZoneTime();*/
        LocalDateHelper.comparePeriod();
    }
}
