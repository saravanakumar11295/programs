package com.ios;

public class Sample1 {

    static void printTriangle(int n) {
        for (int i = 1; i <= n ; i++) {
            printSpaces(n-i);
            printValues(i);
            System.out.println();
        }
    }

    static void printValues(int n) {
        int x = n;
        for (int i = 0; i < n; i++) {
            System.out.print(x++);
        }
        --x;
        for (int i = n; i > 1; i--) {
            System.out.print(--x);
        }
    }

    private static void printSpaces(int n) {
        for (int j = 0; j < n; j++) {
            System.out.print(" ");
        }
    }

    public static void main(String[] args) {
        printTriangle(4);
    }
}
