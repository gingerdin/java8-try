package org.dl.firsttry.euler.problem;

import java.util.stream.IntStream;

/**
 * https://github.com/ReactiveX/RxJava/wiki/Problem-Solving-Examples-in-RxJava
 *
 * If we list all the natural numbers below 10 that are multiples of 3 or 5,
 * we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 *
 * Created by dl on 1/27/17.
 */
public class Problem1 {

    public static void main(String[] arg) {
        System.out.println("java common: " + javaCommon(10));
        System.out.println("java 8: " + java8(10));

        System.out.println("java common: " + javaCommon(1000));
        System.out.println("java 8: " + java8(1000));
    }

    private static int javaCommon(int end) {
        int sum = 0;
        for (int i = 1; i < end; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    private static int java8(int end) {
        return IntStream.range(1, end)
                .filter(num -> num % 3 == 0 || num % 5 == 0)
                .sum();
    }
}
