package org.example.foodDeliverySys.version1.filters;

import org.example.foodDeliverySys.version1.data.FoodItem;
import org.example.foodDeliverySys.version1.data.Restaurant;
import org.example.foodDeliverySys.version1.data.StarRating;

public class StarRatingFilter implements FoodItemFilter, RestaurantFilter{
    private final StarRating starRating;

    public StarRatingFilter(StarRating starRating) {
        this.starRating = starRating;
    }

    @Override
    public boolean filter(FoodItem foodItem) {
        return foodItem.getStarRating().getVal()>=starRating.getVal();
    }

    @Override
    public boolean filter(Restaurant restaurant) {
        return restaurant.getRating().getVal()>=this.starRating.getVal();
    }
}
