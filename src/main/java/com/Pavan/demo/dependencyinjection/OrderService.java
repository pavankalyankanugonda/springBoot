package com.Pavan.demo.dependencyinjection;

import org.springframework.stereotype.Component;

@Component
public class OrderService {

    PaymentService paymentService;

    // Constructor Injection
    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder() {
        paymentService.Payment();
        System.out.println("Order placed");
    }
}