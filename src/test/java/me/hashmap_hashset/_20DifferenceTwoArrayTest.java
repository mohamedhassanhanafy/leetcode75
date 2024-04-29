package me.hashmap_hashset;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class _20DifferenceTwoArrayTest {

    @Test
    void findDifference() {
        //given
        int[] nums1 = {1,2,3};
        int[] nums2 = {2,4,6};

        //when
        _20DifferenceTwoArray underTest = new _20DifferenceTwoArray();
        List<List<Integer>> result = underTest.findDifference(nums1, nums2);

        //then
        assertArrayEquals(new Integer[]{1,3}, result.get(0).toArray());
        assertArrayEquals(new Integer[]{4,6}, result.get(1).toArray());


    }
}