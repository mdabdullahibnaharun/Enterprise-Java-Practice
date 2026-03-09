package com.abdullahih.main;

import java.util.ArrayList;
import java.util.List;

public class MainClassSwitchSt {
    static void main(String[] args) {
        printDayName(5);

        User user1 = new User(1, "ind", "arif");
        User user2 = new User(2, "uk", "tipo");
        User user3 = new User(3, "us", "hom");
        User user4 = new User(4, "uk", "lom");
        User user5 = new User(5, "us", "pol");
        User user6 = new User(6, "bd", "fni");

        List<User> userList = new ArrayList<>();

        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        userList.add(user5);
        userList.add(user6);

        // Text Block

        user2.printDetails();
        user3.toString();


        // record class
        UserRecordClass userRecordClass = new UserRecordClass(1, "ind", "arif");
        System.out.println(userRecordClass.toString());
        userRecordClass.mymethod();
    }

//    public static void printDayName(Integer dayNumber) {
//        switch (dayNumber) {
//            case 1:
//                System.out.println("Sat");
//                break;
//            case 2:
//                System.out.println("Sun");
//                break;
//            case 3:
//                System.out.println("Mon");
//                break;
//            case 4:
//                System.out.println("Tue");
//                break;
//            case 5:
//                System.out.println("Wed");
//                break;
//            case 6:
//                System.out.println("Thu");
//                break;
//            case 7:
//                System.out.println("Fri");
//                break;
//            default:
//                System.out.println("Invalid day number");
//                break;
//
//        }}

    public static void printDayName(Integer dayNumber) {
        switch (dayNumber) {
            case 1 -> System.out.println("Sat");
            case 2 -> System.out.println("Sun");
            case 3 -> System.out.println("Mon");
            case 4 -> System.out.println("Tue");
            case 5 -> System.out.println("Wed");
            case 6 -> System.out.println("Thu");
            case 7 -> System.out.println("Fri");
            default -> System.out.println("Invalid day number");


        }
    }

}
