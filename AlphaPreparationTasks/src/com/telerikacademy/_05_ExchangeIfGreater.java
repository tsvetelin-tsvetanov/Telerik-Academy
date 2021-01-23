package com.telerikacademy;

import java.text.DecimalFormat;
import java.util.Scanner;

public class _05_ExchangeIfGreater {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a = Double.parseDouble(scan.nextLine());
        double b = Double.parseDouble(scan.nextLine());

        if(a > b){
            b = a + b;
            a = b - a;
            b = b - a;
        }

        DecimalFormat df = new DecimalFormat("###.#");

        System.out.println(df.format(a) + " " + df.format(b));
    }
}
