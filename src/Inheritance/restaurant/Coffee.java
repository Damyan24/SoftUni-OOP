package Inheritance.restaurant;

import java.math.BigDecimal;

public class Coffee extends HotBeverage {
    private final int COFFEE_MILLILITERS = 50;
    private final BigDecimal COFFEE_PRICE = BigDecimal.valueOf(3.50);

    private  double caffeine;

    public double getCaffeine() {
        return caffeine;
    }

    public Coffee(String name, BigDecimal price, double milliliters,double caffeine) {
        super(name, BigDecimal.valueOf(3.50), 50);
        this.caffeine = caffeine;
    }
}
