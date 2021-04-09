package com.java8.features.concepts.functionInterface;

import com.java8.features.concepts.functionInterface.FunctionInterfaceExample;

public class FunctionInterfaceExample1 {


    public static String performConcat(String str) {
        return FunctionInterfaceExample.someString.apply(str);

    }

    public static void main(String[] args) {
        String s = "Hello";
        System.out.println("result::" + performConcat(s));

    }
}
