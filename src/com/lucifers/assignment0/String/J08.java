//Program to Differentiate String == operator and equals() method.
package com.lucifers.assignment0.String;

public class J08 {
    public static void main(String[] args) {
        String firstString = new String("Himanshu");
        String secondString = new String("Himanshu");
        boolean result = (firstString == secondString); // Here, == operator is used to check equality of objects.
        System.out.print("Result with \"==\" operator is : " + result + "\n");
        result = firstString.equals(secondString); // Here, equals method is used to check equality of contents of both Strings.
        System.out.print("Result with  \"equals\" operator is : " + result);
    }
}
