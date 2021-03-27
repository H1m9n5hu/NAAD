//Program to Check Whether a Character is Alphabet or Not.
package com.lucifers.assignment0.DecisionMakingAndLoops;

import java.util.Scanner;

public class J01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Character : ");
        char character = scanner.next().charAt(0);
        if(65 <= (int)character && (int)character <= 90)
            System.out.print("The Character " + character + " is a Alphabet.");
        else if(97 <= (int)character && (int)character <= 122)
            System.out.print("The Character " + character + " is a Alphabet.");
        else
            System.out.print("The Character " + character + " is not a Alphabet.");
    }
}
