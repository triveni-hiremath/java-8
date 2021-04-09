package com.java8.features.concepts.streams_terminal;

import com.java8.features.concepts.data.Student;
import com.java8.features.concepts.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

import static java.util.stream.Collectors.partitioningBy;
import static java.util.stream.Collectors.toSet;

public class StreamPartitionByExample {
    public static void partitionBy_1() {
        Predicate<Student> st = student -> student.getGpa() >= 3.8;
        Map<Boolean, List<Student>> par = StudentDataBase.getAllStudents().stream().collect(partitioningBy(st));
        System.out.println(par);
    }
    public static void partitionBy_2() {
        Predicate<Student> st = student -> student.getGpa() >= 3.8;
        Map<Boolean, Set<Student>> par = StudentDataBase.getAllStudents().stream().collect(partitioningBy(st,toSet()));
        System.out.println(par);
    }

    public static void main(String[] args) {
        partitionBy_1();
        partitionBy_2();
    }
}
