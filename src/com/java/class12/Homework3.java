package com.java.class12;

import java.util.Scanner;

// Write a program to print numbers that are not divisible by 3 and divisible by 7
public class Homework3 {
    public static void main(String[] args) {
        System.out.println("Please enter the limit");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int i = 1;

        while (i <= num) {
            if (i % 3 != 0 && i % 7 == 0) {
                System.out.println(i);
            }
                i++;
            }

        }
    }
