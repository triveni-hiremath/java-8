package com.java8.features.concepts.parallelStreams;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelSTreamExample {
    public static  long performanceTest(Supplier<Integer> supplier,int no)
    {
        long startTime=System.currentTimeMillis();
        for (int i=0;i<no;i++)
        {
            supplier.get();
        }
        long endTime=System.currentTimeMillis();
        return  endTime-startTime;
    }
    public static int sumSeqSTream()
    {
        return IntStream.rangeClosed(1,100000).sum();
    }
    public static int sumParallelSTream()
    {
        return IntStream.rangeClosed(1,100000).parallel().sum();
    }

    public static void main(String[] args) {
        System.out.println("seq::"+performanceTest(ParallelSTreamExample::sumSeqSTream,20));
        System.out.println("parallel::"+performanceTest(ParallelSTreamExample::sumParallelSTream,20));

    }
}
