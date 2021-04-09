package com.java8.features.concepts.lambda;

import java.util.function.Consumer;

public class LambdaVariableExample {

    public static void main(String[] args) {
        int i = 0;
        //i cant be used in (i)
        Consumer<String> c1=(i1)->{
            System.out.println(i);
        };


    }
}

