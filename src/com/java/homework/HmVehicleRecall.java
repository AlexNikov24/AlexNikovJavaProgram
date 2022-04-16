package com.java.homework;

import java.util.Scanner;

public class HmVehicleRecall {
    public static void main(String[] args) {


        System.out.println("Enter vehicle year ");
        Scanner sc = new Scanner(System.in);

        int vehicleYear = sc.nextInt();

        switch (vehicleYear){
            case 2001:
                System.out.println("Your vehicle needs to be recalled!");
                break;
            case 2002:
                System.out.println("Your vehicle needs to be recalled!");
                break;
            case 2004:
                System.out.println("Your vehicle needs to be recalled!");
                break;
            case 2005:
                System.out.println("Your vehicle needs to be recalled!");
                break;
            case 2006:
                System.out.println("Your vehicle needs to be recalled!");
                break;
            case 2015:
                System.out.println("Your vehicle needs to be recalled!");
                break;
            case 2016:
                System.out.println("Your vehicle needs to be recalled!");
            case 2017:
                System.out.println("Your vehicle needs to be recalled!");
            default:
                System.out.println("Your vehicle is fine ,enjoy");
        }
    }
}
