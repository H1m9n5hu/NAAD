//Program to convert string type variables into int.
package com.lucifers.assignment0.TypeConversion;

import java.util.Scanner;

public class J01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Integer in the form of String Data Type : ");
        String str = scanner.next();
        int integer = Integer.parseInt(str);
        System.out.print("The value of 'integer' variable in the form of int Data Type is " + integer + ".");
    }
}
