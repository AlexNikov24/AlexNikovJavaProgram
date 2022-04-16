package com.java.class15;

public class FindEachComponentOfAddress {
    public static void main(String[] args) {


        String address = "510 Spruce Dr 3A Palatine IL 60074";

        String[] words = address.split(" ");
        System.out.println(words[0]);
        System.out.println(words[1]);
        System.out.println(words[2]);
        System.out.println(words[3]);
        System.out.println(words[4]);
        System.out.println(words[5]);
    }
}
