package com.java8.features.concepts.functionInterface;

import com.java8.features.concepts.lambda.PredicateExample;
import com.java8.features.concepts.data.Student;
import com.java8.features.concepts.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionIntStudentExample {
    static Function<List<Student>, Map<String, Double>> studentFunction = (student ->
    {
        Map<String, Double> studentGradeMap = new HashMap<>();

            student.forEach((student1 -> {
                if(PredicateExample.s1.test(student1))
                {
                studentGradeMap.put(student1.getName(), student1.getGpa());
        }

        }));
        return studentGradeMap;
    });

    public static void main(String[] args) {
        System.out.println(studentFunction.apply(StudentDataBase.getAllStudents()));
    }
}
