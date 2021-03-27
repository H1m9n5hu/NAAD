//Program to Concatenate Two Arrays.
package com.lucifers.assignment0.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class J02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of first Array : ");
        int sizeOfFirstArray1 = scanner.nextInt();
        int[] array1 = new int[sizeOfFirstArray1];
        System.out.print("Enter the elements of first Array : ");

        for ( int i = 0; i < sizeOfFirstArray1; i++ )
            array1[i] = scanner.nextInt();
        System.out.println("First Array is " + Arrays.toString(array1));

        System.out.print("Enter the size of second Array : ");
        int sizeOfFirstArray2 = scanner.nextInt();
        int[] array2 = new int[sizeOfFirstArray2];
        System.out.print("Enter the elements of second Array : ");

        for ( int i = 0; i < sizeOfFirstArray2; i++ )
            array2[i] = scanner.nextInt();
        System.out.println("Second Array is " + Arrays.toString(array2));

        int[] array = new int[sizeOfFirstArray1+sizeOfFirstArray2];
        System.arraycopy(array1, 0, array, 0, sizeOfFirstArray1); // Here,Function 'System.arraycopy() is used to Concatenate two arrays.
        System.arraycopy(array2, 0, array, sizeOfFirstArray1, sizeOfFirstArray2);
        System.out.print("Resultant Array,After Merging first and second array is " + Arrays.toString(array));

    }
}
