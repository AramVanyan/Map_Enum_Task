package test;

import models.Months;
import models.Student;
import services.MonthsService;
import services.StudentsService;
import java.util.ArrayList;
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
            }

        };

        //test of StudentsService
        Map<String, Integer> studentsMap = StudentsService.getStudentsMap(arrayListOfStudents);
        for (Map.Entry mapElement : studentsMap.entrySet()) {
            System.out.println(mapElement.getKey() + " " + mapElement.getValue());
        }
        System.out.println();
        StudentsService.getNumberOfStudentsInEachFaculty(arrayListOfStudents);
        System.out.println();

        //test of MonthsService
        MonthsService.printAllMonths(Months.values());
        MonthsService.printHolidaysOfMonth(Months.April);
        MonthsService.printNumberOfDaysInMonth(Months.March);
        System.out.println(MonthsService.checkWhetherDayIsHoliday(3, Months.January));
    }
}
