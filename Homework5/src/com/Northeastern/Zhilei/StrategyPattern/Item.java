package com.Northeastern.Zhilei.StrategyPattern;

public class Item {
    private String id;
    private Integer price;

    public String getId() {
        return id;
    }

    public Integer getPrice() {
        return price;
    }

    public Item(String id, Integer price) {
        this.id = id;
        this.price = price;
    }


}
