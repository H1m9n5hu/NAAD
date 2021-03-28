//Program to Compare Strings.
package com.lucifers.assignment0.String;

import java.util.Scanner;

public class J02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First String : ");
        String str1 = (scanner.next()).toUpperCase();
        System.out.print("Enter Second String : ");
        String str2 = (scanner.next()).toUpperCase();

        if(str1.equals(str2))
            System.out.print("Both Strings are Equal.");
        else
            System.out.print("Both Strings are not Equal.");
    }
}
