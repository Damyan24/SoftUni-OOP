package ShoppingSpree;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;

    private double money;

    private List<Product> products;

    public Person(String name , double money){
        setName(name);
        setMoney(money);
        this.products = new ArrayList<>();
    }

    private void setMoney(double money) {
        if(money < 0){
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.money = money;
    }

    private void setName(String name) {
        if(name.length()==0){
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void buyProduct(Product product){
        if(this.money - product.getCost() >= 0){
            this.money -= product.getCost();
            this.products.add(product);
            System.out.println(this.name+" bought " + product.getName());
        }else {
            System.out.println(this.name +" can't afford " + product.getName() );;
        }
    }

    @Override
    public String toString() {
        StringBuilder stB = new StringBuilder();
        if(this.products.size() == 0){
            return this.name + " - Nothing bought";
        }else {
            stB.append(this.name + " - ");
            for (Product product: this.products) {
                stB.append(product.getName() + ", ");
            }
        }
        return stB.toString();
    }
}
