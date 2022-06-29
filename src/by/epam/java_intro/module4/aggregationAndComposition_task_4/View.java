package by.epam.java_intro.module4.aggregationAndComposition_task_4;

import java.util.List;

public class View {

    public void print(String message, BankAccount account) {

        System.out.println(message + "\n" + account);
        System.out.println("___________________________________________________________________________________");

    }

    public void print(String message, int someResult) {

        System.out.println(message + " " + someResult);
        System.out.println("___________________________________________________________________________________");
    }

    public void print(String message, List<BankAccount> someList) {
        System.out.println(message);
        for (BankAccount list : someList) {
            System.out.println(list);
            System.out.println("___________________________________________________________________________________");
        }

    }
}
