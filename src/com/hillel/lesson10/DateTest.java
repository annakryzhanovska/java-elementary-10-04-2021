package com.hillel.lesson10;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTest {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalDate date1 = LocalDate.of(2021, 9, 4);
        System.out.println(date1);

        LocalDate date2 = LocalDate.parse("2021-03-10");
        System.out.println(date2);

        LocalDate date3 = LocalDate.parse("2021/04/10", DateTimeFormatter.ofPattern("yyyy/MM/dd"));
    }
}
