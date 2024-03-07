package com.example.thehungrydeveloper;

import androidx.annotation.NonNull;

import java.util.SplittableRandom;

public class dish{

    String title;
    String description;
    int price;


    dish (String title, String description,int price){
        this.title = title;
        this.description = description;
        this.price = price;


    }

    @NonNull
    @Override
    public String toString() {
        return description;

    }
}
