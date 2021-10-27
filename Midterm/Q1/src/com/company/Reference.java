package com.company;

public class Reference extends Book{
    public Reference(String title, double price, String publishYear) {
        super(title, price, publishYear);
    }

    @Override
    String description() {
        return title + " all information is real.";
    }
}
