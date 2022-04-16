package com.java.homework;

import java.util.Scanner;

public class Polindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();

        String reversed = "";
        for(int i = str.length()-1;i>=0; i--){
            reversed = reversed + str.substring(i,i+1);

        }
        if(reversed.equals(str)){
            System.out.println(str + " is palindrome");

        }else{
            System.out.println(str + " not a palindrome");
        }
    }
}
