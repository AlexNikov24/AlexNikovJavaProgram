package com.java.class16;

import java.util.*;

public class StringPractice {

    public static void main(String[] args) {
        System.out.println("Please enter any string");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();


        for(int i = str.length() - 1; i>=0; i--){

            System.out.print(str.charAt(i));
        }

    }
}
