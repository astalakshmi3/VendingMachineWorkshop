package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class VendingMachineImpl implements IVendingMachine {

    private int balance;
    private final List<Product> products = new ArrayList<Product>();
    private final Map<Integer, Integer> validCoins= (Map<Integer, Integer>)Map.of(1, 2, 5, 10, 20, 50);


    // You can add constructors and methods to initialize and manage the vending machine
    @Override
    public void insertCoin(int coin) {
        if (validCoins.containsValue(coin)) {
            balance += coin;
        } else {
            System.out.println("Invalid coin inserted.");
        }

    }

    @Override
    public int getBalance() {

        return balance;
    }

    @Override
    public Product purchaseProduct(int productId) {
        if (products != null) {
            for (Product product : products) {
                if (product.getId() == productId) {
                    if (balance >= product.getPrice()) {
                        balance -= product.getPrice();
                        products.remove(product);
                        return product;
                    } else {
                        System.out.println("Insufficient balance.");
                        return null;
                    }
                }
            }
            System.out.println("Product not found.");
        }
        return null;
    }

    @Override
    public int returnChange() {
        if (balance > 0) {
            int change = balance;
            balance = 0;
            return change;
        }
        return 0;
    }

    @Override
    public java.util.List<Product> getProducts() {
        if (products != null) {
            return products;
        } else {
            return null;
        }
    }

    /* public void addProducts(Snack snack) {
         products.add(snack);
     }

     public void addProducts(Beverage beverage) {
         products.add(beverage);
     }

     public void addProducts(List<Product> products) {
         this.products.addAll(products);
     }*/
    public void addProduct(Product product) {
        products.add(product);
    }
}
