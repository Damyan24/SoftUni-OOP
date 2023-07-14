package Animals;

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

        if(age < 0 || name.trim().isEmpty()){
            throw new IllegalArgumentException("Invalid input!");
        }
        this.name = name;
        this.age = age;
        this.gender = gender;

    }

    public String produceSound(){
        return null;
    }

    @Override
    public String toString() {
        StringBuilder stb = new StringBuilder();
        stb.append(this.getClass().getSimpleName()).append(System.lineSeparator());
        stb.append(this.name).append(" ").append(this.age).append(" ").append(this.gender).append(System.lineSeparator());
        stb.append(this.produceSound());
        return stb.toString();
    }
}
