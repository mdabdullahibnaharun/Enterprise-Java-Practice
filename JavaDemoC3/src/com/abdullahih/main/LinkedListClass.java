package com.abdullahih.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListClass {
    static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(401);
        linkedList.add(201);
        linkedList.add(302);
        printList(linkedList);

        linkedList.addFirst(80);
        linkedList.addLast(33);
        printList(linkedList);

        Collections.sort(linkedList);
        printList(linkedList);

        linkedList.addLast(66);
        linkedList.removeLast();
        linkedList.removeFirst();
        printList(linkedList);


    }
    public static void printList (LinkedList < Integer > linkedList) {
        System.out.println("Printing LinkedList: ");
        for (Integer elemet : linkedList) {
            System.out.println(elemet);
        }
    }
}
