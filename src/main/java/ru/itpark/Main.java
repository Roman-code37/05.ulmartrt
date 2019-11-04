package ru.itpark;

import ru.itpark.category.Book;
import ru.itpark.category.Smartphone;
import ru.itpark.category.TV;
import ru.itpark.service.ProductService;

public class Main {
    public static void main(String[] args) {

        ProductService product = new ProductService();
        product.add (new Smartphone(1,
                "Iphone 8 Plus",
                65_950,
                4,
                "Apple"));
        product.add(new Smartphone(2,
                "Galaxy A10",
                9_990,
                5,
                "Samsung"));
        product.add(new Smartphone(3,
                "Xiaomi Redmi 4x",
                8_999,
                4,
                "Xiaomi"));
        product.add(new Book(1,
                "Мёртвые души",
                1_599,
                4,
                "Гоголь"));
        product.add(new Book(2,
                "Капитанская дочка",
                1_390,
                4,
                "А.С.Пушкин"));
        product.add(new TV(1,
                "Prestigio 43 Wize",
                12_690,
                5,
                43));
        product.add(new TV(2,
                "KIVI 32HB50",
                8_990,
                5,
                32));

        System.out.println(product.getAll());
        System.out.println(product.getNameDescComparator("Xiaomi"));

    }
}
