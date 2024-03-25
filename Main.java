import kingdomkards.Card;
import kingdomkards.Card.Values;
import kingdomkards.Card.Suits;
import kingdomkards.Card.Colors;


public class Main {

    public static void main(String[] args) {
        Card kos = new Card(Values.KING, Suits.SPADES);
        System.out.println(kos);
    }
    
}
