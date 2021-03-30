//Program to Capitalize the first character of each word in a String.
package com.lucifers.assignment0.String;

import java.util.Scanner;

public class J06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i < str.length(); i++) {

            if(i == 0 ) {
                stringBuilder.append(str.toUpperCase().charAt(0));
                i++;
            }

            if ((int) str.charAt(i) == 32) {
                stringBuilder.append(str.charAt(i));
                stringBuilder.append(str.toUpperCase().charAt(i + 1));
                i++;
            }
            else
                stringBuilder.append(str.charAt(i));

        }

        System.out.print("String is : " + stringBuilder);
    }
}
