package by.epam.java_intro.module4.task_9.entity;


import java.util.UUID;


public class Book {


    private final UUID ID = UUID.randomUUID();
    private String name;
    private String author;
    private String publishingHouse;
    private int yearOfPublication;
    private int numberOfPages;
    private int price;
    private String typeOfBinding;

    public Book() {
        super();
    }

    public Book(String name, String author, String publishingHouse, int yearOfPublication, int numberOfPages, int price, String typeOfBinding) {
        this.name = name;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.yearOfPublication = yearOfPublication;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.typeOfBinding = typeOfBinding;


    }

    public UUID getId() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTypeOfBinding() {
        return typeOfBinding;
    }

    public void setTypeOfBinding(String typeOfBinding) {
        this.typeOfBinding = typeOfBinding;
    }


    @Override
    public boolean equals(Object sumObj) {
        if (this == sumObj) {
            return true;
        }
        if (sumObj == null) {
            return false;
        }
        if (sumObj.getClass() != this.getClass()) {
            return false;
        }
        Book other = (Book) sumObj;

        if (name == null) {
            if (other.name != null) {
                return false;
            }
        } else return !name.equals(other.name);


        if (author == null) {
            if (other.author != null) {
                return false;
            }
        } else return !author.equals(other.author);


        if (publishingHouse == null) {
            if (other.publishingHouse != null) {
                return false;
            }
        } else return !publishingHouse.equals(other.publishingHouse);


        if (typeOfBinding == null) {
            if (other.typeOfBinding != null) {
                return false;
            }
        } else return !typeOfBinding.equals(other.typeOfBinding);


        return this.ID.equals(other.ID) && this.yearOfPublication == other.yearOfPublication && this.numberOfPages == other.numberOfPages && this.price == other.price;

    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ID.hashCode();
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((author == null) ? 0 : author.hashCode());
        result = prime * result + ((publishingHouse == null) ? 0 : publishingHouse.hashCode());
        result = prime * result + ((yearOfPublication == 0) ? 0 : yearOfPublication);
        result = prime * result + ((numberOfPages == 0) ? 0 : numberOfPages);
        result = prime * result + ((price == 0) ? 0 : price);
        result = prime * result + ((typeOfBinding == null) ? 0 : typeOfBinding.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "Book : " +
                "\nid : " + ID +
                "\nname : " + name +
                "\nauthor : " + author +
                "\npublishingHouse : " + publishingHouse +
                "\nyearOfPublication : " + yearOfPublication +
                "\nnumberOfPages : " + numberOfPages +
                "\nprice : " + price + "$"+
                "\ntypeOfBinding : " + typeOfBinding;
    }
}


