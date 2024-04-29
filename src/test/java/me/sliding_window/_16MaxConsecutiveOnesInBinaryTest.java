package me.sliding_window;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _16MaxConsecutiveOnesInBinaryTest {

    @Test
    void longestOnes_case1() {
        //given
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        //when
        _16MaxConsecutiveOnesInBinary underTest = new _16MaxConsecutiveOnesInBinary();
        int result = underTest.longestOnes(nums, k);
        //then
        assertEquals(6, result);
    }

    @Test
    void longestOnes_case2() {
        //given
        int[] nums = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k = 3;
        //when
        _16MaxConsecutiveOnesInBinary underTest = new _16MaxConsecutiveOnesInBinary();
        int result = underTest.longestOnes(nums, k);
        //then
        assertEquals(10, result);
    }

    @Test
    void longestOnes_case3() {
        //given
        int[] nums = {1,1,1,0,0,0,1,1,1,1};
        int k = 0;
        //when
        _16MaxConsecutiveOnesInBinary underTest = new _16MaxConsecutiveOnesInBinary();
        int result = underTest.longestOnes(nums, k);
        //then
        assertEquals(4, result);
    }

    @Test
    void longestOnes_case4() {
        //given
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        //when
        _16MaxConsecutiveOnesInBinary underTest = new _16MaxConsecutiveOnesInBinary();
        int result = underTest.longestOnes(nums, k);
        //then
        assertEquals(6, result);
    }

    @Test
    void longestOnes_case5() {
        //given
        int[] nums = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k = 3;
        //when
        _16MaxConsecutiveOnesInBinary underTest = new _16MaxConsecutiveOnesInBinary();
        int result = underTest.longestOnes(nums, k);
        //then
        assertEquals(10, result);
    }





}