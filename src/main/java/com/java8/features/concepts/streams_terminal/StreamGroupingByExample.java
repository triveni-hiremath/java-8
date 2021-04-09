package com.java8.features.concepts.streams_terminal;

import com.java8.features.concepts.data.Student;
import com.java8.features.concepts.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static java.util.stream.Collectors.*;

public class StreamGroupingByExample {
    public static void groupStudentByGender() {
        Map<String, List<Student>> stuMap = StudentDataBase.getAllStudents().stream().collect(groupingBy(Student::getGender));
        System.out.println(stuMap);
    }

    public static void groupStudentByGpa() {
        Map<String, List<Student>> stuMap = StudentDataBase.getAllStudents().stream().collect(groupingBy(student -> student.getGpa() >= 3.8 ? "OutStanding" : "Avg"));
        System.out.println(stuMap);
    }

    public static void twoLevelGrouping() {
    Map<Integer,Map<String,List<Student>>>stu=StudentDataBase.getAllStudents().stream().collect(groupingBy(Student::getGradeLevel,groupingBy(student -> student.getGpa()>=3.8?"Outstanding":"avg")));
        System.out.println(":::::"+stu);
    }
    public static void twoLevelGrouping2() {
        Map<Integer,Integer>stu=StudentDataBase.getAllStudents().stream().
                collect(groupingBy(Student::getGradeLevel,summingInt(Student::getNoteBook)));
        System.out.println("::"+stu);
    }
    public static void groupBymaxBy() {
        Map<Integer, Optional<Student>> stuMap = StudentDataBase.getAllStudents().
                stream().collect(groupingBy(Student::getGradeLevel,maxBy(Comparator.comparing(Student::getGpa))));
        System.out.println(stuMap);
    }
    public static void collectingAndThenBy() {
        Map<Integer, Student> stuMap = StudentDataBase.getAllStudents().
                stream().collect(groupingBy(Student::getGradeLevel,collectingAndThen(maxBy(Comparator.comparing(Student::getGpa)),Optional::get)));
        System.out.println(stuMap);
    }
    public static void main(String[] args) {
        groupStudentByGender();
        groupStudentByGpa();
        twoLevelGrouping();
        twoLevelGrouping2();
        groupBymaxBy();
        collectingAndThenBy();

    }
}
