//Program to Convert String to Date.
package com.lucifers.assignment0.String;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class J01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Date in the format of 'yyyy-MM-dd' as a String : ");
        String str = scanner.next();
        LocalDate date = LocalDate.parse(str, DateTimeFormatter.ISO_DATE);
        System.out.print("Date is " + date + ".");
    }
}
