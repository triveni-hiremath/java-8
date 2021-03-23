package com.java8.features.concepts.lambda;


import com.java8.features.concepts.data.Student;
import com.java8.features.concepts.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

//test,and,negate,or,isEqual
public class PredicateExample {
    static Predicate<Integer> p = (s) -> s % 2 == 0;
    static Predicate<Integer> p1 = (s) -> s % 5 == 0;
    public static Predicate<Student> s1 = (s) -> s.getGradeLevel() >= 3;
    public static Predicate<Student> s2 = (s) -> s.getGpa() >= 3.9;

    public static void main(String[] args) {


        System.out.println(p.test(10));
        predicateAnd();
        predicateOr();
        predicateNegate();
        filterStudentsByGrade();
        filterStudentsByGPA();
        filterStudents();

    }

    public static void predicateAnd() {
        System.out.println("Predicate result::" + p.and(p1).test(10));
        System.out.println("predicate result ::" + p.and(p1).test(9));
    }

    public static void predicateOr() {
        System.out.println("Predicate Or result::" + p.or(p1).test(4));
        System.out.println("Predicate Or result::" + p.or(p1).test(9));
    }

    public static void predicateNegate() {
        System.out.println("Predicate negate result::" + p.or(p1).negate().test(4));
        System.out.println("Predicate negate result::" + p.or(p1).negate().test(9));
    }
    ////////////////predicate student ////////////

    public static void filterStudentsByGrade() {
        System.out.println("filterStudentsByGrade:::");
        List<Student> alist = StudentDataBase.getAllStudents();
        alist.forEach((student) -> {
            if (s1.test(student)) {
                System.out.println(student);
            }
        });
    }
    public static void filterStudentsByGPA()
    {
        System.out.println("filterStudentsByGPA:::");
        List<Student> glist=StudentDataBase.getAllStudents();
        glist.forEach((g)->
        {
            if(s2.test(g))
            {
                System.out.println(g);
            }
        });
    }
    public  static void filterStudents()
    {
        System.out.println("filterStudents::");
        List<Student> rlist= StudentDataBase.getAllStudents();
        rlist.forEach((student)->
        {
            if(s1.or(s2).test(student))
            {
                System.out.println(student);
            }
            if(s1.and(s2).test(student))
            {
                System.out.println(student);
            }

        });
    }
}
