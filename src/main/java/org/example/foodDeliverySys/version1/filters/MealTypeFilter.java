package org.example.foodDeliverySys.version1.filters;

import org.example.foodDeliverySys.version1.data.FoodItem;
import org.example.foodDeliverySys.version1.data.MealType;
import org.example.foodDeliverySys.version1.data.Restaurant;

public class MealTypeFilter implements FoodItemFilter, RestaurantFilter{
    private final MealType mealType;

    public MealTypeFilter(MealType mealType) {
        this.mealType = mealType;
    }

    @Override
    public boolean filter(FoodItem foodItem) {
        return foodItem.getMealType().equals(this.mealType);
    }

    @Override
    public boolean filter(Restaurant restaurant) {
        return restaurant.getMealType().equals(this.mealType);
    }
}
