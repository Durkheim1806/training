package cursus.javase.labs.h10.vraag9;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardController {

    private CardView view;
    private CardModel model;

    public CardController(CardView view, CardModel model) {

        this.view = view;
        this.model = model;

        this.view.updateCardTable(new CardListener());
    }

    class CardListener implements ActionListener {

        public void actionPerformed(ActionEvent arg0) {

            try {
                int cardID = view.getCardID();
                int amount = view.getAmount();
                model.pay(cardID, amount);
                model.fireTableDataChanged();
            } catch (NumberFormatException ex) {

            }
        }
    }
}
