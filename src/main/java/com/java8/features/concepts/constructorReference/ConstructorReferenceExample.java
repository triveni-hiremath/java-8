package com.java8.features.concepts.constructorReference;


//Supplier<Student>s1=Student::new -->empty constructor in student class


import com.java8.features.concepts.data.Student;

import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReferenceExample {

    static Supplier<Student> studentSupplier = Student::new;

    static Function<String,Student>function=Student::new;

    public static void main(String[] args) {
        System.out.println(studentSupplier.get());
        System.out.println(function.apply("ConstructorReference"));
    }
}
