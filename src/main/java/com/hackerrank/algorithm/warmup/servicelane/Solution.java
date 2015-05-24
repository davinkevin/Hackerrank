package com.hackerrank.algorithm.warmup.servicelane;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * Created by kevin on 21/03/15.
 */
public class Solution {

    Integer numberOfTest;
    List<Integer> widthSL = new ArrayList<>();

    public Solution(Scanner in) {
        Integer numberOfServiceLane = in.nextInt();
        this.numberOfTest = in.nextInt();
        for (int i = 0; i < numberOfServiceLane; i++) {
            this.widthSL.add(in.nextInt());
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*Scanner in = new Scanner(new ByteArrayInputStream("5 5 1 2 2 2 1 2 3 1 4 2 4 2 4 2 3".getBytes()));*/
        Solution algo = new Solution(in);

        for (int i = 0; i < algo.numberOfTest; i++) {
            System.out.println(algo.maxSizeBetween(in.nextInt(), in.nextInt()));
        }
    }

    public Integer maxSizeBetween(Integer begin, Integer end) {
        return widthSL
                .stream()
                .skip(begin)
                .limit(end - begin + 1)
                .min(Comparator.<Integer>naturalOrder())
                .get();
    }

}
