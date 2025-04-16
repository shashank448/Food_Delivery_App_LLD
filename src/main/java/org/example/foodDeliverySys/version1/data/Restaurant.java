package org.example.foodDeliverySys.version1.data;

import java.util.List;

public class Restaurant {
    private final int id;
    private final String name;
    private final String description;
    private final BusinessHours businessHours;
    private final MealType mealType;
    private final List<CuisineType> cuisineTypes;
    private final StarRating rating;
    private final Menu menu;

    public Restaurant(int id, String name, String description, BusinessHours businessHours, MealType mealType, List<CuisineType> cuisineTypes, StarRating rating, Menu menu) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.businessHours = businessHours;
        this.mealType = mealType;
        this.cuisineTypes = cuisineTypes;
        this.rating = rating;
        this.menu = menu;
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

    public BusinessHours getBusinessHours() {
        return businessHours;
    }

    public MealType getMealType() {
        return mealType;
    }

    public List<CuisineType> getCuisineTypes() {
        return cuisineTypes;
    }

    public StarRating getRating() {
        return rating;
    }

    public Menu getMenu() {
        return menu;
    }
// Again Builder Pattern is applicable here.

}
//*
//public class Restaurant {
//    private final int id;
//    private final String name;
//    private final String description;
//    private final BusinessHours businessHours;
//    private final MealType mealType;
//    private final List<CuisineType> cuisineTypes;
//    private final StarRating rating;
//    private final Menu menu;
//
//    // Private constructor to enforce builder usage
//    private Restaurant(Builder builder) {
//        this.id = builder.id;
//        this.name = builder.name;
//        this.description = builder.description;
//        this.businessHours = builder.businessHours;
//        this.mealType = builder.mealType;
//        this.cuisineTypes = builder.cuisineTypes;
//        this.rating = builder.rating;
//        this.menu = builder.menu;
//    }
//
//    // Static nested Builder class
//    public static class Builder {
//        private final int id;
//        private final String name;
//
//        private String description = "";
//        private BusinessHours businessHours;
//        private MealType mealType;
//        private List<CuisineType> cuisineTypes = new ArrayList<>();
//        private StarRating rating;
//        private Menu menu;
//
//        // Required fields constructor
//        public Builder(int id, String name) {
//            this.id = id;
//            this.name = name;
//        }
//
//        // Optional fields with chaining
//        public Builder description(String description) {
//            this.description = description;
//            return this;
//        }
//
//        public Builder businessHours(BusinessHours businessHours) {
//            this.businessHours = businessHours;
//            return this;
//        }
//
//        public Builder mealType(MealType mealType) {
//            this.mealType = mealType;
//            return this;
//        }
//
//        public Builder cuisineTypes(List<CuisineType> cuisineTypes) {
//            this.cuisineTypes = cuisineTypes;
//            return this;
//        }
//
//        public Builder rating(StarRating rating) {
//            this.rating = rating;
//            return this;
//        }
//
//        public Builder menu(Menu menu) {
//            this.menu = menu;
//            return this;
//        }
//
//        public Restaurant build() {
//            return new Restaurant(this);
//        }
//    }
//}
//
//
//
//
//
//
//
//
//
// */
