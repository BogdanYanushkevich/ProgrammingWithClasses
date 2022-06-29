package by.epam.java_intro.module4.task_4.entity;

import java.util.ArrayList;
import java.util.List;

public class Depo {

    private final List<Train> trains;

    {
        trains = new ArrayList<>();
    }

    public List<Train> getTrains() {
        return trains;
    }

    public void addTrain(Train train) {
        trains.add(train);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + trains.hashCode();
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
        Depo other = (Depo) obj;
        return trains.equals(other.trains);
    }


    @Override
    public String toString() {
        return "Depo{" +
                "trains=" + trains +
                '}';
    }

}
