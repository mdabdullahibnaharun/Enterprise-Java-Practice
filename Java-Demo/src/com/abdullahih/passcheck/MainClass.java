package com.abdullahih.passcheck;

public class MainClass {
    static void main(String[] args) {
        String password = "1235555588888885";
        try {
            boolean isPasswordValid = PasswordValidator.isPasswordValid(password);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
//        System.out.println("password entered is ");
    }
}
