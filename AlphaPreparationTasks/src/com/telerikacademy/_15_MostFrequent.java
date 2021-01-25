package com.telerikacademy;

import java.util.Arrays;
import java.util.Scanner;

public class _15_MostFrequent {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arraySize = Integer.parseInt(scan.nextLine());
        int[] array = new int[arraySize];

        for(int i = 0; i < arraySize; i++){
            array[i] = Integer.parseInt(scan.nextLine());
        }

        Arrays.sort(array);

        int mostFrequentNumber = 0;
        int mostRepetitions = 0;
        int count = 1;

        for(int i = 1; i < arraySize; i++){
            if(array[i - 1] == array[i]){
                count++;
            } else {
                if(count > mostRepetitions){
                    mostRepetitions = count;
                    mostFrequentNumber = array[i - 1];
                }
                count = 1;
            }
        }

        System.out.printf("%d (%d times)", mostFrequentNumber, mostRepetitions);
    }
}
