package com.abdullahih.prototype;

import java.util.ArrayList;
import java.util.List;

public class Student implements Prototype {


    private List<String> studentlist;

    public Student(){
        studentlist = new ArrayList<>();
        System.out.println("Student constructor");
    }

    @Override
    public Prototype getClone() {
        Student pstudent = new Student(this.studentlist);
        return pstudent;
    }

    public Student(List<String> studentlist){
        this.studentlist = studentlist;
        System.out.println("Student constructor");
    }

    public List<String> getStudentlist() {
        return studentlist;
    }
    public void setStudentlist(List<String> studentlist) {
        this.studentlist = studentlist;
    }

   public void lodaData(){
        studentlist.add("cnrs1");
        studentlist.add("cvds2");
        studentlist.add("csad3");
        studentlist.add("cssf4");
        studentlist.add("csss5");
        studentlist.add("cssf6");
   }

   public void addStudent(String student){
        studentlist.add(student);
   }
}
