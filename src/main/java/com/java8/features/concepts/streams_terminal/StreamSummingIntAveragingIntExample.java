package com.java8.features.concepts.streams_terminal;

import com.java8.features.concepts.data.Student;
import com.java8.features.concepts.data.StudentDataBase;

import static java.util.stream.Collectors.averagingInt;
import static java.util.stream.Collectors.summingInt;

public class StreamSummingIntAveragingIntExample {
    public static int sum()
    {
        return StudentDataBase.getAllStudents().stream().collect(summingInt(Student::getNoteBook));
    }
    public static double avg()
    {
        return StudentDataBase.getAllStudents().stream().collect(averagingInt(Student::getNoteBook));
    }
    public static void main(String[] args) {
        System.out.println(sum());
        System.out.println(avg());
    }
}
