package cursus.javase.labs.h10.vraag9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class GoldCardTest {

    @Test
    public void givenDiscountMoreThan30Exception() {
        GoldCard gc = new GoldCard(1, "piet", "straat 5", "grongingen", 0.0);
        assertThrows(IllegalArgumentException.class, () -> gc.setDiscount(35));
    }

    @Test
    public void givenPaymentDiscountShouldWork() {
        GoldCard gc = new GoldCard(1, "piet", "straat 5", "grongingen", 100.0);
        gc.setDiscount(25);
        gc.pay(100);
        var actual = gc.getCredit();
        assertEquals(25, actual);
    }

}