package com.example.lambaExpressions;

interface Sayable3 {
    public String say(String message);
}

public class MultipleStatements {
    public static void main(String[] args) {
        Sayable3 s = (message) -> {
            String str1 = "I would like to say, ";
            String str2 = str1 + message;
            return str2;
        };

        System.out.println(s.say("time is precious."));
    }
}
