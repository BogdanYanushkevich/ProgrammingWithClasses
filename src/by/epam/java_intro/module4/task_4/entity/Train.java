package by.epam.java_intro.module4.task_4.entity;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Train {

    private String destination;
    private int number;
    private GregorianCalendar time;

    public Train(String destination, int number, GregorianCalendar time) {
        this.destination = destination;
        this.number = number;
        this.time = time;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Calendar getTime() {
        return time;
    }

    public void setTime(GregorianCalendar time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Train{" +
                "destination='" + destination + '\'' +
                ", number=" + number +
                ", time=" + time +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Train train = (Train) o;

        if (number != train.number) return false;
        if (destination != null ? !destination.equals(train.destination) : train.destination != null) return false;
        return time != null ? time.equals(train.time) : train.time == null;
    }

    @Override
    public int hashCode() {
        int result = destination != null ? destination.hashCode() : 0;
        result = 31 * result + number;
        result = 31 * result + (time != null ? time.hashCode() : 0);
        return result;
    }


}
