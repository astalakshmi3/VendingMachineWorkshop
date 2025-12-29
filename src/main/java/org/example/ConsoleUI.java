package org.example;

import java.util.Scanner;
import java.util.List;

public class ConsoleUI {

    static void main() {

// Further implementation of the console UI can be added here
        IVendingMachine vm = new VendingMachineImpl();
        ((VendingMachineImpl) vm).addProduct(new Snack(1,"Chip", 20,5));// Initialize products
        ((VendingMachineImpl) vm).addProduct(new Beverage(2,"Coke", 10,5));
        ((VendingMachineImpl) vm).addProduct (new Candy(3,"Chocolate", 5,5));
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Vending Machine!");
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("Balance: " + vm.getBalance());
            System.out.println("1. View Products");
            System.out.println("2. Insert Coin");
            System.out.println("3. Buy Product");
            System.out.println("4. Return Change");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    List<Product> products = vm.getProducts();
                    System.out.println("Available Products:");
                    for (Product product : products) {
                        System.out.println(product.getDescription());
                    }
                    break;
                case 2:
                    System.out.print("Enter coin value to insert: ");
                    int coin = sc.nextInt();
                    vm.insertCoin(coin);
                    System.out.println("Current Balance: " + vm.getBalance());
                    break;
                case 3:
                    System.out.print("Enter Product ID to buy: ");
                    int productId = sc.nextInt();
                    Product purchasedProduct = vm.purchaseProduct(productId);
                    if (purchasedProduct != null) {
                        System.out.println("Purchased: " + purchasedProduct.getDescription());
                    }
                    System.out.println("Current Balance: " + vm.getBalance());
                    break;
                case 4:
                    int change = vm.returnChange();
                    System.out.println("Returned Change: " + change);
                    break;
                case 5:
                    System.out.println("Thank you for using the Vending Machine. Goodbye!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}

