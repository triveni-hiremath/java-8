package com.java8.features.concepts.streams;

import com.java8.features.concepts.data.Student;
import com.java8.features.concepts.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

//filter is intermediate oper,collect is terminal operation
public class StreamsExample {
    public static void main(String[] args) {
        Predicate<Student> p1 = (student) -> student.getGradeLevel() >= 3;
        Predicate<Student> p2 = (student) -> student.getGpa() >= 3.9;
        Map<String, List<String>> sMap = new HashMap<>();
        sMap = StudentDataBase.getAllStudents().stream().peek((student -> {
            System.out.println(student);
        }))
                .filter(p1).peek((student -> {
                    System.out.println(student);
                })).filter(p2).peek((student -> {
                    System.out.println(student);
                })).
                        collect(Collectors.toMap(Student::getName, Student::getActivities));
        System.out.println(sMap);

    }
}
