package com.freesme.builder_pattern;

import com.freesme.builder_pattern.pck.Packing;

public interface Item {
    String name();
    Packing packing();
    float price();
}
