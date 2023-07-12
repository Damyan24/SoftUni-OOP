package Abstraction.CardRank;

import Abstraction.CardRank.CardRank;

public class Main {
    public static void main(String[] args) {
        System.out.println("Card Ranks:");

        for(CardRank ranks : CardRank.values()){
            System.out.println(ranks.toString());
        }
    }
}
