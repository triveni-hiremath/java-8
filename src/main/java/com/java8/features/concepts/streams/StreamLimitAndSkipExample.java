package com.java8.features.concepts.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamLimitAndSkipExample {
    //helps to create a sub stream
    public static Optional<Integer> limit(List<Integer> integers) {
        return integers.stream().limit(3).reduce((x, y) -> x + y);
    }
    public static Optional<Integer> skip(List<Integer> integers) {
        return integers.stream().skip(3).reduce((x, y) -> x + y);
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(6, 7, 8, 9, 10);
        Optional<Integer> optRes = limit(integers);
        Optional<Integer> optResSkip=skip(integers);
        if(optResSkip.isPresent())
        {
            System.out.println(optResSkip.get());
        }
        else
        {
            System.out.println("No input is skip");
        }
        if (optRes.isPresent()) {
            System.out.println(optRes.get());
        } else {
            System.out.println("No input is passed");
        }

    }
}
