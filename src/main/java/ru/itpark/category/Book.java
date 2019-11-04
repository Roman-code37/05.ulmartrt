package ru.itpark.category;

public class Book extends Product {
    private String author;

    public Book(long id, String name, int price, int rating, String author) {
        super(id, name, price, rating);
        this.author = author;
    }
}
