package com.java.class06;

import java.util.Scanner;

public class PositiveNegativeExample {

    public static void main(String[] args) {
        System.out.println("Write your number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("Number is positive");
        } else if (num < 0) {
            System.out.println("Number is negative");
        } else if (num == 0) {
            System.out.println("This is equal to 0");
        }
    }
}



