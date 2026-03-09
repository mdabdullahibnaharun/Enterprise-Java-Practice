package com.abdullahih.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class AnotherClass {

    public static void main(String[] args) {
        String currentDirectory = System.getProperty("user.dir");
        System.out.println("Directory: " + currentDirectory);
        try {
            openFile();
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found exception occurred : " + e.getMessage());
            throw new RuntimeException(e.getMessage());
        }
        System.out.println("file opened");
    }

    public static void openFile() throws FileNotFoundException {

        String currentDirectory = System.getProperty("user.dir");
//      System.out.println(currentDirectory );
        String fileName = "my-fil.txt";

        String filePath = currentDirectory + "\\src\\com\\abdullahih\\main\\" + fileName;

        File file = new File(filePath);
        FileInputStream fileInputStream = new FileInputStream(file);

//
//        try {
//            FileInputStream fileInputStream = new FileInputStream(file);
//        } catch (FileNotFoundException e) {
//            System.out.println("exception occurred");
//             throw new RuntimeException(e);
//        }

    }
}
