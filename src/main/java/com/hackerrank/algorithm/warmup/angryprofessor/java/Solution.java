package com.hackerrank.algorithm.warmup.angryprofessor.java;

import java.util.Scanner;

/**
 * Created by kevin on 21/03/15
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer nbOfTest = in.nextInt();

        for (int cptOfTest = nbOfTest; cptOfTest > 0; cptOfTest--) {
            Integer nbStudents = in.nextInt(),
                    minStutendsForClass = in.nextInt();

            Integer numberOfStudendsPresent = 0;
            for (int cptOfStudents = nbStudents; cptOfStudents > 0; cptOfStudents--) {
                numberOfStudendsPresent += (in.nextInt() <= 0) ? 1 : 0;
            }

            System.out.println(numberOfStudendsPresent < minStutendsForClass ? "YES" : "NO" );
        }
    }
}