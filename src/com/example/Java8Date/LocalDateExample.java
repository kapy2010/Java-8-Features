package com.example.Java8Date;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current Date = " + currentDate);

        LocalDate firstDate2017 = LocalDate.of(2017, Month.JANUARY, 1);
        System.out.println("First Date = " + firstDate2017);

        LocalDate kolkataDate = LocalDate.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("Current Date in IST = " + kolkataDate);
    }
}
