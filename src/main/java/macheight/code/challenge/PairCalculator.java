package macheight.code.challenge;

import macheight.code.challenge.model.Pair;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PairCalculator {
    public static List<Pair> findSumPairs(List<Integer> numbers, int targetSum) {
        List<Pair> pairs = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();

        for (int num : numbers) {
            int complement = targetSum - num;
            if (seen.contains(complement)) {
                pairs.add(new Pair(num, complement));
            }
            seen.add(num);
        }

        return pairs;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 4, 5, 3, 6, 8, 9);
        int targetSum = 10;

        List<Pair> result = findSumPairs(numbers, targetSum);
        for (Pair pair : result) {
            System.out.println(pair);
        }
    }
}
