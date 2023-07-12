package Abstraction.CardSuit;

public enum Suits {
    CLUBS,
    DIAMONDS,
    HEARTS,
    SPADES;

    @Override
    public String toString() {
        return "Ordinal value: " + ordinal() + "; Name value: " + this.name();
    }
}
