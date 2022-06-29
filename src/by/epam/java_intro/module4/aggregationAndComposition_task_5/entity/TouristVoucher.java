package by.epam.java_intro.module4.aggregationAndComposition_task_5.entity;

import by.epam.java_intro.module4.aggregationAndComposition_task_5.enums.Food;
import by.epam.java_intro.module4.aggregationAndComposition_task_5.enums.Purpose;
import by.epam.java_intro.module4.aggregationAndComposition_task_5.enums.Transport;

import java.util.UUID;

public class TouristVoucher {

    private final UUID ID = UUID.randomUUID();

    private String city;
    private Purpose purpose;
    private Transport transport;
    private Food food;

    private int numberOfDays;

    private int price;

    private Client client;

    public TouristVoucher() {
        super();
    }

    public TouristVoucher(String city, Purpose purpose, Transport transport, Food food, int numberOfDays, int price) {
        this.city = city;
        this.purpose = purpose;
        this.transport = transport;
        this.food = food;
        this.numberOfDays = numberOfDays;
        this.price = price;
    }

    public UUID getID() {
        return ID;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Purpose getPurpose() {
        return purpose;
    }

    public void setPurpose(Purpose purpose) {
        this.purpose = purpose;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "------------------------------------------------------------------------------------- \n" +
                "TouristVouchers: " + "ID: " + ID + "\n" +
                "Country: " + city + "\n" +
                "Purpose: " + purpose + "\n" +
                "Transport: " + transport + "\n" +
                "Food: " + food + "\n"+
                "NumberOfDays: " + numberOfDays + "\n" +
                "Price: " + price + "$\n" +
                "------------------------------------------------------------------------------------- \n";
    }
}
