package cursus.javase.labs.h7;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bank {

    public static void withdraw(BankAccount ba, BigDecimal a){
        try {
            ba.setBalance(ba.getBalance().subtract(a));
        } catch(Exception e){
            System.out.println("Je kan niet minder dan 0 op de balans hebben.");
        }
    }
    public static void deposit(BankAccount ba, BigDecimal a){
        ba.setBalance(ba.getBalance().add(a));
    }
    public static void transfer(BankAccount baTo, BankAccount baFrom, BigDecimal a){
        withdraw(baFrom, a);
        deposit(baTo, a);
    }

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
        for(BankAccount ba : BankAccounts){
            System.out.println(ba.getAccountNumber());
            System.out.println(ba.calculateInterestForOneYear());
        }
    }
}
