/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.patrik.beadando.student.Model;


import java.time.LocalDate;

public class StudentClass {
    private Integer id;
    private String name;
    private LocalDate birthDate;
    private String email;
    private MajorEnum major;
    private FinancingTypeEnum financingType;
    private CourseTypeEnum courseType;

    public StudentClass() {}

    public StudentClass(Integer id, String name, LocalDate birthDate, String email, MajorEnum major, FinancingTypeEnum financingType, CourseTypeEnum courseType) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.email = email;
        this.major = major;
        this.financingType = financingType;
        this.courseType = courseType;
    }

    public StudentClass(String name, LocalDate birthDate, String email, MajorEnum major, FinancingTypeEnum financingType, CourseTypeEnum courseType) {
        this.name = name;
        this.birthDate = birthDate;
        this.email = email;
        this.major = major;
        this.financingType = financingType;
        this.courseType = courseType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public MajorEnum getMajor() {
        return major;
    }

    public void setMajor(MajorEnum major) {
        this.major = major;
    }

    public FinancingTypeEnum getFinancingType() {
        return financingType;
    }

    public void setFinancingType(FinancingTypeEnum financingType) {
        this.financingType = financingType;
    }

    public CourseTypeEnum getCourseType() {
        return courseType;
    }

    public void setCourseType(CourseTypeEnum courseType) {
        this.courseType = courseType;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", email='" + email + '\'' +
                ", major=" + major +
                ", financingType=" + financingType +
                ", courseType=" + courseType +
                '}';
    }
}
