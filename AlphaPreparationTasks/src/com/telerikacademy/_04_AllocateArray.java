package com.telerikacademy;

import java.util.Scanner;

public class _04_AllocateArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arraySize = Integer.parseInt(scan.nextLine());
        int[] array = new int[arraySize];

        for(int i = 0; i < arraySize; i++){
            array[i] = i * 5;
            System.out.println(array[i]);
        }
    }
}
