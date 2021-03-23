package com.java8.features.concepts.lambda;

import java.util.function.Consumer;

public class LambdaVariableExample2 {


    public static void main(String[] args) {
         int val = 4;
        Consumer<Integer> c1 = (i) ->
        {
            //val++; //not allowed
            System.out.println(val + i);
        };
       // val=9; //not allowed //effectively final
        c1.accept(4);
    }
}
