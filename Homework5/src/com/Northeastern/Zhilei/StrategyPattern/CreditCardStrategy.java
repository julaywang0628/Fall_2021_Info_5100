package com.Northeastern.Zhilei.StrategyPattern;

public class CreditCardStrategy implements PaymentStrategy{
    String cardNumber;
    public CreditCardStrategy(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    @Override
    public void pay(Integer price) {
        System.out.println("CreditCard : $" + price);
    }
}
