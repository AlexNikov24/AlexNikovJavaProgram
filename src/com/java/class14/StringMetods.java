package com.java.class14;

import java.util.Arrays;
import java.util.Locale;

public class StringMetods {
    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "hello World";
        String str3 = "Hello world! Welcome to Devx !";
        //1.We want to check equality of two String
        System.out.println(str1.equals(str2));

       // 2.We want to check equality of two String ignoring case
        System.out.println(str1.equalsIgnoreCase(str2));

        //3.We want to check if one string contain another string
        String str3LowerCase = str3.toLowerCase();
                String str2LowerCase = str2.toLowerCase();
        System.out.println(str3.contains(str2));

        //4.Changing the case of the string
        System.out.println(str3.toLowerCase());
        System.out.println(str3.toUpperCase());

        //5.Index of Character
        System.out.println(str1.indexOf('W'));


        //6.Find character at index
        System.out.println(str1.charAt(0));

        //Length of String

        System.out.println(str1.length());
        System.out.println(str3.length());

        //8.Length of String
        str1 = "            ";
        str3 = "";
        System.out.println(str1.isEmpty());
        System.out.println(str3.isEmpty());
        //9.Replace  & ReplaceAll
        str1 = "Welcome User";
        //str3 = "Devx";
        System.out.println("9. Replace: "+str1.replace(str1,str3));
        //10.Format
        str1 = "Welcome %s";
        System.out.println("10.Format: "+String.format((str1),"Chirag","Ebay"));

//11 Split
        str1 = "Hello future SDET's";
        String[] words = str1.split(" ");
        System.out.println(words[0]);
        System.out.println(words[1]);
        System.out.println(words[2]);


    }
    }

