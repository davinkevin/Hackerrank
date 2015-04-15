package com.hackerrank.challenges.warmup.thelovelettermystery;

import java.util.Scanner;

/**
 * Created by kevin on 21/03/15 for HackerRank problem
 * https://www.hackerrank.com/challenges/the-love-letter-mystery
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Integer numberOfTest = in.nextInt();
        Integer count;

        for (int i = 0; i < numberOfTest; i++) {
            count = 0;
            char[] letters = in.next().toCharArray();
            Integer beginCursor = 0, endCursor = letters.length-1;
            while (beginCursor < endCursor) {
                if (letters[beginCursor] != letters[endCursor]) {
                    count += Math.abs(letters[beginCursor] - letters[endCursor]);
                }
                beginCursor++;
                endCursor--;
            }
            System.out.println(count);
        }

    }
}
