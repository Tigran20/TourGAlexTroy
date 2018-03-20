package com.alextroy.tourguidealextroy.model;

public class Attraction {

    private String name;
    private float rating;
    private int imageResourceId;
    private String description;

    public Attraction(String name, float rating, int imageResourceId, String description) {
        this.name = name;
        this.rating = rating;
        this.imageResourceId = imageResourceId;
        this.description = description;
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

    public String getDescription() {
        return description;
    }
}
