package com.java8.features.concepts.defaultstaticmethod;

public interface MultipleInheritenceInterface1 {
    default void methodA()
    {
        System.out.println("Inside MethodA"+MultipleInheritenceInterface1.class);
    }
}
