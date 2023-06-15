package com.hasnatjanirafin.chinesefood;

import java.io.Serializable;

public class FoodItem implements Serializable {
    private String name;
    private int imageResourceId;
    private String description;

    public FoodItem(String name, int imageResourceId, String description) {
        this.name = name;
        this.imageResourceId = imageResourceId;
        this.description = description;
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
