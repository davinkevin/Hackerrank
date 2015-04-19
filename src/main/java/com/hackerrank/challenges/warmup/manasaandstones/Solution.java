package com.hackerrank.challenges.warmup.manasaandstones;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by kevin on 19/04/15 for HackerRank problem
 * https://www.hackerrank.com/challenges/manasa-and-stones
 */
public class Solution{

    public static void main(String... args) throws IOException {
        Scanner in = new Scanner(System.in);
        /*Scanner in = new Scanner(new ByteArrayInputStream("2 3 1 2 4 10 100".getBytes()));*/

        // avoid the first number, useless
        in.nextInt();

        while (in.hasNextInt()) {
            new MansaStonesSolver(in.nextInt(), in.nextInt(), in.nextInt()).nextPotentialValue();
        }
    }

    private static class MansaStonesSolver {
        Integer numberOfStones;
        Integer minValue;
        Integer maxValue;

        public MansaStonesSolver(Integer numberOfStones, Integer minValue, Integer maxValue) {
            this.numberOfStones = numberOfStones-1; // Begin the reading from 0 value
            this.maxValue = Integer.max(minValue, maxValue);
            this.minValue = Integer.min(minValue, maxValue);
        }

        public MansaStonesSolver nextPotentialValue() {
            Integer difference = maxValue-minValue;
            Integer currentValue = numberOfStones*minValue;
            StringBuffer answer = new StringBuffer().append(currentValue);

            if (difference > 0)
                while (numberOfStones-- > 0)
                    answer.append(" ").append(currentValue += difference);

            System.out.println(answer);
            return this;
        }
    }
}