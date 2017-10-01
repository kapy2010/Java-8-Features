package com.example.lambaExpressions;

interface Sayable2 {
    public String say(String name);
}

public class SingleParameter {
    public static void main(String[] args) {
        Sayable2 s1 = (name) -> {
            return "Hello, " + name;
        };
        System.out.println(s1.say("John"));

        Sayable2 s2 = name -> {
            return "Hello, " + name;
        };
        System.out.println(s2.say("Alice"));
    }
}
