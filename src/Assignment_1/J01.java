//Write a function int totalWeight(String s, int[] weights)where :
//
//        String s consists characters (A-E).
//        int[] weights consists weights of characters A-E in the order A-E.
//        Your task is to return the total weight of string s according to weights given.

package Assignment_1;

import java.util.Scanner;

public class J01 {
    public static int totalWeight(String S, int[] weights) {
        int Sum = 0;
        int j = 0;
        int index = 0;
        char character;
        for (int i = 65;i < 70; i++) {
            character = (char)(i);
            for(int k = 0; k < S.length(); k++) {
                if(character==S.charAt(k))
                    j++;
            }
            Sum += j*weights[index];
            index++;
            j = 0;
        }
        return Sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the String which have only Alphabets from A to E : ");
        String str = scanner.next();
        System.out.print("Enter the Weight of Character A, B, C, D and E : ");
        int[] weights = new int[5];
        for(int i = 0; i < 5; i++)
            weights[i] = scanner.nextInt();
//        J01 array = new J01();
        System.out.print("The total weight of string S according to weights of characters is " + totalWeight(str,weights) + ".");
    }
}
