package org.example.foodDeliverySys.version1.apis;

import org.example.foodDeliverySys.version1.data.FoodItem;
import org.example.foodDeliverySys.version1.searchers.FoodItemSearcher;

public class GetFoodItemByIdAPI{
    public FoodItem getFoodItemById(int id){
        if(id<0){
            throw new IllegalArgumentException();
        }
        return new FoodItemSearcher().searchById(id);
    }
}
