package com.hackerrank.algorithm.warmup.angryprofessor.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer nbOfTest = in.nextInt();

        for (int cptOfTest = nbOfTest; cptOfTest > 0; cptOfTest--) {
            System.out.println(isClassCanceled(in) ? "YES" : "NO" );
        }
    }

    private static Boolean isClassCanceled(Scanner in) {
        Integer nbStudents = in.nextInt(),
                minStutendsForClass = in.nextInt();

        List<Integer> arrivalTimeOfStudent = new ArrayList<>();
        for (int cptOfStudents = nbStudents; cptOfStudents > 0; cptOfStudents--) {
            arrivalTimeOfStudent.add(in.nextInt());
        }

        return arrivalTimeOfStudent
                .stream()
                .filter(arrivalTime -> arrivalTime <= 0)
                .limit(minStutendsForClass)
                .count() < minStutendsForClass;
    }
}