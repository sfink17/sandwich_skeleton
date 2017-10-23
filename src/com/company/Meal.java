package com.company;

/**
 * Created by Simon on 10/23/2017.
 */
public class Meal implements Item {

        private final Sandwich sandwich;
        private final Drink drink;

        private Meal(Sandwich sandwich, Drink drink){
            this.sandwich = sandwich;
            this.drink = drink;
        }

        public double getPrice() {
            return .8*(sandwich.getPrice() + drink.getPrice() + 2.00);
        }

        @Override
        public String toString() {
            return "a " + sandwich + " meal with " + drink;
        }

}
