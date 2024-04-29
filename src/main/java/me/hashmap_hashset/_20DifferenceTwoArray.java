package me.hashmap_hashset;

import java.util.*;
import java.util.stream.Collectors;

public class _20DifferenceTwoArray {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        Set<Integer> num1Set = Arrays.stream(nums1).boxed().collect(Collectors.toCollection(HashSet::new));
        Set<Integer> num2Set = Arrays.stream(nums2).boxed().collect(Collectors.toCollection(HashSet::new));

        List<List<Integer>> result = new ArrayList<>();
        result.add(num1Set.stream().filter(i -> !num2Set.contains(i)).collect(Collectors.toList()));
        result.add(num2Set.stream().filter(i -> !num1Set.contains(i)).collect(Collectors.toList()));

        return result;
    }
}
