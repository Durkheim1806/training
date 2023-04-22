package cursus.javase.labs.h9;

import cursus.javase.labs.h7.Bank;
import cursus.javase.labs.h7.User;

import java.math.BigDecimal;

import static java.math.BigDecimal.ZERO;

public class BankAccount {

    private int accountNumber;
    private BigDecimal balance;
    private BigDecimal interest;
    private Bank bank;
    private User user;

    public BankAccount(int accountNumber) {
        setAccountNumber(accountNumber);
    }

    public BankAccount(int a, BigDecimal b, BigDecimal i) {
        setAccountNumber(a);
        setBalance(b);
        setInterest(i);
    }

    public BankAccount(int a, BigDecimal b, BigDecimal i, User u) {
        setAccountNumber(a);
        setBalance(b);
        setInterest(i);
        setUser(u);
    }

    public BankAccount(int a, BigDecimal balance, BigDecimal i, User u, Bank bank) {
        setAccountNumber(a);
        setBalance(balance);
        setInterest(i);
        setUser(u);
        setBank(bank);
    }

    @Override
    public String toString() {
        return "Bank: " + bank + " Account number " + String.valueOf(getAccountNumber()) + " Name: " + user;
    }

    public BigDecimal calculateInterestForOneYear() {
        return getInterest().divide(new BigDecimal("100")).multiply(getBalance());
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(BigDecimal balance) {
        if (balance.compareTo(ZERO) >= 0) {
            this.balance = balance;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void setInterest(BigDecimal interest) {
        this.interest = interest;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public BigDecimal getInterest() {
        return interest;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public Bank getBank() {
        return bank;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }
}
