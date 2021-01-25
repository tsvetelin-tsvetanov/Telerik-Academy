package com.telerikacademy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class _13_MaxSumOfKElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Integer[] array = new Integer[Integer.parseInt(scan.nextLine())];
        int k = Integer.parseInt(scan.nextLine());

        for(int i = 0; i < array.length; i++){
            array[i] = Integer.parseInt(scan.nextLine());
        }

        Arrays.sort(array, Collections.reverseOrder());

        int sum = 0;
        for(int i = 0; i < k; i++){
            sum += array[i];
        }

        System.out.println(sum);
    }
}
