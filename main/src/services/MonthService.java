package services;

import models.Month;

import java.util.Arrays;

public class MonthService {

    public static void printHolidaysOfMonth(Month month) {
        if (month == null) {
            throw new IllegalArgumentException();
        }
        System.out.println("holidays in " + month.name() + " are " + Arrays.toString(month.getDaysOfPublicHolidays()));
        System.out.println();
    }

    public static void printNumberOfDaysInMonth(Month month) {
        if (month == null) {
            throw new IllegalArgumentException();
        }
        System.out.println(month.getNumberOfDays());
        System.out.println();
    }

    public static void printAllMonths(Month[] months) {
        if (months == null) {
            return;
        }
        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i]);
        }
        System.out.println();
    }

    public static boolean checkWhetherDayIsHoliday(int day, Month month) {
        if (month == null || day > 31 || day < 1) {
            return false;
        }
        for (int i = 0; i < month.getNumberOfHolidaysInMonth(); i++) {
            if (month.getDaysOfPublicHolidays()[i] == day) {
                return true;
            }
        }
        return false;
    }

    public static void printNumberOfHolidaysInMonth(Month month) {
        if (month == null) {
            throw new IllegalArgumentException();
        }
        System.out.println(month.getNumberOfHolidaysInMonth());
        System.out.println();
    }
}
