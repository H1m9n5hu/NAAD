/*
In this task you have to develop a game in which user has to guess an incomplete word (consonants omitted) shown. The game should work as follows :

        To start the game, call startGame(String s) and pass the word to be guessed.
        Write a function startGame(String s) in which,
        replace consonants in s with '_'
        chances = (noOfConsonantsInS + 3)
        while(chances-- != 0),
        print s and take a character as input
        if character exists in s, update s
        break if entire word is guessed (User WINS!)
        User loses if word is not guessed within the chances given.

        Example : startGame("SHAMPOO")

        SubTask3_SS.png

        and so on...

        You need not go as it is by the steps mentioned. It has been provided just for the sake of explanation. You are free to use your imagination at its best and build the game!
*/

package Assignment_2;

import java.util.Scanner;

public class J03 {

    public static boolean startGame(String S) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder1 = new StringBuilder(S);

        for(int i = 0; i < S.length(); i++) {
            if((int)S.charAt(i) != 65 && (int)S.charAt(i) != 69 && (int)S.charAt(i) != 73 && (int)S.charAt(i) != 79 && (int)S.charAt(i) != 85) {
                count++;
                stringBuilder.append("_");
            }
            else
                stringBuilder.append(S.charAt(i));
        }

        System.out.print("\n" + stringBuilder1 + "\n");

        int chances = count + 3;
        int j = 0;
        String alphabet;
        boolean condition = false;

        while(chances--!=0) {

            System.out.print("\nWord : " + stringBuilder + "\n");
            System.out.print("Chances : " + (chances + 1) + "\n");
            System.out.print("Guess a Consonant Alphabet except the Vowels : ");
            alphabet = scanner.next().toUpperCase();

            for(int i = 0; i < S.length(); i++) {
                if(alphabet.charAt(0) == S.charAt(i)) {
                    j++;
                    stringBuilder.setCharAt(i,alphabet.charAt(0));
                }
            }

            if(j > 0) {
                System.out.print("Guess Alphabet " + alphabet + " found " + j + " time(s)!\n");
            }
            else
                System.out.print("Sorry!\nGuess Alphabet not found!\n");

            j = 0;

            if(stringBuilder.toString().equals(stringBuilder1.toString())) {
                condition = true;
                break;
            }

        }

        return condition;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Word as a String : ");
        String str = scanner.next().toUpperCase();
        if(startGame(str))
            System.out.print("\nCongratulations\nYou win!\n");
        else
            System.out.print("\nSorry\nyou lose!\n");
    }

}
