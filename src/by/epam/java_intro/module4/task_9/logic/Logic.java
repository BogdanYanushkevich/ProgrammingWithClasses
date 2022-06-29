package by.epam.java_intro.module4.task_9.logic;

import by.epam.java_intro.module4.task_9.entity.Book;

import java.util.List;
import java.util.ArrayList;


public class Logic {


    public List<Book> findByAuthor(String author, List<Book> someBooks) {

        List<Book> sortByAuthor = new ArrayList<>();

        for (Book someBook : someBooks) {
            if (someBook.getAuthor().equalsIgnoreCase(author)) {
                sortByAuthor.add(someBook);
            }

        }
        return sortByAuthor;
    }


    public List<Book> findByPublishingHouse(String publishingHouse, List<Book> someBooks) {

        List<Book> sortByPublishingHouse = new ArrayList<>();

        for (Book someBook : someBooks) {
            if (someBook.getPublishingHouse().equals(publishingHouse)) {
                sortByPublishingHouse.add(someBook);
            }

        }
        return sortByPublishingHouse;
    }


    public List<Book> findByYearOfPublication(int year, List<Book> someBooks) {

        List<Book> sortByYearOfPublication = new ArrayList<>();

        for (Book someBook : someBooks) {
            if (someBook.getYearOfPublication() >= year) {
                sortByYearOfPublication.add(someBook);
            }

        }
        return sortByYearOfPublication;
    }


}
