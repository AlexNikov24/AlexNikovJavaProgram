package com.java.homework;

import java.util.Scanner;

public class Hmwclass8q3 {
    public static void main(String[] args) {


        System.out.println("Please enter a NUMBER to Divide it by 5 or 3");

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if (number % 5 == 0 || number % 3 == 0)
            System.out.println(number + "Is Devisible");
        else {
            System.out.println(number + "Is not Devisible");
        }



    }
}
