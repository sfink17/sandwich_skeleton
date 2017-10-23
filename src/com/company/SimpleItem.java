package com.company;

/**
 * Created by Simon on 10/23/2017.
 */
public abstract class SimpleItem implements Item {
    String name;

    @Override
    public String toString(){
        return name;
    }
}
