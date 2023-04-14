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
//        List<Item> list = itemsOfCatalog;
        System.out.printf("%10.10s %20.20s %10.10s", "id", "description", "price");
        System.out.println();
        for (Item items : itemsOfCatalog) {
            items.printItem();
            System.out.println();
        }
    }


    public void setItemsOfCatalog(List<Item> itemsOfCatalog) {
        this.itemsOfCatalog = itemsOfCatalog;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public List<Item> getItemsOfCatalog() {
        return itemsOfCatalog;
    }
}
