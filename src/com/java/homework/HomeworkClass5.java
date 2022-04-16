package com.java.homework;

import java.util.Scanner;

public class HomeworkClass5 {
    public static void main(String[] args) {
        System.out.println("Enter any year - ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("Year is");

        if (num % 4 == 0) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not a Leap year");

        }

    }

}


