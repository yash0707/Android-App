package com.varshney.deliverysystem.Pojos;

/**
 * Created by yash on 23/3/18.
 */

public class Fashion {
    private String name;
    private int count_of_item;
    private boolean favourite;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount_of_item() {
        return count_of_item;
    }

    public void setCount_of_item(int count_of_item) {
        this.count_of_item = count_of_item;
    }

    public boolean isFavourite() {
        return favourite;
    }

    public void setFavourite(boolean favourite) {
        this.favourite = favourite;
    }
}
