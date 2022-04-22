package com.java.class17;

public class FindResultOfSeries1 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) {
                sum = sum - 1;
            } else {
                sum = sum + 1;
            }
        }
            System.out.println(sum);
        }
    }
