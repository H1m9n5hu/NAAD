//Program to Check Whether an Alphabet is Vowel or Consonant.
package com.lucifers.assignment0.Introduction;

import java.util.Scanner;

public class J06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Character : ");
        char ch = scanner.next().charAt(0);
        char[] vowel = {'A','E','I','O','U','a','i','e','o','u'};
        boolean result = false;
        for ( int i = 0; i < vowel.length; i++ ) {
            if ( ch == vowel[i] ) {
                result = true;
                break;
            }
        }
        if (result)
            System.out.print(ch + " is a Vowel Alphabet.");
        else
            System.out.print(ch + " is a Consonant Alphabet.");
    }
}
