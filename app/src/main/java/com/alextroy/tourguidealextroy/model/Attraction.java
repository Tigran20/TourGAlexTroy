package com.alextroy.tourguidealextroy.model;

public class Attraction {

    private String name;
    private float rating;
    private int imageResourceId;

    public Attraction(String name, float rating, int imageResourceId) {
        this.name = name;
        this.rating = rating;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public float getRating() {
        return rating;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}
