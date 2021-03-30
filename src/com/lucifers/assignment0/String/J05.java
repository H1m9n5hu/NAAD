//Program to Create random strings.
package com.lucifers.assignment0.String;

import java.util.Random;
import java.util.Scanner;

public class J05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Alphabets in the String which is used in the Random String : ");
        String alphabetsForRandomString = scanner.next();
        System.out.print("Enter the length of Random String : ");
        int lengthOfRandomString = scanner.nextInt();
        Random randomVariable = new Random();
        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 1; i <= lengthOfRandomString; i++) {
            int randomIndex = randomVariable.nextInt(alphabetsForRandomString.length());
            char characterOfRandomIndex = alphabetsForRandomString.charAt(randomIndex);
            stringBuilder.append(characterOfRandomIndex);
        }

        System.out.print("Random String is " + stringBuilder + ".");
    }
}
