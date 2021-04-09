package com.java8.features.concepts.defaultstaticmethod;

import java.util.stream.Stream;

public class MultipleInhClient123 implements MultipleInheritenceInterface1,MultipleInheritenceInterface2,MultipleInheritenceInterface3{
    public static void main(String[] args) {
        MultipleInhClient123 client123=new MultipleInhClient123();
        client123.methodA();
        client123.methodB();
        client123.methodC();
    }
}
