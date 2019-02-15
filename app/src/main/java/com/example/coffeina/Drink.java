package com.example.coffeina;

public class Drink {
    private String name;
    private String description;
    private int imageResourceId;

    public static final Drink[] deinks = {
            new Drink("latte","espresso z pianką",R.drawable.latte),
            new Drink("espresso","mala czarna",R.drawable.espresso),
            new Drink("cappuccino","spienione mleko",R.drawable.cappuccino),
    };

    @Override
    public String toString() {
        return this.name;
    }

    public Drink(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}
