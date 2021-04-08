package Assignment_3.J02;

public class GroceryItem {
    String name;
    int pricePerKg;
    GroceryItem(String name, int pricePerKg) {
        this.name = name;
        this.pricePerKg = pricePerKg;
    }

    @Override
    public String toString() {
        return String.format("Name : %s and Price : %d",name,pricePerKg);
    }
}
