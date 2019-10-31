package ru.itpark.category;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book extends Product {
    private String author;

    public Book(long id, String name, int price, int rating, String author) {
        super(id, name, price, rating);
        this.author = author;
    }
}
