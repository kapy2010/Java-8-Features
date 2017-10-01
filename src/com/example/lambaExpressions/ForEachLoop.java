package com.example.lambaExpressions;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Mary");
        names.add("Alice");
        names.add("Marius");

        names.forEach(
                (n) -> System.out.println(n)
        );
    }
}
