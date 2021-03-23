package com.java8.features.concepts.methodReference;

import java.util.function.Function;

public class MethodReferenceExample {

    //className::instance-methodName
    //className::staticmethodName
    //Instance::methodNme
    //alt enter
    //direct method call

    static Function<String, String> toUpperCase = (s) -> s.toUpperCase();
    static Function<String,String> toUpperCaseref=String::toUpperCase;

    public static void main(String[] args) {
        System.out.println(toUpperCase.apply("hello"));
        System.out.println(toUpperCaseref.apply("heaven"));
    }
}
