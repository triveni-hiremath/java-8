package com.java8.features.concepts.streams;

import com.java8.features.concepts.data.Student;
import com.java8.features.concepts.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterExample {
    public static List<Student> filterStudents() {
        return StudentDataBase.getAllStudents().stream().filter((student ->
                student.getGender().equals("female")
        )).filter(student -> student.getGradeLevel()>=3.9).collect(Collectors.toList());

    }

    public static void main(String[] args) {
    filterStudents().forEach(System.out::println);
    }
}
