package com.java8.features.concepts.parallelStreams;

import com.java8.features.concepts.data.Student;
import com.java8.features.concepts.data.StudentDataBase;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class ParallelStreamExample1 {
    public static List<String> printStudentActivitiesSeq() {
        long startTime = System.currentTimeMillis();
        List<String> lst = StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities).
                        flatMap(List::stream).distinct().sorted().collect(toList());
        long endTime = System.currentTimeMillis();
        System.out.println("sequential::" + (endTime - startTime));
        return lst;

    }

    public static List<String> printStudentActivitiesParallel() {
        long startTime = System.currentTimeMillis();
        List<String> lst = StudentDataBase.getAllStudents().stream().parallel()
                .map(Student::getActivities).
                        flatMap(List::stream).distinct().sorted().collect(toList());
        long endTime = System.currentTimeMillis();
        System.out.println("parallel::" + (endTime - startTime));
        return lst;

    }

    public static void main(String[] args) {
        printStudentActivitiesSeq();
        printStudentActivitiesParallel();
    }
}
