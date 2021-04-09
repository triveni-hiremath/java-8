package com.java8.features.concepts.optional;

import com.java8.features.concepts.data.Student;
import com.java8.features.concepts.data.StudentDataBase;

import java.util.Optional;

public class OptionalExample {
    public static String getStudentName()
    {
        Student stu=StudentDataBase.studentSupplier.get();
        if(stu!=null)
        {
            return stu.getName();
        }
        return null;
    }
    public static Optional<String> getStudentOptional()
    {
        //Optional<Student> stu=Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> stu=Optional.ofNullable(null);
        if(stu.isPresent())
        {
            return  stu.map(Student::getName);
        }
        return Optional.empty();

    }

    public static void main(String[] args) {
        String name=getStudentName();
        //System.out.println(name.length());
        Optional<String> str=getStudentOptional();
        if(str.isPresent())
        {
            System.out.println(str.get().length());
        }

    }
}
