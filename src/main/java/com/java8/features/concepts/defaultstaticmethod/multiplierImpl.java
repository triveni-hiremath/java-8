package com.java8.features.concepts.defaultstaticmethod;

import java.util.List;

public class multiplierImpl implements  multiplier {

    @Override
    public int multiply(List<Integer> toList) {
      return toList.stream().reduce(1,(x,y)->x*y);

    }
}
