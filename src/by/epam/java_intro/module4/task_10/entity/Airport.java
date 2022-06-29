package by.epam.java_intro.module4.task_10.entity;

import java.util.ArrayList;
import java.util.List;

public class Airport {

    private final List<Airline> airlines;

    {
        airlines = new ArrayList<>();
    }

    public List<Airline> getAirlines() {
        return airlines;
    }

    public void addAirline(Airline airline) {
        airlines.add(airline);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + airlines.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Airport other = (Airport) obj;
        return airlines.equals(other.airlines);
    }


    @Override
    public String toString() {
        return "Airport " +
                "airlines = " + airlines;
    }
}
