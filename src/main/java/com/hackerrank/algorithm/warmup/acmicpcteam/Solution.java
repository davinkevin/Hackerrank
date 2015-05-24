package com.hackerrank.algorithm.warmup.acmicpcteam;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by kevin on 19/04/15 for HackerRank problem
 * https://www.hackerrank.com/challenges/acm-icpc-team
 */
public class Solution {

    public static void main(String... args) throws URISyntaxException, IOException {
        Scanner in = new Scanner(System.in);
        /*Scanner in = new Scanner(Paths.get(ClassLoader.getSystemResource("acmicpcteam/testCase7.txt").toURI()));*/

        // Don't use the two first entry, useless !
        in.nextInt(); in.nextInt(); in.nextLine();

        List<Competitor> competitors = new ArrayList<>();
        while (in.hasNextLine()) {
            competitors.add(new Competitor(in.nextLine()));
        }


        Integer numberOfMaxTopic = 0;
        Integer numberOfMaxTeam = 0;
        for (Competitor c1 : competitors) {
            for (Competitor c2 : competitors) {
                if (c1 != c2) {
                    Integer knownTopics = new Team(c1, c2).numberOfKnownTopics();
                    if (knownTopics > numberOfMaxTopic) {
                        numberOfMaxTopic = knownTopics;
                        numberOfMaxTeam = 1;
                    } else if (knownTopics.equals(numberOfMaxTopic)) {
                        numberOfMaxTeam += 1;
                    }
                }
            }
        }

        System.out.println(numberOfMaxTopic);
        System.out.println(numberOfMaxTeam/2);
    }

    private static class Competitor {
        private final int[] knowledge;

        public Competitor(String knowledge) {
            this.knowledge = knowledge.chars().map(character -> character - 48).toArray();
        }

        public int[] knowledge() {
            return knowledge;
        }
    }


    private static class Team {
        private final Competitor c1;
        private final Competitor c2;

        public Team(Competitor c1, Competitor c2) {
            this.c1 = c1;
            this.c2 = c2;
        }

        public Integer numberOfKnownTopics() {
            Integer numberOfKnownTopics = 0;

            int[] knowledge = c1.knowledge();
            for (int i = 0, knowledgeLength = knowledge.length; i < knowledgeLength; i++) {
                numberOfKnownTopics += (c1.knowledge()[i] | c2.knowledge()[i]);
            }
            return numberOfKnownTopics;
        }
    }
}
