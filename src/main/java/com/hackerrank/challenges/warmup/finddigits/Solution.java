package com.hackerrank.challenges.warmup.finddigits;

import java.util.Scanner;

/**
 * Created by kevin on 18/04/15 for HackerRank problem
 * https://www.hackerrank.com/challenges/find-digits
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Useless number of try
        in.nextInt();

        while (in.hasNextInt()) {
            Integer number = in.nextInt();
            Long numberOfDivisor = number
                    .toString()
                    .chars()
                    .map(charcode -> charcode - 48)
                    .filter(digit -> digit > 0)
                    .filter(digit -> number % digit == 0)
                    .count();

            System.out.println(numberOfDivisor);
        }
    }

}
