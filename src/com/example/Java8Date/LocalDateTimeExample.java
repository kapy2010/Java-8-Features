package com.example.Java8Date;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        LocalDateTime current = LocalDateTime.now();
        System.out.println("Current = " + current);

        LocalDateTime custom = LocalDateTime.of(2017, Month.JANUARY, 1, 12, 30, 30);
        System.out.println("Custom = " + custom);

        LocalDateTime kolkataTime = LocalDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("IST time = " + kolkataTime);
    }
}
