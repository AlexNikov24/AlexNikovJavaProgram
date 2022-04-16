package com.java.Practice;

import java.util.Scanner;

public class groupProjectPractice {
    public static void main(String[] args) {


        System.out.println("Enter vehicle year ");
        Scanner sc = new Scanner(System.in);

        int vehicleYear = sc.nextInt();

        switch (vehicleYear) {


            case 2001:
            case 2002:
            case 2004:
            case 2005:
            case 2006:
            case 2015:
            case 2016:
            case 2017:
                System.out.println("Your vehicle needs to be recalled!");
                break;
            default:
                System.out.println("Your vehicle is fine ,enjoy");
        }
    }
}