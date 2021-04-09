package com.java8.features.concepts.defaultstaticmethod;

import java.util.Arrays;
import java.util.List;

public class MultiplierClient {
    public static void main(String[] args) {
        multiplier mul=new multiplierImpl();
        List<Integer>intList= Arrays.asList(1,3,5);
        System.out.println(mul.multiply(intList));
    }
}
