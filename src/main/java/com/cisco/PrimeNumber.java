package com.cisco;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

/**
 * Example 1
 * illustrate:
 * -- declarative vs imperative
 * -- predicates
 * -- interface default methods and lambda functions
 * <p>
 * Created by siwarrie on 05/08/2015.
 */
public class PrimeNumber {
    //what to do, and how to do -- imperative
    public static boolean isPrime(final int number) {
        //we're mutating i
        for (int i = 2; i < number; i++) {
            if (number % i == 0) return false;
        }

        return number > 1;
    }

    //what to do, no how to do -- declarative
    public static boolean isPrimeFunctional(final int number) {
        IntPredicate isDivisible = divisor -> number % divisor == 0; //let's look at the interface implementation
        return number > 1 && IntStream.range(2, number).noneMatch(isDivisible);
    }


}
