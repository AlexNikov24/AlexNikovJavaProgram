package com.java.class16;

import java.util.Scanner;

public class FindOccurenceOfChar {
    public static void main(String[] args) {
        //String str = "This is my java program!";


        System.out.println("Please enter a sentence: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char c = 'a';
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                num++;
            }
        }
        System.out.println(num);

    }
}
