package com.telerikacademy;

import java.util.ArrayList;
import java.util.Scanner;

public class _11_PrintDeck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sign = scan.next();

        ArrayList<String> deck = new ArrayList<>();
        for (int i = 2; i < 11; i++){
            deck.add(i + "");
        }
        deck.add("J");
        deck.add("Q");
        deck.add("K");
        deck.add("A");

        for(int i = 0; i < deck.size(); i++){
            System.out.printf("%s of spades, %s of clubs, %s of hearts, %s of diamonds\n",
                    deck.get(i), deck.get(i), deck.get(i), deck.get(i));
            if(sign.equals(deck.get(i))){
                break;
            }
        }
    }
}
