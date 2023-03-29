package cursus.javase.labs.h7.Vraag4;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

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
        c2023.browse();
        c2020.browse();
        List<Item> bucket = Arrays.asList(i1);
        Order o1 = webshop1.orderItems(bucket);
        System.out.println(o1.getOrderDate());
    }
}
