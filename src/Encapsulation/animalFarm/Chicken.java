package Encapsulation.animalFarm;

public class Chicken {
    private String name;
    private int age;

    public Chicken(String name , int age){
        this.setName(name);
        this.setAge(age);
    }

    private void setAge(int age) {
        if(age < 0 || age > 15){
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }
        this.age = age;

    }

    private void setName(String name) {
        if(name.length() < 1){
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
    }

    public double productPerDay(){

        return calculateProductPerDay();

    }


    @Override
    public String toString() {
        return super.toString();
    }

    private double calculateProductPerDay(){
        if(this.age < 6){
            return 2;
        }if(this.age < 12){
            return 1;
        }else {
            return 0.75;
        }
    }
}
