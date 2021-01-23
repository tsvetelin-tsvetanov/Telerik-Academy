package com.telerikacademy;

import java.util.Scanner;

public class _10_MultiplicationSign {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float a = Float.parseFloat(scan.nextLine());
        float b = Float.parseFloat(scan.nextLine());
        float c = Float.parseFloat(scan.nextLine());

        if (a == 0 || b == 0 || c == 0) {
            System.out.println("0");
        } else if (a > 0 && b > 0 && c > 0) {
            System.out.println("+");
        } else if (a < 0 && b < 0 && c > 0) {
            System.out.println("+");
        } else if (a < 0 && b > 0 && c < 0) {
            System.out.println("+");
        } else if (a > 0 && b < 0 && c < 0) {
            System.out.println("+");
        } else {
            System.out.println("-");
        }

    }
}
