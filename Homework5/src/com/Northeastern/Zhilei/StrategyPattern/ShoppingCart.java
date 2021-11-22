package com.Northeastern.Zhilei.StrategyPattern;

public class ShoppingCart {
    public ShoppingCart() {

    }
    public Item item;
    public int totalPrice;
    public void addItem(Item item) {
        this.item = item;
        totalPrice += item.getPrice();
    }

    public void removeItem(Item item) {
        this.item = item;
        totalPrice -= item.getPrice();
    }

    public int calculateTotal(Integer totalPrice) {
        this.totalPrice = totalPrice;
        return totalPrice;
    }

    public void pay(PaymentStrategy payment) {
        payment.pay(calculateTotal(totalPrice));
    }

}
