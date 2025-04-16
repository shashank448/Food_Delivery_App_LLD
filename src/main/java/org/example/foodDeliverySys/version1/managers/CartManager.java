package org.example.foodDeliverySys.version1.managers;

import org.example.foodDeliverySys.version1.data.CartItem;
import org.example.foodDeliverySys.version1.data.FoodItem;
import org.example.foodDeliverySys.version1.data.User;

import java.util.List;

public class CartManager {
    public List<CartItem> getUserCart(User user){

    }
    // add 1 units
    public void addItemToCart(User user, FoodItem foodItem){

    }
    // removes 1 unit of the cart
    public void deleteItemFromCart(User user, FoodItem foodItem){
        // Take care of edgecases
    }
    public void checkOutUserCart(User user){

    }
}


// Cart
// id, user_id, food_item_id, qty, status
