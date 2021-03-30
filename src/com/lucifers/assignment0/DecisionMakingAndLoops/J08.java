//Program to Count the Number of Vowels and Consonants in a Sentence.
package com.lucifers.assignment0.DecisionMakingAndLoops;

import java.util.Scanner;

public class J08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = scanner.nextLine();
        str = str.toUpperCase();
        int numberOfVowels = 0;
        int numberOfConsonants = 0;

        for(int i = 0; i < str.length(); i++) {
            if ((char) 65 == str.charAt(i) || (char) 69 == str.charAt(i) || (char) 73 == str.charAt(i) || (char) 79 == str.charAt(i) || (char) 85 == str.charAt(i))
                numberOfVowels++;
            if((66 <= (int)str.charAt(i) && (int)str.charAt(i) <= 68) || (70 <= (int)str.charAt(i) && (int)str.charAt(i) <= 72) || (74 <= (int)str.charAt(i) && (int)str.charAt(i) <= 78) || (80 <= (int)str.charAt(i) && (int)str.charAt(i) <= 84) || (86 <= (int)str.charAt(i) && (int)str.charAt(i) <= 90))
                numberOfConsonants++;

        }

        System.out.println("Vowels are " + numberOfVowels);
        System.out.print("And Consonants are " + numberOfConsonants);
    }
}
