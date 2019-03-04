package com.ab18;

import java.util.Optional;

public class OptionalExercise {

    public static void main(String[] args) {
        var x = Optional.of("Hello World from optional");
        x.ifPresent(System.out::println);
        x.flatMap(m -> Optional.of("abc " + m)).ifPresent(System.out::println);
        x.map(m -> "abc " + m).ifPresent(System.out::println);
    }
}
