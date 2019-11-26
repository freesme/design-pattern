package com.freesme.builder_pattern.product.drink;

import com.freesme.builder_pattern.Item;
import com.freesme.builder_pattern.pck.Boottle;
import com.freesme.builder_pattern.pck.Packing;

public abstract class ColdDrink implements Item {
    @Override
    public Packing packing(){
        return new Boottle();
    }
    @Override
    public abstract float price();
}
