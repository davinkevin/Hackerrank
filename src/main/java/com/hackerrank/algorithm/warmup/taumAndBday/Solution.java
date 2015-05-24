package com.hackerrank.algorithm.warmup.taumAndBday;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by kevin on 21/05/15 for HackerRank problem https://www.hackerrank.com/challenges/taum-and-bday
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Don't use the number of occurence, useless
        in.nextInt();

        while (in.hasNextLine()) {
            System.out.println(minGiftPackagePrice(in));
        }
    }

    private static BigInteger minGiftPackagePrice(Scanner in) {

        final GiftPackage giftPackage = new GiftPackage(in.nextInt(), in.nextInt());
        final GiftPackageCalculator giftPackageCalculator = new GiftPackageCalculator(giftPackage, in.nextInt(), in.nextInt(), in.nextInt());

        return giftPackageCalculator.bestTotalCost();
    }

    private static class GiftPackage {

        final private Integer numberOfBlackGift;
        final private Integer numberOfWhiteGift;

        public GiftPackage(Integer numberOfBlackGift, Integer numberOfWhiteGift) {
            this.numberOfBlackGift = numberOfBlackGift;
            this.numberOfWhiteGift = numberOfWhiteGift;
        }

        public Integer numberofblackgift() {
            return numberOfBlackGift;
        }

        public Integer numberofwhitegift() {
            return numberOfWhiteGift;
        }
    }

    private static class GiftPackageCalculator {

        final private  GiftPackage giftPackage;
        final private  Integer blackPrice;
        final private  Integer whitePrice;
        final private  Integer convertionPrice;

        public GiftPackageCalculator(GiftPackage giftPackage, Integer blackPrice, Integer whitePrice, Integer convertionPrice) {
            this.giftPackage = giftPackage;
            this.blackPrice = blackPrice;
            this.whitePrice = whitePrice;
            this.convertionPrice = convertionPrice;
        }

        public BigInteger blackBestPrice() {
            return BigInteger.valueOf(Math.min(blackPrice, whitePrice + convertionPrice));
        }

        public BigInteger whiteBestPrice() {
            return BigInteger.valueOf(Math.min(whitePrice, blackPrice+convertionPrice));
        }

        public BigInteger bestTotalCost() {
            return BigInteger.valueOf(giftPackage.numberofblackgift()).multiply(blackBestPrice())
                    .add(
                        BigInteger.valueOf(giftPackage.numberofwhitegift()).multiply(whiteBestPrice())
                    );
        }

    }
}
