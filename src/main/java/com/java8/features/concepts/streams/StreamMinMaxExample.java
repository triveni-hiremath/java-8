package com.java8.features.concepts.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinMaxExample {
    public static Optional<Integer> maxVal(List<Integer>list)
    {

        return  list.stream().reduce((x,y)->x>y?x:y);

    }
    //never use defailt value here
    public static Optional<Integer> minVal(List<Integer>list)
    {

        return  list.stream().reduce((x,y)->x<y?x:y);

    }
    public static void main(String[] args) {
        List<Integer> alist= Arrays.asList(6,7,8,9,10);
       List<Integer>a=Arrays.asList();
        Optional maxVal=maxVal(a);
        System.out.println(maxVal);
        Optional<Integer>minOption=minVal(alist);
        if(minOption.isPresent())
        {
            System.out.println(minOption.get());
        }
        else
        {
            System.out.println("no min");
        }
        System.out.println(minVal(alist));
        if(maxVal.isPresent())
        {
            System.out.println(maxVal.get());
        }
        else
        {
            System.out.println("no");
        }

    }
}
