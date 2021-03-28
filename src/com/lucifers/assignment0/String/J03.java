//Program to Check if a String is Numeric.
package com.lucifers.assignment0.String;

import java.util.Scanner;

public class J03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = scanner.next();
        boolean condition = true;

        try {
            double number = Double.parseDouble(str);
        } catch (NumberFormatException exception) {
            condition = false;
        }

        if(condition)
            System.out.println("String '" + str + "' is Numeric.");
        else
            System.out.println("String '" + str + "' is not Numeric.");
    }
}
