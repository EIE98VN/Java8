package com.huy.topica.Java8Demo.DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZoneOffset;

public class LocalDateTimeDemo {
    public static void main(String[] args) {

        LocalDateTime today = LocalDateTime.now();
        System.out.println("Current DateTime = " + today);

        today = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println("Current DateTime = " + today);

        LocalDateTime specificDate = LocalDateTime.of(2011, Month.MARCH, 12, 18, 2, 58);
        System.out.println("Specific Date = " + specificDate);

        LocalDateTime todayHCM = LocalDateTime.now(ZoneId.of("Asia/Ho_Chi_Minh"));
        System.out.println("Current Date in IST = " + todayHCM);

        LocalDateTime dateFromBase = LocalDateTime.ofEpochSecond(10000, 0, ZoneOffset.UTC);
        System.out.println("10000th second time from 01/01/1970 = " + dateFromBase);
    }
}
