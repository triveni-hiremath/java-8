package com.java8.features.concepts.lambda;

import com.java8.features.concepts.data.Student;
import com.java8.features.concepts.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

//accept & andThen


public class ConsumerExample {
    static  Consumer<Student> c2=(s)->System.out.print(s.getName());
    static Consumer<Student> c3=(s)->System.out.println(s.getActivities());
    static Consumer<Student> c1=(s)->System.out.println(s);


    public static void main(String[] args) {
        Consumer<String> st=(s)->System.out.println(s.toUpperCase());
        st.accept("hello world");
        printvalues();
        printNameActivity();
        printNameActivityWithConditio();

    }

    public static void printvalues()
    {
        Consumer<Student> str=(Student)->System.out.println(Student);
        List<Student> studentList= StudentDataBase.getAllStudents();
        studentList.forEach(str);
    }
    public static void printNameActivity()
    {
        System.out.println("namewithactivity::::");
        List<Student> studentList= StudentDataBase.getAllStudents();
        studentList.forEach(c2.andThen(c3));
    }
    public static void printNameActivityWithConditio()
    {
        System.out.println("namewithconditions::::");
        Consumer<Student> str=(Student)->System.out.println(Student);
        List<Student> studentList= StudentDataBase.getAllStudents();
        studentList.forEach((student)->{
            if(student.getGradeLevel()>=3)
            {
                c2.andThen(c3).accept(student);
            }
        });
    }
}
