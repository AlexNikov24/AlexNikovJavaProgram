package com.java.homework;

import java.util.Scanner;

public class DaysMonthsExample {

    public static void main(String[] args) {
        System.out.println("Enter any number from 1 to 12");
        Scanner sc = new Scanner(System.in);

        int monthNum = sc.nextInt();

        if (monthNum == 1) {
            System.out.println("31");
        } else if (monthNum == 2) {
            System.out.println("28/29");
        } else if (monthNum == 3) {
            System.out.println("31");
        } else if (monthNum == 4) {
            System.out.println("30");
        } else if (monthNum == 5) {
            System.out.println("31");
        } else if (monthNum == 6) {
            System.out.println(30);
        } else if (monthNum == 7) {
            System.out.println("31");
        } else if (monthNum == 8) {
            System.out.println("31");
        } else if (monthNum == 9) {
            System.out.println("30");
        } else if (monthNum == 10) {
            System.out.println("31");
        } else if (monthNum == 11) {
            System.out.println("30");
        } else if (monthNum == 12) {
            System.out.println("31");
        } else {
            System.out.println("Number is not valid");
        }
    }
}