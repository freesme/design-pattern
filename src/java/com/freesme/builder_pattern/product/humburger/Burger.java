package com.freesme.builder_pattern.product.humburger;

import com.freesme.builder_pattern.Item;
import com.freesme.builder_pattern.pck.Packing;
import com.freesme.builder_pattern.pck.Wrapper;

public abstract class Burger implements Item {
    @Override
    public Packing packing(){
        return new Wrapper();
    }
    public abstract float price();
}
