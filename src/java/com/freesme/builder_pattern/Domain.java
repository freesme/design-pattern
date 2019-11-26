package com.freesme.builder_pattern;

public class Domain {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal meal = mealBuilder.prepareNonVegMeal();
        meal.showItems();
        System.out.println(meal.getCost());

        MealBuilder mealBuilder2 = new MealBuilder();
        Meal meal2 = mealBuilder2.prepareVegMeal ();
        meal2.showItems();
        System.out.println(meal2.getCost());
    }
}
