import java.util.Stack;

public abstract class Game{
    Deck deck = new Deck();
    //trying to think of things all card games have in common. The list isn't long.
    public void setupDeck(){
        deck.shuffle();
    }

    public abstract void deal();
}
