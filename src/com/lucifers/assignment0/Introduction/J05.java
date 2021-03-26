//Program to Check Whether a Number is Even or Odd
package com.lucifers.assignment0.Introduction;

import java.util.Scanner;

public class J05 {
    public static void main(String[] args) {
//        Here,Scanner is a class which is used to take input from User and scanner is the instance of this class.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = scanner.nextInt(); // Here,We initialise a variable 'number' and we also used here nextInt() method of scanner instance.
        if ( number%2 == 0 ) // '%' This is a modulus operator which is used for calculating remainder of a number.
            System.out.print(number + " is a Even Number.");
        else
            System.out.print(number + " is a Odd Number.");
    }
}
