package cursus.javase.labs.h7;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import cursus.javase.labs.h7.Bank.*;

import static cursus.javase.labs.h7.Bank.*;

public class BankingApp {

    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount(00001, new BigDecimal("1000"), new BigDecimal("2"));
        BankAccount ba2 = new BankAccount(00002, new BigDecimal("1000"), new BigDecimal("2"));
        BankAccount ba3 = new BankAccount(00003, new BigDecimal("1000"), new BigDecimal("2"));
        BankAccount ba4 = new BankAccount(00004, new BigDecimal("1000"), new BigDecimal("2"));
        BankAccount ba5 = new BankAccount(00005, new BigDecimal("1000"), new BigDecimal("2"));
        System.out.println(ba1.getBalance());
        withdraw(ba1, new BigDecimal("10"));
        System.out.println(ba1.getBalance());
        deposit(ba2, new BigDecimal("50"));
        System.out.println(ba2.getBalance());
        System.out.println(ba1.calculateInterestForOneYear());
        withdraw(ba3, new BigDecimal("2000"));
        transfer(ba4, ba5, new BigDecimal("100"));
        System.out.println(ba4.getBalance());
        System.out.println(ba5.getBalance());
        List<BankAccount> BankAccounts = Arrays.asList(ba1, ba2, ba3, ba4, ba5);
        Bank bank1 = new Bank("SNS");
        bank1.addBankAccount(ba1);
        System.out.println(ba1.getBank());
        for(BankAccount ba : BankAccounts){
            System.out.println(ba.getAccountNumber());
            System.out.println(ba.calculateInterestForOneYear());
        }
    }
}
