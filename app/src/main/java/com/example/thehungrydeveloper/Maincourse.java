package com.example.thehungrydeveloper;

import androidx.annotation.NonNull;

public class Maincourse {
    String title;
    String description;
    int price;

    Maincourse(String title, String description, int price) {
        this.title = title;
        this.description = description;
        this.price = price;

    }

    @Override
    @NonNull
    public String toString() {
        return title;
    }
}
