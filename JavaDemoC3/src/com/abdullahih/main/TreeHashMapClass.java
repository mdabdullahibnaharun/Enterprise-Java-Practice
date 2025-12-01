package com.abdullahih.main;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeHashMapClass {
    static void main(String[] args) {
        TreeMap<String ,String > treeHashMap = new TreeMap<>();
        treeHashMap.put("Name","Riddro");
        treeHashMap.put("Age","26");
        treeHashMap.put("Years of Experience","5.5");

        System.out.println("HashMap: "+treeHashMap);

        printHashMap(treeHashMap);

        System.out.println("Name: "+treeHashMap.get("Name"));

        boolean isPresent12 = treeHashMap.get("Age").equals("26");
        System.out.println("isPresent12: "+isPresent12);

        Object removeVlaue = treeHashMap.remove("Age");
        System.out.println("removeVlaue: "+removeVlaue);

        int size = treeHashMap.size();
        System.out.println("size: "+size);

        boolean isEmpty = treeHashMap.isEmpty();
        System.out.println("isEmpty: "+isEmpty);

        printHashMap(treeHashMap);

        HashMap<String ,String > anotherHashMap = new HashMap<>();
        anotherHashMap.putAll(treeHashMap);
        System.out.println("anotherHashMap: "+anotherHashMap);
//        printHashMap(anotherHashMap);

        treeHashMap.clear();
//        hashMap.putAll(anotherHashMap);
        printHashMap(treeHashMap);

        TreeMap<Integer,String > treeHashMap2 = new TreeMap<>();
        treeHashMap2.put(1,"Riddro");
        treeHashMap2.put(-6,"26");
        treeHashMap2.put(7 ,"5.5");
        System.out.println("treeHashMap2: "+treeHashMap2);
    }

    public static void printHashMap(TreeMap<String ,String > hashMap) {
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
