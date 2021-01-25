package com.telerikacademy;

import java.math.BigInteger;
import java.util.Scanner;

public class _16_NFactorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int factorial = Integer.parseInt(scan.nextLine());

        BigInteger result = new BigInteger("1");
        for(int i = 1; i <= factorial; i++){
            result = result.multiply(BigInteger.valueOf(i));
        }

        System.out.println(result);
    }
}
