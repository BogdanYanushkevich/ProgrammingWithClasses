package by.epam.java_intro.module4.task_4.logic;

import by.epam.java_intro.module4.task_4.entity.Train;

import java.util.ArrayList;
import java.util.List;

public class TrainLogic {

    public List<Train> sortByNumber(List<Train> trains) {
        List<Train> sortTrains = new ArrayList<>(trains);

        for (int i = 0; i < sortTrains.size() - 1; i++) {
            for (int j = i; j < sortTrains.size(); j++) {

                if (sortTrains.get(i).getNumber() > sortTrains.get(j).getNumber()) {
                    Train temp = sortTrains.get(j);
                    sortTrains.set(j, sortTrains.get(i));
                    sortTrains.set(i, temp);

                }
            }
        }
        return sortTrains;
    }

    public Train findByNumber(List<Train> trains, int num) {

        Train findTrain = null;

        for (Train train : trains) {
            if (train.getNumber() == num) {
                findTrain = train;
            }

        }
        return findTrain;
    }

    /*Метод сортирует массив по пункту назначения, поезда с одинаковыми пунктами
    назначения должны быть упорядочены по времени отправления в порядке возрастания.*/

    public List<Train> sortByDestination(List<Train> trains) {

        List<Train> sortTrains = new ArrayList<>(trains);

        for (int i = 0; i < sortTrains.size() - 1; i++) {
            for (int j = i + 1; j < sortTrains.size(); j++) {

                if (sortTrains.get(i).getDestination().compareToIgnoreCase(sortTrains.get(j).getDestination()) > 0) {
                    Train temp = sortTrains.get(j);
                    sortTrains.set(j, sortTrains.get(i));
                    sortTrains.set(i, temp);

                }
                if (sortTrains.get(i).getDestination().compareToIgnoreCase(sortTrains.get(j).getDestination()) == 0) {
                    sortByTime(sortTrains,i, j);
                }
            }

        }
        return sortTrains;
    }

    public void sortByTime(List<Train> sortTrains, int firstTrain, int secondTrain) {

        if(sortTrains.get(firstTrain).getTime().toInstant().isAfter(sortTrains.get(secondTrain).getTime().toInstant())) {
            Train temp = sortTrains.get(firstTrain);
            sortTrains.set(firstTrain, sortTrains.get(secondTrain));
            sortTrains.set(secondTrain, temp);
        }
    }

}
