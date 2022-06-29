package by.epam.java_intro.module4.aggregationAndComposition_task_5.menu;

import by.epam.java_intro.module4.aggregationAndComposition_task_5.enums.Food;
import by.epam.java_intro.module4.aggregationAndComposition_task_5.entity.TouristVoucher;
import by.epam.java_intro.module4.aggregationAndComposition_task_5.entity.Client;
import by.epam.java_intro.module4.aggregationAndComposition_task_5.entity.TravelAgency;
import by.epam.java_intro.module4.aggregationAndComposition_task_5.enums.Purpose;
import by.epam.java_intro.module4.aggregationAndComposition_task_5.enums.Transport;
import by.epam.java_intro.module4.aggregationAndComposition_task_5.logic.Logic;
import by.epam.java_intro.module4.aggregationAndComposition_task_5.view.View;

import java.util.List;
import java.util.Scanner;

public class Menu {


    private final Logic logic = new Logic();
    private final View view = new View();




    private void selectionMainPoints() {

        view.printMessage("1. Select a tour from the list.");
        view.printMessage("2. Sort by transport.");
        view.printMessage("3. Sort by food.");
        view.printMessage("4. Sort by purpose.");
        view.printMessage("5. Sort by cost.");
        view.printMessage("6. Sort by number of days of stay.");
        view.printMessage("0. Exit.");


    }


    private void selectionTransportPoints() {
        view.printMessage("1. BUS.");
        view.printMessage("2. TRAIN.");
        view.printMessage("3. AIRPLANE.");
        view.printMessage("4. SLINGSHOTLAUNCH.");
        view.printMessage("0. Exit to main menu.");
    }

    private void selectionFoodPoints() {
        view.printMessage("1. Room Only.");
        view.printMessage("2. Bed & Breakfast.");
        view.printMessage("3. Half Board.");
        view.printMessage("4. Full Board.");
        view.printMessage("5. Аll inclusive.");
        view.printMessage("6. Ultra All Inclusive.");
        view.printMessage("0. Exit to main menu.");

    }

    private void selectionPurposePoints() {
        view.printMessage("1. RELAXATION.");
        view.printMessage("2. EXCURSION.");
        view.printMessage("3. TREATMENT.");
        view.printMessage("4. SHOPPING.");
        view.printMessage("5. CRUISE.");
        view.printMessage("0. Exit to main menu.");

    }

    public void CreateClient() {
        view.printMessage("Hello\nWe will now create your customer profile.\n");
    }
    private void selectionCost() {
        view.printMessage("Enter your preferred search price:");
    }

    private void selectionDays() {
        view.printMessage("Enter your preferred search days:");
    }

    private void enterYourInitials(String initials) {
        view.printMessage("Enter your " + initials + ": ");
    }

    private void makeaChoice() {
        view.printMessage("1. Press 1 to choose a voucher.");
        view.printMessage("0. Press 0 to return to the main menu.");

    }

    private void sayHelloClient(Client client) {
        System.out.println("Hello\n" + client);
    }

    public Client addClient(TravelAgency travelAgency) {

        Client client = new Client(scanClient("Surname"), scanClient("Name"), scanClient("Patromic"));
        travelAgency.addClient(client);
        sayHelloClient(client);

        return client;
    }

    private String scanClient(String initials) {
        Scanner scanner = new Scanner(System.in);
        String info;
        enterYourInitials(initials);
        while (!scanner.hasNext()) {
            enterYourInitials(initials);
            scanner.next();
        }
        info = scanner.next();
        return info;
    }

    public void scanMainAnswer(TravelAgency travelAgency, Client client) {
        Scanner scanner = new Scanner(System.in);
        int function;
        do {
            selectionMainPoints();
            while (!scanner.hasNextInt()) {
                selectionMainPoints();
                scanner.next();
            }
            function = scanner.nextInt();
        } while (function < 0 || function > 7);

        switch (function) {

            case 1:
                view.print(travelAgency.getTouristVouchers());
                choiceAnswer(travelAgency, travelAgency.getTouristVouchers(), client);
                scanMainAnswer(travelAgency, client);
                break;

            case 2:
                scanTransportAnswer(travelAgency, client);
                scanMainAnswer(travelAgency, client);
                break;
            case 3:

                scanFoodAnswer(travelAgency, client);
                scanMainAnswer(travelAgency, client);
                break;
            case 4:
                scanPurposeAnswer(travelAgency, client);
                scanMainAnswer(travelAgency, client);
                break;
            case 5:
                scanCostAnswer(travelAgency, client);
                scanMainAnswer(travelAgency, client);
                break;
            case 6:
                scanDaysAnswer(travelAgency, client);
                scanMainAnswer(travelAgency, client);
                break;


            case 0:
                break;
        }
    }


    private void scanTransportAnswer(TravelAgency travelAgency, Client client) {
        Scanner scanner = new Scanner(System.in);
        int function;
        do {
            selectionTransportPoints();
            while (!scanner.hasNextInt()) {
                selectionTransportPoints();
                scanner.next();
            }
            function = scanner.nextInt();
        } while (function < 0 || function > 4);

        switch (function) {
            case 1 -> {
                view.print(logic.sortByTransport(travelAgency, Transport.BUS));
                choiceAnswer(travelAgency, logic.sortByTransport(travelAgency, Transport.BUS), client);

            }
            case 2 -> {
                view.print(logic.sortByTransport(travelAgency, Transport.TRAIN));
                choiceAnswer(travelAgency, logic.sortByTransport(travelAgency, Transport.TRAIN), client);

            }
            case 3 -> {
                view.print(logic.sortByTransport(travelAgency, Transport.AIRPLANE));
                choiceAnswer(travelAgency, logic.sortByTransport(travelAgency, Transport.AIRPLANE), client);

            }
            case 4 -> {
                view.print(logic.sortByTransport(travelAgency, Transport.SLINGSHOTLAUNCH));
                choiceAnswer(travelAgency, logic.sortByTransport(travelAgency, Transport.SLINGSHOTLAUNCH), client);

            }
            case 0 -> scanMainAnswer(travelAgency, client);
        }
    }

