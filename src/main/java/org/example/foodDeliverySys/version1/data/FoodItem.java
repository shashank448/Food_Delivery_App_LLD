package org.example.foodDeliverySys.version1.data;

public class FoodItem {

    // Builder pattern is applicable here
    private final int id;
    private final String name;
    private final String description;
    private final double priceINR;
    private final MealType mealType;
    private final CuisineType cuisineType;
    private final StarRating starRating;
    private final int restaurantId;
    private boolean isAvailable;

    public FoodItem(int id, String name, String description, double priceINR, MealType mealType, CuisineType cuisineType, StarRating starRating, int restaurantId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.priceINR = priceINR;
        this.mealType = mealType;
        this.cuisineType = cuisineType;
        this.starRating = starRating;
        this.restaurantId = restaurantId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPriceINR() {
        return priceINR;
    }

    public MealType getMealType() {
        return mealType;
    }

    public StarRating getStarRating() {
        return starRating;
    }

    public CuisineType getCuisineType() {
        return cuisineType;
    }

    public int getRestaurantId() {
        return restaurantId;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}

/*----------------------------------------------------

Have build the below class using the builder design pattern, considering we have some optional fields

public class FoodItem {

    private final int id;
    private final String name;
    private final String description;
    private final double priceINR;
    private final MealType mealType;
    private final CuisineType cuisineType;
    private final StarRating starRating;
    private final int restaurantId;
    private final boolean isAvailable;

    // Private constructor to enforce object creation through the builder
    private FoodItem(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.description = builder.description;
        this.priceINR = builder.priceINR;
        this.mealType = builder.mealType;
        this.cuisineType = builder.cuisineType;
        this.starRating = builder.starRating;
        this.restaurantId = builder.restaurantId;
        this.isAvailable = builder.isAvailable;
    }

    // Static nested Builder class
    public static class Builder {
        private final int id;
        private final String name;
        private final double priceINR;
        private final int restaurantId;

        private String description = "";
        private MealType mealType = null;
        private CuisineType cuisineType = null;
        private StarRating starRating = null;
        private boolean isAvailable = true;

        // Constructor with required fields
        public Builder(int id, String name, double priceINR, int restaurantId) {
            this.id = id;
            this.name = name;
            this.priceINR = priceINR;
            this.restaurantId = restaurantId;
        }

        // Optional fields with setters returning Builder
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder mealType(MealType mealType) {
            this.mealType = mealType;
            return this;
        }

        public Builder cuisineType(CuisineType cuisineType) {
            this.cuisineType = cuisineType;
            return this;
        }

        public Builder starRating(StarRating starRating) {
            this.starRating = starRating;
            return this;
        }

        public Builder isAvailable(boolean isAvailable) {
            this.isAvailable = isAvailable;
            return this;
        }

        public FoodItem build() {
            return new FoodItem(this);
        }
    }
}

*/