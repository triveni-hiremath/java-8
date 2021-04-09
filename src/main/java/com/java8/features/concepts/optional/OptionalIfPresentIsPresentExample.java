package com.java8.features.concepts.optional;

import java.util.Optional;

public class OptionalIfPresentIsPresentExample {




        public static void main (String[]args){
            Optional<String> opt = Optional.ofNullable("Hello");
            System.out.println(opt.isPresent());
            if (opt.isPresent()) {
                System.out.println(opt.get());
            }

            //ifpresent

        opt.ifPresent(s-> System.out.println(s));

    }
}
