package org.example.foodDeliverySys.version1.apis;

import org.example.foodDeliverySys.version1.data.PaymentResponse;
import org.example.foodDeliverySys.version1.data.PaymentStatus;
import org.example.foodDeliverySys.version1.data.User;
import org.example.foodDeliverySys.version1.factory.PaymentManagerFactory;
import org.example.foodDeliverySys.version1.managers.OrderManager;
import org.example.foodDeliverySys.version1.managers.PaymentManager;
import org.example.foodDeliverySys.version1.managers.UserManager;

import java.util.Map;

public class PlaceOrderAPI {
    private final UserManager userManager = new UserManager();
    private final OrderManager orderManager = new OrderManager();
    public Order placeOrder(String userToken, Map<String, String> paymentInfo, String paymentMode){
        if(userToken == null || userToken.length() == 0)
            throw new IllegalArgumentException("Params missing");
        User user = userManager.getUserByToken(userToken);
        if(user == null)
            throw new IllegalArgumentException("userToken Invalid");
        PaymentManager paymentManager = PaymentManagerFactory.getPaymentManager(paymentMode, paymentInfo);
        PaymentResponse paymentResponse = paymentManager.executePayment();
        if(paymentResponse == null || paymentResponse.getStatus() == null || paymentResponse.getStatus().equals(PaymentStatus.FAILED))
            throw new RuntimeException("Payment Failed");
        orderManager.placeOrder(user);
    }
}
