package ru.itpark.comparator;

import ru.itpark.category.Product;

import java.util.Comparator;

public class NameDescComparator implements Comparator <Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return - (o1.getName().compareTo(o2.getName()));
    }
}
