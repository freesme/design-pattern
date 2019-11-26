package com.freesme.abstract_factory_pattern.colorpkg;

public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}