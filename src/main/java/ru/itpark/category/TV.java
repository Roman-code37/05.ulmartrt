package ru.itpark.category;

public class TV extends Product {
    private int diagonal;

    public TV(long id, String name, int price, int rating, int diagonal) {
        super(id, name, price, rating);
        this.diagonal = diagonal;
    }

}
