package Abstraction.CardRank.CardSuit;

public class Main {

    public static void main(String[] args) {
        System.out.println("Card Suits:");
        for(Suits allSuits : Suits.values()){
            System.out.println(allSuits.toString());
        }
    }
}
