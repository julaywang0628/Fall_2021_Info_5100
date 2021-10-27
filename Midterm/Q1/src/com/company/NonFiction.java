package com.company;

public class NonFiction extends Book implements iBorrowable{

    public NonFiction(String title, double price, String publishYear) {
        super(title, price, publishYear);
    }

    @Override
    String description() {
        return title + " all events are true and based on real facts.";
    }

    int borrowDay;
    int returnDay;

    @Override
    public void setBorrowDate(int borrowDay) {
        this.borrowDay = borrowDay;

    }

    @Override
    public void setReturnDate(int returnDay) {
        this.returnDay = returnDay;
    }

    @Override
    public boolean isAvailable(int day) {
        if(day >= borrowDay && day <= returnDay) {
            return false;
        } else {
            return true;
        }
    }
}
