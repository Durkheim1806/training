package cursus.javase.labs.h7.Vraag4;

import java.math.BigDecimal;

public class Item {
    private int id;
    private BigDecimal price;
    private String description;

    public Item(int i, BigDecimal p, String d){
        setId(i);
        setPrice(p);
        setDescription(d);
    }
    @Override
    public String toString(){
        return this.description + " " + this.price;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
