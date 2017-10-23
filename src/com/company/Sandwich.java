package com.company;

/**
 * Created by Simon on 10/23/2017.
 */
public class Sandwich extends SimpleItem {

    final double cost;

    public Sandwich(String name, double cost){
        this.name = name;
        this.cost = cost;
    }

    public double getPrice() {
        return this.cost;
    }
}
