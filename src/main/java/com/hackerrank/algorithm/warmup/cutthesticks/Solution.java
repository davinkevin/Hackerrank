package com.hackerrank.algorithm.warmup.cutthesticks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.util.stream.Collectors.toList;

/**
 * Created by kevin on 18/04/15 for HackerRank problem
 * https://www.hackerrank.com/challenges/cut-the-sticks
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Don't use the number of occurence, useless
        in.nextInt();

        List<Integer> integerList = getListOfIntegers(in);

        while (!integerList.isEmpty()) {

            Integer minus = integerList.stream().min(Integer::compare).get();
            System.out.println(integerList.size());

            integerList = integerList
                    .stream()
                    .map(number -> number - minus)
                    .filter(number -> number > 0)
                    .collect(toList());
        }
    }

    public static List<Integer> getListOfIntegers(Scanner in) {
        List<Integer> list = new ArrayList<>();

        while (in.hasNextInt()) {
            list.add(in.nextInt());
        }
        return list;
    }
}
