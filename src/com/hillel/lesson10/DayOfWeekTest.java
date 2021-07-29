package com.hillel.lesson10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class DayOfWeekTest {
    public static void main(String[] args) throws IOException {
        DayOfWeek day = DayOfWeek.FRIDAY;
        System.out.println(day);

        for (DayOfWeek dayOfWeek :
                DayOfWeek.values()) {
            System.out.println(dayOfWeek);
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input day ");
        String userInput = reader.readLine().toUpperCase().trim();

        DayOfWeek dayOfWeek = DayOfWeek.valueOf(userInput);
        System.out.println("ya day: " + dayOfWeek);
        printSchedule(dayOfWeek);

        System.out.println("Is work day?" + dayOfWeek.isWorkday());
        System.out.println("is a weekend?" + dayOfWeek.isWeekend() );
    }
    private static void printSchedule(DayOfWeek dayOfWeek){
        switch (dayOfWeek){
            case FRIDAY:
            case MONDAY:
            case TUESDAY:
                System.out.println("work");
                break;
            case SUNDAY:
            case SATURDAY:
            case THURSDAY:
            case WEDNESDAY:
                System.out.println("relax");
                break;
            default:
                System.out.println("No actions");
                break;
        }
    }
}
