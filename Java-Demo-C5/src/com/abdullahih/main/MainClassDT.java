package com.abdullahih.main;

public class MainClassDT {
    // var method level variable not global
    // value initialize in locally
    static void main(String[] args) {
        var intNumber = 2;
        var doubleNumber = 2.0;
        var stringChar = "Hello";

        System.out.println(intNumber+doubleNumber);
        System.out.println(stringChar   +   intNumber + doubleNumber);

    }
}
