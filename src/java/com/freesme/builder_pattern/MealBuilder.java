package com.freesme.builder_pattern;

import com.freesme.builder_pattern.product.drink.Coke;
import com.freesme.builder_pattern.product.humburger.ChickenBurger;
import com.freesme.builder_pattern.product.humburger.VegBurger;

public class MealBuilder {
 
   public Meal prepareVegMeal (){
      Meal meal = new Meal();
      meal.addItem(new VegBurger());
      meal.addItem(new Coke());
      return meal;
   }   
 
   public Meal prepareNonVegMeal (){
      Meal meal = new Meal();
      meal.addItem(new ChickenBurger());
      return meal;
   }
}