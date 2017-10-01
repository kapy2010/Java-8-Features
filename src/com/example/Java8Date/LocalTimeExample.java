package com.example.Java8Date;

import java.time.LocalTime;
import java.time.ZoneId;

public class LocalTimeExample {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        System.out.println("Current time = " + time);

        LocalTime customTime = LocalTime.of(12, 12, 12);
        System.out.println("Custom time = " + customTime);

        LocalTime kolkataTime = LocalTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("IST time = " + kolkataTime);

        LocalTime specificSecondTime = LocalTime.ofSecondOfDay(3600);
        System.out.println("3600 second time  = " + specificSecondTime);
    }
}
