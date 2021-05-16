package com.example.thehungrydeveloper;

import androidx.annotation.NonNull;

public class desert {
    String title;
    String description;
    int price;


    desert(String title , String description,int price){
        this.description = description;
        this.title = title;
        this.price = price;
    }

    @Override
    @NonNull
    public String toString() {
        return title;
    }
}
