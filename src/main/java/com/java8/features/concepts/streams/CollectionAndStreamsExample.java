package com.java8.features.concepts.streams;


import java.util.ArrayList;
import java.util.stream.Stream;

//collection can add,modify at any time but in Stream ,it is fixed data.
//ele can be accessed in any order but in streams,only in one seq
//constructor is eagerly constructed but streams is lazily
//coll can b traveresed n number of times but stream only once else exception
//External iterations performed but streams internal iterations
public class CollectionAndStreamsExample {
    public static void main(String[] args) {
        ArrayList<String>names=new ArrayList<>();
        names.add("hi");
        names.add("hello");
        names.add("world");

        for(String name:names)
        {
            System.out.println(name);
        }
        for(String name:names)
        {
            System.out.println(name);
        }
        names.remove(0);
        System.out.println(names);

        Stream<String> str=names.stream();
        str.forEach(System.out::println);
        //error can traverse only once str.forEach(System.out::println);
    }
}
