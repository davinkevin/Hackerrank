package com.hackerrank.algorithm.warmup.fillingJars;

import java.util.Scanner;

/**
 * Created by kevin on 25/05/15 for HackerRank problem https://www.hackerrank.com/challenges/filling-jars
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*Scanner in = new Scanner(new ByteArrayInputStream("5 3 1 2 100 2 5 100 3 4 100".getBytes()));*/
        /*Scanner in = new Scanner(Paths.get(ClassLoader.getSystemResource("fillingJars/testCase4.txt").toURI()));*/

        Long numberOfJars = in.nextLong();
        in.nextInt();
        Double avg = 0.0d;

        while (in.hasNextLine()) {
            Double start = in.nextDouble();
            Double end = in.nextDouble();
            Double howManyToAdd = in.nextDouble();

            avg += (end-start+1)*howManyToAdd/numberOfJars;
        }

        System.out.println(avg.longValue());
    }
}
