package com.java8.features.concepts.streams;


import com.java8.features.concepts.data.Student;
import com.java8.features.concepts.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//collect,reduce terminal opernation,used to reduce contents of stream to single value
//first initial val,2nd param BinaryOperator<T>
public class StreamsReduceExample {


    public static int performMult(List<Integer> intList) {
        //a=1,b=1
        //a=result,b=3
        return intList.stream().reduce(1, (a, b) -> a * b);
    }
    public static Optional<Integer> performwithoutInitial(List<Integer> intList) {
        //a=1,b=1
        //a=result,b=3
        return intList.stream().reduce((a, b) -> a * b);
    }

    public static Optional<Student>getAllStudentsWithHighestGPA()
    {
        return StudentDataBase.getAllStudents().stream().reduce((s1,s2)->
            (s1.getGpa()>s2.getGpa())?s1:s2);
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 3, 5, 7);
        List<Integer> integers1 = Arrays.asList();
        System.out.println(performMult(integers));
        Optional<Integer>optInt=performwithoutInitial(integers1);
        System.out.println(optInt.isPresent());
        Optional<Student>studentOptional=getAllStudentsWithHighestGPA();
        if(getAllStudentsWithHighestGPA().isPresent())
        {
System.out.println(studentOptional.get());
        }
    }
}
