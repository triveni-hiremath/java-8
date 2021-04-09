package com.java8.features.concepts.defaultstaticmethod;


import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//static methods cannot b overriden whereas default can be overriden
public class DefaultMethodExample {
    public static void main(String[] args) {
List<String> strList= Arrays.asList("Adam","Jenny","Aled","Dan","Mike","Eric");
//prior j8
        Collections.sort(strList);
        System.out.println("before j8"+strList);
        //java 8
        strList.sort(Comparator.naturalOrder());
        System.out.println("afer j8"+strList);
        strList.sort(Comparator.reverseOrder());
        System.out.println("reverse j8"+strList);
        //default splititerator
        //default sort
        //default void replaceAll


    }
}
