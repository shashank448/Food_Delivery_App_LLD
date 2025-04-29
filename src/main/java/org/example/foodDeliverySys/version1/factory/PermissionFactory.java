package org.example.foodDeliverySys.version1.factory;

import org.example.foodDeliverySys.version1.data.FoodItem;
import org.example.foodDeliverySys.version1.data.Order;
import org.example.foodDeliverySys.version1.data.OrderStatus;
import org.example.foodDeliverySys.version1.data.User;
import org.example.foodDeliverySys.version1.perm.*;

public class PermissionFactory {
    private PermissionFactory(){

    }
    public static Permission getAddToCartPermission(User user, FoodItem foodItem){
        return new AddToCartPermission(user, foodItem);
    }
    public static Permission getDeleteFromCartPermission(User user, FoodItem foodItem){
        return new DeleteFromCartPermission(user, foodItem);
    }
    // Similarly you can have different different cart permission
    public static Permission getCheckOutCartPermission(User user){
        return new CheckoutCartPermission(user);
    }
    public static Permission getPlaceOrderPermission(User user){
        return new PlaceOrderPermission(user);
    }
    public static Permission getUpdateOrderPermission(User user, Order order, OrderStatus orderStatus){
        return new UpdateOrderPermission(user, order, orderStatus);
    }

}
