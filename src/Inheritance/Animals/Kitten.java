package Inheritance.Animals;

public class Kitten extends Cat {
    public Kitten(String name, int age, String gender) {
        super(name, age, gender);
    }

    public String produceSound(){
        return "Meow";
    }
}
