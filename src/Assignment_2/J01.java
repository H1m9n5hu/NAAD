//Write a function List<Integer> getList(String s)where :
//
//        String s consists of integers separated by ';'
//        Your task is to create & return a List which will contain all the integers present in string s.
//
//        Use String.split() function.
//
//        Example :
//
//        getList("1;2;3;4") = List<Integer> {1, 2, 3, 4}

package Assignment_2;

import java.util.*;

public class J01 {

    public static List<Integer> getList(String S) {
        String[] str = S.split(";");
        List<Integer> integerList = new ArrayList<>();
        for (String s : str) integerList.add(Integer.parseInt(s));
        return integerList;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the String consists of integers separated by ';' : ");
        String str = scanner.next();
        System.out.print("Integer List is " + getList(str) + ".");
    }

}