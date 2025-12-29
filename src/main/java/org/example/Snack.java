package org.example;

// Subclass for Snack
public class Snack extends Product {
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
