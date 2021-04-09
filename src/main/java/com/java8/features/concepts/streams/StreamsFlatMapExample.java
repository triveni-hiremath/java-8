package com.java8.features.concepts.streams;

import com.java8.features.concepts.data.Student;
import com.java8.features.concepts.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;


//distinct returns a stream with unique ele,count returns total no of ele in stream as long,sorted sorts the ele in stream.
public class StreamsFlatMapExample {

    public static List<String> printStudentActivities() {
        List<String> lst = StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities).
                flatMap(List::stream).collect(toList());
        return lst;

    }
    public static List<String> printStudentActivitiesWithditinctAndsorted() {
        List<String> lst = StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities).
                        flatMap(List::stream).distinct().sorted().collect(toList());
        return lst;

    }
    public static long printStudentActivitiesCount() {
       long lst = StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities).
                        flatMap(List::stream).distinct().count();
        return lst;

    }
    public static void main(String[] args) {
        System.out.println(printStudentActivities());
        System.out.println(printStudentActivitiesWithditinctAndsorted());
        System.out.println(printStudentActivitiesCount());
    }
}
