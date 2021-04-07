/*
  Inheritance
    Define another class SpecialProduct extending Product class with following data members :
    regularPrice (int)
    percentageOff (int)
    Define a parameterized Constructor for class SpecialProduct passing name & price. Invoke super(name, price) in it.
    Override toString() for class SpecialProduct and return the required formatted string.
    Static Method
  Define a static method -
    SpecialProduct applyOffOnProduct(Product product, int percentageOff)
    in class SpecialProduct as follows :
    Calculate discountedPrice of product by applying percentageOff to product.price
    Create a new object of class SpecialProduct specialProduct, call its constructor and pass (product.name, discountedPrice) to it
    Set specialProduct.regularPrice = product.price
    Set specialProduct.percentageOff = percentageOff
    Return the object
*/

package Assignment_3.J01;

public class SpecialProduct extends Product {
    int regularPrice;
    int percentageOff;

    SpecialProduct(String name, int price) {
        super(name, price);
    }

    public static SpecialProduct applyOffOnProduct(Product product, int percentageOff) {

        int discountedPrice = product.price - product.price*percentageOff/100;
        SpecialProduct specialProduct = new SpecialProduct(product.name,discountedPrice);
        specialProduct.regularPrice = product.price;
        specialProduct.percentageOff = percentageOff;

        return specialProduct;
    }

    @Override
    public String toString() {
        return String.format("\nFor Product First\nProduct Name : %s @ Regular Price : %d @ PercentageOff : %d @ Discounted Price : %s",name,regularPrice,percentageOff,discountedPrice);
    }
}
