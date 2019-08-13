public class Card implements Comparable<Card>{
    public String suit;
    public String id;
    public int numID;

    public Card(String suit, String id, int numID) {
        this.suit = suit;
        this.id = id;
        this.numID = numID;
    }


    @Override
    public int compareTo(Card o) {
        return this.numID - o.numID;
    }

    @Override
    public String toString() {
        return id +" of " +suit;
    }
}
