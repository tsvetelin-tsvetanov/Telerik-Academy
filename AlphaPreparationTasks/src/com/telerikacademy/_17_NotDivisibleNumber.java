package com.telerikacademy;

import java.util.Scanner;

public class _17_NotDivisibleNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        String result = "";

        for(int i = 1; i <= n; i++) {
            if (i % 3 != 0 && i % 7 != 0) {
                result += i + " ";
            }
        }

        System.out.println(result);
    }
}
