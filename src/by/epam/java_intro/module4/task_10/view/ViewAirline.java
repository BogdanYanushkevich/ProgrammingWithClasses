package by.epam.java_intro.module4.task_10.view;


import by.epam.java_intro.module4.task_10.entity.Airline;

import java.util.List;

public class ViewAirline {

    public void print(String message, List<Airline> airlines) {

        System.out.println(message);
        for (Airline airline : airlines) {
            System.out.println(airline);
        }
    }
}
