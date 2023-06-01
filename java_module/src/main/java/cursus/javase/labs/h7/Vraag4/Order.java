package cursus.javase.labs.h7.Vraag4;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Order {
    private LocalDate orderDate;
    private List<Item> itemsOfOrder;
    private BigDecimal totalPrice;

    public Order(List<Item> iof){
        setItemsOfOrder(iof);
    }
    @Override
    public String toString(){
        return "total price is " + totalPrice;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public void setItemsOfOrder(List<Item> itemsOfOrder) {
        this.itemsOfOrder = itemsOfOrder;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }
}
