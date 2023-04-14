package cursus.javase.labs.h7.Vraag4;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class WebshopApp {

    public static void main(String[] args) {
        Webshop webshop1 = new Webshop();
        Item i1 = new Item(0001, new BigDecimal("30"), "Boek");
        Item i2 = new Item(0002, new BigDecimal("7"), "Fles wijn");
        Item i3 = new Item(0003, new BigDecimal("5"), "Reep chocola");
        List<Item> il1 = Arrays.asList(i1, i2, i3);
        Catalog c2023 = new Catalog(il1, 2023);
        Item i4 = new Item(0001, new BigDecimal("600"), "Drone");
        Item i5 = new Item(0002, new BigDecimal("300"), "Camera");
        Item i6 = new Item(0003, new BigDecimal("2000"), "Laptop");
        List<Item> il2 = Arrays.asList(i4, i5, i6);
        Catalog c2020 = new Catalog(il2, 2020);
        List<Catalog> catalogList = new ArrayList<>();
        catalogList.add(c2020);
        catalogList.add(c2023);
        webshop1.setCatalogList(catalogList);

        System.out.println("Welkom bij de webshop!");
        List<Item> bucket = new ArrayList<>();

        Scanner scan1 = new Scanner(System.in);
        int keuze = -1;
        while (keuze >= -1) {
            System.out.println("We hebben de volgende catalogussen:");
            webshop1.printCatalogusListYear();
            System.out.println("Welke catalogus wil je bekijken? Als je uit wil checken vul dan -2 in.");
            int catalogusOpvragen = keuze = scan1.nextInt();
            for (Catalog catalog : catalogList) {
                if (catalog.getYear() == catalogusOpvragen) {
                    catalog.browse();
                    int itemToevoegen = 0;
                    while (itemToevoegen >= 0) {
                        System.out.println("Wil je een item bestellen? Vul dan het id in. Wil je terug? Vul dan -1 in.");
                        itemToevoegen = scan1.nextInt();
                        for (Item item : catalog.getItemsOfCatalog()) {
                            if (item.getId() == itemToevoegen) {
                                bucket.add(item);
                            }
                        }
                        System.out.println("je hebt dit in je bucket:");
                        for (Item item : bucket) {
                            item.printItem();
                            System.out.println();
                        }
                    }
                }
            }
        }
        webshop1.orderItems(bucket);
    }
}
