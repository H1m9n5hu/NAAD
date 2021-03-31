//Program to Sort Elements in Lexicographical Order (Dictionary Order).

package com.lucifers.assignment0.DecisionMakingAndLoops;

import java.util.Scanner;

public class J09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Size of Array : ");
        int sizeOfArray = scanner.nextInt();
        System.out.print("Enter the Elements of String Array : ");
        String[] wordsInArray = new String[sizeOfArray];

        for(int i = 0; i < sizeOfArray; i++)
            wordsInArray[i] = scanner.nextLine();

        for (int i = 0; i < sizeOfArray; i++) {
            for (int j = i + 1; j < sizeOfArray; j++) {
                if (wordsInArray[i].compareTo(wordsInArray[j]) > 0) {
                    String tempWord = wordsInArray[i];
                    wordsInArray[i] = wordsInArray[j];
                    wordsInArray[j] = tempWord;
                }
            }
        }
        System.out.println("In lexicographical order:");
        for (int i = 0; i < sizeOfArray; i++) {
            System.out.println(wordsInArray[i]);
        }
    }
}
