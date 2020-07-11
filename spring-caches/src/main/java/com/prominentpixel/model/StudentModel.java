package com.prominentpixel.model;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class StudentModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "studentId")
    private long studentId;

    @Column(name = "studentName")
    private String studentName;

    @Column(name = "role")
    private String role;

    public StudentModel() {
    }

    public StudentModel(long studentId, String studentName, String role) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.role = role;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "StudentModel{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
