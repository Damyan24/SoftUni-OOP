package Abstraction.CardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String rank = scan.nextLine();
        String suit = scan.nextLine();

        Cards card = new Cards(rank,suit);

        System.out.println(card.toString());

    }
}
