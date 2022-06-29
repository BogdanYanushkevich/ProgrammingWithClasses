package by.epam.java_intro.module4.task_9.main;
import by.epam.java_intro.module4.task_9.entity.Book;
import by.epam.java_intro.module4.task_9.entity.BookStore;
import by.epam.java_intro.module4.task_9.logic.Logic;
import by.epam.java_intro.module4.task_9.view.ViewBook;

/*9. Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и
методами. Задать критерии выбора данных и вывести эти данные на консоль.
Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
Найти и вывести:
a) список книг заданного автора;
b) список книг, выпущенных заданным издательством;
c) список книг, выпущенных после заданного года.
*/


import java.util.List;

public class Main {

    public static void main(String[] args) {

        BookStore bookStore = new BookStore();
        Logic logic = new Logic();
        ViewBook viewBook = new ViewBook();

        List<Book> findAuthor;
        List<Book> findPublishingHouse;
        List<Book> findBookByYear;



        bookStore.addBook(new Book("Doctor Who - Tales of Trenzalore", "Justin Richards", "BBC Books", 2014, 224, 25, "hard"));
        bookStore.addBook(new Book("The Three-Body Problem", "Liu Cixin", "Chongqing Press", 2008, 	302, 33, "hard"));
        bookStore.addBook(new Book("The Dark Forest", "Liu Cixin", "Chongqing Press", 	2008, 	400, 31, "hard"));
        bookStore.addBook(new Book("Death's End", "Liu Cixin", "Chongqing Press", 2010, 592, 40, "hard"));
        bookStore.addBook(new Book("The Name of the Wind", "Patrick Rothfuss", "DAW Books", 2007, 662, 20, "soft"));
        bookStore.addBook(new Book("The Wise Man's Fear", "Patrick Rothfuss", "DAW Books", 2011, 994, 20, "soft"));
        bookStore.addBook(new Book("The Puppeteer", "Henry Lion Oldie", "Moscow: Eksmo", 2014, 224, 25, "hard"));
        bookStore.addBook(new Book("The Pupa", "Henry Lion Oldie", "Moscow: Eksmo", 2014, 224, 25, "hard"));
        bookStore.addBook(new Book("The Puppet Master", "Henry Lion Oldie", "Moscow: Eksmo", 2014, 224, 25, "hard"));
        bookStore.addBook(new Book("Blood of Elves", "Andrzej Sapkowski", "superNOWA", 1994, 320, 35, "hard"));
        bookStore.addBook(new Book("Time of Contempt", "Andrzej Sapkowski", "superNOWA", 1995, 352, 38, "hard"));


        findAuthor = logic.findByAuthor("Liu Cixin", bookStore.getBooks());
        findPublishingHouse = logic.findByPublishingHouse("DAW Books", bookStore.getBooks());
        findBookByYear = logic.findByYearOfPublication(2004, bookStore.getBooks());

        viewBook.print("Sort by author : ",findAuthor);
        viewBook.print("Sort by Publishing House : ", findPublishingHouse );
        viewBook.print("Sort by year : ", findBookByYear);
    }
}
