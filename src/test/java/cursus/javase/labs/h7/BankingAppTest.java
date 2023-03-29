package cursus.javase.labs.h7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class BankingAppTest {

    @Test
    void transfer() {
        Bank bank1 = new Bank("ING");
        User sjaak = new User("Sjaak");
        User john = new User("John");
        BankAccount ba1 = bank1.openAcccount(sjaak);
        BankAccount ba2 = bank1.openAcccount(john);
        bank1.openAcccount(sjaak);
        bank1.openAcccount(john);
        bank1.transfer(ba1, ba2, new BigDecimal("100"));

        Assertions.assertTrue(ba1.getBalance().compareTo(BigDecimal.ZERO) > 0);

        bank1.deposit(ba1, new BigDecimal("500"));
        bank1.transfer(ba1, ba2, new BigDecimal("600"));

        Assertions.assertTrue(ba1.getBalance().compareTo(BigDecimal.ZERO) > 0);


    }

}
