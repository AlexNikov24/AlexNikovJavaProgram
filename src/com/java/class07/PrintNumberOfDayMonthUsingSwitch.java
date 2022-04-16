package com.java.class07;

import java.util.Scanner;


public class PrintNumberOfDayMonthUsingSwitch {
    public static void main(String[] args) {
        System.out.println("Please enter a month: ");
        Scanner sc = new Scanner(System.in);
        String month = sc.nextLine();

        switch (month) {
            case "January":
                System.out.println("30");
                break;
            case "February":
                System.out.println("28/29");
                break;
            case "March":
                System.out.println("31");
                break;
            case "April":
                System.out.println("30");
                break;
            case "May":
                System.out.println("31");
                break;
            case "June":
                System.out.println("30");
                break;
            default:
                System.out.println("Please enter a month");
        }

    }
}