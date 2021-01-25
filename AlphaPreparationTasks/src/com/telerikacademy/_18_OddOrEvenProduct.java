package com.telerikacademy;

import java.util.Scanner;

public class _18_OddOrEvenProduct {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        short size = Short.parseShort(scan.nextLine());
        long oddProduct = 1;
        long evenProduct = 1;


        for(int i = 0; i < size; i++){
            int number = scan.nextInt();
            if(i % 2 == 0){
                oddProduct *= number;
            } else {
                evenProduct *= number;
            }
        }

        if(oddProduct == evenProduct){
            System.out.printf("yes %d", oddProduct);
        } else {
            System.out.printf("no %d %d", oddProduct, evenProduct);
        }
    }
}
