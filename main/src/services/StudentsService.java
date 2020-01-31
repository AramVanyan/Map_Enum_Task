package services;

import models.Student;

import java.util.*;

public class StudentsService {
    static Comparator<Map.Entry<Student, Integer>> valueComparator = (student1, student2) -> student2.getValue() - student1.getValue();
    public static Map<Student,Integer> getStudentsMap(List<Student> listOfStudents) {
        Map<Student,Integer> studentsMap = new HashMap<>();

        for (int i = 0; i < listOfStudents.size(); i++) {
            Student student = listOfStudents.get(i);
            if (studentsMap.containsKey(student)) {
                int oldValue = studentsMap.get(student);
                studentsMap.replace(student,++oldValue);
            }
            else {
                studentsMap.put(student,1);
            }
        }

        Set<Map.Entry<Student, Integer>> entries = studentsMap.entrySet();
        ArrayList<Map.Entry<Student, Integer>> listOfEntries = new ArrayList<>(entries);
        Collections.sort(listOfEntries,valueComparator);
        LinkedHashMap<Student,Integer> linkedMapOfEntries = new LinkedHashMap<Student,Integer>(listOfEntries.size());

        for (int i = 0; i < listOfEntries.size(); i++) {
            linkedMapOfEntries.put(listOfEntries.get(i).getKey(),listOfEntries.get(i).getValue());
        }
        return linkedMapOfEntries;
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

