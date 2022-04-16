package com.java.homework;

import java.util.Scanner;

public class Hmwclass8q1 {


    //  Write a java program to get marks from users and print grades based on marks (feel free to use any statements)
    // If marks are from 90 to 100 Print A
    // If marks are from 80 to 89 Print B
    // If marks are from 70 to 79 Print C
    // If marks are from 60 to 69 Print D
    // If marks are from 50 to 59 Print E
    // If marks are from 0 to 49 Print Fail
    public static void main(String[] args) {
        System.out.println("Please write your score");

        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        if (score >= 90 && score <= 100) {
            System.out.println("A");
        } else if (score >= 80 && score <= 89) {
            System.out.println("B");

        } else if (score >= 70 && score <= 79) {
            System.out.println("C");
        } else if (score >= 60 && score <= 69) {
            System.out.println("D");
        } else if (score >= 50 && score <= 59) {
            System.out.println("E");
        } else {
            System.out.println("Fail");
        }
    }
}