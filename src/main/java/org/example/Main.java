package org.example;


public class Main {
    boolean evenChecker=false;
    public static void main(String[] args) {
        System.out.println("Hello and welcome to the Test!");

    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static boolean evenChecker(int a) {
        return a % 2 != 0;
    };

    public static int product(int a, int b) {
        return a * b;
    }

    public static boolean positiveChecker (int a) {
        return a > 0;
    }
}