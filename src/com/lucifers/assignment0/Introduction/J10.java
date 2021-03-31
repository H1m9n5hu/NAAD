//Program to Round a Number to n Decimal Places.
package com.lucifers.assignment0.Introduction;

import java.util.Scanner;

public class J10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the floating-point Number : ");
        double number = scanner.nextDouble();
        System.out.format("%.2f",number);
    }
}
