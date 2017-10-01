package com.example.lambaExpressions;

interface Addable {
    int add(int a, int b);
}

public class MultipleParameters {
    public static void main(String[] args) {
        Addable a1 = (int a, int b) -> (a + b);
        System.out.println(a1.add(3,4));

        Addable a2 = (a, b) -> (a + b);
        System.out.println(a2.add(2,3));
    }
}
