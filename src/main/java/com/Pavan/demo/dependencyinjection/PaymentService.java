package com.Pavan.demo.dependencyinjection;

import org.springframework.stereotype.Component;

@Component
public class PaymentService {
    public void Payment(){
        System.out.println("Payment done");
    }
}