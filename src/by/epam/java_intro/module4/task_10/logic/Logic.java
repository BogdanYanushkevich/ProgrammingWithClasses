package by.epam.java_intro.module4.task_10.logic;

import by.epam.java_intro.module4.task_10.entity.Airline;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Logic {

    public List<Airline> sortByDestination(String destination, List<Airline> someAirlines) {

        List<Airline> sortedAirlines = new ArrayList<>();

        for (Airline someAirline : someAirlines) {
            if (someAirline.getDestination().equalsIgnoreCase(destination)) {
                sortedAirlines.add(someAirline);
            }
        }

        return sortedAirlines;
    }


    public List<Airline> sortByDayOfWeek(String dayOfWeek, List<Airline> someAirlines) {
        List<Airline> sortedAirlines = new ArrayList<>();
        for (Airline airline : someAirlines) {
            String[] days = airline.getDays().split(", ");
            for (String day : days) {
                if (day.equalsIgnoreCase(dayOfWeek)) {
                    sortedAirlines.add(airline);
                }
            }
        }

        return sortedAirlines;
    }

    public List<Airline> sortByDAyOfWeekAndTime(String dayOfWeek, LocalTime time, List<Airline> someAirlines) {
        List<Airline> sortedAirlines = sortByDayOfWeek(dayOfWeek, someAirlines);
        List<Airline>sortedByTimeAirlines = new ArrayList<>();

        for (Airline sortedAirline : sortedAirlines) {
            if (sortedAirline.getTime().isAfter(time)) {
                sortedByTimeAirlines.add(sortedAirline);
            }
        }
        return sortedByTimeAirlines;
    }
}
