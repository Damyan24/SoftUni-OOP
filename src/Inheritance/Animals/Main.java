package Animals;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<String, Animal> animalList = new LinkedHashMap<>();

        String type = scan.nextLine();

        while (!type.equals("Beast!")) {
            String[]info = scan.nextLine().split("\\s+");




                String name = info[0];
                int age = Integer.parseInt(info[1]);
                String gender = info[2];
            try {
                if(type.equals("Dog")){
                    Dog dog = new Dog(name , age , gender);
                    animalList.put(type,dog);
                } else if (type.equals("Cat")) {
                    Cat cat = new Cat(name , age , gender);
                    animalList.put(type,cat);
                }else if(type.equals("Frog")){
                    Frog frog = new Frog(name , age ,gender);
                    animalList.put(type,frog);
                } else if (type.equals("Kitten")) {
                    Kitten kittens = new Kitten(name , age);
                    animalList.put(type,kittens);
                } else if (type.equals("Tomcat")) {
                    Tomcat tomcat = new Tomcat(name , age);
                    animalList.put(type,tomcat);
                }

            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }

            type = scan.nextLine();

        }

        for(Map.Entry<String,Animal> entry : animalList.entrySet()){
            System.out.println(entry.getValue().toString());
        }

    }
}
