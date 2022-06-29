package by.epam.java_intro.module4.task_4.view;

import by.epam.java_intro.module4.task_4.entity.Train;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.List;

public class TrainView {


    public void print(String message, List<Train> trains) {

        System.out.println(message);
        for (int i = 0; i < trains.size(); i++) {
            System.out.println(trains.get(i));
        }
    }


    public void printTrain(Train train){
        System.out.println(train);
    }
}
