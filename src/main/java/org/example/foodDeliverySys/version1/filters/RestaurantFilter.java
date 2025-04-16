package org.example.foodDeliverySys.version1.filters;

import org.example.foodDeliverySys.version1.data.Restaurant;

public interface RestaurantFilter {
    boolean filter(Restaurant restaurant);
}
