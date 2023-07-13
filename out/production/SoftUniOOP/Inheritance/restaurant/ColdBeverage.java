package Inheritance.restaurant;

import Inheritance.restaurant.Beverage;

import java.math.BigDecimal;

public class ColdBeverage extends Beverage {
    public ColdBeverage(String name, BigDecimal price, double milliliters) {
        super(name, price, milliliters);
    }
}
