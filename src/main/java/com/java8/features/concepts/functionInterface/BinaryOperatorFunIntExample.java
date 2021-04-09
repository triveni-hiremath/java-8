package com.java8.features.concepts.functionInterface;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class BinaryOperatorFunIntExample {
    //extends function inetrface
    static BinaryOperator<Integer> binaryOperatr = (a,b) -> a*b;

    static Comparator<Integer>comparator=(a,b)->a.compareTo(b);

    public static void main(String[] args) {
        System.out.println(binaryOperatr.apply(2,5));

        BinaryOperator<Integer>maxBy=BinaryOperator.maxBy(comparator);
        System.out.println(maxBy.apply(4,5));

        BinaryOperator<Integer>minBy=BinaryOperator.minBy(comparator);
        System.out.println(minBy.apply(4,5));

    }
}
