package org.example.foodDeliverySys.version1.managers;

import org.example.foodDeliverySys.version1.data.*;
import org.example.foodDeliverySys.version1.factory.PermissionFactory;
import org.example.foodDeliverySys.version1.perm.Permission;

import java.util.List;

public class CartManager {
    public List<CartItem> getUserCart(User user){
        DataAccessResult dataAccessResult = DataAccessor.getCart(user);
        List<CartItem> cartItems = DataAccessObjectConverter.convertToCartItems(dataAccessResult);
        return cartItems;
    }
    // add 1 units
    public void addItemToCart(User user, FoodItem foodItem){
        Permission permission = PermissionFactory.getAddToCartPermission(user, foodItem);
        if(!permission.isPermitted())
            throw new RuntimeException("Permission Denied");
        if(!isFoodItemFromSameRestaurant(user, foodItem))
            throw new RuntimeException("Your cart contains item from different restaurants");
        // Insert a row in the cart table
        DataAccessor.addItemToCart(user, foodItem);


    }
    // removes 1 unit of the cart
    public void deleteItemFromCart(User user, FoodItem foodItem){
        // Take care of edgecases
        Permission permission = PermissionFactory.getDeleteFromCartPermission(user, foodItem);
        if(!permission.isPermitted())
            throw new RuntimeException("Delete permission is not granted");
        if(!isFoodItemPresentInCart(user, foodItem))
            throw new RuntimeException("Food item is not present in the cart");
        DataAccessor.deleteItemFromCart(user, foodItem);

    }
    public void checkOutUserCart(User user){
        Permission permission = PermissionFactory.getCheckOutCartPermission(user);
        if(!permission.isPermitted())
            throw new RuntimeException("Does not have checkout cart permission");
        if(isCartEmpty(user))
            throw new RuntimeException("Cart is Empty");
        DataAccessor.checkoutCart(user);
    }
    private boolean isFoodItemFromSameRestaurant(User user, FoodItem foodItem){
        List<CartItem> cartItems = getUserCart(user);
        return cartItems.isEmpty() || cartItems.get(0).getFoodItem().getRestaurantId() == foodItem.getRestaurantId()
    }
    private boolean isFoodItemPresentInCart(User user, FoodItem foodItem){
        List<CartItem> cartItems = getUserCart(user);
        for(CartItem cartItem : cartItems){
            if(cartItem.getFoodItem().getId() == foodItem.getId())
                return true;
        }
        return false;
    }
    private boolean isCartEmpty(User user){
        List<CartItem> userCart = getUserCart(user);
        return userCart.isEmpty();

    }
}


// Cart
// cart_id, user_id, food_item_id, qty, status

// permissions
// Systems have different levels of Access
// Generally a system has different level of access
//Read, Write, Execute

// Permission : abstract Entity

// Talking about Order
// So when payment is completed, now your order can have --
// You can have a different table in which you will map only the cart_id with some order_id
// Orders
// order_id , cart_id



