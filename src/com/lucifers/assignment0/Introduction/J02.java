//Program to Find ASCII Value of a character
package com.lucifers.assignment0.Introduction;

import java.util.Scanner;

public class J02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Character : ");
        char character = scanner.next().charAt(0);
        System.out.print("ASCII value of " + character + " is " + (int) character);
    }
}
