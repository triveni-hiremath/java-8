package com.java8.features.concepts.defaultstaticmethod;

public interface MultipleInheritenceInterface2 {
    default void methodB()
    {
        System.out.println("Inside MethodB");
    }
}
