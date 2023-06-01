package cursus.javase.labs.h11.vraag7;

public class User {
    private String name;
    private Bank.BankAccount bankAccount;

    User(String n) {
        setName(n);
    }

    @Override
    public String toString() {
        return getName();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBankAccount(Bank.BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public Bank.BankAccount getBankAccount() {
        return bankAccount;
    }
}
