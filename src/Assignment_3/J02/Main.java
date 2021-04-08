package Assignment_3.J02;

public class Main {
    public static void main(String[] args) {

        GroceryItem sugar = new GroceryItem("Sugar",20);
        GroceryItem jaggery = new GroceryItem("Jaggery",25);
        GroceryItem apple = new GroceryItem("Apple",5);
        GroceryItem mango = new GroceryItem("Mango",70);

        Cart cart = new Cart();
        cart.add(GroceryCartItem.createNew(sugar, "3kg 0g"))
                .add(GroceryCartItem.createNew(jaggery, "0kg 750g"))
                .add(GroceryCartItem.createNew(apple, "1kg 500g"))
                .add(GroceryCartItem.createNew(mango, "3kg 500g"));

        System.out.println(cart.toString());

    }

}
