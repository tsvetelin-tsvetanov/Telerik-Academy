package com.telerikacademy;

public class _02_LongSequence {
    public static void main(String[] args) {
        int index = 1;

        for(int i = 2; i < 1002; i++){
            System.out.println(i * index);
            index *= -1;
        }
    }
}
