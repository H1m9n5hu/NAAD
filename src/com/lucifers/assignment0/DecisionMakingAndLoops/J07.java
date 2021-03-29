//Program to Make a Simple Calculator Using switch...case.
package com.lucifers.assignment0.DecisionMakingAndLoops;

import java.util.Scanner;

public class J07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float number1;
        float number2;

        while(true) {
            System.out.print("Choices are\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Exit\n");
            System.out.print("Enter your choice : ");
            String choice = scanner.next();

            switch (choice) {
                case "Addition" -> {
                    System.out.print("Enter two numbers : ");
                    number1 = scanner.nextFloat();
                    number2 = scanner.nextFloat();
                    System.out.println("Sum of two numbers is " + (number1 + number2));
                }
                case "Subtraction" -> {
                    System.out.print("Enter two numbers : ");
                    number1 = scanner.nextFloat();
                    number2 = scanner.nextFloat();
                    System.out.println("Subtraction of two numbers is " + (number1 - number2));
                }
                case "Multiplication" -> {
                    System.out.print("Enter two numbers : ");
                    number1 = scanner.nextFloat();
                    number2 = scanner.nextFloat();
                    System.out.println("Multiplication of two numbers is " + (number1 * number2));
                }
                case "Division" -> {
                    System.out.print("Enter two numbers : ");
                    number1 = scanner.nextFloat();
                    number2 = scanner.nextFloat();
                    System.out.println("Quotient of two numbers is " + (number1 / number2));
                }
                case "Exit" -> System.exit(0);
            }
        }
    }
}
