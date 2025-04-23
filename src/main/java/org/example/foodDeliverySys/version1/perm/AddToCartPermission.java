package org.example.foodDeliverySys.version1.perm;

import org.example.foodDeliverySys.version1.data.FoodItem;
import org.example.foodDeliverySys.version1.data.Restaurant;
import org.example.foodDeliverySys.version1.data.User;
import org.example.foodDeliverySys.version1.managers.DeliveryManager;
import org.example.foodDeliverySys.version1.searchers.RestaurantSearcher;

public class AddToCartPermission implements Permission{
    private final User user;
    private final FoodItem foodItem;
    private final DeliveryManager deliveryManager;

    public AddToCartPermission(User user, FoodItem foodItem) {
        this.user = user;
        this.foodItem = foodItem;
        this.deliveryManager = new DeliveryManager();
    }

    @Override
    public boolean isPermitted() {
        // Logic for deciding the permission
        if(!foodItem.isAvailable())
            return false;
        // Ensure location of Restaurant and user is nearby -- some kind of logic/algorithm for this
        Restaurant restaurant = new RestaurantSearcher().searchById(foodItem.getRestaurantId());
        return deliveryManager.isDeliveryPossible(restaurant.getAddress(), user.getAddress());

        }
    }
}
