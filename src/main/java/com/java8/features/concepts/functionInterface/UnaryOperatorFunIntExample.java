package com.java8.features.concepts.functionInterface;

import java.util.function.UnaryOperator;

public class UnaryOperatorFunIntExample {
    //extends function inetrface
    static UnaryOperator<String> unaryOperatr = (s) -> s.concat("Default");

    public static void main(String[] args) {
        System.out.println(unaryOperatr.apply("java8"));

    }
}
