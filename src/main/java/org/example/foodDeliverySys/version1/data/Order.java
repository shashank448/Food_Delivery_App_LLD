package org.example.foodDeliverySys.version1.data;

import java.util.List;

public class Order {
    private final List<CartItem> cartItems;
    private final int order_id;
    private final int userId;
    private final OrderStatus orderStatus;

    public Order(List<CartItem> cartItems, int orderId, int userId, OrderStatus orderStatus) {
        this.cartItems = cartItems;
        order_id = orderId;
        this.userId = userId;
        this.orderStatus = orderStatus;
    }

    public int getOrder_id() {
        return order_id;
    }

    public List<CartItem> getCartItems() {
        return cartItems;
    }

    public int getUserId() {
        return userId;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }
}
