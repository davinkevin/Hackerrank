package com.hackerrank.challenges.warmup.utopiantree;

import java.util.Scanner;

/**
 * Created by kevin on 21/03/15.
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*Scanner in = new Scanner(new ByteArrayInputStream("3 0 1 4".getBytes()));*/
        Integer nbOfTest = in.nextInt();

        for (int cptOfTest = nbOfTest; cptOfTest > 0; cptOfTest--) {
            System.out.println(sizeOfUtopianTree(in.nextInt()));
        }
    }

    private static Integer sizeOfUtopianTree(Integer numberOfCycle) {
        Integer sizeOfTree = 1;

        if (numberOfCycle == 0)
            return sizeOfTree;

        for (int cycle = 1; cycle <= numberOfCycle; cycle++ ) {
            sizeOfTree += (cycle % 2 == 1) ? sizeOfTree : 1;
        }

        return sizeOfTree;
    }
}
