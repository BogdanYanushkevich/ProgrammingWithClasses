package by.epam.java_intro.module4.aggregationAndComposition_task_4;

import java.util.Objects;

public class BankAccount {

    private String name;
    private long accountNumber;
    private long accountBalance;
    private int limits;
    private boolean accountStatusBlocked;
    private String currency;
    Client client;


    public BankAccount() {
        super();
    }

    public BankAccount(String name, long accountNumber, long accountBalance, int limits, boolean accountStatusBlocked, String currency, Client client) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.accountStatusBlocked = accountStatusBlocked;
        this.currency = currency;
        this.client = client;
        this.limits = limits;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(long accountBalance) {
        this.accountBalance = accountBalance;
    }

    public int getLimits() {
        return limits;
    }

    public void setLimits(int limits) {
        this.limits = limits;
    }

    public boolean isAccountStatusBlocked() {
        return accountStatusBlocked;
    }

    public void setAccountStatusBlocked(boolean accountStatusBlocked) {
        this.accountStatusBlocked = accountStatusBlocked;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Client getClient() {
        return client;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BankAccount that)) return false;
        return getAccountNumber() == that.getAccountNumber() && getAccountBalance() == that.getAccountBalance() && getLimits() == that.getLimits() && isAccountStatusBlocked() == that.isAccountStatusBlocked() && getName().equals(that.getName()) && getCurrency().equals(that.getCurrency());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAccountNumber(), getAccountBalance(), getLimits(), isAccountStatusBlocked(), getCurrency(), getClient());
    }

    @Override
    public String toString() {
        return "------------------------------------------------------------------------------------- \n"
                +"\n" + client.getName() + " " + client.getSurname() + " " + client.getPatronymic() +"\n" +
                "BankAccount : " + "\n" +
                "Name : " + name + "\n" +
                "AccountNumber : " + accountNumber + "\n" +
                "AccountBalance : " + accountBalance + "\n" +
                "Limits : " + limits + "\n" +
                "AccountStatusBlocked : " + accountStatusBlocked + "\n" +
                "Currency : " + currency + "\n";
    }
}
