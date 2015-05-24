package com.hackerrank.algorithm.warmup.halloweenparty;

import java.util.Scanner;

/**
 * Created by kevin on 18/04/15 for HackerRank problem
 * https://www.hackerrank.com/challenges/halloween-party
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Don't use the number of occurence, useless
        in.nextInt();

        while(in.hasNextInt()) {
            System.out.println(nbOfChocolatePiece(in.nextLong()));
        }
    }

    public static Long nbOfChocolatePiece(Long k) {
        return k / 2 * (k - k / 2);
    }

}
