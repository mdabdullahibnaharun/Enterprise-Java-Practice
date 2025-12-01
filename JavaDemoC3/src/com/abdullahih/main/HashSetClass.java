package com.abdullahih.main;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetClass {
//  Duplicate value not allowed
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(4);
        hashSet.add(3);
        hashSet.add(4);
        System.out.println("HashSet contains: " + hashSet.contains(4));
        System.out.println(hashSet);


        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(4);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(4);

        System.out.println("ArrayList contains: " + arrayList);

        HashSet<Integer> hashSet2 = new HashSet<>(arrayList);
        System.out.println("HashSet contains: " + hashSet2);
        hashSet2.add(1);
        hashSet2.clear();
        System.out.println("HashSet contains: " + hashSet2);
    }
}
