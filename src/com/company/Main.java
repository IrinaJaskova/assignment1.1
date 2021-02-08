package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter first number");
        short a = input.nextShort();
        Scanner input2 = new Scanner(System.in);
        System.out.println("enter second number");
        short b = input2.nextShort();


        if (a > b) {
            System.out.println("largest number " + a);
            System.out.println("smallest number " + b);
        } else {
            System.out.println("largest number " + b);
            System.out.println("smallest number " + a);


        }
        if (a == b) {
            System.out.println("numbers " + a + " and " + b + " are equal ");
        } else {
            System.out.println("numbers " + a + " and " + b + " are not equal ");
        }
        if (a % 2 != 0 || b % 2 != 0) {
            if (a % 2 != 0 && b % 2 == 0) {
                System.out.println("number " + a + " is odd");
            }
            if (a % 2 == 0 && b % 2 != 0) {
                System.out.println("number " + b + " is odd");
            }
            if (a % 2 != 0 && b % 2 != 0) {
                System.out.println("numbers " + a + " and " + b + " are odd");
            }

        } else {
            System.out.println("numbers " + a + " and " + b + " are even");
        }

        if (a < 0 || b < 0) {
            if (a < 0 && b > 0) {
                System.out.println("number " + a + " is negative");
            }
            if (a > 0 && b < 0) {
                System.out.println("number " + b + " is negative");
            }
            if (a < 0 && b < 0) {
                System.out.println("numbers " + a + " and " + b + " are negative");
            }

        } else {
            System.out.println("numbers " + a + " and " + b + " are positive");
        }

        if (a < 100 || b < 100) {
            if (a < 100 && b > 100) {
                System.out.println("number " + a + " is smaller than 100");
            }
            if (a > 100 && b < 100) {
                System.out.println("number " + b + " is smaller than 100");
            }
            if (a < 100 && b < 100) {
                System.out.println("numbers " + a + " and " + b + " are is smaller than 100");
            }

        } else {
            System.out.println("numbers " + a + " and " + b + " are is bigger than 100");
        }


    }
}

