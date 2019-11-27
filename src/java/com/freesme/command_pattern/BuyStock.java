package com.freesme.command_pattern;

public class BuyStock implements Order {

    private Stock abccstock;

    public BuyStock(Stock abccstock) {
        this.abccstock = abccstock;
    }

    @Override
    public void execute() {
        abccstock.buy();
    }
}
