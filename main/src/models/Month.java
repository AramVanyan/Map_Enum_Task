package models;

import java.util.Arrays;

public enum Month {
    JANUARY(31,5,2,3,10,15,31),
    FEBRUARY(28,6,21,2,12,15,30,5),
    MARCH(31,7,2,11,10,19,29,6,7),
    APRIL(30,8,1,12,10,17,21,6,11,14),
    MAY(31,1, 4),
    JUNE(30,2,14,22),
    JULY(31,4,6,15,18,15),
    AUGUST(31,7,7,16,16,28,24,30,2),
    SEPTEMBER(30,4,8,17,10,15),
    OCTOBER(31,8,9,3,20,15,20,22,25,27),
    NOVEMBER(30,10,10,3,22,15,20,21,11,5,2,1),
    DECEMBER(31,2,10,15);


    private int numberOfDays;
    private int numberOfHolidaysInMonth;
    private int[] daysOfPublicHolidays;

    Month(int numberOfDays, int numberOfHolidaysInMonth, int... daysOfPublicHolidays) {
        this.numberOfDays = numberOfDays;
        this.numberOfHolidaysInMonth = numberOfHolidaysInMonth;
        this.daysOfPublicHolidays = daysOfPublicHolidays;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public int getNumberOfHolidaysInMonth() {
        return numberOfHolidaysInMonth;
    }

    public int[] getDaysOfPublicHolidays() {
        return daysOfPublicHolidays;
    }

    @Override
    public String toString() {
        return this.name() + " -> " +
                "numberOfDays = " + numberOfDays +
                ", numberOfHolidaysInMonth = " + numberOfHolidaysInMonth +
                ", daysOfPublicHolidays = " + Arrays.toString(daysOfPublicHolidays);
    }

}
