package com.cisco;

import java.util.List;

/**
 * Created by siwarrie on 05/08/2015.
 */
public class Sum {
    // how do we parallelise this? Hard!!
    public static int sumDoubles(List<Integer> numbers) throws InterruptedException {
        int result = 0;
        long startTime = System.currentTimeMillis();
        for (Integer number: numbers) {
            result += doubleIt(number);
        }

        System.out.println("Time elapsed: " + (System.currentTimeMillis() - startTime));
        return result;
    }

    private static Integer doubleIt(int number) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return number * 2;
    }

    //how do we parallelise this? Easy! Let's look at the mapToInt arg as a pure function
    public static int sumDoublesFunctional(List<Integer> numbers) {
        long startTime = System.currentTimeMillis();
        int result = numbers.parallelStream().mapToInt(Sum::doubleIt).sum();
        System.out.println("Time elapsed functionally: " + (System.currentTimeMillis() - startTime));

        return result;
    }
}
