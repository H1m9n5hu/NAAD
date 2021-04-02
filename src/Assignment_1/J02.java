//Write a function String modify(String s, String replacements)where :
//
//        String s consists of digits (0-9).
//        String replacements consists pairs of < int, char >.
//        Your task is to form a new string such that each digit in s is replaced by its corresponding character as given in replacements string.

package Assignment_1;

import java.util.Scanner;

public class J02 {
    public static String modify(String S,String replacements) {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < S.length(); i++) {
            for(int j = 0; j < replacements.length(); j++) {
                if(S.charAt(i) == replacements.charAt(j)) {
                    stringBuilder.append(replacements.charAt(j+1));
                }
            }
        }
        String str = stringBuilder.toString();
        return str;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the String which have Digits from 0 to 9 : ");
        String str = scanner.next();
        System.out.print("Enter the String which have pairs of < int, char > : ");
        String pairs = scanner.next();
        System.out.print("New String is \"" + modify(str,pairs) + "\".");
    }
}
