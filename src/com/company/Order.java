package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Simon on 10/23/2017.
 */
public class Order {
    private final List<Item> items = new ArrayList<>();

    public void addItem(Item item){
        items.add(item);
    }
    public double getPrice(){
        return items.stream().mapToDouble(Item::getPrice).sum();
    }
}
