package org.example.foodDeliverySys.version1.managers;

import org.example.foodDeliverySys.version1.data.*;
import org.example.foodDeliverySys.version1.factory.PermissionFactory;
import org.example.foodDeliverySys.version1.perm.Permission;

import java.util.List;

public class OrderManager {
    public Order placeOrder(User user){
        Permission permission = PermissionFactory.getPlaceOrderPermission(user);
        if(!permission.isPermitted())
            throw new RuntimeException("Permission Denied");
        CartManager cartManager = new CartManager();
        List<CartItem> cartItems = cartManager.getUserCart(user);
        int orderId = DataAccessor.createOrder(user, cartItems);
        cartManager.checkOutUserCart(user);
        return new Order(cartItems, orderId, user.getId(), OrderStatus.ORDER_PLACED);
    }

    public List<Order> getOrders(User user){
        return null;
    }
    public Order getOrder(int orderId){
        return null;
    }
    public void setOrderToCooking(User user, Order order){
        Permission permission = PermissionFactory.getUpdateOrderPermission(user, order, OrderStatus.COOKING);
        if(!permission.isPermitted())
            throw new RuntimeException("Permission Denied");
        if(!order.getOrderStatus().equals(OrderStatus.ORDER_PLACED)){
            throw new RuntimeException("Only ORDER_PLACED status can move to COOKING ");
        }
        // ..

    }
    public void setOrderToReadyForDelivery(User user, Order order){
        // similar to setOrderToCooking
        if(!order.getOrderStatus().equals(OrderStatus.COOKING)
            throw new RuntimeException("Only COOKING status can move to READY_FOR_DELIVERY");

    }
    public void setOrderToOutForDelivery(User user, Order order){
        // similar to setOrderToCooking
        if(!order.getOrderStatus().equals(OrderStatus.READY_FOR_DELIVERY)
        throw new RuntimeException("Only READY_FOR_DELIVERY status can move to OUT_FOR_DELIVERY");

    }
    public void setOrderToCancelled(User user, Order order){
        if(!order.getOrderStatus().equals(OrderStatus.ORDER_PLACED)){
            throw new RuntimeException("Only ORDER_PLACED status can move to COOKING ");
        }
    }



}
