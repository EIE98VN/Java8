package com.huy.topica.Java8Demo.DateTime;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;

public class LocalDateDemo {
    public static void main(String[] args) {
     // Current Date
        LocalDate today = LocalDate.now();
        System.out.println("Current Date = " + today);
 
        LocalDate specificDate = LocalDate.of(2019, Month.MAY, 29);
        System.out.println("Specific Date = " + specificDate);

        LocalDate todayHCM = LocalDate.now(ZoneId.of("Asia/Ho_Chi_Minh"));
        System.out.println("Current Date in IST = " + todayHCM);
 
        LocalDate dateFromBase = LocalDate.ofEpochDay(365);
        System.out.println("365th day from base date = " + dateFromBase);
 
        LocalDate hundredDay2014 = LocalDate.ofYearDay(2014, 100);
        System.out.println("100th day of 2014 = " + hundredDay2014);
    }
}
