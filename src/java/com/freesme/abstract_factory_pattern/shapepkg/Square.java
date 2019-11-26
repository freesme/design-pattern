package com.freesme.abstract_factory_pattern.shapepkg;

public class Square implements Shape {
   @Override
   public void draw() {
      System.out.println("Inside Square::draw() method.");
   }
}