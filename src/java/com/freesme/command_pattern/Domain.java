package com.freesme.command_pattern;

public class Domain {
    public static void main(String[] args) {
        Stock abcStock = new Stock();
        BuyStock buyStock = new BuyStock(abcStock);
        SellBtock sellBtock = new SellBtock(abcStock);
        Broker broker = new Broker();
        broker.takeOrder(buyStock);
        broker.takeOrder(sellBtock);

        broker.placeOrder();
    }
}
