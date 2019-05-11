package com.dgl.katas;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
Given an array, find the int that appears an odd number of times.

There will always be only one integer that appears an odd number of times.
 */

public class FindOdd {
    public static int findIt(int[] numbers) {
        List<Integer> integers = Arrays.stream(numbers).boxed().collect(Collectors.toList());

        Map<Integer, Long> counters = integers.stream()
            .collect(Collectors.groupingBy(p -> p, Collectors.counting()));

        return counters.entrySet().stream().filter(entry -> entry.getValue() % 2 != 0)
            .map(Map.Entry::getKey).findFirst().orElse(null);
    }
}
