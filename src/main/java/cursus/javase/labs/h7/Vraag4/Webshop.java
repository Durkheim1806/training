package cursus.javase.labs.h7.Vraag4;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Webshop {

    static void browse(Catalog c){
        List<Item> list = c.getItemsOfCatalog();
        for(Item items :list){
            System.out.println(items);
        }
    }
    static Order orderItems(List<Item> i){
        Order o = new Order(i);
        o.setOrderDate(LocalDate.now());
        BigDecimal test = i.get(0).getPrice();
        BigDecimal totalPrice = new BigDecimal("0");
        for (int j = 0; j < i.size(); j++) {
            totalPrice.add(i.get(j).getPrice());
        }
        return o;
    }

    public static void main(String[] args) {
        Item i1 = new Item(0001, new BigDecimal("30"), "Boek");
        Item i2 = new Item(0002, new BigDecimal("7"), "Fles wijn");
        Item i3 = new Item(0003, new BigDecimal("5"), "Reep chocola");
        List<Item> il = Arrays.asList(i1, i2, i3);
        Catalog c2023 = new Catalog(il, 2023);
        browse(c2023);
        List<Item> bucket = Arrays.asList(i1);
        Order o1 = orderItems(bucket);
        System.out.println(o1.getOrderDate());
    }
}
