package com.java8.features.concepts.streams_terminal;

import com.java8.features.concepts.data.Student;
import com.java8.features.concepts.data.StudentDataBase;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.minBy;

public class StreamMaxByAndMinByExample {
    public static Optional<Student> minByExample()
    {
       return  StudentDataBase.getAllStudents().stream().collect(minBy(Comparator.comparing(Student::getGpa)));
    }
    public static Optional<Student> maxByExample()
    {
        return  StudentDataBase.getAllStudents().stream().collect(maxBy(Comparator.comparing(Student::getGpa)));
    }
    public static void main(String[] args) {
        System.out.println(minByExample());
        System.out.println(maxByExample());
    }
}
