package cursus.javase.labs.h11.vraag7;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static java.math.BigDecimal.ZERO;

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

    public BankAccount openAcccount(User user, AccountType accountType) {
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
        BankAccount bankAccount = createAccount(accountType, newAccountNumber, new BigDecimal("0"), new BigDecimal("2"));
        bankAccounts.add(bankAccount);
        return bankAccount;
    }

    public void addBankAccount(BankAccount ba) {
        this.bankAccounts.add(ba);
        ba.setBank(this);
    }

    public void setBankAccounts(List<BankAccount> bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

    public List<BankAccount> getBankAccounts() {
        return bankAccounts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract class BankAccount {
        private int accountNumber;
        private BigDecimal balance;
        private BigDecimal interest;
        private Bank bank;
        private User user;

        public BankAccount() {
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
            user.setBankAccount(this);
        }

        public BankAccount(int a, BigDecimal balance, BigDecimal i, User u, Bank bank) {
            setAccountNumber(a);
            setBalance(balance);
            setInterest(i);
            setUser(u);
            user.setBankAccount(this);
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

    private class CheckingAccount extends BankAccount {
        CheckingAccount(int accountNumber, BigDecimal balance, BigDecimal interest) {
            super(accountNumber, balance, interest);
        }

    }

    private class SavingsAccount extends BankAccount {
        SavingsAccount(int accountNumber, BigDecimal balance, BigDecimal interest) {
            super(accountNumber, balance, interest);
        }
    }


    public BankAccount createAccount(AccountType accountType, int accountNumber, BigDecimal balance, BigDecimal interest) {
        switch (accountType) {
            case CHECKING:
                return new CheckingAccount(accountNumber, balance, interest);
            case SAVINGS:
                return new SavingsAccount(accountNumber, balance, interest);
        }
        return null;
    }

}
