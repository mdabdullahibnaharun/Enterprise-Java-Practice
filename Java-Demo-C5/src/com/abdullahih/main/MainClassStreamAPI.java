package com.abdullahih.main;

import java.util.ArrayList;
import java.util.List;

public class MainClassStreamAPI {

    static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        for (Integer i : list) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

//       new list = list.stream().filter( condition ) to list

        List<Integer> list2 = list.stream().filter((num) -> num % 2 == 0).toList();
//        list2.forEach(System.out::println);

        System.out.println(list2);

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

//        List<User> selectedUSer = userList.stream().filter((user)->user.getCountry().equals("uo")).toList();
//        List<User> selectedUSer = userList.stream().filter((user) -> {
//            if (user.getCountry().equals("uo")) {
//                return true;
//            }
//            return false;
//        }).toList();

//        List<String> selectedUSerName = userList.stream().map((user)->{
//            if (user.getCountry().equals("uo")) {
//                return user.getFullName();
//            }   else {
//                return null;
//            }
//        }).toList();

//        List<String> selectedUSerName = userList.stream().map((user)->{
//            if (user.getCountry().equals("uo")) {
//                return user.getFullName();
//            }   else {
//                return null;
//            }
//        }).filter((name) -> name != null ).toList();

//        List<User> selectedUSerName = userList.stream().map((user)->{
//            if (user.getCountry().equals("uo")) {
//                user.setFullName(user.getFullName() +" " + user.getCountry());
//                return user;
//            }   else {
//                return null;
//            }
//        }).filter((user) -> user != null ).toList();

//        System.out.println(selectedUSerName);

        List<User> selectedUsers = userList.stream().filter(User::printDetails).toList();
        System.out.println(selectedUsers);



    }
}
