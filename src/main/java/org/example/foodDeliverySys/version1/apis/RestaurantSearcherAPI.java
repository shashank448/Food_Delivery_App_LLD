package org.example.foodDeliverySys.version1.apis;

import org.example.foodDeliverySys.version1.data.CuisineType;
import org.example.foodDeliverySys.version1.data.MealType;
import org.example.foodDeliverySys.version1.data.Restaurant;
import org.example.foodDeliverySys.version1.data.StarRating;
import org.example.foodDeliverySys.version1.filters.CuisinesTypeFilter;
import org.example.foodDeliverySys.version1.filters.MealTypeFilter;
import org.example.foodDeliverySys.version1.filters.RestaurantFilter;
import org.example.foodDeliverySys.version1.filters.StarRatingFilter;
import org.example.foodDeliverySys.version1.searchers.RestaurantSearcher;

import java.util.ArrayList;
import java.util.List;

public class RestaurantSearcherAPI {
    public List<Restaurant> searchRestaurant(String restaurantName, MealType mealType, List<CuisineType> cuisineTypes, StarRating rating){
        // Validations
        List<RestaurantFilter> filters = new ArrayList<>();
        if(mealType!=null){
            filters.add(new MealTypeFilter(mealType));
        }
        if(cuisineTypes!=null){
            filters.add(new CuisinesTypeFilter(cuisineTypes));
        }
        if(rating != null)
            filters.add(new StarRatingFilter(rating));
        return new RestaurantSearcher().search(restaurantName, filters);
    }
}
