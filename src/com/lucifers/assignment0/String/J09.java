//Program to Check if a string contains a substring.
package com.lucifers.assignment0.String;

import java.util.Scanner;

public class J09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = scanner.nextLine();
        str = str.trim();
        System.out.print("Enter the Sub String : ");
        String subString = scanner.next();
        StringBuilder stringBuilder = new StringBuilder();
        String tempString;

        try {
            for (int i = 0; i < str.length(); i++) {
                stringBuilder.append(str.charAt(i));

                if ((int) str.charAt(i + 1) == 32 || (int) str.charAt(i + 1) == 46 || (int) str.charAt(i + 1) == 63) {
                    tempString = stringBuilder.toString();

                    if (subString.equals(tempString)) {
                        System.out.print("String \"" + str + "\" contains Sub String \"" + subString + "\".");
                        System.exit(0);
                    } else {
                        stringBuilder.delete(0, stringBuilder.length());
                        i++;
                    }
                }
            }
        } catch (StringIndexOutOfBoundsException b) {
            if(true)
                System.out.print("String \"" + str + "\" does not contain Sub String \"" + subString + "\".\n");
        }

    }
}

