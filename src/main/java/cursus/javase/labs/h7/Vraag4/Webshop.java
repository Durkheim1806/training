package cursus.javase.labs.h7.Vraag4;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Webshop {

    private List<Catalog> catalogList = new ArrayList<>();

    public Order orderItems(List<Item> i) {
        Order o = new Order(i);
        o.setOrderDate(LocalDate.now());
        BigDecimal test = i.get(0).getPrice();
        BigDecimal totalPrice = new BigDecimal("0");
        for (int j = 0; j < i.size(); j++) {
            totalPrice.add(i.get(j).getPrice());
        }
        return o;
    }


}
