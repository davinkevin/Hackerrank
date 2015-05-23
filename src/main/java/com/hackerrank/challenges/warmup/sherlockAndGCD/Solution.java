package com.hackerrank.challenges.warmup.sherlockAndGCD;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by kevin on 23/05/15 for HackerRank problem for https://www.hackerrank.com/challenges/sherlock-and-gcd
 */
public class Solution {

    public static final String YES = "YES";
    public static final String NO = "NO";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Don't use the number of occurence, useless
        in.nextInt();

        while(in.hasNextInt()) {
            Integer numberOfInteger = in.nextInt();

            List<Integer> listOfInteger = new ArrayList<>();
            while (numberOfInteger-- > 0 ) {
                listOfInteger.add(in.nextInt());
            }
            System.out.println(
                    (gcdOfList(listOfInteger) == 1)
                        ? YES
                        : NO
            );
        }

    }

    public static Integer gcdOfList(List<Integer> integers) {
        if (integers.size() == 1)
            return integers.get(0);

        //Find GCD
        Integer curGcd = integers.get(0);
        for(int i = 1; curGcd > 1 && i < integers.size(); ++i){
            curGcd = GCD(curGcd, integers.get(i));
        }

        return curGcd;
    }

    public static int GCD(int a, int b) {
        while (b != 0){
            int c = b;
            b = a % b;
            a = c;
        }
        return a;
    }

}
