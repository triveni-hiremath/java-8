package com.java8.features.concepts.streams_terminal;

import com.java8.features.concepts.data.Student;
import com.java8.features.concepts.data.StudentDataBase;

import java.util.stream.Collectors;

import static java.util.stream.Collectors.joining;

public class StreamsJoiningExample {
    public static String joining_one()
    {
       return  StudentDataBase.getAllStudents().stream().map(Student::getName).collect(joining());
    }
    public static String joining_two()
    {
        return  StudentDataBase.getAllStudents().stream().map(Student::getName).collect(joining("-"));
    }
    public static String joining_three()
    {
        return  StudentDataBase.getAllStudents().stream().map(Student::getName).collect(joining("-","(",")"));
    }
    public static void main(String[] args) {
        System.out.println(joining_one());
        System.out.println(joining_two());
        System.out.println(joining_three());
    }
}
