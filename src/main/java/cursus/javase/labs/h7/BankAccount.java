package cursus.javase.labs.h7;

import java.math.BigDecimal;

public class BankAccount {

    private int accountNumber;
    private BigDecimal balance;
    private BigDecimal interest;

    public BankAccount(int a, BigDecimal b, BigDecimal i){
        setAccountNumber(a);
        setBalance(b);
        setInterest(i);
    }

    public BigDecimal calculateInterestForOneYear(){
        return getInterest().divide(new BigDecimal("100")).multiply(getBalance());
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setBalance(BigDecimal balance) {
        if(balance.compareTo(new BigDecimal("0")) > 0){
        this.balance = balance;
        } else{
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
}
