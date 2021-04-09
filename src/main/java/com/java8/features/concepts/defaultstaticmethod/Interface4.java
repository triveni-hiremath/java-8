package com.java8.features.concepts.defaultstaticmethod;

public interface Interface4 {
    default void methodA()
    {
        System.out.println("Inside MethodA");
    }
}
