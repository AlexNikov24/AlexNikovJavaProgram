package com.java.homework;

import java.util.Scanner;

public class Hmwclass8q2 {
    public static void main(String[] args) {


        System.out.println("Enter T-shirt size in inches");


        Scanner sc = new Scanner(System.in);
        int inches = sc.nextInt();

        if (inches >= 27 && inches <= 30) {
            System.out.println("XS");
        } else if (inches >= 31 && inches <= 34) {
            System.out.println("S");
        } else if (inches >= 35 && inches <= 38) {
            System.out.println("L");
        } else if (inches >= 39 && inches <= 44) {
            System.out.println("XL");
        } else if (inches >= 45 && inches <= 50) {
            System.out.println("XXL");
        } else {
            System.out.println("Out of stock");
        }
    }
}