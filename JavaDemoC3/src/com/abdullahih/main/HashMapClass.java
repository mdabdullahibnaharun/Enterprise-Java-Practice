package com.abdullahih.main;

import java.util.HashMap;
import java.util.Map;

public class HashMapClass {
    static void main(String[] args) {
//        O(1)
        HashMap<String ,String > hashMap = new HashMap<>();
        hashMap.put("Name","Riddro");
        hashMap.put("Age","26");
        hashMap.put("Years of Experience","5.5");

        System.out.println("HashMap: "+hashMap);

        printHashMap(hashMap);

        System.out.println("Name: "+hashMap.get("Name"));

        boolean isPresent12 = hashMap.get("Age").equals("26");
        System.out.println("isPresent12: "+isPresent12);

        Object removeVlaue = hashMap.remove("Age");
        System.out.println("removeVlaue: "+removeVlaue);

        int size = hashMap.size();
        System.out.println("size: "+size);

        boolean isEmpty = hashMap.isEmpty();
        System.out.println("isEmpty: "+isEmpty);

        printHashMap(hashMap);

        HashMap<String ,String > anotherHashMap = new HashMap<>();
        anotherHashMap.putAll(hashMap);
        printHashMap(anotherHashMap);

        hashMap.clear();
//        hashMap.putAll(anotherHashMap);
        printHashMap(hashMap);
    }

    public static void printHashMap(HashMap<String ,String > hashMap) {
        System.out.println("Printing HashMap: ");
//        for (Object key : hashMap.entrySet()) {
//            System.out.println(key + " : " + hashMap.get(key));
//
//        }
        for (Map.Entry<String, String> element:hashMap.entrySet()) {
            System.out.println("key: " +element.getKey()+ " value: " + element.getValue());

        }
    }
}
