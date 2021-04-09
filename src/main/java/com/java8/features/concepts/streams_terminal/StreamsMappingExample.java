package com.java8.features.concepts.streams_terminal;

import com.java8.features.concepts.data.Student;
import com.java8.features.concepts.data.StudentDataBase;

import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.*;

public class StreamsMappingExample {


    public static void main(String[] args) {
        List<String>str=StudentDataBase.getAllStudents().stream().collect(mapping(Student::getName,toList()));
        Set<String>strSet=StudentDataBase.getAllStudents().stream().collect(mapping(Student::getName,toSet()));
        System.out.println(str);
        System.out.println(strSet);
    }
}
