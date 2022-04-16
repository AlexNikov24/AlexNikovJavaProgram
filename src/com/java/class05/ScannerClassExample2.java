package com.java.class05;

import java.util.Scanner;

public class ScannerClassExample2 {
    // Scanner Class - To get user input in program (from keyboard)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt(), num2 = sc.nextInt();


        if (num1 > num2) {
            System.out.println(num1 + "is grater");
        }else{
            if(num2 > num1);
            System.out.println(num2 + "is grater");
        }if (num1 == num2){
            System.out.println("Numbers are equal");
        }


    }
}




