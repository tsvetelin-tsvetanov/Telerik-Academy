package com.telerikacademy;

import java.util.Scanner;

public class _01_SumTwoNumbers {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());

        System.out.println(a + b);
    }
}

