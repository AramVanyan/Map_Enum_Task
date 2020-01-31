package models;

import java.util.Objects;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private String phoneNumber;
    private String faculty;


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public Student(String firstName, String lastName, int age, String phoneNumber, String faculty) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", faculty='" + faculty + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(firstName, student.firstName) &&
                Objects.equals(lastName, student.lastName) &&
                Objects.equals(phoneNumber, student.phoneNumber) &&
                Objects.equals(faculty, student.faculty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, phoneNumber, faculty, age);
    }
}
