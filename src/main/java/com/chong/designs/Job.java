package com.chong.designs;

public class Job {
    private String name;
    private float price;

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public Job(String name, float price) {
        this.name = name;
        this.price = price;
    }
}
