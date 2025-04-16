package org.example.foodDeliverySys.version1.apis;
import org.example.foodDeliverySys.version1.data.CuisineType;
import org.example.foodDeliverySys.version1.data.FoodItem;
import org.example.foodDeliverySys.version1.data.MealType;
import org.example.foodDeliverySys.version1.data.StarRating;

import java.util.List;

public class FoodItemSearcherAPI {
    public List<FoodItem> searchFoodItems(String foodItemName, MealType mealType, List<CuisineType> cuisines, StarRating rating){
        return null;
    }

}

// Searcher : Should be generic
// Get only those food items whose (name matches foodItemName) AND (meal type matches meal type) AND (cuisine Type matches cuisines)
// AND rating > starRating
// Basically we have these -- > ((meal type matches meal type) AND (cuisine Type matches cuisines)
//// AND rating > starRating) as FILTERS
// where FoodItem --> passed into --> Filter --> can return true/false;


