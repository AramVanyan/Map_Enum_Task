package test;

import models.Month;
import models.Student;
import services.MonthService;
import services.StudentsService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> arrayListOfStudents = new ArrayList<>() {
            {
                add(new Student("Diana","Asatryan",22,"0988111111","Math"));
                add(new Student("Diana","Asatryan",32,"0922111111","Physics"));
                add(new Student("Diana","Asatryan",21,"0938111111","Philosophy"));
                add(new Student("Karen","Balayan",12,"097777777","Math"));
                add(new Student("Karen","Balayan",23,"098888811","Philosophy"));
                add(new Student("Elen","Mirzoyan",12,"093333333","English"));
                add(new Student("Ivan","Vanyan",13,"093333333","English"));
                add(new Student("Ivan","Vanyan",16,"093333333","English"));
                add(new Student("Ivan","Vanyan",16,"093333333","English"));
                add(new Student("Zara","Avagyan",16,"093333333","English"));
            }

        };
        Map<Student, Integer> studentsMap = StudentsService.getStudentsMap(arrayListOfStudents);
        for (Map.Entry mapElement : studentsMap.entrySet()) {
            System.out.println(mapElement.getKey() + " " + mapElement.getValue());
        }
        System.out.println();
        Map<String, Integer> studentNumberInFaculty = StudentsService.getStudentNumberInFaculty(arrayListOfStudents);
        StudentsService.showStudentNumberInFaculty(studentNumberInFaculty);
        System.out.println();

        //test of MonthsService
        MonthService.printAllMonths(Month.values());
        MonthService.printHolidaysOfMonth(Month.APRIL);
        MonthService.printNumberOfDaysInMonth(Month.MARCH);
        MonthService.printNumberOfHolidaysInMonth(Month.JANUARY);
        System.out.println(MonthService.checkWhetherDayIsHoliday(1, Month.APRIL));

    }
}
