package com.hillel.lesson10;

import java.util.EnumSet;
import java.util.Set;

public enum DayOfWeek {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public static Set<DayOfWeek> WORK_DAYS= EnumSet.of(MONDAY, THURSDAY, TUESDAY, FRIDAY, WEDNESDAY);
    public static Set<DayOfWeek> WEEKEND = EnumSet.of(SATURDAY, SUNDAY);
    public boolean isWorkday(){
        return WORK_DAYS.contains(this);
    }
    public boolean isWeekend(){
        return WEEKEND.contains(this);
    }
}
