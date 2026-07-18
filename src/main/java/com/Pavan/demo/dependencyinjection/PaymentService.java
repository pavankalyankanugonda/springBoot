package com.Pavan.demo.dependencyinjection;

import org.springframework.stereotype.Component;

@Component
public class PaymentService {
    public void payment(){
        System.out.println("Payment Successful");
    }
}