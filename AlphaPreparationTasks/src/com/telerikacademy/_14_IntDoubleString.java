package com.telerikacademy;

import java.util.Scanner;

public class _14_IntDoubleString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String type = scan.nextLine();

        switch (type) {
            case "integer":
                int number = Integer.parseInt(scan.nextLine());
                System.out.println(++number);
                break;
            case "real":
                double real = Double.parseDouble(scan.nextLine());
                System.out.printf("%.2f", ++real);
                break;
            case "text":
                String text = scan.nextLine();
                System.out.println(text + "*");
                break;
        }
    }
}
