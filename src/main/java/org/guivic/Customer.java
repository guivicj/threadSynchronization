package org.guivic;

public class Customer implements Runnable {

    private Shop shop;
    private int amount;
    private int idCustomer;

    public Customer(Shop shop, int amount, int idCustomer) {
        this.shop = shop;
        this.amount = amount;
        this.idCustomer = idCustomer;
    }

    @Override
    public void run() {
        shop.buyProduct(amount,idCustomer);
    }
}
