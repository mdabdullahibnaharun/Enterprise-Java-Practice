package com.abdullahih.prototype;
// prototype designe pattern clone object
public class MainClass {
    public static void main(String[] args) {
//        Student student = new Student();
//        System.out.println(student.getStudentlist());

        Student student1 = new Student();
        //take 5s
        student1.lodaData();
        System.out.println(student1.getStudentlist());
        Student student2 = new Student();
        //take 5s
        student2.lodaData();
        System.out.println(student2.getStudentlist());
        Student student3= student1;
        student3.addStudent("iuyd8");
        //take 5s
//        student2.lodaData();
        System.out.println(student3.getStudentlist());

        Student student4= (Student)student3.getClone();
        System.out.println(student4.getStudentlist());
    }
}
