package ru.itpark.service;

import ru.itpark.category.Product;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class ProductService {
    private final Collection<Product> items = new LinkedList<>();

    public Collection<Product> getItems() {
        return items;
    }

    public void addAll (Collections items){
        this.items.addAll((Collection<? extends Product>) items);
    }
}
