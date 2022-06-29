package by.epam.java_intro.module4.task_6;

import by.epam.java_intro.module4.task_5.Counter;

public class Watch {

    private int hours;
    private int minutes;
    private int seconds;


    public Watch() {
        super();
    }

    public Watch(int hours, int minutes, int seconds) {
        super();

        hours = checkHoursValue(hours);

        minutes = checkValue(minutes);

        seconds = checkValue(seconds);


        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }


    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        hours = checkHoursValue(hours);
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        minutes = checkValue(minutes);
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        seconds = checkValue(seconds);
        this.seconds = seconds;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((hours == 0) ? 0 : Integer.valueOf(hours).hashCode());
        result = prime * result + ((minutes == 0) ? 0 : Integer.valueOf(minutes).hashCode());
        result = prime * result + ((seconds == 0) ? 0 : Integer.valueOf(seconds).hashCode());
        return result;
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
        Watch other = (Watch) sumObj;

        return this.hours == other.hours && this.minutes == other.minutes && this.seconds == other.seconds;

    }

    @Override
    public String toString() {
        String zero = "0";
        if (hours < 10 && minutes < 10 && seconds < 10) {
            return "Time: " + zero + hours + ":" + zero + minutes + ":" + zero + seconds;
        }
        if (hours < 10 && seconds < 10) {
            return "Time: " + zero + hours + ":" + minutes + ":" + zero + seconds;
        }
        if (hours < 10 && minutes < 10) {
            return "Time: " + zero + hours + ":" + zero + minutes + ":" + seconds;
        }
        if (minutes < 10 && seconds < 10) {
            return "Time: " + hours + ":" + zero + minutes + ":" + zero + seconds;
        }
        if (hours < 10) {
            return "Time: " + zero + hours + ":" + minutes + ":" + seconds;
        }
        if (minutes < 10) {
            return "Time: " + hours + ":" + zero + minutes + ":" + seconds;
        }
        if (seconds < 10) {
            return "Time: " + hours + ":" + minutes + ":" + zero + seconds;
        }


        return "Time: " + hours + ":" + minutes + ":" + seconds;
    }


    //Метод добавляет указанное колличество часов.

    public void addHours(int changeValue) {

        hours = hours + changeValue;
        hours = checkHoursValue(hours);

    }

    //Метод отнимает указанное колличество часов.

    public void decreaseHours(int changeValue) {

        hours = hours - changeValue;

        hours = checkHoursValue(hours);

    }

    //Метод добавляет указанное колличество минут.

    public void addMinutes(int changeValue) {

        minutes = minutes + changeValue;

        minutes = checkValue(minutes);

    }


    //Метод отнимает указанное колличество минут.

    public void decreaseMinutes(int changeValue) {

        minutes = minutes - changeValue;

        minutes = checkValue(minutes);

    }

    //Метод добавляет указанное колличество секунд.

    public void addSeconds(int changeValue) {

        seconds = seconds + changeValue;

        seconds = checkValue(seconds);
    }


    //Метод отнимает указанное колличество секунд.

    public void decreaseSeconds(int changeValue) {

        seconds = seconds - changeValue;

        seconds = checkValue(seconds);
    }


    public int checkValue(int value) {

        if (value > 59 || value < 0) {
            return 0;
        } else return value;
    }

    public int checkHoursValue(int value) {

        if (value > 23 || value < 0) {
            return 0;
        } else return value;}

}





