package com.cisco;

import java.util.List;
import java.util.Optional;

/**
 * Example 2:
 * illustrate:
 *   -- transformation vs mutability
 *   -- lazy evaluation (guess the number of operations)
 *   -- method references (compact lambda expressions: https://docs.oracle.com/javase/tutorial/java/javaOO/methodreferences.html)
 * Created by siwarrie on 05/08/2015.
 */
public class EvenNumber {
    public static Integer getDoubleOfFirstEvenNumber(List<Integer> list) {
        Integer result = null;

        for (Integer item : list) {
            if (item % 2 == 0) {
                result = item * 2;
                break;
            }
        }

        return result;
    }

    public static boolean isEven(int number) {
        System.out.println("is Even: " + number);
        return number % 2 == 0;
    }

    public static int doubleIt(int number) {
        System.out.println("double it: " + number);
        return number *2;
    }

    public static Optional<Integer> getDoubleOfFirstEvenNumberFunctional(List<Integer> list) {
       //illustrate lazy evaluation
        return list.stream()
                .filter(EvenNumber::isEven)
                .map(EvenNumber::doubleIt)
                .findFirst();
    }
}
