//Program to Calculate Average Using.
package com.lucifers.Assignment_0.Arrays;

import java.util.Scanner;

public class J01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Size of Array (Number of Elements) : ");
        int sizeOfArray = scanner.nextInt();
        int [] numbers = new int[sizeOfArray];
        System.out.print("Enter Numbers : ");

        for ( int i = 0; i < sizeOfArray; i++ )
            numbers[i] = scanner.nextInt();

        int Sum = 0;

        for ( int i = 0; i < sizeOfArray; i++ )
            Sum += numbers[i];

        System.out.print("Average value is " + (float)Sum/sizeOfArray);

    }
}
