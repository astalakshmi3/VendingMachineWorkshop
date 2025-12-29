package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VendingMachineImplTest {

    private VendingMachineImpl vm;

    @BeforeEach
    void setUp() {
        vm = new VendingMachineImpl();
        vm.addProduct(new Snack(1, "Chip", 20, 5));
        vm.addProduct(new Beverage(2, "Coke", 10, 5));
        vm.addProduct(new Candy(3, "Chocolate", 5, 5));
    }

    @Test
    void insertValidCoin_shouldIncreaseBalance() {
        vm.insertCoin(10);
        assertEquals(10, vm.getBalance());
    }

    @Test
    void insertInvalidCoin_shouldNotIncreaseBalance() {
        vm.insertCoin(3);
        assertEquals(0, vm.getBalance());
    }

    @Test
    void purchaseProduct_successfulPurchase() {
        vm.insertCoin(20);
        Product product = vm.purchaseProduct(1);

        assertNotNull(product);
        assertEquals("Chip", product.getName());
        assertEquals(0, vm.getBalance());
        assertEquals(4, product.getQuantity()); // quantity reduced
    }

    @Test
    void purchaseProduct_insufficientBalance() {
        vm.insertCoin(5);
        Product product = vm.purchaseProduct(1);

        assertNull(product);
        assertEquals(5, vm.getBalance());
    }

    @Test
    void returnChange_shouldResetBalance() {
        vm.insertCoin(50);
        int change = vm.returnChange();

        assertEquals(50, change);
        assertEquals(0, vm.getBalance());
    }

    @Test
    void getProducts_shouldReturnAllProducts() {
        assertEquals(3, vm.getProducts().size());
    }
}

