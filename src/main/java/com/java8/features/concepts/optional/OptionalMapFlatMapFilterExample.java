package com.java8.features.concepts.optional;

import com.java8.features.concepts.data.Bike;
import com.java8.features.concepts.data.Student;
import com.java8.features.concepts.data.StudentDataBase;

import java.util.Optional;

public class OptionalMapFlatMapFilterExample {
    public static void optionalFilter() {
        Optional<Student> stu = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        stu.filter(student -> student.getGpa() >= 3.5).ifPresent(student -> System.out.println(student));
    }

    public static void optionalMap() {
        Optional<Student> stu = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        if (stu.isPresent()) {
            Optional<String> st = stu.filter(student -> student.getGpa() >= 3.5).map(Student::getName);
            System.out.println(st.get());
        }
    }

    public static void optionalFlatMap() {
        Optional<Student> stu = Optional.ofNullable(StudentDataBase.studentSupplier.get());
Optional<String>name=stu.filter(student -> student.getGpa()>=3.5).flatMap(Student::getBike).map(Bike::getName);
        System.out.println(name);
        name.ifPresent(s-> System.out.println(s));
    }

    public static void main(String[] args) {
        optionalFilter();
        optionalMap();
        optionalFlatMap();
    }
}
