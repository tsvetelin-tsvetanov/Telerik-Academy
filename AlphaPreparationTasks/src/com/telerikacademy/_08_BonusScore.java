package com.telerikacademy;

import java.util.Scanner;

public class _08_BonusScore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score = Integer.parseInt(scan.nextLine());

        switch (score){
            case 1:
            case 2:
            case 3:
                System.out.println(score * 10);
                break;
            case 4:
            case 5:
            case 6:
                System.out.println(score * 100);
                break;
            case 7:
            case 8:
            case 9:
                System.out.println(score * 1000);
                break;
            default:
                System.out.println("invalid score");
                break;
        }
    }
}
