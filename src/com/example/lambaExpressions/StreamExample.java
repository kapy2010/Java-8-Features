package com.example.lambaExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        for (int i=0; i < 100; i++) myList.add(i);

        Stream<Integer> sequentialStream = myList.stream();
        Stream<Integer> parallelStream = myList.parallelStream();

        Stream<Integer> highNumsSeq = sequentialStream.filter(p -> p > 90);
        Stream<Integer> highNumsParallel = parallelStream.filter(p -> p > 90);

        highNumsSeq.forEach(p -> System.out.println("High Num seq = " + p));
        highNumsParallel.forEach(p -> System.out.println("High Num parallel = " + p));
    }
}
