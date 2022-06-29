package by.epam.java_intro.module4.task_10.main;

import by.epam.java_intro.module4.task_10.entity.Airline;
import by.epam.java_intro.module4.task_10.entity.Airport;
import by.epam.java_intro.module4.task_10.logic.Logic;
import by.epam.java_intro.module4.task_10.view.ViewAirline;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

/*10. Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
методами. Задать критерии выбора данных и вывести эти данные на консоль.
Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
Найти и вывести:
a) список рейсов для заданного пункта назначения;
b) список рейсов для заданного дня недели;
c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
*/


public class Main {

    public static void main(String[] args) {

        Airport airport = new Airport();
        ViewAirline viewAirline = new ViewAirline();
        Logic logic = new Logic();

        List<Airline> sortByDestination = new ArrayList<>();
        List<Airline> sortByDayOFWeek = new ArrayList<>();
        List<Airline> sortByDayOFWeekAndTime = new ArrayList<>();


        airport.addAirline(new Airline("Moscow", 715, "Boeing 747", LocalTime.of(11, 40), "Monday, Saturday"));
        airport.addAirline(new Airline("Minsk", 724, "Airbus A330", LocalTime.of(21, 15), "Thursday, Friday"));
        airport.addAirline(new Airline("Paris", 315, "Boeing 747", LocalTime.of(14, 20), "Wednesday"));
        airport.addAirline(new Airline("London", 211, "Airbus A320", LocalTime.of(15, 10), "Monday, Wednesday, Saturday, Sunday"));
        airport.addAirline(new Airline("Moscow", 108, "Boeing 777", LocalTime.of(12, 35), "Monday, Tuesday, Saturday"));
        airport.addAirline(new Airline("Warsaw", 413, "Boeing 737", LocalTime.of(17, 50), "Monday, Saturday, Sunday"));


        viewAirline.print("List of all flights : ", airport.getAirlines());
        sortByDestination = logic.sortByDestination("Moscow", airport.getAirlines());
        viewAirline.print("List of flights : ", sortByDestination);
        sortByDayOFWeek = logic.sortByDayOfWeek("Wednesday", airport.getAirlines());
        viewAirline.print("List of flights : ", sortByDayOFWeek);
        sortByDayOFWeekAndTime = logic.sortByDAyOfWeekAndTime("Saturday", LocalTime.of(14, 30), airport.getAirlines());
        viewAirline.print("List of flights : ", sortByDayOFWeekAndTime);


    }
}
