package com.cisco;

import java.util.Arrays;

/**
 * Credit to Venkat Subramanian: https://www.youtube.com/watch?v=Ee5t_EGjv0A
 * Created by siwarrie on 05/08/2015.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
//        //example 1
//        System.out.println(PrimeNumber.isPrime(14));
//        System.out.println(PrimeNumber.isPrimeFunctional(17));
//
//        //example 2
//        System.out.println(EvenNumber.getDoubleOfFirstEvenNumber(Arrays.asList(1,3,4,5)));
//        System.out.println(EvenNumber.getDoubleOfFirstEvenNumber(Arrays.asList(1,3, 7,5)));
//        System.out.println(EvenNumber.getDoubleOfFirstEvenNumberFunctional(Arrays.asList(1,4, 7,5)));
//        System.out.println(EvenNumber.getDoubleOfFirstEvenNumberFunctional(Arrays.asList(1,3, 7,5)));
        //example 3
        System.out.println(Sum.sumDoubles(Arrays.asList(1,2,4,4,5,6,66,6)));
        System.out.println(Sum.sumDoublesFunctional(Arrays.asList(1,2,4,4,5,6,66,6)));
    }
}
