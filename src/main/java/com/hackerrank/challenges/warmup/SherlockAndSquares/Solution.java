package com.hackerrank.challenges.warmup.SherlockAndSquares;

import java.util.Scanner;

/**
 * Created by kevin on 22/05/15 for HackerRank problem https://www.hackerrank.com/challenges/sherlock-and-squares
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*Scanner in = new Scanner(new ByteArrayInputStream("2 3 9 17 24".getBytes()));*/

        // Don't use the number of occurence, useless
        in.nextInt();

        while (in.hasNextInt()) {
            Integer start = in.nextInt();
            Integer end = in.nextInt();

            Integer numberOfSquare =
                (int)(Math.floor(Math.sqrt(end)) - Math.ceil(Math.sqrt(start)) + 1);

            System.out.println(numberOfSquare);
        }
    }
}
