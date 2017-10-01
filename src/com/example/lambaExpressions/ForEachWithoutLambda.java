package com.example.lambaExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEachWithoutLambda {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        for (int i = 0; i < 10; i++) myList.add(i);

        myList.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });
    }
}
