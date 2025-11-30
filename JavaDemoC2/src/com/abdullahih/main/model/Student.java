package com.abdullahih.main.model;

import java.util.ArrayList;
import java.util.List;

public class Student extends People {
    public String studentClass ;

    public Student(String Id, String peopleName, String studentClass) {
        super();
        this.setId(Id);
        this.setPeopleName(peopleName);
        this.studentClass = studentClass;
    }
    public Student(String Id, String peopleName, List<String> studentSubjects, String studentClass) {
        super();
        this.setId(Id);
        this.setPeopleName(peopleName);
        this.studentClass = studentClass;
        this.setSubjects(studentSubjects);
    }

    @Override
    public void printDetails() {
        System.out.println("Student Details");
//        super.printDetails();
        System.out.println("Class: " + this.studentClass);
    }
}
