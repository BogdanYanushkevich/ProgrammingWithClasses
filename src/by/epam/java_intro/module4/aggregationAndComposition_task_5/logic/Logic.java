package by.epam.java_intro.module4.aggregationAndComposition_task_5.logic;

import by.epam.java_intro.module4.aggregationAndComposition_task_5.enums.Food;
import by.epam.java_intro.module4.aggregationAndComposition_task_5.entity.TouristVoucher;
import by.epam.java_intro.module4.aggregationAndComposition_task_5.entity.TravelAgency;
import by.epam.java_intro.module4.aggregationAndComposition_task_5.enums.Purpose;
import by.epam.java_intro.module4.aggregationAndComposition_task_5.enums.Transport;

import java.util.ArrayList;
import java.util.List;

public class Logic {

    public List<TouristVoucher>sortByPurpose(TravelAgency travelAgency, Purpose purpose){
        List<TouristVoucher>sortedList = new ArrayList<>();
        for (int i = 0; i < travelAgency.getTouristVouchers().size(); i++){
            if(travelAgency.getTouristVouchers().get(i).getPurpose() == purpose){
                sortedList.add(travelAgency.getTouristVouchers().get(i));
            }
        }
        return sortedList;
    }

    public List<TouristVoucher>sortByTransport(TravelAgency travelAgency, Transport transport){
        List<TouristVoucher>sortedList = new ArrayList<>();
        for (int i = 0; i < travelAgency.getTouristVouchers().size(); i++){
            if(travelAgency.getTouristVouchers().get(i).getTransport() == transport){
                sortedList.add(travelAgency.getTouristVouchers().get(i));
            }
        }
        return sortedList;
    }

    public List<TouristVoucher>sortByFood(TravelAgency travelAgency, Food food){
        List<TouristVoucher>sortedList = new ArrayList<>();
        for (int i = 0; i < travelAgency.getTouristVouchers().size(); i++){
            if(travelAgency.getTouristVouchers().get(i).getFood() == food){
                sortedList.add(travelAgency.getTouristVouchers().get(i));
            }
        }
        return sortedList;
    }

    public List<TouristVoucher>sortByPrice(TravelAgency travelAgency, int price){
        List<TouristVoucher>sortedList = new ArrayList<>();
        for (int i = 0; i < travelAgency.getTouristVouchers().size(); i++){
            if(travelAgency.getTouristVouchers().get(i).getPrice() <= price){
                sortedList.add(travelAgency.getTouristVouchers().get(i));
            }
        }
        return sortedList;
    }

    public List<TouristVoucher>sortByDays(TravelAgency travelAgency, int days){
        List<TouristVoucher>sortedList = new ArrayList<>();
        for (int i = 0; i < travelAgency.getTouristVouchers().size(); i++){
            if(travelAgency.getTouristVouchers().get(i).getNumberOfDays() >= days){
                sortedList.add(travelAgency.getTouristVouchers().get(i));
            }
        }
        return sortedList;
    }

}
