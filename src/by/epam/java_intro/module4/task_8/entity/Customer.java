package by.epam.java_intro.module4.task_8.entity;

import java.util.UUID;

public class Customer {


    private final UUID ID = UUID.randomUUID();
    private String surname;
    private String name;
    private String patronymic;
    public String address;
    private long creditCardNumber;
    private long bankAccountNumber;


    public Customer() {
        super();
    }

    public Customer(String surname, String name, String patronymic, String address, long creditCardNumber, long bankAccountNumber) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.creditCardNumber = creditCardNumber;
        this.bankAccountNumber = bankAccountNumber;
    }

    public UUID getId() {
        return ID;
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

    public String getAdres() {
        return address;
    }

    public void setAdres(String adres) {
        this.address = adres;
    }

    public long getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(long creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public long getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(long bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    @Override
    public boolean equals(Object sumObj) {
        if (this == sumObj) {
            return true;
        }
        if (sumObj == null) {
            return false;
        }
        if (sumObj.getClass() != this.getClass()) {
            return false;
        }
        Customer other = (Customer) sumObj;

        if (surname == null) {
            if (other.surname != null) {
                return false;
            }
        } else return !surname.equals(other.surname);


        if (name == null) {
            if (other.name != null) {
                return false;
            }
        } else return !name.equals(other.name);


        if (patronymic == null) {
            if (other.patronymic != null) {
                return false;
            }
        } else return !patronymic.equals(other.patronymic);


        if (address == null) {
            if (other.address != null) {
                return false;
            }
        } else return !address.equals(other.address);


        return this.ID.equals(other.ID) && this.creditCardNumber == other.creditCardNumber && this.bankAccountNumber == other.bankAccountNumber;

    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((surname == null) ? 0 : surname.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((patronymic == null) ? 0 : patronymic.hashCode());
        result = prime * result + ((address == null) ? 0 : address.hashCode());
        result = prime * result + ((creditCardNumber == 0) ? 0 : Long.valueOf(creditCardNumber).hashCode());
        result = prime * result + ((bankAccountNumber == 0) ? 0 : Long.valueOf(bankAccountNumber).hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "Customer: " +
                "\n id = " + ID +
                "\n surname = " + surname +
                "\n name = " + name +
                "\n patronymic = " + patronymic +
                "\n adres = " + address +
                "\n creditCardNumber = " + creditCardNumber +
                "\n bankAccountNumber = " + bankAccountNumber;
    }
}




