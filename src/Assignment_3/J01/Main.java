/*
    Driver Code
        In the Main class,
        Create 3 products of your choice but give same name & price to 2 of the products
        Print the products
        Print equality of the 2 similar products using .equals()
        Create a new object of class SpecialProduct by calling the static method applyOffOnProduct and pass any product along with some offPercentage of your choice
        Print this specialProduct object
*/

package Assignment_3.J01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Name and Price of First Product : ");
        String nameOfFirstProduct = scanner.nextLine();
        int priceOfFirstProduct = scanner.nextInt();
        Product productFirst = new Product(nameOfFirstProduct,priceOfFirstProduct);
        System.out.print("Enter the Name and Price of Second Product : ");
        String nameOfSecondProduct = scanner.next();
        int priceOfSecondProduct = scanner.nextInt();
        Product productSecond = new Product(nameOfSecondProduct,priceOfSecondProduct);
        System.out.print("Enter the Name and Price of Third Product : ");
        String nameOfThirdProduct = scanner.next();
        int priceOfThirdProduct = scanner.nextInt();
        Product productThird = new Product(nameOfThirdProduct,priceOfThirdProduct);

        System.out.println("\n" + productFirst);
        System.out.println(productSecond);
        System.out.println(productThird);

        if(productFirst.equals(productSecond))
            System.out.println("\nProduct First and Product Second are Equal.");
        else
            System.out.println("\nProduct First and Product Second are not Equal.");
        System.out.print("\nEnter the PercentageOff : ");

        int percentageOff = scanner.nextInt();

        System.out.println(SpecialProduct.applyOffOnProduct(productFirst,percentageOff));

    }
}
