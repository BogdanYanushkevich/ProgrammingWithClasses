package by.epam.java_intro.module4.aggregationAndComposition_task_5.view;


import by.epam.java_intro.module4.aggregationAndComposition_task_5.entity.TouristVoucher;
import by.epam.java_intro.module4.aggregationAndComposition_task_5.entity.Client;

import java.util.List;

public class View {

    public void print(String message, List<TouristVoucher> someList) {
        System.out.println(message);
        for (TouristVoucher list : someList) {
            System.out.println(list);
            System.out.println("___________________________________________________________________________________");
        }
    }

    public void print(List<TouristVoucher> someList) {
        int index = 0;
        for (TouristVoucher list : someList) {
            System.out.println("Voucher number:  " + index);
            index += 1;
            System.out.println(list);
            System.out.println("___________________________________________________________________________________\n");

        }
    }

    public void printAccept(int function, List<TouristVoucher>someList, Client someClient){

        System.out.println("Voucher : \n" + someList.get(function) + "\n" + "Assigned to : \n" + someClient + "\n"
                + "You can check out or change your booking.\n ");

    }

    public void printMessage(String message){
        System.out.println(message);
    }

}
