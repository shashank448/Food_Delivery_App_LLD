package org.example.foodDeliverySys.version1.data;

public class DataAccessor {
    private DataAccessor(){

    }

    public static void addItemToCart(User user, FoodItem foodItem){
        // Logic for adding item to cart
    }
    public static DataAccessResult getFoodItemsWithNames(String name){
        return null;
    }
    
    public static DataAccessResult getCart(User user){return null;}

    public static void deleteItemFromCart(User user, FoodItem foodItem){}

    public static void checkoutCart(User user){}


}
