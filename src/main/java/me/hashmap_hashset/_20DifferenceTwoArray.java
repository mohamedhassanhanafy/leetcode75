package me.hashmap_hashset;

import java.util.*;
import java.util.stream.Collectors;

public class _20DifferenceTwoArray {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

//        shortest but not efficient approach
//        Set<Integer> num1Set = Arrays.stream(nums1).boxed().collect(Collectors.toCollection(HashSet::new));
//        Set<Integer> num2Set = Arrays.stream(nums2).boxed().collect(Collectors.toCollection(HashSet::new));
//
//        List<List<Integer>> result = new ArrayList<>();
//        result.add(num1Set.stream().filter(i -> !num2Set.contains(i)).collect(Collectors.toList()));
//        result.add(num2Set.stream().filter(i -> !num1Set.contains(i)).collect(Collectors.toList()));


        Set<Integer> num1Set = getSetFromArray(nums1);
        Set<Integer> num2Set = getSetFromArray(nums2);

        List<List<Integer>> result = new ArrayList<>();
        result.add(subtractSets(num1Set, num2Set));
        result.add(subtractSets(num2Set, num1Set));

        return result;
    }


    Set<Integer> getSetFromArray(int[] nums){
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        return set;
    }

    List<Integer> subtractSets(Set<Integer> set1, Set<Integer> set2){
        List<Integer> list = new LinkedList<>();
        for (Integer i : set1){
            if (!set2.contains(i)){
                list.add(i);
            }

        }
        return list;
    }
}
