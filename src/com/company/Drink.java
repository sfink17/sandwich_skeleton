package com.company;

/**
 * Created by Simon on 10/23/2017.
 */

public class Drink extends SimpleItem {

    private final int size;

    public Drink(String name, int size){
        this.name = name;
        this.size = size;
    }

    public double getPrice(){
        return 2.00 + (0.50*size);
    }
}
