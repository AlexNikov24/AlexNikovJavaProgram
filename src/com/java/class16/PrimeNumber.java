package com.java.class16;

import java.util.Scanner;

//Write a program to check given number is prime or not.
public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Please enter any number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                result++;
            }
        }
        if (result == 2) {
            System.out.println("Is prime");


        } else {
            System.out.println("It's not prime");
        }
    }
}