//Program to convert int type variables to String.
package com.lucifers.assignment0.TypeConversion;

import java.util.Scanner;

public class J02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Integer : ");
        int integer = scanner.nextInt();
        String str = String.valueOf(integer);
        System.out.print("The value of 'str' variable in the form of String Data Type is " + str + ".");
    }
}
