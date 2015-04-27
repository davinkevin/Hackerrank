package com.hackerrank.challenges.warmup.lonelyinteger;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by kevin on 18/04/15 for HackerRank problem
 * https://www.hackerrank.com/challenges/lonely-integer
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Don't use the number of occurence, useless
        in.nextInt();
        List<Integer> integerList = new ArrayList<>();

        while(in.hasNextInt()) {
            Integer currentInteger = in.nextInt();
            if (integerList.contains(currentInteger)) {
                integerList.remove(currentInteger);
            } else {
                integerList.add(currentInteger);
            }
        }

        System.out.println(integerList.get(0));
    }
}
