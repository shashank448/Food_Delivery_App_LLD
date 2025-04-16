package org.example.foodDeliverySys.version1.filters;

import org.example.foodDeliverySys.version1.data.FoodItem;

public interface FoodItemFilter {
    boolean filter(FoodItem foodItem);
}
