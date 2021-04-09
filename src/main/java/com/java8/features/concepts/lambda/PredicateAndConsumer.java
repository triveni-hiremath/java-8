package com.java8.features.concepts.lambda;

import com.java8.features.concepts.data.Student;
import com.java8.features.concepts.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumer {

    static Predicate<Student> p1 = (p) -> p.getGradeLevel() >= 3;
    static Predicate<Student> p2 = (pt) -> pt.getGpa() >= 3.9;
    static BiConsumer<String, List<String>> bc = (name, activity) -> System.out.println("name:" + name + "activity:" + activity);

    static Consumer<Student> c1 = (student ->
    {
        if (p1.and(p2).test(student)) {

            bc.accept(student.getName(), student.getActivities());
        }
    });


    public static void printNameAndActivities(List<Student> std) {
        std.forEach(c1);
    }

    public static void main(String[] args) {

        List<Student> alist = StudentDataBase.getAllStudents();
        printNameAndActivities(alist);

    }
}
