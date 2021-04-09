package com.java8.features.concepts.defaultstaticmethod;

public class Client4 implements Interface4,MultipleInheritenceInterface1{
    public void methodA()
    {
        System.out.println("Inside MethodA::"+Client4.class);
    }

    public static void main(String[] args) {
        Client4 cl=new Client4();
        cl.methodA();
    }
}