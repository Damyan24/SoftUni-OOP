package Inheritance.restaurant;

import Inheritance.restaurant.MainDish;

import java.math.BigDecimal;

public class Salmon extends MainDish {

    private final  double SALMON_GRAMS = 22;

    public Salmon(String name, BigDecimal price, double grams) {
        super(name, price, 22);
    }



}