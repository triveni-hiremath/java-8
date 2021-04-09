package com.java8.features.concepts.methodReference;

import com.java8.features.concepts.data.Student;
import com.java8.features.concepts.data.StudentDataBase;

import java.util.function.Predicate;

public class RefractorMethodRefExample {

    public static Predicate<Student> s1 =RefractorMethodRefExample::greaterThenGrade;


    public static boolean greaterThenGrade(Student s) {
        return s.getGradeLevel() >= 2;
    }

    public static void main(String[] args) {

        System.out.println(s1.test(StudentDataBase.studentSupplier.get()));
    }
}
