package org.example.foodDeliverySys.version1.apis;

import org.example.foodDeliverySys.version1.data.Restaurant;
import org.example.foodDeliverySys.version1.searchers.RestaurantSearcher;

public class GetRestaurantByIdAPI {
    public Restaurant getRestaurantById(int id){
        if(id<0)
            throw new IllegalArgumentException();
        return new RestaurantSearcher().searchById(id);
    }
}
