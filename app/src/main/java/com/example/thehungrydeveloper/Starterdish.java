package com.example.thehungrydeveloper;

import androidx.annotation.NonNull;

public class Starterdish {
    String title;
    String description;
    int price;

    Starterdish(String title,String description,int price){
        this.title = title;
        this.description = description;
        this.price = price;
    }

    @NonNull
    @Override
    public String toString() {
        return title;
    }
}
