package com.hackerrank.algorithm.warmup.maximizingxor;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Created by kevin on 21/03/15.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*Scanner in = new Scanner(new ByteArrayInputStream("10 15".getBytes()));*/

        Integer minValue = in.nextInt();
        Integer maxValue = in.nextInt();

        Integer maxXor = IntStream.rangeClosed(minValue, maxValue)
                .map(integer -> IntStream.rangeClosed(minValue, maxValue).map(currentVal -> integer ^ currentVal).max().getAsInt())
                .max().getAsInt();

        System.out.println(maxXor);
    }
}
