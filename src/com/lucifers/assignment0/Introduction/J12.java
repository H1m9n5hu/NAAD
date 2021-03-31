//Program to Find all Roots of a Quadratic Equation.

package com.lucifers.assignment0.Introduction;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class J12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("When Quadratic Equation is ax^2 +/- bx +/- c.\nThen Enter the Value of a : ");
        int a = scanner.nextInt();
        System.out.print("Enter the Value of b : ");
        int b = scanner.nextInt();
        System.out.print("Enter the Value of c : ");
        int c = scanner.nextInt();
        int determinant = b*b - 4*a*c;
        float root1;
        float root2;

        if(determinant >= 0) {
            root1 = -b + (float)sqrt(determinant);
            root1 = root1/2*a;
            root2 = -b - (float)sqrt(determinant);
            root2 = root2/2*a;
            System.out.print("First root is " + root1 + ".\nAnd Second root is " + root2 + ".");
        }
        else {
            determinant = -determinant;
            System.out.print("First root is\n" + (-b/2*a) + " + " + (float)sqrt(determinant)/2*a + "*i\nAnd Second root is\n" + (-b/2*a) + " - " + (float)sqrt(determinant)/2*a + "*i");
        }
    }
}
