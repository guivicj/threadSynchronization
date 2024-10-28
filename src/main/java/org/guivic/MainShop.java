package org.guivic;

public class MainShop {
    public static void main(String[] args) {

        int stock = 10;

        Shop shop = new Shop(stock);

        Thread customer1 = new Thread(new Customer(shop, 3, 1));
        Thread customer2 = new Thread(new Customer(shop, 5, 2));
        Thread customer3 = new Thread(new Customer(shop, 10, 3));

        customer1.start();
        customer2.start();
        customer3.start();

        try {
            customer1.join();
            customer2.join();
            customer3.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}