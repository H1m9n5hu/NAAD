//Write a function boolean isDirectlyProportional(int[] x, int[] y)where :
//
//        x & y are two inter-related mathematical variables
//        x.length = y.length
//        x[i] is related to y[i]
//        Your task is to return a boolean stating whether x & y are directly proportional to each other.

package Assignment_1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class J03 {

    public static boolean isDirectlyProportional(int[] x, int[] y) {
        boolean condition = false;
        Integer[] arrayOfX = new Integer[x.length];
        for(int i = 0; i < x.length; i++)
            arrayOfX[i] = x[i];
        Integer[] arrayOfy = new Integer[y.length];
        for(int i = 0; i < y.length; i++)
            arrayOfy[i] = y[i];
        Set<Integer> forX = new HashSet<>(Arrays.asList(arrayOfX));
        Set<Integer> forY = new HashSet<>(Arrays.asList(arrayOfy));

        if(forX.size() == 1 || forY.size() == 1)
            condition = false;
        else {
            for(int i = 1; i < x.length; i++) {
                if(x[i-1]<x[i]) {
                    if(y[i-1]<y[i]) {
                        if(x.length-1 == i)
                            condition = true;
                    }
                    else {
                        condition = false;
                        break;
                    }
                }
                else {
                    if (x[i - 1] == x[i]) {
                        if (y[i - 1] == y[i])
                            condition = true;
                    }
                    else {
                        condition = false;
                        break;
                    }
                }
            }
        }

        return condition;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Size of Both Array : ");
        int sizeOfBothArray = scanner.nextInt();
        System.out.print("Enter the Elements x Array : ");
        int[] x = new int[sizeOfBothArray];
        for(int i = 0; i < sizeOfBothArray; i++)
            x[i] = scanner.nextInt();
        System.out.print("Enter the Elements y Array : ");
        int[] y = new int[sizeOfBothArray];
        for(int i = 0; i < sizeOfBothArray; i++)
            y[i] = scanner.nextInt();
        if(isDirectlyProportional(x,y))
            System.out.print("x & y are directly proportional to each other.");
        else
            System.out.print("x & y are not directly proportional to each other.");
    }

}