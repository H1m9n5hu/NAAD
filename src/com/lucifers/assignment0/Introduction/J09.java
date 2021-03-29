//Program to Find the Frequency of Character in a String.
package com.lucifers.assignment0.Introduction;

import java.util.Scanner;

public class J09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = scanner.nextLine();
        System.out.print("Enter a character : ");
        char character = scanner.next().charAt(0);
        int j = 0;

        for(int i = 0; i < str.length(); i++)
            if (character == str.charAt(i))
                j++;

        System.out.print("The frequency of character '" + character + "' is " + j + ".");
    }
}
