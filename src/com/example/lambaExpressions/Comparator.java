package com.example.lambaExpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product {
    int id;
    String name;
    float price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class Comparator {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product(1,"HP Laptop",25000f));
        list.add(new Product(3,"Keyboard",300f));
        list.add(new Product(2,"Dell Mouse",150f));

        System.out.println("Sorting on the basis of name...");

        Collections.sort(list, (l1, l2) -> {
            return l1.name.compareTo(l2.name);
        });


    }
}
