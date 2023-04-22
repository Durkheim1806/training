package cursus.javase.labs.h10.vraag9;

import java.util.ArrayList;
import java.util.List;

public class CardApp {

    public static void main(String[] args) {

        Card cardGerda = new RegularCard(1235, "Gerda", "-", "-", 1000.0);
        Card cardDonald = new GoldCard(1236, "Donald", "-", "-", 7000.0, 25);
        Card cardEdward = new RegularCard(1237, "Edward", "-", "-", 7000.0);
        Card cardPiet = new RegularCard(1238, "Piet", "-", "-", 5000.0);
        Card cardAnna = new RegularCard(1239, "Anna", "-", "-", 2000.0);
        List listOfCards = new ArrayList<>();
        listOfCards.add(cardGerda);
        listOfCards.add(cardDonald);
        listOfCards.add(cardEdward);
        listOfCards.add(cardPiet);
        listOfCards.add(cardAnna);
        CardView view = new CardView();
        CardModel model = new CardModel(listOfCards);
        view.showCardTable(model);
        CardController controller = new CardController(view, model);


    }


}
