package com.java8.features.concepts.streams;

import com.java8.features.concepts.data.Student;
import com.java8.features.concepts.data.StudentDataBase;

public class StreamMapFilterReduceExample {
    private static int numberOfnotes() {
        int no = StudentDataBase.getAllStudents().stream().filter(student -> student.getGradeLevel() >= 3).filter(student
                -> student.getGender().equals("female"))
                .map(Student::getNoteBook).
                //reduce(0, (a, b) -> a + b);
                        reduce(0, Integer::sum
                );
        return no;

    }

    public static void main(String[] args) {
        System.out.println(numberOfnotes());
    }
}
