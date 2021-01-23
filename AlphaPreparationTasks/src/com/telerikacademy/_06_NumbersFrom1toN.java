package com.telerikacademy;

import java.util.Scanner;

public class _06_NumbersFrom1toN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        String output = "1";

        for(int i = 2; i <= n; i++){
            output += " " + i;
        }

        System.out.println(output);

    }
}
