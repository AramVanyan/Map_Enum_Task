package services;

import models.Student;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentsService {
    public static Map<String,Integer> getStudentsMap(List<Student> listOfStudents) {
        Map<String,Integer> studentsMap = new HashMap<>();

        for (int i = 0; i < listOfStudents.size(); i++) {
            String key = listOfStudents.get(i).getFirstName() + " " + listOfStudents.get(i).getLastName();
            if (studentsMap.containsKey(key)) {
                int oldValue = studentsMap.get(key);
                studentsMap.replace(key,++oldValue);
            }
            else {
                studentsMap.put(key,1);
            }
        }
        return studentsMap;
    }
    public static void getNumberOfStudentsInEachFaculty(List<Student> listOfStudents) {
        Map<String,Integer> faculties = new HashMap<>();

        for (int i = 0; i < listOfStudents.size(); i++) {
            String key = listOfStudents.get(i).getFaculty();
            if (faculties.containsKey(key)) {
                int oldValue = faculties.get(key);
                faculties.replace(key,++oldValue);
            }
            else {
                faculties.put(key,1);
            }
        }

        for (Map.Entry<String,Integer> pair:faculties.entrySet()) {
            System.out.println("number of students in faculty " + pair.getKey() + " is " + pair.getValue());
        }
    }

}

