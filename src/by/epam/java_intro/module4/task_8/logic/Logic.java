package by.epam.java_intro.module4.task_8.logic;

import by.epam.java_intro.module4.task_8.entity.Customer;

import java.util.ArrayList;
import java.util.List;

public class Logic {

    public List<Customer> sortByAlphabet(List<Customer> unsortedCustomers) {

        List<Customer> sortedCustomers = new ArrayList<>(unsortedCustomers);

        for (int i = 0; i < sortedCustomers.size() - 1; i++) {
            for (int j = i + 1; j < sortedCustomers.size(); j++) {

                if (sortedCustomers.get(i).getSurname().compareToIgnoreCase(sortedCustomers.get(j).getSurname()) > 0) {
                    sort(i, j, sortedCustomers);
                }
            }
        }

        return sortedCustomers;
    }

    public List<Customer> sortByCreditCard(long intervalStart, long endOfInterval, List<Customer> unsortedCustomers) {

        List<Customer> sortedByCreditCardCustomers = new ArrayList<>();

        for (Customer unsortedCustomer : unsortedCustomers) {
            if (unsortedCustomer.getCreditCardNumber() >= intervalStart && unsortedCustomer.getCreditCardNumber() <= endOfInterval) {
                sortedByCreditCardCustomers.add(unsortedCustomer);
            }
        }

        for (int i = 0; i < sortedByCreditCardCustomers.size() - 1; i++) {
            for (int j = i + 1; j < sortedByCreditCardCustomers.size(); j++) {
                if (sortedByCreditCardCustomers.get(i).getCreditCardNumber() >= sortedByCreditCardCustomers.get(j).getCreditCardNumber() ){
                    sort(i, j, sortedByCreditCardCustomers );
                }
            }
            }

        return sortedByCreditCardCustomers;
    }


    public void sort(int i, int j, List<Customer> unsortedCustomers) {


        Customer temp = unsortedCustomers.get(j);
        unsortedCustomers.set(j, unsortedCustomers.get(i));
        unsortedCustomers.set(i, temp);
    }
}
