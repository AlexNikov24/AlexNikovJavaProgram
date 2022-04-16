package com.java.homework;

import java.util.Scanner;

public class Class5Homework {
    public static void main(String[] args) {
        System.out.println("Enter any number - ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("Number is ");

        if (num % 5 == 0) {
            System.out.println("Divided by 5");
        } else {
            System.out.println("Not divided by 5");

        }

    }

}
