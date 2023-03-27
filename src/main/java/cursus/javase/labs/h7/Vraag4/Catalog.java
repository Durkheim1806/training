package cursus.javase.labs.h7.Vraag4;

import java.util.List;

public class Catalog {
    private List<Item> itemsOfCatalog;
    private int year;

    public Catalog(List<Item> i, int y){
        setItemsOfCatalog(i);
        setYear(y);
    }

    public void setItemsOfCatalog(List<Item> itemsOfCatalog) {
        this.itemsOfCatalog = itemsOfCatalog;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public List<Item> getItemsOfCatalog() {
        return itemsOfCatalog;
    }
}
