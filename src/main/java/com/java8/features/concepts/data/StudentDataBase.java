package com.java8.features.concepts.data;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class StudentDataBase {

    /**
     * Total of 6 students in the database.
     *
     * @return
     */
    public static Supplier<Student> studentSupplier = () ->
    {
        Bike bike=new Bike();
        bike.setName("Hero");
        bike.setModel("hinda");

        Student student= new Student("Adam", 2, 3.6,8, "male", Arrays.asList("swimming", "basketball", "volleyball"));
    student.setBike(Optional.ofNullable(bike));
    return student;

    };

    public static List<Student> getAllStudents() {

        /**
         * 2nd grade students
         */
        Student student1 = new Student("Adam", 2, 3.6,10, "male", Arrays.asList("swimming", "basketball", "volleyball"));
        Student student2 = new Student("Jenny", 2, 3.8,6, "female", Arrays.asList("swimming", "gymnastics", "soccer"));
        /**
         * 3rd grade students
         */
        Student student3 = new Student("Emily", 3, 4.0,12, "female", Arrays.asList("swimming", "gymnastics", "aerobics"));
        Student student4 = new Student("Dave", 3, 3.9,9, "male", Arrays.asList("swimming", "gymnastics", "soccer"));
        /**
         * 4th grade students
         */
        Student student5 = new Student("Sophia", 4, 3.5,7, "female", Arrays.asList("swimming", "dancing", "football"));
        Student student6 = new Student("James", 4, 3.9,11, "male", Arrays.asList("swimming", "basketball", "baseball", "football"));

        List<Student> students = Arrays.asList(student1, student2, student3, student4, student5, student6);
        return students;
    }
}
