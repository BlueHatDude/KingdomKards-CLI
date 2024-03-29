package kingdomkards;

import kingdomkards.Card;
import kingdomkards.Card.Suits;
import kingdomkards.Card.Values;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Random;


public class Player {

    private int points;
    private int deckSize = 52;
    private Deque<Card> deck = new ArrayDeque<Card>();
    private ArrayList<Card> hand = new ArrayList<Card>();
    private ArrayList<Card> discardPile = new ArrayList<Card>();


    private void initDeck() {

        deck.add( new Card(Values.ACE, Suits.SPADES) );
        deck.add( new Card(Values.TWO, Suits.SPADES) );
        deck.add( new Card(Values.THREE, Suits.SPADES) );
        deck.add( new Card(Values.FOUR, Suits.SPADES) );
        deck.add( new Card(Values.FIVE, Suits.SPADES) );
        deck.add( new Card(Values.SIX, Suits.SPADES) );
        deck.add( new Card(Values.SEVEN, Suits.SPADES) );
        deck.add( new Card(Values.EIGHT, Suits.SPADES) );
        deck.add( new Card(Values.NINE, Suits.SPADES) );
        deck.add( new Card(Values.TEN, Suits.SPADES) );
        deck.add( new Card(Values.JACK, Suits.SPADES) );
        deck.add( new Card(Values.QUEEN, Suits.SPADES) );
        deck.add( new Card(Values.KING, Suits.SPADES) );
        deck.add( new Card(Values.ACE, Suits.CLUBS) ); 
        deck.add( new Card(Values.TWO, Suits.CLUBS) ); 
        deck.add( new Card(Values.THREE, Suits.CLUBS) ); 
        deck.add( new Card(Values.FOUR, Suits.CLUBS) ); 
        deck.add( new Card(Values.FIVE, Suits.CLUBS) ); 
        deck.add( new Card(Values.SIX, Suits.CLUBS) ); 
        deck.add( new Card(Values.SEVEN, Suits.CLUBS) ); 
        deck.add( new Card(Values.EIGHT, Suits.CLUBS) ); 
        deck.add( new Card(Values.NINE, Suits.CLUBS) ); 
        deck.add( new Card(Values.TEN, Suits.CLUBS) ); 
        deck.add( new Card(Values.JACK, Suits.CLUBS) ); 
        deck.add( new Card(Values.QUEEN, Suits.CLUBS) ); 
        deck.add( new Card(Values.KING, Suits.CLUBS) );
        deck.add( new Card(Values.ACE, Suits.HEARTS) );
        deck.add( new Card(Values.TWO, Suits.HEARTS) );
        deck.add( new Card(Values.THREE, Suits.HEARTS) );
        deck.add( new Card(Values.FOUR, Suits.HEARTS) );
        deck.add( new Card(Values.FIVE, Suits.HEARTS) );
        deck.add( new Card(Values.SIX, Suits.HEARTS) );
        deck.add( new Card(Values.SEVEN, Suits.HEARTS) );
        deck.add( new Card(Values.EIGHT, Suits.HEARTS) );
        deck.add( new Card(Values.NINE, Suits.HEARTS) );
        deck.add( new Card(Values.TEN, Suits.HEARTS) );
        deck.add( new Card(Values.JACK, Suits.HEARTS) );
        deck.add( new Card(Values.QUEEN, Suits.HEARTS) );
        deck.add( new Card(Values.KING, Suits.HEARTS) );
        deck.add( new Card(Values.ACE, Suits.DIAMONDS) );
        deck.add( new Card(Values.TWO, Suits.DIAMONDS) );
        deck.add( new Card(Values.THREE, Suits.DIAMONDS) );
        deck.add( new Card(Values.FOUR, Suits.DIAMONDS) );
        deck.add( new Card(Values.FIVE, Suits.DIAMONDS) );
        deck.add( new Card(Values.SIX, Suits.DIAMONDS) );
        deck.add( new Card(Values.SEVEN, Suits.DIAMONDS) );
        deck.add( new Card(Values.EIGHT, Suits.DIAMONDS) );
        deck.add( new Card(Values.NINE, Suits.DIAMONDS) );
        deck.add( new Card(Values.TEN, Suits.DIAMONDS) );
        deck.add( new Card(Values.JACK, Suits.DIAMONDS) );
        deck.add( new Card(Values.QUEEN, Suits.DIAMONDS) );
        deck.add( new Card(Values.KING, Suits.DIAMONDS) );

    }


    public void shuffleDeck() {
        ArrayList<Card> tempDeck = new ArrayList<Card>(deck);
        Collections.shuffle(tempDeck);
        deck = new ArrayDeque<>(tempDeck);
    }


    public void initHand() {
        
        for (int i = 0; i < 5; i++) {
            drawCard();
        }

    }


    public Player() {
        this.points = 100;
        initDeck();
        shuffleDeck();
        initHand();
    }

    
    public void drawCard() {
        if (deck.size() != 0) {
            hand.add(deck.pop());
        } else /* turn Discard Pile into new Deck */ {
            
        }
    }

    public void printHand() {
        for (int i = 0; i < hand.size(); i++) {
            System.out.println( (i + 1) + ": " + hand.get(i) );
        }
    }


    public void printDeck() {
        for (Card card : deck) {
            System.out.println(card);
        }
    }

}
