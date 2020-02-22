package com.ios;

import java.util.LinkedList;

public class Sample3 {


    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("A");
        ll.add("B");
        ll.add("C");
        ll.add("D");

        System.out.println(findNthNodeFromLast(ll, 3));
    }

    private static String findNthNodeFromLast(LinkedList<String> ll, int n) {
        return ll.get(ll.size() - n);
    }
}
