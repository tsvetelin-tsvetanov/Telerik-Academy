package com.telerikacademy;

import java.util.Scanner;

public class _09_LongestSequenceOfEqual {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arraySize = Integer.parseInt(scan.nextLine());
        int currentNumber = Integer.parseInt(scan.nextLine());
        int currentSequence = 1;
        int longestSequence = 1;
        for(int i = 0; i < arraySize - 1; i++){
            int nextNumber = Integer.parseInt(scan.nextLine());
            if(currentNumber == nextNumber){
                currentSequence++;
            } else {
                if(currentSequence > longestSequence){
                    longestSequence = currentSequence;
                }
                currentSequence = 1;
            }
            currentNumber = nextNumber;
        }

        System.out.println(longestSequence);

    }
}
