package by.epam.java_intro.module4.aggregationAndComposition_task_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Bank {

    private final String Name;
    private final List<Client>clientList;

    {
        clientList = new ArrayList<>();
    }

    public Bank(String name){
        this.Name = name;
    }

    public void addClient(Client client){
        clientList.add(client);
    }

    public List<Client>getClientList(){
        return clientList;
    }

    public String getName(){
        return Name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bank bank)) return false;
        return getName().equals(bank.getName()) && getClientList().equals(bank.getClientList());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getClientList());
    }

    @Override
    public String toString() {
        return "Bank : " +'\n' +
                "Name : " + Name + '\n' +
                "ClientList : " + clientList;
    }
}
