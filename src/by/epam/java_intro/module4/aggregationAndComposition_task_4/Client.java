package by.epam.java_intro.module4.aggregationAndComposition_task_4;

import java.util.*;

public class Client {

    private final UUID uuid = UUID.randomUUID();
    private String surname;
    private String name;
    private String patronymic;

    private final List<BankAccount> bankAccounts;

    {
        bankAccounts = new ArrayList<>();
    }

    public Client() {
        super();
    }

    public Client(String surname, String name, String patronymic) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;

    }

    public UUID getUuid() {
        return uuid;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }


    public void addBankAccount(BankAccount bankAccount) {
        this.bankAccounts.add(bankAccount);
    }

    public List<BankAccount> getBankAccounts() {
        return bankAccounts;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Client client)) return false;
        return Objects.equals(getUuid(), client.getUuid()) && getSurname().equals(client.getSurname()) && getName().equals(client.getName()) && getPatronymic().equals(client.getPatronymic());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUuid(), getSurname(), getName(), getPatronymic());
    }

    @Override
    public String toString() {
        return "Client : " + "\n" +
                "UUID : " + uuid + "\n" +
                "Surname : " + surname + '\n' +
                "Name : " + name + '\n' +
                "Patronymic : " + patronymic + '\n';
    }
}
