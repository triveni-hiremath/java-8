package com.java8.features.concepts.optional;

import com.java8.features.concepts.data.Student;
import com.java8.features.concepts.data.StudentDataBase;

import java.util.Optional;

public class OptionalorElseExample {
    //orElse,orelseget orelsethrow
    public static String optionalOrElse() {
        // Optional<Student>stu=Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> stu = Optional.ofNullable(null);
        String name = stu.map(Student::getName).orElse("Default");
        return name;
    }

    public static String orElseGet() {
        Optional<Student> stu = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        //Optional<Student>stu=Optional.ofNullable(null);
        String name = stu.map(Student::getName).orElseGet(() -> "Default");
        return name;
    }

    public static String orElseThrow() {
        //Optional<Student>stu=Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> stu = Optional.ofNullable(null);
        String name = stu.map(Student::getName).orElseThrow(() -> new RuntimeException("No Data"));
        return name;
    }

    public static void main(String[] args) {
        System.out.println(optionalOrElse());
        System.out.println(orElseGet());
        System.out.println(orElseThrow());
    }
}
