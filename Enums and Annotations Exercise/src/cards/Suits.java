package cards;

public enum Suits {
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

    private int index;

    Suits(int index){
        this.index = index;
    }

    public int getValue() {
        return this.index;
    }
}
