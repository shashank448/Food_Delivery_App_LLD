package org.example.foodDeliverySys.version1.factory;

import org.example.foodDeliverySys.version1.data.FoodItem;
import org.example.foodDeliverySys.version1.data.User;
import org.example.foodDeliverySys.version1.perm.AddToCartPermission;
import org.example.foodDeliverySys.version1.perm.CheckoutCartPermission;
import org.example.foodDeliverySys.version1.perm.DeleteFromCartPermission;
import org.example.foodDeliverySys.version1.perm.Permission;

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

}
