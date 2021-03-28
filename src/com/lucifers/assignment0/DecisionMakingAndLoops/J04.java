//Program to Reverse a Number.
package com.lucifers.assignment0.DecisionMakingAndLoops;

import java.util.Scanner;

public class J04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int number = scanner.nextInt();
        String str = String.valueOf(number);
        StringBuffer reverseString = new StringBuffer(str);
        str = String.valueOf(reverseString.reverse());
        number = Integer.parseInt(str);
        System.out.print("Reverse Number is " + number + ".");
    }
}
