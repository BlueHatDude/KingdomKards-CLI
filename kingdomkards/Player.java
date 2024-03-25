package kingdomkards;
import kingdomkards.Card;
import kingdomkards.Card.Suits;
import kingdomkards.Card.Values;


public class Player {

    private int points;
    private Card[] deck = new Card[52];

    private void initDeck() {
        /* Spades */
        deck[0].setType(Values.ACE, Suits.SPADES);
        deck[1].setType(Values.TWO, Suits.SPADES);
        deck[2].setType(Values.THREE, Suits.SPADES);
        deck[3].setType(Values.FOUR, Suits.SPADES);
        deck[4].setType(Values.FIVE, Suits.SPADES);
        deck[5].setType(Values.SIX, Suits.SPADES);
        deck[6].setType(Values.SEVEN, Suits.SPADES);
        deck[7].setType(Values.EIGHT, Suits.SPADES);
        deck[8].setType(Values.NINE, Suits.SPADES);
        deck[9].setType(Values.TEN, Suits.SPADES);
        deck[10].setType(Values.JACK, Suits.SPADES);
        deck[11].setType(Values.QUEEN, Suits.SPADES);
        deck[12].setType(Values.KING, Suits.SPADES); 
        /* Clubs */
        /* Hearts */
        /* Diamonds */
    }

    public void shuffleDeck() {
        
    }

    public Player() {
        this.points = 100;
    }
    
}
