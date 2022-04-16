package com.java.homework;

import java.util.Scanner;

public class HmClass7Q3 {
    // Write a program to take username and password from user and print appropriate message
    // based on below conditions
    //1. If username correct and password correct ---> Login successful
    //2. If username correct and password incorrect --> Invalid password
    //3. If username incorrect and password correct --> Invalid username
    //2. If username incorrect and password incorrect --> Login unsuccessful

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String username = sc.nextLine(), password = sc.nextLine();
        String expUsername = "Devx", expPassword = "Spring2022";

        if (username == expUsername && password == expPassword) {
            System.out.println("Login Successful");
        } else if (username != expUsername && password != expPassword) {
            System.out.println("Login Unsuccessful");
        } else if (username != expUsername && password == expPassword) {
            System.out.println("Invalid username");
        } else if (username == expUsername && password != expPassword) {
            System.out.println("Invalid password");
        }
    }

}