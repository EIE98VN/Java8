package com.huy.topica.Java8Demo.DateTime;

import java.time.LocalTime;
import java.time.ZoneId;

public class LocalTimeDemo {
    public static void main(String[] args) {

        LocalTime time = LocalTime.now();
        System.out.println("Current Time=" + time);
 
        LocalTime specificTime = LocalTime.of(12, 20, 25, 40);
        System.out.println("Specific Time of Day = " + specificTime);
 
        LocalTime timeHCM = LocalTime.now(ZoneId.of("Asia/Ho_Chi_Minh"));
        System.out.println("Current Time in IST = " + timeHCM);
 
        LocalTime specificSecondTime = LocalTime.ofSecondOfDay(10000);
        System.out.println("10000th second time = " + specificSecondTime);
    }
}
