package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a= 6;

        int sum = 0;

        for (int i = 1; i < 6; i++) {

            if (a % i == 0) {
                sum = sum + i;
            }
        }

        if (a == sum) {
            System.out.println(true);
        } else {
            System.out.println(false);
    }
}}
