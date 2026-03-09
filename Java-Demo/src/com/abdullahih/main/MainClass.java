package com.abdullahih.main;

import java.io.FileNotFoundException;
import java.util.ArrayList;

// exception example
public class MainClass {

    public static void main(String[] args) {
//        Integer personSalary = 100000;
//        Float personalTax = calculateTax(personSalary);
//        System.out.println("Salary: " + personSalary);
//        System.out.println("Tax: " + personalTax);

//       ArrayList<Integer> list=new ArrayList<Integer>();
//       System.out.println(list.get(2));

//        Integer personSalary = 0;
//        Float personalTax = calculateTax(personSalary);
//        System.out.println("Salary: " + personSalary);
//        System.out.println("Tax: " + personalTax);
//
//        Integer person2Salary = 200000;
//        Float personal2Tax = calculateTax(person2Salary);
//        System.out.println("Salary: " + person2Salary);
//        System.out.println("Tax: " + personal2Tax);

        try{
            Integer personSalary = 0;
            Float personalTax = calculateTax(personSalary,5);
            System.out.println("Salary: " + personSalary);
            System.out.println("Tax: " + personalTax);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


        try {
            System.out.println(devide(1, 0));

        } catch (Exception e) {
            System.out.println(e.getMessage() + e.getCause());
        }
    }

//    public static float calculateTax(Integer salary){
//        int taxRatio = 15;
//        int rebate = 2;
//        return (float) (taxRatio/salary*rebate);
//    }


//    public static float calculateTax(Integer salary){
//        int taxRatio = 150000000;
//        int rebate = 2;
//        return (float) (taxRatio/salary*rebate);
//    }

//    public static float calculateTax(Integer salary) {
//        float rebatePercent;
//        try {
//            int taxRatio = 150000000;
//            int rebate = 2;
//            return rebatePercent = (float) (taxRatio / salary * rebate);
//
//        } catch (Exception e) {
//            System.out.println("Arithmetic Exception: " + e.getCause() + e.getClass() + e.getMessage());
//        }
//        return 0;
//    }

    public static Integer devide(Integer num1, Integer num2) {
        return num1 / num2;
    }

//    public static float calculateTax(Integer salary) throws Exception {
//        float rebatePercent;
//        int taxRatio = 150000000;
//        int rebate = 2;
//        try {
//
//            return rebatePercent = (float) (taxRatio / salary * rebate);
//
//        } catch (Exception e) {
//            System.out.println("Invalid Salary Value ");
//            throw new Exception("Arithmetic Exception: " + e.getCause() + e.getClass() + e.getMessage());
//        }
//
//    }

    public static float calculateTax(Integer salary, Integer index) throws Exception {
        float rebatePercent;
        int taxRatio = 150000000;
        int rebate = 2;
        try {

            ArrayList<Integer> arrayList = new ArrayList<>();
            arrayList.add(1);
            arrayList.add(2);
            arrayList.add(3);
            System.out.println("value: " + arrayList.get(index));

            return rebatePercent = (float) (taxRatio / salary * rebate);

        } catch ( ArithmeticException  | IndexOutOfBoundsException e) {
            System.out.println("Invalid Salary Value ");
            throw new Exception(" Exceptions: " + e.getCause() + e.getClass() + e.getMessage());
        }

    }


}
