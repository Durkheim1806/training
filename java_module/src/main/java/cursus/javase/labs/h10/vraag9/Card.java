package cursus.javase.labs.h10.vraag9;

public abstract class Card {

    private int cardId;
    private String name;
    private String address;
    private String city;
    private double credit;

    private int discount;

    public Card(int cardId, String name, String address, String city, double credit) {
        this.cardId = cardId;
        this.name = name;
        this.address = address;
        this.city = city;
        this.credit = credit;
    }

    public abstract boolean pay(int amount);

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public int getCardId() {
        return cardId;
    }

    public String getName() {
        return name;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardId=" + cardId +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", credit=" + credit +
                '}';
    }
}
