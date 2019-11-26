package com.freesme.builder_pattern.product.humburger;

public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "鸡肉汉堡";
    }

    @Override
    public float price() {
        return 32.0f;
    }
}
