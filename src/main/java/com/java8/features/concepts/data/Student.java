package com.java8.features.concepts.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Student {
    private String name;
    private int gradeLevel;
    private double gpa;
    private int noteBook;
    private Optional<Bike> bike=Optional.empty();

    public Student() {

    }

    public Optional<Bike> getBike() {
        return bike;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gradeLevel=" + gradeLevel +
                ", gpa=" + gpa +
                ", noteBook=" + noteBook +
                ", bike=" + bike +
                ", gender='" + gender + '\'' +
                ", activities=" + activities +
                '}';
    }

    public void setBike(Optional<Bike> bike) {
        this.bike = bike;
    }

    private String gender;
    List<String> activities = new ArrayList<>();

    public int getNoteBook() {
        return noteBook;
    }

    public void setNoteBook(int noteBook) {
        this.noteBook = noteBook;
    }

    public Student(String name, int gradeLevel, double gpa, int noteBook, String gender, List<String> activities) {
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.gpa = gpa;
        this.noteBook = noteBook;
        this.gender = gender;
        this.activities = activities;
    }

    public Student(String s) {
        this.name=s;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

public void printlistactivities()
{
    System.out.println(activities);
}

    public List<String> getActivities() {
        return activities;
    }

    public void setActivities(List<String> activities) {
        this.activities = activities;
    }


}
