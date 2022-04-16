package com.java.class15;

//Take full Name from user and print initials of it
public class PrintInitial {
    public static void main(String[] args) {

        String fullName = "Aleksey Ivanov Nikov";

        String[] names = fullName.split(" ");

        String firstName = names[0];
        String midleName = names[1];
        String lastName = names[2];

        System.out.println(firstName.charAt(0) + "." + midleName.charAt(0) + "." + lastName.charAt(0) + ".");
    }
}