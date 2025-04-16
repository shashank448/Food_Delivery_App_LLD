package org.example.foodDeliverySys.version1.searchers;

import org.example.foodDeliverySys.version1.data.FoodItem;
import org.example.foodDeliverySys.version1.filters.FoodItemFilter;

import java.util.ArrayList;
import java.util.List;

public class FoodItemSearcher {
    public List<FoodItem> search(String foodItemName, List<FoodItemFilter> filters){
        // Perform some validations
        if(foodItemName == null || foodItemName.length()==0 || filters == null)
            throw new IllegalArgumentException("Missing Params");
        // Lets say there is some data Accessor class which fetches FoodItems based on foodItemName

        DataAccessResult dataAccessResult = DataAccessor.getFoodItemWithName(foodItemName);
        List<FoodItem> foodItems = DataAccessObjectConverter.convertToFoodItems(dataAccessResult);

        for(FoodItemFilter filter : filters){
            List<FoodItem> filteredFoodItems = new ArrayList<>();
            for(FoodItem foodItem : foodItems){
                if(filter.filter(foodItem)){
                    filteredFoodItems.add(foodItem);
                }
                foodItems = filteredFoodItems;
            }
        }
        return foodItems;
    }
    public FoodItem searchById(int id){

    }
}
