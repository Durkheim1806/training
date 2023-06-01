package cursus.javase.labs.h10.vraag9;

public class RegularCard extends Card {

    public RegularCard(int cardId, String name, String address, String city, double credit) {
        super(cardId, name, address, city, credit);
    }

    @Override
    public void setDiscount(int discount) {
        throw new IllegalArgumentException("Regular card can't have discount.");
    }

    @Override
    public boolean pay(int amount) {
        if (getCredit() - (double) amount >= 0) {
            setCredit(getCredit() - (double) amount);
        } else {
            System.out.println("De balans kan niet minder zijn dan 0.");
            return false;
        }
        return true;
    }
}
