package Encapsulation.ShoppingSpree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);



        String [] info = scan.nextLine().split(";");
        String [] person1Info = info[0].split("=");
        String [] person2Info = info[1].split("=");

        try {
            Person person1 = new Person(person1Info[0],Integer.parseInt(person1Info[1]));
            Person person2 = new Person(person2Info[0],Integer.parseInt(person2Info[1]));

            String [] productInfo = scan.nextLine().split(";");
            String [] product1Info = productInfo[0].split("=");
            String [] product2Info = productInfo[1].split("=");

            Product product1 = new Product(product1Info[0],Integer.parseInt(product1Info[1]));
            Product product2 = new Product(product2Info[0],Integer.parseInt(product2Info[1]));


            String line = scan.nextLine();

            while (!line.equals("END")){
                String name = line.split("\\s+")[0];
                String product = line.split("\\s+")[1];

                if(person1.getName().equals(name)){
                    if(product1.getName().equals(product)){
                        person1.buyProduct(product1);
                    }else {
                        person1.buyProduct(product2);
                    }
                }

                if(person2.getName().equals(name)){
                    if(product1.getName().equals(product)){
                        person2.buyProduct(product1);
                    }else {
                        person2.buyProduct(product2);
                    }
                }



                line = scan.nextLine();
            }
            System.out.println(person1.toString());
            System.out.println(person2.toString());

        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }



    }
}
