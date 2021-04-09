package com.java8.features.concepts.streams;


import com.java8.features.concepts.data.Student;
import com.java8.features.concepts.data.StudentDataBase;

import java.util.Optional;

//returns optional
//findfirst returns first ele in stream
//firstany returns first ele encountered in stream
//as soon as it finds first student meeting criteria it returns that further dsnt proceed
//shortcircuit  functions are limit(),findFirst(),findAny(),anyMatch(),allMatch(),noneMatch()

    public class StreamsFindAnyFindFirstExample {

    public static Optional<Student> findAnyMatchStr() {
        return StudentDataBase.getAllStudents().stream().filter(student -> student.getGpa()>=3.9).findAny();
    }

    public static Optional<Student> findFirstMatchStr() {
        return StudentDataBase.getAllStudents().stream().filter(student -> student.getGpa()>=4.1).findFirst();
    }

    public static void main(String[] args) {
        Optional<Student>optFindAny=findAnyMatchStr();
        Optional<Student>optFindFirst=findFirstMatchStr();
        if(optFindAny.isPresent())
        {
            System.out.println(optFindAny.get());
        }
        else
        {
            System.out.println("not found");
        }
        if(optFindFirst.isPresent())
        {
            System.out.println(optFindFirst.get());
        }
        else
        {
            System.out.println("not found");
        }
    }
}
