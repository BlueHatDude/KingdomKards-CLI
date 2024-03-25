package kingdomkards;

public class Card {

    public enum Values {
        ACE,
        TWO,
        THREE,
        FOUR,
        FIVE,
        SIX,
        SEVEN,
        EIGHT,
        NINE,
        TEN,
        JACK,
        QUEEN,
        KING
    };


    public enum Suits {
        SPADES,
        CLUBS,
        HEARTS,
        DIAMONDS
    };


    public enum Colors {
        BLACK,
        RED
    };


    private Values value;
    private Suits suit;
    private Colors color;


    public Card(Values value, Suits suit) {
        this.value = value;
        this.suit = suit;
        this.color = ( (this.suit == Suits.CLUBS) || (this.suit == Suits.SPADES) ) ? Colors.BLACK : Colors.RED ; 
    }

    
    private static final String valueToString(Values value) {
        switch (value) {
            case ACE: return "Ace";
            case TWO: return "Two";
            case THREE: return "Three";
            case FOUR: return "Four";
            case FIVE: return "Five";
            case SIX: return "Six";
            case SEVEN: return "Seven";
            case EIGHT: return "Eight";
            case NINE: return "Nine";
            case TEN: return "Ten";
            case JACK: return "Jack";
            case QUEEN: return "Queen";
            case KING: return "King";
            default: return null;   
        }
    }


    private static final String suitToString(Suits suit) {
        switch (suit) {
            case SPADES: return "Spades";
            case CLUBS: return "Clubs";
            case HEARTS: return "Hearts";
            case DIAMONDS: return "Diamonds";
            default: return null;
        }
    }
    
    
    private static final String colorToString(Colors color) {
        switch (color) {
            case BLACK: return "Black";
            case RED: return "Red";
            default: return null;
        }
    }


    @Override
    public String toString() {
        /* {color} {value} of {suit} */
        return colorToString(this.color) + " " + valueToString(this.value)
            + " of " + suitToString(this.suit);
    }


    public void setType(Values value, Suits suit) {
        this.value = value;
        this.suit = suit;
        this.color = ( (this.suit == Suits.CLUBS) || (this.suit == Suits.SPADES) ) ?
                        Colors.BLACK : Colors.RED ; 
    }
}
