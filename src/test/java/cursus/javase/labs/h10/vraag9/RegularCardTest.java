package cursus.javase.labs.h10.vraag9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RegularCardTest {

    @Test
    public void givenAmountMoreThenBalancePayShouldNotWork() {
        RegularCard rg = new RegularCard(1, "piet", "straat 5", "grongingen", 0.0);
        rg.pay(50);
        assertTrue(rg.getCredit() >= 0);
    }

    @Test
    public void givenAmountLessThenBalancePayShouldWork() {
        RegularCard rg = new RegularCard(1, "piet", "straat 5", "grongingen", 50.0);
        rg.pay(25);
        var actual = rg.getCredit();
        assertEquals(25, actual);
    }

}