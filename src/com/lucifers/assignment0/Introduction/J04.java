//Program to Swap Two Numbers
package com.lucifers.assignment0.Introduction;

import java.util.Scanner;

public class J04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of x : ");
        int x = scanner.nextInt();
        System.out.print("Enter the value of y : ");
        int y = scanner.nextInt();
        System.out.println("Before swapping\nThe value of x is " + x + " and The value of y is " + y + ".");
//        x = x + y;
//        y = x - y;
//        x = x - y;
        x = x^y;
        y = x^y;
        x = x^y;
        System.out.print("After swapping\nThe value of x is " + x + " and The value of y is " + y + ".");

    }
}
