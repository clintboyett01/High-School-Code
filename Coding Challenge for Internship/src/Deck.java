import java.util.*;

public class Deck {
    private Stack<Card> deck;
    private ArrayList<Card> drawnCards;
    public Deck(){
        deck = new Stack<>();
        generateDeck();
        drawnCards = new ArrayList<>();
    }


    // Generates deck in order
    private void generateDeck(){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                String suit = "";
                String id;
                int numID;
                //assigns suit
                switch (i){
                    case 0: suit = "Spades"; break;
                    case 1: suit = "Hearts"; break;
                    case 2: suit = "Clubs"; break;
                    case 3: suit = "Diamonds"; break;
                }

                //assigns card id
                //if it is not an Ace or a face card, the number of the loop is applied (plus one due to default zero indexing)
                switch (j){
                    case 0: id = "A"; break;
                    case 10: id = "J"; break;
                    case 11: id = "Q"; break;
                    case 12: id = "K"; break;
                    default: id = "" + (j+1);
                }

                //having a number value might come in handy latter
                numID = j+1;
                if (numID==1){
                    numID = 14;
                }


                Card card = new Card(suit,id,numID);
                deck.add(card);
            }
        }
        Collections.reverse(deck);
    }

    //this could possibly be cheating if y'all want me to make an algorithm... but this is how I would make this method if I were making this for myself.
    public void shuffle(){
        Collections.shuffle(deck);
    }

    //If the purpose of this one is to see my self created algorithms, then here:
    public void shuffleCustom(){
        Card[] cards = new Card[deck.size()];
        for (int i = 0; i < cards.length; i++) {
            cards[i] = deck.pop();
        }

        for (int i = 0; i < cards.length; i++) {
            //Math.random returns a number 0 <= x < 1
            // multiplying by 52 changes the range from 0 <= x < deck length.
            // adding one and cutting off the decimal gives us a perfect random integer in the range of 1<= x <= deck length
            int indexOfSwitch = (int)(Math.random()*deck.size()+1);
            Card temp = cards[i];
            cards[i] = cards[indexOfSwitch];
            cards[indexOfSwitch] = temp;

        }

        for (Card c: cards) {
            deck.add(c);
        }
    }

    // returns an array of cards drawn
    public Card[] drawMultiple(int numToBeDrawn){
       Card [] drawn = new Card[numToBeDrawn];
        for (int i = 0; i < numToBeDrawn; i++) {
            drawnCards.add(deck.peek());
            drawn[i] = deck.pop();
        }
        return drawn;
    }

    //returns single card
    public Card draw(){
        drawnCards.add(deck.peek());
        return deck.pop();
    }

    //cuts the deck in a random spot
    //this is a simi inefficient method. I might create a custom stack that can auto cut later.
    public void cut(){
        //Math.random returns a number 0 <= x < 1
        // multiplying by 52 changes the range from 0 <= x < deck length.
        // adding one and cutting off the decimal gives us a perfect random integer in the range of 1<= x <= deck length
        int indexOfCut = (int)(Math.random()*deck.size()+1);
        int sizeOfBottomHalf = deck.size() - indexOfCut;
        System.out.println(indexOfCut);
        Stack<Card> top = new Stack<>();
        Stack<Card> bottom = new Stack<>();

        //the first is flipped upside down into its own stack
        for (int i = 0; i < indexOfCut; i++) {
            top.add(deck.pop());
        }

        // same happens to the bottom half
        for (int i = 0; i < sizeOfBottomHalf; i++) {
            bottom.add(deck.pop());
        }

        //now the top half is flipped back into the original pile that is now empty.
        for (int i = 0; i < indexOfCut; i++) {
            deck.add(top.pop());
        }

        //same happens to the second half
        for (int i = 0; i < sizeOfBottomHalf; i++) {
            deck.add(bottom.pop());
        }

    }

    //generates a fresh unshuffled deck.
    public void newDeck(){
        while (deck.size()>0){
            deck.pop();
        }
        generateDeck();
    }

    //returns the stack of cards as if you were to draw the remaining cards one at a time.
    //used a traditional for loop instead of an enhanced one due to the enhanced flipping the order.
    @Override
    public String toString() {
        String output = "";
        //variable necessary because the deck size shrinks with each iteration of the for loop. If we used the method instead of the variable, then the loop would iterate exactly half (with integer division) as manny times as it needed to.
        int deckSize = deck.size();
        for (int i = 0; i < deckSize; i++) {
            Card c = deck.pop();
            output += c.id + " of " + c.suit + "\n";
        }
        return output;
    }
}
