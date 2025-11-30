package com.abdullahih.main.model;

import java.util.List;

//public class People {
abstract class People {
//    public String Id;
//    public String peopleName ;
//    public List<String> Subjects;

    private String Id;
    private String peopleName ;
    private List<String> Subjects;

    public abstract void printDetails();

//    public void printDetails() {
//        System.out.println("ID: " + this.Id);
//        System.out.println("Name: " + this.peopleName);
//        System.out.println("Subjects: " + this.Subjects);
//    }


    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }
    public String getPeopleName() {
        return peopleName;
    }
    public void setPeopleName(String peopleName) {
        this.peopleName = peopleName;
    }
    public List<String> getSubjects() {
        return Subjects;
    }
    public void setSubjects(List<String> subjects) {
        Subjects = subjects;
    }
}
