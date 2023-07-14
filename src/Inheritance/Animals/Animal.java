package Inheritance.Animals;

public class Animal {
    private String name;
    private int age;
    private String gender;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public Animal(String name , int age , String gender) {

        if(age < 0){
            throw new IllegalArgumentException("Invalid input!");
        }
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String produceSound(){
        return "";
    }

    @Override
    public String toString() {
        StringBuilder stb = new StringBuilder();
        stb.append(name+" "+age+" " + gender+"\n"+produceSound());
        return stb.toString();
    }
}
