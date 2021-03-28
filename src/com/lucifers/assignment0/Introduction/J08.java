//Program to Remove All Whitespaces from a String.
package com.lucifers.assignment0.Introduction;

import java.util.Scanner;

public class J08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = scanner.nextLine();
        System.out.print("String after removing the whitespaces is '" + str.replaceAll(" ","") + "'.");
    }
}
