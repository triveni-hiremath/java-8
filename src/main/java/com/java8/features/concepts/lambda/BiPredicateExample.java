package com.java8.features.concepts.lambda;

import com.java8.features.concepts.data.Student;
import com.java8.features.concepts.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class BiPredicateExample {

    static Predicate<Student> p1 = (p) -> p.getGradeLevel() >= 3;
    static Predicate<Student> p2 = (pt) -> pt.getGpa() >= 3.9;

    static BiPredicate<Integer, Double> bp = (gradelevel, gpa) -> gradelevel >= 3 && gpa >= 3.9;

    static BiConsumer<String, List<String>> bc = (name, activities) -> System.out.println("name::" + name + "::" + "activity::" + activities);

    static Consumer<Student> c = (student ->
    {
        if (bp.test(student.getGradeLevel(), student.getGpa())) {
            bc.accept(student.getName(), student.getActivities());
        }
    });

    public static void printNameAndActivity(List<Student> alist) {
        alist.forEach(c);
    }


    public static void main(String[] args) {
        List<Student> alist = StudentDataBase.getAllStudents();
        printNameAndActivity(alist);
    }
}
