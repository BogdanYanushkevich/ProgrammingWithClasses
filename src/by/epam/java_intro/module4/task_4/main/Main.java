package by.epam.java_intro.module4.task_4.main;
import by.epam.java_intro.module4.task_4.entity.Depo;
import by.epam.java_intro.module4.task_4.entity.Train;
import by.epam.java_intro.module4.task_4.logic.TrainLogic;
import by.epam.java_intro.module4.task_4.view.TrainView;

/*4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
Добавьте возможность сортировки массива по пункту назначения, причем поезда с одинаковыми пунктами
назначения должны быть упорядочены по времени отправления*/


import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        Depo depo = new Depo();
        TrainLogic logic = new TrainLogic();
        TrainView view = new TrainView();


        Train findTrain;
        List<Train> sortByNumber;
        List<Train> sortByDestination;

        depo.addTrain(new Train("Moscow", 432, new GregorianCalendar(2023, Calendar.MARCH, 12, 23, 20)));
        depo.addTrain(new Train("Brest", 142, new GregorianCalendar(2023, Calendar.MARCH, 12, 20, 20)));
        depo.addTrain(new Train("Minsk", 983, new GregorianCalendar(2023, Calendar.MARCH, 12, 6, 20)));
        depo.addTrain(new Train("Moscow", 127, new GregorianCalendar(2023, Calendar.MARCH, 12, 8, 40)));
        depo.addTrain(new Train("Grodna", 374, new GregorianCalendar(2023, Calendar.MARCH, 12, 11, 20)));


        sortByNumber = logic.sortByNumber(depo.getTrains());

        view.print("Sort by number : ", sortByNumber);

        findTrain = logic.findByNumber(depo.getTrains(), 989);

        view.printTrain(findTrain);

        sortByDestination = logic.sortByDestination(depo.getTrains());

        view.print("Sort by destination : ", sortByDestination);

    }
}
