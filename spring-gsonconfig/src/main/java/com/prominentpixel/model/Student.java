package com.prominentpixel.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.Serializable;
import java.util.ArrayList;

public class Student implements Serializable {

    private int no;
    private String name;
    private String designation;
    private String gender;

    public Student() {
    }

    public Student(int no, String name, String designation, String gender) {
        this.no = no;
        this.name = name;
        this.designation = designation;
        this.gender = gender;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public static java.util.List<Student> getStudent() {
        java.util.List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Bob", "Developer", "Male"));
        students.add(new Student(2, "Joy", "Sr. Developer", "Male"));
        students.add(new Student(3, "John", "CEO", "Male"));
        students.add(new Student(4, "Bat", "Developer", "Male"));
        students.add(new Student(5, "Jolly", "Developer", "Female"));
        students.add(new Student(6, "Bobby", "Developer", "Female"));
        return students;
    }
}