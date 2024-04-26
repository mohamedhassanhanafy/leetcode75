package me.two_pointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _13MaxNumberKSumPairsTest {

    @Test
    void maxOperations_case1() {
        //given
        int[] nums = {1,2,3,4};
        int k = 5;
        //when
        _13MaxNumberKSumPairs underTest = new _13MaxNumberKSumPairs();
        int result = underTest.maxOperations(nums, k);
        //then
        assertEquals(2, result);
    }

    @Test
    void maxOperations_case2() {
        //given
        int[] nums = {3,1,3,4,3};
        int k = 6;
        //when
        _13MaxNumberKSumPairs underTest = new _13MaxNumberKSumPairs();
        int result = underTest.maxOperations(nums, k);
        //then
        assertEquals(1, result);
    }

    @Test
    void maxOperations_caseAllSmall() {
        //given
        int[] nums = {1,2,3,4};
        int k = 100;
        //when
        _13MaxNumberKSumPairs underTest = new _13MaxNumberKSumPairs();
        int result = underTest.maxOperations(nums, k);
        //then
        assertEquals(0, result);
    }

    @Test
    void maxOperations_caseAllBigger() {
        //given
        int[] nums = {1000,2000,3000,4000};
        int k = 100;
        //when
        _13MaxNumberKSumPairs underTest = new _13MaxNumberKSumPairs();
        int result = underTest.maxOperations(nums, k);
        //then
        assertEquals(0, result);
    }

    @Test
    void maxOperations_caseMinus() {
        //given
        int[] nums = {-200,-100,200,100};
        int k = 0;
        //when
        _13MaxNumberKSumPairs underTest = new _13MaxNumberKSumPairs();
        int result = underTest.maxOperations(nums, k);
        //then
        assertEquals(2, result);
    }
}