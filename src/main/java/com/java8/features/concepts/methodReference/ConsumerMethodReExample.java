package com.java8.features.concepts.methodReference;

import com.java8.features.concepts.data.Student;
import com.java8.features.concepts.data.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerMethodReExample {

    //static Consumer<Student> c1=(s)->System.out.println(s);
    static Consumer<Student> c1= System.out::println;
    static  Consumer<Student> c2= Student::printlistactivities;
    public static void main(String[] args) {
        StudentDataBase.getAllStudents().forEach(c1);
        StudentDataBase.getAllStudents().forEach(c2);
    }
}
