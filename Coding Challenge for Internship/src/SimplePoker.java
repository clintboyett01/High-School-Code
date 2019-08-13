import java.util.*;

public class SimplePoker extends Game{
    //After never playing poker and looking up the rules to texas hold'em, I decided to make a simplified version.
    //This version has no betting, and you are given one hand of cards.
    //Whoever has the highest ranking hand wins.
    //Not playing with wildcards
    int numberOfPlayers;
    Hand[] hands;
    public SimplePoker(int numOfPlayers){
        numberOfPlayers = numOfPlayers;
        hands = new Hand[numOfPlayers];
        setupDeck();
        deal();
    }


    @Override
    public void deal() {
        for (int i = 0; i < numberOfPlayers ; i++) {
            Hand hand = new Hand();
            for (int j = 0; j < 5; j++) {
                hand.add(deck.draw());
            }
            hand.sortHand();
            hands[i] = hand;
        }

    }

    public void play(){


        ArrayList<Hand> orderOfHands = new ArrayList<>();
        for (int i = 0; i < numberOfPlayers; i++) {
            System.out.println("Player "+(1+i)+"s hand is: " + hands[i]);
            orderOfHands.add(hands[i]);
        }
        int index = 1;
        Collections.sort(orderOfHands);
        HandIdentifier HI = new HandIdentifier();
        System.out.println();
        while(!orderOfHands.isEmpty()){
            Hand h = orderOfHands.remove(0);
            System.out.printf("%2d. %-80s %s\n",index++,h.toString(),HI.indentifyHand(h));
        }
    }


}

class HandIdentifier {

    public String indentifyHand(Hand hand){
        Card Cards[] = new Card[5];
        for (int i = 0; i < 5; i++) {
            Cards[i]=hand.remove(i);
        }
        if(straightFlush(Cards)){
            return "Straight Flush";
        }
        if(fourOfAKind(Cards)){
            return "Four of a kind";
        }
        if(fullHouse(Cards)){
            return "Full House";
        }
        if(flush(Cards)){
            return "Flush";
        }
        if(straight(Cards)){
            return "Straight";
        }
        if(threeOfAKind(Cards)){
            return "Three of a kind";
        }
        if(twoPair(Cards)){
            return "Two Pair";
        }
        if(onePair(Cards)){
            return "One Pair";
        }
        if(highCard(Cards)){
            return "High Card";
        }
        return "";
    }

    public boolean straightFlush(Card[] hand){
        String suit = hand[0].suit;
        for (int i = 0; i < 5; i++) {
            if(!(suit.equals(hand[i].suit))) return false;
        }

        if (hand[0].numID==2&&hand[1].numID==3&&hand[2].numID==4&&hand[3].numID==5&&hand[4].numID==13){
            return true; //this is the odd case where the ace is used as a 1
        }

        int smallest = hand[0].numID;
        for (int i = 0; i < 5; i++) {
            if ((smallest+i)!=hand[i].numID) return false;
        }

        return true;
    }

    public boolean fourOfAKind(Card[] hand){

        // score is whatever card the four of a kind is plus the less significant other card
        if ((hand[0].numID==hand[3].numID)){
            return true;
        }
        if(hand[1].numID==hand[4].numID){
            return  true;
        }
        return false;
    }

    public boolean fullHouse(Card[] hand){
        if ((hand[0].numID==hand[2].numID)&&(hand[3].numID==hand[4].numID)){
            return true;
        }
        if(hand[2].numID==hand[4].numID&&(hand[0].numID==hand[1].numID)){
            return  true;
        }
        return false;
    }

    public boolean flush(Card[] hand){
        String suit = hand[0].suit;
        for (int i = 0; i < 5; i++) {
            if(!(suit.equals(hand[i].suit))) return false;
        }
        return true;
    }

    public boolean straight(Card[] hand){
        if (hand[0].numID==2&&hand[1].numID==3&&hand[2].numID==4&&hand[3].numID==5&&hand[4].numID==13){
            return true;
        }

        int smallest = hand[0].numID;
        for (int i = 0; i < 5; i++) {
            if ((smallest+i)!=hand[i].numID) return false;
        }

        return true; //Score is determined by if it is a flush(yes = +100) and what the highest card number is
    }

    public boolean threeOfAKind(Card[] hand){
        if ((hand[0].numID==hand[2].numID)){
            return true ;
        }
        if(hand[1].numID==hand[3].numID){
            return true ;
        }
        if(hand[2].numID==hand[4].numID){
            return true ;
        }
        return false;
    }

    public boolean twoPair(Card[] hand){
        if ((hand[0].numID==hand[1].numID)&&(hand[2].numID==hand[3].numID)){
            return true;
        }
        if(hand[0].numID==hand[1].numID&&(hand[3].numID==hand[4].numID)){
            return true;
        }
        if(hand[1].numID==hand[2].numID&&(hand[3].numID==hand[4].numID)){
            return true;
        }
        return false;
    }

    public boolean onePair(Card[] hand){
        int tot = -1;
        int marker = -1;
        boolean pair = false;
        for (int i = 0; i < 4; i++) {
            if(hand[i].numID==hand[i+1].numID){
                tot = hand[i].numID*10000;
                marker = i;
                pair = true;
            }
        }
        if(pair) {
            for (int i = 4; i > marker + 1; i--) {
                tot += hand[i].numID * ((int) Math.pow(10, i+3));
            }
            for (int i = marker - 1; i > -1; i--) {
                tot += hand[i].numID * ((int) Math.pow(10, i+3));
            }
        }
        return pair;
    }

    public boolean highCard(Card[] hand){
        int tot = 0;
        for (int i = 4; i > -1; i--) {
            tot += hand[i].numID* ((int) Math.pow(10,i));
        }
        return true;
    }


}