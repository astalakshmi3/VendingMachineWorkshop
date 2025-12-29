package org.example;
// Subclass for Candy
public class Candy extends Product {
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
