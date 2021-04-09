package com.java8.features.concepts.streams;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamOfIterateGenerateExample {
    public static void main(String[] args) {
        Stream<String> strm=Stream.of("adam","an","julie");
        strm.forEach(System.out::println);

        Stream.iterate(1,x->x*2).limit(10).forEach(System.out::println);

        Supplier<Integer>inte=new Random()::nextInt;
        Stream.generate(inte).limit(5).forEach(System.out::println);

    }
}
