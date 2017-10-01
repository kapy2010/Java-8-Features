package com.example.lambaExpressions;

interface Interface {
    default void log(String str) {
        System.out.println(str);
    }

    static void print(String str) {
        System.out.println(str);
    }
}

public class DefaultAndStaticMethodsInterfaces implements Interface {
    public static void main(String[] args) {
        DefaultAndStaticMethodsInterfaces obj = new DefaultAndStaticMethodsInterfaces();
        obj.log("Hello");
        Interface.print("World");
    }
}
