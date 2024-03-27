package kingdomkards;

import kingdomkards.Card;
import kingdomkards.Card.Suits;
import kingdomkards.Card.Values;

import java.util.ArrayList;
import java.util.Random;


public class Player {

    private int points;
    private int deckSize = 52; 
    private Card[] deck = new Card[deckSize];
    private ArrayList<Card> hand = new ArrayList<Card>();


    private void initDeck() {
        
        /* Spades */
        deck[0] = new Card(Values.ACE, Suits.SPADES);
        deck[1] = new Card(Values.TWO, Suits.SPADES);
        deck[2] = new Card(Values.THREE, Suits.SPADES);
        deck[3] = new Card(Values.FOUR, Suits.SPADES);
        deck[4] = new Card(Values.FIVE, Suits.SPADES);
        deck[5] = new Card(Values.SIX, Suits.SPADES);
        deck[6] = new Card(Values.SEVEN, Suits.SPADES);
        deck[7] = new Card(Values.EIGHT, Suits.SPADES);
        deck[8] = new Card(Values.NINE, Suits.SPADES);
        deck[9] = new Card(Values.TEN, Suits.SPADES);
        deck[10] = new Card(Values.JACK, Suits.SPADES);
        deck[11] = new Card(Values.QUEEN, Suits.SPADES);
        deck[12] = new Card(Values.KING, Suits.SPADES);
        
        /* Clubs */
        deck[13] = new Card(Values.ACE, Suits.CLUBS); 
        deck[14] = new Card(Values.TWO, Suits.CLUBS); 
        deck[15] = new Card(Values.THREE, Suits.CLUBS); 
        deck[16] = new Card(Values.FOUR, Suits.CLUBS); 
        deck[17] = new Card(Values.FIVE, Suits.CLUBS); 
        deck[18] = new Card(Values.SIX, Suits.CLUBS); 
        deck[19] = new Card(Values.SEVEN, Suits.CLUBS); 
        deck[20] = new Card(Values.EIGHT, Suits.CLUBS); 
        deck[21] = new Card(Values.NINE, Suits.CLUBS); 
        deck[22] = new Card(Values.TEN, Suits.CLUBS); 
        deck[23] = new Card(Values.JACK, Suits.CLUBS); 
        deck[24] = new Card(Values.QUEEN, Suits.CLUBS); 
        deck[25] = new Card(Values.KING, Suits.CLUBS);
      
        /* Hearts */
        deck[26] = new Card(Values.ACE, Suits.HEARTS);
        deck[27] = new Card(Values.TWO, Suits.HEARTS);
        deck[28] = new Card(Values.THREE, Suits.HEARTS);
        deck[29] = new Card(Values.FOUR, Suits.HEARTS);
        deck[30] = new Card(Values.FIVE, Suits.HEARTS);
        deck[31] = new Card(Values.SIX, Suits.HEARTS);
        deck[32] = new Card(Values.SEVEN, Suits.HEARTS);
        deck[33] = new Card(Values.EIGHT, Suits.HEARTS);
        deck[34] = new Card(Values.NINE, Suits.HEARTS);
        deck[35] = new Card(Values.TEN, Suits.HEARTS);
        deck[36] = new Card(Values.JACK, Suits.HEARTS);
        deck[37] = new Card(Values.QUEEN, Suits.HEARTS);
        deck[38] = new Card(Values.KING, Suits.HEARTS);
       
        /* Diamonds */
        deck[39] = new Card(Values.ACE, Suits.DIAMONDS);
        deck[40] = new Card(Values.TWO, Suits.DIAMONDS);
        deck[41] = new Card(Values.THREE, Suits.DIAMONDS);
        deck[42] = new Card(Values.FOUR, Suits.DIAMONDS);
        deck[43] = new Card(Values.FIVE, Suits.DIAMONDS);
        deck[44] = new Card(Values.SIX, Suits.DIAMONDS);
        deck[45] = new Card(Values.SEVEN, Suits.DIAMONDS);
        deck[46] = new Card(Values.EIGHT, Suits.DIAMONDS);
        deck[47] = new Card(Values.NINE, Suits.DIAMONDS);
        deck[48] = new Card(Values.TEN, Suits.DIAMONDS);
        deck[49] = new Card(Values.JACK, Suits.DIAMONDS);
        deck[50] = new Card(Values.QUEEN, Suits.DIAMONDS);
        deck[51] = new Card(Values.KING, Suits.DIAMONDS);

    }


    public void shuffleDeck() {
        Random generator = new Random();
        int randIndex;
        Card temp = new Card(Values.ACE, Suits.SPADES);

        for (int i = 0; i < deckSize; i++) {
            randIndex = generator.nextInt(deckSize);

            temp.copy(deck[i]);
            deck[i].copy(deck[randIndex]);
            deck[randIndex].copy(temp);
        }
    }


    public void initHand() {
        
        for (int i = 0; i < 5; i++) {

        }

    }


    public Player() {
        this.points = 100;
        initDeck();
        shuffleDeck();
    }

    
    public void drawCard() {

    }


    public void printDeck() {
        for (Card card : deck) {
            System.out.println(card);
        }
    }

}
