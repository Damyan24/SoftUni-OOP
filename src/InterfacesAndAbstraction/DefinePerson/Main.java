package DefinePerson;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        HashMap<String,Buyer>people = new LinkedHashMap<>();

        for(int i = 0 ; i < n ; i++){

            String [] info = scan.nextLine().split("\\s+");

            if(info.length == 3){
                Buyer rebel = new Rebel(info[0],Integer.parseInt(info[1]),info[2]);
                rebel.buyFood();
                people.put(info[0],rebel);
            }else {
                Buyer citizen = new Citizen(info[0],Integer.parseInt(info[1]),info[2],info[3]);
                citizen.buyFood();
                people.put(info[0],citizen);
            }

        }


        String line = scan.nextLine();
        int food = 0;
        while (!line.equals("End")){

            if(people.containsKey(line)){
                food += people.get(line).getFood();
            }

            line = scan.nextLine();
        }

        System.out.println(food);


    }
}
