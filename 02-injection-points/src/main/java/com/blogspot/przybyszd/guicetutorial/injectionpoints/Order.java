package com.blogspot.przybyszd.guicetutorial.injectionpoints;

public class Order {
    private final String item;
    private final int amount;

    public Order(final String item, final int amount) {
        this.item = item;
        this.amount = amount;
    }

    public String getItem() {
        return item;
    }

    public int getAmount() {
        return amount;
    }
}
