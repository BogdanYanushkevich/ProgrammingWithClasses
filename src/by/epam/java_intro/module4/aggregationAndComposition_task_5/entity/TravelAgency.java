package by.epam.java_intro.module4.aggregationAndComposition_task_5.entity;

import java.util.ArrayList;
import java.util.List;

public class TravelAgency {

   private final List<Client>clientList;
   private final List<TouristVoucher>touristVouchers;

   private String name;

    {
        clientList = new ArrayList<>();
        touristVouchers = new ArrayList<>();
    }

    public TravelAgency(){
        super();
    }

    public TravelAgency(String name){
        this.name = name;
    }


    public void addClient(Client client){
        clientList.add(client);
    }



    public List<Client> getClientList() {
        return clientList;
    }

    public void addTouristVoucher(TouristVoucher touristVoucher){
        touristVouchers.add(touristVoucher);
    }

    public List<TouristVoucher> getTouristVouchers() {
        return touristVouchers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
