package com.company;

import java.rmi.AlreadyBoundException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Simon on 10/23/2017.
 */
public class CustomSandwich extends Sandwich {
    private String bread;
    private String filling;
    private Set<String> ingredients;

    public CustomSandwich(String name){
        super(name, 4.00);
        this.ingredients = new HashSet<>();
    }

    public CustomSandwich addBread(String bread) throws AlreadyBoundException{
        if (this.bread != null && !this.bread.equals(bread)) {
            throw new AlreadyBoundException("Sandwich already has bread.");
        }
        else {
            this.bread = bread;
        }
        return this;
    }

    public CustomSandwich addFilling(String filling) throws AlreadyBoundException{
        if (this.filling != null) {
            throw new AlreadyBoundException("Sandwich already has filling.");
        }
        else {
            this.filling = filling;
        }
        return this;

    }

    public CustomSandwich addIngredients(String[] ingredients){
        this.ingredients.addAll(Arrays.asList(ingredients));
        return this;
    }

    @Override
    public double getPrice(){
        return this.cost + ingredients.size()*0.5;
    }

    @Override
    public String toString(){
        String base = "custom sandwich with " + bread + " bread and " + filling;
        return base;
    }
}
