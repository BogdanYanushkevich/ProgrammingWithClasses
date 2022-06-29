package by.epam.java_intro.module4.task_9.entity;

import java.util.ArrayList;
import java.util.List;

public class BookStore {

    private final List<Book> books;

    {
        books = new ArrayList<>();
    }

    public List<Book> getBooks() {
        return books;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + books.hashCode();
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
        BookStore other = (BookStore) obj;
        return books.equals(other.books);
    }


    @Override
    public String toString() {
        return "BookStore " +
                "books = " + books;
    }

}
