package cursus.javase.labs.h7;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Bank {

    private String name;
    private List<BankAccount> bankAccounts = new ArrayList<>();

    public Bank(String n) {
        setName(n);
    }


    @Override
    public String toString() {
        return getName();
    }

    public void withdraw(BankAccount ba, BigDecimal a) {
        try {
            ba.setBalance(ba.getBalance().subtract(a));
        } catch (Exception e) {
            System.out.println("Je kan niet minder dan 0 op de balans hebben.");
        }
    }

    public void deposit(BankAccount ba, BigDecimal a) {
        ba.setBalance(ba.getBalance().add(a));
    }

    public void transfer(BankAccount baTo, BankAccount baFrom, BigDecimal a) {
        withdraw(baFrom, a);
        deposit(baTo, a);
    }

    public BankAccount openAcccount(User user) {
        int newAccountNumber = 0;
        int accountNumberLoop = 0;
        if (bankAccounts.size() == 0) {
            newAccountNumber = 00001;
        } else {
            for (int i = 0; i < bankAccounts.size(); i++) {
                if (accountNumberLoop < bankAccounts.get(i).getAccountNumber()) {
                    accountNumberLoop = bankAccounts.get(i).getAccountNumber();
                }
            }
            newAccountNumber = ++accountNumberLoop;
        }
        BankAccount bankAcount = new BankAccount(newAccountNumber, new BigDecimal("0"), new BigDecimal("2"), user, this);
        bankAccounts.add(bankAcount);
        return bankAcount;
    }

    public void addBankAccount(BankAccount ba) {
        this.bankAccounts.add(ba);
        ba.setBank(this);
    }

    public void setBankAccounts(List<BankAccount> bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
