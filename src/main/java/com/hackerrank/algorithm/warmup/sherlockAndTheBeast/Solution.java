package com.hackerrank.algorithm.warmup.sherlockAndTheBeast;

import java.util.Optional;
import java.util.Scanner;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

/**
 * Created by kevin on 25/05/15 for HackerRank problem https://www.hackerrank.com/challenges/sherlock-and-the-beast/submissions/code/11756282
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*Scanner in = new Scanner(new ByteArrayInputStream("4 1 3 5 11".getBytes()));*/

        // Don't use the number of occurence, useless
        in.nextInt();

        while (in.hasNextInt()) {
            Integer numberOfDigits = in.nextInt();

            final Optional<String> result = IntStream
                    .rangeClosed(0, numberOfDigits)
                    .map(v -> numberOfDigits - v) // reverse order
                    .filter(isDivisibleByThree())
                    .filter(restIsDivisibleByFive(numberOfDigits))
                    .mapToObj(v -> repeat("5", v) + repeat("3", numberOfDigits - v))
                    .findFirst();

            System.out.println(result.orElse("-1"));
        }
    }

    public static String repeat(String str, int times) {
        StringBuilder ret = new StringBuilder();
        for (int i = 0; i < times; i++)
            ret.append(str);
        return ret.toString();
    }

    public static IntPredicate isDivisibleByThree() {
        return value -> value % 3 == 0;
    }

    public static IntPredicate restIsDivisibleByFive(Integer numberOfDigits) {
        return v -> (numberOfDigits - v) % 5 == 0;
    }


}
