package com.java8.features.concepts.streams;

import com.java8.features.concepts.data.Student;
import com.java8.features.concepts.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class StreamsComparatorExample {


    public static List<Student> sortStudentsByName() {
        return StudentDataBase.getAllStudents().stream().
                sorted(Comparator.comparing(Student::getName)).collect(Collectors.toList());
    }
    public static List<Student> sortStudentsByGPA() {
        return StudentDataBase.getAllStudents().stream().
                sorted(Comparator.comparing(Student::getGpa)/*.reversed()*/).collect(Collectors.toList());
    }

    public static void main(String[] args) {


        sortStudentsByName().forEach(System.out::println);
        System.out.println("Sort By GPA::");
        sortStudentsByGPA().forEach(System.out::println);

    }
}
