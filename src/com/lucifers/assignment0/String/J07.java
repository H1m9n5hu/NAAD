//Program to Iterate through each characters of the string.
package com.lucifers.assignment0.String;

import java.util.Scanner;

public class J07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = scanner.nextLine();

        System.out.print("All characters in String \"" + "\" are\n");
        for(int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + ", ");
        }
    }
}
