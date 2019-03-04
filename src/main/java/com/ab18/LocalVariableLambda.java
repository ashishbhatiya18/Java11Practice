package com.ab18;

import java.util.function.Function;

public class LocalVariableLambda {
    public static void main(String[] args) {
        Function<String,String> nameGreet = x -> "Hello " + x;
        var summary = nameGreet.andThen(x -> x + "\nHow are you?");

        System.out.println(summary.apply("Ashish"));
        var complete = summary.compose(x -> "Good morning!");
        System.out.println(complete.apply("Ashish"));
    }
}
