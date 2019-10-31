package ru.itpark.category;

public class Smartphone extends Product {
    private String manufacturer;

    public Smartphone(long id, String name, int price, int rating, String manufacturer) {
        super(id, name, price, rating);
        this.manufacturer = manufacturer;
    }
}
