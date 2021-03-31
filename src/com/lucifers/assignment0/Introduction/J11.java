//Program to Check if a String is Empty.
package com.lucifers.assignment0.Introduction;

import java.util.Scanner;

public class J11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str1 = scanner.nextLine();

        for (int i = 0; i < str1.length(); i++) {
            if ((int) str1.charAt(i) == 32) {
                if (str1.length() - 1 == i)
                    System.out.print("String \"" + str1 + "\" is a Empty String.");
            }
            else {
                System.out.print("String \"" + str1 + "\" is not a Empty String.");
                System.exit(0);
            }
        }
    }
}
