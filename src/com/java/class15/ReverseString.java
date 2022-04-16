package com.java.class15;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println("Enter any string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = "";
        for (int i=str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        System.out.println("Reversed word: "+ result);
    }
}
