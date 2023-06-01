package cursus.javase.labs.h10.vraag9;

public class GoldCard extends Card {

    private int discount;

    public GoldCard(int cardId, String name, String address, String city, double credit) {
        super(cardId, name, address, city, credit);
    }

    public GoldCard(int cardId, String name, String address, String city, double credit, int discount) {
        super(cardId, name, address, city, credit);
        setDiscount(discount);
    }

    @Override
    public boolean pay(int amount) {
        double discount = 1.00 - ((double) getDiscount() / 100.00);
        setCredit(getCredit() - ((double) amount * discount));
        return true;
    }

    public void setDiscount(int discount) {
        if (discount > 0 && discount <= 30) {
            this.discount = discount;
        } else {
            throw new IllegalArgumentException("invalid discount");
        }
    }

    public int getDiscount() {
        return discount;
    }

}
