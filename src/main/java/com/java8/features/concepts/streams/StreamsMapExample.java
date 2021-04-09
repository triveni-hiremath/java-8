package com.java8.features.concepts.streams;

import com.java8.features.concepts.data.Student;
import com.java8.features.concepts.data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//to transform from one type to other
public class StreamsMapExample {

    public static List<String> nameList() {
        List<String> stList = StudentDataBase.getAllStudents().stream().
                map(Student::getName).map(String::toUpperCase)
                .collect(Collectors.toList());
        return stList;
    }


    public static Set<String> nameSet() {
        Set<String> nameSet = StudentDataBase.getAllStudents().stream().map(Student::getName).map(String::toLowerCase)
                .collect(Collectors.toSet());
        return nameSet;
    }

    public static void main(String[] args) {
        System.out.println(nameList());
        System.out.println(nameSet());
    }
}
