package cursus.javase.labs.h10.vraag9;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class CardModel extends AbstractTableModel {

    List<Card> cardList;
    String headerList[] = new String[]{"CardID", "Name", "Credit", "Discount"};

    public CardModel(List list) {
        cardList = list;
    }


    @Override
    public int getRowCount() {
        return cardList.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Card card = null;
        card = cardList.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return card.getCardId();
            case 1:
                return card.getName();
            case 2:
                return card.getCredit();
            case 3:
                return card.getDiscount();
            default:
                return "";
        }
    }

    public void pay(int cardId, int amount) {
        Card c = cardList.stream()
                .filter(card -> cardId == (card.getCardId()))
                .findAny()
                .orElse(null);
        c.pay(amount);
    }

    public String getColumnName(int col) {
        return headerList[col];
    }
}
