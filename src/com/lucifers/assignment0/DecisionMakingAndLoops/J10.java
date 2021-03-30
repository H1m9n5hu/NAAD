//Program To Create Pyramid Pattern.
package com.lucifers.assignment0.DecisionMakingAndLoops;

import java.util.Scanner;

public class J10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number of Rows in a Pyramid : ");
        int numberOfRows = scanner.nextInt();
        int increment = numberOfRows;
        int decrement = numberOfRows;

        for(int i = 0; i < numberOfRows; i++) {
            for(int j = 1; j <= increment; j++)
                if(j >= decrement)
                    System.out.print("*");
                else
                    System.out.print(" ");
            increment++;
            decrement--;
            System.out.print("\n");
        }
    }
}
