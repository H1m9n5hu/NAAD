//Program to Check if two strings are anagram.
package com.lucifers.assignment0.String;

import java.util.Arrays;
import java.util.Scanner;

public class J04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first String : ");
        String firstString = scanner.next();
        firstString = firstString.toUpperCase();
        System.out.print("Enter the second String : ");
        String secondString = scanner.next();
        secondString = secondString.toUpperCase();
        char[] characterArrayOfFirstString = new char[firstString.length()];
        char[] characterArrayOfSecondString = new char[secondString.length()];

        if(firstString.length() == secondString.length()) {

            for(int i = 0; i < firstString.length(); i++) {
                characterArrayOfFirstString[i] = firstString.charAt(i);
            }

            Arrays.sort(characterArrayOfFirstString);

            for(int i = 0; i < secondString.length(); i++) {
                characterArrayOfSecondString[i] = secondString.charAt(i);
            }

            Arrays.sort(characterArrayOfSecondString);

            if(Arrays.equals(characterArrayOfFirstString,characterArrayOfSecondString))
                System.out.print("Both Strings are Anagram Strings.");
            else
                System.out.println("Both Strings are not Anagram Strings.");
        }
        else
            System.out.print("Both Strings are not Anagram Strings.");
    }
}
