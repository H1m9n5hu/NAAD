//Program to Display Fibonacci Series.
package com.lucifers.assignment0.DecisionMakingAndLoops;

import java.util.Scanner;

public class J06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms : ");
        int termsOfFibonacciSeries = scanner.nextInt();
        int firstTerm = 0;
        int secondTerm = 1;
        int Sum;

        System.out.print("First " + termsOfFibonacciSeries + " terms of Fibonacci series is : ");
        for(int i = 0; i < termsOfFibonacciSeries; i++) {
            Sum = firstTerm + secondTerm;
            System.out.print(firstTerm + " ");
            firstTerm = secondTerm;
            secondTerm = Sum;
        }

    }
}
