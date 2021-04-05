//Write a function HashMap<Integer, Integer> getOccurrencesHashMap(String s)where :
//
//        String s consists of integers separated by ';'
//        Your task is to create & return a HashMap<Integer, Integer> where :
//
//        Entry.Key represent an integer present in string s
//        Entry.Value represent the number of occurrences of that integer in string s
//        Example :
//
//        getOccurrencesHashMap("1;2;2;2;3;1") = HashMap<Integer, Integer> {1:2, 2:3, 3:1} because 1 occurs 2 times, 2 occurs 3 times and 3 occurs 1 time.

package Assignment_2;

import java.util.*;

public class J02 {

    public static HashMap<Integer,Integer> getOccurrencesHashMap(String S) {
        String[] str = S.split(";");
        List<Integer> integerList = new ArrayList<>();
        for(String s : str) integerList.add(Integer.parseInt(s));

        HashMap<Integer,Integer> hashMap = new HashMap<>();
        Set<Integer> integerSet = new HashSet<>(integerList);
        for (Integer i : integerSet) hashMap.put(i,Collections.frequency(integerList, i));

        return hashMap;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the String consists of integers separated by ';' : ");
        String str = scanner.next();
        System.out.print("HashMap is " + getOccurrencesHashMap(str));
    }

}
