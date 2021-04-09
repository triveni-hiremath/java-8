package com.java8.features.concepts.optional;

import java.util.Optional;

public class OptionalOfEmptyNullable {
    public static Optional<String> ofNullable()
    {
        Optional<String> opt=Optional.ofNullable(null);
        return opt;

    }
    public static Optional<String> of()
    {
        Optional<String> opt=Optional.of("jj");
        return opt;

    }
    public static Optional<String> empty()
    {
        return Optional.empty();

    }
    public static void main(String[] args) {
        System.out.println(ofNullable());
        System.out.println(of().get());
        System.out.println(empty());
    }
}
