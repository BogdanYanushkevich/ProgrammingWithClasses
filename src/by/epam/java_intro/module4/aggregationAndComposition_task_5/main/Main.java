package by.epam.java_intro.module4.aggregationAndComposition_task_5.main;


import by.epam.java_intro.module4.aggregationAndComposition_task_5.enums.Food;
import by.epam.java_intro.module4.aggregationAndComposition_task_5.menu.Menu;
import by.epam.java_intro.module4.aggregationAndComposition_task_5.entity.TouristVoucher;
import by.epam.java_intro.module4.aggregationAndComposition_task_5.entity.TravelAgency;
import by.epam.java_intro.module4.aggregationAndComposition_task_5.enums.Purpose;
import by.epam.java_intro.module4.aggregationAndComposition_task_5.enums.Transport;

public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu();
        TravelAgency untaka = new TravelAgency();
        menu.CreateClient();


        untaka.addTouristVoucher(new TouristVoucher("Moscow", Purpose.EXCURSION, Transport.BUS, Food.RO, 4, 213));
        untaka.addTouristVoucher(new TouristVoucher("Alanya ", Purpose.RELAXATION, Transport.AIRPLANE, Food.All, 10, 1600));
        untaka.addTouristVoucher(new TouristVoucher("Sofia", Purpose.TREATMENT, Transport.SLINGSHOTLAUNCH, Food.BB, 7, 950));
        untaka.addTouristVoucher(new TouristVoucher("Cairo", Purpose.CRUISE, Transport.AIRPLANE, Food.UAL, 12, 1300));
        untaka.addTouristVoucher(new TouristVoucher("Madrid", Purpose.SHOPPING, Transport.BUS, Food.HB, 5, 1900));
        untaka.addTouristVoucher(new TouristVoucher("Paris", Purpose.EXCURSION, Transport.TRAIN, Food.FB, 5, 750));
        untaka.addTouristVoucher(new TouristVoucher("Minsk", Purpose.EXCURSION, Transport.TRAIN, Food.RO, 3, 120));
        untaka.addTouristVoucher(new TouristVoucher("Provence", Purpose.RELAXATION, Transport.AIRPLANE, Food.All, 8, 2400));


        menu.scanMainAnswer(untaka, menu.addClient(untaka));


    }
}
