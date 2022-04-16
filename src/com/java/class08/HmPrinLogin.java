package com.java.class08;

import java.util.Scanner;

public class HmPrinLogin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
String username = "Alex24",password = "Nikov123";
        System.out.println("Please print your Login");
        String username1 = sc.nextLine();
        System.out.println("Please enter your password");
        String password1 = sc.nextLine();

        if(username.equals(username1) && password.equals(password1)){
            System.out.println("Login Successful");
        }else {
            System.out.println("Login Unsuccessful");
        }







    }
}
