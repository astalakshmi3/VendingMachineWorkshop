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



