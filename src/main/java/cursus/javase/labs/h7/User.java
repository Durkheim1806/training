package cursus.javase.labs.h7;

public class User {
    private String name;
    private BankAccount bankAccount;

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

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }
}
