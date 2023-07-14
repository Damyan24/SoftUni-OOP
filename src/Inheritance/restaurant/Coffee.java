package Inheritance.restaurant;

import java.math.BigDecimal;

public class Coffee extends HotBeverage {


    private double caffeine;
    private static final int COFFEE_MILLILITERS = 50;
    private static final BigDecimal COFFEE_PRICE = BigDecimal.valueOf(3.50);



    public double getCaffeine() {
        return caffeine;
    }

    public Coffee(String name,double caffeine) {
        super(name, COFFEE_PRICE ,COFFEE_MILLILITERS);
        this.caffeine = caffeine;

    }
}
