package org.example.foodDeliverySys.version1.apis;

import org.example.foodDeliverySys.version1.data.FoodItem;
import org.example.foodDeliverySys.version1.data.User;
import org.example.foodDeliverySys.version1.managers.CartManager;
import org.example.foodDeliverySys.version1.managers.UserManager;
import org.example.foodDeliverySys.version1.searchers.FoodItemSearcher;

public class AddToCartAPI {
    private final UserManager userManager = new UserManager();
    private final FoodItemSearcher foodItemSearcher = new FoodItemSearcher();
    private final CartManager cartManager = new CartManager();
    public void addToCart(String userToken, int foodItemId){
        if(userToken==null || userToken.length()==0 || foodItemId<0)
            throw new IllegalArgumentException("userToken invalid or foodItemId invalid");
        User user = userManager.getUserByToken(userToken);
        if(user==null)
            throw new RuntimeException("No user retrieved for the following userToken : "+ userToken);
        FoodItem foodItem = foodItemSearcher.searchById(foodItemId);
        if(foodItem==null)
            throw new RuntimeException("No FoodItem fetched for the given Id " + foodItemId);
        // cartManager
        cartManager.addItemToCart(user, foodItem);
    }
}
