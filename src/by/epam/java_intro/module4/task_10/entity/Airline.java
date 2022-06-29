package by.epam.java_intro.module4.task_10.entity;

import java.time.LocalTime;

public class Airline {

    private String destination;
    private  int flightNumber;
    private String aircraftType;
    private LocalTime time;
    private String days;

    public Airline(String destination, int flightNumber, String aircraftType, LocalTime time, String days) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.aircraftType = aircraftType;
        this.time = time;
        this.days = days;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
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
        Airline other = (Airline) sumObj;

        if (destination == null) {
            if (other.destination != null) {
                return false;
            }
        } else return !destination.equals(other.destination);


        if (aircraftType == null) {
            if (other.aircraftType != null) {
                return false;
            }
        } else return !aircraftType.equals(other.aircraftType);


        if (days == null) {
            if (other.days != null) {
                return false;
            }
        } else return !days.equals(other.days);


        if (time == null) {
            if (other.time != null) {
                return false;
            }
        } else return !time.equals(other.time);


        return this.flightNumber == other.flightNumber;

    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((destination == null) ? 0 : destination.hashCode());
        result = prime * result + ((aircraftType == null) ? 0 : aircraftType.hashCode());
        result = prime * result + ((time == null) ? 0 : time.hashCode());
        result = prime * result + ((flightNumber == 0) ? 0 : flightNumber);
        result = prime * result + ((days == null) ? 0 : days.hashCode());
        return result;
    }


    @Override
    public String toString() {
        return "Airline :" +
                "\ndestination : " + destination +
                "\nflightNumber : " + flightNumber +
                "\naircraftType : " + aircraftType +
                "\ntime : " + time +
                "\ndays : " + days;
    }
}
