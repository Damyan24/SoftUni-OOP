package CardsWithPower;

public class Cards {
    private String rank;
    private String suit;

    int power;

    public Cards(String rank , String suit){
        this.rank = rank;
        this.suit = suit;
        power = getRankPower() + getSuitPower();
    }

    public int getRankPower(){
        switch (rank){
            case "ACE":
                return 14;
            case"TWO":
                return 2;
            case "THREE":
                return 3;
            case "FOUR":
                return 4;
            case "FIVE":
                return 5;
            case "SIX":
                return 6;
            case "SEVEN":
                return 7;
            case "EIGHT":
                return 8;
            case "NINE":
                return 9;
            case "TEN":
                return 10;
            case "JACK":
                return 11;
            case "QUEEN":
                return 12;
            case "KING":
                return 13;
        }
        return 0;
    }

    public int getSuitPower(){
        switch (suit){
            case "CLUBS":
                return 0;
            case "DIAMONDS":
                return 13;
            case "HEARTS":
                return 26;
            case "SPADES":
                return 39;
        }

        return 0;
    }

    @Override
    public String toString() {
        return "Card name: " + rank + " of " + suit+"; Card power: "+power;
    }
}
