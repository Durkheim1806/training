package cursus.javase.labs.h11.vraag7;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class BankTest {

    @Test
    public void testBank() {
        Bank bank1 = new Bank("ING");
        Bank.BankAccount ba1 = bank1.createAccount(AccountType.CHECKING, 00001, new BigDecimal("1000"), new BigDecimal("2"));
        Bank.BankAccount ba2 = bank1.createAccount(AccountType.SAVINGS, 00002, new BigDecimal("1000"), new BigDecimal("2"));
        bank1.addBankAccount(ba1);
        bank1.addBankAccount(ba2);
        System.out.println(bank1.getBankAccounts());
        bank1.transfer(ba1, ba2, new BigDecimal("50"));
        System.out.println(ba1.getBalance());
    }

}