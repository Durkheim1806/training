package cursus.javase.labs.h10.vraag9;

public abstract class Card {

    private int cardId;
    private String name;
    private String address;
    private String city;
    private double credit;

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
}
