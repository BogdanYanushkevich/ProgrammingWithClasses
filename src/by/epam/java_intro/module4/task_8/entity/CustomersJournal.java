package by.epam.java_intro.module4.task_8.entity;

import java.util.ArrayList;
import java.util.List;

public class CustomersJournal {

    private final List<Customer> customers;


    {
        customers = new ArrayList<>();
    }


    public List<Customer> getCustomers(){
        return customers;
    }

    public void addCustomer(Customer customer){
        customers.add(customer);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + customers.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        CustomersJournal other = (CustomersJournal) obj;
        return customers.equals(other.customers);
    }


    @Override
    public String toString() {
        return "CastomersJournal " +
                "customers = " + customers;
    }
}
