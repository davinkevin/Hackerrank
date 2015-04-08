package com.hackerrank.challenges.warmup.cavitymap;

import java.util.*;

/**
 * Created by kevin on 21/03/15.
 */
public class Solution {

    Integer squareNsize = 0;
    List<Integer> map = new ArrayList<>();

    public Solution(Scanner in) {
        squareNsize = in.nextInt();
        for (int i = 0; i < squareNsize; i++) {
            String[] numberSplited = in.next().split("");
            for (int j = 0; j < numberSplited.length; j++) {
                map.add(Integer.valueOf(numberSplited[j]));
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*Scanner in = new Scanner(new ByteArrayInputStream("4 1112 1912 1892 1234".getBytes()));*/
        new Solution(in).printMap();

    }

    private void printMap() {
        for (int i = 0; i < squareNsize; i++) {
            for (int j = 0; j < squareNsize; j++) {
                System.out.print(isCavity(i, j));
            }
            System.out.println("");
        }
    }

    private String isCavity(Integer line, Integer collumn) {

        Integer valueAtPosition = getValueAtPosition(line, collumn);
        Boolean isCavity = getNeighbour(line, collumn)
                .stream()
                .allMatch(cell -> cell < valueAtPosition);

        return (isCavity) ? "X" : String.valueOf(valueAtPosition);
    }

    public Set<Integer> getNeighbour(Integer line, Integer collumn) {
        Set<Integer> neightbour = new HashSet<>();
        neightbour.add(getValueAtPosition(line-1, collumn));
        neightbour.add(getValueAtPosition(line+1, collumn));
        neightbour.add(getValueAtPosition(line, collumn+1));
        neightbour.add(getValueAtPosition(line, collumn-1));
        return neightbour;
    }

    private Integer getValueAtPosition(Integer line, Integer collumn) {
        if (line < 0 || collumn < 0 || line > squareNsize-1 || collumn > squareNsize-1)
            return Integer.MAX_VALUE;

        return map.get(line * squareNsize + collumn);
    }
}
