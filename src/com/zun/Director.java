package com.zun;

public class Director {

   private MealBuilder mealBuilder;

    public void construct(MealBuilder builder) {
        mealBuilder = builder;
        mealBuilder.buildBurger();
        mealBuilder.buildDrink();
    }
}
