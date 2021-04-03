//Your task is to throw custom exception named InvalidReplacementsException in Task 1.1's program when
//
//        replacements string is invalid
//
//        replacement for a digit in s is not given in replacements string
//
//        Example :
//
//        modify("12", "2R") is invalid as replacement for 1 is not given
//
//        modify("12", "12") is invalid as it does not match the format < int, char >
//
//        To check validity of replacement string, use Regular Expressions.

package Assignment_1;

import java.util.Scanner;

public class J04 {

    public static boolean customException(String S,String replacements) {
        boolean a = true;
        boolean b = false;

        for(int i = 0; i < replacements.length(); i++) {
            if(i%2 == 0) {
                if(48 <= (int)replacements.charAt(i) && (int)replacements.charAt(i) <= 57) {
                    a = true;
                    if(replacements.length()-1 == i) {
                        a = false;
                    }
                }
                else {
                    a = false;
                    break;
                }
            }
            else {
                if(65 <= (int)replacements.charAt(i) && replacements.charAt(i) <= 90 || 97 <= replacements.charAt(i) && replacements.charAt(i) <= 122) {
                    a = true;
                }
                else {
                    a = false;
                    break;
                }
            }
        }

        String digits = "0123456789";
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < digits.length(); i++) {
            for(int j = 0; j < S.length(); j++) {
                if((int)digits.charAt(i) == (int)S.charAt(j)) {
                    stringBuilder.append(digits.charAt(i));
                    break;
                }
            }
        }

        String remainingDigits = stringBuilder.toString();

        for(int i = 0; i < remainingDigits.length(); i++) {
            for (int j = 0; j < replacements.length(); j++) {
                if (remainingDigits.charAt(i) == replacements.charAt(j)) {
                    b = true;
                    break;
                }
                else {
                    if (replacements.length() - 1 == j) {
                        return false;
                    }
                }
            }
        }

        int k = 0;
        for(int i = 0; i < remainingDigits.length(); i++) {
            for(int j = 0; j < replacements.length(); j++) {
                if(remainingDigits.charAt(i) == replacements.charAt(j)) {
                    k++;
                    if(k>1)
                        return false;
                }
            }
            k = 0;
        }

        if (a == true && b == true)
            a = true;

        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the String which have Digits from 0 to 9 : ");
        String str = scanner.next();
        System.out.print("Enter the String which have pairs of < int, char > : ");
        String pairs = scanner.next();
        if(customException(str,pairs))
            System.out.print("Replacement String is valid.");
        else
            System.out.print("Error : InvalidReplacementsException.");
    }

}
