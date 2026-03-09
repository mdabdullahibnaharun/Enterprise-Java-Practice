package com.abdullahih.passcheck;

public class PasswordValidator {

//    public static boolean isPasswordValid(String password) throws Exception {
////        if (password.length() < 6) {
////            return false;
////        }   else if (password.length() > 8) {
////            return false;
////        }
////        return true;
//
//        if (password.isEmpty() || password.length() < 8) {
//            throw new Exception("Password can not be empty");
//        } else if (password.length() < 8) {
//            throw new Exception("Password too short");
//        } else if (password.length() < 18) {
//            throw new Exception("Password too large");
//        } else {
//            return true;
//        }
//    }

public static boolean isPasswordValid(String password) throws PasswordValidationException {
//        if (password.length() < 6) {
//            return false;
//        }   else if (password.length() > 8) {
//            return false;
//        }
//        return true;

    if (password.isEmpty() || password.length() < 8) {
        throw new PasswordValidationException("Password can not be empty");
    } else if (password.length() < 8) {
        throw new PasswordValidationException("Password too short");
    } else if (password.length() > 18) {
        throw new PasswordValidationException("Password too large");
    } else {
        return true;
    }
}
}
