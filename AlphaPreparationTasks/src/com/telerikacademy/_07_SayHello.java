package com.telerikacademy;

import java.util.Scanner;

public class _07_SayHello {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();

        System.out.printf("Hello, %s!", name);
    }
}
