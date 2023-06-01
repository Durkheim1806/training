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
            totalPrice = totalPrice.add(i.get(j).getPrice());
        }
        System.out.println("De total prijs is: " + totalPrice);
        return o;
    }

    public void printCatalogusListYear() {
        for (int i = 0; i < catalogList.size(); i++) {
            System.out.println(catalogList.get(i).getYear());
        }
    }

    public void setCatalogList(List<Catalog> catalogList) {
        this.catalogList = catalogList;
    }

    public List<Catalog> getCatalogList() {
        return catalogList;
    }

}
