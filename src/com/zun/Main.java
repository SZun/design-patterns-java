package com.zun;

public class Main {

    public static void main(String[] args) {
        Director director = new Director();

        MealBuilder vegMealBuilder = new VegMeal();
        MealBuilder nonVegMeal = new NonVegMeal();

        director.construct(vegMealBuilder);
        Meal meal = vegMealBuilder.getMeal();
        meal.show();
        System.out.println("Total Price:" + meal.getCost());

        nonVegMeal.getMeal();
        meal.show();
        System.out.println("Total Price:" + meal.getCost());
    }
}
