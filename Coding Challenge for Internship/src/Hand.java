import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Hand implements Comparable<Hand>{

    private ArrayList<Card> hand;

    public Hand(){
        hand = new ArrayList<>();
    }

    public void add(Card card){
        hand.add(card);
    }

    public Card remove(int indexOfRemoval){
        return hand.get(indexOfRemoval);
    }

    public void sortHand(){
        Collections.sort(hand);
    }

    //this method is a steal method that is used in a lot of games
    public Card removeRandom(){
        return hand.remove(((int)(Math.random()*hand.size()+1)));
    }

    @Override
    public String toString() {
        String output = "";
        int handSize = hand.size();
        for (int i = 0; i < handSize; i++) {
            Card card = hand.get(i);
            output += card.id +" of "+card.suit;
            if(i!=handSize-1){
                output += " | ";
            }
        }
        return output;
    }

    @Override
    public int compareTo(Hand o) {
        Card handOneCards[] = new Card[5];
        Card handTwoCards[] = new Card[5];
        for (int i = 0; i < 5; i++) {
            handOneCards[i]=this.remove(i);
            handTwoCards[i]=o.remove(i);
        }


        Arrays.sort(handOneCards);
        Arrays.sort(handTwoCards);
        if(straightFlush(handTwoCards) != straightFlush(handOneCards)){
            return straightFlush(handTwoCards) - straightFlush(handOneCards);
        }

        if(fourOfAKind(handTwoCards) != fourOfAKind(handOneCards)){
            return fourOfAKind(handTwoCards) - fourOfAKind(handOneCards);
        }
        if(fullHouse(handTwoCards) != fullHouse(handOneCards)){
            return fullHouse(handTwoCards) - fullHouse(handOneCards);
        }

        if(flush(handTwoCards) != flush(handOneCards)){
            return flush(handTwoCards) - flush(handOneCards);
        }

        if(straight(handTwoCards) != straight(handOneCards)){
            return straight(handTwoCards) - straight(handOneCards);
        }

        if (threeOfAKind(handTwoCards) != threeOfAKind(handOneCards)){
            return threeOfAKind(handTwoCards) - threeOfAKind(handOneCards);
        }

        if (twoPair(handTwoCards) != twoPair(handOneCards)){
            return twoPair(handTwoCards) - twoPair(handOneCards);
        }

        if (onePair(handTwoCards) != onePair(handOneCards)){
            return onePair(handTwoCards) - onePair(handOneCards);
        }

        if (highCard(handTwoCards) != highCard(handOneCards)){
            return highCard(handTwoCards) - highCard(handOneCards);
        }

        return 0;
    }

    public int straightFlush(Card[] hand){
        String suit = hand[0].suit;
        for (int i = 0; i < 5; i++) {
            if(!(suit.equals(hand[i].suit))) return -1;
        }

        if (hand[0].numID==2&&hand[1].numID==3&&hand[2].numID==4&&hand[3].numID==5&&hand[4].numID==13){
            return 100 + 5; //this is the odd case where the ace is used as a 1
        }

        int smallest = hand[0].numID;
        for (int i = 0; i < 5; i++) {
            if ((smallest+i)!=hand[i].numID) return -1;
        }

        return 100 + hand[4].numID; //Score is determined by if it is a flush(yes = +100) and what the highest card number is
    }

    public int fourOfAKind(Card[] hand){

        // score is whatever card the four of a kind is plus the less significant other card
        if ((hand[0].numID==hand[3].numID)){
            return hand[0].numID*100+hand[4].numID;
        }
        if(hand[1].numID==hand[4].numID){
            return  hand[4].numID*100+hand[0].numID;
        }
        return -1;
    }

    public int fullHouse(Card[] hand){
        if ((hand[0].numID==hand[2].numID)&&(hand[3].numID==hand[4].numID)){
            return hand[0].numID*100+hand[4].numID;
        }
        if(hand[2].numID==hand[4].numID&&(hand[0].numID==hand[1].numID)){
            return  hand[4].numID*100+hand[0].numID;
        }
        return -1;
    }

    public int flush(Card[] hand){
        String suit = hand[0].suit;
        for (int i = 0; i < 5; i++) {
            if(!(suit.equals(hand[i].suit))) return -1;
        }
        return hand[0].numID+hand[1].numID*10+hand[2].numID*100+hand[3].numID*1000+hand[4].numID*10000;
    }

    public int straight(Card[] hand){
        if (hand[0].numID==2&&hand[1].numID==3&&hand[2].numID==4&&hand[3].numID==5&&hand[4].numID==13){
            return 100 + 5; //this is the odd case where the ace is used as a 1
        }

        int smallest = hand[0].numID;
        for (int i = 0; i < 5; i++) {
            if ((smallest+i)!=hand[i].numID) return -1;
        }

        return 100 + hand[4].numID; //Score is determined by if it is a flush(yes = +100) and what the highest card number is
    }

    public int threeOfAKind(Card[] hand){
        if ((hand[0].numID==hand[2].numID)){
            return hand[0].numID*100 + ((hand[3].numID<hand[4].numID)? hand[4].numID * 10 + hand[3].numID:hand[3].numID * 10 + hand[4].numID) ;
        }
        if(hand[1].numID==hand[3].numID){
            return hand[1].numID*100 + ((hand[0].numID<hand[4].numID)? hand[4].numID * 10 + hand[0].numID:hand[0].numID * 10 + hand[4].numID) ;
        }
        if(hand[2].numID==hand[4].numID){
            return hand[2].numID*100 + ((hand[0].numID<hand[1].numID)? hand[1].numID * 10 + hand[0].numID:hand[0].numID * 10 + hand[1].numID) ;
        }
        return -1;
    }

    public int twoPair(Card[] hand){
        if ((hand[0].numID==hand[1].numID)&&(hand[2].numID==hand[3].numID)){
            return (hand[0].numID<hand[2].numID)? hand[2].numID*100+hand[0].numID*10+hand[4].numID: hand[0].numID*100+hand[2].numID*10+hand[4].numID;
        }
        if(hand[0].numID==hand[1].numID&&(hand[3].numID==hand[4].numID)){
            return (hand[0].numID<hand[3].numID)? hand[3].numID*100+hand[0].numID*10+hand[2].numID: hand[0].numID*100+hand[3].numID*10+hand[2].numID;
        }
        if(hand[1].numID==hand[2].numID&&(hand[3].numID==hand[4].numID)){
            return (hand[1].numID<hand[3].numID)? hand[3].numID*100+hand[1].numID*10+hand[0].numID: hand[1].numID*100+hand[3].numID*10+hand[0].numID;
        }
        return -1;
    }

    public int onePair(Card[] hand){
        int tot = -1;
        int marker = -1;
        boolean pair = false;
        for (int i = 0; i < 4; i++) {
            if(hand[i].numID==hand[i+1].numID){
                tot = hand[i].numID*10000000;
                marker = i;
                pair = true;
            }
        }
        if(pair) {
            for (int i = 4; i > marker + 1; i--) {
                tot += hand[i].numID * ((int) Math.pow(10, i));
            }
            for (int i = marker - 1; i > -1; i--) {
                tot += hand[i].numID * ((int) Math.pow(10, i));
            }
        }
        return tot;
    }

    public int highCard(Card[] hand){
        int tot = 0;
        for (int i = 4; i > -1; i--) {
            tot += hand[i].numID* ((int) Math.pow(10,i));
        }
        return tot;
    }


}
