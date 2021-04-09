package com.java8.features.concepts.streams;


import com.java8.features.concepts.data.Student;
import com.java8.features.concepts.data.StudentDataBase;

import java.util.function.Predicate;

//takes predicate as i/p and boolean as o/p
//allmatch,anymatch,nonematch
public class StreamsAnyMatchAllMatchNoneMatch {


    public static boolean allMatch()
    {

        return StudentDataBase.getAllStudents().stream().allMatch(student -> student.getGpa()>=3.5);
    }
    public static boolean anyMatch()
    {

        return StudentDataBase.getAllStudents().stream().anyMatch(student -> student.getGpa()>=4.0);
    }
    public static boolean noneMatch()
    {

        return StudentDataBase.getAllStudents().stream().noneMatch(student -> student.getGpa()>=4.1);
    }

    public static void main(String[] args) {
        System.out.println("::"+allMatch());
        System.out.println("<><>"+anyMatch());
        System.out.println("<>****<>"+noneMatch());
    }
}
