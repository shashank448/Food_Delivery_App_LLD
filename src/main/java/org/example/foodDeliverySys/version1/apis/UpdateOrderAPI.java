package org.example.foodDeliverySys.version1.apis;

import org.example.foodDeliverySys.version1.data.Order;
import org.example.foodDeliverySys.version1.data.OrderStatus;
import org.example.foodDeliverySys.version1.data.User;
import org.example.foodDeliverySys.version1.managers.OrderManager;
import org.example.foodDeliverySys.version1.managers.UserManager;

public class UpdateOrderAPI {

    UserManager userManager = new UserManager();
    OrderManager orderManager = new OrderManager();

    public void updateOrder(int orderId, OrderStatus orderStatus, String userToken){
        //.. have validations
        User user = userManager.getUserByToken(userToken);
        // .. have validations
        Order order = orderManager.getOrder(orderId);
        //
        if(orderStatus.equals(OrderStatus.COOKING))
            orderManager.setOrderToCooking(user, order);
        

    }
}
