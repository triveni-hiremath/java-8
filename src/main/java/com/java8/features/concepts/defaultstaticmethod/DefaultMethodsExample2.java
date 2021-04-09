package com.java8.features.concepts.defaultstaticmethod;

import com.java8.features.concepts.data.Student;
import com.java8.features.concepts.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
//with null
public class DefaultMethodsExample2 {
    static Consumer<Student>studentConsumer=(student -> System.out.println(student));
    static Comparator<Student>gpaComparator=Comparator.comparingDouble(Student::getGpa);
    static Comparator<Student>nameComparator=Comparator.comparing(Student::getName);
    static Comparator<Student>gradeComparator=Comparator.comparing(Student::getGradeLevel);
    public static void sortByName(List<Student> studentList)
    {
        System.out.println("after");
        studentList.sort(nameComparator);
        studentList.forEach(studentConsumer);
        System.out.println();
    }
    public static void sortByGpa(List<Student> studentList)
    {
        System.out.println("after");
        studentList.sort(gpaComparator);
        studentList.forEach(studentConsumer);
        System.out.println();
    }
    public static void comparatorChain(List<Student> studentList)
    {
        System.out.println("after");
         studentList.sort(gradeComparator.thenComparing(nameComparator));
         studentList.forEach(studentConsumer);
    }
    public static void sortWithNullVal(List<Student> studentList)
    {
        Comparator<Student>studentComparator=Comparator.nullsFirst(nameComparator);
        studentList.sort(studentComparator);
        studentList.forEach(studentConsumer);
    }
    public static void main(String[] args) {
        System.out.println("before");
        List<Student> studentList=StudentDataBase.getAllStudents();
        studentList.forEach(studentConsumer);

        sortByName(studentList);
        //System.out.println("GPA");
        sortByGpa(studentList);
       // System.out.println("comparing");
        //comparatorChain(studentList);
        sortWithNullVal(studentList);
    }
}
