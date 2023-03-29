package cursus.javase.labs.h7;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Arrays;
import java.util.List;


public class BankingApp {

    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount(00001, new BigDecimal("1000"), new BigDecimal("1.3476341"));
        BankAccount ba2 = new BankAccount(00002, new BigDecimal("1000"), new BigDecimal("2"));
        BankAccount ba3 = new BankAccount(00003, new BigDecimal("1000"), new BigDecimal("2"));
        BankAccount ba4 = new BankAccount(00004, new BigDecimal("1000"), new BigDecimal("2"));
        BankAccount ba5 = new BankAccount(00005, new BigDecimal("1000"), new BigDecimal("2"));
        System.out.println(ba1.getBalance());
        Bank bank1 = new Bank("Rabo");
        bank1.addBankAccount(ba1);
        bank1.addBankAccount(ba2);
        bank1.addBankAccount(ba3);
        bank1.addBankAccount(ba4);
        bank1.addBankAccount(ba5);
        bank1.withdraw(ba1, new BigDecimal("10"));
        System.out.println(ba1.getBalance());
        bank1.deposit(ba2, new BigDecimal("50"));
        System.out.println(ba2.getBalance());
        System.out.println(ba1.calculateInterestForOneYear());
        bank1.withdraw(ba3, new BigDecimal("2000"));
        bank1.transfer(ba4, ba5, new BigDecimal("100"));
        System.out.println(ba4.getBalance());
        System.out.println(ba5.getBalance());
        List<BankAccount> BankAccounts = Arrays.asList(ba1, ba2, ba3, ba4, ba5);
        for (BankAccount ba : BankAccounts) {
            System.out.println(ba.getAccountNumber());
            System.out.println(ba.calculateInterestForOneYear());
        }
        System.out.println(ba1.getBank());
        User fred = new User("Fred");
        BankAccount ba6 = bank1.openAcccount(fred);
        System.out.println(ba6);
        System.out.println(fred.getBankAccount());
        BigDecimal dec1 = new BigDecimal("1");
        BigDecimal dec2 = new BigDecimal("3");
        BigDecimal dec3 = dec1.divide(dec2, MathContext.DECIMAL128);
        System.out.println(dec3);
    }
}
