package cursus.javase.labs.h7;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bank {

    private String name;
    private List<BankAccount> bankAccounts = new ArrayList<>();
    public Bank(String n){
        setName(n);
    }
    @Override
    public String toString(){
        return getName();
    }

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
    public void addBankAccount(BankAccount ba){
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
