package com.freesme.command_pattern;

public class SellBtock implements Order {
    private Stock abcStock;

    public SellBtock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.sell();
    }
}
