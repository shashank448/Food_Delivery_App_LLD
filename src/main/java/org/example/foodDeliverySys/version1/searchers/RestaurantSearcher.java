package org.example.foodDeliverySys.version1.searchers;

import org.example.foodDeliverySys.version1.data.FoodItem;
import org.example.foodDeliverySys.version1.data.Restaurant;
import org.example.foodDeliverySys.version1.filters.FoodItemFilter;
import org.example.foodDeliverySys.version1.filters.RestaurantFilter;

import java.util.ArrayList;
import java.util.List;

public class RestaurantSearcher {
    public List<Restaurant> search(String restaurantName, List<RestaurantFilter> filters){
        // Have some validation
        if(restaurantName == null || restaurantName.length()==0 || filters == null){
            throw new IllegalArgumentException("Mising Params");
        }
        DataAccessResult dataAccessResult = DataAccessor.getRestaurantWithName(restaurantName);
        List<Restaurant> restaurants = DataAccessObjectConverter.convertToRestaurants(dataAccessResult);

        for(RestaurantFilter filter : filters){
            List<Restaurant> filteredRestaurants = new ArrayList<>();
            for(Restaurant restaurant : restaurants){
                if(filter.filter(restaurant)){
                    filteredRestaurants.add(restaurant);
                }
                restaurants = filteredRestaurants;
            }
        }
        return restaurants;
    }
    public Restaurant searchById(int id){
        return null;
    }
}
