package com.java8.features.concepts.streams_terminal;

import com.java8.features.concepts.data.StudentDataBase;

import static java.util.stream.Collectors.counting;

public class StreamsCountingExample {
    public static long count_one()
    {
        return StudentDataBase.getAllStudents().stream().filter(student -> student.getGpa()>3.9).collect(counting());
    }

    public static void main(String[] args) {
        System.out.println(count_one());
    }
}
