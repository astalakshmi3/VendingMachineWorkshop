package org.example;
public abstract class Product {
    private final int id;
    private final String name;
    private final int price;
    private  final int quantity;

    // Constructor for Product
    public Product(int id, String name, int price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    // Getters for the fields
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
    // Abstract method to get product description
    public String getDescription() {
        return "ID: " + id + ", Name: " + name + ", Price: " + price + ", Quantity: " + quantity;
    }

}
// Subclass for Snack
class Snack extends Product {
    // String flavor;
    public Snack(int id, String name, int price, int quantity) {
        super(id, name, price, quantity);
    }
    // Override method to get snack description
    @Override
    public String getDescription() {
        //return getName() + " (Snack) - Crispy and delicious!";
        return super.getDescription() + " (Snack) - Crispy and delicious!";
    }
}
// Subclass for Beverage
class Beverage extends Product {
    //  String size;
    public Beverage(int id, String name, int price, int quantity) {
        super(id, name, price, quantity);
    }

    // Override method to get beverage description
    @Override
    public String getDescription() {
        //return getName() + " (Beverage) - Refreshing and energizing!";
        return super.getDescription() + " (Beverage) - Refreshing and energizing!";
    }
// Subclass for Candy
}
class Candy extends Product {
    // String type;
    public Candy(int id, String name, int price, int quantity) {
        super(id, name, price, quantity);
    }
    // Override method to get fruit description
    @Override
    public String getDescription() {
        //return getName() + " (Candy) - Sweet and delightful!";
        return super.getDescription() + " (Candy) - Sweet and delightful!";
    }
}



