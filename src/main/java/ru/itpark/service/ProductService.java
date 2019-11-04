package ru.itpark.service;

import ru.itpark.category.Product;
import ru.itpark.comparator.NameDescComparator;
import ru.itpark.comparator.PriceDescComparator;

import java.util.*;

public class ProductService {
    private List<Product> items = new ArrayList<>();

    public void add(Product item) {
        items.add(item);
    }

    public List<Product> getAll() {
        return items;
    }

    public List<Product> getNameDescComparator(String name) {
        List<Product> result = new ArrayList<>();
        for (Product item : items) {
            if (item.getName().equals(name)) {
                result.add(item);
            }
        }
        result.sort(new NameDescComparator());
        return result;
    }

    public List<Product> searchByPrice(int min, int max, Comparator<Product> comparator) {
        List<Product> result = new ArrayList<>();
        for (Product product : items) {
            if (product.getPrice() >= min && product.getPrice() <= max) {
                result.add(product);
            }
        }
        Collections.sort(result, comparator);
        return result;
    }
}
