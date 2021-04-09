package com.java8.features.concepts.functionInterface;

import com.java8.features.concepts.data.Student;
import com.java8.features.concepts.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierFunctionalExample {
    public static void main(String[] args) {
        Supplier<Student> studentSupplier = () -> {
            return new Student("Adam", 2, 3.6,11, "male", Arrays.asList("swimming", "basketball", "volleyball"));
        };

        Supplier<List<Student>> studentSupplierList =()-> StudentDataBase.getAllStudents();
        System.out.println(studentSupplier.get());
        System.out.print(studentSupplierList.get());
    }
}