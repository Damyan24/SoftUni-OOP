package Inheritance.restaurant;

import Inheritance.restaurant.MainDish;

import java.math.BigDecimal;

public class Salmon extends MainDish {


    public Salmon(String name, BigDecimal price, double grams) {
        super(name, price, grams);
    }

    public double getSALMON_GRAMS() {
        return 22;
    }



}
