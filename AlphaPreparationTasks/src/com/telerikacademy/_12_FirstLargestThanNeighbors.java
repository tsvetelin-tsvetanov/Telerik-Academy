package com.telerikacademy;

import java.util.Scanner;

public class _12_FirstLargestThanNeighbors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arraySize = Integer.parseInt(scan.nextLine());
        int[] array = new int[arraySize];

        for(int i = 0; i < arraySize; i++){
            array[i] = Integer.parseInt(scan.next());
        }

        boolean biggestNeighborFound = false;

        for(int i = 1; i < arraySize - 1; i++){
            if(array[i] > array[i - 1] && array[i] > array[i + 1]){
                System.out.println(i);
                biggestNeighborFound = true;
                break;
            }
        }

        if(!biggestNeighborFound){
            System.out.println("-1");
        }
    }
}
