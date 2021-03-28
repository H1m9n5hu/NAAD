//Program to Check Whether a Number is Palindrome or Not.
package com.lucifers.assignment0.DecisionMakingAndLoops;

import java.util.Scanner;

public class J05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int number = scanner.nextInt();
        String str = String.valueOf(number);
        StringBuffer reverseString = new StringBuffer(str);
        str = String.valueOf(reverseString.reverse());
        int reverseNumber = Integer.parseInt(str);
        if (number == reverseNumber)
            System.out.print("Number " + number + " is Palindrome.");
        else
            System.out.print("Number " + number + " is not Palindrome.");
    }
}

