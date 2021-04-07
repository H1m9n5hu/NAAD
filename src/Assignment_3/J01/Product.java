/*
    Defining Class
        Define a class Product with the following data members :
        name (String)
        price (int)
        Info : Classes which are defined just for the sake of saving data are called Model Classes or POJO (Plain Old Java Object). Here class Product is an example. From now on, define every such model class in separate files. DO NOT define these classes within a class with the main() method!
        Defining Constructors
        Define an empty/default constructor for it
        Define a parameterized constructor passing name & price to it (Use Generator (Alt + Insert) & ‘this’ keyword)
        Overriding toString() method
        Override toString() and using String.format() return string in format "Name : %s @ Rs. %d"
        Tip : Google for String.format() method if you have confusion
        Overriding equals() method
        Learn about the equals() method of Object class. Observe its default behaviour.
        In Java, Strings are compared using .equals() method and not using ‘==’. We can also compare objects using .equals(). Observe the following example :

        Override the .equals() method of Product class for this required behaviour.
*/

package Assignment_3.J01;

public class Product {
    String name;
    int price;
    int discountedPrice;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
        discountedPrice = price;
    }

    @Override
    public String toString(){
        return String.format("Name : %s @ Rs. %d",this.name,this.price);
    }

    @Override
    public boolean equals(Object obj) {
        Product override = (Product) obj;

        if (!override.name.equals(this.name) || override.price != this.price)
            return false;

        return true;
    }
}
