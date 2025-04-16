package org.example.foodDeliverySys.version1.filters;

import org.example.foodDeliverySys.version1.data.CuisineType;
import org.example.foodDeliverySys.version1.data.FoodItem;
import org.example.foodDeliverySys.version1.data.Restaurant;

import java.util.List;

public class CuisinesTypeFilter implements FoodItemFilter, RestaurantFilter{
    private final List<CuisineType> cuisineTypes;

    public CuisinesTypeFilter(List<CuisineType> cuisines) {
        this.cuisineTypes = cuisines;
    }

    @Override
    public boolean filter(FoodItem foodItem) {
        return cuisineTypes.contains(foodItem.getCuisineType());
    }

    @Override
    public boolean filter(Restaurant restaurant) {
        List<CuisineType> cuisines = restaurant.getCuisineTypes();
        for(CuisineType cuisineType : cuisineTypes){
            if(cuisines.contains(cuisineType))
                return true;
        }
        return false;
    }
}
