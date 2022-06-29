package by.epam.java_intro.module4.task_8.view;

import by.epam.java_intro.module4.task_8.entity.Customer;

import java.util.List;

public class ViewCustomer {


    public void print(String message, List<Customer> customers) {

        System.out.println(message);
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}
