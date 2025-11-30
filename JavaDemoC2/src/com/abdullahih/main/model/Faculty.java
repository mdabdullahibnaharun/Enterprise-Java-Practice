package com.abdullahih.main.model;

import java.util.ArrayList;
import java.util.List;

public class Faculty extends People {
//    public String Id;
//    public String facultyName ;
//    public String facultySubject ;
//    public List<String> facultyClass ;
//
//    public Faculty(String facultyName, String facultySubject, List <String> facultyClass) {
//        this.facultyName = facultyName;
//        this.facultySubject = facultySubject;
//        this.facultyClass = facultyClass;
//    }
//
//    public void printFacultyInfo() {
//        System.out.println("faculty Name: "+facultyName);
//        System.out.println("faculty Subj: "+facultySubject);
//        System.out.println("faculty Class:"+facultyClass);
//    }
    private List<String> facultyClass ;
//    public List<String> facultyClass ;
    public Faculty(String Id, String peopleName, List<String> facultyClass, List<String> Subjects) {
        super();
        this.setId(Id);
        this.setPeopleName(peopleName);
        this.facultyClass = facultyClass;
        this.setSubjects(Subjects);
    }

    @Override
    public void printDetails() {

        System.out.println("Faculty Details");
        System.out.println("ID: " + this.getId());
        System.out.println("Name: " + this.getPeopleName());
        System.out.println("Subjects: " + this.getSubjects());
        System.out.println("Faculty Class: " + this.facultyClass);
//        super.printDetails();
    }
    public  List<String> getFacultyClass() {
        return facultyClass;
    }

}
