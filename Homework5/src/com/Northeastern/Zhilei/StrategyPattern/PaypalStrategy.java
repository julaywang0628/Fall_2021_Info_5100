package com.Northeastern.Zhilei.StrategyPattern;

public class PaypalStrategy implements PaymentStrategy{
    String email;
    public PaypalStrategy(String email) {
        this.email = email;
    }
    @Override
    public void pay(Integer price) {
        System.out.println("Paypal : $" + price);
    }
}
