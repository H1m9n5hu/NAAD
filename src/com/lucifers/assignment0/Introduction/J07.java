//Program to Find the Largest Among Three Numbers.
package com.lucifers.assignment0.Introduction;

import java.util.Scanner;

public class J07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of x as a first Number : ");
        int x = scanner.nextInt();
        System.out.print("Enter the value of y as a second Number : ");
        int y = scanner.nextInt();
        System.out.print("Enter the value of z as a third Number : ");
        int z = scanner.nextInt();
        int greaterNumber = (x >= y ? x : y) >= z ? x >= y ? x : y : z;
        System.out.print("Largest Number Among Three Numbers is " + greaterNumber + ".");
    }
}
