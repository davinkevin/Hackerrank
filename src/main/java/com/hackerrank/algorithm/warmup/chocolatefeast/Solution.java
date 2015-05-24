package com.hackerrank.algorithm.warmup.chocolatefeast;

import java.util.Scanner;

/**
 * Created by kevin on 18/04/15 for HackerRank problem
 * https://www.hackerrank.com/challenges/chocolate-feast
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*Scanner in = new Scanner(new ByteArrayInputStream("3 10 2 5 12 4 4 6 2 2".getBytes()));*/
        in.nextInt();

        while (in.hasNextInt()) {
            new ChocolateFeast(in.nextInt(),in  .nextInt(),in.nextInt()).numberOfChocolate();
        }
    }

    static class ChocolateFeast {
        Integer money;
        Integer chocolatePrice;
        Integer wrapperDiscount;

        public ChocolateFeast(Integer money, Integer chocolatePrice, Integer wrapperDiscount) {
            this.money = money;
            this.chocolatePrice = chocolatePrice;
            this.wrapperDiscount = wrapperDiscount;
        }

        public ChocolateFeast numberOfChocolate() {
            Integer numberOfChocolate = money / chocolatePrice;
            Integer unwrappedChocolate = numberOfChocolate;

            while (unwrappedChocolate >= wrapperDiscount) {
                numberOfChocolate++;
                unwrappedChocolate = unwrappedChocolate - wrapperDiscount + 1;
            }
            System.out.println(numberOfChocolate);

            return this;
        }
    }
}