    private void scanFoodAnswer(TravelAgency travelAgency, Client client) {
        Scanner scanner = new Scanner(System.in);
        int function;
        do {
            selectionFoodPoints();
            while (!scanner.hasNextInt()) {
                selectionFoodPoints();
                scanner.next();
            }
            function = scanner.nextInt();
        } while (function < 0 || function > 6);

        switch (function) {
            case 1 -> {
                view.print(logic.sortByFood(travelAgency, Food.RO));
                choiceAnswer(travelAgency, logic.sortByFood(travelAgency, Food.RO), client);

            }
            case 2 -> {
                view.print(logic.sortByFood(travelAgency, Food.BB));
                choiceAnswer(travelAgency, logic.sortByFood(travelAgency, Food.BB), client);

            }
            case 3 -> {
                view.print(logic.sortByFood(travelAgency, Food.HB));
                choiceAnswer(travelAgency, logic.sortByFood(travelAgency, Food.HB), client);

            }
            case 4 -> {
                view.print(logic.sortByFood(travelAgency, Food.FB));
                choiceAnswer(travelAgency, logic.sortByFood(travelAgency, Food.FB), client);

            }
            case 5 -> {
                view.print(logic.sortByFood(travelAgency, Food.All));
                choiceAnswer(travelAgency, logic.sortByFood(travelAgency, Food.All), client);

            }
            case 6 -> {
                view.print(logic.sortByFood(travelAgency, Food.UAL));
                choiceAnswer(travelAgency, logic.sortByFood(travelAgency, Food.UAL), client);

            }
            case 0 -> scanMainAnswer(travelAgency, client);
        }
    }

    private void scanPurposeAnswer(TravelAgency travelAgency, Client client) {
        Scanner scanner = new Scanner(System.in);
        int function;
        do {
            selectionPurposePoints();
            while (!scanner.hasNextInt()) {
                selectionPurposePoints();
                scanner.next();
            }
            function = scanner.nextInt();
        } while (function < 0 || function > 5);

        switch (function) {
            case 1 -> {
                view.print(logic.sortByPurpose(travelAgency, Purpose.RELAXATION));
                choiceAnswer(travelAgency, logic.sortByPurpose(travelAgency, Purpose.RELAXATION), client);

            }
            case 2 -> {
                view.print(logic.sortByPurpose(travelAgency, Purpose.EXCURSION));
                choiceAnswer(travelAgency, logic.sortByPurpose(travelAgency, Purpose.EXCURSION), client);

            }
            case 3 -> {
                view.print(logic.sortByPurpose(travelAgency, Purpose.TREATMENT));
                choiceAnswer(travelAgency, logic.sortByPurpose(travelAgency, Purpose.TREATMENT), client);

            }
            case 4 -> {
                view.print(logic.sortByPurpose(travelAgency, Purpose.SHOPPING));
                choiceAnswer(travelAgency, logic.sortByPurpose(travelAgency, Purpose.SHOPPING), client);

            }
            case 5 -> {
                view.print(logic.sortByPurpose(travelAgency, Purpose.CRUISE));
                choiceAnswer(travelAgency, logic.sortByPurpose(travelAgency, Purpose.CRUISE), client);

            }
            case 0 -> scanMainAnswer(travelAgency, client);
        }
    }

    private void scanCostAnswer(TravelAgency travelAgency, Client client) {
        Scanner scanner = new Scanner(System.in);
        int function;
        do {
            selectionCost();
            while (!scanner.hasNextInt()) {
                selectionCost();
                scanner.next();
            }
            function = scanner.nextInt();
        } while (function < 0);
        choiceAnswer(travelAgency, logic.sortByPrice(travelAgency, function), client);


    }

    private void scanDaysAnswer(TravelAgency travelAgency, Client client) {
        Scanner scanner = new Scanner(System.in);
        int function;
        do {
            selectionDays();
            while (!scanner.hasNextInt()) {
                selectionDays();
                scanner.next();
            }
            function = scanner.nextInt();

        } while (function < 0);
        view.print(logic.sortByDays(travelAgency, function));
        choiceAnswer(travelAgency, logic.sortByDays(travelAgency, function), client);


    }

    private void choiceAnswer(TravelAgency travelAgency, List<TouristVoucher> someList, Client client) {
        Scanner scanner = new Scanner(System.in);
        int function;
        do {
            makeaChoice();
            while (!scanner.hasNextInt()) {
                makeaChoice();
                scanner.next();
            }
            function = scanner.nextInt();
        } while (function < 0 || function > 1);
        switch (function) {
            case 1 -> chooseVoucher(someList, client);

            case 0 -> scanMainAnswer(travelAgency, client);

        }

    }

    private void chooseVoucher(List<TouristVoucher> someList, Client someClient) {

        Scanner scanner = new Scanner(System.in);
        int function;
        do {
            view.printMessage("Choose a voucher: ");
            while (!scanner.hasNextInt()) {
                view.printMessage("Choose a voucher: ");
                scanner.next();
            }
            function = scanner.nextInt();
        } while (function < 0 || function > someList.size() - 1);

        voucherAccept(function, someList, someClient);
    }

    private void voucherAccept(int function, List<TouristVoucher> someList, Client someClient) {
        someList.get(function).setClient(someClient);
        someClient.setTouristVoucher(someList.get(function));
        view.printAccept(function, someList, someClient);

    }
}


