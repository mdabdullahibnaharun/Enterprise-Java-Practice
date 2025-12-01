package com.abdullahih.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListClass {
    static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

//o(1)
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        System.out.println(arrayList);
//o(n)
        arrayList.add(2,200);
        int listSize = arrayList.size();
        System.out.println("listSize: " + listSize);

        printList(arrayList);
        Collections.sort(arrayList);
        System.out.println("after sorting: " + arrayList);
//        O(n)
        arrayList.remove(arrayList.size()-1);
        printList(arrayList);
        arrayList.add(0,100);
//        o(n)
        Collections.sort(arrayList);
        System.out.println("after sorting: " + arrayList);
        boolean isPresent2 = arrayList.contains(2);
        System.out.println("isPresent: " + isPresent2);
//        O(n)
        boolean isPresent12 = arrayList.contains(List.of(1,2));
        System.out.println("isPresent: " + isPresent12);
        System.out.println("array list: " + arrayList);

        arrayList.set(2,2);
       isPresent12 = arrayList.contains(List.of(1,2));
        System.out.println("isPresent: " + isPresent12);

    }

    public static void printList(ArrayList<Integer> arrayList) {
        System.out.println("Printing ArrayList: ");
        for (Integer elemet : arrayList) {
            System.out.println(elemet);
        }
    }
}
