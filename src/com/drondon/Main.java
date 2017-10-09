package com.drondon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Как тебя зовут? ");
            String result = scanner.nextLine();
            if ("q".equals(result)) {
                return;
            }
            System.out.println("Привет: " + result);
        }
    }

    public static String printHello() {
        return "Hello World!";
    }
}
