package com.freesme.abstract_factory_pattern.shapepkg;


public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method");
    }
}
