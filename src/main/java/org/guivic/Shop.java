package org.guivic;

public class Shop {
    private int stock = 10;

    public synchronized void buyProduct(int amount, int customer) {
        if (amount <= stock) {
            System.out.println("Customer " + customer + " bought " + amount);
            stock -= amount;
            System.out.println("stock = " + stock);
        } else {
            System.out.println("Customer " + customer + " tried to buy " + amount + " but there's not enough stock");
        }
        System.out.println("---");
    }

    public int getStock() {
        return stock;
    }
}
