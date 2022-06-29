package by.epam.java_intro.module4.aggregationAndComposition_task_5.entity;

import java.util.Objects;
import java.util.UUID;

public class Client {

    private final UUID uuid = UUID.randomUUID();
    private String surname;
    private String name;
    private String patronymic;

    private TouristVoucher touristVoucher;


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


    public void addTouristVoucher(TouristVoucher touristVoucher) {
        this.touristVoucher = touristVoucher;
    }

    public void setTouristVoucher(TouristVoucher touristVoucher) {
        this.touristVoucher = touristVoucher;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Client client)) return false;
        return getUuid().equals(client.getUuid()) && getSurname().equals(client.getSurname()) && getName().equals(client.getName()) && getPatronymic().equals(client.getPatronymic()) && Objects.equals(touristVoucher, client.touristVoucher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUuid(), getSurname(), getName(), getPatronymic(), touristVoucher);
    }

    @Override
    public String toString() {
        return "------------------------------------------------------------------------------------- \n" +
                "Client: " + "UUID: " + uuid + '\n' +
                "Surname: " + surname + '\n' +
                "Name: " + name + '\n' +
                "Patronymic: " + patronymic + '\n'+
                "------------------------------------------------------------------------------------- \n";
    }
}