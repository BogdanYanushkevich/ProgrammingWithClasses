package by.epam.java_intro.module4.task_9.view;


import by.epam.java_intro.module4.task_9.entity.Book;

import java.util.List;

public class ViewBook {


    public void print(String message, List<Book> books) {

        System.out.println(message);
        for (Book book : books) {
            System.out.println(book);
        }
    }
}

