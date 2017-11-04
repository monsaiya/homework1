package com.example.homework;

import com.example.homework.Animal;

import java.util.ArrayList;


public class AnimalData {

    private static AnimalData sInstance;

    public ArrayList<Animal> animalList;

    public static AnimalData getInstance() {
        if (sInstance == null) {
            sInstance = new AnimalData();
        }
        return sInstance;
    }

}
