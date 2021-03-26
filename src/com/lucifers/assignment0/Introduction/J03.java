//Program to Compute Quotient and Remainder
package com.lucifers.assignment0.Introduction;

import java.util.Scanner;

public class J03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number as a Divident : ");
        int divident = scanner.nextInt();
        System.out.print("Enter a Number as a Divisor : ");
        int divisor = scanner.nextInt();
        System.out.print("Quotient and Remainder are " + (float)divident/divisor + " and " + divident%divisor + " of Divident "+ divident + " and Divisor " + divisor + ".");
    }
}
