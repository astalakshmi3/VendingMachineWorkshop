package org.example;

// Subclass for Beverage
public class Beverage extends Product {
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
}
