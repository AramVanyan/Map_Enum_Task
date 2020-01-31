package models;

import java.util.Arrays;

public enum Months {
    January(31,5,new int[] {2,3,10,15,31}),
    February(28,6,new int[] {21,2,12,15,30,5}),
    March(31,7,new int[] {2,11,10,19,29,6,7}),
    April(30,8,new int[] {3,12,10,17,21,6,11,14}),
    May(31,1,new int[] {4}),
    June(30,2,new int[] {14,22}),
    July(31,4,new int[] {6,15,18,15}),
    August(31,7,new int[] {7,16,16,28,24,30,2}),
    September(30,4,new int[] {8,17,10,15}),
    October(31,8,new int[] {9,3,20,15,20,22,25,27}),
    November(30,10,new int[] {10,3,22,15,20,21,11,5,2,1}),
    December(31,2,new int[] {10,15});


    private int numberOfDays;
    private int numberOfHolidaysInMonth;
    private int[] daysOfPublicHolidays;

    Months(int numberOfDays, int numberOfHolidaysInMonth, int[] daysOfPublicHolidays) {
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
