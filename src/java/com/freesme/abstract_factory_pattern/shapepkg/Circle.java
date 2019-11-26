package com.freesme.abstract_factory_pattern.shapepkg;


public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
