//Program to Count Number of Digits in an Integer.
package com.lucifers.assignment0.DecisionMakingAndLoops;

import java.util.Scanner;

public class J03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Integer : ");
        int integer = scanner.nextInt();
        int temp = integer;
        int count = 0;
        boolean condition = true;
        while(condition) {
            count++;
            integer = integer/10;
            if(integer == 0)
                condition = false;
        }
        System.out.print("Number of Digits in " + temp + " is " + count + ".");
    }
}
