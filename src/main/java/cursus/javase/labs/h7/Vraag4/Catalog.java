package cursus.javase.labs.h7.Vraag4;

import java.util.ArrayList;
import java.util.List;

public class Catalog {
    private List<Item> itemsOfCatalog = new ArrayList<>();
    private int year;

    public Catalog(List<Item> i, int y) {
        setItemsOfCatalog(i);
        setYear(y);
    }

    public void browse() {
        List<Item> list = itemsOfCatalog;
        for (Item items : list) {
            System.out.println(items);
        }
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
