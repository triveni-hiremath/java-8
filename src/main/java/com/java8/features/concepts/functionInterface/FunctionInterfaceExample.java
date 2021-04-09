package com.java8.features.concepts.functionInterface;


import java.util.Locale;
import java.util.function.Function;

//apply,compose,andThen,identity
public class FunctionInterfaceExample {
    static Function<String, String> function = (name) -> name.toUpperCase();
    static  Function<String, String> someString = (name) -> name.toUpperCase().concat("default");
    public static void main(String[] args) {
        System.out.println("Result is::" + function.apply("java8"));
        System.out.println("Result is::" + function.andThen(someString).apply("java 8"));
        System.out.println("Result is::" + function.compose(someString).apply("java 8"));
    }

}


