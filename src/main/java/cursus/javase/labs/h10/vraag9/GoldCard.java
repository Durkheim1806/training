package cursus.javase.labs.h10.vraag9;

public class GoldCard extends Card {

    private int discount;

    public GoldCard(int cardId, String name, String address, String city, double credit) {
        super(cardId, name, address, city, credit);
    }

    @Override
    public boolean pay(int amount) {
        setCredit(getCredit() - (double) amount);
        return true;
    }

    public void setDiscount(int discount) {
        if (discount > 0 && discount > 31) {
            this.discount = discount;
        } else {
            throw new IllegalArgumentException("invalid discount");
        }
    }
}
