package com.abdullahih.main;

import com.abdullahih.main.model.Faculty;
import com.abdullahih.main.model.Student;

import java.util.List;


public class MainClass {
    static void main(String[] args) {

        // No fixed Structure // No OOP
//        String facultyName = "Sjal";
//        String facultySubject = "Math";
//        String facultyClass = " Class 11";
//
//        printFacultyInfo(facultyName, facultySubject, facultyClass);
//
//        String faculty2Name = "Sjal";
//        List<String> faculty2Subject = List.of("Math", "Ict");
//        String faculty2Class = " Class 11";
//
//        printFacultyInfo1(faculty2Name, faculty2Subject, faculty2Class);
//
//        Faculty faculty1 = new Faculty("Faisal","Bangla", List.of("Class 9","Class 12"));
//        faculty1.toString();
//        faculty1.printFacultyInfo();
//
//        Faculty faculty2 = new Faculty("Sazzad","English", List.of("Class 9","Class 10"));
//       faculty2.toString();
//        faculty2.printFacultyInfo();
//    }

//    public static void printFacultyInfo(String facultyName, String facultySubject, String facultyClass) {
//        System.out.println("faculty Name: "+facultyName);
//        System.out.println("faculty Subj: "+facultySubject);
//        System.out.println("faculty Class:"+facultyClass);
//    }
//
//    public static void printFacultyInfo1(String facultyName, List <String> facultySubject, String facultyClass) {
//        System.out.println("faculty Name: "+facultyName);
//        System.out.println("faculty Subj: "+facultySubject);
//        System.out.println("faculty Class:"+facultyClass);
        Student student1 = new Student("1","Kamal",List.of("bang","eng"),"Class 10");
        student1.printDetails();
        Student student2 = new Student("2 ","Kamal",List.of("Eng","Islam"),"Class 8");
        student2.printDetails();

        Faculty faculty1 = new Faculty("f1","Kamal",List.of("Class 10","Class 9"),List.of("Bang"));
        faculty1.printDetails();
        Faculty faculty2 = new Faculty("f2","Kamal",List.of("Class 11","Class 12"),List.of("Ict"));

        faculty1.setPeopleName("Maju");
        faculty1.printDetails();
        faculty2.printDetails();

    }
}
