package by.epam.java_intro.module4.task_8.main;

import by.epam.java_intro.module4.task_8.entity.Customer;
import by.epam.java_intro.module4.task_8.entity.CustomersJournal;
import by.epam.java_intro.module4.task_8.logic.Logic;
import by.epam.java_intro.module4.task_8.view.ViewCustomer;

import java.util.List;


/*8. Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами
и методами. Задать критерии выбора данных и вывести эти данные на консоль.
Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
Найти и вывести:
a) список покупателей в алфавитном порядке;
b) список покупателей, у которых номер кредитной карточки находится в заданном интервале*/


public class Main {

    public static void main(String[] args) {

        CustomersJournal customersJournal = new CustomersJournal();
        Logic logic = new Logic();
        ViewCustomer viewCustomer = new ViewCustomer();
        List<Customer> sortByAlphabet;
        List<Customer> sortByCreditCard;


        customersJournal.addCustomer(new Customer("Brazaitys", "Anatoly", "Genadievich", "Grodno", 1111111111111111L, 1111111111111111L));
        customersJournal.addCustomer(new Customer("Dovlatov", "Pavel", "Kosmovich", "Baranovichy", 2222222222222222L, 2222222222222222L));
        customersJournal.addCustomer(new Customer("London", "Bigben", "Elizovetovich", "Walia", 3333333333333333L, 3333333333333333L));
        customersJournal.addCustomer(new Customer("Skaiwoker", "Luk", "Dartweiderovich", "Tatuin", 5555555555555555L, 5555555555555555L));
        customersJournal.addCustomer(new Customer("Azarenok", "Kaktotam", "Gebelsovich", "Minsk", 6666666666666666L, 6666666666666666L));
        customersJournal.addCustomer(new Customer("Hazov", "Artem", "Ruslanovich", "Minsk", 9999999999999999L, 9999999999999999L));
        customersJournal.addCustomer(new Customer("Karol", "Valet", "Damovich", "Kolodichy", 4444444444444444L, 4444444444444444L));
        customersJournal.addCustomer(new Customer("Lukashenko", "Alexander", "Gorgavich", "Kopys", 7777777777777777L, 7777777777777777L));
        customersJournal.addCustomer(new Customer("Usachev", "Ruslan", "Petrovich", "St.Petersburg", 8888888888888888L, 8888888888888888L));
        customersJournal.addCustomer(new Customer("Pilyaeva", "Valery", "Batkovna", "Grodno", 1111222233334444L, 1111111111111111L));


        sortByAlphabet = logic.sortByAlphabet(customersJournal.getCustomers());
        sortByCreditCard = logic.sortByCreditCard(2222222222222222L, 7777777777777777L, customersJournal.getCustomers());

        viewCustomer.print("Customers in alphabetical order :", sortByAlphabet);
        viewCustomer.print("Customers in creditCard interval order :", sortByCreditCard);

    }
}

