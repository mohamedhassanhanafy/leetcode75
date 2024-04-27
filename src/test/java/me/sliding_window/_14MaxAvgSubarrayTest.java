package me.sliding_window;

import me.two_pointers._13MaxNumberKSumPairs;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _14MaxAvgSubarrayTest {

    @Test
    void findMaxAverage() {
        //given
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;
        //when
        _14MaxAvgSubarray underTest = new _14MaxAvgSubarray();
        double result = underTest.findMaxAverage(nums, k);
        //then
        assertEquals(12.75, result);
    }

    @Test
    void findMaxAverage_case2() {
        //given
        int[] nums = {0,1,1,3,3};
        int k = 4;
        //when
        _14MaxAvgSubarray underTest = new _14MaxAvgSubarray();
        double result = underTest.findMaxAverage(nums, k);
        //then
        assertEquals(2, result);
    }
}