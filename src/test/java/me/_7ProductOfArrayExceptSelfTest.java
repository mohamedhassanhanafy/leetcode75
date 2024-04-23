package me;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _7ProductOfArrayExceptSelfTest {

    @Test
    void productExceptSelf() {
        //given
        int[] num = {1,2,3,4};

        //when
        _7ProductOfArrayExceptSelf underTest = new _7ProductOfArrayExceptSelf();
        int[] result = underTest.productExceptSelf(num);
        //then
        assertArrayEquals(new int[]{24,12,8,6}, result);
    }

    @Test
    void productExceptSelf_OneZero() {
        //given
        int[] num = {-1,1,0,-3,3};

        //when
        _7ProductOfArrayExceptSelf underTest = new _7ProductOfArrayExceptSelf();
        int[] result = underTest.productExceptSelf(num);
        //then
        assertArrayEquals(new int[]{0,0,9,0,0}, result);
    }

    @Test
    void productExceptSelf_TwoZero() {
        //given
        int[] num = {0,0,9,0,0};

        //when
        _7ProductOfArrayExceptSelf underTest = new _7ProductOfArrayExceptSelf();
        int[] result = underTest.productExceptSelf(num);
        //then
        assertArrayEquals(new int[]{0,0,0,0,0}, result);
    }
}