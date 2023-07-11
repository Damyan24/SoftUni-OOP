package CardRank;

public enum CardRank {
    ACE, TWO,
    THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING;

    public String toString() {
        return "Ordinal value: " + ordinal() + "; Name value: " + this.name();
    }
}
