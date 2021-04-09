package com.java8.features.concepts.lambda;

import com.java8.features.concepts.data.Student;
import com.java8.features.concepts.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;


//accept & andThen
public class BiConsumerExample {

    public static void nameAndActivities()
    {
        BiConsumer<String, List<String>> nameActivity=(name,activities)->
                System.out.println(name+":::"+activities);

        List<Student> alist= StudentDataBase.getAllStudents();
        alist.forEach((student)->nameActivity.accept(student.getName(),student.getActivities()));
    }

    public static void main(String[] args) {
        BiConsumer<String, String> biconsumer = (a, b) -> System.out.println("a:" + a + "," + "b:" + b);
        biconsumer.accept("hello", "biconsumer");

        //multiplication
        BiConsumer<Integer,Integer> m1=(a,b)-> System.out.println("a*b::"+(a*b));
        //division
        BiConsumer<Integer,Integer>m2=(a,b)->System.out.println("a/b::"+(a/b));

        m1.andThen(m2).accept(10,2);
        nameAndActivities();
    }
}
