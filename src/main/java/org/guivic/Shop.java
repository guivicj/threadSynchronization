package org.guivic;

public class Shop {
    private int stock;

    public Shop(int stock) {
        this.stock = stock;
    }

    public synchronized boolean buyProduct(int amount, int customer) {
        boolean stockOK;
        if (amount <= stock) {
            stock -= amount;
            System.out.println("Customer " + customer + " bought " + amount);
            System.out.println("stock = " + stock);
            stockOK = true;
        } else {
            System.out.println("Customer " + customer + " tried to buy " + amount + " but there's not enough stock");
            stockOK = false;
        }
        System.out.println("---");
        return stockOK;
    }

    public int getStock() {
        return stock;
    }
}
