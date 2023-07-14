package Inheritance.restaurant;


import Inheritance.restaurant.Beverage;

import java.math.BigDecimal;

public class HotBeverage extends Beverage {

    public HotBeverage(String name , BigDecimal price, double milliliters){
        super(name,price,milliliters);
    }

}
