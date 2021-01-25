package com.telerikacademy;

import java.util.Scanner;

public class _19_NumbersTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        int index = 1;
        for (int i = 1; i <= (n * 2) - 1; i++){
            if(i <= n) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
            } else {

                int count = 1;
                for (int j = n - index; j > 0; j--){
                    System.out.print(count + " ");
                    count++;
                }
                index++;

            }
            System.out.println();
        }

    }
}
